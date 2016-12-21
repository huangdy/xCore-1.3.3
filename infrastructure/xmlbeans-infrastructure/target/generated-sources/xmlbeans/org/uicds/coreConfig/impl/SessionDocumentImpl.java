/*
 * An XML document type.
 * Localname: Session
 * Namespace: http://uicds.org/CoreConfig
 * Java type: org.uicds.coreConfig.SessionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.coreConfig.impl;
/**
 * A document containing one Session(@http://uicds.org/CoreConfig) element.
 *
 * This is a complex type.
 */
public class SessionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.coreConfig.SessionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SessionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SESSION$0 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "Session");
    
    
    /**
     * Gets the "Session" element
     */
    public org.uicds.coreConfig.SessionType getSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.SessionType target = null;
            target = (org.uicds.coreConfig.SessionType)get_store().find_element_user(SESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Session" element
     */
    public void setSession(org.uicds.coreConfig.SessionType session)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.SessionType target = null;
            target = (org.uicds.coreConfig.SessionType)get_store().find_element_user(SESSION$0, 0);
            if (target == null)
            {
                target = (org.uicds.coreConfig.SessionType)get_store().add_element_user(SESSION$0);
            }
            target.set(session);
        }
    }
    
    /**
     * Appends and returns a new empty "Session" element
     */
    public org.uicds.coreConfig.SessionType addNewSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.SessionType target = null;
            target = (org.uicds.coreConfig.SessionType)get_store().add_element_user(SESSION$0);
            return target;
        }
    }
}
