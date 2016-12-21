/*
 * An XML document type.
 * Localname: ExternalDataSourceList
 * Namespace: http://uicds.org/ExternalDataSourceConfig
 * Java type: org.uicds.externalDataSourceConfig.ExternalDataSourceListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalDataSourceConfig.impl;
/**
 * A document containing one ExternalDataSourceList(@http://uicds.org/ExternalDataSourceConfig) element.
 *
 * This is a complex type.
 */
public class ExternalDataSourceListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.externalDataSourceConfig.ExternalDataSourceListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalDataSourceListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALDATASOURCELIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalDataSourceConfig", "ExternalDataSourceList");
    
    
    /**
     * Gets the "ExternalDataSourceList" element
     */
    public org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType getExternalDataSourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType)get_store().find_element_user(EXTERNALDATASOURCELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExternalDataSourceList" element
     */
    public void setExternalDataSourceList(org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType externalDataSourceList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType)get_store().find_element_user(EXTERNALDATASOURCELIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType)get_store().add_element_user(EXTERNALDATASOURCELIST$0);
            }
            target.set(externalDataSourceList);
        }
    }
    
    /**
     * Appends and returns a new empty "ExternalDataSourceList" element
     */
    public org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType addNewExternalDataSourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType)get_store().add_element_user(EXTERNALDATASOURCELIST$0);
            return target;
        }
    }
}
