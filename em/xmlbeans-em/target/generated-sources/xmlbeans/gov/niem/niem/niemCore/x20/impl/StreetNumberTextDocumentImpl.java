/*
 * An XML document type.
 * Localname: StreetNumberText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StreetNumberTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one StreetNumberText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class StreetNumberTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.StreetNumberTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public StreetNumberTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETNUMBERTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StreetNumberText");
    
    
    /**
     * Gets the "StreetNumberText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getStreetNumberText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STREETNUMBERTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StreetNumberText" element
     */
    public boolean isNilStreetNumberText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STREETNUMBERTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StreetNumberText" element
     */
    public void setStreetNumberText(gov.niem.niem.niemCore.x20.TextType streetNumberText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STREETNUMBERTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(STREETNUMBERTEXT$0);
            }
            target.set(streetNumberText);
        }
    }
    
    /**
     * Appends and returns a new empty "StreetNumberText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewStreetNumberText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(STREETNUMBERTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "StreetNumberText" element
     */
    public void setNilStreetNumberText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STREETNUMBERTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(STREETNUMBERTEXT$0);
            }
            target.setNil();
        }
    }
}
