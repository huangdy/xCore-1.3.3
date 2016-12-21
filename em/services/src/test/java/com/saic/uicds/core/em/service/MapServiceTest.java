package com.saic.uicds.core.em.service;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collections;

import javax.xml.namespace.QName;

import org.apache.commons.io.IOUtils;
import org.apache.xmlbeans.XmlObject;
import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import com.usersmarts.cx.wms.WMC;
import com.usersmarts.util.DOMUtils;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.uicds.core.em.service.impl.MapServiceImpl;
import com.saic.uicds.core.em.util.ShapefileIngester;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.ConfigurationService;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;

/**
 * MapServiceTest
 * 
 * @author Patrick Neal - Image Matters, LLC
 * @package com.saic.dctd.uicds.core.service
 * @created Feb 18, 2009
 */
public class MapServiceTest
    extends Assert {

    MapService service = new MapServiceImpl();
    WorkProductService wps;
    ConfigurationService cfg;
    ShapefileIngester shp;

    // LayerDAO ldao;
    // IncidentDAO idao;

    private static final String PRECISS_NS = "http://www.saic.com/precis/2009/06/structures";
    private static final String PRECISB_NS = "http://www.saic.com/precis/2009/06/base";
    private static final Integer VERSION = 1;
    private static final Integer SIZE = 128;
    private static final String PKG_ID = "WorkProductIdentification";

    @Before
    public void setUp() throws Exception {

        wps = EasyMock.createMock(WorkProductService.class);
        ((MapServiceImpl) service).setWorkProductService(wps);
        shp = new ShapefileIngester();
        ((MapServiceImpl) service).setShapefileIngester(shp);
        cfg = new CfgService();
        ((MapServiceImpl) service).setConfigurationService(cfg);
        // ldao = new LayerDAOHibernate();
        // ((MapServiceImpl)service).setLayerDAO(ldao);
        // idao = new IncidentDAOHibernate();
        // ((MapServiceImpl)service).setIncidentDAO(idao);
    }

    @Test
    public void submitMap() throws Exception {

        Node node = DOMUtils.appendElement(DOMUtils.newDocument(), WMC.VIEW_CONTEXT);
        WorkProduct map = new WorkProduct();
        map.getAssociatedInterestGroupIDs().add("test");
        map.setProduct(XmlObject.Factory.newInstance());
        map.setProductID("test");

        ProductPublicationStatus status = new ProductPublicationStatus();
        status.setStatus(ProductPublicationStatus.SuccessStatus);
        status.setProduct(map);

        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);

        EasyMock.expect(wps.getProduct("test")).andReturn(map);
        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        EasyMock.expect(
            wps.associateWorkProductToInterestGroup(EasyMock.isA(String.class),
                EasyMock.isA(String.class))).andStubReturn("test");
        EasyMock.replay(wps);
        Object response = service.createMap("test", node);
        assertNotNull(response);
    }

    @Test
    public void getMapById() throws Exception {

        String productId = "test";
        Node node = DOMUtils.appendElement(DOMUtils.newDocument(), WMC.VIEW_CONTEXT);
        WorkProduct product = new WorkProduct();
        product.setProduct(XmlObject.Factory.parse(DOMUtils.toString(node)));

        // assign the ProductVersion and size
        product.setProductVersion(new Integer(1));
        product.setSize(new Integer(product.getProduct().toString().length()));

        EasyMock.expect(wps.getProduct(productId)).andReturn(product);
        EasyMock.replay(wps);
        Object response = service.getMap(productId);
        assertNotNull(response);
    }

    @Test
    public void getMapByWorkProductIdentification() throws Exception {

        String productId = "test";
        Node node = DOMUtils.appendElement(DOMUtils.newDocument(), WMC.VIEW_CONTEXT);
        WorkProduct product = new WorkProduct();
        product.setProduct(XmlObject.Factory.parse(DOMUtils.toString(node)));

        // assign the ProductVersion and size
        product.setProductVersion(new Integer(1));
        product.setSize(new Integer(product.getProduct().toString().length()));

        Node packageIdNode = DOMUtils.appendElement(DOMUtils.newDocument(), new QName(PRECISB_NS,
            PKG_ID));
        DOMUtils.appendElementWithText(packageIdNode, new QName(PRECISB_NS, "Identifier"),
            productId);
        EasyMock.expect(wps.getProduct(productId)).andReturn(product);
        EasyMock.replay(wps);
        Object response = service.getMap(packageIdNode);
        assertNotNull(response);
    }

    @Test
    public void getMaps() throws Exception {

        WorkProduct product = new WorkProduct();
        product.setProductID("test");
        EasyMock.expect(wps.findByInterestGroupAndType("test", MapServiceImpl.MapType)).andReturn(
            Collections.singletonList(product));
        EasyMock.replay(wps);
        Object response = service.getMaps("test");
        assertNotNull(response);
    }

    @Test
    public void updateMap() throws Exception {

        Node node = DOMUtils.appendElement(DOMUtils.newDocument(), WMC.VIEW_CONTEXT);
        WorkProduct map = new WorkProduct();
        map.getAssociatedInterestGroupIDs().add("test");
        map.setProduct(XmlObject.Factory.newInstance());
        map.setProductID("test");

        ProductPublicationStatus status = new ProductPublicationStatus();
        status.setStatus(ProductPublicationStatus.SuccessStatus);
        status.setProduct(map);

        Node packageIdNode = getPackageIdNode("test", "test");

        EasyMock.expect(wps.getProduct("test")).andReturn(map);
        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        EasyMock.expect(
            wps.associateWorkProductToInterestGroup(EasyMock.isA(String.class),
                EasyMock.isA(String.class))).andStubReturn("test");
        EasyMock.replay(wps);
        service.updateMap(packageIdNode, node);
    }

    @Test
    public void deleteMap() throws Exception {

        WorkProduct map = new WorkProduct();
        map.getAssociatedInterestGroupIDs().add("test");
        map.setProduct(XmlObject.Factory.newInstance());
        map.setProductID("test");
        map.setActive(true);

        EasyMock.expect(wps.getProduct("test")).andReturn(map);

        ProductPublicationStatus status = new ProductPublicationStatus();
        status.setStatus(ProductPublicationStatus.SuccessStatus);
        EasyMock.expect(wps.closeProduct(EasyMock.isA(IdentificationType.class))).andReturn(status);

        EasyMock.expect(wps.archiveProduct(EasyMock.isA(IdentificationType.class))).andReturn(
            status);
        EasyMock.replay(wps);

        status = service.deleteMap("test", "test");
    }

    @Test
    public void submitLayer() throws Exception {

        Node node = DOMUtils.appendElement(DOMUtils.newDocument(), WMC.LAYER);
        WorkProduct layer = new WorkProduct();
        layer.setProduct(XmlObject.Factory.parse(DOMUtils.toString(node)));
        layer.getAssociatedInterestGroupIDs().add("test");

        ProductPublicationStatus status = new ProductPublicationStatus();
        status.setStatus(ProductPublicationStatus.SuccessStatus);
        status.setProduct(layer);

        layer.setProductID("test");
        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        EasyMock.expect(
            wps.associateWorkProductToInterestGroup(EasyMock.isA(String.class),
                EasyMock.isA(String.class))).andStubReturn("test");
        EasyMock.replay(wps);
        ProductPublicationStatus retStat = service.createLayer("test", node);
        assertNotNull(retStat);
    }

    @Test
    public void getLayerById() throws Exception {

        String productId = "test";
        Node node = DOMUtils.appendElement(DOMUtils.newDocument(), WMC.LAYER);
        WorkProduct product = new WorkProduct();
        product.setProduct(XmlObject.Factory.parse(DOMUtils.toString(node)));
        product.getAssociatedInterestGroupIDs().add("test");
        product.setProductID("test");
        product.setProductVersion(VERSION);
        product.setSize(SIZE);
        EasyMock.expect(wps.getProduct(productId)).andReturn(product);
        EasyMock.replay(wps);
        Object response = service.getLayer(productId);
        assertNotNull(response);
    }

    @Test
    public void getLayerByWorkProductIdentification() throws Exception {

        String productId = "test";
        Node node = DOMUtils.appendElement(DOMUtils.newDocument(), WMC.LAYER);
        WorkProduct product = new WorkProduct();
        product.setProduct(XmlObject.Factory.parse(DOMUtils.toString(node)));
        product.getAssociatedInterestGroupIDs().add("test");
        product.setProductID("test");
        // assign the ProductVersion and size
        product.setProductVersion(new Integer(1));
        product.setSize(new Integer(product.getProduct().toString().length()));

        Node packageIdNode = DOMUtils.appendElement(DOMUtils.newDocument(), new QName(PRECISB_NS,
            PKG_ID));
        DOMUtils.appendElementWithText(packageIdNode, new QName(PRECISB_NS, "Identifier"),
            productId);

        EasyMock.expect(wps.getProduct(productId)).andReturn(product);
        EasyMock.replay(wps);
        Object response = service.getMap(packageIdNode);
        assertNotNull(response);
    }

    @Test
    public void getLayers() throws Exception {

        WorkProduct product = new WorkProduct();
        product.getAssociatedInterestGroupIDs().add("test");
        product.setProduct(XmlObject.Factory.newInstance());
        product.setProductID("test");
        EasyMock.expect(wps.findByInterestGroupAndType("test", MapServiceImpl.LayerType)).andReturn(
            Collections.singletonList(product));
        EasyMock.replay(wps);
        Object response = service.getLayers("test");
        assertNotNull(response);
    }

    @Test
    public void updateLayer() throws Exception {

        Node node = DOMUtils.appendElement(DOMUtils.newDocument(), WMC.LAYER);
        WorkProduct layer = new WorkProduct();
        layer.getAssociatedInterestGroupIDs().add("test");
        layer.setProduct(XmlObject.Factory.newInstance());
        layer.setProductID("test");

        ProductPublicationStatus status = new ProductPublicationStatus();
        status.setStatus(ProductPublicationStatus.SuccessStatus);
        status.setProduct(layer);

        EasyMock.expect(wps.getProduct("test")).andReturn(layer);
        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        EasyMock.expect(
            wps.associateWorkProductToInterestGroup(EasyMock.isA(String.class),
                EasyMock.isA(String.class))).andStubReturn("test");
        EasyMock.replay(wps);
        Node packageIdNode = getPackageIdNode("test", "test");
        service.updateLayer(packageIdNode, node);
    }

    @Test
    public void deleteLayer() throws Exception {

        WorkProduct layer = new WorkProduct();
        layer.getAssociatedInterestGroupIDs().add("test");
        layer.setProduct(XmlObject.Factory.newInstance());
        layer.setProductID("test");
        layer.setActive(true);

        EasyMock.expect(wps.getProduct("test")).andReturn(layer);

        ProductPublicationStatus status = new ProductPublicationStatus();
        status.setStatus(ProductPublicationStatus.SuccessStatus);

        EasyMock.expect(wps.closeProduct(EasyMock.isA(IdentificationType.class))).andReturn(status);

        EasyMock.expect(wps.archiveProduct(EasyMock.isA(IdentificationType.class))).andReturn(
            status);
        EasyMock.replay(wps);

        status = service.deleteLayer("test", "test");
    }

    @Test
    public void submitShapefile() throws Exception {

        EasyMock.expect(wps.getProduct("test")).andReturn(new WorkProduct());
        // shapefile wp
        WorkProduct shapeFile = new WorkProduct();
        shapeFile.getAssociatedInterestGroupIDs().add("test");
        shapeFile.setProduct(XmlObject.Factory.newInstance());
        shapeFile.setProductID("test");

        ProductPublicationStatus status = new ProductPublicationStatus();
        status.setStatus(ProductPublicationStatus.SuccessStatus);
        status.setProduct(shapeFile);

        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        // 3 features wps
        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        // EasyMock.expect(cfg.getWebServiceBaseURL()).andReturn("http://localhost:8080/uicds/ws");
        // layer wp
        EasyMock.expect(wps.publishProduct(EasyMock.isA(WorkProduct.class))).andReturn(status);
        EasyMock.expect(
            wps.associateWorkProductToInterestGroup(EasyMock.isA(String.class),
                EasyMock.isA(String.class))).andStubReturn("test");
        EasyMock.replay(wps);
        InputStream in = new FileInputStream("src/test/resources/maps/IMAACexample_shape.shz");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        IOUtils.copy(in, out);
        in.close();
        byte[] bytes = out.toByteArray();
        Object response = service.submitShapefile("test", bytes);
        assertNotNull(response);
    }

    protected Node getPackageIdNode(String incidentId, String wpId) throws Exception {

        Document document = DOMUtils.newDocument();
        Node workProductNode = DOMUtils.appendElement(document,
            new QName(PRECISS_NS, "WorkProduct"));
        Node packageIdNode = DOMUtils.appendElement(workProductNode, new QName(PRECISB_NS, PKG_ID));
        DOMUtils.appendElementWithText(packageIdNode, new QName(PRECISB_NS, "Identifier"), wpId);
        return packageIdNode;
    }

    /**
     * Mock implementation of ConfigurationService for testing
     * 
     * @author Patrick Neal - Image Matters, LLC
     * @package com.saic.dctd.uicds.core.service
     * @created Feb 20, 2009
     */
    class CfgService
        implements ConfigurationService {
        public String getFullyQualifiedHostName() {

            return null;
        }

        public String getFullyQualifiedServiceNameURN(String serviceName) {

            return null;
        }

        public String getHostName() {

            return null;
        }

        public String getServiceNameURN(String serviceName) {

            return null;
        }

        public String getWebServiceBaseURL() {

            return "http://localhost:8080/uicds/ws";
        }

        public String getCoreName() {

            return null;
        }

        @Override
        public String getRestBaseURL() {

            return "http://localhost:8080/uicds/api";
        }
        
        @Override
        public XmlObject getConfig() {
        	return null;
    }
    }

}
