/*
 * An XML document type.
 * Localname: Status
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.StatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one Status(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class StatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.StatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Status");
    
    
    /**
     * Gets the "Status" element
     */
    public com.saic.precis.x2009.x06.base.ProcessingStateType.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.saic.precis.x2009.x06.base.ProcessingStateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.saic.precis.x2009.x06.base.ProcessingStateType xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ProcessingStateType target = null;
            target = (com.saic.precis.x2009.x06.base.ProcessingStateType)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.saic.precis.x2009.x06.base.ProcessingStateType.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.saic.precis.x2009.x06.base.ProcessingStateType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ProcessingStateType target = null;
            target = (com.saic.precis.x2009.x06.base.ProcessingStateType)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.ProcessingStateType)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
}
