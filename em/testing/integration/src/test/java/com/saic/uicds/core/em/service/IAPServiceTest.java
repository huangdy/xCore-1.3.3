package com.saic.uicds.core.em.service;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.iapService.IncidentActionPlanDocument;
import org.uicds.iapService.IncidentActionPlanType;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.uicds.core.em.service.impl.IAPServiceImpl;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class IAPServiceTest
    extends AbstractXmldbJpaTests {

    Logger log = LoggerFactory.getLogger(IAPServiceTest.class);

    @Autowired
    IAPServiceImpl iapService;

    @Test
    public void testIAPCreation() {

        assertNotNull(iapService);
    }

    @Test
    public void testCreateIAP() throws XmlException, IOException {

        IncidentActionPlanType plan = createActionPlan();
        ProductPublicationStatus status = iapService.createIAP(plan);

        assertNotNull(status);
        assertNotNull(status.getProduct().getProductID());
    }

    private IncidentActionPlanType createActionPlan() {

        IncidentActionPlanType plan = IncidentActionPlanType.Factory.newInstance();

        // Fill Action Plan with data
        plan.setDescriptionText("This is an incidentActionPlan");
        plan.setName("Defcon IV");

        // Create ICSFormData
        IdentificationType id = IdentificationType.Factory.newInstance();
        id.addNewIdentifier();
        plan.addNewComponents().addNewComponent().addNewComponentIdentifier().setWorkProductIdentification(
            id);
        // Return plan
        return plan;
    }

    @Test
    public void testGetIAP() throws XmlException, IOException {

        IncidentActionPlanType incidentActionPlan = createActionPlan();
        ProductPublicationStatus status = iapService.createIAP(incidentActionPlan);

        assertNotNull(status);
        IncidentActionPlanDocument planDoc = iapService.getIAP(status.getProduct().getProductID());
        assertNotNull(planDoc);
        assertNotNull(planDoc.getIncidentActionPlan());
        assertTrue(planDoc.getIncidentActionPlan().getId().equals(incidentActionPlan.getId()));
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
