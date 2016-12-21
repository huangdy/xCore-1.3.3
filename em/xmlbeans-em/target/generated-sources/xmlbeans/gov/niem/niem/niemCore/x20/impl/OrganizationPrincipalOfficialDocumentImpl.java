/*
 * An XML document type.
 * Localname: OrganizationPrincipalOfficial
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationPrincipalOfficialDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationPrincipalOfficial(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationPrincipalOfficialDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationPrincipalOfficialDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationPrincipalOfficialDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONPRINCIPALOFFICIAL$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationPrincipalOfficial");
    
    
    /**
     * Gets the "OrganizationPrincipalOfficial" element
     */
    public gov.niem.niem.niemCore.x20.PersonType getOrganizationPrincipalOfficial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().find_element_user(ORGANIZATIONPRINCIPALOFFICIAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationPrincipalOfficial" element
     */
    public boolean isNilOrganizationPrincipalOfficial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().find_element_user(ORGANIZATIONPRINCIPALOFFICIAL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationPrincipalOfficial" element
     */
    public void setOrganizationPrincipalOfficial(gov.niem.niem.niemCore.x20.PersonType organizationPrincipalOfficial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().find_element_user(ORGANIZATIONPRINCIPALOFFICIAL$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonType)get_store().add_element_user(ORGANIZATIONPRINCIPALOFFICIAL$0);
            }
            target.set(organizationPrincipalOfficial);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationPrincipalOfficial" element
     */
    public gov.niem.niem.niemCore.x20.PersonType addNewOrganizationPrincipalOfficial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().add_element_user(ORGANIZATIONPRINCIPALOFFICIAL$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationPrincipalOfficial" element
     */
    public void setNilOrganizationPrincipalOfficial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().find_element_user(ORGANIZATIONPRINCIPALOFFICIAL$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonType)get_store().add_element_user(ORGANIZATIONPRINCIPALOFFICIAL$0);
            }
            target.setNil();
        }
    }
}
