package com.saic.uicds.core.em.endpoint;

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.leitscService.GetLEITSCIncidentRequestDocument;
import org.uicds.leitscService.GetLEITSCIncidentResponseDocument;
import org.uicds.leitscService.PostDetailedCFSMessageRequestDocument;
import org.uicds.leitscService.PostDetailedCFSMessageResponseDocument;

import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.uicds.core.em.exceptions.DetailedCFSMessageException;
import com.saic.uicds.core.em.exceptions.DetailedCFSMessageXMLException;
import com.saic.uicds.core.em.exceptions.LEITSCIncidentPublicationException;
import com.saic.uicds.core.em.service.LEITSCService;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class LEITSCServiceEndpointTest extends AbstractXmldbJpaTests {
    Logger log = LoggerFactory.getLogger(getClass());

    LEITSCServiceEndpoint leitscServiceEndpoint = new LEITSCServiceEndpoint();

    @Autowired
    LEITSCService leitscService;

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

    private WorkProduct getLEITSCIncident(String leitscIncidentID) {
        GetLEITSCIncidentRequestDocument requestDoc = GetLEITSCIncidentRequestDocument.Factory.newInstance();
        requestDoc.addNewGetLEITSCIncidentRequest().setLeitscIncidentID(leitscIncidentID);
        GetLEITSCIncidentResponseDocument responseDoc = leitscServiceEndpoint.getLEITSCIncident(requestDoc);
        return responseDoc.getGetLEITSCIncidentResponse().getWorkProduct();
    }

    @Test
    public void testPostBadDetailedCFSMessage() {

        assertNotNull(leitscService);
        leitscServiceEndpoint.setLEITSCService(leitscService);

        String fileName = "../data/PostDeailtedCFSMessage-bad.xml";
        // System.out.println("\n\n\n====> fileName=" + fileName);

        try {
            File file = new File(fileName);

            boolean exceptionCaught = false;
            ;
            try {
                PostDetailedCFSMessageRequestDocument requestDoc = PostDetailedCFSMessageRequestDocument.Factory.parse(file);
            } catch (XmlException e) {
                log.debug("testPostBadDetailedCFSMessage  Caught expected exception XmlException from parsing data file "
                    + fileName + "  error=" + e.getMessage());
                exceptionCaught = true;
            }
            assertTrue(exceptionCaught);

        } catch (IOException e) {
            fail("testPostBadDetailedCFSMessage  Caught unexpected exception IOException from opening file "
                + fileName + "  error=" + e.getMessage());
        }
    }

    @Test
    public void testPostEmptyDetailedCFSMessage() {
        assertNotNull(leitscService);
        leitscServiceEndpoint.setLEITSCService(leitscService);

        String fileName = "../data/PostDeailtedCFSMessage-empty.xml";
        // System.out.println("\n\n\n====> fileName=" + fileName);

        File file = new File(fileName);
        PostDetailedCFSMessageRequestDocument requestDoc = null;
        try {
            requestDoc = PostDetailedCFSMessageRequestDocument.Factory.parse(file);
        } catch (XmlException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("testPostEmptyDetailedCFSMessage  Caught unexpected exception XmlException from opening file "
                + fileName + "  error=" + e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            log.error("testPostEmptyDetailedCFSMessage  Caught unexpected exception IOException from parsing data file "
                + fileName + "  error=" + e.getMessage());
            fail(e.getMessage());
        }

        boolean exceptionCaught = false;
        if (requestDoc != null) {
            try {
                PostDetailedCFSMessageResponseDocument responseDoc = leitscServiceEndpoint.postDetailedCFSMessage(requestDoc);
            } catch (DetailedCFSMessageException e1) {
                log.debug("testPostEmptyDetailedCFSMessage  Caught expected exception DetailedCFSMessageException from parsing data file "
                    + fileName
                    + "  error="
                    + e1.getMessage()
                    + " elementName="
                    + e1.getElementName());
                exceptionCaught = true;
            } catch (DetailedCFSMessageXMLException e1) {
                log.debug("testPostEmptyDetailedCFSMessage  Caught expected exception DetailedCFSMessageXMLException from parsing data file "
                    + fileName + "  error=" + e1.getMessage());
                exceptionCaught = true;
            } catch (LEITSCIncidentPublicationException e1) {
                fail("testPostEmptyDetailedCFSMessage   unexpected exception LEITSCIncidentPublicationException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (XmlException e1) {
                fail("testPostEmptyDetailedCFSMessage   unexpected exception XmlException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            }

        }
        assertTrue(exceptionCaught);
    }

    @Test
    public void testPostNoInfoDetailedCFSMessage() {
        assertNotNull(leitscService);
        leitscServiceEndpoint.setLEITSCService(leitscService);

        String fileName = "../data/PostDeailtedCFSMessage-noInfo.xml";
        // System.out.println("\n\n\n====> fileName=" + fileName);

        File file = new File(fileName);
        PostDetailedCFSMessageRequestDocument requestDoc = null;
        try {
            requestDoc = PostDetailedCFSMessageRequestDocument.Factory.parse(file);
        } catch (XmlException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("testPostNoInfoDetailedCFSMessage  Caught unexpected exception XmlException from opening file "
                + fileName + "  error=" + e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            log.error("testPostNoInfoDetailedCFSMessage  Caught unexpected exception IOException from parsing data file "
                + fileName + "  error=" + e.getMessage());
            fail(e.getMessage());
        }

        boolean exceptionCaught = false;
        if (requestDoc != null) {
            PostDetailedCFSMessageResponseDocument responseDoc;
            try {
                responseDoc = leitscServiceEndpoint.postDetailedCFSMessage(requestDoc);
            } catch (DetailedCFSMessageException e1) {
                log.debug("testPostEmptyDetailedCFSMessage  Caught expected exception DetailedCFSMessageException from parsing data file "
                    + fileName
                    + "  error="
                    + e1.getMessage()
                    + " elementName="
                    + e1.getElementName());
                exceptionCaught = true;
            } catch (DetailedCFSMessageXMLException e1) {
                log.debug("testPostEmptyDetailedCFSMessage  Caught expected exception DetailedCFSMessageXMLException from parsing data file "
                    + fileName + "  error=" + e1.getMessage());
                exceptionCaught = true;
            } catch (LEITSCIncidentPublicationException e1) {
                fail("testPostNoInfoDetailedCFSMessage   unexpected exception LEITSCIncidentPublicationException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (XmlException e1) {
                fail("testPostNoInfoDetailedCFSMessage   unexpected exception XmlException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            }

        }
        assertTrue(exceptionCaught);
    }

    @Test
    public void testPostDetailedCFSMessageMissingElement() {
        assertNotNull(leitscService);
        leitscServiceEndpoint.setLEITSCService(leitscService);

        String fileName = "../data/PostDeailtedCFSMessage-Create-MissingElement.xml";
        // System.out.println("\n\n\n====> fileName=" + fileName);

        File file = new File(fileName);
        PostDetailedCFSMessageRequestDocument requestDoc = null;
        try {
            requestDoc = PostDetailedCFSMessageRequestDocument.Factory.parse(file);
        } catch (XmlException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("testPostDetailedCFSMessageMissingElement  Caught unexpected exception XmlException from opening file "
                + fileName + "  error=" + e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            log.error("testPostDetailedCFSMessageMissingElement  Caught unexpected exception IOException from parsing data file "
                + fileName + "  error=" + e.getMessage());
            fail(e.getMessage());
        }

        boolean exceptionCaught = false;
        if (requestDoc != null) {
            PostDetailedCFSMessageResponseDocument responseDoc;
            try {
                responseDoc = leitscServiceEndpoint.postDetailedCFSMessage(requestDoc);
            } catch (DetailedCFSMessageException e1) {
                log.debug("testPostEmptyDetailedCFSMessage  Caught expected exception DetailedCFSMessageException from parsing data file "
                    + fileName
                    + "  error="
                    + e1.getMessage()
                    + " elementName="
                    + e1.getElementName());
                exceptionCaught = true;
            } catch (DetailedCFSMessageXMLException e1) {
                log.debug("testPostEmptyDetailedCFSMessage  Caught expected exception DetailedCFSMessageXMLException from parsing data file "
                    + fileName + "  error=" + e1.getMessage());
                exceptionCaught = true;
            } catch (LEITSCIncidentPublicationException e1) {
                fail("testPostNoInfoDetailedCFSMessage   unexpected exception LEITSCIncidentPublicationException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (XmlException e1) {
                fail("testPostNoInfoDetailedCFSMessage   unexpected exception XmlException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            }

        }
        assertTrue(exceptionCaught);
    }

    private void createLEITSCIncident() {
        String fileName = "../data/PostDeailtedCFSMessage-Created.xml";
        // System.out.println("\n\n\n====> fileName=" + fileName);

        File file = new File(fileName);
        PostDetailedCFSMessageRequestDocument requestDoc = null;
        try {
            requestDoc = PostDetailedCFSMessageRequestDocument.Factory.parse(file);
        } catch (XmlException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("testPostDetailedCFSMessageOpen  Caught unexpected exception XmlException from opening file "
                + fileName + "  error=" + e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            log.error("testPostDetailedCFSMessageOpen  Caught unexpected exception IOException from parsing data file "
                + fileName + "  error=" + e.getMessage());
            fail(e.getMessage());
        }

        if (requestDoc != null) {
            try {
                PostDetailedCFSMessageResponseDocument responseDoc = leitscServiceEndpoint.postDetailedCFSMessage(requestDoc);

                WorkProduct product = getLEITSCIncident(responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                if (product == null) {
                    log.error("testPostDetailedCFSMessage:  unable to get uicds incident created for LEITSC incident, ID="
                        + responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                    fail("testPostDetailedCFSMessage: unable to get uicds incident created for LEITSC incident, ID="
                        + responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                }
            } catch (DetailedCFSMessageException e) {
                log.error("testPostDetailedCFSMessageOpen   unexpected exception DetailedCFSMessageException  caught when processing request for file "
                    + fileName + "  error=" + e.getMessage());
                fail("testPostDetailedCFSMessageOpen   unexpected exception DetailedCFSMessageException  caught when processing request for file "
                    + fileName + "  error=" + e.getMessage());
            } catch (DetailedCFSMessageXMLException e1) {
                fail("testPostDetailedCFSMessageOpen   unexpected exception DetailedCFSMessageXMLException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (LEITSCIncidentPublicationException e1) {
                fail("testPostDetailedCFSMessageOpen   unexpected exception LEITSCIncidentPublicationException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (XmlException e) {
                // TODO Auto-generated catch block
                fail("testPostDetailedCFSMessageOpen   unexpected exception XmlException  caught when processing request for file "
                    + fileName);
            }
        }
    }

    @Test
    public void testPostDetailedCFSMessageCreated() {
        assertNotNull(leitscService);
        leitscServiceEndpoint.setLEITSCService(leitscService);

        createLEITSCIncident();
    }

    @Test
    public void testPostDetailedCFSMessageOpen() {
        assertNotNull(leitscService);
        leitscServiceEndpoint.setLEITSCService(leitscService);

        createLEITSCIncident();

        String fileName = "../data/PostDeailtedCFSMessage-Open.xml";
        // System.out.println("\n\n\n====> fileName=" + fileName);

        File file = new File(fileName);
        PostDetailedCFSMessageRequestDocument requestDoc = null;
        try {
            requestDoc = PostDetailedCFSMessageRequestDocument.Factory.parse(file);
        } catch (XmlException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("testPostDetailedCFSMessageOpen  Caught unexpected exception XmlException from opening file "
                + fileName + "  error=" + e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            log.error("testPostDetailedCFSMessageOpen  Caught unexpected exception IOException from parsing data file "
                + fileName + "  error=" + e.getMessage());
            fail(e.getMessage());
        }

        if (requestDoc != null) {
            try {
                PostDetailedCFSMessageResponseDocument responseDoc = leitscServiceEndpoint.postDetailedCFSMessage(requestDoc);
                WorkProduct product = getLEITSCIncident(responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                if (product == null) {
                    log.error("testPostDetailedCFSMessage:  unable to get uicds incident updated for LEITSC incident, ID="
                        + responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                    fail("testPostDetailedCFSMessage: unable to get uicds incident updated for LEITSC incident, ID="
                        + responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                }
            } catch (DetailedCFSMessageException e) {
                log.error("testPostDetailedCFSMessageOpen   unexpected exception DetailedCFSMessageException  caught when processing request for file "
                    + fileName + "  error=" + e.getMessage());
                fail("testPostDetailedCFSMessageOpen   unexpected exception DetailedCFSMessageException  caught when processing request for file "
                    + fileName + "  error=" + e.getMessage());
            } catch (DetailedCFSMessageXMLException e1) {
                fail("testPostDetailedCFSMessageOpen   unexpected exception DetailedCFSMessageXMLException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (LEITSCIncidentPublicationException e1) {
                fail("testPostDetailedCFSMessageOpen   unexpected exception LEITSCIncidentPublicationException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (XmlException e) {
                // TODO Auto-generated catch block
                fail("testPostDetailedCFSMessageOpen   unexpected exception XmlException  caught when processing request for file "
                    + fileName);
            }
        }
    }

    @Test
    public void testPostDetailedCFSMessageCleared() {
        assertNotNull(leitscService);
        leitscServiceEndpoint.setLEITSCService(leitscService);

        createLEITSCIncident();

        String fileName = "../data/PostDeailtedCFSMessage-Cleared.xml";
        // System.out.println("\n\n\n====> fileName=" + fileName);

        File file = new File(fileName);
        PostDetailedCFSMessageRequestDocument requestDoc = null;
        try {
            requestDoc = PostDetailedCFSMessageRequestDocument.Factory.parse(file);
        } catch (XmlException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("testPostDetailedCFSMessageCleared  Caught unexpected exception XmlException from opening file "
                + fileName + "  error=" + e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            log.error("testPostDetailedCFSMessageCleared  Caught unexpected exception IOException from parsing data file "
                + fileName + "  error=" + e.getMessage());
            fail(e.getMessage());
        }

        if (requestDoc != null) {
            try {
                PostDetailedCFSMessageResponseDocument responseDoc = leitscServiceEndpoint.postDetailedCFSMessage(requestDoc);

                WorkProduct product = getLEITSCIncident(responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                if (product != null) {
                    log.error("testPostDetailedCFSMessage:  unable to get uicds incident closed/archived for cleared LEITSC incident, ID="
                        + responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                    fail("testPostDetailedCFSMessage: unable to get uicds incident closed/archved  for cleared LEITSC incident, ID="
                        + responseDoc.getPostDetailedCFSMessageResponse().getLeitscIncidentID());
                }
            } catch (DetailedCFSMessageException e) {
                log.error("testPostDetailedCFSMessageCleared   unexpected exception DetailedCFSMessageException  caught when processing request for file "
                    + fileName + "  error=" + e.getMessage());
                fail("testPostDetailedCFSMessageCleared   unexpected exception DetailedCFSMessageException  caught when processing request for file "
                    + fileName + "  error=" + e.getMessage());
            } catch (DetailedCFSMessageXMLException e1) {
                fail("testPostDetailedCFSMessageCleared   unexpected exception DetailedCFSMessageXMLException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (LEITSCIncidentPublicationException e1) {
                fail("testPostDetailedCFSMessageCleared   unexpected exception LEITSCIncidentPublicationException  caught when processing request for file "
                    + fileName + " message=" + e1.getMessage());
            } catch (XmlException e) {
                // TODO Auto-generated catch block
                fail("testPostDetailedCFSMessageCleared   unexpected exception XmlException  caught when processing request for file "
                    + fileName);
            }
        }
    }

}
