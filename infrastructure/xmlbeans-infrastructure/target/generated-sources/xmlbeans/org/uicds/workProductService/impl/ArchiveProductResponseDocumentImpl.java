/*
 * An XML document type.
 * Localname: ArchiveProductResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.ArchiveProductResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one ArchiveProductResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class ArchiveProductResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.ArchiveProductResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArchiveProductResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHIVEPRODUCTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "ArchiveProductResponse");
    
    
    /**
     * Gets the "ArchiveProductResponse" element
     */
    public org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse getArchiveProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse target = null;
            target = (org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse)get_store().find_element_user(ARCHIVEPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArchiveProductResponse" element
     */
    public void setArchiveProductResponse(org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse archiveProductResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse target = null;
            target = (org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse)get_store().find_element_user(ARCHIVEPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse)get_store().add_element_user(ARCHIVEPRODUCTRESPONSE$0);
            }
            target.set(archiveProductResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ArchiveProductResponse" element
     */
    public org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse addNewArchiveProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse target = null;
            target = (org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse)get_store().add_element_user(ARCHIVEPRODUCTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ArchiveProductResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class ArchiveProductResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.ArchiveProductResponseDocument.ArchiveProductResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ArchiveProductResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
