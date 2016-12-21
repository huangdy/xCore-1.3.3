/*
 * An XML attribute type.
 * Localname: role
 * Namespace: http://www.w3.org/1999/xlink1
 * Java type: org.w3.x1999.xlink1.RoleAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink1.impl;
/**
 * A document containing one role(@http://www.w3.org/1999/xlink1) attribute.
 *
 * This is a complex type.
 */
public class RoleAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink1.RoleAttribute
{
    private static final long serialVersionUID = 1L;
    
    public RoleAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "role");
    
    
    /**
     * Gets the "role" attribute
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public org.w3.x1999.xlink1.RoleAttribute.Role xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.RoleAttribute.Role target = null;
            target = (org.w3.x1999.xlink1.RoleAttribute.Role)get_store().find_attribute_user(ROLE$0);
            return target;
        }
    }
    
    /**
     * True if has "role" attribute
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLE$0) != null;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
    public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$0);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.w3.x1999.xlink1.RoleAttribute.Role role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.RoleAttribute.Role target = null;
            target = (org.w3.x1999.xlink1.RoleAttribute.Role)get_store().find_attribute_user(ROLE$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink1.RoleAttribute.Role)get_store().add_attribute_user(ROLE$0);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" attribute
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLE$0);
        }
    }
    /**
     * An XML role(@http://www.w3.org/1999/xlink1).
     *
     * This is an atomic type that is a restriction of org.w3.x1999.xlink1.RoleAttribute$Role.
     */
    public static class RoleImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements org.w3.x1999.xlink1.RoleAttribute.Role
    {
        private static final long serialVersionUID = 1L;
        
        public RoleImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RoleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
