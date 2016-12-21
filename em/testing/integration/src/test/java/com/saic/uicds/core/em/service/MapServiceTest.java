/*
 * -------------------------- HEADER ------------------------
 */
package com.saic.uicds.core.em.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import net.opengis.context.ViewContextDocument;

import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.springframework.transaction.annotation.Transactional;
import org.uicds.incident.IncidentDocument;
import org.uicds.incident.UICDSIncidentType;
import org.uicds.workProductService.WorkProductPublicationResponseType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.usersmarts.cx.wms.WMC;
import com.usersmarts.jts.GeoGeometryFactory;
import com.usersmarts.util.Coerce;
import com.usersmarts.util.DOMUtils;
import com.usersmarts.util.StringUtils;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.geom.Geometry;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument;
import com.saic.uicds.core.em.dao.IncidentDAO;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.ConfigurationService;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ConfigurationServiceImpl;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

/**
 * MapServiceTest
 * 
 * @author Patrick Neal - Image Matters, LLC created: Nov 10, 2008 package:
 *         com.saic.dctd.uicds.core.service
 */
public class MapServiceTest extends AbstractXmldbJpaTests {

    @Autowired
    MapService mapService;

    @Autowired
    IncidentManagementService ims;

    @Autowired
    IncidentDAO incidentDAO;

    @Autowired
    WorkProductService productService;

    @Autowired
    ConfigurationService configurationService;

    public static final String NS_PRECIS_STRUCTURES = "http://www.saic.com/precis/2009/06/structures";

    @Test
    @Transactional
    public void testMapCRUD() throws Exception {

        Node map = getXMLResource("src/test/resources/map/view-context.xml");
        assertNotNull(map);

        String incidentId = getIncident();

        // test creation
        ProductPublicationStatus status = mapService.createMap(incidentId, map);
        assertNotNull(status);

        // test retrieval (single)
        assertNotNull(mapService.getMap(status.getProduct().getProductID()));

        // test retrieval (all)
        assertFalse(mapService.getMaps(incidentId).isEmpty());

        // test update
        ((Element) map).setAttribute("version", "1.1.2");

        // get the package id to update
        WorkProductPublicationResponseType sd = WorkProductHelper.toWorkProductPublicationResponse(status);
        IdentificationType id = WorkProductHelper.getIdentificationElement(sd.getWorkProduct());
        Document doc = getDOMDocumentFromXmlObject(id);

        status = mapService.updateMap(doc.getDocumentElement(), map);

        // get new package id for the update
        sd = WorkProductHelper.toWorkProductPublicationResponse(status);
        id = WorkProductHelper.getIdentificationElement(sd.getWorkProduct());
        doc = getDOMDocumentFromXmlObject(id);

        // System.out.println(DOMUtils.toString(doc));
        // WorkProductDocument wp =
        // WorkProductDocument.Factory.parse(mapService.getMap(doc.getDocumentElement()));

        Node response = mapService.getMap(doc.getDocumentElement());
        // System.out.println("map response: "+DOMUtils.toString(response));
        Node sp = DOMUtils.getChild(response, new QName("ulex:message:structure:1.0",
            "StructuredPayload"));
        assertNotNull(sp);
        // Node vc = DOMUtils.getChild(sp, new
        // QName("http://www.opengis.net/context","ViewContext"));
        Node vc = DOMUtils.getChild(sp, WMC.VIEW_CONTEXT);

        assertNotNull(vc);
        // System.out.println(DOMUtils.toString(vc));
        String newVersion = ((Element) vc).getAttribute("version");
        assertEquals("Map was not updated", "1.1.2", newVersion);

        // test delete
        status = mapService.deleteMap(incidentId, status.getProduct().getProductID());
        assertNotNull("map delete returned null", status);
        // TODO - WorkProductXMLDBDAO line 132 query failed.
        assertEquals("map delete not sucessful", ProductPublicationStatus.SuccessStatus,
            status.getStatus());
        Node result = mapService.getMap(doc.getDocumentElement());
        // it's not deleted, it's just marked as inactive
        assertNull("Map was not properly deleted", result);
    }

    private Document getDOMDocumentFromXmlObject(XmlObject object)
        throws ParserConfigurationException, SAXException, IOException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        XmlOptions xo = new XmlOptions();
        xo.setSaveOuter();
        Document doc = db.parse(object.newInputStream(xo));
        return doc;
    }

    @Test
    @Transactional
    public void testLayerCRUD() throws Exception {

        Node layer = getXMLResource("src/test/resources/map/layer.xml");
        assertNotNull(layer);

        String incidentId = getIncident();

        // test creation
        ProductPublicationStatus status = mapService.createLayer(incidentId, layer);
        assertNotNull(status);

        // test retrieval (single)
        assertNotNull(mapService.getLayer(status.getProduct().getProductID()));

        // test retrieval (all)
        assertFalse(mapService.getLayers(incidentId).isEmpty());

        // test update
        // get the package id to update
        WorkProductPublicationResponseType sd = WorkProductHelper.toWorkProductPublicationResponse(status);
        IdentificationType id = WorkProductHelper.getIdentificationElement(sd.getWorkProduct());
        Document doc = getDOMDocumentFromXmlObject(id);

        ((Element) layer).setAttribute("hidden", "1");
        status = mapService.updateLayer(doc.getDocumentElement(), layer);

        // String hidden = ((Element) mapService.getLayer(incidentId,
        // status.getProduct().getProductID())).getAttribute("hidden");

        Node response = mapService.getLayer(status.getProduct().getProductID());
        // System.out.println("Layer response: "+DOMUtils.toString(response));
        WorkProductDocument wpd = WorkProductDocument.Factory.parse(response);
        // System.out.println("SP: "+wpd.getWorkProduct().getStructuredPayloadArray(0));
        // Even though the following getChild works fine for the map work product it won't work here
        // so I had to use the XmlBeans files to get the structured payload element.
        // Node sp = DOMUtils.getChild(response, new
        // QName("ulex:message:structure:1.0","StructuredPayload"));
        assertTrue(wpd.getWorkProduct().sizeOfStructuredPayloadArray() == 1);
        wpd.getWorkProduct().getStructuredPayloadArray(0).selectChildren(
            new QName("http://www.opengis.net/context", "Layer"));

        Node sp = wpd.getWorkProduct().getStructuredPayloadArray(0).getDomNode();
        assertNotNull(sp);
        Node vc = DOMUtils.getChild(sp, new QName("http://www.opengis.net/context", "Layer"));
        assertNotNull(vc);
        String hidden = ((Element) vc).getAttribute("hidden");
        assertEquals("1", hidden);

        // test delete
        String productID = status.getProduct().getProductID();
        status = mapService.deleteLayer(incidentId, status.getProduct().getProductID());
        assertNotNull("layer delete returned null", status);

        /*
         * TODO - ddh - WorkProductService.deleteProduct failed.
         * assertEquals("layer delete not successful", ProductPublicationStatus.SuccessStatus,
         * status.getStatus()); // it's not deleted, it's just marked as inactive
         * assertNull(status.getProduct()); assertNull(mapService.getLayer(productID));
         */

    }

    @Test
    @Transactional
    public void testShapefileSubmission() throws Exception {

        InputStream in = new FileInputStream(
            "src/test/resources/workproduct/IMAACexample_shape.shz");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(in, out);
        byte[] bytes = out.toByteArray();
        in.close();
        out.close();
        List<ProductPublicationStatus> statusObjs = mapService.submitShapefile(getIncident(), bytes);
        assertFalse(statusObjs.isEmpty());
        assertEquals(5, statusObjs.size()); // 1 shp, 3 features, 1 layer
    }

    @Test
    @Transactional
    public void testCreateDefaultMap() throws Exception {

        // insert incident using IMS, this should notify map service
        // who will create a default map
        ProductPublicationStatus status = ims.createIncidentFromCap(createAlertAdapter());
        assertNotNull(status.getProduct().getProductID());
        IncidentDocument incidentDoc = (IncidentDocument) status.getProduct().getProduct();
        // System.out.println(incidentDoc);
        String incidentId = getIncidentID(incidentDoc.getIncident());
        Collection<WorkProduct> maps = mapService.getMaps(incidentId);
        assertFalse(maps.isEmpty());
        WorkProduct mapProduct = maps.iterator().next(); // get first map
        ViewContextDocument vc = (ViewContextDocument) mapProduct.getProduct();
        Element mapEl = coerce(vc);

        assertNotNull(mapEl);
        assertEquals(WMC.VIEW_CONTEXT, DOMUtils.getName(mapEl));
        assertNotNull(mapEl.getAttribute("id")); // should have valid identifier
        assertFalse(mapEl.hasAttribute("collectionId")); // should not have non-schema attributes
        Element gen = DOMUtils.getChild(mapEl, WMC.GENERAL);
        assertNotNull(gen);
        Element bbox = DOMUtils.getChild(gen, WMC.BOUNDING_BOX);
        assertNotNull(bbox);
        assertTrue(bbox.hasAttribute("SRS"));
        Element win = DOMUtils.getChild(gen, WMC.WINDOW);
        assertNotNull(win);
        assertFalse(StringUtils.isEmpty(win.getAttribute("width"))); // must have dimensions
        // specified
        assertFalse(StringUtils.isEmpty(win.getAttribute("height"))); //
        assertFalse(win.getAttribute("width").contains("\\.")); // dimensions must be integers
        assertFalse(win.getAttribute("height").contains("\\.")); //
        Element keys = DOMUtils.getChild(gen, WMC.KEYWORD_LIST);
        assertNotNull(keys);
        assertEquals(3, DOMUtils.getChildren(keys, WMC.KEYWORD).size());
        Element ll = DOMUtils.getChild(mapEl, WMC.LAYER_LIST);
        assertNotNull(ll);
        for (Element l : DOMUtils.getChildren(ll, WMC.LAYER)) {
            assertFalse(l.hasAttribute("opacity")); // should not have non-schema attributes
            assertFalse(l.hasAttribute("proxied")); // should not have non-schema attributes
            assertTrue(l.hasAttribute("queryable"));
            assertTrue(l.hasAttribute("hidden"));
            Element s = DOMUtils.getChild(l, WMC.SERVER);
            assertEquals("OGC:WMS", s.getAttribute("service"));
            assertEquals("1.1.0", s.getAttribute("version"));
        }
    }

    @Test
    @Transactional
    public void testCreateDefaultMap2() throws Exception {

        ((ConfigurationServiceImpl) configurationService).setBaseURL("http://localhost:8080/uicds/ws");

        File file = new File("src/test/resources/incident.xml");
        IncidentDocument wpIncidentDoc = IncidentDocument.Factory.parse(file);
        UICDSIncidentType incident = wpIncidentDoc.getIncident();
        assertNotNull(incident);

        // create circle geometry so we can compare with resulting default map
        GeoGeometryFactory factory = new GeoGeometryFactory();
        Geometry geometry = factory.createCircle(factory.createPoint(new Coordinate(-75.0, 36.0)),
            5.0);
        Envelope envelope = geometry.getEnvelopeInternal();

        // create incident; should auto fire default map creation
        String wpId = ims.createIncident(incident).getProduct().getProductID();
        assertNotNull(wpId);

        WorkProduct wp = productService.getProduct(wpId);
        IncidentDocument incidentDoc = (IncidentDocument) wp.getProduct();
        String incidentId = getIncidentID(incidentDoc.getIncident());

        // request list of maps for new incident (should be only one at this point)
        Collection<WorkProduct> maps = mapService.getMaps(incidentId);
        assertFalse(maps.isEmpty());
        WorkProduct mapProduct = maps.iterator().next(); // get first map
        ViewContextDocument vc = (ViewContextDocument) mapProduct.getProduct();
        Element mapEl = coerce(vc);

        Element gen = DOMUtils.getChild(mapEl, WMC.GENERAL);
        assertNotNull(gen);
        Element bbox = DOMUtils.getChild(gen, WMC.BOUNDING_BOX);
        assertNotNull(bbox);
        assertEquals(envelope.getMinX(), Coerce.toDouble(bbox.getAttribute("minx")), 0.00005);
        assertEquals(envelope.getMinY(), Coerce.toDouble(bbox.getAttribute("miny")), 0.00005);
        assertEquals(envelope.getMaxX(), Coerce.toDouble(bbox.getAttribute("maxx")), 0.00005);
        assertEquals(envelope.getMaxY(), Coerce.toDouble(bbox.getAttribute("maxy")), 0.00005);

    }

    protected Node getXMLResource(String fileName) throws Exception {

        InputStream in = new FileInputStream(fileName);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(in);
        return document.getDocumentElement();
    }

    private Alert createAlertAdapter() {

        // Create an alert to publish
        Alert alert = Alert.Factory.newInstance();
        alert.setIdentifier("blah");
        alert.setSender("sender");
        alert.setSent(Calendar.getInstance());
        alert.setMsgType(Alert.MsgType.ALERT);
        alert.setStatus(Alert.Status.ACTUAL);
        alert.setScope(Alert.Scope.PUBLIC);
        alert.setAddresses("address");
        Info info = alert.addNewInfo();
        Alert.Info.Category.Enum categoryArray[] = new Alert.Info.Category.Enum[1];
        categoryArray[0] = Alert.Info.Category.CBRNE;
        info.setCategoryArray(categoryArray);
        info.setEvent("event");
        EventCode event = info.addNewEventCode();
        event.setValue("value");
        event.setValueName("name");
        info.setSeverity(Alert.Info.Severity.MODERATE);
        info.setCertainty(Alert.Info.Certainty.LIKELY);
        info.setHeadline("headline");
        info.setDescription("description");
        info.setUrgency(Alert.Info.Urgency.EXPECTED);
        info.addNewArea().addPolygon("38.8,-77.3 38.8,-77.1 39.0,-77.1 39.0,-77.3 38.8,-77.3");
        info.getAreaArray(0).addCircle("38.8,-77.1 1.0");

        return alert;
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

        ProductPublicationStatus response = ims.createIncidentFromCap(alert);

        WorkProduct wp = productService.getProduct(response.getProduct().getProductID());
        IncidentDocument persistedIncidentDoc = (IncidentDocument) wp.getProduct();
        UICDSIncidentType incident = persistedIncidentDoc.getIncident();

        String incidentID = getIncidentID(incident);
        return incidentID;
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

    protected Element coerce(XmlObject obj) throws Exception {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(obj.newInputStream());
        return document.getDocumentElement();
    }

}
