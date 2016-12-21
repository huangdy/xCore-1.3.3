/*
 * An XML document type.
 * Localname: PersonNamePrefixText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonNamePrefixTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonNamePrefixText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonNamePrefixTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonNamePrefixTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonNamePrefixTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONNAMEPREFIXTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonNamePrefixText");
    
    
    /**
     * Gets the "PersonNamePrefixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getPersonNamePrefixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMEPREFIXTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonNamePrefixText" element
     */
    public boolean isNilPersonNamePrefixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMEPREFIXTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonNamePrefixText" element
     */
    public void setPersonNamePrefixText(gov.niem.niem.niemCore.x20.TextType personNamePrefixText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMEPREFIXTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(PERSONNAMEPREFIXTEXT$0);
            }
            target.set(personNamePrefixText);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonNamePrefixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewPersonNamePrefixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(PERSONNAMEPREFIXTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonNamePrefixText" element
     */
    public void setNilPersonNamePrefixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMEPREFIXTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(PERSONNAMEPREFIXTEXT$0);
            }
            target.setNil();
        }
    }
}
