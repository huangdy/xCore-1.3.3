/*
 * An XML document type.
 * Localname: EdxlDeRequest
 * Namespace: http://uicds.org/HAVEService
 * Java type: org.uicds.haveService.EdxlDeRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.haveService.impl;
/**
 * A document containing one EdxlDeRequest(@http://uicds.org/HAVEService) element.
 *
 * This is a complex type.
 */
public class EdxlDeRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.haveService.EdxlDeRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public EdxlDeRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDXLDEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/HAVEService", "EdxlDeRequest");
    
    
    /**
     * Gets the "EdxlDeRequest" element
     */
    public org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest getEdxlDeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest target = null;
            target = (org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest)get_store().find_element_user(EDXLDEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EdxlDeRequest" element
     */
    public void setEdxlDeRequest(org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest edxlDeRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest target = null;
            target = (org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest)get_store().find_element_user(EDXLDEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest)get_store().add_element_user(EDXLDEREQUEST$0);
            }
            target.set(edxlDeRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "EdxlDeRequest" element
     */
    public org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest addNewEdxlDeRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest target = null;
            target = (org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest)get_store().add_element_user(EDXLDEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML EdxlDeRequest(@http://uicds.org/HAVEService).
     *
     * This is a complex type.
     */
    public static class EdxlDeRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.haveService.EdxlDeRequestDocument.EdxlDeRequest
    {
        private static final long serialVersionUID = 1L;
        
        public EdxlDeRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EDXLDISTRIBUTION$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "EDXLDistribution");
        
        
        /**
         * Gets the "EDXLDistribution" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "EDXLDistribution" element
         */
        public void setEDXLDistribution(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().add_element_user(EDXLDISTRIBUTION$0);
                }
                target.set(edxlDistribution);
            }
        }
        
        /**
         * Appends and returns a new empty "EDXLDistribution" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution addNewEDXLDistribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().add_element_user(EDXLDISTRIBUTION$0);
                return target;
            }
        }
    }
}
