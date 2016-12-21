/**
 * 
 */
package com.saic.uicds.core;

import java.util.HashMap;

import org.apache.xmlbeans.XmlObject;
import org.junit.Test;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import x0.oasisNamesTcEmergencyEDXLDE1.ValueListType;
import x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution;

import org.uicds.incident.IncidentDocument;
import org.uicds.incident.UICDSIncidentType;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.PropertiesType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;

/**
 * @author roger
 * 
 */
public class UicdsIndentTest extends AbstractDependencyInjectionSpringContextTests {

    private UicdsIncident uicdsIncident;

    private CoreServiceTemplate coreServiceTemplate;

    final static private String INCIDENT_WPID = "1";
    final static private String MAP_WPID = "2";
    final static private String OTHER_INCIDENT_WPID = "3";
    final static private String INCIDENT_WP_TYPE = "incident";

    public void setUicdsIncident(UicdsIncident i) {
        uicdsIncident = i;
    }

    public void setCoreServiceTemplate(CoreServiceTemplate c) {
        coreServiceTemplate = c;
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "classpath:contexts/test-application.xml" };
    }

    /**
     * Test method for
     * {@link com.saic.dctd.uicds.core.UicdsIncident#Incident(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)}
     * .
     */
    @Test
    public void testIncident() {
        assertNotNull(coreServiceTemplate);
        CoreServiceTemplateTestImpl testCore = ((CoreServiceTemplateTestImpl) coreServiceTemplate);
        IncidentDocument incidentDoc = testCore.getIncidentSample();
        UICDSIncidentType incidentType = incidentDoc.getIncident();
        uicdsIncident.setIncidentDocument(incidentType);
        uicdsIncident.createOnCore();
        assertTrue("incident is null", uicdsIncident != null);
        String id = uicdsIncident.getIncidentId();
        assertNotNull(id);
        assertTrue("incorrect incident id expected "
                + incidentType.getId() + " but got " + id,id.equals(incidentType.getId()));
    }

    @Test
    public void testMapProductAdded() {
        HashMap<String, UicdsWorkProduct> wps = uicdsIncident.getWorkProductMap();
        assertTrue("work product array wrong size", uicdsIncident.getWorkProductMap().size() > 0);
        boolean foundMap = false;
        for (String wpid : wps.keySet()) {
            UicdsWorkProduct p = wps.get(wpid);
//             System.out.println(wpid + ":" + p.type);
            if (p.type.startsWith("Map")) {
                foundMap = true;
            }
        }
        assertTrue("Map not found", foundMap);
    }

    @Test
    public void testWorkProductArray() {
        HashMap<String, UicdsWorkProduct> wps = uicdsIncident.getWorkProductMap();
        assertNotNull("work product map is null", wps);
        assertTrue("work product map is empty", wps.size() > 0);
        assertTrue("work product map is wrong size", wps.size() == 2);
        boolean foundIncident = false;
        boolean foundMap = false;
        for (String id : wps.keySet()) {
            if (wps.get(id).getType().startsWith(CoreServiceTemplateTestImpl.MAP_WORK_PRODUCT_TYPE)) {
                foundMap = true;
            }
            if (wps.get(id).getType().startsWith(
                    CoreServiceTemplateTestImpl.INCIDENT_WORK_PRODUCT_TYPE)) {
                foundIncident = true;
            }
        }
        assertTrue("Map work product not found", foundMap);
        assertTrue("Incident work product not found", foundIncident);
    }

    @Test
    public void testUpdateAllWorkProduts() {
        uicdsIncident.updateAllWorkProducts();
        assertTrue("work product array is empty", uicdsIncident.getWorkProductMap().size() > 0);
        UicdsWorkProduct p = uicdsIncident.getWorkProductMap().get(
                CoreServiceTemplateTestImpl.INCIDENT_WORK_PRODUCT_ID);
        assertTrue("work product is null", p != null);
    }

    @Test
    public void testCreateFromWorkProduct() {
        UicdsIncident u = new UicdsIncident();
        u.setCoreServiceTemplate(uicdsIncident.getCoreServiceTemplate());
        
        IdentificationType id = IdentificationType.Factory.newInstance();
        id.addNewIdentifier().setStringValue(CoreServiceTemplateTestImpl.INCIDENT_WORK_PRODUCT_ID);
        id.addNewType().setStringValue(CoreServiceTemplateTestImpl.INCIDENT_WORK_PRODUCT_TYPE);

        u.createFromWorkProduct(id);
        assertNotNull("incident id is null", u.getIncidentId());
        assertTrue("wrong incident id " + u.getIncidentId(), u.getIncidentId().equals(
                CoreServiceTemplateTestImpl.INCIDENT_ID));
    }

    @Test
    public void testUpdateIncident() {
        uicdsIncident.updateIncident();
    }

    /**
     * Test method for
     * {@link com.saic.dctd.uicds.core.UicdsIncident#addWorkProduct(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)}
     * .
     */

    @Test
    public void testAddWorkProduct() {
        UICDSIncidentType incidentType = UICDSIncidentType.Factory.newInstance();
        incidentType.addNewActivityName().setStringValue("NEW");
        
        IdentificationType id = IdentificationType.Factory.newInstance();
        WorkProduct wp = WorkProduct.Factory.newInstance();
        id.addNewIdentifier().setStringValue(OTHER_INCIDENT_WPID);
        id.addNewType().setStringValue(INCIDENT_WP_TYPE);
        UicdsWorkProduct.setIdentifierElement(wp.addNewPackageMetadata().addNewPackageMetadataExtensionAbstract(),id);
        
        PropertiesType properties = PropertiesType.Factory.newInstance();
        properties.addNewAssociatedGroups().addNewIdentifier().setStringValue(incidentType.getId());
        UicdsWorkProduct.setPropertiesElement(wp.getPackageMetadata().addNewPackageMetadataExtensionAbstract(), properties);
        
        uicdsIncident.addWorkProduct(INCIDENT_WPID, wp);
        assertTrue("work product array is empty", uicdsIncident.getWorkProductMap().size() > 0);
    }

    @Test
    public void testDeleteWorkProduct() {
        uicdsIncident.deleteWorkProduct(INCIDENT_WPID);
        assertTrue("work product array has wrong number of items ",
                uicdsIncident.getWorkProductMap().size() == 2);
    }

}
