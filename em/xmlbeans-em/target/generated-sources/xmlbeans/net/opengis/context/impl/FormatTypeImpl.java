/*
 * XML Type:  FormatType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.FormatType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML FormatType(@http://www.opengis.net/context).
 *
 * This is an atomic type that is a restriction of net.opengis.context.FormatType.
 */
public class FormatTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.context.FormatType
{
    private static final long serialVersionUID = 1L;
    
    public FormatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected FormatTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CURRENT$0 = 
        new javax.xml.namespace.QName("", "current");
    
    
    /**
     * Gets the "current" attribute
     */
    public boolean getCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENT$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "current" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURRENT$0);
            return target;
        }
    }
    
    /**
     * True if has "current" attribute
     */
    public boolean isSetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURRENT$0) != null;
        }
    }
    
    /**
     * Sets the "current" attribute
     */
    public void setCurrent(boolean current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENT$0);
            }
            target.setBooleanValue(current);
        }
    }
    
    /**
     * Sets (as xml) the "current" attribute
     */
    public void xsetCurrent(org.apache.xmlbeans.XmlBoolean current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURRENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CURRENT$0);
            }
            target.set(current);
        }
    }
    
    /**
     * Unsets the "current" attribute
     */
    public void unsetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURRENT$0);
        }
    }
}
