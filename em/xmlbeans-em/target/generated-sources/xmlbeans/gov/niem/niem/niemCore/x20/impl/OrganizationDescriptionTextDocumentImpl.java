/*
 * An XML document type.
 * Localname: OrganizationDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationDescriptionText");
    
    
    /**
     * Gets the "OrganizationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getOrganizationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "OrganizationDescriptionText" element
     */
    public boolean isNilOrganizationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "OrganizationDescriptionText" element
     */
    public void setOrganizationDescriptionText(gov.niem.niem.niemCore.x20.TextType organizationDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONDESCRIPTIONTEXT$0);
            }
            target.set(organizationDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewOrganizationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "OrganizationDescriptionText" element
     */
    public void setNilOrganizationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
