/*
 * An XML document type.
 * Localname: ResourceNotDestroyedFault
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one ResourceNotDestroyedFault(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class ResourceNotDestroyedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceNotDestroyedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCENOTDESTROYEDFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "ResourceNotDestroyedFault");
    
    
    /**
     * Gets the "ResourceNotDestroyedFault" element
     */
    public org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType getResourceNotDestroyedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType)get_store().find_element_user(RESOURCENOTDESTROYEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceNotDestroyedFault" element
     */
    public void setResourceNotDestroyedFault(org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType resourceNotDestroyedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType)get_store().find_element_user(RESOURCENOTDESTROYEDFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType)get_store().add_element_user(RESOURCENOTDESTROYEDFAULT$0);
            }
            target.set(resourceNotDestroyedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceNotDestroyedFault" element
     */
    public org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType addNewResourceNotDestroyedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.ResourceNotDestroyedFaultType)get_store().add_element_user(RESOURCENOTDESTROYEDFAULT$0);
            return target;
        }
    }
}
