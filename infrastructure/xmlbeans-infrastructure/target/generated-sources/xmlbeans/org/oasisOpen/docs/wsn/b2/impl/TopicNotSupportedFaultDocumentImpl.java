/*
 * An XML document type.
 * Localname: TopicNotSupportedFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one TopicNotSupportedFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class TopicNotSupportedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicNotSupportedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICNOTSUPPORTEDFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicNotSupportedFault");
    
    
    /**
     * Gets the "TopicNotSupportedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType getTopicNotSupportedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType)get_store().find_element_user(TOPICNOTSUPPORTEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopicNotSupportedFault" element
     */
    public void setTopicNotSupportedFault(org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType topicNotSupportedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType)get_store().find_element_user(TOPICNOTSUPPORTEDFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType)get_store().add_element_user(TOPICNOTSUPPORTEDFAULT$0);
            }
            target.set(topicNotSupportedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "TopicNotSupportedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType addNewTopicNotSupportedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicNotSupportedFaultType)get_store().add_element_user(TOPICNOTSUPPORTEDFAULT$0);
            return target;
        }
    }
}
