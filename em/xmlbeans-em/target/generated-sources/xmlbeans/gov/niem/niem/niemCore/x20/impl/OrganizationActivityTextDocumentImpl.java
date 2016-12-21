/*
 * An XML document type.
 * Localname: OrganizationActivityText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationActivityTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationActivityText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationActivityTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationActivityTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationActivityTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONACTIVITYTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationActivityText");
    
    
    /**
     * Gets the "OrganizationActivityText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getOrganizationActivityText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONACTIVITYTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationActivityText" element
     */
    public boolean isNilOrganizationActivityText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONACTIVITYTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationActivityText" element
     */
    public void setOrganizationActivityText(gov.niem.niem.niemCore.x20.TextType organizationActivityText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONACTIVITYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONACTIVITYTEXT$0);
            }
            target.set(organizationActivityText);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationActivityText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewOrganizationActivityText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONACTIVITYTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationActivityText" element
     */
    public void setNilOrganizationActivityText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONACTIVITYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONACTIVITYTEXT$0);
            }
            target.setNil();
        }
    }
}
