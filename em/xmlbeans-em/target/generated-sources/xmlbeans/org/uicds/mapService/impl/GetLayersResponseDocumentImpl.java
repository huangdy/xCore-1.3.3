/*
 * An XML document type.
 * Localname: GetLayersResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.GetLayersResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one GetLayersResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class GetLayersResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetLayersResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLayersResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLAYERSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "GetLayersResponse");
    
    
    /**
     * Gets the "GetLayersResponse" element
     */
    public org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse getGetLayersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse target = null;
            target = (org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse)get_store().find_element_user(GETLAYERSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLayersResponse" element
     */
    public void setGetLayersResponse(org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse getLayersResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse target = null;
            target = (org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse)get_store().find_element_user(GETLAYERSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse)get_store().add_element_user(GETLAYERSRESPONSE$0);
            }
            target.set(getLayersResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLayersResponse" element
     */
    public org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse addNewGetLayersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse target = null;
            target = (org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse)get_store().add_element_user(GETLAYERSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLayersResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class GetLayersResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetLayersResponseDocument.GetLayersResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLayersResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCT$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
        
        
        /**
         * Gets array of all "WorkProduct" elements
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct[] getWorkProductArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WORKPRODUCT$0, targetList);
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct[] result = new com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProductArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "WorkProduct" element
         */
        public int sizeOfWorkProductArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKPRODUCT$0);
            }
        }
        
        /**
         * Sets array of all "WorkProduct" element
         */
        public void setWorkProductArray(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct[] workProductArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(workProductArray, WORKPRODUCT$0);
            }
        }
        
        /**
         * Sets ith "WorkProduct" element
         */
        public void setWorkProductArray(int i, com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(workProduct);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct insertNewWorkProduct(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().insert_element_user(WORKPRODUCT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "WorkProduct" element
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
        
        /**
         * Removes the ith "WorkProduct" element
         */
        public void removeWorkProduct(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKPRODUCT$0, i);
            }
        }
    }
}
