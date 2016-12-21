/*
 * An XML document type.
 * Localname: ResourceUnavailableFault
 * Namespace: http://docs.oasis-open.org/wsrf/r-2
 * Java type: org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.r2.impl;
/**
 * A document containing one ResourceUnavailableFault(@http://docs.oasis-open.org/wsrf/r-2) element.
 *
 * This is a complex type.
 */
public class ResourceUnavailableFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceUnavailableFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEUNAVAILABLEFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/r-2", "ResourceUnavailableFault");
    
    
    /**
     * Gets the "ResourceUnavailableFault" element
     */
    public org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType getResourceUnavailableFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType)get_store().find_element_user(RESOURCEUNAVAILABLEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceUnavailableFault" element
     */
    public void setResourceUnavailableFault(org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType resourceUnavailableFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType)get_store().find_element_user(RESOURCEUNAVAILABLEFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType)get_store().add_element_user(RESOURCEUNAVAILABLEFAULT$0);
            }
            target.set(resourceUnavailableFault);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceUnavailableFault" element
     */
    public org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType addNewResourceUnavailableFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.r2.ResourceUnavailableFaultType)get_store().add_element_user(RESOURCEUNAVAILABLEFAULT$0);
            return target;
        }
    }
}
