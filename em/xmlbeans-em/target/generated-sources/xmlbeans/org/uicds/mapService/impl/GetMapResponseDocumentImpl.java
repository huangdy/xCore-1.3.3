/*
 * An XML document type.
 * Localname: GetMapResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.GetMapResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one GetMapResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class GetMapResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetMapResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMapResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "GetMapResponse");
    
    
    /**
     * Gets the "GetMapResponse" element
     */
    public org.uicds.mapService.GetMapResponseDocument.GetMapResponse getGetMapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapResponseDocument.GetMapResponse target = null;
            target = (org.uicds.mapService.GetMapResponseDocument.GetMapResponse)get_store().find_element_user(GETMAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMapResponse" element
     */
    public void setGetMapResponse(org.uicds.mapService.GetMapResponseDocument.GetMapResponse getMapResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapResponseDocument.GetMapResponse target = null;
            target = (org.uicds.mapService.GetMapResponseDocument.GetMapResponse)get_store().find_element_user(GETMAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.GetMapResponseDocument.GetMapResponse)get_store().add_element_user(GETMAPRESPONSE$0);
            }
            target.set(getMapResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMapResponse" element
     */
    public org.uicds.mapService.GetMapResponseDocument.GetMapResponse addNewGetMapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapResponseDocument.GetMapResponse target = null;
            target = (org.uicds.mapService.GetMapResponseDocument.GetMapResponse)get_store().add_element_user(GETMAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetMapResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class GetMapResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetMapResponseDocument.GetMapResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetMapResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
