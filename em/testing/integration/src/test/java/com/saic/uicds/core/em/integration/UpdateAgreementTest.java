package com.saic.uicds.core.em.integration;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uicds.agreementService.AgreementType;
import org.uicds.agreementService.AgreementType.Principals;
import org.uicds.agreementService.AgreementType.ShareRules;
import org.uicds.agreementService.ConditionType;

import com.saic.precis.x2009.x06.base.CodespaceValueType;
import com.saic.precis.x2009.x06.base.IdentifierType;
import com.saic.uicds.core.infrastructure.exceptions.UICDSException;
import com.saic.uicds.core.infrastructure.service.impl.AgreementServiceImpl;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class UpdateAgreementTest extends AbstractXmldbJpaTests {
    Logger log = LoggerFactory.getLogger(UpdateAgreementTest.class);

    AgreementServiceImpl agreementService;

    private static final String localCore = "uicds@localCore";
    private static final String remoteCore = "uicds@remoteCore";

    public AgreementServiceImpl getAgreementService() {
        return agreementService;
    }

    public void setAgreementService(AgreementServiceImpl agreementService) {
        this.agreementService = agreementService;
    }

    @Test
    public void testInit() {
        assertNotNull(agreementService);
    }

    @Test
    public void testUpdateAgreement() {

        AgreementType controlAgreement = createSimpleAgreement();

        ShareRules shareRules = controlAgreement.getShareRules();

        ShareRules.ShareRule shareRule1 = shareRules.addNewShareRule();
        shareRule1.setId("1");
        shareRule1.setEnabled(true);
        ConditionType condition = shareRule1.addNewCondition();
        CodespaceValueType interestGroup = condition.addNewInterestGroup();
        interestGroup.setCodespace("http://uicds.org/interestgroup#incident");
        interestGroup.setLabel("Incident Type");
        interestGroup.setStringValue("traffic");

        ShareRules.ShareRule shareRule2 = shareRules.addNewShareRule();
        shareRule2.setId("2");
        shareRule2.setEnabled(true);
        ConditionType condition2 = shareRule2.addNewCondition();
        CodespaceValueType interestGroup2 = condition2.addNewInterestGroup();
        interestGroup2.setCodespace("http://uicds.org/interestgroup#incident");
        interestGroup2.setLabel("Incident Type");
        interestGroup2.setStringValue("hazmat");

        ShareRules.ShareRule.WorkProducts workProducts = shareRule2.addNewWorkProducts();
        CodespaceValueType type1 = workProducts.addNewType();
        type1.setCodespace("http://uicds.org/workproducts");
        type1.setLabel("Work Product Type");
        type1.setStringValue("incident");

        CodespaceValueType type2 = workProducts.addNewType();
        type2.setCodespace("http://uicds.org/workproducts");
        type2.setLabel("Work Product Type");
        type2.setStringValue("map");

        // System.out.println("\n\n");
        // System.out.println("Creating Agreement \n" + controlAgreement +
        // "\n");

        AgreementType createAgreement;
        try {
            createAgreement = agreementService.createAgreement(controlAgreement);
            // System.out.println("Returned Agreement \n" + createAgreement +
            // "\n");

            assertNotNull(createAgreement);
            assertEquals(controlAgreement.getPrincipals().getRemoteCore().getStringValue(),
                createAgreement.getPrincipals().getRemoteCore().getStringValue());
            assertEquals(controlAgreement.getPrincipals().getLocalCore().getStringValue(),
                createAgreement.getPrincipals().getLocalCore().getStringValue());
            assertEquals(controlAgreement.getShareRules().getEnabled(),
                createAgreement.getShareRules().getEnabled());

            // get it back
            AgreementType getAgreement = agreementService.getAgreement(controlAgreement.getPrincipals().getRemoteCore().getStringValue());

            ShareRules updatedRules = getAgreement.getShareRules();

            // disable rules
            updatedRules.setEnabled(false);

            // add a new rule
            ShareRules.ShareRule newRule = updatedRules.addNewShareRule();
            newRule.setId("3");
            newRule.setEnabled(false);
            ConditionType newCondition = newRule.addNewCondition();
            CodespaceValueType newInterestGroup = newCondition.addNewInterestGroup();
            newInterestGroup.setCodespace("http://uicds.org/interestgroup#incident");
            newInterestGroup.setLabel("Incident Type");
            newInterestGroup.setStringValue("criminal");

            ShareRules.ShareRule.WorkProducts newWorkProducts = newRule.addNewWorkProducts();
            CodespaceValueType newType = newWorkProducts.addNewType();
            newType.setCodespace("http://uicds.org/workproducts");
            newType.setLabel("Work Product Type");
            newType.setStringValue("incident");

            getAgreement.setShareRules(updatedRules);

            log.debug("\nModified Agreement\n" + getAgreement + "\n");

            log.debug("\nUpdating...\n");

            AgreementType updateAgreement = agreementService.updateAgreement(
                controlAgreement.getPrincipals().getRemoteCore().getStringValue(), getAgreement);

            log.debug("\nUpdated Agreement Response\n" + updateAgreement + "\n");

            assertNotNull(updateAgreement);
            assertEquals(getAgreement.getPrincipals().getRemoteCore().getStringValue(),
                updateAgreement.getPrincipals().getRemoteCore().getStringValue());
            assertEquals(getAgreement.getPrincipals().getLocalCore().getStringValue(),
                updateAgreement.getPrincipals().getLocalCore().getStringValue());
            assertEquals(false, updateAgreement.getShareRules().getEnabled());
            assertEquals(3, updateAgreement.getShareRules().sizeOfShareRuleArray());

            log.debug("\nResponse for Updated Agreement\n" + updateAgreement + "\n");

        } catch (UICDSException e) {
            fail("creating agreement: " + e.getMessage());
        }
    }

    private AgreementType createSimpleAgreement() {
        AgreementType controlAgreement;
        controlAgreement = AgreementType.Factory.newInstance();

        Principals principals = Principals.Factory.newInstance();
        IdentifierType localCoreID = IdentifierType.Factory.newInstance();
        localCoreID.setStringValue(localCore);
        // localCoreID.setLabel("Core JID");
        principals.setLocalCore(localCoreID);

        IdentifierType remoteCoreID = IdentifierType.Factory.newInstance();
        remoteCoreID.setStringValue(remoteCore);
        // remoteCoreID.setLabel("Core JID");
        principals.setRemoteCore(remoteCoreID);

        controlAgreement.setPrincipals(principals);

        ShareRules shareRules = ShareRules.Factory.newInstance();
        shareRules.setEnabled(true);

        controlAgreement.setShareRules(shareRules);

        return controlAgreement;
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
