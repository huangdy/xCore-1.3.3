/*
 * An XML document type.
 * Localname: UpdateSOIRequest
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.UpdateSOIRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService.impl;
/**
 * A document containing one UpdateSOIRequest(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class UpdateSOIRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.UpdateSOIRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateSOIRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATESOIREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "UpdateSOIRequest");
    
    
    /**
     * Gets the "UpdateSOIRequest" element
     */
    public org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest getUpdateSOIRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest target = null;
            target = (org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest)get_store().find_element_user(UPDATESOIREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateSOIRequest" element
     */
    public void setUpdateSOIRequest(org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest updateSOIRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest target = null;
            target = (org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest)get_store().find_element_user(UPDATESOIREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest)get_store().add_element_user(UPDATESOIREQUEST$0);
            }
            target.set(updateSOIRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateSOIRequest" element
     */
    public org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest addNewUpdateSOIRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest target = null;
            target = (org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest)get_store().add_element_user(UPDATESOIREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateSOIRequest(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class UpdateSOIRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateSOIRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        private static final javax.xml.namespace.QName SENSOROBSERVATIONINFO$2 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "SensorObservationInfo");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
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
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
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
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
        
        /**
         * Gets the "SensorObservationInfo" element
         */
        public org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo getSensorObservationInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo target = null;
                target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().find_element_user(SENSOROBSERVATIONINFO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SensorObservationInfo" element
         */
        public void setSensorObservationInfo(org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo sensorObservationInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo target = null;
                target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().find_element_user(SENSOROBSERVATIONINFO$2, 0);
                if (target == null)
                {
                    target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().add_element_user(SENSOROBSERVATIONINFO$2);
                }
                target.set(sensorObservationInfo);
            }
        }
        
        /**
         * Appends and returns a new empty "SensorObservationInfo" element
         */
        public org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo addNewSensorObservationInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo target = null;
                target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().add_element_user(SENSOROBSERVATIONINFO$2);
                return target;
            }
        }
    }
}
