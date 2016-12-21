package com.saic.uicds.core.em.integration;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uicds.agreementService.AgreementType;
import org.uicds.agreementService.AgreementType.Principals;
import org.uicds.agreementService.AgreementType.ShareRules;

import com.saic.precis.x2009.x06.base.CodespaceValueType;
import com.saic.precis.x2009.x06.base.IdentifierType;
import com.saic.uicds.core.infrastructure.exceptions.UICDSException;
import com.saic.uicds.core.infrastructure.service.impl.AgreementServiceImpl;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class GetAgreementTest extends AbstractXmldbJpaTests {
    Logger log = LoggerFactory.getLogger(GetAgreementTest.class);

    AgreementServiceImpl agreementService;

    private static final String localCore = "uicds@localCore";
    private static final String remoteCore = "uicds@remoteCore";
    private static final String codespace = "http://uicds.org/interestgroup#incident";

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
    public void testGetAgreement() {

        AgreementType agreement = null;
        AgreementType controlAgreement = null;
        AgreementType testAgreement = null;
        int numberOfAgreements = 5;
        int controlAgreementID = 3;

        for (int i = 1; i <= numberOfAgreements; i++) {
            agreement = AgreementType.Factory.newInstance();

            Principals principals = Principals.Factory.newInstance();
            IdentifierType localCoreID = IdentifierType.Factory.newInstance();
            localCoreID.setStringValue(localCore + "-" + i);
            principals.setLocalCore(localCoreID);

            IdentifierType remoteCoreID = IdentifierType.Factory.newInstance();
            remoteCoreID.setStringValue(remoteCore + "-" + i);
            principals.setRemoteCore(remoteCoreID);

            agreement.setPrincipals(principals);

            ShareRules shareRules = ShareRules.Factory.newInstance();
            shareRules.setEnabled(false);
            org.uicds.agreementService.AgreementType.ShareRules.ShareRule rule = shareRules.addNewShareRule();
            rule.setEnabled(true);
            rule.setId("idvalue0");
            CodespaceValueType condition = rule.addNewCondition().addNewInterestGroup();
            condition.setCodespace(codespace);
            condition.setStringValue("Hazmat");

            rule = shareRules.addNewShareRule();
            rule.setEnabled(true);
            rule.setId("idvalue0");
            condition = rule.addNewCondition().addNewInterestGroup();
            condition.setCodespace(codespace);
            condition.setStringValue("CBRNE");

            rule = shareRules.addNewShareRule();
            rule.setEnabled(false);
            rule.setId("idvalue0");
            condition = rule.addNewCondition().addNewInterestGroup();
            condition.setCodespace(codespace);
            condition.setStringValue("traffic");

            agreement.setShareRules(shareRules);

            log.debug("\n\n");
            log.debug("Creating Agreement \n" + agreement + "\n");
            AgreementType createAgreement;
            try {
                createAgreement = agreementService.createAgreement(agreement);
                if (i == controlAgreementID) {
                    controlAgreement = createAgreement;
                }
            } catch (UICDSException e) {
                fail(e.getMessage());
            }

        }

        log.debug("Getting Agreement \n" + agreement + "\n");
        testAgreement = agreementService.getAgreement(remoteCore + "-" + controlAgreementID);

        assertNotNull(testAgreement);
        assertEquals(controlAgreement.getPrincipals().getRemoteCore().getStringValue(),
            testAgreement.getPrincipals().getRemoteCore().getStringValue());
        assertEquals(controlAgreement.getPrincipals().getLocalCore().getStringValue(),
            testAgreement.getPrincipals().getLocalCore().getStringValue());
        assertEquals(controlAgreement.getShareRules().getEnabled(),
            testAgreement.getShareRules().getEnabled());

    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
