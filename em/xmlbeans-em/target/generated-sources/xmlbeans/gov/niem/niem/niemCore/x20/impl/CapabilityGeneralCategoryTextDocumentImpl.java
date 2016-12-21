/*
 * An XML document type.
 * Localname: CapabilityGeneralCategoryText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CapabilityGeneralCategoryTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one CapabilityGeneralCategoryText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class CapabilityGeneralCategoryTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.CapabilityGeneralCategoryTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapabilityGeneralCategoryTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPABILITYGENERALCATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CapabilityGeneralCategoryText");
    
    
    /**
     * Gets the "CapabilityGeneralCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getCapabilityGeneralCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYGENERALCATEGORYTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CapabilityGeneralCategoryText" element
     */
    public boolean isNilCapabilityGeneralCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYGENERALCATEGORYTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CapabilityGeneralCategoryText" element
     */
    public void setCapabilityGeneralCategoryText(gov.niem.niem.niemCore.x20.TextType capabilityGeneralCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYGENERALCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYGENERALCATEGORYTEXT$0);
            }
            target.set(capabilityGeneralCategoryText);
        }
    }
    
    /**
     * Appends and returns a new empty "CapabilityGeneralCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewCapabilityGeneralCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYGENERALCATEGORYTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "CapabilityGeneralCategoryText" element
     */
    public void setNilCapabilityGeneralCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYGENERALCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYGENERALCATEGORYTEXT$0);
            }
            target.setNil();
        }
    }
}
