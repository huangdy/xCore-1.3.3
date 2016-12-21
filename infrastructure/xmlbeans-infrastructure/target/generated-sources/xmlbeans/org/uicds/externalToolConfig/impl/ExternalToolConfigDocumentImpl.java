/*
 * An XML document type.
 * Localname: ExternalToolConfig
 * Namespace: http://uicds.org/ExternalToolConfig
 * Java type: org.uicds.externalToolConfig.ExternalToolConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalToolConfig.impl;
/**
 * A document containing one ExternalToolConfig(@http://uicds.org/ExternalToolConfig) element.
 *
 * This is a complex type.
 */
public class ExternalToolConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.externalToolConfig.ExternalToolConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalToolConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALTOOLCONFIG$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalToolConfig", "ExternalToolConfig");
    
    
    /**
     * Gets the "ExternalToolConfig" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigType getExternalToolConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().find_element_user(EXTERNALTOOLCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExternalToolConfig" element
     */
    public void setExternalToolConfig(org.uicds.externalToolConfig.ExternalToolConfigType externalToolConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().find_element_user(EXTERNALTOOLCONFIG$0, 0);
            if (target == null)
            {
                target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().add_element_user(EXTERNALTOOLCONFIG$0);
            }
            target.set(externalToolConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "ExternalToolConfig" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigType addNewExternalToolConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().add_element_user(EXTERNALTOOLCONFIG$0);
            return target;
        }
    }
}
