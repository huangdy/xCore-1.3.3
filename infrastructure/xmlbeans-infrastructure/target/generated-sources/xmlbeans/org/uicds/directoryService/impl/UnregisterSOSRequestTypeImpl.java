/*
 * XML Type:  UnregisterSOSRequestType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.UnregisterSOSRequestType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML UnregisterSOSRequestType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class UnregisterSOSRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.UnregisterSOSRequestType
{
    private static final long serialVersionUID = 1L;
    
    public UnregisterSOSRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOSID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "sosID");
    
    
    /**
     * Gets the "sosID" element
     */
    public java.lang.String getSosID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sosID" element
     */
    public org.apache.xmlbeans.XmlString xgetSosID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOSID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sosID" element
     */
    public void setSosID(java.lang.String sosID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOSID$0);
            }
            target.setStringValue(sosID);
        }
    }
    
    /**
     * Sets (as xml) the "sosID" element
     */
    public void xsetSosID(org.apache.xmlbeans.XmlString sosID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOSID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOSID$0);
            }
            target.set(sosID);
        }
    }
}
