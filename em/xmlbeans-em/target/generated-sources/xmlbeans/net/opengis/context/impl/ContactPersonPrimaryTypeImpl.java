/*
 * XML Type:  ContactPersonPrimaryType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.ContactPersonPrimaryType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML ContactPersonPrimaryType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class ContactPersonPrimaryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.ContactPersonPrimaryType
{
    private static final long serialVersionUID = 1L;
    
    public ContactPersonPrimaryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTPERSON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactPerson");
    private static final javax.xml.namespace.QName CONTACTORGANIZATION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactOrganization");
    
    
    /**
     * Gets the "ContactPerson" element
     */
    public java.lang.String getContactPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTPERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactPerson" element
     */
    public org.apache.xmlbeans.XmlString xgetContactPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTPERSON$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactPerson" element
     */
    public boolean isSetContactPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTPERSON$0) != 0;
        }
    }
    
    /**
     * Sets the "ContactPerson" element
     */
    public void setContactPerson(java.lang.String contactPerson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTPERSON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTPERSON$0);
            }
            target.setStringValue(contactPerson);
        }
    }
    
    /**
     * Sets (as xml) the "ContactPerson" element
     */
    public void xsetContactPerson(org.apache.xmlbeans.XmlString contactPerson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTPERSON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTPERSON$0);
            }
            target.set(contactPerson);
        }
    }
    
    /**
     * Unsets the "ContactPerson" element
     */
    public void unsetContactPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTPERSON$0, 0);
        }
    }
    
    /**
     * Gets the "ContactOrganization" element
     */
    public java.lang.String getContactOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTORGANIZATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactOrganization" element
     */
    public org.apache.xmlbeans.XmlString xgetContactOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTORGANIZATION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactOrganization" element
     */
    public boolean isSetContactOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTORGANIZATION$2) != 0;
        }
    }
    
    /**
     * Sets the "ContactOrganization" element
     */
    public void setContactOrganization(java.lang.String contactOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTORGANIZATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTORGANIZATION$2);
            }
            target.setStringValue(contactOrganization);
        }
    }
    
    /**
     * Sets (as xml) the "ContactOrganization" element
     */
    public void xsetContactOrganization(org.apache.xmlbeans.XmlString contactOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACTORGANIZATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACTORGANIZATION$2);
            }
            target.set(contactOrganization);
        }
    }
    
    /**
     * Unsets the "ContactOrganization" element
     */
    public void unsetContactOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTORGANIZATION$2, 0);
        }
    }
}
