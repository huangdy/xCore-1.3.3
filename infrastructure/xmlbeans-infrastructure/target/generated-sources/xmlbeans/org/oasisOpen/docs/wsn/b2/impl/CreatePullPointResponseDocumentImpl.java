/*
 * An XML document type.
 * Localname: CreatePullPointResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one CreatePullPointResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class CreatePullPointResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreatePullPointResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPULLPOINTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CreatePullPointResponse");
    
    
    /**
     * Gets the "CreatePullPointResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse getCreatePullPointResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse)get_store().find_element_user(CREATEPULLPOINTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatePullPointResponse" element
     */
    public void setCreatePullPointResponse(org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse createPullPointResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse)get_store().find_element_user(CREATEPULLPOINTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse)get_store().add_element_user(CREATEPULLPOINTRESPONSE$0);
            }
            target.set(createPullPointResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatePullPointResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse addNewCreatePullPointResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse)get_store().add_element_user(CREATEPULLPOINTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreatePullPointResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class CreatePullPointResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.CreatePullPointResponseDocument.CreatePullPointResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreatePullPointResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PULLPOINT$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "PullPoint");
        
        
        /**
         * Gets the "PullPoint" element
         */
        public org.w3.x2005.x08.addressing.EndpointReferenceType getPullPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(PULLPOINT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "PullPoint" element
         */
        public void setPullPoint(org.w3.x2005.x08.addressing.EndpointReferenceType pullPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(PULLPOINT$0, 0);
                if (target == null)
                {
                    target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(PULLPOINT$0);
                }
                target.set(pullPoint);
            }
        }
        
        /**
         * Appends and returns a new empty "PullPoint" element
         */
        public org.w3.x2005.x08.addressing.EndpointReferenceType addNewPullPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(PULLPOINT$0);
                return target;
            }
        }
    }
}
