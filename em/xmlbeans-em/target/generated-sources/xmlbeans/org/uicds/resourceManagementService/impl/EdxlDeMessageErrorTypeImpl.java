/*
 * XML Type:  EdxlDeMessageErrorType
 * Namespace: http://uicds.org/ResourceManagementService
 * Java type: org.uicds.resourceManagementService.EdxlDeMessageErrorType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceManagementService.impl;
/**
 * An XML EdxlDeMessageErrorType(@http://uicds.org/ResourceManagementService).
 *
 * This is a complex type.
 */
public class EdxlDeMessageErrorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.EdxlDeMessageErrorType
{
    private static final long serialVersionUID = 1L;
    
    public EdxlDeMessageErrorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORENAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "coreName");
    private static final javax.xml.namespace.QName ERROR$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "error");
    
    
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
    
    /**
     * Gets the "error" element
     */
    public java.lang.String getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "error" element
     */
    public org.apache.xmlbeans.XmlString xgetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$2);
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) the "error" element
     */
    public void xsetError(org.apache.xmlbeans.XmlString error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$2);
            }
            target.set(error);
        }
    }
}
