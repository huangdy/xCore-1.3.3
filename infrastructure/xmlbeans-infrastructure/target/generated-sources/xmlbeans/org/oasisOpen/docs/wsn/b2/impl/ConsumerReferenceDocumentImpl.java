/*
 * An XML document type.
 * Localname: ConsumerReference
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.ConsumerReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one ConsumerReference(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class ConsumerReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.ConsumerReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsumerReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSUMERREFERENCE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ConsumerReference");
    
    
    /**
     * Gets the "ConsumerReference" element
     */
    public org.w3.x2005.x08.addressing.EndpointReferenceType getConsumerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(CONSUMERREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConsumerReference" element
     */
    public void setConsumerReference(org.w3.x2005.x08.addressing.EndpointReferenceType consumerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(CONSUMERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(CONSUMERREFERENCE$0);
            }
            target.set(consumerReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ConsumerReference" element
     */
    public org.w3.x2005.x08.addressing.EndpointReferenceType addNewConsumerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(CONSUMERREFERENCE$0);
            return target;
        }
    }
}
