/*
 * An XML document type.
 * Localname: SOSConfig
 * Namespace: http://uicds.org/SOSConfig
 * Java type: org.uicds.sosConfig.SOSConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sosConfig.impl;
/**
 * A document containing one SOSConfig(@http://uicds.org/SOSConfig) element.
 *
 * This is a complex type.
 */
public class SOSConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sosConfig.SOSConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public SOSConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOSCONFIG$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SOSConfig", "SOSConfig");
    
    
    /**
     * Gets the "SOSConfig" element
     */
    public org.uicds.sosConfig.SOSConfigType getSOSConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().find_element_user(SOSCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SOSConfig" element
     */
    public void setSOSConfig(org.uicds.sosConfig.SOSConfigType sosConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().find_element_user(SOSCONFIG$0, 0);
            if (target == null)
            {
                target = (org.uicds.sosConfig.SOSConfigType)get_store().add_element_user(SOSCONFIG$0);
            }
            target.set(sosConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "SOSConfig" element
     */
    public org.uicds.sosConfig.SOSConfigType addNewSOSConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().add_element_user(SOSCONFIG$0);
            return target;
        }
    }
}
