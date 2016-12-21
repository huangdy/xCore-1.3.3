/*
 * An XML document type.
 * Localname: GetIncidentCurrentVersionResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one GetIncidentCurrentVersionResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class GetIncidentCurrentVersionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetIncidentCurrentVersionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINCIDENTCURRENTVERSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "GetIncidentCurrentVersionResponse");
    
    
    /**
     * Gets the "GetIncidentCurrentVersionResponse" element
     */
    public org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse getGetIncidentCurrentVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse target = null;
            target = (org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse)get_store().find_element_user(GETINCIDENTCURRENTVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetIncidentCurrentVersionResponse" element
     */
    public void setGetIncidentCurrentVersionResponse(org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse getIncidentCurrentVersionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse target = null;
            target = (org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse)get_store().find_element_user(GETINCIDENTCURRENTVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse)get_store().add_element_user(GETINCIDENTCURRENTVERSIONRESPONSE$0);
            }
            target.set(getIncidentCurrentVersionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetIncidentCurrentVersionResponse" element
     */
    public org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse addNewGetIncidentCurrentVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse target = null;
            target = (org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse)get_store().add_element_user(GETINCIDENTCURRENTVERSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetIncidentCurrentVersionResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class GetIncidentCurrentVersionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument.GetIncidentCurrentVersionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetIncidentCurrentVersionResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
