/*
 * XML Type:  ContactInformationType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.ContactInformationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML ContactInformationType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class ContactInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.ContactInformationType
{
    private static final long serialVersionUID = 1L;
    
    public ContactInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTPERSONPRIMARY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactPersonPrimary");
    private static final javax.xml.namespace.QName CONTACTPOSITION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactPosition");
    private static final javax.xml.namespace.QName CONTACTADDRESS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactAddress");
    private static final javax.xml.namespace.QName CONTACTVOICETELEPHONE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactVoiceTelephone");
    private static final javax.xml.namespace.QName CONTACTFACSIMILETELEPHONE$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactFacsimileTelephone");
    private static final javax.xml.namespace.QName CONTACTELECTRONICMAILADDRESS$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactElectronicMailAddress");
    
    
    /**
     * Gets the "ContactPersonPrimary" element
     */
    public net.opengis.context.ContactPersonPrimaryType getContactPersonPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ContactPersonPrimaryType target = null;
            target = (net.opengis.context.ContactPersonPrimaryType)get_store().find_element_user(CONTACTPERSONPRIMARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContactPersonPrimary" element
     */
    public boolean isSetContactPersonPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTPERSONPRIMARY$0) != 0;
        }
    }
    
    /**
     * Sets the "ContactPersonPrimary" element
     */
    public void setContactPersonPrimary(net.opengis.context.ContactPersonPrimaryType contactPersonPrimary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ContactPersonPrimaryType target = null;
            target = (net.opengis.context.ContactPersonPrimaryType)get_store().find_element_user(CONTACTPERSONPRIMARY$0, 0);
            if (target == null)
            {
                target = (net.opengis.context.ContactPersonPrimaryType)get_store().add_element_user(CONTACTPERSONPRIMARY$0);
            }
            target.set(contactPersonPrimary);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactPersonPrimary" element
     */
    public net.opengis.context.ContactPersonPrimaryType addNewContactPersonPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ContactPersonPrimaryType target = null;
            target = (net.opengis.context.ContactPersonPrimaryType)get_store().add_element_user(CONTACTPERSONPRIMARY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ContactPersonPrimary" element
     */
    public void unsetContactPersonPrimary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTPERSONPRIMARY$0, 0);
        }
    }
    
    /**
     * Gets the "ContactPosition" element
     */
    public java.lang.String getContactPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTPOSITION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactPosition" element
     */
    public org.apache.xmlbeans.XmlString xgetContactPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTPOSITION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactPosition" element
     */
    public boolean isSetContactPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTPOSITION$2) != 0;
        }
    }
    
    /**
     * Sets the "ContactPosition" element
     */
    public void setContactPosition(java.lang.String contactPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTPOSITION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTPOSITION$2);
            }
            target.setStringValue(contactPosition);
        }
    }
    
    /**
     * Sets (as xml) the "ContactPosition" element
     */
    public void xsetContactPosition(org.apache.xmlbeans.XmlString contactPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTPOSITION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTPOSITION$2);
            }
            target.set(contactPosition);
        }
    }
    
    /**
     * Unsets the "ContactPosition" element
     */
    public void unsetContactPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTPOSITION$2, 0);
        }
    }
    
    /**
     * Gets the "ContactAddress" element
     */
    public net.opengis.context.AddressType getContactAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.AddressType target = null;
            target = (net.opengis.context.AddressType)get_store().find_element_user(CONTACTADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContactAddress" element
     */
    public boolean isSetContactAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "ContactAddress" element
     */
    public void setContactAddress(net.opengis.context.AddressType contactAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.AddressType target = null;
            target = (net.opengis.context.AddressType)get_store().find_element_user(CONTACTADDRESS$4, 0);
            if (target == null)
            {
                target = (net.opengis.context.AddressType)get_store().add_element_user(CONTACTADDRESS$4);
            }
            target.set(contactAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactAddress" element
     */
    public net.opengis.context.AddressType addNewContactAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.AddressType target = null;
            target = (net.opengis.context.AddressType)get_store().add_element_user(CONTACTADDRESS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ContactAddress" element
     */
    public void unsetContactAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTADDRESS$4, 0);
        }
    }
    
    /**
     * Gets the "ContactVoiceTelephone" element
     */
    public java.lang.String getContactVoiceTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTVOICETELEPHONE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactVoiceTelephone" element
     */
    public org.apache.xmlbeans.XmlString xgetContactVoiceTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTVOICETELEPHONE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactVoiceTelephone" element
     */
    public boolean isSetContactVoiceTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTVOICETELEPHONE$6) != 0;
        }
    }
    
    /**
     * Sets the "ContactVoiceTelephone" element
     */
    public void setContactVoiceTelephone(java.lang.String contactVoiceTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTVOICETELEPHONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTVOICETELEPHONE$6);
            }
            target.setStringValue(contactVoiceTelephone);
        }
    }
    
    /**
     * Sets (as xml) the "ContactVoiceTelephone" element
     */
    public void xsetContactVoiceTelephone(org.apache.xmlbeans.XmlString contactVoiceTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTVOICETELEPHONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTVOICETELEPHONE$6);
            }
            target.set(contactVoiceTelephone);
        }
    }
    
    /**
     * Unsets the "ContactVoiceTelephone" element
     */
    public void unsetContactVoiceTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTVOICETELEPHONE$6, 0);
        }
    }
    
    /**
     * Gets the "ContactFacsimileTelephone" element
     */
    public java.lang.String getContactFacsimileTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTFACSIMILETELEPHONE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactFacsimileTelephone" element
     */
    public org.apache.xmlbeans.XmlString xgetContactFacsimileTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTFACSIMILETELEPHONE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactFacsimileTelephone" element
     */
    public boolean isSetContactFacsimileTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTFACSIMILETELEPHONE$8) != 0;
        }
    }
    
    /**
     * Sets the "ContactFacsimileTelephone" element
     */
    public void setContactFacsimileTelephone(java.lang.String contactFacsimileTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTFACSIMILETELEPHONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTFACSIMILETELEPHONE$8);
            }
            target.setStringValue(contactFacsimileTelephone);
        }
    }
    
    /**
     * Sets (as xml) the "ContactFacsimileTelephone" element
     */
    public void xsetContactFacsimileTelephone(org.apache.xmlbeans.XmlString contactFacsimileTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTFACSIMILETELEPHONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTFACSIMILETELEPHONE$8);
            }
            target.set(contactFacsimileTelephone);
        }
    }
    
    /**
     * Unsets the "ContactFacsimileTelephone" element
     */
    public void unsetContactFacsimileTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTFACSIMILETELEPHONE$8, 0);
        }
    }
    
    /**
     * Gets the "ContactElectronicMailAddress" element
     */
    public java.lang.String getContactElectronicMailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTELECTRONICMAILADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactElectronicMailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetContactElectronicMailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTELECTRONICMAILADDRESS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactElectronicMailAddress" element
     */
    public boolean isSetContactElectronicMailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTELECTRONICMAILADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "ContactElectronicMailAddress" element
     */
    public void setContactElectronicMailAddress(java.lang.String contactElectronicMailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTELECTRONICMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTELECTRONICMAILADDRESS$10);
            }
            target.setStringValue(contactElectronicMailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "ContactElectronicMailAddress" element
     */
    public void xsetContactElectronicMailAddress(org.apache.xmlbeans.XmlString contactElectronicMailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTELECTRONICMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTELECTRONICMAILADDRESS$10);
            }
            target.set(contactElectronicMailAddress);
        }
    }
    
    /**
     * Unsets the "ContactElectronicMailAddress" element
     */
    public void unsetContactElectronicMailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTELECTRONICMAILADDRESS$10, 0);
        }
    }
}
