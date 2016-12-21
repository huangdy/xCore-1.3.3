/*
 * An XML attribute type.
 * Localname: codespace
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.CodespaceAttribute
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one codespace(@http://www.saic.com/precis/2009/06/base) attribute.
 *
 * This is a complex type.
 */
public class CodespaceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.CodespaceAttribute
{
    private static final long serialVersionUID = 1L;
    
    public CodespaceAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODESPACE$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "codespace");
    
    
    /**
     * Gets the "codespace" attribute
     */
    public java.lang.String getCodespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codespace" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCodespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODESPACE$0);
            return target;
        }
    }
    
    /**
     * True if has "codespace" attribute
     */
    public boolean isSetCodespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESPACE$0) != null;
        }
    }
    
    /**
     * Sets the "codespace" attribute
     */
    public void setCodespace(java.lang.String codespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESPACE$0);
            }
            target.setStringValue(codespace);
        }
    }
    
    /**
     * Sets (as xml) the "codespace" attribute
     */
    public void xsetCodespace(org.apache.xmlbeans.XmlString codespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODESPACE$0);
            }
            target.set(codespace);
        }
    }
    
    /**
     * Unsets the "codespace" attribute
     */
    public void unsetCodespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESPACE$0);
        }
    }
}
