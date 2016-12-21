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

public class RescindAgreementTest extends AbstractXmldbJpaTests {
    Logger log = LoggerFactory.getLogger(RescindAgreementTest.class);

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
    public void testRescindAgreement() {

        AgreementType controlAgreement = null;

        controlAgreement = AgreementType.Factory.newInstance();

        Principals principals = Principals.Factory.newInstance();
        IdentifierType localCoreID = IdentifierType.Factory.newInstance();
        localCoreID.setStringValue(localCore);
        principals.setLocalCore(localCoreID);

        IdentifierType remoteCoreID = IdentifierType.Factory.newInstance();
        remoteCoreID.setStringValue(remoteCore);
        principals.setRemoteCore(remoteCoreID);

        controlAgreement.setPrincipals(principals);

        ShareRules shareRules = ShareRules.Factory.newInstance();
        shareRules.setEnabled(true);
        org.uicds.agreementService.AgreementType.ShareRules.ShareRule rule = shareRules.addNewShareRule();
        rule.setEnabled(true);
        CodespaceValueType condition = rule.addNewCondition().addNewInterestGroup();
        condition.setCodespace("codespace");
        condition.setStringValue("value");

        controlAgreement.setShareRules(shareRules);

        log.debug("\n\n");

        log.debug("Creating Agreement \n" + controlAgreement + "\n");
        AgreementType createAgreement;
        try {
            createAgreement = agreementService.createAgreement(controlAgreement);
            log.debug("Response \n" + createAgreement + "\n");
            assertNotNull(createAgreement);

            log.debug("Getting Agreement for " + remoteCore);
            AgreementType getAgreement = agreementService.getAgreement(remoteCore);
            log.debug("Response \n" + getAgreement + "\n");
            assertNotNull(getAgreement);

            log.debug("Rescinding Agreement for " + remoteCore);
            String rescindAgreement = agreementService.rescindAgreement(controlAgreement.getPrincipals().getRemoteCore().getStringValue());
            log.debug("Response \n" + rescindAgreement + "\n");
            assertNotNull(rescindAgreement);
            assertEquals(controlAgreement.getPrincipals().getRemoteCore().getStringValue(),
                rescindAgreement);
        } catch (UICDSException e) {
            fail(e.getMessage());
        }

    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
