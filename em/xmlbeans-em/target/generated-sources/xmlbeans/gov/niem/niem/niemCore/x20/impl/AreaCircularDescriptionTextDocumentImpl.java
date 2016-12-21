/*
 * An XML document type.
 * Localname: AreaCircularDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.AreaCircularDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one AreaCircularDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AreaCircularDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.AreaCircularDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public AreaCircularDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREACIRCULARDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaCircularDescriptionText");
    
    
    /**
     * Gets the "AreaCircularDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getAreaCircularDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREACIRCULARDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AreaCircularDescriptionText" element
     */
    public boolean isNilAreaCircularDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREACIRCULARDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AreaCircularDescriptionText" element
     */
    public void setAreaCircularDescriptionText(gov.niem.niem.niemCore.x20.TextType areaCircularDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREACIRCULARDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(AREACIRCULARDESCRIPTIONTEXT$0);
            }
            target.set(areaCircularDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "AreaCircularDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewAreaCircularDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(AREACIRCULARDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "AreaCircularDescriptionText" element
     */
    public void setNilAreaCircularDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREACIRCULARDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(AREACIRCULARDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
