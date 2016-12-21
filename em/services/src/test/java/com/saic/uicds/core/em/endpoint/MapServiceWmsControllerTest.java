package com.saic.uicds.core.em.endpoint;

import java.io.FileInputStream;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.saic.uicds.core.em.controller.MapServiceWmsController;
import com.saic.uicds.core.em.service.MapService;
import com.usersmarts.cx.ows.api.GetCapabilitiesResponse;
import com.usersmarts.util.DOMUtils;

/**
 * FeatureWmsControllerTest
 * 
 * @author Patrick Neal - Image Matters, LLC
 * @package com.saic.dctd.uicds.core.endpoint
 * @created Feb 18, 2009
 */
public class MapServiceWmsControllerTest extends Assert {

    MapServiceWmsController endpoint = new MapServiceWmsController();
    MapService service;
    String path = "src/test/resources/maps/";

    @Before
    public void setUp() throws Exception {
        service = org.easymock.EasyMock.createMock(MapService.class);
        endpoint.setMapService(service);
    }

    @Test
    public void renderMapServices() throws Exception {

        Document document = DOMUtils.parseDocument(new FileInputStream(
                "src/test/resources/maps/view-context.xml"));
        Node node = document.getDocumentElement();

        EasyMock.expect(service.getMap("test")).andReturn(node);
        EasyMock.replay(service);

        MockHttpServletRequest request = new MockHttpServletRequest("GET", "api/maps/test");
        request.setPathInfo("api/maps/test");
        request.setParameter("request", "GetMap");
        request.setParameter("SRS", "EPSG:4326");
        request.setParameter("bbox", "-120.0,20.0,-66.0,50.0");
        request.setParameter("width", "500");
        request.setParameter("height", "500");
        request.setParameter("format", "image/png");
        request.setParameter("layers", "layers");
        MockHttpServletResponse response = new MockHttpServletResponse();
        ModelAndView mav = endpoint.handleRequest(request, response);
        assertNotNull(mav);
        assertNotNull(mav.getModelMap().get("output"));
    }
    
    @Test
    public void testCapabilities() throws Exception {

        Document document = DOMUtils.parseDocument(new FileInputStream(
                "src/test/resources/maps/view-context.xml"));
        Node node = document.getDocumentElement();

        EasyMock.expect(service.getMap("test")).andReturn(node);
        EasyMock.replay(service);

        MockHttpServletRequest request = new MockHttpServletRequest("GET", "api/maps/test");
        request.setPathInfo("api/maps/test");
        request.setParameter("request", "GetCapabilities");
        MockHttpServletResponse response = new MockHttpServletResponse();
        ModelAndView mav = endpoint.handleRequest(request, response);
        assertNotNull(mav);
        Object output = mav.getModel().get("output");
        assertNotNull(output);
        assertTrue(output instanceof GetCapabilitiesResponse);
    }
    
}
