package com.saic.uicds.core.em.controller;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.oxm.support.MarshallingView;
import org.springframework.test.jpa.AbstractJpaTests;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.usersmarts.util.DOMUtils;

import com.saic.uicds.core.em.scenarios.ScenarioA;
import com.saic.uicds.core.em.service.IncidentManagementService;
import com.saic.uicds.core.infrastructure.controller.WorkProductController;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class WorkProductControllerTest extends AbstractXmldbJpaTests {

    WorkProductController endpoint;

    @Autowired
    IncidentManagementService ims;

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    ScenarioA scenarioA;

    @Autowired
    WorkProductService service;

    @Autowired
    WorkProductService wps;

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml",
            "classpath:contexts/test-spring-ws-em-servlet.xml",
            "classpath:contexts/test-mvc-servlet.xml",
            "classpath:contexts/scenarios.xml" };
    }

    @Override
    protected void onSetUpInTransaction() throws Exception {
        super.onSetUpInTransaction();
        scenarioA.initialize();
    }

    protected byte[] getWorkProduct(QName rootName) throws Exception {
        Document document = DOMUtils.newDocument();
        Node root = DOMUtils.appendElement(document, rootName);
        return DOMUtils.toString(root).getBytes();
    }

    @Override
    protected void onSetUpBeforeTransaction() throws Exception {
        super.onSetUpBeforeTransaction();
        endpoint = new WorkProductController();
        endpoint.setWorkProductService(service);
    }

    public void testGetWorkProductFeed() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/api/workProducts/1");
        request.setParameter("id", scenarioA.getIncidentStatus().getProduct().getProductID());
        request.setParameter("view", "digest");
        MockHttpServletResponse response = new MockHttpServletResponse();
        ModelAndView mav = endpoint.handleRequest(request, response);
        assertEquals(200, response.getStatus());
        assertNotNull(mav);
        assertTrue(mav.getView() instanceof MarshallingView);
        assertNotNull(mav.getModel().get("digest"));
        mav.getView().render(mav.getModel(), request, response);
        String xml = response.getContentAsString();
        assertTrue(xml.contains("Digest"));
    }
}
