/*
 * An XML document type.
 * Localname: UpdateEndpointRequest
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.UpdateEndpointRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one UpdateEndpointRequest(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class UpdateEndpointRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.UpdateEndpointRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateEndpointRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEENDPOINTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "UpdateEndpointRequest");
    
    
    /**
     * Gets the "UpdateEndpointRequest" element
     */
    public org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest getUpdateEndpointRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest target = null;
            target = (org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest)get_store().find_element_user(UPDATEENDPOINTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateEndpointRequest" element
     */
    public void setUpdateEndpointRequest(org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest updateEndpointRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest target = null;
            target = (org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest)get_store().find_element_user(UPDATEENDPOINTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest)get_store().add_element_user(UPDATEENDPOINTREQUEST$0);
            }
            target.set(updateEndpointRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateEndpointRequest" element
     */
    public org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest addNewUpdateEndpointRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest target = null;
            target = (org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest)get_store().add_element_user(UPDATEENDPOINTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateEndpointRequest(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class UpdateEndpointRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.UpdateEndpointRequestDocument.UpdateEndpointRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateEndpointRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ID");
        private static final javax.xml.namespace.QName ENDPOINT$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "Endpoint");
        private static final javax.xml.namespace.QName ISWEBSERVICE$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "IsWebService");
        
        
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
        
        /**
         * Gets the "Endpoint" element
         */
        public java.lang.String getEndpoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Endpoint" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetEndpoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Endpoint" element
         */
        public void setEndpoint(java.lang.String endpoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$2);
                }
                target.setStringValue(endpoint);
            }
        }
        
        /**
         * Sets (as xml) the "Endpoint" element
         */
        public void xsetEndpoint(org.apache.xmlbeans.XmlAnyURI endpoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENDPOINT$2);
                }
                target.set(endpoint);
            }
        }
        
        /**
         * Gets the "IsWebService" element
         */
        public boolean getIsWebService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISWEBSERVICE$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "IsWebService" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetIsWebService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISWEBSERVICE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IsWebService" element
         */
        public void setIsWebService(boolean isWebService)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISWEBSERVICE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISWEBSERVICE$4);
                }
                target.setBooleanValue(isWebService);
            }
        }
        
        /**
         * Sets (as xml) the "IsWebService" element
         */
        public void xsetIsWebService(org.apache.xmlbeans.XmlBoolean isWebService)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISWEBSERVICE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISWEBSERVICE$4);
                }
                target.set(isWebService);
            }
        }
    }
}
