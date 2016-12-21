/**
 * 
 */
package com.saic.uicds.core.infrastructure.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.junit.Test;
import org.oasisOpen.docs.wsn.b2.FilterType;
import org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.NotTransactional;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.uicds.resourceProfileService.Interest;
import org.w3.x2005.x08.addressing.EndpointReferenceType;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument;
import com.saic.uicds.core.infrastructure.dao.NotificationDAO;
import com.saic.uicds.core.infrastructure.exceptions.EmptySubscriberNameException;
import com.saic.uicds.core.infrastructure.exceptions.InvalidProductIDException;
import com.saic.uicds.core.infrastructure.exceptions.InvalidProductTypeException;
import com.saic.uicds.core.infrastructure.exceptions.NullSubscriberException;
import com.saic.uicds.core.infrastructure.model.Notification;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.impl.NotificationServiceImpl;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.NotificationUtils;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

/**
 * @author roger
 * 
 */
public class NotificationServiceTest
    extends AbstractXmldbJpaTests {

    private static final int NUM_ALERT_WPS = 10;

    Logger log = LoggerFactory.getLogger(NotificationServiceTest.class);

    @Autowired
    ConfigurationService configurationService;

    @Autowired
    NotificationService notificationService;

    @Autowired
    WorkProductService workProductService;

    @Autowired
    PubSubService pubSubService;

    @Autowired
    NotificationDAO notificationDAO;

    @Autowired
    private PlatformTransactionManager platformTransactionManager;

    static String coreName = "core1.saic.com";
    static String personFullName = "Joe";
    static String updatedPersonFullName = "Joe McGillicuddy";
    static public String entityID = "joe";
    static public String jid = entityID + "@" + coreName;
    static String notificationURI = "http://" + coreName + "/" + entityID + "/notification";
    static public String incidentID = "some-uuid";
    static String incidentName = "fire";
    static String workProductID1 = "1";
    static String workProductID2 = "2";

    static String INCIDENT_WP_TYPE = "Incident";

    private static final String ALERT_WP_TYPE = "Alert";

    static String WSN_XPATH_DIALECT = "http://www.w3.org/TR/1999/REC-xpath-19991116";
    static String WSN_SIMPLE_TOPIC = "http://docs.oasis-open.org/wsn/2004/06/TopicExpression/Simple";

    public class AddSubscription
        implements TransactionCallback {

        @Override
        public Object doInTransaction(TransactionStatus status) {

            Integer subID = null;
            Map<String, String> namespaceMap = new HashMap<String, String>();
            try {
                subID = notificationService.subscribeWorkProductType(ALERT_WP_TYPE, "",
                    namespaceMap, entityID);
            } catch (InvalidProductTypeException e) {
                fail(e.getMessage());
            } catch (NullSubscriberException e) {
                fail(e.getMessage());
            } catch (EmptySubscriberNameException e) {
                fail(e.getMessage());
            }
            return subID;
        }

    }

    public class AddAlertWorkProducts
        implements TransactionCallback {

        @Override
        public Object doInTransaction(TransactionStatus status) {

            // Add some work products
            ArrayList<String> workProducts = addAlertWorkProducts();

            return workProducts;
        }

    }

    public class UpdateAlertWorkProducts
        implements TransactionCallback {

        ArrayList<String> workProducts;

        public UpdateAlertWorkProducts(ArrayList<String> workProducts) {

            this.workProducts = workProducts;
        }

        @Override
        public Object doInTransaction(TransactionStatus status) {

            // update work products
            updateAlertWorkProducts(workProducts);

            return workProducts;
        }

    }

    public class GetNotificationMessages
        implements TransactionCallback {

        @Override
        public Object doInTransaction(TransactionStatus status) {

            NotificationMessageHolderType[] messageHolder = notificationService.getMessages(
                entityID, 100);
            List<String> messages = getWorkProductIDs(messageHolder);
            return messages;
        }
    }

    public class GetMatchingMessages
        implements TransactionCallback {

        @Override
        public Object doInTransaction(TransactionStatus status) {

            IdentificationType[] matchingMessages = notificationService.getMatchingMessages(entityID);

            return matchingMessages;
        }

    }

    public class CheckNotificationDAO
        implements TransactionCallback {

        @Override
        public Object doInTransaction(TransactionStatus status) {

            Notification notification = notificationDAO.findByEntityId(entityID);
            assertNotNull("no notification created", notification);
            assertNotNull("no subs set", notification.getSubscriptions());
            assertEquals("wrong # subscriptions", 1, notification.getSubscriptions().size());
            Integer subID = notification.getSubscriptions().iterator().next().getSubscriptionID();
            assertNotNull("subID is null", subID);
            List<Notification> subs = notificationDAO.findBySubscriptionId(subID);
            assertNotNull("no subs", subs);
            assertTrue("no subs contents", subs.size() > 0);

            return null;
        }

    }

    public void setNotificationService(NotificationService p) {

        notificationService = p;
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

    @Override
    protected void onSetUpInTransaction() throws Exception {

        // Run super
        super.onSetUpInTransaction();

    }

    @Test
    public void testNotificationServiceCreate() {

        assertNotNull(notificationService);
        assertNotNull(pubSubService);
    }

    @Test
    public void getMatchingMessages() {

        notificationService.getMatchingMessages(entityID);
    }

    @NotTransactional
    @Test
    public void testNotificationOrder() {

        Integer subID = null;
        // Subscribe to Alert work products
        TransactionTemplate tt = new TransactionTemplate(platformTransactionManager);
        Object subIDObj = tt.execute(new AddSubscription());
        if (subIDObj != null) {
            subID = (Integer) subIDObj;
        }
        assertNotNull("no subID", subID);

        // Check that the subscriptions were created
        Object n = tt.execute(new CheckNotificationDAO());

        // Add some alert work products
        ArrayList<String> workProducts = null;
        Object workProductsObj = tt.execute(new AddAlertWorkProducts());
        if (workProductsObj != null) {
            workProducts = (ArrayList<String>) workProductsObj;
        }
        assertNotNull("work products array is null after create", workProducts);
        assertEquals("wrong # alerts created", NUM_ALERT_WPS, workProducts.size());

        // Update the alerts so that the original WP notifications are replaced.
        workProductsObj = tt.execute(new UpdateAlertWorkProducts(workProducts));
        if (workProductsObj != null) {
            workProducts = (ArrayList<String>) workProductsObj;
        }
        assertNotNull("work products array is null", workProducts);
        assertEquals("wrong # alerts updates", NUM_ALERT_WPS, workProducts.size());

        // Get the notifications
        List<String> messages = null;
        Object messagesObj = tt.execute(new GetNotificationMessages());
        if (messagesObj != null) {
            messages = (List<String>) messagesObj;
        }

        // Should only get NUM_ALERT_WPS notifications because original creates were replaced by the
        // updates
        assertTrue(
            "Wrong number of messages expected " + workProducts.size() + " got " + messages.size(),
            messages.size() == workProducts.size());
        checkWorkProductOrder(messages, workProducts);

        // Check that GetMatchingMessages returns NUM_ALERT_WPS also
        IdentificationType[] matchingMessages = null;
        Object matchingObj = tt.execute(new GetMatchingMessages());
        if (matchingObj != null) {
            matchingMessages = (IdentificationType[]) matchingObj;
        }
        assertEquals("wrong # matching", NUM_ALERT_WPS, matchingMessages.length);

    }

    // @Test
    // public void testMultipleSubscribersToSameWorkProductType() throws
    // InvalidProductTypeException,
    // NullSubscriberException, EmptySubscriberNameException {
    //
    // Integer subID = null;
    // Map<String, String> namespaceMap = new HashMap<String, String>();
    // subID = notificationService.subscribeWorkProductType(ALERT_WP_TYPE, "", namespaceMap,
    // entityID);
    //
    // if (subID == null) {
    // fail("not subscribed");
    // } else {
    // }
    //
    // Integer secondSubID = null;
    // secondSubID = notificationService.subscribeWorkProductType(ALERT_WP_TYPE, "", namespaceMap,
    // "OtherEntity");
    //
    // if (secondSubID == null) {
    // fail("second not subscribed");
    // } else {
    // }
    //
    // // Add some work products
    // ArrayList<String> workProducts = addAlertWorkProducts();
    //
    // // update work products
    // updateAlertWorkProducts(workProducts);
    //
    // NotificationMessageHolderType[] messageHolder = notificationService.getMessages(entityID,
    // 100);
    // List<String> messages = getWorkProductIDs(messageHolder);
    // // assertEquals("Wrong number of messages", workProducts.size(), messages.size());
    // checkWorkProductOrder(messages, workProducts);
    //
    // IdentificationType[] matchingMessages = notificationService.getMatchingMessages(entityID);
    // assertTrue("No messages returned", matchingMessages.length > 0);
    //
    // messageHolder = notificationService.getMessages("OtherEntity", 100);
    // messages = getWorkProductIDs(messageHolder);
    // assertEquals("Wrong number of messages for second subscriber", workProducts.size(),
    // messages.size());
    // checkWorkProductOrder(messages, workProducts);
    // }
    //
    // @Test
    // public void testPullPointCreateAndDestroy() {
    //
    // // EndpointReferenceType ep= notificationService.getPullPoint(entityID);
    //
    // // Create a pull point
    // createPullPointAndSubscribeToAlerts();
    //
    // // Add some work products
    // ArrayList<String> workProducts = addAlertWorkProducts();
    //
    // // Make sure there are no notifications pending
    // checkMessageCount(workProducts.size());
    //
    // // Destroy the pull point
    // destroyPullPoint();
    //
    // // Create the same pull point again
    // createPullPointAndSubscribeToAlerts();
    //
    // // Make sure there are no notifications pending
    // int numMessages = 0;
    // checkMessageCount(numMessages);
    // }

    @Test
    public void testChangePullpoint() {

        // Create a pull point
        createPullPointAndSubscribeToAlerts();

        NotificationServiceImpl i = (NotificationServiceImpl) notificationService;
        List<Notification> n = i.getNotificationDAO().findAll();
        Notification not = i.getNotificationDAO().findByEntityId("joe");

        // Change the endpoint
        String firstXMPPEndpoint = CommunicationsService.XMPPAddressScheme + ":" + jid;
        notificationService.updateEndpoint(entityID, firstXMPPEndpoint, true);

        n = i.getNotificationDAO().findAll();

        EndpointReferenceType point = notificationService.getPullPoint(entityID);

        assertNotNull(point);
        assertEquals("wrong first endpoint", firstXMPPEndpoint, point.getAddress().getStringValue());
    }

    private void checkMessageCount(int numMessages) {

        // FLi modified on 11/29/2011
        // NotificationMessageHolderType[] messageHolder = notificationService.getMessages(entityID,
        // 100);

        int notmsgcount = notificationService.findMsgCountByEntityId(entityID);
        NotificationMessageHolderType[] messageHolder = notificationService.getMessages(entityID,
            notmsgcount);

        List<String> messages = getWorkProductIDs(messageHolder);
        assertEquals("Wrong number of messages", numMessages, messages.size());
    }

    private void destroyPullPoint() {

        boolean destroyed = notificationService.destroyPullPoint(entityID);
        assertTrue("endpoint destroyed was null", destroyed);
        if (notificationService instanceof NotificationServiceImpl) {
            NotificationServiceImpl impl = (NotificationServiceImpl) notificationService;
            Notification n = impl.getNotificationDAO().findByEntityId(entityID);
            assertNull("notification is still found", n);
            // assertEquals("",0,n.getMessages().size());
            // assertEquals("",0,n.getSubscriptions().size());
        }
        // EndpointReferenceType ep= notificationService.getPullPoint(entityID);
        // assertNull("endpoint still found",ep);
    }

    private void createPullPointAndSubscribeToAlerts() {

        EndpointReferenceType endpoint = notificationService.createPullPoint(entityID);

        // Subscribe to a work product type
        Interest interest = Interest.Factory.newInstance();
        interest.addNewMessageContent().setDialect(WSN_SIMPLE_TOPIC);
        interest.setTopicExpression(ALERT_WP_TYPE);
        FilterType filter = null;
        try {
            filter = NotificationUtils.getFilterFromInterest(interest);
        } catch (XmlException e1) {
            fail("creating filter: " + e1.getMessage());
        }

        try {
            notificationService.subscribe(endpoint, filter);
        } catch (InvalidProductTypeException e) {
            fail("invalid product type");
        } catch (NullSubscriberException e) {
            fail("null subscriber");
        } catch (EmptySubscriberNameException e) {
            fail("empty subscriber");
        } catch (InvalidProductIDException e) {
            fail("invalid product id");
        }

        EndpointReferenceType e = notificationService.getPullPoint(entityID);
        assertEquals("address doesn't match", endpoint.getAddress().getStringValue(),
            e.getAddress().getStringValue());
    }

    private void updateAlertWorkProducts(ArrayList<String> workProducts) {

        for (int i = 0; i < 10; i++) {
            WorkProduct product = workProductService.getProduct(workProducts.get(i));

            // testing to see whether this workproduct has AssociatedInterestGroupID with or not.
            // test, all null, weird.
            /*
            String igID=product.getFirstAssociatedInterestGroupID();
            log.debug("Work product InterestGroupID is :\n" + igID);
            System.out.println("Work product InterestGroupID is :\n" + igID);
                      */
            WorkProduct wp = new WorkProduct(product);
            XmlObject xmlContent;
            try {
                xmlContent = XmlObject.Factory.parse("<Alert>alert</Alert>");
                wp.setProduct(xmlContent);
                workProductService.publishProduct(wp).getProduct().getProductID();
            } catch (XmlException e) {
                e.printStackTrace();
            }
        }
    }

    private ArrayList<String> addAlertWorkProducts() {

        ArrayList<String> workProducts = new ArrayList<String>();
        for (int i = 0; i < NUM_ALERT_WPS; i++) {
            workProducts.add(addAlertWorkProduct());
        }
        return workProducts;
    }

    private void checkWorkProductOrder(List<String> messages, List<String> workProducts) {

        assertTrue("messages does not contain all work products",
            messages.containsAll(workProducts));
        boolean inOrder = true;
        for (String wpid : workProducts) {
            if (!wpid.equals(messages.get(workProducts.indexOf(wpid)))) {
                inOrder = false;
            }
        }
        if (!inOrder) {
            System.out.println("Expected: " + workProducts);
            System.out.println("Got: " + messages);
        }
        assertTrue("messages are not in order", inOrder);
    }

    private String addAlertWorkProduct() {

        WorkProduct wp = new WorkProduct();
        wp.setProductType(ALERT_WP_TYPE);
        XmlObject xmlContent;
        try {
            xmlContent = XmlObject.Factory.parse("<Alert>alert</Alert>");
            wp.setProduct(xmlContent);
            String productID = workProductService.publishProduct(wp).getProduct().getProductID();
            // System.out.println("adding: "+productID);
            return productID;
        } catch (XmlException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    private List<String> getWorkProductIDs(NotificationMessageHolderType[] messages) {

        List<String> returnList = new ArrayList<String>();
        for (NotificationMessageHolderType notificationMessage : messages) {
            // System.out.println(notificationMessage);
            NotificationMessageHolderType.Message message = notificationMessage.getMessage();
            try {
                WorkProductDocument pid = WorkProductDocument.Factory.parse(message.xmlText());
                String id = WorkProductHelper.getIdentificationElement(pid.getWorkProduct()).getIdentifier().getStringValue();
                // System.out.println(id);
                returnList.add(id);

                // test, all null, weird.
                /*
                WorkProduct wp = (WorkProduct) pid.getWorkProduct();
                //testing to see whether this workproduct has AssociatedInterestGroupID with or not.
                String igID=wp.getFirstAssociatedInterestGroupID();
                log.debug("Work product InterestGroupID is :\n" + igID);
                System.out.println("Work product InterestGroupID is :\n" + igID);
                */
                // returnList.add(id);

            } catch (XmlException e) {
                fail("cannot parse");
            }
        }
        return returnList;
    }
}
