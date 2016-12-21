/*
 * XML Type:  ProcessingStatusType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.ProcessingStatusType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * An XML ProcessingStatusType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is a complex type.
 */
public class ProcessingStatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.ProcessingStatusType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessingStatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Status");
    private static final javax.xml.namespace.QName ACT$2 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "ACT");
    private static final javax.xml.namespace.QName MESSAGE$4 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Message");
    
    
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
    
    /**
     * Gets the "ACT" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType getACT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ACT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ACT" element
     */
    public boolean isSetACT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACT$2) != 0;
        }
    }
    
    /**
     * Sets the "ACT" element
     */
    public void setACT(com.saic.precis.x2009.x06.base.IdentifierType act)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ACT$2, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ACT$2);
            }
            target.set(act);
        }
    }
    
    /**
     * Appends and returns a new empty "ACT" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType addNewACT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ACT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ACT" element
     */
    public void unsetACT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACT$2, 0);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    public com.saic.precis.x2009.x06.base.UserMessageType getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.UserMessageType target = null;
            target = (com.saic.precis.x2009.x06.base.UserMessageType)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Message" element
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(com.saic.precis.x2009.x06.base.UserMessageType message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.UserMessageType target = null;
            target = (com.saic.precis.x2009.x06.base.UserMessageType)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.UserMessageType)get_store().add_element_user(MESSAGE$4);
            }
            target.set(message);
        }
    }
    
    /**
     * Appends and returns a new empty "Message" element
     */
    public com.saic.precis.x2009.x06.base.UserMessageType addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.UserMessageType target = null;
            target = (com.saic.precis.x2009.x06.base.UserMessageType)get_store().add_element_user(MESSAGE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Message" element
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$4, 0);
        }
    }
}
