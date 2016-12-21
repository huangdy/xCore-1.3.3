/*
 * An XML document type.
 * Localname: GetIncidentCurrentVersionRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one GetIncidentCurrentVersionRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class GetIncidentCurrentVersionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetIncidentCurrentVersionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINCIDENTCURRENTVERSIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "GetIncidentCurrentVersionRequest");
    
    
    /**
     * Gets the "GetIncidentCurrentVersionRequest" element
     */
    public org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest getGetIncidentCurrentVersionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest target = null;
            target = (org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest)get_store().find_element_user(GETINCIDENTCURRENTVERSIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetIncidentCurrentVersionRequest" element
     */
    public void setGetIncidentCurrentVersionRequest(org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest getIncidentCurrentVersionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest target = null;
            target = (org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest)get_store().find_element_user(GETINCIDENTCURRENTVERSIONREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest)get_store().add_element_user(GETINCIDENTCURRENTVERSIONREQUEST$0);
            }
            target.set(getIncidentCurrentVersionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetIncidentCurrentVersionRequest" element
     */
    public org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest addNewGetIncidentCurrentVersionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest target = null;
            target = (org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest)get_store().add_element_user(GETINCIDENTCURRENTVERSIONREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetIncidentCurrentVersionRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class GetIncidentCurrentVersionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetIncidentCurrentVersionRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Identifier");
        
        
        /**
         * Gets the "Identifier" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Identifier" element
         */
        public void setIdentifier(com.saic.precis.x2009.x06.base.IdentifierType identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Appends and returns a new empty "Identifier" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
    }
}
