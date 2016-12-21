/*
 * XML Type:  InterestGroupSubtypeType
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.InterestGroupSubtypeType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures.impl;
/**
 * An XML InterestGroupSubtypeType(@http://www.saic.com/precis/2009/06/structures).
 *
 * This is a complex type.
 */
public class InterestGroupSubtypeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.structures.InterestGroupSubtypeType
{
    private static final long serialVersionUID = 1L;
    
    public InterestGroupSubtypeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODESPACEVALUE$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "CodeSpaceValue");
    private static final javax.xml.namespace.QName CODESPACE$2 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "codespace");
    
    
    /**
     * Gets the "CodeSpaceValue" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType getCodeSpaceValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(CODESPACEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CodeSpaceValue" element
     */
    public void setCodeSpaceValue(com.saic.precis.x2009.x06.base.CodespaceValueType codeSpaceValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(CODESPACEVALUE$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(CODESPACEVALUE$0);
            }
            target.set(codeSpaceValue);
        }
    }
    
    /**
     * Appends and returns a new empty "CodeSpaceValue" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType addNewCodeSpaceValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(CODESPACEVALUE$0);
            return target;
        }
    }
    
    /**
     * Gets the "codespace" attribute
     */
    public java.lang.String getCodespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODESPACE$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESPACE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODESPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODESPACE$2);
            }
            target.set(codespace);
        }
    }
}
