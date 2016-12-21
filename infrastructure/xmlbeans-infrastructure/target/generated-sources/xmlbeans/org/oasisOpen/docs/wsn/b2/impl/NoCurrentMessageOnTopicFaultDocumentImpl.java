/*
 * An XML document type.
 * Localname: NoCurrentMessageOnTopicFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one NoCurrentMessageOnTopicFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class NoCurrentMessageOnTopicFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public NoCurrentMessageOnTopicFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOCURRENTMESSAGEONTOPICFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "NoCurrentMessageOnTopicFault");
    
    
    /**
     * Gets the "NoCurrentMessageOnTopicFault" element
     */
    public org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType getNoCurrentMessageOnTopicFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType)get_store().find_element_user(NOCURRENTMESSAGEONTOPICFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NoCurrentMessageOnTopicFault" element
     */
    public void setNoCurrentMessageOnTopicFault(org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType noCurrentMessageOnTopicFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType)get_store().find_element_user(NOCURRENTMESSAGEONTOPICFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType)get_store().add_element_user(NOCURRENTMESSAGEONTOPICFAULT$0);
            }
            target.set(noCurrentMessageOnTopicFault);
        }
    }
    
    /**
     * Appends and returns a new empty "NoCurrentMessageOnTopicFault" element
     */
    public org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType addNewNoCurrentMessageOnTopicFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NoCurrentMessageOnTopicFaultType)get_store().add_element_user(NOCURRENTMESSAGEONTOPICFAULT$0);
            return target;
        }
    }
}
