/*
 * XML Type:  CoreLoginType
 * Namespace: http://uicds.org/CoreConfig
 * Java type: org.uicds.coreConfig.CoreLoginType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.coreConfig.impl;
/**
 * An XML CoreLoginType(@http://uicds.org/CoreConfig).
 *
 * This is a complex type.
 */
public class CoreLoginTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.coreConfig.CoreLoginType
{
    private static final long serialVersionUID = 1L;
    
    public CoreLoginTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "name");
    private static final javax.xml.namespace.QName USERROLE$2 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "userRole");
    private static final javax.xml.namespace.QName USERNAME$4 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "userName");
    private static final javax.xml.namespace.QName USERPASSWORD$6 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "userPassword");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "userRole" element
     */
    public java.lang.String getUserRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERROLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userRole" element
     */
    public org.apache.xmlbeans.XmlString xgetUserRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERROLE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "userRole" element
     */
    public void setUserRole(java.lang.String userRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERROLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERROLE$2);
            }
            target.setStringValue(userRole);
        }
    }
    
    /**
     * Sets (as xml) the "userRole" element
     */
    public void xsetUserRole(org.apache.xmlbeans.XmlString userRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERROLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERROLE$2);
            }
            target.set(userRole);
        }
    }
    
    /**
     * Gets the "userName" element
     */
    public java.lang.String getUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userName" element
     */
    public org.apache.xmlbeans.XmlString xgetUserName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "userName" element
     */
    public void setUserName(java.lang.String userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$4);
            }
            target.setStringValue(userName);
        }
    }
    
    /**
     * Sets (as xml) the "userName" element
     */
    public void xsetUserName(org.apache.xmlbeans.XmlString userName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$4);
            }
            target.set(userName);
        }
    }
    
    /**
     * Gets the "userPassword" element
     */
    public byte[] getUserPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERPASSWORD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "userPassword" element
     */
    public org.apache.xmlbeans.XmlHexBinary xgetUserPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(USERPASSWORD$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "userPassword" element
     */
    public void setUserPassword(byte[] userPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERPASSWORD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERPASSWORD$6);
            }
            target.setByteArrayValue(userPassword);
        }
    }
    
    /**
     * Sets (as xml) the "userPassword" element
     */
    public void xsetUserPassword(org.apache.xmlbeans.XmlHexBinary userPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlHexBinary target = null;
            target = (org.apache.xmlbeans.XmlHexBinary)get_store().find_element_user(USERPASSWORD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlHexBinary)get_store().add_element_user(USERPASSWORD$6);
            }
            target.set(userPassword);
        }
    }
}
