package com.saic.uicds.core.em.service;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.XmlObject;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.uicds.incident.IncidentDocument;
import org.uicds.incident.UICDSIncidentType;
import org.w3c.dom.Node;

import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.saic.uicds.core.em.controller.FeatureWmsController;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.service.impl.WorkProductServiceImpl;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.usersmarts.cx.wms.WMC;
import com.usersmarts.pub.atom.Feed;
import com.usersmarts.pub.atom.xml.AtomModule;
import com.usersmarts.util.DOMUtils;
import com.usersmarts.xmf2.MarshalContext;

/**
 * FeatureWorkProductTest
 * 
 * @author Patrick Neal - Image Matters, LLC
 * @package com.saic.dctd.uicds.core.service
 * @created Jan 7, 2009
 */
@Ignore
public class FeatureWorkProductTest
    extends AbstractXmldbJpaTests {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    WorkProductService wps;

    @Autowired
    IncidentManagementService ims;

    @Autowired
    MapService map;

    FeatureWmsController wms;

    @Override
    protected void onSetUpBeforeTransaction() throws Exception {

        super.onSetUpBeforeTransaction();
        wms = new FeatureWmsController();
        wms.setWorkProductService(wps);
    }

    @Test
    public void testFeatures() throws Exception {

        InputStream in = new FileInputStream("src/test/resources/workproduct/features.xml");
        MarshalContext ctx = new MarshalContext(AtomModule.class);
        Object feed = ctx.marshal(in);
        assertTrue(feed instanceof Feed);
        assertFalse(((Feed) feed).getEntries().isEmpty());

        String incidentId = getIncident();
        String firstFeature = null;

        for (Object entry : ((Feed) feed).getEntries()) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ctx.marshal(entry, out);
            byte[] bytes = out.toByteArray();
            out.close();

            WorkProduct wp = new WorkProduct();
            wp.setProduct(XmlObject.Factory.parse(new String(bytes)));
            wp.setProductType("Feature");
            wp.setCreatedDate(new Date());
            wp.setCreatedBy("test@"
                + ((WorkProductServiceImpl) wps).getDirectoryService().getCoreName());
            wp.setMimeType("application/atom+xml");

            String id = wps.publishProduct(wp).getProduct().getProductID();
            assertNotNull(id);
            if (firstFeature == null) {
                firstFeature = id;
            }

            assertNotNull(wps.getProduct(id));
            wps.associateWorkProductToInterestGroup(id, incidentId);
        }

        // rendering
        MockHttpServletRequest req = new MockHttpServletRequest("GET", "api/" + incidentId
            + "/features");
        req.setPathInfo("api/" + incidentId + "/features");
        req.setParameter("bbox", "-96.0,37.0,-93.0,40.0");
        req.setParameter("width", "600");
        req.setParameter("height", "500");
        req.setParameter("srs", "EPSG:4326");
        req.setParameter("selected", firstFeature);
        MockHttpServletResponse resp = new MockHttpServletResponse();
        ModelAndView mav = wms.handleRequest(req, resp);
        Object result = mav.getModel().get("output");
        assertNotNull(result);
        assertTrue(result instanceof Image);
        // ImageIO.write((RenderedImage)result, "png", new FileOutputStream("target/features.png"));

    }

    @Test
    public void testShapefileRender() throws Exception {

        // insert parent incident first
        String incidentId = getIncident();
        assertNotNull(incidentId);

        // insert shapefile
        InputStream in = new FileInputStream(
            "src/test/resources/workproduct/IMAACexample_shape.shz");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(in, out);
        byte[] bytes = out.toByteArray();
        in.close();
        out.close();
        List<ProductPublicationStatus> statObjs = map.submitShapefile(incidentId, bytes);
        assertFalse(statObjs.isEmpty());

        List<String> ids = new ArrayList<String>();
        for (ProductPublicationStatus statObj : statObjs) {
            ids.add(statObj.getProduct().getProductID());
        }
        // parse layer name from layer so we can request it
        String layerId = ids.get(ids.size() - 1); // last id is the layer id
        Node layer = map.getLayer(layerId);
        String layerName = DOMUtils.getChildText(layer, WMC.NAME, null);

        // render shapefile layer
        MockHttpServletRequest req = new MockHttpServletRequest("GET", "api/" + incidentId
            + "/features");
        req.setPathInfo("api/" + incidentId + "/features");
        req.setParameter("bbox", "-96.0,37.0,-93.0,40.0");
        req.setParameter("width", "600");
        req.setParameter("height", "500");
        req.setParameter("srs", "EPSG:4326");
        req.setParameter("layers", layerName);
        MockHttpServletResponse resp = new MockHttpServletResponse();
        ModelAndView mav = wms.handleRequest(req, resp);
        Object result = mav.getModel().get("output");
        assertNotNull(result);
        assertTrue(result instanceof Image);
    }

    protected String getIncident() throws Exception {

        String alertEvent = "a test alert event";
        String alertHeadline = "a test alert headline";
        String alertIdentifier = "identifier";
        String alertSender = "sender";
        String alertAddress = "Mile marker 138";
        Calendar alertSent = new GregorianCalendar();

        // Create an alert to publish
        Alert alert = Alert.Factory.newInstance();
        alert.setIdentifier(alertIdentifier);
        alert.setSender(alertSender);
        alert.setSent(alertSent);
        alert.setMsgType(Alert.MsgType.ALERT);
        alert.setStatus(Alert.Status.ACTUAL);
        alert.setScope(Alert.Scope.PUBLIC);
        alert.setAddresses(alertAddress);
        Info info = alert.addNewInfo();
        Alert.Info.Category.Enum categoryArray[] = new Alert.Info.Category.Enum[1];
        categoryArray[0] = Alert.Info.Category.CBRNE;
        info.setCategoryArray(categoryArray);
        info.setEvent(alertEvent);
        EventCode event = info.addNewEventCode();
        event.setValue("value");
        event.setValueName("name");
        info.setSeverity(Alert.Info.Severity.MODERATE);
        info.setCertainty(Alert.Info.Certainty.LIKELY);
        info.setHeadline(alertHeadline);
        info.setUrgency(Alert.Info.Urgency.EXPECTED);

        ProductPublicationStatus status = ims.createIncidentFromCap(alert);

        WorkProduct wp = wps.getProduct(status.getProduct().getProductID());
        IncidentDocument persistedIncidentDoc = (IncidentDocument) wp.getProduct();
        UICDSIncidentType incident = persistedIncidentDoc.getIncident();
        return getIncidentID(incident);
    }

    private String getIncidentID(UICDSIncidentType incident) {

        String incidentID = null;
        if (incident.sizeOfActivityIdentificationArray() > 0) {
            if (incident.getActivityIdentificationArray(0).sizeOfIdentificationIDArray() > 0) {
                incidentID = incident.getActivityIdentificationArray(0).getIdentificationIDArray(0).getStringValue().trim();
            }
        }
        return incidentID;
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
