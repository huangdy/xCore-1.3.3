/*
 * XML Type:  GetServicetListRequestType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetServicetListRequestType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML GetServicetListRequestType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class GetServicetListRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetServicetListRequestType
{
    private static final long serialVersionUID = 1L;
    
    public GetServicetListRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORENAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "coreName");
    
    
    /**
     * Gets the "coreName" element
     */
    public java.lang.String getCoreName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coreName" element
     */
    public org.apache.xmlbeans.XmlString xgetCoreName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "coreName" element
     */
    public void setCoreName(java.lang.String coreName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORENAME$0);
            }
            target.setStringValue(coreName);
        }
    }
    
    /**
     * Sets (as xml) the "coreName" element
     */
    public void xsetCoreName(org.apache.xmlbeans.XmlString coreName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORENAME$0);
            }
            target.set(coreName);
        }
    }
}
