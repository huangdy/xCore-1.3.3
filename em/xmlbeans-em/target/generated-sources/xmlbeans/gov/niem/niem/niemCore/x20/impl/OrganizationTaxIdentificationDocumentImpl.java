/*
 * An XML document type.
 * Localname: OrganizationTaxIdentification
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationTaxIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationTaxIdentification(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationTaxIdentificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationTaxIdentificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationTaxIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONTAXIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationTaxIdentification");
    
    
    /**
     * Gets the "OrganizationTaxIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType getOrganizationTaxIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONTAXIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationTaxIdentification" element
     */
    public boolean isNilOrganizationTaxIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONTAXIDENTIFICATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationTaxIdentification" element
     */
    public void setOrganizationTaxIdentification(gov.niem.niem.niemCore.x20.IdentificationType organizationTaxIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONTAXIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ORGANIZATIONTAXIDENTIFICATION$0);
            }
            target.set(organizationTaxIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationTaxIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType addNewOrganizationTaxIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ORGANIZATIONTAXIDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationTaxIdentification" element
     */
    public void setNilOrganizationTaxIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONTAXIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ORGANIZATIONTAXIDENTIFICATION$0);
            }
            target.setNil();
        }
    }
}
