package com.saic.uicds.core.infrastructure.dao;

import java.util.Date;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.util.UUIDUtil;
import com.saic.uicds.core.xmldb.WorkProductXMLDBDAO;
import com.saic.uicds.core.xmldb.XMLDBConnection;

//@Ignore
public class WorkProductDAOTest
    extends Assert { // extends AbstractXmldbJpaTests {

    private static final String incidentId = "I-0123456789";
    private static final Integer version = 1;
    private static final String productString = "<alert><info><title>title</title></info></alert>";
    private static final Integer workProductID = 1;

    WorkProductDAO workProductDAO;
    XMLDBConnection xmldbConnection;

    @Before
    public void setup() {

        workProductDAO = new WorkProductXMLDBDAO();
        xmldbConnection = new XMLDBConnection();
        xmldbConnection.setConnectionURI("xmldb:exist://localhost:8080/exist/xmlrpc/db/UICDS");
        xmldbConnection.setDriver("org.exist.xmldb.DatabaseImpl");
        xmldbConnection.setMaxRetries(5);
        xmldbConnection.setPassword("uicds123");
        xmldbConnection.setUsername("uicds");
        ((WorkProductXMLDBDAO) workProductDAO).setXmldbConnection(xmldbConnection);
    }

    @After
    public void cleanup() {

        // Clean up the database after each test
        List<WorkProduct> workProducts = workProductDAO.findAll();
        for (WorkProduct wp : workProducts) {
            workProductDAO.makeTransient(wp);
        }

        // Clean up side effects
        // List<Notification> notifications = notificationDAO.findAll();
        // for (Notification notification : notifications) {
        // System.out.println("remove notification");
        // notificationDAO.makeTransient(notification);
        // }
    }

    @Test
    public void testMakeTransient() {

        WorkProduct workProduct = createWorkProduct();
        workProductDAO.makePersistent(workProduct);

        List<WorkProduct> results = workProductDAO.findByInterestGroup(incidentId);
        assertEquals(1, results.size());

        workProductDAO.makeTransient(workProduct);
        results = workProductDAO.findByInterestGroup(incidentId);
        assertEquals(0, results.size());
    }

    @Test
    public void testFindByIncident() {

        WorkProduct workProduct = createWorkProduct();
        workProductDAO.makePersistent(workProduct);

        List<WorkProduct> results = workProductDAO.findByInterestGroup(incidentId);
        assertEquals(1, results.size());
    }

    @Test
    public void testFindByIdAndVersion() {

        WorkProduct workProduct = createWorkProduct();
        workProductDAO.makePersistent(workProduct);

        List<WorkProduct> results = workProductDAO.findByInterestGroup(incidentId);
        assertEquals(1, results.size());

        String productID = results.get(0).getProductID();
        Integer productVersion = results.get(0).getProductVersion();
        WorkProduct product = workProductDAO.findByProductIDAndVersion(productID, productVersion);

        assertTrue(product.getProductID().equals(productID));
        assertEquals(product.getProductVersion(), productVersion);
    }

    @Test
    public void testWorkProductCrud() {

        assertNotNull(workProductDAO);
        {
            List<WorkProduct> workProducts = workProductDAO.findAll();
            assertTrue(workProducts.isEmpty());
        }

        WorkProduct workProduct = createWorkProduct();
        workProductDAO.makePersistent(workProduct);

        {
            List<WorkProduct> workProducts = workProductDAO.findAll();
            assertEquals(1, workProducts.size());
        }

        // Integer id = workProduct.getId();
        String productID = workProduct.getProductID();
        WorkProduct workProduct2 = workProductDAO.findByProductID(productID);
        assertNotNull(workProduct2);
        workProductDAO.makeTransient(workProduct2);
        assertNull(workProductDAO.findByProductID(productID));

        {
            List<WorkProduct> workProducts = workProductDAO.findAll();
            assertTrue(workProducts.isEmpty());
        }
    }

    private WorkProduct createWorkProduct() {

        WorkProduct workProduct = new WorkProduct();
        workProduct.getAssociatedInterestGroupIDs().add(incidentId);
        workProduct.setProductType("Incident");
        workProduct.setCreatedDate(new Date());
        workProduct.setProductID(UUIDUtil.getID("Incident"));
        workProduct.setId(workProductID);
        workProduct.setProductVersion(version);
        workProduct.setProduct(XmlObject.Factory.newInstance());
        return workProduct;
    }
}
