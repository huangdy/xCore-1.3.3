/*
 * An XML document type.
 * Localname: WorkProductPublicationResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.WorkProductPublicationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one WorkProductPublicationResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class WorkProductPublicationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.WorkProductPublicationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductPublicationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTPUBLICATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductPublicationResponse");
    
    
    /**
     * Gets the "WorkProductPublicationResponse" element
     */
    public org.uicds.workProductService.WorkProductPublicationResponseType getWorkProductPublicationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.WorkProductPublicationResponseType target = null;
            target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductPublicationResponse" element
     */
    public void setWorkProductPublicationResponse(org.uicds.workProductService.WorkProductPublicationResponseType workProductPublicationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.WorkProductPublicationResponseType target = null;
            target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().add_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0);
            }
            target.set(workProductPublicationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductPublicationResponse" element
     */
    public org.uicds.workProductService.WorkProductPublicationResponseType addNewWorkProductPublicationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.WorkProductPublicationResponseType target = null;
            target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().add_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0);
            return target;
        }
    }
}
