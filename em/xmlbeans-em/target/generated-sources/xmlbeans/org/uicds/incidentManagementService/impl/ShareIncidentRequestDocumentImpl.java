/*
 * An XML document type.
 * Localname: ShareIncidentRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.ShareIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one ShareIncidentRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class ShareIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.ShareIncidentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShareIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "ShareIncidentRequest");
    
    
    /**
     * Gets the "ShareIncidentRequest" element
     */
    public org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest getShareIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest)get_store().find_element_user(SHAREINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ShareIncidentRequest" element
     */
    public void setShareIncidentRequest(org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest shareIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest)get_store().find_element_user(SHAREINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest)get_store().add_element_user(SHAREINCIDENTREQUEST$0);
            }
            target.set(shareIncidentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ShareIncidentRequest" element
     */
    public org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest addNewShareIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest)get_store().add_element_user(SHAREINCIDENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ShareIncidentRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class ShareIncidentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest
    {
        private static final long serialVersionUID = 1L;
        
        public ShareIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "IncidentID");
        private static final javax.xml.namespace.QName CORENAME$2 = 
            new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CoreName");
        
        
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
        
        /**
         * Gets the "CoreName" element
         */
        public java.lang.String getCoreName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CoreName" element
         */
        public org.apache.xmlbeans.XmlString xgetCoreName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CoreName" element
         */
        public void setCoreName(java.lang.String coreName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORENAME$2);
                }
                target.setStringValue(coreName);
            }
        }
        
        /**
         * Sets (as xml) the "CoreName" element
         */
        public void xsetCoreName(org.apache.xmlbeans.XmlString coreName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORENAME$2);
                }
                target.set(coreName);
            }
        }
    }
}
