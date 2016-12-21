/*
 * An XML document type.
 * Localname: UnableToCreatePullPointFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UnableToCreatePullPointFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnableToCreatePullPointFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnableToCreatePullPointFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNABLETOCREATEPULLPOINTFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnableToCreatePullPointFault");
    
    
    /**
     * Gets the "UnableToCreatePullPointFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType getUnableToCreatePullPointFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType)get_store().find_element_user(UNABLETOCREATEPULLPOINTFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnableToCreatePullPointFault" element
     */
    public void setUnableToCreatePullPointFault(org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType unableToCreatePullPointFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType)get_store().find_element_user(UNABLETOCREATEPULLPOINTFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType)get_store().add_element_user(UNABLETOCREATEPULLPOINTFAULT$0);
            }
            target.set(unableToCreatePullPointFault);
        }
    }
    
    /**
     * Appends and returns a new empty "UnableToCreatePullPointFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType addNewUnableToCreatePullPointFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToCreatePullPointFaultType)get_store().add_element_user(UNABLETOCREATEPULLPOINTFAULT$0);
            return target;
        }
    }
}
