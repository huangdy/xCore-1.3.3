/*
 * An XML document type.
 * Localname: WorkProductProperties
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures.impl;
/**
 * A document containing one WorkProductProperties(@http://www.saic.com/precis/2009/06/structures) element.
 *
 * This is a complex type.
 */
public class WorkProductPropertiesDocumentImpl extends x0.messageStructure1.impl.PackageMetadataExtensionAbstractDocumentImpl implements com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductPropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProperties");
    
    
    /**
     * Gets the "WorkProductProperties" element
     */
    public com.saic.precis.x2009.x06.base.PropertiesType getWorkProductProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.PropertiesType target = null;
            target = (com.saic.precis.x2009.x06.base.PropertiesType)get_store().find_element_user(WORKPRODUCTPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductProperties" element
     */
    public void setWorkProductProperties(com.saic.precis.x2009.x06.base.PropertiesType workProductProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.PropertiesType target = null;
            target = (com.saic.precis.x2009.x06.base.PropertiesType)get_store().find_element_user(WORKPRODUCTPROPERTIES$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.PropertiesType)get_store().add_element_user(WORKPRODUCTPROPERTIES$0);
            }
            target.set(workProductProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductProperties" element
     */
    public com.saic.precis.x2009.x06.base.PropertiesType addNewWorkProductProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.PropertiesType target = null;
            target = (com.saic.precis.x2009.x06.base.PropertiesType)get_store().add_element_user(WORKPRODUCTPROPERTIES$0);
            return target;
        }
    }
}
