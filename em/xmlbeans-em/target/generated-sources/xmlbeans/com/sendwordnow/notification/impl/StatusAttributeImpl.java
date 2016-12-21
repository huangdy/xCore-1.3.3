/*
 * An XML attribute type.
 * Localname: status
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.StatusAttribute
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * A document containing one status(@http://www.sendwordnow.com/notification) attribute.
 *
 * This is a complex type.
 */
public class StatusAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.StatusAttribute
{
    private static final long serialVersionUID = 1L;
    
    public StatusAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "status");
    
    
    /**
     * Gets the "status" attribute
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public com.sendwordnow.notification.StatusAttribute.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.StatusAttribute.Status target = null;
            target = (com.sendwordnow.notification.StatusAttribute.Status)get_store().find_attribute_user(STATUS$0);
            return target;
        }
    }
    
    /**
     * True if has "status" attribute
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATUS$0) != null;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$0);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(com.sendwordnow.notification.StatusAttribute.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.StatusAttribute.Status target = null;
            target = (com.sendwordnow.notification.StatusAttribute.Status)get_store().find_attribute_user(STATUS$0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.StatusAttribute.Status)get_store().add_attribute_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" attribute
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATUS$0);
        }
    }
    /**
     * An XML status(@http://www.sendwordnow.com/notification).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.StatusAttribute$Status.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.StatusAttribute.Status
    {
        private static final long serialVersionUID = 1L;
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
