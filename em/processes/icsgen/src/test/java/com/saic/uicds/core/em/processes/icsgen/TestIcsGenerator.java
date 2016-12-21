/**
 * 
 */
package com.saic.uicds.core.em.processes.icsgen;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.xmlbeans.XmlException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;
import org.uicds.incident.IncidentDocument;
import org.uicds.incidentManagementService.IncidentInfoType;
import org.uicds.organizationElement.OrganizationElementDocument;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.uicds.core.em.messages.IncidentStateNotificationMessage;
import com.saic.uicds.core.em.service.IncidentCommandService;
import com.saic.uicds.core.em.service.IncidentManagementService;
import com.saic.uicds.core.infrastructure.messages.InterestGroupStateNotificationMessage;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;

/**
 * @author roger
 */
public class TestIcsGenerator
    extends AbstractDependencyInjectionSpringContextTests {

    @Autowired
    IcsGenerator icsGenerator;

    // mock objects
    WorkProductService workProductService;
    IncidentCommandService incidentCommandService;

    static private final String incidentDocumentWPID = "1";
    static private final String orgWPID = "2";
    static private final String incidentID = "222";
    static private final String orgID = "33";

    private IncidentDocument originalIncidentDocument;
    private WorkProduct incidentWP;
    private OrganizationElementDocument orgDoc;
    private ArrayList<WorkProduct> wpArrayList = new ArrayList<WorkProduct>();

    public void setIcsGenerator(IcsGenerator ics) {

        icsGenerator = ics;
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] { "classpath:contexts/applicationContext.xml" };
    }

    @Override
    public void onSetUp() {

        // log.debug("\nCall: \n onSetUp\n");
        workProductService = org.easymock.EasyMock.createMock(WorkProductService.class);
        icsGenerator.setWorkProductService(workProductService);

        incidentCommandService = org.easymock.EasyMock.createMock(IncidentCommandService.class);
        icsGenerator.setIncidentCommandService(incidentCommandService);

        incidentWP = createIncidentWorkProduct();
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {

    }

    /**
     * @throws java.lang.Exception
     */
    @Test
    public void testSetup() {

        assertNotNull(icsGenerator);
    }

    // @Test
    // public void testGetIncidentDocument() {
    // // Make getIncidentDocument public
    //
    // // Get the incident document from the work product
    // // IncidentDocument doc = icsGenerator.get
    //
    // // Make sure it is the same as the original
    // }

    /**
     * Test the creation of an ICS for an incident when it gets created.
     */
    @Test
    public void testGenerateIcs() {

        IncidentStateNotificationMessage msg = createIncidentStateNotificationMessage(InterestGroupStateNotificationMessage.State.NEW);

        ProductPublicationStatus status = new ProductPublicationStatus();
        status.setStatus(ProductPublicationStatus.SuccessStatus);
        org.easymock.EasyMock.expect(
            incidentCommandService.updateCommandStructure(
                (IdentificationType) org.easymock.EasyMock.isNull(),
                org.easymock.EasyMock.isA(OrganizationElementDocument.class),
                org.easymock.EasyMock.eq(incidentID))).andReturn(status);

        org.easymock.EasyMock.expect(
            workProductService.getProduct(msg.getIncidentInfo().getWorkProductIdentification().getIdentifier().getStringValue())).andReturn(
            incidentWP);

        org.easymock.EasyMock.replay(workProductService, incidentCommandService);

        icsGenerator.handleIncidentState(msg);

        org.easymock.EasyMock.verify(workProductService, incidentCommandService);

        checkTransportOrganizationDocument(icsGenerator.getOrgDoc());
    }

    // This test was disabled because the functionality to update the ICS when the incident is
    // updated was disabled in IcsGenerator.java. See comments there.
    @Test
    // public void testChangeIncidentType() {
    // org.easymock.EasyMock.reset(workProductService, incidentCommandService);
    //
    // IncidentDocument doc = getIncidentDocument(incidentWP);
    // doc.getIncident().getActivityCategoryTextArray(0).setStringValue(
    // IcsGenerator.CAP_CBRNE_TYPE);
    // String incidentProductID = doc.getIncident().getId();
    //
    // updateIncidentWorkProduct(incidentWP, doc);
    // System.out.println(incidentProductID);
    //
    // // Set up a wp list
    // orgDoc = icsGenerator.getOrgDoc();
    // WorkProduct w = new WorkProduct();
    // w.setProduct(orgDoc.toString().getBytes());
    // w.setProductID(orgWPID);
    // w.setProductType(IncidentCommandService.ICSType);
    // w.setProductVersion(1);
    // w.setChecksum("checksum");
    // wpArrayList.add(w);
    //
    // IncidentStateNotificationMessage msg =
    // createIncidentStateNotificationMessage(InterestGroupStateNotificationMessage.State.UPDATE);
    //
    // org.easymock.EasyMock.expect(
    // workProductService.getProduct(msg.getIncidentInfo().getWorkProductIdentification().getIdentifier().getStringValue())).andReturn(
    // incidentWP);
    // WorkProduct[] wpList = new WorkProduct[wpArrayList.size()];
    // wpArrayList.toArray(wpList);
    // org.easymock.EasyMock.expect(
    // workProductService.getAssociatedWorkProductList(msg.getIncidentInfo().getId())).andReturn(
    // wpList);
    //
    // ProductPublicationStatus status = new ProductPublicationStatus();
    // status.setStatus(ProductPublicationStatus.SuccessStatus);
    // org.easymock.EasyMock.expect(
    // incidentCommandService.updateCommandStructure(
    // org.easymock.EasyMock.isA(IdentificationType.class),
    // org.easymock.EasyMock.isA(OrganizationElementDocument.class),
    // org.easymock.EasyMock.eq(incidentID))).andReturn(status);
    //
    // org.easymock.EasyMock.replay(workProductService, incidentCommandService);
    //
    // icsGenerator.handleIncidentState(msg);
    //
    // org.easymock.EasyMock.verify(workProductService, incidentCommandService);
    //
    // checkCBRNEOrganizationDocument(icsGenerator.getOrgDoc());
    //
    // }
    private void checkTransportOrganizationDocument(OrganizationElementDocument doc) {

        assertNotNull(doc);
        assertNotNull(doc.getOrganizationElement());
        assertNotNull(doc.getOrganizationElement().getPersonInCharge());
    }

    private void checkCBRNEOrganizationDocument(OrganizationElementDocument doc) {

        checkTransportOrganizationDocument(doc);
        assertTrue(doc.getOrganizationElement().sizeOfOrganizationElementArray() > 0);
        assertEquals(
            doc.getOrganizationElement().getOrganizationElementArray(0).getOrganizationName(),
            IcsGenerator.OPERATIONS_SECTION_NAME);
        assertEquals(
            doc.getOrganizationElement().getOrganizationElementArray(0).getOrganizationType(),
            IcsGenerator.SECTION_TYPE);
        assertNotNull(doc.getOrganizationElement().getOrganizationElementArray(0).getPersonInCharge());
        assertEquals(
            doc.getOrganizationElement().getOrganizationElementArray(0).getPersonInCharge().getRoleProfileRef(),
            IcsGenerator.OPERATIONS_SECTION_CHIEF);
    }

    private IncidentStateNotificationMessage createIncidentStateNotificationMessage(
        InterestGroupStateNotificationMessage.State state) {

        IncidentStateNotificationMessage msg = new IncidentStateNotificationMessage();
        IncidentInfoType incidentInfo = IncidentInfoType.Factory.newInstance();
        IdentificationType identification = IdentificationType.Factory.newInstance();
        identification.addNewChecksum().setStringValue("123");
        identification.addNewIdentifier().setStringValue(incidentDocumentWPID);
        identification.addNewType().setStringValue(IncidentManagementService.Type);
        identification.addNewVersion().setStringValue("1");
        incidentInfo.setWorkProductIdentification(identification);
        incidentInfo.setId(incidentID);
        msg.setIncidentInfo(incidentInfo);
        msg.setState(state);
        return msg;
    }

    private WorkProduct createIncidentWorkProduct() {

        WorkProduct wp = new WorkProduct();
        wp.setProduct(readIncidentFile());
        return wp;
    }

    private WorkProduct updateIncidentWorkProduct(WorkProduct incidentWorkProduct,
        IncidentDocument doc) {

        incidentWorkProduct.setProduct(doc);
        return incidentWorkProduct;
    }

    public IncidentDocument readIncidentFile() {

        IncidentDocument doc = null;
        File file = new File("src/test/resources/data/incident-edxl.xml");
        if (file.exists()) {
            try {
                doc = IncidentDocument.Factory.parse(file);
            } catch (XmlException exception) {
                fail("XML parse failure " + exception.getMessage());
            } catch (IOException e) { // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            fail("file does not exist");
        }
        originalIncidentDocument = (IncidentDocument) doc.copy();
        return doc;
    }

    private IncidentDocument getIncidentDocument(WorkProduct wp) {

        IncidentDocument incidentDoc = null;
        try {
            incidentDoc = (IncidentDocument) wp.getProduct();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return incidentDoc;
    }

}
