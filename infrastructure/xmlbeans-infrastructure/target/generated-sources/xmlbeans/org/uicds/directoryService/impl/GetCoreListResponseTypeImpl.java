/*
 * XML Type:  GetCoreListResponseType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetCoreListResponseType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML GetCoreListResponseType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class GetCoreListResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetCoreListResponseType
{
    private static final long serialVersionUID = 1L;
    
    public GetCoreListResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORELIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "coreList");
    
    
    /**
     * Gets the "coreList" element
     */
    public org.uicds.coreConfig.CoreConfigListType getCoreList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigListType target = null;
            target = (org.uicds.coreConfig.CoreConfigListType)get_store().find_element_user(CORELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coreList" element
     */
    public void setCoreList(org.uicds.coreConfig.CoreConfigListType coreList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigListType target = null;
            target = (org.uicds.coreConfig.CoreConfigListType)get_store().find_element_user(CORELIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.coreConfig.CoreConfigListType)get_store().add_element_user(CORELIST$0);
            }
            target.set(coreList);
        }
    }
    
    /**
     * Appends and returns a new empty "coreList" element
     */
    public org.uicds.coreConfig.CoreConfigListType addNewCoreList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigListType target = null;
            target = (org.uicds.coreConfig.CoreConfigListType)get_store().add_element_user(CORELIST$0);
            return target;
        }
    }
}
