/*
 * An XML document type.
 * Localname: ExternalToolList
 * Namespace: http://uicds.org/ExternalToolConfig
 * Java type: org.uicds.externalToolConfig.ExternalToolListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalToolConfig.impl;
/**
 * A document containing one ExternalToolList(@http://uicds.org/ExternalToolConfig) element.
 *
 * This is a complex type.
 */
public class ExternalToolListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.externalToolConfig.ExternalToolListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalToolListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALTOOLLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalToolConfig", "ExternalToolList");
    
    
    /**
     * Gets the "ExternalToolList" element
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
     * Sets the "ExternalToolList" element
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
     * Appends and returns a new empty "ExternalToolList" element
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
