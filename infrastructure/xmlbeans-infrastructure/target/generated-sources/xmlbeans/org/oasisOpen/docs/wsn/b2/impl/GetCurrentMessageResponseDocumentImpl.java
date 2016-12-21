/*
 * An XML document type.
 * Localname: GetCurrentMessageResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one GetCurrentMessageResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class GetCurrentMessageResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCurrentMessageResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTMESSAGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "GetCurrentMessageResponse");
    
    
    /**
     * Gets the "GetCurrentMessageResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse getGetCurrentMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse)get_store().find_element_user(GETCURRENTMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCurrentMessageResponse" element
     */
    public void setGetCurrentMessageResponse(org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse getCurrentMessageResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse)get_store().find_element_user(GETCURRENTMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse)get_store().add_element_user(GETCURRENTMESSAGERESPONSE$0);
            }
            target.set(getCurrentMessageResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCurrentMessageResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse addNewGetCurrentMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse)get_store().add_element_user(GETCURRENTMESSAGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCurrentMessageResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class GetCurrentMessageResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.GetCurrentMessageResponseDocument.GetCurrentMessageResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCurrentMessageResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
