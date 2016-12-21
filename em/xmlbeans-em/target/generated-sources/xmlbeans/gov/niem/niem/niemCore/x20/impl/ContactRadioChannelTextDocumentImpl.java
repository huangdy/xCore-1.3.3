/*
 * An XML document type.
 * Localname: ContactRadioChannelText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactRadioChannelTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ContactRadioChannelText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactRadioChannelTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ContactRadioChannelTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactRadioChannelTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTRADIOCHANNELTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactRadioChannelText");
    
    
    /**
     * Gets the "ContactRadioChannelText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getContactRadioChannelText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCHANNELTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactRadioChannelText" element
     */
    public boolean isNilContactRadioChannelText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCHANNELTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactRadioChannelText" element
     */
    public void setContactRadioChannelText(gov.niem.niem.niemCore.x20.TextType contactRadioChannelText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCHANNELTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CONTACTRADIOCHANNELTEXT$0);
            }
            target.set(contactRadioChannelText);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactRadioChannelText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewContactRadioChannelText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CONTACTRADIOCHANNELTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactRadioChannelText" element
     */
    public void setNilContactRadioChannelText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCHANNELTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CONTACTRADIOCHANNELTEXT$0);
            }
            target.setNil();
        }
    }
}
