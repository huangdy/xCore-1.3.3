/*
 * An XML document type.
 * Localname: Login
 * Namespace: http://uicds.org/CoreConfig
 * Java type: org.uicds.coreConfig.LoginDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.coreConfig.impl;
/**
 * A document containing one Login(@http://uicds.org/CoreConfig) element.
 *
 * This is a complex type.
 */
public class LoginDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.coreConfig.LoginDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoginDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGIN$0 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "Login");
    
    
    /**
     * Gets the "Login" element
     */
    public org.uicds.coreConfig.CoreLoginType getLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreLoginType target = null;
            target = (org.uicds.coreConfig.CoreLoginType)get_store().find_element_user(LOGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Login" element
     */
    public void setLogin(org.uicds.coreConfig.CoreLoginType login)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreLoginType target = null;
            target = (org.uicds.coreConfig.CoreLoginType)get_store().find_element_user(LOGIN$0, 0);
            if (target == null)
            {
                target = (org.uicds.coreConfig.CoreLoginType)get_store().add_element_user(LOGIN$0);
            }
            target.set(login);
        }
    }
    
    /**
     * Appends and returns a new empty "Login" element
     */
    public org.uicds.coreConfig.CoreLoginType addNewLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreLoginType target = null;
            target = (org.uicds.coreConfig.CoreLoginType)get_store().add_element_user(LOGIN$0);
            return target;
        }
    }
}
