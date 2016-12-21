/*
 * An XML document type.
 * Localname: GetAlertResponse
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.GetAlertResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one GetAlertResponse(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class GetAlertResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetAlertResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAlertResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALERTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "GetAlertResponse");
    
    
    /**
     * Gets the "GetAlertResponse" element
     */
    public org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse getGetAlertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse target = null;
            target = (org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse)get_store().find_element_user(GETALERTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAlertResponse" element
     */
    public void setGetAlertResponse(org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse getAlertResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse target = null;
            target = (org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse)get_store().find_element_user(GETALERTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse)get_store().add_element_user(GETALERTRESPONSE$0);
            }
            target.set(getAlertResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAlertResponse" element
     */
    public org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse addNewGetAlertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse target = null;
            target = (org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse)get_store().add_element_user(GETALERTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAlertResponse(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class GetAlertResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetAlertResponseDocument.GetAlertResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAlertResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
