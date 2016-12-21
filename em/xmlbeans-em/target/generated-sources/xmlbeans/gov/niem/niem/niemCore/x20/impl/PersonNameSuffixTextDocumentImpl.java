/*
 * An XML document type.
 * Localname: PersonNameSuffixText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonNameSuffixTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonNameSuffixText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonNameSuffixTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonNameSuffixTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonNameSuffixTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONNAMESUFFIXTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonNameSuffixText");
    
    
    /**
     * Gets the "PersonNameSuffixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getPersonNameSuffixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMESUFFIXTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonNameSuffixText" element
     */
    public boolean isNilPersonNameSuffixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMESUFFIXTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonNameSuffixText" element
     */
    public void setPersonNameSuffixText(gov.niem.niem.niemCore.x20.TextType personNameSuffixText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMESUFFIXTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(PERSONNAMESUFFIXTEXT$0);
            }
            target.set(personNameSuffixText);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonNameSuffixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewPersonNameSuffixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(PERSONNAMESUFFIXTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonNameSuffixText" element
     */
    public void setNilPersonNameSuffixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMESUFFIXTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(PERSONNAMESUFFIXTEXT$0);
            }
            target.setNil();
        }
    }
}
