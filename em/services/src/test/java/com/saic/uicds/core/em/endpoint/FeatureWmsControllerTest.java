package com.saic.uicds.core.em.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import com.saic.uicds.core.em.controller.FeatureWmsController;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.WorkProductService;

/**
 * FeatureWmsControllerTest
 * 
 * @author Patrick Neal - Image Matters, LLC
 * @package com.saic.dctd.uicds.core.endpoint
 * @created Feb 18, 2009
 */
public class FeatureWmsControllerTest extends Assert {

    FeatureWmsController endpoint = new FeatureWmsController();
    WorkProductService service;
    String path = "src/test/resources/maps/";

    @Before
    public void setUp() throws Exception {
        service = org.easymock.EasyMock.createMock(WorkProductService.class);
        endpoint.setWorkProductService(service);
    }

    @Test
    public void create() throws Exception {
        assertNotNull(service);
        assertNotNull(endpoint);
    }

    @Test
    public void renderFeatures() throws Exception {
        List<WorkProduct> products = new ArrayList<WorkProduct>();
        EasyMock.expect(service.findByInterestGroupAndType("test", "Feature")).andReturn(products);
        EasyMock.replay(service);

        MockHttpServletRequest request = new MockHttpServletRequest("GET", "api/test/features");
        request.setPathInfo("api/test/features");
        request.setParameter("request", "GetMap");
        request.setParameter("SRS", "EPSG:4326");
        request.setParameter("bbox", "-120.0,20.0,-66.0,50.0");
        request.setParameter("width", "500");
        request.setParameter("height", "500");
        request.setParameter("format", "image/png");
        MockHttpServletResponse response = new MockHttpServletResponse();
        ModelAndView mav = endpoint.handleRequest(request, response);
        assertNotNull(mav);
        assertNotNull(mav.getModelMap().get("output"));
    }

}
