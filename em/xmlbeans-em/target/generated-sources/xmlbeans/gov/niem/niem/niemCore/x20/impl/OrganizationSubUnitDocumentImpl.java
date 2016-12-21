/*
 * An XML document type.
 * Localname: OrganizationSubUnit
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationSubUnitDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationSubUnit(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationSubUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationSubUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationSubUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONSUBUNIT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationSubUnit");
    
    
    /**
     * Gets the "OrganizationSubUnit" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType getOrganizationSubUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(ORGANIZATIONSUBUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationSubUnit" element
     */
    public boolean isNilOrganizationSubUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(ORGANIZATIONSUBUNIT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationSubUnit" element
     */
    public void setOrganizationSubUnit(gov.niem.niem.niemCore.x20.OrganizationType organizationSubUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(ORGANIZATIONSUBUNIT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().add_element_user(ORGANIZATIONSUBUNIT$0);
            }
            target.set(organizationSubUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationSubUnit" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType addNewOrganizationSubUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().add_element_user(ORGANIZATIONSUBUNIT$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationSubUnit" element
     */
    public void setNilOrganizationSubUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(ORGANIZATIONSUBUNIT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().add_element_user(ORGANIZATIONSUBUNIT$0);
            }
            target.setNil();
        }
    }
}
