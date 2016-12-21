/*
 * An XML document type.
 * Localname: ArchiveIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.ArchiveIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one ArchiveIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class ArchiveIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.ArchiveIncidentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArchiveIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHIVEINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "ArchiveIncidentResponse");
    
    
    /**
     * Gets the "ArchiveIncidentResponse" element
     */
    public org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse getArchiveIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse)get_store().find_element_user(ARCHIVEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArchiveIncidentResponse" element
     */
    public void setArchiveIncidentResponse(org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse archiveIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse)get_store().find_element_user(ARCHIVEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse)get_store().add_element_user(ARCHIVEINCIDENTRESPONSE$0);
            }
            target.set(archiveIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ArchiveIncidentResponse" element
     */
    public org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse addNewArchiveIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse)get_store().add_element_user(ARCHIVEINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ArchiveIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class ArchiveIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.ArchiveIncidentResponseDocument.ArchiveIncidentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ArchiveIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
