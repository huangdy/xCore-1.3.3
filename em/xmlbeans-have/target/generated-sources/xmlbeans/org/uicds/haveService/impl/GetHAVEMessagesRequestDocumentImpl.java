/*
 * An XML document type.
 * Localname: GetHAVEMessagesRequest
 * Namespace: http://uicds.org/HAVEService
 * Java type: org.uicds.haveService.GetHAVEMessagesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.haveService.impl;
/**
 * A document containing one GetHAVEMessagesRequest(@http://uicds.org/HAVEService) element.
 *
 * This is a complex type.
 */
public class GetHAVEMessagesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.haveService.GetHAVEMessagesRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetHAVEMessagesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHAVEMESSAGESREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/HAVEService", "GetHAVEMessagesRequest");
    
    
    /**
     * Gets the "GetHAVEMessagesRequest" element
     */
    public org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest getGetHAVEMessagesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest target = null;
            target = (org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest)get_store().find_element_user(GETHAVEMESSAGESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetHAVEMessagesRequest" element
     */
    public void setGetHAVEMessagesRequest(org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest getHAVEMessagesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest target = null;
            target = (org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest)get_store().find_element_user(GETHAVEMESSAGESREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest)get_store().add_element_user(GETHAVEMESSAGESREQUEST$0);
            }
            target.set(getHAVEMessagesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetHAVEMessagesRequest" element
     */
    public org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest addNewGetHAVEMessagesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest target = null;
            target = (org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest)get_store().add_element_user(GETHAVEMESSAGESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetHAVEMessagesRequest(@http://uicds.org/HAVEService).
     *
     * This is a complex type.
     */
    public static class GetHAVEMessagesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.haveService.GetHAVEMessagesRequestDocument.GetHAVEMessagesRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetHAVEMessagesRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/HAVEService", "incidentID");
        
        
        /**
         * Gets the "incidentID" element
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
         * Gets (as xml) the "incidentID" element
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
         * True if has "incidentID" element
         */
        public boolean isSetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTID$0) != 0;
            }
        }
        
        /**
         * Sets the "incidentID" element
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
         * Sets (as xml) the "incidentID" element
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
         * Unsets the "incidentID" element
         */
        public void unsetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTID$0, 0);
            }
        }
    }
}
