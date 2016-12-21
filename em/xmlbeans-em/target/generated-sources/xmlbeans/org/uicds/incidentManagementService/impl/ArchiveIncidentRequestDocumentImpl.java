/*
 * An XML document type.
 * Localname: ArchiveIncidentRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.ArchiveIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one ArchiveIncidentRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class ArchiveIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.ArchiveIncidentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArchiveIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHIVEINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "ArchiveIncidentRequest");
    
    
    /**
     * Gets the "ArchiveIncidentRequest" element
     */
    public org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest getArchiveIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest)get_store().find_element_user(ARCHIVEINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArchiveIncidentRequest" element
     */
    public void setArchiveIncidentRequest(org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest archiveIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest)get_store().find_element_user(ARCHIVEINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest)get_store().add_element_user(ARCHIVEINCIDENTREQUEST$0);
            }
            target.set(archiveIncidentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ArchiveIncidentRequest" element
     */
    public org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest addNewArchiveIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest)get_store().add_element_user(ARCHIVEINCIDENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ArchiveIncidentRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class ArchiveIncidentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.ArchiveIncidentRequestDocument.ArchiveIncidentRequest
    {
        private static final long serialVersionUID = 1L;
        
        public ArchiveIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
