package com.saic.uicds.core.infrastructure.service;

import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.agreementService.AgreementType;
import org.uicds.agreementService.ConditionType;
import org.uicds.agreementService.AgreementType.ShareRules;
import org.uicds.agreementService.AgreementType.ShareRules.ShareRule;

import com.saic.precis.x2009.x06.base.CodespaceValueType;
import com.saic.uicds.core.infrastructure.exceptions.AgreementWithCoreExists;
import com.saic.uicds.core.infrastructure.exceptions.MissingConditionInShareRuleException;
import com.saic.uicds.core.infrastructure.exceptions.MissingShareRulesElementException;
import com.saic.uicds.core.infrastructure.service.impl.AgreementServiceImpl;

public class AgreementServiceTest extends AbstractJpaTests {

    Logger log = LoggerFactory.getLogger(AgreementServiceTest.class);

    static final String LOCALCORE = "local";
    static final String REMOTECORE = "remote";
    static final String CODESPACE = "http://uicds.org#incident";
    static final String CODESPACE_VALUE = "Transport";

    @Autowired
    AgreementServiceImpl agreementService;

    @Test
    public void testAgreementCreation() {
        assertNotNull(agreementService);
    }

    @Test(expected = MissingConditionInShareRuleException.class)
    public void testMissingShareRule() {
        AgreementType agreement = AgreementType.Factory.newInstance();
        agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCALCORE);
        agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTECORE);

        agreement.addNewShareRules().addNewShareRule().setEnabled(true);

        AgreementType agreementResponse = null;
        try {
            agreementResponse = agreementService.createAgreement(agreement);
        } catch (MissingConditionInShareRuleException e) {
            ;
        } catch (AgreementWithCoreExists e) {
            fail(e.getMessage());
        } catch (MissingShareRulesElementException e) {
        	fail(e.getMessage());
		}
    }

    @Test
    public void testMissingShareRuleID() {
        AgreementType agreement = AgreementType.Factory.newInstance();
        agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCALCORE);
        agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTECORE);

        agreement.addNewShareRules().setEnabled(true);
        ShareRules shareRules = agreement.getShareRules();
        ShareRule rule = shareRules.addNewShareRule();
        rule.setEnabled(true);
        ConditionType condition = rule.addNewCondition();
        CodespaceValueType codespace = condition.addNewInterestGroup();
        codespace.setCodespace(CODESPACE);
        codespace.setStringValue(CODESPACE_VALUE);

        AgreementType agreementResponse = null;
        try {
            agreementResponse = agreementService.createAgreement(agreement);
            assertNotNull(agreementResponse);
            assertNotNull(agreementResponse.getShareRules());
            assertTrue(agreementResponse.getShareRules().sizeOfShareRuleArray() == 1);
            assertNotNull(agreementResponse.getShareRules().getShareRuleArray(0));
            assertEquals(AgreementServiceImpl.SHARE_RULE_ID_PREFIX + "0",
                agreementResponse.getShareRules().getShareRuleArray(0).getId());
        } catch (MissingConditionInShareRuleException e) {
            fail(e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail(e.getMessage());
        } catch (MissingShareRulesElementException e) {
        	fail(e.getMessage());
		}
    }

    @Test
    public void testCreateAgreement() {
        AgreementType agreement;
        try {
            agreement = createAndCheckAgreement();
            // System.out.println(agreement);
        } catch (MissingConditionInShareRuleException e) {
            fail(e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail(e.getMessage());
        } catch (MissingShareRulesElementException e) {
        	fail(e.getMessage());
		}
    }

    @Test(expected = AgreementWithCoreExists.class)
    public void testMultipleAgreementSameRemoteCore() {
        try {
            AgreementType agreement1 = createAndCheckAgreement();
        } catch (MissingConditionInShareRuleException e) {
            fail(e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail(e.getMessage());
        } catch (MissingShareRulesElementException e) {
        	fail(e.getMessage());
		}
        try {
            AgreementType agreement2 = createAndCheckAgreement();
            fail("Should have received AgreementWithCoreExists exception");
        } catch (MissingConditionInShareRuleException e) {
            fail(e.getMessage());
        } catch (AgreementWithCoreExists e) {
            ;
        } catch (MissingShareRulesElementException e) {
        	fail(e.getMessage());
		}

    }

    private AgreementType createAndCheckAgreement() throws MissingShareRulesElementException,
    	MissingConditionInShareRuleException,
        AgreementWithCoreExists {
        AgreementType agreement = AgreementType.Factory.newInstance();
        agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCALCORE);
        agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTECORE);

        agreement.addNewShareRules().setEnabled(true);
        ShareRules shareRules = agreement.getShareRules();
        ShareRule rule = shareRules.addNewShareRule();
        rule.setEnabled(true);
        rule.setId("1");
        ConditionType condition = rule.addNewCondition();
        CodespaceValueType codespace = condition.addNewInterestGroup();
        codespace.setCodespace(CODESPACE);
        codespace.setStringValue(CODESPACE_VALUE);

        AgreementType agreementResponse = null;
        agreementResponse = agreementService.createAgreement(agreement);
        assertNotNull(agreementResponse);
        assertNotNull(agreementResponse.getPrincipals());
        assertTrue(agreementResponse.getPrincipals().getLocalCore().getStringValue().equals(
            LOCALCORE));
        assertTrue(agreementResponse.getPrincipals().getRemoteCore().getStringValue().equals(
            REMOTECORE));
        assertEquals(1, agreementResponse.getShareRules().sizeOfShareRuleArray());

        // return agreementResponse;
        return agreementResponse;
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
