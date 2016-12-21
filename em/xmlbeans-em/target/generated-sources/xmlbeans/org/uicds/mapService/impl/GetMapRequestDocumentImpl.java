/*
 * An XML document type.
 * Localname: GetMapRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.GetMapRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one GetMapRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class GetMapRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetMapRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMapRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "GetMapRequest");
    
    
    /**
     * Gets the "GetMapRequest" element
     */
    public org.uicds.mapService.GetMapRequestDocument.GetMapRequest getGetMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapRequestDocument.GetMapRequest target = null;
            target = (org.uicds.mapService.GetMapRequestDocument.GetMapRequest)get_store().find_element_user(GETMAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMapRequest" element
     */
    public void setGetMapRequest(org.uicds.mapService.GetMapRequestDocument.GetMapRequest getMapRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapRequestDocument.GetMapRequest target = null;
            target = (org.uicds.mapService.GetMapRequestDocument.GetMapRequest)get_store().find_element_user(GETMAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.GetMapRequestDocument.GetMapRequest)get_store().add_element_user(GETMAPREQUEST$0);
            }
            target.set(getMapRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMapRequest" element
     */
    public org.uicds.mapService.GetMapRequestDocument.GetMapRequest addNewGetMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapRequestDocument.GetMapRequest target = null;
            target = (org.uicds.mapService.GetMapRequestDocument.GetMapRequest)get_store().add_element_user(GETMAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetMapRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class GetMapRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetMapRequestDocument.GetMapRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetMapRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
    }
}
