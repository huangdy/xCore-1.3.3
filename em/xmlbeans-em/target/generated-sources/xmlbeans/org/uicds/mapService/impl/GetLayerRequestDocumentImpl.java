/*
 * An XML document type.
 * Localname: GetLayerRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.GetLayerRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one GetLayerRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class GetLayerRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetLayerRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLayerRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLAYERREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "GetLayerRequest");
    
    
    /**
     * Gets the "GetLayerRequest" element
     */
    public org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest getGetLayerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest target = null;
            target = (org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest)get_store().find_element_user(GETLAYERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLayerRequest" element
     */
    public void setGetLayerRequest(org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest getLayerRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest target = null;
            target = (org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest)get_store().find_element_user(GETLAYERREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest)get_store().add_element_user(GETLAYERREQUEST$0);
            }
            target.set(getLayerRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLayerRequest" element
     */
    public org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest addNewGetLayerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest target = null;
            target = (org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest)get_store().add_element_user(GETLAYERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetLayerRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class GetLayerRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetLayerRequestDocument.GetLayerRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetLayerRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
