/*
 * An XML document type.
 * Localname: ContactRadioCategoryText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactRadioCategoryTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ContactRadioCategoryText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactRadioCategoryTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ContactRadioCategoryTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactRadioCategoryTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTRADIOCATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactRadioCategoryText");
    
    
    /**
     * Gets the "ContactRadioCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getContactRadioCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCATEGORYTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactRadioCategoryText" element
     */
    public boolean isNilContactRadioCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCATEGORYTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactRadioCategoryText" element
     */
    public void setContactRadioCategoryText(gov.niem.niem.niemCore.x20.TextType contactRadioCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CONTACTRADIOCATEGORYTEXT$0);
            }
            target.set(contactRadioCategoryText);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactRadioCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewContactRadioCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CONTACTRADIOCATEGORYTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactRadioCategoryText" element
     */
    public void setNilContactRadioCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CONTACTRADIOCATEGORYTEXT$0);
            }
            target.setNil();
        }
    }
}
