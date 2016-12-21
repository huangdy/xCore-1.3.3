/*
 * An XML document type.
 * Localname: CoreList
 * Namespace: http://uicds.org/CoreConfig
 * Java type: org.uicds.coreConfig.CoreListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.coreConfig.impl;
/**
 * A document containing one CoreList(@http://uicds.org/CoreConfig) element.
 *
 * This is a complex type.
 */
public class CoreListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.coreConfig.CoreListDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoreListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORELIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "CoreList");
    
    
    /**
     * Gets the "CoreList" element
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
     * Sets the "CoreList" element
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
     * Appends and returns a new empty "CoreList" element
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
