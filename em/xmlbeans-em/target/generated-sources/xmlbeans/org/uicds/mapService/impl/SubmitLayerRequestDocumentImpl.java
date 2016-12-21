/*
 * An XML document type.
 * Localname: SubmitLayerRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.SubmitLayerRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one SubmitLayerRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class SubmitLayerRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitLayerRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitLayerRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITLAYERREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "SubmitLayerRequest");
    
    
    /**
     * Gets the "SubmitLayerRequest" element
     */
    public org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest getSubmitLayerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest target = null;
            target = (org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest)get_store().find_element_user(SUBMITLAYERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitLayerRequest" element
     */
    public void setSubmitLayerRequest(org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest submitLayerRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest target = null;
            target = (org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest)get_store().find_element_user(SUBMITLAYERREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest)get_store().add_element_user(SUBMITLAYERREQUEST$0);
            }
            target.set(submitLayerRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitLayerRequest" element
     */
    public org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest addNewSubmitLayerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest target = null;
            target = (org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest)get_store().add_element_user(SUBMITLAYERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML SubmitLayerRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class SubmitLayerRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitLayerRequestDocument.SubmitLayerRequest
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitLayerRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/MapService", "IncidentId");
        private static final javax.xml.namespace.QName LAYER$2 = 
            new javax.xml.namespace.QName("http://uicds.org/MapService", "Layer");
        
        
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
         * Gets the "Layer" element
         */
        public net.opengis.context.LayerType getLayer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.LayerType target = null;
                target = (net.opengis.context.LayerType)get_store().find_element_user(LAYER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Layer" element
         */
        public void setLayer(net.opengis.context.LayerType layer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.LayerType target = null;
                target = (net.opengis.context.LayerType)get_store().find_element_user(LAYER$2, 0);
                if (target == null)
                {
                    target = (net.opengis.context.LayerType)get_store().add_element_user(LAYER$2);
                }
                target.set(layer);
            }
        }
        
        /**
         * Appends and returns a new empty "Layer" element
         */
        public net.opengis.context.LayerType addNewLayer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.LayerType target = null;
                target = (net.opengis.context.LayerType)get_store().add_element_user(LAYER$2);
                return target;
            }
        }
    }
}
