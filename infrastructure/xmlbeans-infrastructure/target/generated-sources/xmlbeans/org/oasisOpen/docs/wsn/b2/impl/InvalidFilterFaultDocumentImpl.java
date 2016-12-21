/*
 * An XML document type.
 * Localname: InvalidFilterFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.InvalidFilterFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one InvalidFilterFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class InvalidFilterFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.InvalidFilterFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvalidFilterFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVALIDFILTERFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InvalidFilterFault");
    
    
    /**
     * Gets the "InvalidFilterFault" element
     */
    public org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType getInvalidFilterFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType)get_store().find_element_user(INVALIDFILTERFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InvalidFilterFault" element
     */
    public void setInvalidFilterFault(org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType invalidFilterFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType)get_store().find_element_user(INVALIDFILTERFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType)get_store().add_element_user(INVALIDFILTERFAULT$0);
            }
            target.set(invalidFilterFault);
        }
    }
    
    /**
     * Appends and returns a new empty "InvalidFilterFault" element
     */
    public org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType addNewInvalidFilterFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType)get_store().add_element_user(INVALIDFILTERFAULT$0);
            return target;
        }
    }
}
