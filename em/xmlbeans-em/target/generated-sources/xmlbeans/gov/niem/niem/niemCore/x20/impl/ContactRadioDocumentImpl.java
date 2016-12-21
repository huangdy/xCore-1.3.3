/*
 * An XML document type.
 * Localname: ContactRadio
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactRadioDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ContactRadio(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactRadioDocumentImpl extends gov.niem.niem.niemCore.x20.impl.ContactMeansDocumentImpl implements gov.niem.niem.niemCore.x20.ContactRadioDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactRadioDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTRADIO$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactRadio");
    
    
    /**
     * Gets the "ContactRadio" element
     */
    public gov.niem.niem.niemCore.x20.ContactRadioType getContactRadio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactRadioType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactRadioType)get_store().find_element_user(CONTACTRADIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactRadio" element
     */
    public boolean isNilContactRadio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactRadioType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactRadioType)get_store().find_element_user(CONTACTRADIO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactRadio" element
     */
    public void setContactRadio(gov.niem.niem.niemCore.x20.ContactRadioType contactRadio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactRadioType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactRadioType)get_store().find_element_user(CONTACTRADIO$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ContactRadioType)get_store().add_element_user(CONTACTRADIO$0);
            }
            target.set(contactRadio);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactRadio" element
     */
    public gov.niem.niem.niemCore.x20.ContactRadioType addNewContactRadio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactRadioType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactRadioType)get_store().add_element_user(CONTACTRADIO$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactRadio" element
     */
    public void setNilContactRadio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactRadioType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactRadioType)get_store().find_element_user(CONTACTRADIO$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ContactRadioType)get_store().add_element_user(CONTACTRADIO$0);
            }
            target.setNil();
        }
    }
}
