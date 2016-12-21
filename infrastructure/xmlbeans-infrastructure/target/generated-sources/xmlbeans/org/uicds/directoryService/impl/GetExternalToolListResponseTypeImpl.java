/*
 * XML Type:  GetExternalToolListResponseType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetExternalToolListResponseType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML GetExternalToolListResponseType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class GetExternalToolListResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetExternalToolListResponseType
{
    private static final long serialVersionUID = 1L;
    
    public GetExternalToolListResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALTOOLLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "externalToolList");
    
    
    /**
     * Gets the "externalToolList" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigListType getExternalToolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigListType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigListType)get_store().find_element_user(EXTERNALTOOLLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "externalToolList" element
     */
    public void setExternalToolList(org.uicds.externalToolConfig.ExternalToolConfigListType externalToolList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigListType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigListType)get_store().find_element_user(EXTERNALTOOLLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.externalToolConfig.ExternalToolConfigListType)get_store().add_element_user(EXTERNALTOOLLIST$0);
            }
            target.set(externalToolList);
        }
    }
    
    /**
     * Appends and returns a new empty "externalToolList" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigListType addNewExternalToolList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigListType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigListType)get_store().add_element_user(EXTERNALTOOLLIST$0);
            return target;
        }
    }
}
