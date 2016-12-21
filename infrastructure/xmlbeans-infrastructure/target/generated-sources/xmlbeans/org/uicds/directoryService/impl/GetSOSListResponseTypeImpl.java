/*
 * XML Type:  GetSOSListResponseType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetSOSListResponseType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML GetSOSListResponseType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class GetSOSListResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetSOSListResponseType
{
    private static final long serialVersionUID = 1L;
    
    public GetSOSListResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOSLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "sosList");
    
    
    /**
     * Gets the "sosList" element
     */
    public org.uicds.sosConfig.SOSConfigListType getSosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigListType target = null;
            target = (org.uicds.sosConfig.SOSConfigListType)get_store().find_element_user(SOSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sosList" element
     */
    public void setSosList(org.uicds.sosConfig.SOSConfigListType sosList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigListType target = null;
            target = (org.uicds.sosConfig.SOSConfigListType)get_store().find_element_user(SOSLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.sosConfig.SOSConfigListType)get_store().add_element_user(SOSLIST$0);
            }
            target.set(sosList);
        }
    }
    
    /**
     * Appends and returns a new empty "sosList" element
     */
    public org.uicds.sosConfig.SOSConfigListType addNewSosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigListType target = null;
            target = (org.uicds.sosConfig.SOSConfigListType)get_store().add_element_user(SOSLIST$0);
            return target;
        }
    }
}
