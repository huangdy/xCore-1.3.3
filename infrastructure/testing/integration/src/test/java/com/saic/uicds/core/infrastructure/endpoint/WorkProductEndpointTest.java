package com.saic.uicds.core.infrastructure.endpoint;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.soap.SOAPException;

import net.sf.saxon.instruct.ValueOf;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.workProductService.ArchiveProductRequestDocument;
import org.uicds.workProductService.ArchiveProductResponseDocument;
import org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument;
import org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument;
import org.uicds.workProductService.CloseProductRequestDocument;
import org.uicds.workProductService.CloseProductResponseDocument;
import org.uicds.workProductService.GetProductCurrentVersionRequestDocument;
import org.uicds.workProductService.GetProductCurrentVersionResponseDocument;
import org.uicds.workProductService.GetProductRequestDocument;
import org.uicds.workProductService.GetProductResponseDocument;
import org.uicds.workProductService.PublishProductRequestDocument;
import org.uicds.workProductService.PublishProductResponseDocument;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.ProcessingStateType;
import com.saic.precis.x2009.x06.base.ProcessingStatusType;
import com.saic.precis.x2009.x06.base.PropertiesType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.uicds.core.infrastructure.service.DirectoryService;
import com.saic.uicds.core.infrastructure.service.InterestGroupManagementComponent;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.InterestGroupInfo;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

public class WorkProductEndpointTest
    extends AbstractXmldbJpaTests {

    Logger log = LoggerFactory.getLogger(getClass());

    
    @Autowired
    WorkProductService workProductService;

    WorkProductEndpoint workProductEndpoint = new WorkProductEndpoint();

    @Autowired
    InterestGroupManagementComponent igService;
    
    @Autowired
    DirectoryService directoryService;
    
    String alertEvent = "a test alert event";
    String alertHeadline = "a test alert headline";
    String alertIdentifier = "identifier";
    String alertSender = "sender";
    Calendar alertSent = new GregorianCalendar();
    String productID = "";
    String interestGroupID="";

    @Test
    public void testAssociateWorkProductToIncident() throws Exception {

        assertNotNull(workProductService);
        workProductEndpoint.setWorkProductService(workProductService);

        AssociateWorkProductToInterestGroupRequestDocument request = AssociateWorkProductToInterestGroupRequestDocument.Factory.newInstance();
        request.addNewAssociateWorkProductToInterestGroupRequest().addNewWorkProductID().setStringValue(
            "workProductID");
        request.getAssociateWorkProductToInterestGroupRequest().addNewIncidentID().setStringValue(
            "incidentId");
        AssociateWorkProductToInterestGroupResponseDocument response = workProductEndpoint.associateWorkProductToInterestGroup(request);
        assertNotNull(response);
        
    }

    @Test
    public void testWorkProductCRUD() throws Exception {

        assertNotNull(workProductService);
        workProductEndpoint.setWorkProductService(workProductService);

        {
            WorkProductDocument wpd = WorkProductDocument.Factory.parse(new File(
                "../data/WorkProductDocument.xml"));
            
            // we create interestGroup here, and for supporting publishProduct in WorkProductEndpoint class
            //when we send the request as publishWorkProductDocument does, we add the interestGroup for the
            //work product now.
            
            //create one interestGroup for testing.
            InterestGroupInfo igInfo = new InterestGroupInfo();
            igInfo.setDescription("abc");
            igInfo.setInterestGroupID("ABC123");
            igInfo.setInterestGroupSubType("123");
            igInfo.setName("abc-name"); 
            igInfo.setOwningCore(directoryService.getCoreName());            
            interestGroupID =igService.createInterestGroup(igInfo);
            
            // publish the product the first time
            PublishProductResponseDocument publishResponse = publishWorkProductDocument(wpd.getWorkProduct());
            
            // update the product
            PublishProductResponseDocument updateResponse = readAndUpdateWorkProductDocument(publishResponse);

            // get by product id only
            checkGetByProductId(
                updateResponse.getPublishProductResponse().getWorkProductPublicationResponse().getWorkProduct(),
                "2");

            // to close the product with wrong version of WorkProductIdentification
            CloseProductResponseDocument closeResponse = closeWorkProduct(WorkProductHelper.getIdentificationElement(publishResponse.getPublishProductResponse().getWorkProductPublicationResponse().getWorkProduct()));
            ProcessingStatusType status = closeResponse.getCloseProductResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus();
            assertEquals(ProcessingStateType.REJECTED, status.getStatus());

            // now, close product with the correct version identification
            closeResponse = closeWorkProduct(WorkProductHelper.getIdentificationElement(updateResponse.getPublishProductResponse().getWorkProductPublicationResponse().getWorkProduct()));
            status = closeResponse.getCloseProductResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus();
            assertEquals(ProcessingStateType.ACCEPTED, status.getStatus());

            ArchiveProductResponseDocument archiveResponse = archiveWorkProduct(WorkProductHelper.getIdentificationElement(closeResponse.getCloseProductResponse().getWorkProductPublicationResponse().getWorkProduct()));
            status = archiveResponse.getArchiveProductResponse().getWorkProductProcessingStatus();
            assertEquals(ProcessingStateType.ACCEPTED, status.getStatus());

            // Ticket 282 - get NULL when the work product is deleted
            log.debug("This test is for ticket: 282. To test the get deleted product");
            try {
                GetProductResponseDocument getProductResponse = getDeletedWorkProduct(publishResponse);
            } catch (SOAPException e) {
                assertEquals(e.getMessage(), "Work Product does not exist");
            }
        }
    }

    private ArchiveProductResponseDocument archiveWorkProduct(IdentificationType productID)
        throws Exception {

        // work around for trac #305
        ArchiveProductRequestDocument request = ArchiveProductRequestDocument.Factory.newInstance();
        request.addNewArchiveProductRequest().addNewWorkProductIdentification().set(productID);
        ArchiveProductResponseDocument response = workProductEndpoint.archiveProduct(request);

        return response;
    }

    private CloseProductResponseDocument closeWorkProduct(IdentificationType productID)
        throws Exception {

        log.debug("Close product: " + productID.getIdentifier().toString() + ", version: "
            + productID.getVersion().getStringValue());

        CloseProductRequestDocument request = CloseProductRequestDocument.Factory.newInstance();
        request.addNewCloseProductRequest().addNewWorkProductIdentification().set(productID);

        CloseProductResponseDocument response = workProductEndpoint.closeProduct(request);

        return response;
    }

    private PublishProductResponseDocument readAndUpdateWorkProductDocument(
        PublishProductResponseDocument publishResponse) throws Exception {

        GetProductResponseDocument getResponse = null;

        getResponse = getWorkProduct(publishResponse, getResponse);

        WorkProduct workProduct = getResponse.getGetProductResponse().getWorkProduct();
                
        PublishProductResponseDocument updateResponse = publishWorkProductDocument(workProduct);

        return updateResponse;
    }

    private void checkGetByProductId(WorkProduct workProduct, String version) {

        IdentificationType id = WorkProductHelper.getIdentificationElement(workProduct);

        GetProductCurrentVersionRequestDocument request = GetProductCurrentVersionRequestDocument.Factory.newInstance();
        request.addNewGetProductCurrentVersionRequest().addNewIdentifier().setStringValue(
            id.getIdentifier().getStringValue());

        GetProductCurrentVersionResponseDocument response = null;
        try {
            response = workProductEndpoint.getProductCurrentVersion(request);
        } catch (SOAPException e) {
            fail("Exception getting work product: " + e.getMessage());
        }
        assertNotNull("null resposne", response);
        IdentificationType newID = WorkProductHelper.getIdentificationElement(response.getGetProductCurrentVersionResponse().getWorkProduct());
        assertEquals("wrong version", version, newID.getVersion().getStringValue());
    }

    private GetProductResponseDocument getWorkProduct(
        PublishProductResponseDocument publishResponse, GetProductResponseDocument getResponse) {

        IdentificationType id = WorkProductHelper.getIdentificationElement(publishResponse.getPublishProductResponse().getWorkProductPublicationResponse().getWorkProduct());

        GetProductRequestDocument getRequest = GetProductRequestDocument.Factory.newInstance();
        getRequest.addNewGetProductRequest().addNewWorkProductIdentification().set(id);

        try {
            getResponse = workProductEndpoint.getProduct(getRequest);
        } catch (SOAPException e) {
            fail("Exception getting work product: " + e.getMessage());
        }
        return getResponse;
    }

    private GetProductResponseDocument getDeletedWorkProduct(
        PublishProductResponseDocument publishResponse) throws SOAPException {

        // work around for trac #305
        IdentificationType id = versionIncrement(WorkProductHelper.getIdentificationElement(publishResponse.getPublishProductResponse().getWorkProductPublicationResponse().getWorkProduct()));
        log.debug("Archive product: " + id.getIdentifier().toString() + ", version: "
            + id.getVersion().getStringValue());

        GetProductRequestDocument getProductRequest = GetProductRequestDocument.Factory.newInstance();
        getProductRequest.addNewGetProductRequest().addNewWorkProductIdentification().set(id);
        return workProductEndpoint.getProduct(getProductRequest);
    }

    private PublishProductResponseDocument publishWorkProductDocument(WorkProduct workProduct)
        throws XmlException, IOException, DatatypeConfigurationException, Exception {

        // Create the request
        PublishProductRequestDocument request = PublishProductRequestDocument.Factory.newInstance();
        request.addNewPublishProductRequest().addNewWorkProduct();

        request.getPublishProductRequest().setWorkProduct(workProduct);
        
        //we create the interestGroup and publish it at testWorkProductCRUD,
        //that is why we can use it here.
        request.getPublishProductRequest().setIncidentId(interestGroupID);

        log.debug("PublishProductRequest:\n" + request);
        PublishProductResponseDocument response = workProductEndpoint.publishProduct(request);               
        IdentificationType id = WorkProductHelper.getIdentificationElement(response.getPublishProductResponse().getWorkProductPublicationResponse().getWorkProduct());       
        PropertiesType props = WorkProductHelper.getPropertiesElement(response.getPublishProductResponse().getWorkProductPublicationResponse().getWorkProduct());
                    
        assertNotNull(props);
        
       //this call get the props.getAssociatedGroups() whole thing
       // String testIGID = props.getAssociatedGroups().toString();  
        
        //this call get the props.getAssociatedGroups() string value only.
        String testIGID =props.getAssociatedGroups().getIdentifierArray(0).getStringValue();
                  
    //    System.out.println("Pre-set IG id :" + interestGroupID);
    //    System.out.println("Returned IG id :" + testIGID);

        //check the boht is the same or not, if yes, no error, then publishProduct with interestGroup call works!
        assertEquals(testIGID, interestGroupID);
        
        productID = id.getIdentifier().getStringValue();

        assertCheckWorkProduct(id);

        assertNotNull(id.getVersion().getStringValue());

        return response;
    }

    public void assertCheckWorkProduct(IdentificationType packageID) throws Exception {

        assertNotNull(workProductService);
        workProductEndpoint.setWorkProductService(workProductService);

        {
            // get the work product
            GetProductRequestDocument request = GetProductRequestDocument.Factory.newInstance();
            request.addNewGetProductRequest().setWorkProductIdentification(packageID);
            GetProductResponseDocument response = workProductEndpoint.getProduct(request);
            assertNotNull(response);

            // make sure it has content
            assertEquals(1,
                response.getGetProductResponse().getWorkProduct().sizeOfStructuredPayloadArray());

            assertNotNull(response.getGetProductResponse().getWorkProduct().getStructuredPayloadArray(
                0));

        }
    }

    private IdentificationType versionIncrement(IdentificationType id) {

        IdentificationType newId = IdentificationType.Factory.newInstance();

        newId.addNewIdentifier().set(id.getIdentifier());
        newId.addNewChecksum().set(id.getChecksum());
        newId.addNewType().set(id.getType());

        Integer version = Integer.parseInt(id.getVersion().getStringValue());
        version++;
        newId.addNewVersion().setStringValue(version.toString());
        return newId;
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-ED-dataSrcContext.xml" };
    }
}
