package com.saic.uicds.core.em.endpoint;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;

import com.saic.uicds.core.em.service.TaskingService;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

/**
 * 
 * @author ron
 * 
 */
public class TaskingServiceEndpointTest extends AbstractXmldbJpaTests {
    // AbstractDependencyInjectionSpringContextTests {

    @Autowired
    TaskingService taskingService;

    TaskingServiceEndpoint taskingServiceEndpoint = new TaskingServiceEndpoint();

    @Test
    public void testTaskingServiceEndpointCreated() {
        assertNotNull(taskingService);

        taskingServiceEndpoint.setTaskingService(taskingService);
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
