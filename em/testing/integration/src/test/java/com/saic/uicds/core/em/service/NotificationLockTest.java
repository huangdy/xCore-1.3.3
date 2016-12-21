/**
 * 
 */
package com.saic.uicds.core.em.service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.xmlbeans.XmlCursor;
import org.junit.Ignore;
import org.junit.Test;
import org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType;
import org.oasisOpen.docs.wsn.b2.QueryExpressionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.jpa.EntityManagerHolder;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.uicds.resourceProfileService.CreateProfileRequestDocument;
import org.uicds.resourceProfileService.Interest;
import org.uicds.resourceProfileService.ResourceProfile;
import org.uicds.resourceProfileService.ResourceProfile.Interests;
import org.w3.x2005.x08.addressing.EndpointReferenceType;

import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.saic.precis.x2009.x06.base.IdentifierType;
import com.saic.precis.x2009.x06.base.NamespaceMapItemType;
import com.saic.precis.x2009.x06.base.NamespaceMapType;
import com.saic.uicds.core.infrastructure.model.ResourceProfileModel;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.ConfigurationService;
import com.saic.uicds.core.infrastructure.service.NotificationProducer;
import com.saic.uicds.core.infrastructure.service.NotificationService;
import com.saic.uicds.core.infrastructure.service.PubSubService;
import com.saic.uicds.core.infrastructure.service.ResourceInstanceService;
import com.saic.uicds.core.infrastructure.service.ResourceProfileService;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

/**
 * @author Patrick Neal - Image Matters, LLC
 *
 */
@Ignore
public class NotificationLockTest extends AbstractXmldbJpaTests {

	Logger log = LoggerFactory.getLogger(NotificationLockTest.class);

	@Resource(name="configurationService")
	ConfigurationService configurationService;

	@Resource(name="notificationsService")
	NotificationService notificationService;

	@Resource(name="workProductService")
	WorkProductService workProductService;

	@Resource(name="pubSubService")
	PubSubService pubSubService;

	@Resource(name="resourceProfileService")
	ResourceProfileService profileService;
	
	@Resource(name="resourceInstanceService")
	ResourceInstanceService resourceInstanceService;

	@Resource(name="incidentManagementService")
	IncidentManagementService incidentManagementService;

	@Resource(name="alertService")
	AlertService alertService;

	NotificationProducer notificationProducer;
	
	@Resource(name="entityManagerFactory")
	EntityManagerFactory emf;

	static String coreName = "core1.saic.com";
	static String personFullName = "Joe";
	static String updatedPersonFullName = "Joe McGillicuddy";
	static public String incidentID = "some-uuid";
	static String incidentName = "fire";
	static String workProductID = "workProductID";

	static String WSN_XPATH_DIALECT = "http://www.w3.org/TR/1999/REC-xpath-19991116";
	static String WSN_SIMPLE_TOPIC = "http://docs.oasis-open.org/wsn/2004/06/TopicExpression/Simple";

	static String workProductID1 = "1";
	static String workProductID2 = "2";
	static String workProductType = IncidentManagementService.Type;

	ScheduledExecutorService executor = null;

	public void setNotificationService(NotificationService p) {
		notificationService = p;
	}
	
	@Override
	protected String[] getConfigLocations() {
		return new String[] {
				"classpath:contexts/applicationContext-em.xml",
				"classpath:contexts/applicationContext-infra.xml",
				"classpath:contexts/test-dataSrcContext.xml" };
	}

	@Override
	protected void onSetUpInTransaction() throws Exception {
		// Run super
		super.onSetUpInTransaction();
		executor = new ScheduledThreadPoolExecutor(5);
	}

	@Test
	public void test() throws Exception {

		//begin polling for notifications
		executor.scheduleAtFixedRate(new Poller(emf), 0, 3, TimeUnit.SECONDS);

		//add incidents to system slowly
		executor.scheduleAtFixedRate(new Creator(emf), 0, 5, TimeUnit.SECONDS);

		Thread.sleep(30000);
		
		executor.shutdown();
	}
		
	static public CreateProfileRequestDocument getProfileCreateRequest(int index) {
		CreateProfileRequestDocument request = CreateProfileRequestDocument.Factory.newInstance();

		ResourceProfile profile = request.addNewCreateProfileRequest().addNewProfile();
		
		IdentifierType pid = profile.addNewID();
        pid.setStringValue("user" + index + "@" + coreName);
        pid.setLabel(personFullName + " " + index);
        
        Interests interests = profile.addNewInterests();
        Interest interest = interests.addNewInterest();
        interest.setTopicExpression(IncidentManagementService.Type);
        
		QueryExpressionType query = interest.addNewMessageContent();
		query.setDialect(WSN_XPATH_DIALECT);
		XmlCursor queryCursor = query.newCursor();
		queryCursor.toNextToken();
		queryCursor.toNextToken();
		queryCursor.insertChars("//stuff");
		queryCursor.dispose();

		NamespaceMapType map = interest.addNewNamespaceMap();
		NamespaceMapItemType item = map.addNewItem();
		item.setPrefix("de");
		item.setURI("urn:oasis:names:tc:emergency:EDXL:DE:1.0");

		item = map.addNewItem();
		item.setPrefix("cap");
		item.setURI("urn:oasis:names:tc:emergency:cap:1.1");

		// log.debug(request);
		return request;
	}

	/**
	 * Inner class which creates sample incidents from CAP alerts
	 * 
	 * @author Patrick Neal - Image Matters, LLC
	 */
	class Creator extends TransactionalRunnable {
		
		public Creator(EntityManagerFactory emf) {
			super(emf);
		}

		public void doRun() {
//			System.out.println("Creating incident...");
			ProductPublicationStatus status = incidentManagementService.createIncidentFromCap(createAlert());
			WorkProduct wp = workProductService.getProduct(status.getProduct().getProductID());
			ProductPublicationStatus alertStatus = alertService.createAlert(null, createAlert());
			String id = workProductService.associateWorkProductToInterestGroup(
					alertStatus.getProduct().getProductID(), wp.getFirstAssociatedInterestGroupID());
			assertNotNull(id);
//			System.out.println("Created incident with id " + id);
		}

		private Alert createAlert() {

			String alertEvent = "a test alert event";
			String alertHeadline = "a test alert headline";
			String alertIdentifier = UUID.randomUUID().toString();
			String alertSender = "sender";
			String alertAddress = "Mile marker 138";
			Calendar alertSent = new GregorianCalendar();
			
			// Create an alert to publish
			Alert alert = Alert.Factory.newInstance();
			alert.setIdentifier(alertIdentifier);
			alert.setSender(alertSender);
			alert.setSent(alertSent);
			alert.setMsgType(Alert.MsgType.ALERT);
			alert.setStatus(Alert.Status.ACTUAL);
			alert.setScope(Alert.Scope.PUBLIC);
			alert.setAddresses(alertAddress);
			Info info = alert.addNewInfo();
			Alert.Info.Category.Enum categoryArray[] = new Alert.Info.Category.Enum[1];
			categoryArray[0] = Alert.Info.Category.CBRNE;
			info.setCategoryArray(categoryArray);
			info.setEvent(alertEvent);
			EventCode event = info.addNewEventCode();
			event.setValue("value");
			event.setValueName("name");
			info.setSeverity(Alert.Info.Severity.MODERATE);
			info.setCertainty(Alert.Info.Certainty.LIKELY);
			info.setHeadline(alertHeadline);
			info.setUrgency(Alert.Info.Urgency.EXPECTED);

			return alert;
		}		
	}
	

	/**
	 * Inner class which requests Notification messages
	 * 
	 * @author Patrick Neal - Image Matters, LLC
	 */
	class Poller extends TransactionalRunnable {
		
		public Poller(EntityManagerFactory emf) {
			super(emf);
		}

		boolean created = false;
		int numUsers = 5;
		
		public void doRun() {
//			System.out.println("Polling");
			
			if(!created) {
				for(int i=0; i<numUsers; ++i) {
					
					String id = "user" + i + "@" + coreName;
					IdentifierType entityID = IdentifierType.Factory.newInstance();
					entityID.setStringValue(id);
//					System.out.println("Created entityID " + entityID);
					
					// test to see if the test profile exists in the service
					if (profileService.getProfile(entityID) == null) {
//						System.out.println("Profile does not exist");
						
						CreateProfileRequestDocument request = getProfileCreateRequest(i);
						ResourceProfile profile = request.getCreateProfileRequest().getProfile();
						ResourceProfileModel response = profileService.createProfile(profile);
						assertNotNull(response);
//						System.out.println("Created profile");
						
						//subscribe profile
						EndpointReferenceType endpoint = notificationService.createPullPoint(id);
						assertNotNull(endpoint);
						try {
							Integer subID = notificationService.subscribeWorkProductType(
									IncidentManagementService.Type, "",
									new HashMap<String, String>(), id);
							assertNotNull("Failed to subscribe", subID);
//							System.out.println("Subscribed with id " + subID);
						} catch (Exception e) {
							System.err.println(e.toString());
							return;
						}                	            
					} else {
//						System.out.println("Profile already exists");
					}
				}
				created = true;
			}
			
			
//			System.out.println("Checking notifications");
			for(int i=0; i<numUsers; ++i) {
				try {
					getMessages("user" + i + "@" + coreName);
				} catch (Throwable e) {
					System.err.println(e.toString());
					return;
				}
			}    	
		}

		private void getMessages(String entityID) throws Exception {
			NotificationMessageHolderType[] messages = notificationService.getMessages(
					entityID, 100);
			assertNotNull(messages);
//			System.out.println("Found " + messages.length + " notifications");
		}
	}

	
	
	
	
	
	
	
	private static class Request {
        public EntityManager entityManager;
        public boolean ownEntityManager = false;
        public boolean ownTransaction = false;
    }
    
    
    public abstract class TransactionalRunnable implements Runnable {

    	private EntityManagerFactory emf;
	
    	public TransactionalRunnable(EntityManagerFactory emf) {
    		this.emf = emf;
    	}

    	@Override
    	public void run() {
    		Request request = jpaOpen();
    		try {
    			doRun();
    		} catch (Throwable t) {
    			log.error("Error executing transactional runnable", t);
    		} finally {
    			jpaClose(request);
    		}
    	}
    	
    	public abstract void doRun();
    	
    	protected void jpaClose(Request request) {
    		EntityManager em = request.entityManager;
    		if (request.ownTransaction && em != null && em.isOpen()) {

    			try {
    				if (em.getTransaction().isActive()) {
    					em.getTransaction().commit(); // commit the transaction
    				}
    			} catch (Exception e) {
    				if(!e.getMessage().contains("already closed")) {
    					log.error("Error closing jpa connection", e);
    				}
    			} finally {
    				if (request.ownEntityManager) {
    					// only close the EntityManager if it was created
    					// during the jpaOpen method
    					em.close();

    					// don't want to unbind if the EMF was bound by
    					// an external resource (like a higher level
    					// spring filter)
    					TransactionSynchronizationManager.unbindResource(emf);
    				}
    			}
    		}
    	}

    	protected Request jpaOpen() {
    		Request result = new Request();
    		// get a reference to the EntityManager
    		// which may require creating one and binding it
    		EntityManagerHolder holder = (EntityManagerHolder) TransactionSynchronizationManager
    		.getResource(emf);
    		EntityManager em = null;
    		if (holder == null) {
    			em = emf.createEntityManager();
    			TransactionSynchronizationManager.bindResource(emf, new EntityManagerHolder(em));
    			result.ownEntityManager = true;

    		} else {
    			em = holder.getEntityManager();
    		}

    		// make sure the EntityManager has a transaction active
    		if (!em.getTransaction().isActive()) {
    			em.getTransaction().begin();
    			result.ownTransaction = true;
    		}
    		result.entityManager = em;
    		return result;
    	}
    }

}
