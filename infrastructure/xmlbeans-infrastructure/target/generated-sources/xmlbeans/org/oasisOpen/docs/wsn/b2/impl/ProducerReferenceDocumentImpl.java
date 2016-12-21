/*
 * An XML document type.
 * Localname: ProducerReference
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.ProducerReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one ProducerReference(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class ProducerReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.ProducerReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProducerReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCERREFERENCE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ProducerReference");
    
    
    /**
     * Gets the "ProducerReference" element
     */
    public org.w3.x2005.x08.addressing.EndpointReferenceType getProducerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(PRODUCERREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProducerReference" element
     */
    public void setProducerReference(org.w3.x2005.x08.addressing.EndpointReferenceType producerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(PRODUCERREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(PRODUCERREFERENCE$0);
            }
            target.set(producerReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ProducerReference" element
     */
    public org.w3.x2005.x08.addressing.EndpointReferenceType addNewProducerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(PRODUCERREFERENCE$0);
            return target;
        }
    }
}
