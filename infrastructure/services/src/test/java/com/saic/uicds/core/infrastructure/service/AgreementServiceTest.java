/**
 * 
 */
package com.saic.uicds.core.infrastructure.service;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.isA;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.reset;
import static org.easymock.EasyMock.verify;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.core.Message;
import org.springframework.integration.core.MessageChannel;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.agreementService.AgreementType;

import com.saic.uicds.core.infrastructure.dao.AgreementDAO;
import com.saic.uicds.core.infrastructure.exceptions.AgreementWithCoreExists;
import com.saic.uicds.core.infrastructure.exceptions.MissingConditionInShareRuleException;
import com.saic.uicds.core.infrastructure.exceptions.MissingShareRulesElementException;
import com.saic.uicds.core.infrastructure.model.Agreement;
import com.saic.uicds.core.infrastructure.model.CodeSpaceValueType;
import com.saic.uicds.core.infrastructure.service.impl.AgreementServiceImpl;
import com.saic.uicds.core.infrastructure.service.impl.ConfigurationServiceImpl;
import com.saic.uicds.core.infrastructure.util.AgreementTestUtils;

/**
 * @author roger
 * 
 */
public class AgreementServiceTest
    extends AbstractJpaTests {

    private static final String SHARE_RULE1_ID = "rule1";

    private static final String INCIDENT_WPTYPE = "Incident";

    private static final String LOCAL_CORE1 = "local_core1";

    private static final String REMOTE_CORE1 = "remote_core1";

    Logger log = LoggerFactory.getLogger(this.getClass());

    AgreementServiceImpl agreementService = new AgreementServiceImpl();

    // No need to mock this object's behavior since it just returns constants
    ConfigurationService configurationService = new ConfigurationServiceImpl();

    // Mock objects
    DirectoryService directoryService;
    AgreementDAO agreementDAO;
    MessageChannel agreementRosterChannel;

    // Test variables
    @Override
    public void onSetUp() {

        agreementService.setConfigurationService(configurationService);

        if (agreementDAO == null) {
            agreementDAO = org.easymock.EasyMock.createMock(AgreementDAO.class);
            agreementService.setDao(agreementDAO);
        }
        if (directoryService == null) {
            directoryService = org.easymock.EasyMock.createMock(DirectoryService.class);
            agreementService.setDirectoryService(directoryService);
        }
        if (agreementRosterChannel == null) {
            agreementRosterChannel = org.easymock.EasyMock.createMock(MessageChannel.class);
            agreementService.setAgreementRosterChannel(agreementRosterChannel);
        }
    }

    // Since we derived this test from AbstractJpaTests which derives from JUnits TestCase this
    // class will run like a JUnit 3 test so annotations are ignored.
    @Test(expected = com.saic.uicds.core.infrastructure.exceptions.MissingShareRulesElementException.class)
    public void testCreateWithNoShareRulesElement() throws Exception {

        // AgreementType agreement = AgreementType.Factory.newInstance();
        // agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCAL_CORE1);
        // agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTE_CORE1);

        AgreementType agreement = AgreementTestUtils.createAgreement();

        try {
            agreementService.createAgreement(agreement);
            fail("expected exception");
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            ;
        }
    }

    @Test
    public void testCreateWithNullLocalCore() {

        // test with non existent LocalCore element
        AgreementType agreement = AgreementType.Factory.newInstance();
        agreement.addNewPrincipals();
        agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTE_CORE1);
        agreement.addNewShareRules().setEnabled(true);
        agreement.getShareRules().setNil();

        try {
            agreementService.createAgreement(agreement);
            fail("expected exception");
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (IllegalArgumentException e) {
            ;
        }

        // test with existing LocalCore element but nil=true
        agreement.getPrincipals().addNewLocalCore().setStringValue(null);
        try {
            agreementService.createAgreement(agreement);
            fail("expected exception");
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (IllegalArgumentException e) {
            ;
        }

    }

    @Test
    public void testCreateWithNullRemoteCore() {

        // test with non existent RemoteCore element
        AgreementType agreement = AgreementType.Factory.newInstance();
        agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCAL_CORE1);
        agreement.addNewShareRules().setEnabled(true);
        agreement.getShareRules().setNil();

        try {
            agreementService.createAgreement(agreement);
            fail("expected exception");
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (IllegalArgumentException e) {
            ;
        }

        // test with existing RemoteCore but nil=true
        agreement.getPrincipals().addNewRemoteCore().setStringValue(null);
        try {
            agreementService.createAgreement(agreement);
            fail("expected exception");
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (IllegalArgumentException e) {
            ;
        }

    }

    @Test(expected = com.saic.uicds.core.infrastructure.exceptions.MissingConditionInShareRuleException.class)
    public void testCreateWithShareRuleWithNoCondition() throws Exception {

        // AgreementType agreement = AgreementType.Factory.newInstance();
        // agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCAL_CORE1);
        // agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTE_CORE1);
        AgreementType agreement = AgreementTestUtils.createAgreement();

        agreement.addNewShareRules().addNewShareRule().addNewWorkProducts().addNewType().setStringValue(
            INCIDENT_WPTYPE);
        agreement.getShareRules().getShareRuleArray(0).setEnabled(true);
        agreement.getShareRules().getShareRuleArray(0).setId(SHARE_RULE1_ID);

        try {
            agreementService.createAgreement(agreement);
            fail("expected exception");
        } catch (MissingConditionInShareRuleException e) {
            ;
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        }
    }

    @Test
    public void testCreateEnabledAgreementWithNoRulesNilSet() {

        reset(agreementDAO, agreementRosterChannel);

        // AgreementType agreement = AgreementType.Factory.newInstance();
        // agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCAL_CORE1);
        // agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTE_CORE1);
        AgreementType agreement = AgreementTestUtils.createAgreement();
        agreement.addNewShareRules().setEnabled(true);
        agreement.getShareRules().setNil();

        setupServiceForCORE1Agreement();

        replay(agreementDAO, agreementRosterChannel);

        try {
            agreementService.createAgreement(agreement);
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        }

        verify(agreementDAO, agreementRosterChannel);
    }

    @Test
    public void testCreateEnabledAgreementWithNoRulesAndRecind() {

        reset(agreementDAO, agreementRosterChannel);

        // AgreementType agreement = AgreementType.Factory.newInstance();
        // agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCAL_CORE1);
        // agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTE_CORE1);
        AgreementType agreement = AgreementTestUtils.createAgreement();
        agreement.addNewShareRules().setEnabled(true);

        setupServiceForCORE1Agreement();

        replay(agreementDAO, agreementRosterChannel);

        try {
            agreementService.createAgreement(agreement);
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        }

        verify(agreementDAO, agreementRosterChannel);

        reset(agreementDAO, agreementRosterChannel);
        setupServiceForCORE1AgreementRecind();
        replay(agreementDAO, agreementRosterChannel);
        agreementService.rescindAgreement(REMOTE_CORE1);
        verify(agreementDAO, agreementRosterChannel);
    }

    @Test(expected = com.saic.uicds.core.infrastructure.exceptions.AgreementWithCoreExists.class)
    public void testCreateADuplicateAgreement() {

        reset(agreementDAO, agreementRosterChannel);

        org.easymock.EasyMock.reset(agreementDAO);

        // AgreementType agreement = AgreementType.Factory.newInstance();
        // agreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCAL_CORE1);
        // agreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTE_CORE1);
        AgreementType agreement = AgreementTestUtils.createAgreement();
        agreement.addNewShareRules().setEnabled(true);

        setupServiceForCORE1Agreement();

        replay(agreementDAO, agreementRosterChannel);

        try {
            agreementService.createAgreement(agreement);
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            fail("unexpected exception " + e.getMessage());
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        }

        verify(agreementDAO, agreementRosterChannel);

        reset(agreementDAO);
        // return a not null so it looks like the agreement was found
        expect(agreementDAO.findByCoreID(REMOTE_CORE1)).andReturn(new Agreement());
        replay(agreementDAO);

        // AgreementType duplicateAgreement = AgreementType.Factory.newInstance();
        // duplicateAgreement.addNewPrincipals().addNewLocalCore().setStringValue(LOCAL_CORE1);
        // duplicateAgreement.getPrincipals().addNewRemoteCore().setStringValue(REMOTE_CORE1);
        AgreementType duplicateAgreement = AgreementTestUtils.createAgreement();
        duplicateAgreement.addNewShareRules().setEnabled(true);

        try {
            agreementService.createAgreement(agreement);
        } catch (MissingConditionInShareRuleException e) {
            fail("unexpected exception " + e.getMessage());
        } catch (AgreementWithCoreExists e) {
            ;
        } catch (MissingShareRulesElementException e) {
            fail("unexpected exception " + e.getMessage());
        }

        verify(agreementDAO);
    }

    private void setupServiceForCORE1Agreement() {

        Agreement agreementModel = new Agreement();
        agreementModel.setEnabled(true);
        CodeSpaceValueType localCSV = new CodeSpaceValueType();
        localCSV.setValue(LOCAL_CORE1);
        agreementModel.setLocalCore(localCSV);
        CodeSpaceValueType removeCSV = new CodeSpaceValueType();
        removeCSV.setValue(REMOTE_CORE1);
        agreementModel.setRemoteCore(removeCSV);
        expect(agreementDAO.makePersistent(isA(Agreement.class))).andReturn(agreementModel);
        expect(agreementDAO.findByCoreID(REMOTE_CORE1)).andReturn(null);
        expect(agreementRosterChannel.send(isA(Message.class))).andReturn(true);
    }

    private void setupServiceForCORE1AgreementRecind() {

        Agreement agreementModel = new Agreement();
        agreementModel.setEnabled(true);
        CodeSpaceValueType localCSV = new CodeSpaceValueType();
        localCSV.setValue(LOCAL_CORE1);
        agreementModel.setLocalCore(localCSV);
        CodeSpaceValueType removeCSV = new CodeSpaceValueType();
        removeCSV.setValue(REMOTE_CORE1);
        agreementModel.setRemoteCore(removeCSV);
        agreementDAO.makeTransient(isA(Agreement.class));
        expect(agreementDAO.findByCoreID(REMOTE_CORE1)).andReturn(agreementModel);
        expect(agreementRosterChannel.send(isA(Message.class))).andReturn(true);
    }
}
