/*
 * An XML document type.
 * Localname: ProducerProperties
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.ProducerPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one ProducerProperties(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class ProducerPropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.ProducerPropertiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProducerPropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCERPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ProducerProperties");
    
    
    /**
     * Gets the "ProducerProperties" element
     */
    public org.oasisOpen.docs.wsn.b2.QueryExpressionType getProducerProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().find_element_user(PRODUCERPROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProducerProperties" element
     */
    public void setProducerProperties(org.oasisOpen.docs.wsn.b2.QueryExpressionType producerProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().find_element_user(PRODUCERPROPERTIES$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().add_element_user(PRODUCERPROPERTIES$0);
            }
            target.set(producerProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "ProducerProperties" element
     */
    public org.oasisOpen.docs.wsn.b2.QueryExpressionType addNewProducerProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().add_element_user(PRODUCERPROPERTIES$0);
            return target;
        }
    }
}
