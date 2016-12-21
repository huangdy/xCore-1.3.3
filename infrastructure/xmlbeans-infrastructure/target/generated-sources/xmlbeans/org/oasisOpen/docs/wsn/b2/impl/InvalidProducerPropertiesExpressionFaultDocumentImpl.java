/*
 * An XML document type.
 * Localname: InvalidProducerPropertiesExpressionFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one InvalidProducerPropertiesExpressionFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class InvalidProducerPropertiesExpressionFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvalidProducerPropertiesExpressionFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVALIDPRODUCERPROPERTIESEXPRESSIONFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InvalidProducerPropertiesExpressionFault");
    
    
    /**
     * Gets the "InvalidProducerPropertiesExpressionFault" element
     */
    public org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType getInvalidProducerPropertiesExpressionFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType)get_store().find_element_user(INVALIDPRODUCERPROPERTIESEXPRESSIONFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InvalidProducerPropertiesExpressionFault" element
     */
    public void setInvalidProducerPropertiesExpressionFault(org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType invalidProducerPropertiesExpressionFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType)get_store().find_element_user(INVALIDPRODUCERPROPERTIESEXPRESSIONFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType)get_store().add_element_user(INVALIDPRODUCERPROPERTIESEXPRESSIONFAULT$0);
            }
            target.set(invalidProducerPropertiesExpressionFault);
        }
    }
    
    /**
     * Appends and returns a new empty "InvalidProducerPropertiesExpressionFault" element
     */
    public org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType addNewInvalidProducerPropertiesExpressionFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidProducerPropertiesExpressionFaultType)get_store().add_element_user(INVALIDPRODUCERPROPERTIESEXPRESSIONFAULT$0);
            return target;
        }
    }
}
