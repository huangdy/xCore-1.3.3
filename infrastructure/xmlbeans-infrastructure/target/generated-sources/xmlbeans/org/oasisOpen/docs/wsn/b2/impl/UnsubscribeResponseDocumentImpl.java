/*
 * An XML document type.
 * Localname: UnsubscribeResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UnsubscribeResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnsubscribeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsubscribeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSUBSCRIBERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnsubscribeResponse");
    
    
    /**
     * Gets the "UnsubscribeResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse getUnsubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse)get_store().find_element_user(UNSUBSCRIBERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnsubscribeResponse" element
     */
    public void setUnsubscribeResponse(org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse unsubscribeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse)get_store().find_element_user(UNSUBSCRIBERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse)get_store().add_element_user(UNSUBSCRIBERESPONSE$0);
            }
            target.set(unsubscribeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UnsubscribeResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse addNewUnsubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse)get_store().add_element_user(UNSUBSCRIBERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UnsubscribeResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class UnsubscribeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnsubscribeResponseDocument.UnsubscribeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UnsubscribeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
