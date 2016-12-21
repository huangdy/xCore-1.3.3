/*
 * An XML document type.
 * Localname: OrganizationStatus
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationStatusDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationStatus(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONSTATUS$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationStatus");
    
    
    /**
     * Gets the "OrganizationStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType getOrganizationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ORGANIZATIONSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationStatus" element
     */
    public boolean isNilOrganizationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ORGANIZATIONSTATUS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationStatus" element
     */
    public void setOrganizationStatus(gov.niem.niem.niemCore.x20.StatusType organizationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ORGANIZATIONSTATUS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.StatusType)get_store().add_element_user(ORGANIZATIONSTATUS$0);
            }
            target.set(organizationStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType addNewOrganizationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().add_element_user(ORGANIZATIONSTATUS$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationStatus" element
     */
    public void setNilOrganizationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ORGANIZATIONSTATUS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.StatusType)get_store().add_element_user(ORGANIZATIONSTATUS$0);
            }
            target.setNil();
        }
    }
}
