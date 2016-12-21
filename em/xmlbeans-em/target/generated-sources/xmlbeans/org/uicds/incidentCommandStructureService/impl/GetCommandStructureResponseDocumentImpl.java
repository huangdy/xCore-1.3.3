/*
 * An XML document type.
 * Localname: GetCommandStructureResponse
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService.impl;
/**
 * A document containing one GetCommandStructureResponse(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public class GetCommandStructureResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCommandStructureResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMMANDSTRUCTURERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "GetCommandStructureResponse");
    
    
    /**
     * Gets the "GetCommandStructureResponse" element
     */
    public org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse getGetCommandStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse)get_store().find_element_user(GETCOMMANDSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCommandStructureResponse" element
     */
    public void setGetCommandStructureResponse(org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse getCommandStructureResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse)get_store().find_element_user(GETCOMMANDSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse)get_store().add_element_user(GETCOMMANDSTRUCTURERESPONSE$0);
            }
            target.set(getCommandStructureResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCommandStructureResponse" element
     */
    public org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse addNewGetCommandStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse)get_store().add_element_user(GETCOMMANDSTRUCTURERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCommandStructureResponse(@http://uicds.org/IncidentCommandStructureService).
     *
     * This is a complex type.
     */
    public static class GetCommandStructureResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument.GetCommandStructureResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCommandStructureResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
