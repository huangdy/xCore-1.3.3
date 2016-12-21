/*
 * An XML document type.
 * Localname: GetLayerResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.GetLayerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one GetLayerResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class GetLayerResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetLayerResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLayerResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLAYERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "GetLayerResponse");
    
    
    /**
     * Gets the "GetLayerResponse" element
     */
    public org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse getGetLayerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse target = null;
            target = (org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse)get_store().find_element_user(GETLAYERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLayerResponse" element
     */
    public void setGetLayerResponse(org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse getLayerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse target = null;
            target = (org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse)get_store().find_element_user(GETLAYERRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse)get_store().add_element_user(GETLAYERRESPONSE$0);
            }
            target.set(getLayerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLayerResponse" element
     */
    public org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse addNewGetLayerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse target = null;
            target = (org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse)get_store().add_element_user(GETLAYERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLayerResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class GetLayerResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetLayerResponseDocument.GetLayerResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLayerResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCT$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
        
        
        /**
         * Gets the "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProduct" element
         */
        public void setWorkProduct(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                }
                target.set(workProduct);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct addNewWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                return target;
            }
        }
    }
}
