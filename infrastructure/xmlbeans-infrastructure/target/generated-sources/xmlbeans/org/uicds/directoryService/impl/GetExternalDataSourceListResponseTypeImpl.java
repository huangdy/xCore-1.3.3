/*
 * XML Type:  GetExternalDataSourceListResponseType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetExternalDataSourceListResponseType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML GetExternalDataSourceListResponseType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class GetExternalDataSourceListResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetExternalDataSourceListResponseType
{
    private static final long serialVersionUID = 1L;
    
    public GetExternalDataSourceListResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALDATASOURCELIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "externalDataSourceList");
    
    
    /**
     * Gets the "externalDataSourceList" element
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
     * Sets the "externalDataSourceList" element
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
     * Appends and returns a new empty "externalDataSourceList" element
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
