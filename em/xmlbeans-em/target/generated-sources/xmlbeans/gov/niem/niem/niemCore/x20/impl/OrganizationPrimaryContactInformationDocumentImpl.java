/*
 * An XML document type.
 * Localname: OrganizationPrimaryContactInformation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationPrimaryContactInformationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationPrimaryContactInformation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationPrimaryContactInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationPrimaryContactInformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationPrimaryContactInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONPRIMARYCONTACTINFORMATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationPrimaryContactInformation");
    
    
    /**
     * Gets the "OrganizationPrimaryContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType getOrganizationPrimaryContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationPrimaryContactInformation" element
     */
    public boolean isNilOrganizationPrimaryContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationPrimaryContactInformation" element
     */
    public void setOrganizationPrimaryContactInformation(gov.niem.niem.niemCore.x20.ContactInformationType organizationPrimaryContactInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().add_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$0);
            }
            target.set(organizationPrimaryContactInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationPrimaryContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType addNewOrganizationPrimaryContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().add_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationPrimaryContactInformation" element
     */
    public void setNilOrganizationPrimaryContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().add_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$0);
            }
            target.setNil();
        }
    }
}
