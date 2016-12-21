/*
 * An XML document type.
 * Localname: UpdateLayerRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.UpdateLayerRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one UpdateLayerRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class UpdateLayerRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.UpdateLayerRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateLayerRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATELAYERREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "UpdateLayerRequest");
    
    
    /**
     * Gets the "UpdateLayerRequest" element
     */
    public org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest getUpdateLayerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest target = null;
            target = (org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest)get_store().find_element_user(UPDATELAYERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateLayerRequest" element
     */
    public void setUpdateLayerRequest(org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest updateLayerRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest target = null;
            target = (org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest)get_store().find_element_user(UPDATELAYERREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest)get_store().add_element_user(UPDATELAYERREQUEST$0);
            }
            target.set(updateLayerRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateLayerRequest" element
     */
    public org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest addNewUpdateLayerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest target = null;
            target = (org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest)get_store().add_element_user(UPDATELAYERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateLayerRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class UpdateLayerRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.UpdateLayerRequestDocument.UpdateLayerRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateLayerRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        private static final javax.xml.namespace.QName LAYER$2 = 
            new javax.xml.namespace.QName("http://uicds.org/MapService", "Layer");
        
        
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
        
        /**
         * Gets the "Layer" element
         */
        public net.opengis.context.LayerType getLayer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.LayerType target = null;
                target = (net.opengis.context.LayerType)get_store().find_element_user(LAYER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Layer" element
         */
        public void setLayer(net.opengis.context.LayerType layer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.LayerType target = null;
                target = (net.opengis.context.LayerType)get_store().find_element_user(LAYER$2, 0);
                if (target == null)
                {
                    target = (net.opengis.context.LayerType)get_store().add_element_user(LAYER$2);
                }
                target.set(layer);
            }
        }
        
        /**
         * Appends and returns a new empty "Layer" element
         */
        public net.opengis.context.LayerType addNewLayer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.LayerType target = null;
                target = (net.opengis.context.LayerType)get_store().add_element_user(LAYER$2);
                return target;
            }
        }
    }
}
