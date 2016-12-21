package com.saic.uicds.core.infrastructure.dao;


import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import org.junit.Ignore;

import javax.annotation.Resource;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import com.saic.precis.x2009.x06.structures.WorkProductDocument;
import com.saic.uicds.core.infrastructure.dao.mssql.WorkProductMSSQLDBDAO;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.ValidationUtil;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

@Ignore
public class WorkProductMSSQLDBDAOTest
    extends AbstractXmldbJpaTests {
	
	 private Logger log = LoggerFactory.getLogger(WorkProductMSSQLDBDAOTest.class);
	 
    @Resource(name = "workProductDAO")
    // @Autowired
    WorkProductMSSQLDBDAO workProductDAO;

    WorkProduct wp1=new WorkProduct();
	WorkProduct wp2=new WorkProduct();
	
    // @Ignore
    @Before
    @Override
    protected void onSetUp() throws Exception {

    	
        WorkProductDocument wp = WorkProductDocument.Factory.parse(new File(
            "../data/WorkProductDocument1.xml"));
        wp1 = WorkProductHelper.toModel(wp.getWorkProduct());

        wp = WorkProductDocument.Factory.parse(new File("../data/WorkProductDocument2.xml"));
        wp2 = WorkProductHelper.toModel(wp.getWorkProduct());

        workProductDAO.makePersistent(wp1);
        workProductDAO.makePersistent(wp2);
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/mssql-dataSrcContext.xml" };
    }

    // @Ignore
    @After
     public void cleanup() {

        // Clean up the database after each test, same thing as xmldb does
        List<WorkProduct> workProducts = workProductDAO.findAll();
        for (WorkProduct wp : workProducts) {
            workProductDAO.makeTransient(wp);
        }

    }
    
    // @Ignore
    @Test
    public void testFindWP() {

        log.debug("testFindWP calling........");
        String SQL = "select * from guest.workproducts where ProductID='Incident-999'";
        WorkProduct obj = workProductDAO.findBySerachCritia(SQL);

        if (obj != null) {
            String pID = "Incident-999";
            assertEquals(pID, obj.getProductID());
        }

    }

    @Test
    public void testFindWP1() {

        WorkProduct wp = workProductDAO.findByProductID(wp1.getProductID());

        assertNotNull("wp1 found", wp);

        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct wpDoc = WorkProductHelper.toWorkProduct(wp);

        assertTrue("wp1 failed validation", ValidationUtil.validate(wpDoc, true));

    }

    // @Ignore
    @Test
    public void testFindWPList() {

        log.debug("testFindWPList calling........");
        String SQL = "select * from guest.workproducts";
        List<WorkProduct> results = workProductDAO.findWPListBySearch(SQL);
        // for testing, we added 2 work products in the table at beginning.
        // assertEquals(2, results.size());

        String asg = "IG";
        List<WorkProduct> wplist = workProductDAO.findByInterestGroup(asg);
        // assertEquals(2, wplist.size());

        WorkProduct product = workProductDAO.findById(results.get(0).getId());
        // check this one is the real first one or not.
        assertEquals(results.get(0).getId(), product.getId());
    }


    @Test
    public void testFindDom() throws ParserConfigurationException, SQLException,
        TransformerException {

        log.debug("testFindDom calling........");
        String SQL = "select * from guest.workproducts";
        Document doc = workProductDAO.findDocsBySearchCriteria(SQL);

        // verification
        DOMSource domSource = new DOMSource(doc);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); // "ISO-8859-1");
        StringWriter sw = new StringWriter();
        StreamResult sr = new StreamResult(sw);
        transformer.transform(domSource, sr);
        String vs = sw.toString();
        String rvs = null;
        rvs = vs.replaceAll("&lt;", "<");
        rvs = rvs.replaceAll("&gt;", ">");
        // System.out.println(rvs);
        log.info("Doc string : " + rvs);

        //update all workproduct
        updateAllworkproduct();
        
        //clean up all
        cleanup();
    }
    
    private void updateAllworkproduct()
    {
    	  String SQL = "select * from guest.workproducts";
          List<WorkProduct> results = workProductDAO.findWPListBySearch(SQL);
          Iterator<WorkProduct> iterator = results.iterator();
      	  while (iterator.hasNext()) 
      	  {
      		WorkProduct obj = iterator.next();
      		workProductDAO.makePersistent(obj);
      	  }
          
    }
}
