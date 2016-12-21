/*
 * An XML document type.
 * Localname: CoreConfig
 * Namespace: http://uicds.org/CoreConfig
 * Java type: org.uicds.coreConfig.CoreConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.coreConfig.impl;
/**
 * A document containing one CoreConfig(@http://uicds.org/CoreConfig) element.
 *
 * This is a complex type.
 */
public class CoreConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.coreConfig.CoreConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoreConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORECONFIG$0 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "CoreConfig");
    
    
    /**
     * Gets the "CoreConfig" element
     */
    public org.uicds.coreConfig.CoreConfigType getCoreConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigType target = null;
            target = (org.uicds.coreConfig.CoreConfigType)get_store().find_element_user(CORECONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoreConfig" element
     */
    public void setCoreConfig(org.uicds.coreConfig.CoreConfigType coreConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigType target = null;
            target = (org.uicds.coreConfig.CoreConfigType)get_store().find_element_user(CORECONFIG$0, 0);
            if (target == null)
            {
                target = (org.uicds.coreConfig.CoreConfigType)get_store().add_element_user(CORECONFIG$0);
            }
            target.set(coreConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "CoreConfig" element
     */
    public org.uicds.coreConfig.CoreConfigType addNewCoreConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigType target = null;
            target = (org.uicds.coreConfig.CoreConfigType)get_store().add_element_user(CORECONFIG$0);
            return target;
        }
    }
}
