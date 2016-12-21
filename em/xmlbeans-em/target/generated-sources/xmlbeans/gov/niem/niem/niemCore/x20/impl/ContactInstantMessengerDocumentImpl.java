/*
 * An XML document type.
 * Localname: ContactInstantMessenger
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactInstantMessengerDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ContactInstantMessenger(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactInstantMessengerDocumentImpl extends gov.niem.niem.niemCore.x20.impl.ContactMeansDocumentImpl implements gov.niem.niem.niemCore.x20.ContactInstantMessengerDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactInstantMessengerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTINSTANTMESSENGER$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactInstantMessenger");
    
    
    /**
     * Gets the "ContactInstantMessenger" element
     */
    public gov.niem.niem.niemCore.x20.InstantMessengerType getContactInstantMessenger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InstantMessengerType target = null;
            target = (gov.niem.niem.niemCore.x20.InstantMessengerType)get_store().find_element_user(CONTACTINSTANTMESSENGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactInstantMessenger" element
     */
    public boolean isNilContactInstantMessenger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InstantMessengerType target = null;
            target = (gov.niem.niem.niemCore.x20.InstantMessengerType)get_store().find_element_user(CONTACTINSTANTMESSENGER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactInstantMessenger" element
     */
    public void setContactInstantMessenger(gov.niem.niem.niemCore.x20.InstantMessengerType contactInstantMessenger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InstantMessengerType target = null;
            target = (gov.niem.niem.niemCore.x20.InstantMessengerType)get_store().find_element_user(CONTACTINSTANTMESSENGER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.InstantMessengerType)get_store().add_element_user(CONTACTINSTANTMESSENGER$0);
            }
            target.set(contactInstantMessenger);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactInstantMessenger" element
     */
    public gov.niem.niem.niemCore.x20.InstantMessengerType addNewContactInstantMessenger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InstantMessengerType target = null;
            target = (gov.niem.niem.niemCore.x20.InstantMessengerType)get_store().add_element_user(CONTACTINSTANTMESSENGER$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactInstantMessenger" element
     */
    public void setNilContactInstantMessenger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InstantMessengerType target = null;
            target = (gov.niem.niem.niemCore.x20.InstantMessengerType)get_store().find_element_user(CONTACTINSTANTMESSENGER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.InstantMessengerType)get_store().add_element_user(CONTACTINSTANTMESSENGER$0);
            }
            target.setNil();
        }
    }
}
