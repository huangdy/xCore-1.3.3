/*
 * An XML document type.
 * Localname: State
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.StateDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one State(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class StateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.StateDocument
{
    private static final long serialVersionUID = 1L;
    
    public StateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATE$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "State");
    
    
    /**
     * Gets the "State" element
     */
    public com.saic.precis.x2009.x06.base.StateType.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.saic.precis.x2009.x06.base.StateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "State" element
     */
    public com.saic.precis.x2009.x06.base.StateType xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.StateType target = null;
            target = (com.saic.precis.x2009.x06.base.StateType)get_store().find_element_user(STATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "State" element
     */
    public void setState(com.saic.precis.x2009.x06.base.StateType.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$0);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "State" element
     */
    public void xsetState(com.saic.precis.x2009.x06.base.StateType state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.StateType target = null;
            target = (com.saic.precis.x2009.x06.base.StateType)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.StateType)get_store().add_element_user(STATE$0);
            }
            target.set(state);
        }
    }
}
