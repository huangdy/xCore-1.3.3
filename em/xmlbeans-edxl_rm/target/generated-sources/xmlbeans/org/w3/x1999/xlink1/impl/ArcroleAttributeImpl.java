/*
 * An XML attribute type.
 * Localname: arcrole
 * Namespace: http://www.w3.org/1999/xlink1
 * Java type: org.w3.x1999.xlink1.ArcroleAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink1.impl;
/**
 * A document containing one arcrole(@http://www.w3.org/1999/xlink1) attribute.
 *
 * This is a complex type.
 */
public class ArcroleAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink1.ArcroleAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ArcroleAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCROLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "arcrole");
    
    
    /**
     * Gets the "arcrole" attribute
     */
    public java.lang.String getArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arcrole" attribute
     */
    public org.w3.x1999.xlink1.ArcroleAttribute.Arcrole xgetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.ArcroleAttribute.Arcrole target = null;
            target = (org.w3.x1999.xlink1.ArcroleAttribute.Arcrole)get_store().find_attribute_user(ARCROLE$0);
            return target;
        }
    }
    
    /**
     * True if has "arcrole" attribute
     */
    public boolean isSetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARCROLE$0) != null;
        }
    }
    
    /**
     * Sets the "arcrole" attribute
     */
    public void setArcrole(java.lang.String arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCROLE$0);
            }
            target.setStringValue(arcrole);
        }
    }
    
    /**
     * Sets (as xml) the "arcrole" attribute
     */
    public void xsetArcrole(org.w3.x1999.xlink1.ArcroleAttribute.Arcrole arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.ArcroleAttribute.Arcrole target = null;
            target = (org.w3.x1999.xlink1.ArcroleAttribute.Arcrole)get_store().find_attribute_user(ARCROLE$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink1.ArcroleAttribute.Arcrole)get_store().add_attribute_user(ARCROLE$0);
            }
            target.set(arcrole);
        }
    }
    
    /**
     * Unsets the "arcrole" attribute
     */
    public void unsetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARCROLE$0);
        }
    }
    /**
     * An XML arcrole(@http://www.w3.org/1999/xlink1).
     *
     * This is an atomic type that is a restriction of org.w3.x1999.xlink1.ArcroleAttribute$Arcrole.
     */
    public static class ArcroleImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements org.w3.x1999.xlink1.ArcroleAttribute.Arcrole
    {
        private static final long serialVersionUID = 1L;
        
        public ArcroleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ArcroleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
