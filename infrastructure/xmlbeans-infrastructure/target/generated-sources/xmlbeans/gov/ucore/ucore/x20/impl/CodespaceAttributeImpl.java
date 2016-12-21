/*
 * An XML attribute type.
 * Localname: codespace
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.CodespaceAttribute
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one codespace(@http://ucore.gov/ucore/2.0) attribute.
 *
 * This is a complex type.
 */
public class CodespaceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.CodespaceAttribute
{
    private static final long serialVersionUID = 1L;
    
    public CodespaceAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODESPACE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "codespace");
    
    
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
    public org.apache.xmlbeans.XmlAnyURI xgetCodespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$0);
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
    public void xsetCodespace(org.apache.xmlbeans.XmlAnyURI codespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CODESPACE$0);
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
