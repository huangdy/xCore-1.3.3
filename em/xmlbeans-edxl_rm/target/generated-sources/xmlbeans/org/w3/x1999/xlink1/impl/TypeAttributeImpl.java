/*
 * An XML attribute type.
 * Localname: type
 * Namespace: http://www.w3.org/1999/xlink1
 * Java type: org.w3.x1999.xlink1.TypeAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink1.impl;
/**
 * A document containing one type(@http://www.w3.org/1999/xlink1) attribute.
 *
 * This is a complex type.
 */
public class TypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink1.TypeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "type");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink1.TypeAttribute.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink1.TypeAttribute.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.w3.x1999.xlink1.TypeAttribute.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.TypeAttribute.Type target = null;
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.w3.x1999.xlink1.TypeAttribute.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.w3.x1999.xlink1.TypeAttribute.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.TypeAttribute.Type target = null;
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    /**
     * An XML type(@http://www.w3.org/1999/xlink1).
     *
     * This is an atomic type that is a restriction of org.w3.x1999.xlink1.TypeAttribute$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xlink1.TypeAttribute.Type
    {
        private static final long serialVersionUID = 1L;
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
