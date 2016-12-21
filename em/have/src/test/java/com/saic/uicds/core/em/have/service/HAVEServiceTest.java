/**
 * 
 */
package com.saic.uicds.core.em.have.service;

import gov.ucore.ucore.x20.DigestDocument;
import gov.ucore.ucore.x20.DigestType;
import gov.ucore.ucore.x20.OrganizationType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

import org.apache.xmlbeans.XmlException;
import org.easymock.EasyMock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uicds.haveService.EdxlDeRequestDocument;
import org.uicds.haveService.EdxlDeResponseDocument;

import x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument;
import x0.oasisNamesTcEmergencyEDXLDE1.StatusValues;
import x0.oasisNamesTcEmergencyEDXLDE1.TypeValues;
import x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType;
import x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType;
import x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument;
import x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital;

import com.saic.precis.x2009.x06.structures.WorkProductDocument;
import com.saic.uicds.core.em.exceptions.SendMessageErrorException;
import com.saic.uicds.core.em.have.service.impl.HAVEServiceImpl;
import com.saic.uicds.core.em.util.BroadcastUtil;
import com.saic.uicds.core.em.util.DigestTester;
import com.saic.uicds.core.infrastructure.exceptions.EmptyCoreNameListException;
import com.saic.uicds.core.infrastructure.exceptions.InvalidXpathException;
import com.saic.uicds.core.infrastructure.exceptions.LocalCoreNotOnlineException;
import com.saic.uicds.core.infrastructure.exceptions.NoShareAgreementException;
import com.saic.uicds.core.infrastructure.exceptions.NoShareRuleInAgreementException;
import com.saic.uicds.core.infrastructure.exceptions.RemoteCoreUnavailableException;
import com.saic.uicds.core.infrastructure.exceptions.RemoteCoreUnknownException;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.CommunicationsService;
import com.saic.uicds.core.infrastructure.service.NotificationService;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.util.ValidationUtil;

/**
 * NotificationServiceTest
 * 
 * @author roger, initial revision
 * 
 */
public class HAVEServiceTest extends TestCase {
	
	Logger log = LoggerFactory.getLogger(HAVEServiceTest.class);
    
	String lastSentDateTime;

	HAVEServiceImpl haveService;

    WorkProductService workProductService;

    CommunicationsService communicationsService;

    NotificationService notificationService;

    private static final String DE_DISTRIBUTION_ID = "DE_DISTRIBUTION_ID";

	private static final String HOSPITAL_1_GEO_LOCATION_ID = "GeoLocation_1";

	private static final String HOSPITAL_0_GEO_LOCATION_ID = "GeoLocation_0";

	private static final String HOSPITAL_1_ID = "Hospital_1";

	private static final String HOSPITAL_0_ID = "Hospital_0";

	private static final String DEFAULT_POINT_POS = "45.256 -71.92";

    private static final String HOSPITAL_1_NAME = "Hospital 1";
    private static final String HOSPITAL_2_NAME = "Hospital 2";

    static final String rmApp1Name = "RMApplication1";
    static final String rmApp2Name = "RMApplication2";
    static final String rmApp1 = rmApp1Name + "@core1";
    static final String rmApp2 = rmApp2Name + "@core2";

    static final String INCIDENT_ID = "uicds-incident-id";
    static final String INCIDENT_LOCATION_DESCRIPTION = "Arlington Waste Facility";
    static final String INCIDENT_LOCATION_POINT = "38.801168 -77.127685";
    static final String REQUESTER_LOCATION_POINT = "38.866014 -77.193162";

    static final String UCORE_CODESPACE_NS = "http://ucore.gov/ucore/2.0/codespace/";
    static final String UICDS_CODESPACE_NS = "http://uicds.gov/1.0/codespace";

    static final String XSLT_FILE_PATH = "xslt/HaveDigest.xsl";

    @Override
    protected void setUp() throws Exception {

    	haveService = new HAVEServiceImpl();
    	haveService.setXsltFilePath(XSLT_FILE_PATH);
    	
    	haveService.setupDigestTransformation();

        workProductService = EasyMock.createMock(WorkProductService.class);
        haveService.setWorkProductService(workProductService);

        communicationsService = EasyMock.createMock(CommunicationsService.class);
        haveService.setCommunicationsService(communicationsService);

        notificationService = EasyMock.createMock(NotificationService.class);
        haveService.setNotificationService(notificationService);
        
    }

    public void testHAVEServiceCreate() {

        assertNotNull(haveService);
        assertNotNull(workProductService);
    }

    public void testSubmitHAVE() {

        try {
            EdxlDeResponseDocument response =
                sendAndCheckHAVE(null);

            HashSet<String> organizationNames = new HashSet<String>();
            organizationNames.add(HOSPITAL_1_NAME);
            organizationNames.add(HOSPITAL_2_NAME);
            checkCommonHAVEResponseElements(response,organizationNames);
            
            findAndCheckLastHAVEMessage();

        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    public void testSubmitHAVEWithNoAgreement() {

        try {
            EdxlDeResponseDocument response =
            	sendAndCheckHAVEAndExpectExceptionOnSend(null);


        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

	public void findAndCheckLastHAVEMessage() {
		EasyMock.reset(workProductService);
			
		expectXQuery();

    	EasyMock.replay(workProductService);
    	
		StringBuffer dr = new StringBuffer();
		dr.append(DE_DISTRIBUTION_ID);
		dr.append(",");
		dr.append(rmApp1);
		dr.append(",");
		dr.append(lastSentDateTime.toString());
		String distributionReference = dr.toString();
		WorkProductDocument wp = haveService.findHAVEMessage(distributionReference);
		assertNotNull("null find response",wp);
		assertNotNull("no wp found",wp.getWorkProduct());
		assertEquals("no payload found",1,wp.getWorkProduct().sizeOfStructuredPayloadArray());
	}

	public void expectXQuery() {
		try {
			List<WorkProduct> list = new ArrayList<WorkProduct>();
			WorkProduct wp = new WorkProduct();
			wp.setActive(true);
			wp.setChecksum("sum");
			wp.setProductID("WPID");
			wp.setProductType(HAVEService.HAVE_PRODUCT_TYPE);
			wp.setProductVersion(new Integer("1"));
			String product = new String ("<stuff></stuff>");
			wp.setProduct(product.getBytes());
			list.add(wp);
			EasyMock.expect(workProductService.getProductByTypeAndXQuery(
					EasyMock.eq(HAVEService.HAVE_PRODUCT_TYPE), 
					EasyMock.isA(String.class), EasyMock.isA(Map.class))).andReturn(list);
		} catch (InvalidXpathException e) {
			fail("get product failed");
		}
	}

    public void testSubmitHAVEFromFile() {

        try {
        	String fileName = "src/test/resources/HAVE-EdxlDeRequest.xml";
            EdxlDeResponseDocument response =
                sendAndCheckHAVE(fileName);

            HashSet<String> organizationNames = new HashSet<String>();
            organizationNames.add(HOSPITAL_1_NAME);
            organizationNames.add(HOSPITAL_2_NAME);
            checkCommonHAVEResponseElements(response,organizationNames);
            
            // Test that the bed capacity was digested as a simple property
            assertTrue("missing simple type for bed capacity",
            		DigestTester.checkSimpleProperty(response.getEdxlDeResponse().getDigest(),
                    DigestTester.ORGANIZATION_THING_TYPE, HOSPITAL_0_ID,
                    "urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "BedCapacity", "Burn", "Vacant/Available:100"));


        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    public void testSubmitHAVEFromBadFile() {

        try {
        	String fileName = "src/test/resources/HAVE-EdxlDeRequest-BadIncidentID.xml";
            EdxlDeResponseDocument response =
                sendAndCheckHAVE(fileName);

            HashSet<String> organizationNames = new HashSet<String>();
            organizationNames.add(HOSPITAL_1_NAME);
            organizationNames.add(HOSPITAL_2_NAME);
            checkCommonHAVEResponseElements(response,organizationNames);
            
            // Test that the bed capacity was digested as a simple property
            assertTrue("missing simple type for bed capacity",
            		DigestTester.checkSimpleProperty(response.getEdxlDeResponse().getDigest(),
                    DigestTester.ORGANIZATION_THING_TYPE, HOSPITAL_0_ID,
                    "urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "BedCapacity", "Burn", "Vacant/Available:100"));


        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    public void testSubmitHAVEUpdate() {

        try {
        	String fileName = "src/test/resources/HAVE-EdxlDeRequest.xml";
            EdxlDeResponseDocument response =
                sendAndCheckHAVE(fileName);

            fileName = "src/test/resources/HAVE-EdxlDeRequest2.xml";
            response = sendAndCheckHAVE(fileName);

            HashSet<String> organizationNames = new HashSet<String>();
            organizationNames.add(HOSPITAL_1_NAME);
            organizationNames.add(HOSPITAL_2_NAME);
            checkCommonHAVEResponseElements(response,organizationNames);
            
            // Test that the bed capacity was digested as a simple property
            assertTrue("missing simple type for bed capacity",
            		DigestTester.checkSimpleProperty(response.getEdxlDeResponse().getDigest(),
                    DigestTester.ORGANIZATION_THING_TYPE, HOSPITAL_0_ID,
                    "urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "BedCapacity", "Burn", "Vacant/Available:100"));

            // Send the file again and make sure the transformation objects are still valid
            response = sendAndCheckHAVE(fileName);


        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    private EdxlDeResponseDocument sendAndCheckHAVE(String fileName) throws XmlException,
    IOException {
    	
    	EasyMock.reset(workProductService, communicationsService);

    	String[] explicitAddresses = { rmApp1, rmApp2 };
    	EDXLDistributionDocument edxl = null;
    	if (fileName != null) {
    		edxl = getHAVEMessageFromFile(fileName);
    	}
    	else {
    		edxl = getHAVEMessage(explicitAddresses);	
    	}
    	assertNotNull("file name failed",edxl);
    	
//    	System.out.println(edxl);
    	
    	assertTrue(ValidationUtil.validate(edxl, true));

    	ProductPublicationStatus status = new ProductPublicationStatus();
    	status.setStatus(ProductPublicationStatus.SuccessStatus);

    	EasyMock.expect(workProductService.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(
    			status);
    	if (edxl.getEDXLDistribution().sizeOfDistributionReferenceArray() > 0) {
    		expectXQuery();
    	}

    	// expect that the message will get sent twice to the cores from the JIDs
    	if (edxl.getEDXLDistribution().sizeOfExplicitAddressArray() > 0) {
    		try {
    			communicationsService.sendMessage(EasyMock.isA(String.class),
    					EasyMock.eq(CommunicationsService.CORE2CORE_MESSAGE_TYPE.RESOURCE_MESSAGE),
    					EasyMock.eq(BroadcastUtil.getCoreFromJID(rmApp1)));

    			communicationsService.sendMessage(EasyMock.isA(String.class),
    					EasyMock.eq(CommunicationsService.CORE2CORE_MESSAGE_TYPE.RESOURCE_MESSAGE),
    					EasyMock.eq(BroadcastUtil.getCoreFromJID(rmApp2)));
    		} catch (IllegalArgumentException e1) {
    			fail(e1.getMessage());
    		} catch (RemoteCoreUnknownException e1) {
    			fail(e1.getMessage());
    		} catch (RemoteCoreUnavailableException e1) {
    			fail(e1.getMessage());
    		} catch (LocalCoreNotOnlineException e1) {
    			fail(e1.getMessage());
    		} catch (NoShareAgreementException e1) {
    			fail(e1.getMessage());
    		} catch (NoShareRuleInAgreementException e1) {
    			fail(e1.getMessage());
    		}
    	}

    	EasyMock.replay(workProductService, communicationsService);

    	EdxlDeResponseDocument response = null;
    	try {
    		response = haveService.edxldeRequest(edxl.getEDXLDistribution());
//    		assertTrue(ValidationUtil.validate(response, true));
//    		System.out.println(response);
    	} catch (IllegalArgumentException e) {
    		fail(e.getMessage());
    	} catch (EmptyCoreNameListException e) {
    		fail(e.getMessage());
    	} catch (SendMessageErrorException e) {
    		fail(e.getMessage());
    	} catch (LocalCoreNotOnlineException e) {
    		fail(e.getMessage());
    	}

    	// System.out.println(response);
    	assertNotNull(response);
    	assertNotNull(response.getEdxlDeResponse());
    	assertNotNull(response.getEdxlDeResponse().getErrorExists());
    	assertFalse(response.getEdxlDeResponse().getErrorExists());
    	
//    	log.error(response.xmlText());

    	EasyMock.verify(workProductService, communicationsService);
    	return response;
    }

    private EdxlDeResponseDocument sendAndCheckHAVEAndExpectExceptionOnSend(String fileName) throws XmlException,
    IOException {
    	
    	EasyMock.reset(workProductService, communicationsService);

    	String[] explicitAddresses = { rmApp1 };
    	EDXLDistributionDocument edxl = null;
    	if (fileName != null) {
    		edxl = getHAVEMessageFromFile(fileName);
    	}
    	else {
    		edxl = getHAVEMessage(explicitAddresses);	
    	}
    	assertNotNull("file name failed",edxl);
    	
//    	System.out.println(edxl);
    	
    	assertTrue(ValidationUtil.validate(edxl, true));

    	ProductPublicationStatus status = new ProductPublicationStatus();
    	status.setStatus(ProductPublicationStatus.SuccessStatus);

    	EasyMock.expect(workProductService.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(
    			status);
    	if (edxl.getEDXLDistribution().sizeOfDistributionReferenceArray() > 0) {
    		expectXQuery();
    	}

    	// expect that the message will get sent twice to the cores from the JIDs
    	if (edxl.getEDXLDistribution().sizeOfExplicitAddressArray() > 0) {
    		try {
    			communicationsService.sendMessage(EasyMock.isA(String.class),
    					EasyMock.eq(CommunicationsService.CORE2CORE_MESSAGE_TYPE.RESOURCE_MESSAGE),
    					EasyMock.eq(BroadcastUtil.getCoreFromJID(rmApp1)));
    			EasyMock.expectLastCall().andThrow(new NoShareAgreementException("local", "remote"));

    		} catch (IllegalArgumentException e1) {
    			fail(e1.getMessage());
    		} catch (RemoteCoreUnknownException e1) {
    			fail(e1.getMessage());
    		} catch (RemoteCoreUnavailableException e1) {
    			fail(e1.getMessage());
    		} catch (LocalCoreNotOnlineException e1) {
    			fail(e1.getMessage());
    		} catch (NoShareAgreementException e1) {
    			fail(e1.getMessage());
    		} catch (NoShareRuleInAgreementException e1) {
    			fail(e1.getMessage());
    		}
    	}

    	EasyMock.replay(workProductService, communicationsService);

    	EdxlDeResponseDocument response = null;
    	try {
    		response = haveService.edxldeRequest(edxl.getEDXLDistribution());
//    		assertTrue(ValidationUtil.validate(response, true));
//    		System.out.println(response);
    	} catch (IllegalArgumentException e) {
    		fail(e.getMessage());
    	} catch (EmptyCoreNameListException e) {
    		fail(e.getMessage());
    	} catch (SendMessageErrorException e) {
        	EasyMock.verify(workProductService, communicationsService);    		
    	} catch (LocalCoreNotOnlineException e) {
    		fail(e.getMessage());
    	}

    	return response;
    }

    private EDXLDistributionDocument getHAVEMessage(String[] explicitAddresses) {
    	EDXLDistributionDocument edxl = EDXLDistributionDocument.Factory.newInstance();
    	XmlContentType xmlContent = edxl.addNewEDXLDistribution().addNewContentObject().addNewXmlContent();
    	
    	Calendar now = Calendar.getInstance();
    	HospitalStatusDocument have = HospitalStatusDocument.Factory.newInstance();
    	
    	addHospital(HOSPITAL_1_NAME, now, have);
    	addHospital(HOSPITAL_2_NAME, now, have);
    	
    	assertTrue(ValidationUtil.validate(have, true));
    	
    	xmlContent.addNewEmbeddedXMLContent().set(have);
    	
    	setDEHeader(edxl, now);
    	
    	for (String name: explicitAddresses) {
    		addExplicitAddress(edxl, name);
    	}
    	
    	return edxl;
    }

    private EDXLDistributionDocument getHAVEMessageFromFile(String fileName) {
    	File file = new File(fileName);
    	if (file.exists()) {
    		try {
    			EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(file);
    			EDXLDistributionDocument edxl = EDXLDistributionDocument.Factory.newInstance();
    			edxl.addNewEDXLDistribution().set(request.getEdxlDeRequest().getEDXLDistribution());
    			return edxl;
			} catch (XmlException e) {
				fail("cannot parse file: " + e.getMessage());
			} catch (IOException e) {
				fail("cannot parse file: " + e.getMessage());
			}
    	}
    	fail("file not file: " + fileName);
    	return null;
    }
	public void addHospital(String name, Calendar now, HospitalStatusDocument have) {
		if (have.getHospitalStatus() == null) {
			have.addNewHospitalStatus();
		}
		Hospital hospital = have.getHospitalStatus().addNewHospital();
    	hospital.addNewOrganization().addNewOrganizationInformation().addNewOrganisationName().
    		addNewNameElement().setStringValue(name);
    	hospital.getOrganization().addNewOrganizationGeoLocation().addNewPoint().addNewPos().setStringValue(DEFAULT_POINT_POS);
    	hospital.setLastUpdateTime(now);
	}

    private void setDEHeader(EDXLDistributionDocument edxl, Calendar now) {
    	edxl.getEDXLDistribution().setDistributionID(DE_DISTRIBUTION_ID);
    	edxl.getEDXLDistribution().setSenderID(rmApp1);
    	edxl.getEDXLDistribution().setDateTimeSent(now);
    	//2010-11-18T09:33:17.421-05:00
    	lastSentDateTime = "2010-11-18T09:33:17.421-05:00";
    	edxl.getEDXLDistribution().setDistributionStatus(StatusValues.TEST);
    	edxl.getEDXLDistribution().setDistributionType(TypeValues.REPORT);
    	edxl.getEDXLDistribution().setCombinedConfidentiality("COMBINED");
    }

    private void checkCommonHAVEResponseElements(EdxlDeResponseDocument response, Set<String> organizationNames) {

    	DigestType digest = response.getEdxlDeResponse().getDigest();
    	DigestDocument digestDoc = DigestDocument.Factory.newInstance();
    	digestDoc.addNewDigest().set(digest);
    	ValidationUtil.validate(digestDoc, true);
    	
    	assertTrue("no Hospital 0 locatedAt",DigestTester.hasLocatedAtElement(digest, HOSPITAL_0_ID, HOSPITAL_0_GEO_LOCATION_ID));
    	assertTrue("no Hospital 1 locatedAt",DigestTester.hasLocatedAtElement(digest, HOSPITAL_1_ID, HOSPITAL_1_GEO_LOCATION_ID));
    	
        // Check that there is one UCore Organization element for each organization
    	for (String name : organizationNames) {
    		OrganizationType org = DigestTester.getOrganizationElementFromDigestByOrganizationName(digest, name);
    		assertNotNull("org " + name + " not found",org);
    	}
    	
    	assertTrue("incorrect Point pos",DigestTester.checkLocationGMLPoint(digest, DEFAULT_POINT_POS));
    	
		assertTrue(DigestTester.checkOrganizationWhatElement(digest,
				HOSPITAL_0_ID, UCORE_CODESPACE_NS, "Organization", null, null));
		assertTrue(DigestTester.checkOrganizationWhatElement(digest,
				HOSPITAL_1_ID, UCORE_CODESPACE_NS, "Organization", null, null));

        // Validate the response
        assertTrue(ValidationUtil.validate(response, true));
    }
    
	private void addExplicitAddress(EDXLDistributionDocument edxl, String name) {

        ValueSchemeType explictAddress = edxl.getEDXLDistribution().addNewExplicitAddress();
        explictAddress.setExplicitAddressScheme(CommunicationsService.UICDSExplicitAddressScheme);
        explictAddress.addExplicitAddressValue(name);
    }
}
