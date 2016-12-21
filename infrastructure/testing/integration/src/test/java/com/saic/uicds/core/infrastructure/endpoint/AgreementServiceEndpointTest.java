package com.saic.uicds.core.infrastructure.endpoint;

import java.io.File;
import java.io.IOException;

import javax.xml.soap.SOAPException;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.agreementService.AgreementType;
import org.uicds.agreementService.AgreementType.ShareRules;
import org.uicds.agreementService.AgreementType.ShareRules.ShareRule;
import org.uicds.agreementService.CreateAgreementRequestDocument;
import org.uicds.agreementService.CreateAgreementResponseDocument;
import org.uicds.agreementService.GetAgreementListRequestDocument;
import org.uicds.agreementService.GetAgreementListResponseDocument;
import org.uicds.agreementService.GetAgreementRequestDocument;
import org.uicds.agreementService.GetAgreementResponseDocument;
import org.uicds.agreementService.UpdateAgreementRequestDocument;
import org.uicds.agreementService.UpdateAgreementResponseDocument;

import com.saic.precis.x2009.x06.base.CodespaceValueType;
import com.saic.uicds.core.infrastructure.exceptions.AgreementWithCoreExists;
import com.saic.uicds.core.infrastructure.exceptions.MissingConditionInShareRuleException;
import com.saic.uicds.core.infrastructure.exceptions.MissingShareRulesElementException;
import com.saic.uicds.core.infrastructure.util.ValidationUtil;

public class AgreementServiceEndpointTest
    extends AbstractJpaTests {

    Logger log = LoggerFactory.getLogger(getClass());

    final String IG_CODESPACE = "http://uicds.org/interestgroup#incident";

    @Autowired
    AgreementServiceEndpoint agreementServiceEndpoint;

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-ED-dataSrcContext.xml",
            "classpath:contexts/test-spring-ws-infra-servlet.xml" };
    }

    @Test
    public void testCreateAgreementNoRules() {

        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementNoRule.xml"));
            try {
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                fail(e.getMessage());
            } catch (MissingShareRulesElementException e) {
                fail(e.getMessage());
            }
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUpdateByAddingRule() {

        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementNoRule.xml"));
            try {
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
                assertNotNull(response.getCreateAgreementResponse().getAgreement().getShareRules());
                assertEquals(
                    0,
                    response.getCreateAgreementResponse().getAgreement().getShareRules().sizeOfShareRuleArray());

                UpdateAgreementRequestDocument updateRequest = createUpdateFromCreate(request);
                addRule(updateRequest.getUpdateAgreementRequest().getAgreement(), "CBRNE");
                UpdateAgreementResponseDocument updateResponse = agreementServiceEndpoint.updateAgreement(updateRequest);
                assertNotNull(updateResponse);
                assertNotNull(updateResponse.getUpdateAgreementResponse().getAgreement());
                assertNotNull(updateResponse.getUpdateAgreementResponse().getAgreement().getShareRules());
                assertEquals(
                    1,
                    updateResponse.getUpdateAgreementResponse().getAgreement().getShareRules().sizeOfShareRuleArray());
                // System.out.println(updateResponse);

            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                fail(e.getMessage());
            } catch (MissingShareRulesElementException e) {
                fail(e.getMessage());
            }
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testCreateAgreementOneRule() {

        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementOneRule.xml"));
            try {
                // System.out.println(request);
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                // System.out.println(response);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                fail(e.getMessage());
            } catch (MissingShareRulesElementException e) {
                fail(e.getMessage());
            }
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUpdateModifyingOneRule() throws SOAPException {

        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementOneRule.xml"));
            try {
                // System.out.println(request);
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                // System.out.println(response);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
                assertNotNull(response.getCreateAgreementResponse().getAgreement().getShareRules());
                assertEquals(
                    1,
                    response.getCreateAgreementResponse().getAgreement().getShareRules().sizeOfShareRuleArray());

                // GetAgreementListRequestDocument r =
                // GetAgreementListRequestDocument.Factory.newInstance();
                // r.addNewGetAgreementListRequest();
                // GetAgreementListResponseDocument rs =
                // agreementServiceEndpoint.getAgreementList(r);
                // System.out.println(rs);
                //
                GetAgreementRequestDocument ar = GetAgreementRequestDocument.Factory.newInstance();
                ar.addNewGetAgreementRequest().setCoreID(
                    request.getCreateAgreementRequest().getAgreement().getPrincipals().getRemoteCore().getStringValue());
                GetAgreementResponseDocument arr = agreementServiceEndpoint.getAgreement(ar);
                assertNotNull("no agreement found", arr.getGetAgreementResponse().getAgreement());
                ShareRules shareRules = arr.getGetAgreementResponse().getAgreement().getShareRules();
                assertEquals("wrong # rules", 1, shareRules.sizeOfShareRuleArray());
                ShareRule shareRule = shareRules.getShareRuleArray(0);
                assertNotNull("null share rule", shareRule);
                assertNotNull("null condition", shareRule.getCondition());
                assertEquals("wrong value", "CBRNE",
                    shareRule.getCondition().getInterestGroup().getStringValue());

                // System.out.println(arr);

                // System.out.println("UPDATE");
                UpdateAgreementRequestDocument updateRequest = createUpdateFromCreate(request);
                updateRequest.getUpdateAgreementRequest().getAgreement().getShareRules().getShareRuleArray(
                    0).setEnabled(false);
                // System.out.println(updateRequest);
                UpdateAgreementResponseDocument updateResponse = agreementServiceEndpoint.updateAgreement(updateRequest);
                // System.out.println(updateResponse);
                assertNotNull(updateResponse);
                assertNotNull(updateResponse.getUpdateAgreementResponse().getAgreement());
                assertNotNull(updateResponse.getUpdateAgreementResponse().getAgreement().getShareRules());
                assertEquals(
                    1,
                    updateResponse.getUpdateAgreementResponse().getAgreement().getShareRules().sizeOfShareRuleArray());
                assertFalse(updateResponse.getUpdateAgreementResponse().getAgreement().getShareRules().getShareRuleArray(
                    0).getEnabled());

            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                fail(e.getMessage());
            } catch (MissingShareRulesElementException e) {
                fail(e.getMessage());
            }
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUpdateModifyingOneRuleFromFile() {

        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementOneRule.xml"));
            try {
                // System.out.println(request);
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                // System.out.println(response);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
                assertNotNull(response.getCreateAgreementResponse().getAgreement().getShareRules());
                assertEquals(
                    1,
                    response.getCreateAgreementResponse().getAgreement().getShareRules().sizeOfShareRuleArray());

                UpdateAgreementRequestDocument updateRequest = UpdateAgreementRequestDocument.Factory.parse(new File(
                    "../data/UpdateAgreement.xml"));
                // System.out.println(updateRequest);
                UpdateAgreementResponseDocument updateResponse = agreementServiceEndpoint.updateAgreement(updateRequest);
                // System.out.println(updateResponse);
                assertNotNull(updateResponse);
                assertNotNull(updateResponse.getUpdateAgreementResponse().getAgreement());
                assertNotNull(updateResponse.getUpdateAgreementResponse().getAgreement().getShareRules());
                assertEquals(
                    1,
                    updateResponse.getUpdateAgreementResponse().getAgreement().getShareRules().sizeOfShareRuleArray());
                assertEquals(
                    "ENV",
                    updateResponse.getUpdateAgreementResponse().getAgreement().getShareRules().getShareRuleArray(
                        0).getCondition().getInterestGroup().getStringValue());

            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                fail(e.getMessage());
            } catch (MissingShareRulesElementException e) {
                fail(e.getMessage());
            }
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testCreateAgreementMultiRules() {

        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementMultiRules.xml"));
            try {
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                fail(e.getMessage());
            } catch (MissingShareRulesElementException e) {
                fail(e.getMessage());
            }
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test(expected = AgreementWithCoreExists.class)
    public void testCreateAgreementMultipleSameRemote() {

        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementNoRule.xml"));
            try {
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                fail(e.getMessage());
            } catch (MissingShareRulesElementException e) {
                fail(e.getMessage());
            }
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementOneRule.xml"));
            try {
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                ;
            } catch (MissingShareRulesElementException e) {
                fail(e.getMessage());
            }
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testGetAgreement() {

        GetAgreementRequestDocument request = GetAgreementRequestDocument.Factory.newInstance();
        request.addNewGetAgreementRequest().setCoreID("uicds@somewhere.saic.com");
        try {
            GetAgreementResponseDocument response = agreementServiceEndpoint.getAgreement(request);
            log.debug("Agreement: " + response.xmlText());
        } catch (SOAPException e) {
            log.debug(e.getMessage());
        }
    }

    @Test
    public void testGetListWithNoArguments() {

        GetAgreementListRequestDocument request = GetAgreementListRequestDocument.Factory.newInstance();
        GetAgreementListResponseDocument response = agreementServiceEndpoint.getAgreementList(request);
        assertNotNull(response);
    }

    private void addRule(AgreementType agreementType, String incidentType) {

        ShareRules rules = agreementType.getShareRules();
        if (rules == null) {
            rules = agreementType.addNewShareRules();
        }
        ShareRule rule = rules.addNewShareRule();
        rule.setEnabled(true);
        rule.setId("1");
        CodespaceValueType interestGroup = rule.addNewCondition().addNewInterestGroup();
        interestGroup.setCodespace(IG_CODESPACE);
        interestGroup.setStringValue(incidentType);
    }

    private UpdateAgreementRequestDocument createUpdateFromCreate(
        CreateAgreementRequestDocument createRequest) {

        UpdateAgreementRequestDocument request = UpdateAgreementRequestDocument.Factory.newInstance();
        request.addNewUpdateAgreementRequest();
        request.getUpdateAgreementRequest().setAgreement(
            createRequest.getCreateAgreementRequest().getAgreement());

        return request;
    }

}
