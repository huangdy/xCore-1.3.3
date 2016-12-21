/*
 * An XML document type.
 * Localname: SubmitShapefileResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.SubmitShapefileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one SubmitShapefileResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class SubmitShapefileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitShapefileResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitShapefileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSHAPEFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "SubmitShapefileResponse");
    
    
    /**
     * Gets the "SubmitShapefileResponse" element
     */
    public org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse getSubmitShapefileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse target = null;
            target = (org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse)get_store().find_element_user(SUBMITSHAPEFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitShapefileResponse" element
     */
    public void setSubmitShapefileResponse(org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse submitShapefileResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse target = null;
            target = (org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse)get_store().find_element_user(SUBMITSHAPEFILERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse)get_store().add_element_user(SUBMITSHAPEFILERESPONSE$0);
            }
            target.set(submitShapefileResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitShapefileResponse" element
     */
    public org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse addNewSubmitShapefileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse target = null;
            target = (org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse)get_store().add_element_user(SUBMITSHAPEFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitShapefileResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class SubmitShapefileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitShapefileResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTPUBLICATIONRESPONSE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductPublicationResponse");
        
        
        /**
         * Gets array of all "WorkProductPublicationResponse" elements
         */
        public org.uicds.workProductService.WorkProductPublicationResponseType[] getWorkProductPublicationResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WORKPRODUCTPUBLICATIONRESPONSE$0, targetList);
                org.uicds.workProductService.WorkProductPublicationResponseType[] result = new org.uicds.workProductService.WorkProductPublicationResponseType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "WorkProductPublicationResponse" element
         */
        public org.uicds.workProductService.WorkProductPublicationResponseType getWorkProductPublicationResponseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "WorkProductPublicationResponse" element
         */
        public int sizeOfWorkProductPublicationResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKPRODUCTPUBLICATIONRESPONSE$0);
            }
        }
        
        /**
         * Sets array of all "WorkProductPublicationResponse" element
         */
        public void setWorkProductPublicationResponseArray(org.uicds.workProductService.WorkProductPublicationResponseType[] workProductPublicationResponseArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(workProductPublicationResponseArray, WORKPRODUCTPUBLICATIONRESPONSE$0);
            }
        }
        
        /**
         * Sets ith "WorkProductPublicationResponse" element
         */
        public void setWorkProductPublicationResponseArray(int i, org.uicds.workProductService.WorkProductPublicationResponseType workProductPublicationResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(workProductPublicationResponse);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "WorkProductPublicationResponse" element
         */
        public org.uicds.workProductService.WorkProductPublicationResponseType insertNewWorkProductPublicationResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().insert_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "WorkProductPublicationResponse" element
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
        
        /**
         * Removes the ith "WorkProductPublicationResponse" element
         */
        public void removeWorkProductPublicationResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKPRODUCTPUBLICATIONRESPONSE$0, i);
            }
        }
    }
}
