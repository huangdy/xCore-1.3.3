/*
 * An XML document type.
 * Localname: SetApprovedIAPRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.SetApprovedIAPRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one SetApprovedIAPRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class SetApprovedIAPRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.SetApprovedIAPRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetApprovedIAPRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETAPPROVEDIAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "SetApprovedIAPRequest");
    
    
    /**
     * Gets the "SetApprovedIAPRequest" element
     */
    public org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest getSetApprovedIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest target = null;
            target = (org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest)get_store().find_element_user(SETAPPROVEDIAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SetApprovedIAPRequest" element
     */
    public void setSetApprovedIAPRequest(org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest setApprovedIAPRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest target = null;
            target = (org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest)get_store().find_element_user(SETAPPROVEDIAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest)get_store().add_element_user(SETAPPROVEDIAPREQUEST$0);
            }
            target.set(setApprovedIAPRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SetApprovedIAPRequest" element
     */
    public org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest addNewSetApprovedIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest target = null;
            target = (org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest)get_store().add_element_user(SETAPPROVEDIAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML SetApprovedIAPRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class SetApprovedIAPRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.SetApprovedIAPRequestDocument.SetApprovedIAPRequest
    {
        private static final long serialVersionUID = 1L;
        
        public SetApprovedIAPRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "incidentId");
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$2 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "incidentId" element
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
         * Gets (as xml) the "incidentId" element
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
         * True if has "incidentId" element
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
         * Sets the "incidentId" element
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
         * Sets (as xml) the "incidentId" element
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
         * Unsets the "incidentId" element
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
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$2, 0);
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
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$2, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$2);
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
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$2);
                return target;
            }
        }
    }
}
