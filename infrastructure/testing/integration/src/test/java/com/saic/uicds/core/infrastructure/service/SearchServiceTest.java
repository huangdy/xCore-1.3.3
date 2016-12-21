package com.saic.uicds.core.infrastructure.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;

public class SearchServiceTest extends AbstractJpaTests {

    @PersistenceContext
    EntityManager em;

    @Autowired
    SearchService searchService;

    @Test
    public void testIncidentSearch() {
        // List<Incident> incidents = incidentDAO.findAll();
        // assertEquals(1, incidents.size());
        // List<?> items = searchService.findEntities("title:title");
        // assertEquals(1, items.size());
        // for (Object obj : items) {
        // assertNotNull(obj);
        // }
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

}
