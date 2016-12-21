/*
 * An XML document type.
 * Localname: ArchiveProductRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.ArchiveProductRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one ArchiveProductRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class ArchiveProductRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.ArchiveProductRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArchiveProductRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHIVEPRODUCTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "ArchiveProductRequest");
    
    
    /**
     * Gets the "ArchiveProductRequest" element
     */
    public org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest getArchiveProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest target = null;
            target = (org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest)get_store().find_element_user(ARCHIVEPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArchiveProductRequest" element
     */
    public void setArchiveProductRequest(org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest archiveProductRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest target = null;
            target = (org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest)get_store().find_element_user(ARCHIVEPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest)get_store().add_element_user(ARCHIVEPRODUCTREQUEST$0);
            }
            target.set(archiveProductRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ArchiveProductRequest" element
     */
    public org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest addNewArchiveProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest target = null;
            target = (org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest)get_store().add_element_user(ARCHIVEPRODUCTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ArchiveProductRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class ArchiveProductRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.ArchiveProductRequestDocument.ArchiveProductRequest
    {
        private static final long serialVersionUID = 1L;
        
        public ArchiveProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
    }
}
