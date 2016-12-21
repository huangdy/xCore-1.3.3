package com.saic.uicds.core.infrastructure.service;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;

import com.saic.uicds.core.infrastructure.dao.mssql.MSSQLDAOInterface;
import com.saic.uicds.core.infrastructure.dao.mssql.WorkProductMSSQLDBDAO;
import com.saic.uicds.core.infrastructure.service.impl.SQLSearchServiceImpl;
import com.saic.uicds.core.infrastructure.util.NodeRenderer;

@Ignore
public class SqlSearchServiceTest
    extends Assert {

    MSSQLDAOInterface workProductDAO;
    SQLSearchServiceImpl service;

    @Before
    public void setup() {

        workProductDAO = new WorkProductMSSQLDBDAO();
        ((WorkProductMSSQLDBDAO) workProductDAO).setConnectionURI("jdbc:sqlserver://LabSQL:1433;databaseName=MSDemo");
        ((WorkProductMSSQLDBDAO) workProductDAO).setDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ((WorkProductMSSQLDBDAO) workProductDAO).setPassword("Heather1");
        ((WorkProductMSSQLDBDAO) workProductDAO).setUsername("tester1");
        ((WorkProductMSSQLDBDAO) workProductDAO).doConnection();

        service = new SQLSearchServiceImpl();
        service.setWorkProductDAO(workProductDAO);
    }

    @Test
    public void testService() {

        HashMap<String, String[]> params = new HashMap<String, String[]>();
        String[] resourcePath = new String[1];
        resourcePath[0] = "/search";
        String[] remoteUser = new String[1];
        remoteUser[0] = null;
        String[] queryString = new String[1];
        queryString[0] = "format=xml";
        String[] format = new String[1];
        format[0] = "xml";

        params.put("format", format);
        params.put("req.resourcePath", resourcePath);
        params.put("req.queryString", queryString);
        params.put("req.remoteUser", remoteUser);

        String[] count = new String[1];
        count[0] = "5";
        params.put("count", count);

        Document workProduct = service.searchAsDocument(params);
        assertNotNull(workProduct);

        File resources = new File("src/test/resources/resources");
        if (resources.exists()) {
            NodeRenderer renderer = new NodeRenderer();
            renderer.setConfigDirectory(resources);
            renderer.loadConfiguration();
            Map<String, Object> map = renderer.exec(workProduct, params, "debug.xml");
            Properties properties = (Properties) map.get("properties");
            assertNotNull(properties);
            String result = (String) map.get("output");
            assertNotNull(result);
        }
    }
}
