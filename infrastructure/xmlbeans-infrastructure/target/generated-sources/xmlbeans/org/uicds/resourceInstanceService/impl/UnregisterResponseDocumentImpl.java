/*
 * An XML document type.
 * Localname: UnregisterResponse
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.UnregisterResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one UnregisterResponse(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class UnregisterResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.UnregisterResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnregisterResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNREGISTERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "UnregisterResponse");
    
    
    /**
     * Gets the "UnregisterResponse" element
     */
    public org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse getUnregisterResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse target = null;
            target = (org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse)get_store().find_element_user(UNREGISTERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnregisterResponse" element
     */
    public void setUnregisterResponse(org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse unregisterResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse target = null;
            target = (org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse)get_store().find_element_user(UNREGISTERRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse)get_store().add_element_user(UNREGISTERRESPONSE$0);
            }
            target.set(unregisterResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UnregisterResponse" element
     */
    public org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse addNewUnregisterResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse target = null;
            target = (org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse)get_store().add_element_user(UNREGISTERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UnregisterResponse(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class UnregisterResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.UnregisterResponseDocument.UnregisterResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UnregisterResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ID");
        
        
        /**
         * Gets the "ID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ID" element
         */
        public void setID(com.saic.precis.x2009.x06.base.IdentifierType id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "ID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ID$0);
                return target;
            }
        }
    }
}
