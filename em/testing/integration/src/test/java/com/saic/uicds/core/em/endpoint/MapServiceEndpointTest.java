package com.saic.uicds.core.em.endpoint;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.springframework.transaction.annotation.Transactional;
import org.uicds.incident.IncidentDocument;
import org.uicds.incident.UICDSIncidentType;
import org.uicds.mapService.GetLayerRequestDocument;
import org.uicds.mapService.GetMapRequestDocument;
import org.uicds.mapService.SubmitLayerResponseDocument;
import org.uicds.mapService.SubmitMapResponseDocument;
import org.uicds.mapService.UpdateLayerRequestDocument;
import org.uicds.mapService.UpdateLayerResponseDocument;
import org.uicds.mapService.UpdateMapRequestDocument;
import org.uicds.mapService.UpdateMapResponseDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import x1.oasisNamesTcEmergencyCap1.AlertDocument;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.usersmarts.util.DOMUtils;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.uicds.core.em.service.IncidentManagementService;
import com.saic.uicds.core.em.service.MapService;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

public class MapServiceEndpointTest extends AbstractXmldbJpaTests {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    WorkProductService wps;

    @Autowired
    IncidentManagementService ims;

    @Autowired
    MapService mapService;

    @Autowired
    MapServiceEndpoint mapServiceEndpoint;

    @Test
    @Transactional
    public void testLayers() throws Exception {

        assertNotNull(mapServiceEndpoint);
        String path = "src/test/resources/map/";
        MapService mapSvc = mapServiceEndpoint.getMapService();

        String incidentId = getIncident();

        // create new layer
        Node request = getRequestDocument(path + "request-submitlayer.xml", "SubmitLayerRequest",
            incidentId);
        Source result = mapServiceEndpoint.invoke(new DOMSource(request));
        assertNotNull(result);
        String response = toString(result);
        assertNotNull(response);
        SubmitLayerResponseDocument responseDoc = SubmitLayerResponseDocument.Factory.parse(response);
        IdentificationType id = WorkProductHelper.getIdentificationElement(responseDoc.getSubmitLayerResponse().getWorkProductPublicationResponse().getWorkProduct());
        String layerId = id.getIdentifier().getStringValue();

        // get new layer
        request = getRequestDocument(path + "request-getlayer.xml", "GetLayerRequest", incidentId);
        GetLayerRequestDocument r = GetLayerRequestDocument.Factory.parse(request);
        r.getGetLayerRequest().getWorkProductIdentification().getIdentifier().setStringValue(
            layerId);
        result = mapServiceEndpoint.invoke(new DOMSource(r.getDomNode()));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        assertTrue(response.contains("Layer"));

        // get all layers for incident
        request = getRequestDocument(path + "request-getlayers.xml", "GetLayersRequest", incidentId);
        result = mapServiceEndpoint.invoke(new DOMSource(request));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        assertTrue(response.contains("Layer"));

        // update layer
        request = getRequestDocument(path + "request-updatelayer.xml", "UpdateLayerRequest",
            incidentId);
        UpdateLayerRequestDocument ur = UpdateLayerRequestDocument.Factory.parse(request);
        ur.getUpdateLayerRequest().getWorkProductIdentification().getIdentifier().setStringValue(
            layerId);
        result = mapServiceEndpoint.invoke(new DOMSource(ur.getDomNode()));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        UpdateLayerResponseDocument urs = UpdateLayerResponseDocument.Factory.parse(response);
        assertNotNull(urs);
        assertNotNull(urs.getUpdateLayerResponse().getWorkProductPublicationResponse().getWorkProduct());

        // make sure layer was updated
        request = getRequestDocument(path + "request-getlayer.xml", "GetLayerRequest", incidentId);
        GetLayerRequestDocument gm = GetLayerRequestDocument.Factory.parse(request);
        gm.getGetLayerRequest().getWorkProductIdentification().getIdentifier().setStringValue(
            layerId);
        result = mapServiceEndpoint.invoke(new DOMSource(gm.getDomNode()));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        assertTrue("Layer was not deleted", response.contains("Layer"));
    }

    // @Test
    public void ttestLayers() throws Exception {

        assertNotNull(mapServiceEndpoint);
        String path = "src/test/resources/map/";

        // insert test incident
        String incidentId = getIncident();

        // create new layer
        Node request = getRequestDocument(path + "request-submitlayer.xml", "SubmitLayerRequest",
            incidentId);
        Source result = mapServiceEndpoint.invoke(new DOMSource(request));
        assertNotNull(result);
        String response = toString(result);
        assertNotNull(response);
        SubmitLayerResponseDocument responseDoc = null;
        try {
            responseDoc = SubmitLayerResponseDocument.Factory.parse(response);
        } catch (XmlException x) {
            System.err.println(x.getMessage());
        }
        IdentificationType id = WorkProductHelper.getIdentificationElement(responseDoc.getSubmitLayerResponse().getWorkProductPublicationResponse().getWorkProduct());
        String layerId = id.getIdentifier().getStringValue();

        // System.out.println(responseDoc);
        // assertNotNull(responseDoc);
        // assertNotNull(responseDoc.getSubmitLayerResponse());
        // assertNotNull(responseDoc.getSubmitLayerResponse().getWorkProductPublicationResponse());
        // assertNotNull(responseDoc.getSubmitLayerResponse().getWorkProductPublicationResponse().getWorkProduct());
        // IdentificationType id =
        // WorkProductHelper.getIdentificationElement(responseDoc.getSubmitLayerResponse().getWorkProductPublicationResponse().getWorkProduct());
        // assertNotNull(id);
        // String layerId = id.getIdentifier().getStringValue();
        // int start = response.indexOf("layerId>");
        // int end = response.indexOf("<", start + 1);
        // String layerId = response.substring(start + 8, end);

        // get new layer
        Document req = getReqDocument(path + "request-getlayer.xml", "GetLayerRequest", incidentId);
        GetLayerRequestDocument r = GetLayerRequestDocument.Factory.parse(req);
        r.getGetLayerRequest().getWorkProductIdentification().getIdentifier().setStringValue(
            layerId);

        // System.out.println(DOMUtils.toString(req.getDocumentElement()));
        result = mapServiceEndpoint.invoke(new DOMSource(req.getDocumentElement()));

        // request = getReqDocument(path + "request-getlayer.xml", "GetLayerRequest", incidentId);
        // System.out.println(DOMUtils.toString(request));
        // Node r = DOMUtils.getChild(request,new QName("layerId", "http://uicds.org/MapService"));
        // assertNotNull("Can't find layerId element",r);
        // r.setTextContent(layerId);
        // // getChild(request, "layerId").setTextContent(layerId);
        // result = mapServiceEndpoint.invoke(new DOMSource(request));

        assertNotNull(result);
        response = toString(result);
        System.out.println("testLayers: response=" + response);
        assertNotNull(response);
        assertTrue(response.contains("Layer"));

        // get all layers for incident
        request = getRequestDocument(path + "request-getlayers.xml", "GetLayersRequest", incidentId);
        result = mapServiceEndpoint.invoke(new DOMSource(request));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        assertTrue(response.contains("Layer"));

        // update layer
        request = getRequestDocument(path + "request-updatelayer.xml", "UpdateLayerRequest",
            incidentId);
        getChild(request, "LayerId").setTextContent(layerId);
        result = mapServiceEndpoint.invoke(new DOMSource(request));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);

        UpdateLayerResponseDocument updateLayerRes = UpdateLayerResponseDocument.Factory.parse(response);
        assertNotNull(updateLayerRes.getUpdateLayerResponse().getWorkProductPublicationResponse().getWorkProduct());
        id = WorkProductHelper.getIdentificationElement(updateLayerRes.getUpdateLayerResponse().getWorkProductPublicationResponse().getWorkProduct());
        assertNotNull(id);
        // assertTrue(response.contains("Layer"));
        // assertTrue(response.contains("hidden=\"1\""));

        // delete layer
        /*
         * delete layer has been disabled request = getRequestDocument(path +
         * "request-deletelayer.xml", "DeleteLayerRequest", incidentId); getChild(request,
         * "layerId").setTextContent(layerId); result = mapServiceEndpoint.invoke(new
         * DOMSource(request)); assertNotNull(result); response = toString(result);
         * assertNotNull(response);
         */

        // make sure layer was deleted
        request = getRequestDocument(path + "request-getlayer.xml", "GetLayerRequest", incidentId);
        GetLayerRequestDocument rq = GetLayerRequestDocument.Factory.parse(request);
        rq.getGetLayerRequest().getWorkProductIdentification().getIdentifier().setStringValue(
            layerId);
        result = mapServiceEndpoint.invoke(new DOMSource(r.getDomNode()));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        // assertFalse("Layer was not deleted", response.contains("<Layer"));
        // new implementation of deletion will stilll return the product
        assertTrue("Layer was not deleted", response.contains("Layer"));

        // TODO: Check for error conditions!
    }

    @Test
    @Transactional
    public void testMaps() throws Exception {

        assertNotNull(mapServiceEndpoint);
        String path = "src/test/resources/map/";

        String incidentId = getIncident();

        // create new map
        Node request = getRequestDocument(path + "request-submitmap.xml", "SubmitMapRequest",
            incidentId);
        Source result = mapServiceEndpoint.invoke(new DOMSource(request));
        assertNotNull(result);
        String response = toString(result);
        assertNotNull(response);
        SubmitMapResponseDocument responseDoc = SubmitMapResponseDocument.Factory.parse(response);
        IdentificationType id = WorkProductHelper.getIdentificationElement(responseDoc.getSubmitMapResponse().getWorkProductPublicationResponse().getWorkProduct());
        String mapId = id.getIdentifier().getStringValue();
        // int start = response.indexOf("mapId>");
        // int end = response.indexOf("<", start + 1);
        // String mapId = response.substring(start + 6, end);

        // get new map
        request = getRequestDocument(path + "request-getmap.xml", "GetMapRequest", incidentId);
        GetMapRequestDocument r = GetMapRequestDocument.Factory.parse(request);
        r.getGetMapRequest().getWorkProductIdentification().getIdentifier().setStringValue(mapId);
        result = mapServiceEndpoint.invoke(new DOMSource(r.getDomNode()));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        assertTrue(response.contains("ViewContext"));

        // get all maps for incident
        request = getRequestDocument(path + "request-getmaps.xml", "GetMapsRequest", incidentId);
        result = mapServiceEndpoint.invoke(new DOMSource(request));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        assertTrue(response.contains("ViewContext"));

        // update map
        request = getRequestDocument(path + "request-updatemap.xml", "UpdateMapRequest", incidentId);
        UpdateMapRequestDocument ur = UpdateMapRequestDocument.Factory.parse(request);
        ur.getUpdateMapRequest().getWorkProductIdentification().getIdentifier().setStringValue(
            mapId);
        result = mapServiceEndpoint.invoke(new DOMSource(ur.getDomNode()));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        UpdateMapResponseDocument urs = UpdateMapResponseDocument.Factory.parse(response);
        assertNotNull(urs);
        assertNotNull(urs.getUpdateMapResponse().getWorkProductPublicationResponse().getWorkProduct());
        // assertTrue(response.contains("ViewContext"));
        // assertTrue(response.contains("version=\"1.1.2\""));

        // delete map
        /*
         * delete map has been disabled request = getRequestDocument(path + "request-deletemap.xml",
         * "DeleteMapRequest", incidentId); getChild(request, "mapId").setTextContent(mapId); result
         * = mapServiceEndpoint.invoke(new DOMSource(request)); assertNotNull(result); response =
         * toString(result); assertNotNull(response);
         */

        // make sure map was deleted
        request = getRequestDocument(path + "request-getmap.xml", "GetMapRequest", incidentId);
        GetMapRequestDocument gm = GetMapRequestDocument.Factory.parse(request);
        gm.getGetMapRequest().getWorkProductIdentification().getIdentifier().setStringValue(mapId);
        result = mapServiceEndpoint.invoke(new DOMSource(gm.getDomNode()));
        assertNotNull(result);
        response = toString(result);
        assertNotNull(response);
        // assertFalse("ViewContext was not deleted", response.contains("ViewContext"));
        // new implementation of deletion will stilll return the product
        assertTrue("ViewContext was not deleted", response.contains("ViewContext"));
    }

    @Test
    @Transactional
    public void testShapefileSubmission() throws Exception {

        String ns = "http://uicds.org/MapService";
        Document doc = DOMUtils.newDocument();
        Element root = doc.createElementNS(ns, "SubmitShapefileRequest");
        doc.appendChild(root);
        Element incId = doc.createElementNS(ns, "IncidentId");
        root.appendChild(incId);
        incId.setTextContent(getIncident());
        Element cdata = doc.createElementNS(ns, "ContentData");
        root.appendChild(cdata);

        InputStream in = new FileInputStream(
            "src/test/resources/workproduct/IMAACexample_shape.shz");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(in, out);
        byte[] bytes = out.toByteArray();
        bytes = Base64.encodeBase64(bytes);
        cdata.setTextContent(new String(bytes));

        Source result = mapServiceEndpoint.invoke(new DOMSource(root));
        assertNotNull(result);
        String response = toString(result);
        assertNotNull(response);
        // log.debug(response);

    }

    @Test
    @Transactional
    public void testShapefileSubmission2() throws Exception {

        String incidentId = getIncident();
        Node root = getRequestDocument("src/test/resources/map/request-submitshp.xml",
            "SubmitShapefileRequest", incidentId);
        Source result = mapServiceEndpoint.invoke(new DOMSource(root));
        assertNotNull(result);
        String response = toString(result);
        assertNotNull(response);
        // log.debug(response);

    }

    protected Node getRequestDocument(String filename, String requestName, String incidentId)
        throws Exception {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new FileInputStream(filename));
        Node body = getChild(document.getDocumentElement(), "Body");
        Node child = getChild(body, requestName);

        Element iid = DOMUtils.getChild(child, "IncidentId");
        if (iid != null) {
            iid.setTextContent(incidentId);
        }

        return child;
    }

    protected Document getReqDocument(String filename, String requestName, String incidentId)
        throws Exception {

        Document document = DOMUtils.parseDocument(filename);
        Node body = DOMUtils.getChild(document.getDocumentElement(), "Body");
        Node child = DOMUtils.getChild(body, requestName);
        Element iid = DOMUtils.getChild(child, "IncidentId");
        if (iid != null) {
            iid.setTextContent(incidentId);
        }

        Document result = DOMUtils.newDocument();
        result.appendChild(result.importNode(child, true));

        return result;
    }

    protected String toString(Source input) {

        StringWriter writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer, true);
        Result output = new StreamResult(printWriter);
        try {
            TransformerFactory xsltTransformerFactory = TransformerFactory.newInstance();
            Transformer transformer = xsltTransformerFactory.newTransformer(); // id
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
            transformer.setOutputProperty(OutputKeys.MEDIA_TYPE, "text/xml");
            transformer.transform(input, output);
        } catch (Exception e) {
            return e.toString();
        }
        printWriter.flush();
        return writer.toString();
    }

    protected Node getChild(Node parent, String name) {

        Node result = null;
        NodeList children = parent.getChildNodes();
        for (int i = 0; i < children.getLength(); ++i) {
            Node node = children.item(i);
            if (node.getNodeType() != Node.ELEMENT_NODE)
                continue;
            if (!(name.equals(node.getLocalName())))
                continue;
            result = node;
            break;
        }
        if (result != null && result instanceof XmlObject) {
            result = ((XmlObject) result).getDomNode();
        }
        return result;
    }

    protected String getIncident() throws Exception {

        String alertEvent = "a test alert event";
        String alertHeadline = "a test alert headline";
        String alertIdentifier = "identifier";
        String alertSender = "sender";
        String alertAddress = "Mile marker 138";
        Calendar alertSent = new GregorianCalendar();

        AlertDocument alertDoc = AlertDocument.Factory.newInstance();
        // Create an alert to publish
        Alert alert = alertDoc.addNewAlert();
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

        WorkProduct wp = status.getProduct();
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
            "classpath:contexts/test-spring-ws-em-servlet.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
