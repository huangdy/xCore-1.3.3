/*
 * XML Type:  RegisterExternalToolRequestType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.RegisterExternalToolRequestType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML RegisterExternalToolRequestType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class RegisterExternalToolRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.RegisterExternalToolRequestType
{
    private static final long serialVersionUID = 1L;
    
    public RegisterExternalToolRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALTOOL$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "ExternalTool");
    
    
    /**
     * Gets the "ExternalTool" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigType getExternalTool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().find_element_user(EXTERNALTOOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExternalTool" element
     */
    public void setExternalTool(org.uicds.externalToolConfig.ExternalToolConfigType externalTool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().find_element_user(EXTERNALTOOL$0, 0);
            if (target == null)
            {
                target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().add_element_user(EXTERNALTOOL$0);
            }
            target.set(externalTool);
        }
    }
    
    /**
     * Appends and returns a new empty "ExternalTool" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigType addNewExternalTool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().add_element_user(EXTERNALTOOL$0);
            return target;
        }
    }
}
