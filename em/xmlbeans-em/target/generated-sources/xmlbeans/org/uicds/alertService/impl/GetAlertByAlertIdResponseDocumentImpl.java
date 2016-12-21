/*
 * An XML document type.
 * Localname: GetAlertByAlertIdResponse
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.GetAlertByAlertIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one GetAlertByAlertIdResponse(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class GetAlertByAlertIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetAlertByAlertIdResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAlertByAlertIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALERTBYALERTIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "GetAlertByAlertIdResponse");
    
    
    /**
     * Gets the "GetAlertByAlertIdResponse" element
     */
    public org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse getGetAlertByAlertIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse target = null;
            target = (org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse)get_store().find_element_user(GETALERTBYALERTIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAlertByAlertIdResponse" element
     */
    public void setGetAlertByAlertIdResponse(org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse getAlertByAlertIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse target = null;
            target = (org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse)get_store().find_element_user(GETALERTBYALERTIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse)get_store().add_element_user(GETALERTBYALERTIDRESPONSE$0);
            }
            target.set(getAlertByAlertIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAlertByAlertIdResponse" element
     */
    public org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse addNewGetAlertByAlertIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse target = null;
            target = (org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse)get_store().add_element_user(GETALERTBYALERTIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAlertByAlertIdResponse(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class GetAlertByAlertIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetAlertByAlertIdResponseDocument.GetAlertByAlertIdResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAlertByAlertIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
