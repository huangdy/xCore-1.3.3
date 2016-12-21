/*
 * An XML document type.
 * Localname: CloseIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.CloseIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one CloseIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CloseIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CloseIncidentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CloseIncidentResponse");
    
    
    /**
     * Gets the "CloseIncidentResponse" element
     */
    public org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse getCloseIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse)get_store().find_element_user(CLOSEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseIncidentResponse" element
     */
    public void setCloseIncidentResponse(org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse closeIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse)get_store().find_element_user(CLOSEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse)get_store().add_element_user(CLOSEINCIDENTRESPONSE$0);
            }
            target.set(closeIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CloseIncidentResponse" element
     */
    public org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse addNewCloseIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse)get_store().add_element_user(CLOSEINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CloseIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CloseIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CloseIncidentResponseDocument.CloseIncidentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CloseIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTPROCESSINGSTATUS$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProcessingStatus");
        
        
        /**
         * Gets the "WorkProductProcessingStatus" element
         */
        public com.saic.precis.x2009.x06.base.ProcessingStatusType getWorkProductProcessingStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
                target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().find_element_user(WORKPRODUCTPROCESSINGSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductProcessingStatus" element
         */
        public void setWorkProductProcessingStatus(com.saic.precis.x2009.x06.base.ProcessingStatusType workProductProcessingStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
                target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().find_element_user(WORKPRODUCTPROCESSINGSTATUS$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().add_element_user(WORKPRODUCTPROCESSINGSTATUS$0);
                }
                target.set(workProductProcessingStatus);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductProcessingStatus" element
         */
        public com.saic.precis.x2009.x06.base.ProcessingStatusType addNewWorkProductProcessingStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
                target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().add_element_user(WORKPRODUCTPROCESSINGSTATUS$0);
                return target;
            }
        }
    }
}
