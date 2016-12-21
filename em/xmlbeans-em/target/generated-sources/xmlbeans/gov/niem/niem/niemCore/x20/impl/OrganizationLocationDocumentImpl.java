/*
 * An XML document type.
 * Localname: OrganizationLocation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationLocationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationLocation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONLOCATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationLocation");
    
    
    /**
     * Gets the "OrganizationLocation" element
     */
    public gov.niem.niem.niemCore.x20.LocationType getOrganizationLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(ORGANIZATIONLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationLocation" element
     */
    public boolean isNilOrganizationLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(ORGANIZATIONLOCATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationLocation" element
     */
    public void setOrganizationLocation(gov.niem.niem.niemCore.x20.LocationType organizationLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(ORGANIZATIONLOCATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(ORGANIZATIONLOCATION$0);
            }
            target.set(organizationLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationLocation" element
     */
    public gov.niem.niem.niemCore.x20.LocationType addNewOrganizationLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(ORGANIZATIONLOCATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationLocation" element
     */
    public void setNilOrganizationLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(ORGANIZATIONLOCATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(ORGANIZATIONLOCATION$0);
            }
            target.setNil();
        }
    }
}
