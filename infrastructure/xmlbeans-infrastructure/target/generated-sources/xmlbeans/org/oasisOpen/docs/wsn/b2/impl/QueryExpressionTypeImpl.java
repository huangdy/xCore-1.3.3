/*
 * XML Type:  QueryExpressionType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.QueryExpressionType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * An XML QueryExpressionType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public class QueryExpressionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.QueryExpressionType
{
    private static final long serialVersionUID = 1L;
    
    public QueryExpressionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIALECT$0 = 
        new javax.xml.namespace.QName("", "Dialect");
    
    
    /**
     * Gets the "Dialect" attribute
     */
    public java.lang.String getDialect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIALECT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Dialect" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetDialect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(DIALECT$0);
            return target;
        }
    }
    
    /**
     * Sets the "Dialect" attribute
     */
    public void setDialect(java.lang.String dialect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIALECT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIALECT$0);
            }
            target.setStringValue(dialect);
        }
    }
    
    /**
     * Sets (as xml) the "Dialect" attribute
     */
    public void xsetDialect(org.apache.xmlbeans.XmlAnyURI dialect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(DIALECT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(DIALECT$0);
            }
            target.set(dialect);
        }
    }
}
