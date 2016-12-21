/*
 * An XML document type.
 * Localname: SOSConfigList
 * Namespace: http://uicds.org/SOSConfig
 * Java type: org.uicds.sosConfig.SOSConfigListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sosConfig.impl;
/**
 * A document containing one SOSConfigList(@http://uicds.org/SOSConfig) element.
 *
 * This is a complex type.
 */
public class SOSConfigListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sosConfig.SOSConfigListDocument
{
    private static final long serialVersionUID = 1L;
    
    public SOSConfigListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOSCONFIGLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SOSConfig", "SOSConfigList");
    
    
    /**
     * Gets the "SOSConfigList" element
     */
    public org.uicds.sosConfig.SOSConfigListType getSOSConfigList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigListType target = null;
            target = (org.uicds.sosConfig.SOSConfigListType)get_store().find_element_user(SOSCONFIGLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SOSConfigList" element
     */
    public void setSOSConfigList(org.uicds.sosConfig.SOSConfigListType sosConfigList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigListType target = null;
            target = (org.uicds.sosConfig.SOSConfigListType)get_store().find_element_user(SOSCONFIGLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.sosConfig.SOSConfigListType)get_store().add_element_user(SOSCONFIGLIST$0);
            }
            target.set(sosConfigList);
        }
    }
    
    /**
     * Appends and returns a new empty "SOSConfigList" element
     */
    public org.uicds.sosConfig.SOSConfigListType addNewSOSConfigList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigListType target = null;
            target = (org.uicds.sosConfig.SOSConfigListType)get_store().add_element_user(SOSCONFIGLIST$0);
            return target;
        }
    }
}
