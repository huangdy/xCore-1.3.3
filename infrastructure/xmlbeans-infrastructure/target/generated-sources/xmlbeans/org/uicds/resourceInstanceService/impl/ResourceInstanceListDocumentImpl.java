/*
 * An XML document type.
 * Localname: ResourceInstanceList
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.ResourceInstanceListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one ResourceInstanceList(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class ResourceInstanceListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.ResourceInstanceListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceInstanceListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEINSTANCELIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ResourceInstanceList");
    
    
    /**
     * Gets the "ResourceInstanceList" element
     */
    public org.uicds.resourceInstanceService.ResourceInstanceListType getResourceInstanceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstanceListType target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstanceListType)get_store().find_element_user(RESOURCEINSTANCELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceInstanceList" element
     */
    public void setResourceInstanceList(org.uicds.resourceInstanceService.ResourceInstanceListType resourceInstanceList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstanceListType target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstanceListType)get_store().find_element_user(RESOURCEINSTANCELIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.ResourceInstanceListType)get_store().add_element_user(RESOURCEINSTANCELIST$0);
            }
            target.set(resourceInstanceList);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceInstanceList" element
     */
    public org.uicds.resourceInstanceService.ResourceInstanceListType addNewResourceInstanceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstanceListType target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstanceListType)get_store().add_element_user(RESOURCEINSTANCELIST$0);
            return target;
        }
    }
}
