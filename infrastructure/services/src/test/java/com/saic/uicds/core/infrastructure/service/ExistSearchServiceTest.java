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

import com.saic.uicds.core.infrastructure.service.impl.ExistSearchServiceImpl;
import com.saic.uicds.core.infrastructure.util.NodeRenderer;
import com.saic.uicds.core.xmldb.WorkProductXMLDBDAO;
import com.saic.uicds.core.xmldb.XMLDBConnection;
import com.saic.uicds.core.xmldb.XMLDBDAOInterface;

public class ExistSearchServiceTest extends Assert { 

    XMLDBDAOInterface workProductDAO;
    XMLDBConnection xmldbConnection;
    ExistSearchServiceImpl service;

    @Ignore
    @Before
    public void setup() {

        workProductDAO = new WorkProductXMLDBDAO();
        xmldbConnection = new XMLDBConnection();
        xmldbConnection.setConnectionURI("xmldb:exist://localhost:8080/exist/xmlrpc/db/UICDS");
        xmldbConnection.setDriver("org.exist.xmldb.DatabaseImpl");
        xmldbConnection.setMaxRetries(5);
        xmldbConnection.setPassword("uicds.1549");
        xmldbConnection.setUsername("uicds");
        workProductDAO.setXmldbConnection(xmldbConnection);
        service=new ExistSearchServiceImpl(workProductDAO);
        
    }

    @Ignore
    @Test
    public void testService() {
        HashMap<String,String[]> params=new HashMap<String, String[]>();
        String[] resourcePath=new String[1];
        resourcePath[0]="/search";
        String[] remoteUser=new String[1];
        remoteUser[0]=null;
        String[] queryString=new String[1];
        queryString[0]="format=xml";
        String[] format=new String[1];
        format[0]="xml";
        
        params.put("format", format);
        params.put("req.resourcePath", resourcePath);
        params.put("req.queryString", queryString);
        params.put("req.remoteUser", remoteUser);
        
        Document workProduct= service.searchAsDocument(params);
        assertNotNull(workProduct);
        
        File resources=new File("src/test/resources/resources");
        if(resources.exists()){
        	NodeRenderer renderer=new NodeRenderer();
        	renderer.setConfigDirectory(resources);
        	renderer.loadConfiguration();
        	Map<String,Object> map=renderer.exec(workProduct, params, "debug.xml");
        	Properties properties=(Properties)map.get("properties");
        	assertNotNull(properties);
        	String result=(String)map.get("output");
        	assertNotNull(result);
        }
    }
}
