/*
 * An XML document type.
 * Localname: ExternalDataSourceConfig
 * Namespace: http://uicds.org/ExternalDataSourceConfig
 * Java type: org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalDataSourceConfig.impl;
/**
 * A document containing one ExternalDataSourceConfig(@http://uicds.org/ExternalDataSourceConfig) element.
 *
 * This is a complex type.
 */
public class ExternalDataSourceConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalDataSourceConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALDATASOURCECONFIG$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalDataSourceConfig", "ExternalDataSourceConfig");
    
    
    /**
     * Gets the "ExternalDataSourceConfig" element
     */
    public org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType getExternalDataSourceConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType)get_store().find_element_user(EXTERNALDATASOURCECONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExternalDataSourceConfig" element
     */
    public void setExternalDataSourceConfig(org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType externalDataSourceConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType)get_store().find_element_user(EXTERNALDATASOURCECONFIG$0, 0);
            if (target == null)
            {
                target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType)get_store().add_element_user(EXTERNALDATASOURCECONFIG$0);
            }
            target.set(externalDataSourceConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "ExternalDataSourceConfig" element
     */
    public org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType addNewExternalDataSourceConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType)get_store().add_element_user(EXTERNALDATASOURCECONFIG$0);
            return target;
        }
    }
}
