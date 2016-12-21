/*
 * An XML document type.
 * Localname: ResourceProfileList
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.ResourceProfileListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one ResourceProfileList(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class ResourceProfileListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.ResourceProfileListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceProfileListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEPROFILELIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "ResourceProfileList");
    
    
    /**
     * Gets the "ResourceProfileList" element
     */
    public org.uicds.resourceProfileService.ResourceProfileListType getResourceProfileList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfileListType target = null;
            target = (org.uicds.resourceProfileService.ResourceProfileListType)get_store().find_element_user(RESOURCEPROFILELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceProfileList" element
     */
    public void setResourceProfileList(org.uicds.resourceProfileService.ResourceProfileListType resourceProfileList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfileListType target = null;
            target = (org.uicds.resourceProfileService.ResourceProfileListType)get_store().find_element_user(RESOURCEPROFILELIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.ResourceProfileListType)get_store().add_element_user(RESOURCEPROFILELIST$0);
            }
            target.set(resourceProfileList);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceProfileList" element
     */
    public org.uicds.resourceProfileService.ResourceProfileListType addNewResourceProfileList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfileListType target = null;
            target = (org.uicds.resourceProfileService.ResourceProfileListType)get_store().add_element_user(RESOURCEPROFILELIST$0);
            return target;
        }
    }
}
