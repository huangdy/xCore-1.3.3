/*
 * An XML document type.
 * Localname: OrganizationIdentification
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationIdentification(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationIdentificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationIdentificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationIdentification");
    
    
    /**
     * Gets the "OrganizationIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType getOrganizationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationIdentification" element
     */
    public boolean isNilOrganizationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONIDENTIFICATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationIdentification" element
     */
    public void setOrganizationIdentification(gov.niem.niem.niemCore.x20.IdentificationType organizationIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ORGANIZATIONIDENTIFICATION$0);
            }
            target.set(organizationIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType addNewOrganizationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ORGANIZATIONIDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationIdentification" element
     */
    public void setNilOrganizationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ORGANIZATIONIDENTIFICATION$0);
            }
            target.setNil();
        }
    }
}
