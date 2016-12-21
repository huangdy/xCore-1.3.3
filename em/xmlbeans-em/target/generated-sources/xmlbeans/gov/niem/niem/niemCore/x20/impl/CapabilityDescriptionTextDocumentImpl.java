/*
 * An XML document type.
 * Localname: CapabilityDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CapabilityDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one CapabilityDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class CapabilityDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.CapabilityDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapabilityDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPABILITYDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CapabilityDescriptionText");
    
    
    /**
     * Gets the "CapabilityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getCapabilityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CapabilityDescriptionText" element
     */
    public boolean isNilCapabilityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CapabilityDescriptionText" element
     */
    public void setCapabilityDescriptionText(gov.niem.niem.niemCore.x20.TextType capabilityDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYDESCRIPTIONTEXT$0);
            }
            target.set(capabilityDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "CapabilityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewCapabilityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "CapabilityDescriptionText" element
     */
    public void setNilCapabilityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
