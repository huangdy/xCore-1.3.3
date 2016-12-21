/*
 * An XML document type.
 * Localname: UnableToDestroyPullPointFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UnableToDestroyPullPointFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnableToDestroyPullPointFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnableToDestroyPullPointFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNABLETODESTROYPULLPOINTFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroyPullPointFault");
    
    
    /**
     * Gets the "UnableToDestroyPullPointFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType getUnableToDestroyPullPointFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType)get_store().find_element_user(UNABLETODESTROYPULLPOINTFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnableToDestroyPullPointFault" element
     */
    public void setUnableToDestroyPullPointFault(org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType unableToDestroyPullPointFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType)get_store().find_element_user(UNABLETODESTROYPULLPOINTFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType)get_store().add_element_user(UNABLETODESTROYPULLPOINTFAULT$0);
            }
            target.set(unableToDestroyPullPointFault);
        }
    }
    
    /**
     * Appends and returns a new empty "UnableToDestroyPullPointFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType addNewUnableToDestroyPullPointFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToDestroyPullPointFaultType)get_store().add_element_user(UNABLETODESTROYPULLPOINTFAULT$0);
            return target;
        }
    }
}
