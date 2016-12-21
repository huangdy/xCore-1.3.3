/*
 * An XML document type.
 * Localname: CapabilityCategoryText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CapabilityCategoryTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one CapabilityCategoryText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class CapabilityCategoryTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.CapabilityCategoryTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapabilityCategoryTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPABILITYCATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CapabilityCategoryText");
    
    
    /**
     * Gets the "CapabilityCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getCapabilityCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYCATEGORYTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CapabilityCategoryText" element
     */
    public boolean isNilCapabilityCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYCATEGORYTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CapabilityCategoryText" element
     */
    public void setCapabilityCategoryText(gov.niem.niem.niemCore.x20.TextType capabilityCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYCATEGORYTEXT$0);
            }
            target.set(capabilityCategoryText);
        }
    }
    
    /**
     * Appends and returns a new empty "CapabilityCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewCapabilityCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYCATEGORYTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "CapabilityCategoryText" element
     */
    public void setNilCapabilityCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYCATEGORYTEXT$0);
            }
            target.setNil();
        }
    }
}
