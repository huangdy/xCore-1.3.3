/*
 * An XML document type.
 * Localname: ShareIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.ShareIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one ShareIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class ShareIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.ShareIncidentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShareIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "ShareIncidentResponse");
    
    
    /**
     * Gets the "ShareIncidentResponse" element
     */
    public org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse getShareIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse)get_store().find_element_user(SHAREINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ShareIncidentResponse" element
     */
    public void setShareIncidentResponse(org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse shareIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse)get_store().find_element_user(SHAREINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse)get_store().add_element_user(SHAREINCIDENTRESPONSE$0);
            }
            target.set(shareIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ShareIncidentResponse" element
     */
    public org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse addNewShareIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse)get_store().add_element_user(SHAREINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ShareIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class ShareIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.ShareIncidentResponseDocument.ShareIncidentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ShareIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTSHARESUCESSFUL$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "IncidentShareSucessful");
        private static final javax.xml.namespace.QName ERRORSTRING$2 = 
            new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "ErrorString");
        
        
        /**
         * Gets the "IncidentShareSucessful" element
         */
        public boolean getIncidentShareSucessful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncidentShareSucessful" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetIncidentShareSucessful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCIDENTSHARESUCESSFUL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IncidentShareSucessful" element
         */
        public void setIncidentShareSucessful(boolean incidentShareSucessful)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTSHARESUCESSFUL$0);
                }
                target.setBooleanValue(incidentShareSucessful);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentShareSucessful" element
         */
        public void xsetIncidentShareSucessful(org.apache.xmlbeans.XmlBoolean incidentShareSucessful)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCIDENTSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCIDENTSHARESUCESSFUL$0);
                }
                target.set(incidentShareSucessful);
            }
        }
        
        /**
         * Gets the "ErrorString" element
         */
        public java.lang.String getErrorString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORSTRING$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ErrorString" element
         */
        public org.apache.xmlbeans.XmlString xgetErrorString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORSTRING$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ErrorString" element
         */
        public void setErrorString(java.lang.String errorString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORSTRING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORSTRING$2);
                }
                target.setStringValue(errorString);
            }
        }
        
        /**
         * Sets (as xml) the "ErrorString" element
         */
        public void xsetErrorString(org.apache.xmlbeans.XmlString errorString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORSTRING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORSTRING$2);
                }
                target.set(errorString);
            }
        }
    }
}
