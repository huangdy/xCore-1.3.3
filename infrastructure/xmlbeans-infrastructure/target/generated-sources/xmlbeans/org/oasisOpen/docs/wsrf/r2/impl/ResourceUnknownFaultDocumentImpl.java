/*
 * An XML document type.
 * Localname: ResourceUnknownFault
 * Namespace: http://docs.oasis-open.org/wsrf/r-2
 * Java type: org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.r2.impl;
/**
 * A document containing one ResourceUnknownFault(@http://docs.oasis-open.org/wsrf/r-2) element.
 *
 * This is a complex type.
 */
public class ResourceUnknownFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceUnknownFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEUNKNOWNFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/r-2", "ResourceUnknownFault");
    
    
    /**
     * Gets the "ResourceUnknownFault" element
     */
    public org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType getResourceUnknownFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType)get_store().find_element_user(RESOURCEUNKNOWNFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceUnknownFault" element
     */
    public void setResourceUnknownFault(org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType resourceUnknownFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType)get_store().find_element_user(RESOURCEUNKNOWNFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType)get_store().add_element_user(RESOURCEUNKNOWNFAULT$0);
            }
            target.set(resourceUnknownFault);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceUnknownFault" element
     */
    public org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType addNewResourceUnknownFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.r2.ResourceUnknownFaultType)get_store().add_element_user(RESOURCEUNKNOWNFAULT$0);
            return target;
        }
    }
}
