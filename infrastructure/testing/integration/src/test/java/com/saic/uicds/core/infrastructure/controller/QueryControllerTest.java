package com.saic.uicds.core.infrastructure.controller;

import gov.ucore.ucore.x20.DigestDocument;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.saic.uicds.core.infrastructure.dao.WorkProductDAO;
import com.saic.uicds.core.infrastructure.dao.mssql.MSSQLDAOInterface;
import com.saic.uicds.core.infrastructure.service.ISearchService;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ExistSearchServiceImpl;
import com.saic.uicds.core.infrastructure.service.impl.SQLSearchServiceImpl;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.NodeRenderer;
import com.saic.uicds.core.xmldb.XMLDBDAOInterface;

@Ignore
public class QueryControllerTest extends AbstractXmldbJpaTests {

	QueryController queryController;

	Logger log = LoggerFactory.getLogger(getClass());

	@Resource(name = "workProductDAO")
	WorkProductDAO workProductDAO;

	@Resource(name = "workProductService")
	WorkProductService workProductService;

	@Resource(name = "feedSearchService")
	ISearchService searchService;

	@Resource(name = "nodeRenderer")
	NodeRenderer renderer;

	String productID1;
	String productID2;

	@Override
	protected String[] getConfigLocations() {

		return new String[] {
				"classpath:contexts/applicationContext-infra.xml",
				"classpath:contexts/test-ED-dataSrcContext.xml" };
	}

	@Override
	protected void onSetUp() throws Exception {

		// Set the work product DAO for the search service based on which type
		// of service is wired
		if (searchService instanceof ExistSearchServiceImpl) {
			((ExistSearchServiceImpl) searchService)
					.setWorkProductDAO((XMLDBDAOInterface) workProductDAO);
		} else if (searchService instanceof SQLSearchServiceImpl) {
			((SQLSearchServiceImpl) searchService)
					.setWorkProductDAO((MSSQLDAOInterface) workProductDAO);
		} else {
			fail("WorkProductDAO is of unknown type");
		}

		// Add some test work products with digests.
		productID1 = addAlertWorkProduct();
		productID2 = addAlertWorkProduct();

		// Setup the query controller object
		queryController = new QueryController();

		// Set the service name based on which type of service is wired
		queryController.setService(searchService);
		if (searchService instanceof ExistSearchServiceImpl) {
			queryController.setServiceName("exist");
		} else if (searchService instanceof SQLSearchServiceImpl) {
			queryController.setServiceName("sql");
		}

		// set the config path back to where the em domain has its transforms
		File configPath = new File(
				"../../../em/war/src/main/webapp/config/resources");
		assertTrue("no config path", configPath.exists());
		renderer.setConfigDirectory(configPath);
		renderer.loadConfiguration();
		queryController.setNodeRenderer(renderer);

	};

	@Override
	protected void onTearDown() throws Exception {

		super.cleanupXMLDB();
	};

	@Test
	public void testGetRSSFeed() throws Exception {

		// Setup a mock request for incoming feed request
		MockHttpServletRequest request;
		String feedType = "rss";
		request = createFeedHttpRequest(feedType);
		MockHttpServletResponse response = new MockHttpServletResponse();

		// Check that the queryController handles the request correctly
		ModelAndView mav = queryController.handleRequest(request, response);
		assertEquals(200, response.getStatus());
		assertNotNull(mav);
		checkModel(mav.getModel());

		// Send the ModelAndView to the renderer
		mav.getView().render(mav.getModel(), request, response);
		String xml = response.getContentAsString();
		assertNotNull(xml);
		assertFalse("response contains html error message: " + xml,
				xml.contains("html"));
		assertFalse("XQuery error", xml.contains("An XQuery error occurred"));

		checkRSSFeed(xml);

		checkProduct(productID1);
	}

	@Test
	public void testGetKMLFeed() throws Exception {

		// Setup a mock request for incoming feed request
		MockHttpServletRequest request;
		String feedType = "kml";
		request = createFeedHttpRequest(feedType);
		MockHttpServletResponse response = new MockHttpServletResponse();

		// Check that the queryController handles the request correctly
		ModelAndView mav = queryController.handleRequest(request, response);
		assertEquals(200, response.getStatus());
		assertNotNull(mav);
		checkModel(mav.getModel());

		// Send the ModelAndView to the renderer
		mav.getView().render(mav.getModel(), request, response);
		String xml = response.getContentAsString();
		assertNotNull(xml);
		assertFalse("response contains html error message: " + xml,
				xml.contains("html"));
		assertFalse("XQuery error", xml.contains("An XQuery error occurred"));

		checkKMLFeed(xml);
	}

	@Test
	public void testGetXMLFeed() throws Exception {

		// Setup a mock request for incoming feed request
		MockHttpServletRequest request;
		String feedType = "xml";
		request = createFeedHttpRequest(feedType);
		MockHttpServletResponse response = new MockHttpServletResponse();

		// Check that the queryController handles the request correctly
		ModelAndView mav = queryController.handleRequest(request, response);
		assertEquals(200, response.getStatus());
		assertNotNull(mav);
		checkModel(mav.getModel());

		// Send the ModelAndView to the renderer
		mav.getView().render(mav.getModel(), request, response);
		String xml = response.getContentAsString();
		assertNotNull(xml);
		assertFalse("response contains html error message: " + xml,
				xml.contains("html"));
		assertFalse("XQuery error", xml.contains("An XQuery error occurred"));

		checkXMLFeed(xml);
	}

	private MockHttpServletRequest createFeedHttpRequest(String feedType) {

		MockHttpServletRequest request;
		request = new MockHttpServletRequest("GET", "/api/search");
		request.setParameter("format", feedType);
		request.setParameter("req.resourcePath", "/search");
		request.setParameter("productType", "Alert");
		request.setParameter("productState", "Active");
		return request;
	}

	private MockHttpServletRequest createProductHttpRequest(String id) {

		MockHttpServletRequest request;
		request = new MockHttpServletRequest("GET", "/api/search");
		request.setParameter("productID", id);
		request.setParameter("productVersion", "1");
		request.setParameter("format", "xml");
		request.setParameter("req.resourcePath", "/search");
		request.setParameter(
				"req.queryString",
				"productID=Incident-eeffe22b-e1c7-4cb4-88ed-f181ea113327&amp;productVersion=1&amp;format=xml");
		return request;
	}

	private void checkProduct(String id) throws Exception {

		MockHttpServletRequest request = createProductHttpRequest(id);
		MockHttpServletResponse response = new MockHttpServletResponse();

		// Check that the queryController handles the request correctly
		ModelAndView mav = queryController.handleRequest(request, response);
		assertEquals(200, response.getStatus());
		assertNotNull(mav);

		// Send the ModelAndView to the renderer
		mav.getView().render(mav.getModel(), request, response);
		String xml = response.getContentAsString();
		assertNotNull(xml);

		checkSingleProductFeed(xml);
	}

	private void checkModel(@SuppressWarnings("rawtypes") Map model) {

		// Make sure the output is not null
		Document output = (Document) model.get("output");
		assertNotNull("null output", output);

		// Output should contain one WorkProductList element as the root element
		NodeList workproducts = output.getChildNodes();
		assertEquals("wrong # wps", 1, workproducts.getLength());

		// Node wpListNode = workproducts.item(0);
		// printNode(wpListNode);

		// Check that there are two work product elements in it
		// If you are debugging and do not let the onTearDown method run this
		// assert will fail
		// because the work products from previous runs are not cleaned up.
		NodeList wps = output.getElementsByTagNameNS(
				"http://www.saic.com/precis/2009/06/structures", "WorkProduct");
		assertTrue("no WPs", wps.getLength() > 0);
		assertEquals("not 2", 2, wps.getLength());
		for (int i = 0; i < wps.getLength(); i++) {
			assertNotNull("null wp at index " + i, wps.item(i));
			// System.out.println(wps.item(i).getLocalName());
		}

	}

	private void checkSingleProductFeed(String xml) throws XmlException {

		XmlObject xmlFeed = XmlObject.Factory.parse(xml);
		System.out.println(xmlFeed.xmlText());

		XmlObject[] wpList = xmlFeed.selectChildren(
				"http://www.saic.com/precis/2009/06/structures", "WorkProduct");
		assertEquals("wrong # WorkProducts", 1, wpList.length);
	}

	private void checkRSSFeed(String xml) throws XmlException {

		XmlObject rssFeed = XmlObject.Factory.parse(xml);
		// System.out.println(rssFeed.xmlText());

		XmlObject[] rss = rssFeed.selectChildren("", "rss");
		assertEquals("no rss root", 1, rss.length);

		XmlObject[] channels = rss[0].selectChildren("", "channel");
		assertEquals("no channels", 1, channels.length);
	}

	private void checkKMLFeed(String xml) throws XmlException {

		XmlObject kmlFeed = XmlObject.Factory.parse(xml);
		// System.out.println(kmlFeed.xmlText());

		XmlObject[] kml = kmlFeed.selectChildren(
				"http://www.opengis.net/kml/2.2", "kml");
		assertEquals("no kml root", 1, kml.length);

		XmlObject[] documents = kml[0].selectChildren(
				"http://www.opengis.net/kml/2.2", "Document");
		assertEquals("no document", 1, documents.length);
	}

	private void checkXMLFeed(String xml) throws XmlException {

		XmlObject xmlFeed = XmlObject.Factory.parse(xml);
		// System.out.println(xmlFeed.xmlText());

		XmlObject[] wpList = xmlFeed.selectChildren(
				"http://www.saic.com/precis/2009/06/structures",
				"WorkProductList");
		assertEquals("no WorkProductList root", 1, wpList.length);

		XmlObject[] wps = wpList[0].selectChildren(
				"http://www.saic.com/precis/2009/06/structures", "WorkProduct");
		assertEquals("wrong # WorkProducts", 2, wps.length);
	}

	@SuppressWarnings("unused")
	private void printNode(Node node) {

		try {
			XmlObject obj = XmlObject.Factory.parse(node);
			System.out.println(obj.xmlText());
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String addAlertWorkProduct() throws XmlException, IOException {

		com.saic.uicds.core.infrastructure.model.WorkProduct wp = new com.saic.uicds.core.infrastructure.model.WorkProduct();
		DigestDocument digest = createDigest();
		wp.setDigest(digest);
		wp.setProductType("Alert");
		wp.setActive(true);
		XmlObject xmlContent;
		try {
			xmlContent = XmlObject.Factory.parse("<Alert>alert</Alert>");
			wp.setProduct(xmlContent);
			String productID = workProductService.publishProduct(wp)
					.getProduct().getProductID();
			// System.out.println("adding: "+productID);
			return productID;
		} catch (XmlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	private DigestDocument createDigest() throws XmlException, IOException {

		DigestDocument digest = DigestDocument.Factory.parse(new File(
				"../data/Digest1.xml"));
		return digest;
	}
}
