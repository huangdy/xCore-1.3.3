/*
 * An XML document type.
 * Localname: GetLEITSCIncidentResponse
 * Namespace: http://uicds.org/LEITSCService
 * Java type: org.uicds.leitscService.GetLEITSCIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.leitscService.impl;
/**
 * A document containing one GetLEITSCIncidentResponse(@http://uicds.org/LEITSCService) element.
 *
 * This is a complex type.
 */
public class GetLEITSCIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.leitscService.GetLEITSCIncidentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLEITSCIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLEITSCINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LEITSCService", "GetLEITSCIncidentResponse");
    
    
    /**
     * Gets the "GetLEITSCIncidentResponse" element
     */
    public org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse getGetLEITSCIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse target = null;
            target = (org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse)get_store().find_element_user(GETLEITSCINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLEITSCIncidentResponse" element
     */
    public void setGetLEITSCIncidentResponse(org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse getLEITSCIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse target = null;
            target = (org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse)get_store().find_element_user(GETLEITSCINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse)get_store().add_element_user(GETLEITSCINCIDENTRESPONSE$0);
            }
            target.set(getLEITSCIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLEITSCIncidentResponse" element
     */
    public org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse addNewGetLEITSCIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse target = null;
            target = (org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse)get_store().add_element_user(GETLEITSCINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLEITSCIncidentResponse(@http://uicds.org/LEITSCService).
     *
     * This is a complex type.
     */
    public static class GetLEITSCIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLEITSCIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
