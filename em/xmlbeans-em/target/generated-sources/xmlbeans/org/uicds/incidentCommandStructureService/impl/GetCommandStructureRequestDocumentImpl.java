/*
 * An XML document type.
 * Localname: GetCommandStructureRequest
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService.impl;
/**
 * A document containing one GetCommandStructureRequest(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public class GetCommandStructureRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCommandStructureRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMMANDSTRUCTUREREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "GetCommandStructureRequest");
    
    
    /**
     * Gets the "GetCommandStructureRequest" element
     */
    public org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest getGetCommandStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest)get_store().find_element_user(GETCOMMANDSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCommandStructureRequest" element
     */
    public void setGetCommandStructureRequest(org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest getCommandStructureRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest)get_store().find_element_user(GETCOMMANDSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest)get_store().add_element_user(GETCOMMANDSTRUCTUREREQUEST$0);
            }
            target.set(getCommandStructureRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCommandStructureRequest" element
     */
    public org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest addNewGetCommandStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest)get_store().add_element_user(GETCOMMANDSTRUCTUREREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetCommandStructureRequest(@http://uicds.org/IncidentCommandStructureService).
     *
     * This is a complex type.
     */
    public static class GetCommandStructureRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument.GetCommandStructureRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetCommandStructureRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
