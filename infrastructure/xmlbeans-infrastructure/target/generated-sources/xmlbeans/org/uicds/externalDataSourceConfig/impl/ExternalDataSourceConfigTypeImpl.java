/*
 * XML Type:  ExternalDataSourceConfigType
 * Namespace: http://uicds.org/ExternalDataSourceConfig
 * Java type: org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalDataSourceConfig.impl;
/**
 * An XML ExternalDataSourceConfigType(@http://uicds.org/ExternalDataSourceConfig).
 *
 * This is a complex type.
 */
public class ExternalDataSourceConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType
{
    private static final long serialVersionUID = 1L;
    
    public ExternalDataSourceConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalDataSourceConfig", "URN");
    private static final javax.xml.namespace.QName CORENAME$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalDataSourceConfig", "coreName");
    
    
    /**
     * Gets the "URN" element
     */
    public java.lang.String getURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URN" element
     */
    public org.apache.xmlbeans.XmlString xgetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "URN" element
     */
    public void setURN(java.lang.String urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URN$0);
            }
            target.setStringValue(urn);
        }
    }
    
    /**
     * Sets (as xml) the "URN" element
     */
    public void xsetURN(org.apache.xmlbeans.XmlString urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URN$0);
            }
            target.set(urn);
        }
    }
    
    /**
     * Gets the "coreName" element
     */
    public java.lang.String getCoreName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORENAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORENAME$2);
            }
            target.set(coreName);
        }
    }
}
