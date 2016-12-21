/*
 * An XML document type.
 * Localname: CloseIncidentRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.CloseIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one CloseIncidentRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CloseIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CloseIncidentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CloseIncidentRequest");
    
    
    /**
     * Gets the "CloseIncidentRequest" element
     */
    public org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest getCloseIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest)get_store().find_element_user(CLOSEINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseIncidentRequest" element
     */
    public void setCloseIncidentRequest(org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest closeIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest)get_store().find_element_user(CLOSEINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest)get_store().add_element_user(CLOSEINCIDENTREQUEST$0);
            }
            target.set(closeIncidentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CloseIncidentRequest" element
     */
    public org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest addNewCloseIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest)get_store().add_element_user(CLOSEINCIDENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CloseIncidentRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CloseIncidentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CloseIncidentRequestDocument.CloseIncidentRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CloseIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "IncidentID");
        
        
        /**
         * Gets the "IncidentID" element
         */
        public java.lang.String getIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncidentID" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IncidentID" element
         */
        public void setIncidentID(java.lang.String incidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$0);
                }
                target.setStringValue(incidentID);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentID" element
         */
        public void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$0);
                }
                target.set(incidentID);
            }
        }
    }
}
