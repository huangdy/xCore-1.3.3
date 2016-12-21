/*
 * An XML document type.
 * Localname: GetAlertByAlertIdRequest
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.GetAlertByAlertIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one GetAlertByAlertIdRequest(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class GetAlertByAlertIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetAlertByAlertIdRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAlertByAlertIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALERTBYALERTIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "GetAlertByAlertIdRequest");
    
    
    /**
     * Gets the "GetAlertByAlertIdRequest" element
     */
    public org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest getGetAlertByAlertIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest target = null;
            target = (org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest)get_store().find_element_user(GETALERTBYALERTIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAlertByAlertIdRequest" element
     */
    public void setGetAlertByAlertIdRequest(org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest getAlertByAlertIdRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest target = null;
            target = (org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest)get_store().find_element_user(GETALERTBYALERTIDREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest)get_store().add_element_user(GETALERTBYALERTIDREQUEST$0);
            }
            target.set(getAlertByAlertIdRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAlertByAlertIdRequest" element
     */
    public org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest addNewGetAlertByAlertIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest target = null;
            target = (org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest)get_store().add_element_user(GETALERTBYALERTIDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetAlertByAlertIdRequest(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class GetAlertByAlertIdRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetAlertByAlertIdRequestDocument.GetAlertByAlertIdRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetAlertByAlertIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALERTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/AlertService", "AlertID");
        
        
        /**
         * Gets the "AlertID" element
         */
        public java.lang.String getAlertID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALERTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AlertID" element
         */
        public org.apache.xmlbeans.XmlString xgetAlertID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALERTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AlertID" element
         */
        public void setAlertID(java.lang.String alertID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALERTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALERTID$0);
                }
                target.setStringValue(alertID);
            }
        }
        
        /**
         * Sets (as xml) the "AlertID" element
         */
        public void xsetAlertID(org.apache.xmlbeans.XmlString alertID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALERTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALERTID$0);
                }
                target.set(alertID);
            }
        }
    }
}
