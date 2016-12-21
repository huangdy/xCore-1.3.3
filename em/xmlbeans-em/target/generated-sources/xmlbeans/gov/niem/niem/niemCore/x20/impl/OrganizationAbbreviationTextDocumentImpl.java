/*
 * An XML document type.
 * Localname: OrganizationAbbreviationText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationAbbreviationTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationAbbreviationText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationAbbreviationTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationAbbreviationTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationAbbreviationTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONABBREVIATIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationAbbreviationText");
    
    
    /**
     * Gets the "OrganizationAbbreviationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getOrganizationAbbreviationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONABBREVIATIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationAbbreviationText" element
     */
    public boolean isNilOrganizationAbbreviationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONABBREVIATIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationAbbreviationText" element
     */
    public void setOrganizationAbbreviationText(gov.niem.niem.niemCore.x20.TextType organizationAbbreviationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONABBREVIATIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONABBREVIATIONTEXT$0);
            }
            target.set(organizationAbbreviationText);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationAbbreviationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewOrganizationAbbreviationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONABBREVIATIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationAbbreviationText" element
     */
    public void setNilOrganizationAbbreviationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONABBREVIATIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONABBREVIATIONTEXT$0);
            }
            target.setNil();
        }
    }
}
