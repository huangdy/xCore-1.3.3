/*
 * An XML document type.
 * Localname: SubmitShapefileRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.SubmitShapefileRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one SubmitShapefileRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class SubmitShapefileRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitShapefileRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitShapefileRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSHAPEFILEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "SubmitShapefileRequest");
    
    
    /**
     * Gets the "SubmitShapefileRequest" element
     */
    public org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest getSubmitShapefileRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest target = null;
            target = (org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest)get_store().find_element_user(SUBMITSHAPEFILEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitShapefileRequest" element
     */
    public void setSubmitShapefileRequest(org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest submitShapefileRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest target = null;
            target = (org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest)get_store().find_element_user(SUBMITSHAPEFILEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest)get_store().add_element_user(SUBMITSHAPEFILEREQUEST$0);
            }
            target.set(submitShapefileRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitShapefileRequest" element
     */
    public org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest addNewSubmitShapefileRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest target = null;
            target = (org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest)get_store().add_element_user(SUBMITSHAPEFILEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML SubmitShapefileRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class SubmitShapefileRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitShapefileRequestDocument.SubmitShapefileRequest
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitShapefileRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/MapService", "IncidentId");
        private static final javax.xml.namespace.QName DIGEST$2 = 
            new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Digest");
        private static final javax.xml.namespace.QName CONTENTDATA$4 = 
            new javax.xml.namespace.QName("http://uicds.org/MapService", "ContentData");
        
        
        /**
         * Gets the "IncidentId" element
         */
        public java.lang.String getIncidentId()
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
         * Gets (as xml) the "IncidentId" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentId()
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
         * True if has "IncidentId" element
         */
        public boolean isSetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTID$0) != 0;
            }
        }
        
        /**
         * Sets the "IncidentId" element
         */
        public void setIncidentId(java.lang.String incidentId)
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
                target.setStringValue(incidentId);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentId" element
         */
        public void xsetIncidentId(org.apache.xmlbeans.XmlString incidentId)
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
                target.set(incidentId);
            }
        }
        
        /**
         * Unsets the "IncidentId" element
         */
        public void unsetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTID$0, 0);
            }
        }
        
        /**
         * Gets the "Digest" element
         */
        public gov.ucore.ucore.x20.DigestType getDigest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.ucore.ucore.x20.DigestType target = null;
                target = (gov.ucore.ucore.x20.DigestType)get_store().find_element_user(DIGEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Digest" element
         */
        public void setDigest(gov.ucore.ucore.x20.DigestType digest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.ucore.ucore.x20.DigestType target = null;
                target = (gov.ucore.ucore.x20.DigestType)get_store().find_element_user(DIGEST$2, 0);
                if (target == null)
                {
                    target = (gov.ucore.ucore.x20.DigestType)get_store().add_element_user(DIGEST$2);
                }
                target.set(digest);
            }
        }
        
        /**
         * Appends and returns a new empty "Digest" element
         */
        public gov.ucore.ucore.x20.DigestType addNewDigest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.ucore.ucore.x20.DigestType target = null;
                target = (gov.ucore.ucore.x20.DigestType)get_store().add_element_user(DIGEST$2);
                return target;
            }
        }
        
        /**
         * Gets the "ContentData" element
         */
        public byte[] getContentData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTDATA$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getByteArrayValue();
            }
        }
        
        /**
         * Gets (as xml) the "ContentData" element
         */
        public org.apache.xmlbeans.XmlBase64Binary xgetContentData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(CONTENTDATA$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ContentData" element
         */
        public void setContentData(byte[] contentData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTDATA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTDATA$4);
                }
                target.setByteArrayValue(contentData);
            }
        }
        
        /**
         * Sets (as xml) the "ContentData" element
         */
        public void xsetContentData(org.apache.xmlbeans.XmlBase64Binary contentData)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBase64Binary target = null;
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(CONTENTDATA$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(CONTENTDATA$4);
                }
                target.set(contentData);
            }
        }
    }
}
