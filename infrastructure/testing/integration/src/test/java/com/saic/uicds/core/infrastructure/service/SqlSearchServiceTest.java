package com.saic.uicds.core.infrastructure.service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.junit.Ignore;
import org.slf4j.LoggerFactory;
import org.springframework.test.jpa.AbstractJpaTests;
import org.w3c.dom.Document;

import com.saic.uicds.core.infrastructure.dao.WorkProductDAO;
import com.saic.uicds.core.infrastructure.dao.mssql.MSSQLDAOInterface;
import com.saic.uicds.core.infrastructure.service.impl.ExistSearchServiceImpl;
import com.saic.uicds.core.infrastructure.service.impl.SQLSearchServiceImpl;
import com.saic.uicds.core.xmldb.XMLDBDAOInterface;

@Ignore
public class SqlSearchServiceTest
    extends AbstractJpaTests {

    Logger log = LoggerFactory.getLogger(getClass());

    @Resource(name = "workProductDAO")
    WorkProductDAO workProductDAO;

    @Resource(name = "feedSearchService")
    ISearchService searchService;

    // @Resource(name="workProductDAO")
    // XMLDBDAOInterface existWorkProductDAO;
    //
    // SQLSearchServiceImpl sqlSearchService;
    //
    // @Resource(name="sqlWorkProductDAO")
    // MSSQLDAOInterface sqlWorkProductDAO;

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testGetWPFeedFromExist() throws Exception {

        searchService = new SQLSearchServiceImpl();
        if (searchService instanceof ExistSearchServiceImpl) {
            ((ExistSearchServiceImpl) searchService).setWorkProductDAO((XMLDBDAOInterface) workProductDAO);
        } else if (searchService instanceof SQLSearchServiceImpl) {
            ((SQLSearchServiceImpl) searchService).setWorkProductDAO((MSSQLDAOInterface) workProductDAO);
        } else {
            fail("WorkProductDAO is of unknown type");
        }
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
        Document workProducts = (Document) searchService.searchAsDocument(params);
        // assertNotNull(workProducts);
    }
}
