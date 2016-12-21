/*
 * An XML document type.
 * Localname: GetCommandStructureByIncidentResponse
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService.impl;
/**
 * A document containing one GetCommandStructureByIncidentResponse(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public class GetCommandStructureByIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCommandStructureByIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMMANDSTRUCTUREBYINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "GetCommandStructureByIncidentResponse");
    
    
    /**
     * Gets the "GetCommandStructureByIncidentResponse" element
     */
    public org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse getGetCommandStructureByIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse)get_store().find_element_user(GETCOMMANDSTRUCTUREBYINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCommandStructureByIncidentResponse" element
     */
    public void setGetCommandStructureByIncidentResponse(org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse getCommandStructureByIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse)get_store().find_element_user(GETCOMMANDSTRUCTUREBYINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse)get_store().add_element_user(GETCOMMANDSTRUCTUREBYINCIDENTRESPONSE$0);
            }
            target.set(getCommandStructureByIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCommandStructureByIncidentResponse" element
     */
    public org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse addNewGetCommandStructureByIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse)get_store().add_element_user(GETCOMMANDSTRUCTUREBYINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCommandStructureByIncidentResponse(@http://uicds.org/IncidentCommandStructureService).
     *
     * This is a complex type.
     */
    public static class GetCommandStructureByIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentResponseDocument.GetCommandStructureByIncidentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCommandStructureByIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
