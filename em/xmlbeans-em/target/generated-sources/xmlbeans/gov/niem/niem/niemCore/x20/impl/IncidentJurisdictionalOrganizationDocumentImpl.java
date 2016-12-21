/*
 * An XML document type.
 * Localname: IncidentJurisdictionalOrganization
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IncidentJurisdictionalOrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one IncidentJurisdictionalOrganization(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IncidentJurisdictionalOrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.IncidentJurisdictionalOrganizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentJurisdictionalOrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTJURISDICTIONALORGANIZATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IncidentJurisdictionalOrganization");
    
    
    /**
     * Gets the "IncidentJurisdictionalOrganization" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType getIncidentJurisdictionalOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(INCIDENTJURISDICTIONALORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IncidentJurisdictionalOrganization" element
     */
    public boolean isNilIncidentJurisdictionalOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(INCIDENTJURISDICTIONALORGANIZATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IncidentJurisdictionalOrganization" element
     */
    public void setIncidentJurisdictionalOrganization(gov.niem.niem.niemCore.x20.OrganizationType incidentJurisdictionalOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(INCIDENTJURISDICTIONALORGANIZATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().add_element_user(INCIDENTJURISDICTIONALORGANIZATION$0);
            }
            target.set(incidentJurisdictionalOrganization);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentJurisdictionalOrganization" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType addNewIncidentJurisdictionalOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().add_element_user(INCIDENTJURISDICTIONALORGANIZATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "IncidentJurisdictionalOrganization" element
     */
    public void setNilIncidentJurisdictionalOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(INCIDENTJURISDICTIONALORGANIZATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().add_element_user(INCIDENTJURISDICTIONALORGANIZATION$0);
            }
            target.setNil();
        }
    }
}
