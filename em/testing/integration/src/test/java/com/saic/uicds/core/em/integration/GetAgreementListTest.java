package com.saic.uicds.core.em.integration;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uicds.agreementService.AgreementListType;
import org.uicds.agreementService.AgreementType;
import org.uicds.agreementService.AgreementType.Principals;
import org.uicds.agreementService.AgreementType.ShareRules;

import com.saic.precis.x2009.x06.base.CodespaceValueType;
import com.saic.precis.x2009.x06.base.IdentifierType;
import com.saic.uicds.core.infrastructure.exceptions.UICDSException;
import com.saic.uicds.core.infrastructure.service.impl.AgreementServiceImpl;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class GetAgreementListTest extends AbstractXmldbJpaTests {
    Logger log = LoggerFactory.getLogger(GetAgreementListTest.class);

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
    public void testGetAgreementList() {

        AgreementType agreement = null;
        AgreementListType testAgreementList = null;
        int numberOfAgreements = 5;

        for (int i = 1; i <= numberOfAgreements; i++) {
            agreement = null;
            agreement = AgreementType.Factory.newInstance();

            Principals principals = Principals.Factory.newInstance();
            IdentifierType localCoreID = IdentifierType.Factory.newInstance();
            localCoreID.setStringValue(localCore);
            principals.setLocalCore(localCoreID);

            IdentifierType remoteCoreID = IdentifierType.Factory.newInstance();
            remoteCoreID.setStringValue(remoteCore + "-" + i);
            principals.setRemoteCore(remoteCoreID);

            agreement.setPrincipals(principals);

            ShareRules shareRules = ShareRules.Factory.newInstance();
            shareRules.setEnabled(true);
            org.uicds.agreementService.AgreementType.ShareRules.ShareRule rule = shareRules.addNewShareRule();
            rule.setEnabled(true);
            CodespaceValueType condition = rule.addNewCondition().addNewInterestGroup();
            condition.setCodespace("codespace");
            condition.setStringValue("value");
            agreement.setShareRules(shareRules);

            log.debug("\n\n");
            log.debug("Creating Agreement \n" + agreement + "\n");
            AgreementType createAgreement;
            try {
                createAgreement = agreementService.createAgreement(agreement);
                assertNotNull(createAgreement);
            } catch (UICDSException e) {
                fail(e.getMessage());
            }

        }

        log.debug("Getting Agreement List \n");
        testAgreementList = agreementService.getAgreementList();

        log.debug("Retrieved Agreement List with " + testAgreementList.sizeOfAgreementArray()
            + " items \n");
        for (int i = 0; i < testAgreementList.sizeOfAgreementArray(); i++) {
            log.debug(testAgreementList.getAgreementArray(i) + "\n");
        }

        assertEquals("wrong number of agreements",numberOfAgreements,testAgreementList.sizeOfAgreementArray());

    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

}
