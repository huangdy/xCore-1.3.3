/*
 * An XML document type.
 * Localname: MultipleTopicsSpecifiedFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one MultipleTopicsSpecifiedFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class MultipleTopicsSpecifiedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultipleTopicsSpecifiedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPLETOPICSSPECIFIEDFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "MultipleTopicsSpecifiedFault");
    
    
    /**
     * Gets the "MultipleTopicsSpecifiedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType getMultipleTopicsSpecifiedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType)get_store().find_element_user(MULTIPLETOPICSSPECIFIEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultipleTopicsSpecifiedFault" element
     */
    public void setMultipleTopicsSpecifiedFault(org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType multipleTopicsSpecifiedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType)get_store().find_element_user(MULTIPLETOPICSSPECIFIEDFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType)get_store().add_element_user(MULTIPLETOPICSSPECIFIEDFAULT$0);
            }
            target.set(multipleTopicsSpecifiedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "MultipleTopicsSpecifiedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType addNewMultipleTopicsSpecifiedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.MultipleTopicsSpecifiedFaultType)get_store().add_element_user(MULTIPLETOPICSSPECIFIEDFAULT$0);
            return target;
        }
    }
}
