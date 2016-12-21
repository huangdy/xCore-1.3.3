/*
 * An XML document type.
 * Localname: RelativeLocationDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.RelativeLocationDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one RelativeLocationDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class RelativeLocationDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.RelativeLocationDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelativeLocationDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIVELOCATIONDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationDescriptionText");
    
    
    /**
     * Gets the "RelativeLocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getRelativeLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelativeLocationDescriptionText" element
     */
    public boolean isNilRelativeLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelativeLocationDescriptionText" element
     */
    public void setRelativeLocationDescriptionText(gov.niem.niem.niemCore.x20.TextType relativeLocationDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0);
            }
            target.set(relativeLocationDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "RelativeLocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewRelativeLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelativeLocationDescriptionText" element
     */
    public void setNilRelativeLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
