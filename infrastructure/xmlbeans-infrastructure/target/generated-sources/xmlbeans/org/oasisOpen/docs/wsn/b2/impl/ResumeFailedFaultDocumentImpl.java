/*
 * An XML document type.
 * Localname: ResumeFailedFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.ResumeFailedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one ResumeFailedFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class ResumeFailedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.ResumeFailedFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResumeFailedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESUMEFAILEDFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ResumeFailedFault");
    
    
    /**
     * Gets the "ResumeFailedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType getResumeFailedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType)get_store().find_element_user(RESUMEFAILEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResumeFailedFault" element
     */
    public void setResumeFailedFault(org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType resumeFailedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType)get_store().find_element_user(RESUMEFAILEDFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType)get_store().add_element_user(RESUMEFAILEDFAULT$0);
            }
            target.set(resumeFailedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "ResumeFailedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType addNewResumeFailedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeFailedFaultType)get_store().add_element_user(RESUMEFAILEDFAULT$0);
            return target;
        }
    }
}
