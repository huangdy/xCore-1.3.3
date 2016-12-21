/*
 * An XML document type.
 * Localname: SubmitMapRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.SubmitMapRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one SubmitMapRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class SubmitMapRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitMapRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitMapRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITMAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "SubmitMapRequest");
    
    
    /**
     * Gets the "SubmitMapRequest" element
     */
    public org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest getSubmitMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest target = null;
            target = (org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest)get_store().find_element_user(SUBMITMAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitMapRequest" element
     */
    public void setSubmitMapRequest(org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest submitMapRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest target = null;
            target = (org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest)get_store().find_element_user(SUBMITMAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest)get_store().add_element_user(SUBMITMAPREQUEST$0);
            }
            target.set(submitMapRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitMapRequest" element
     */
    public org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest addNewSubmitMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest target = null;
            target = (org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest)get_store().add_element_user(SUBMITMAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML SubmitMapRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class SubmitMapRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitMapRequestDocument.SubmitMapRequest
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitMapRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/MapService", "IncidentId");
        private static final javax.xml.namespace.QName VIEWCONTEXT$2 = 
            new javax.xml.namespace.QName("http://www.opengis.net/context", "ViewContext");
        
        
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
         * Gets the "ViewContext" element
         */
        public net.opengis.context.ViewContextType getViewContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.ViewContextType target = null;
                target = (net.opengis.context.ViewContextType)get_store().find_element_user(VIEWCONTEXT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ViewContext" element
         */
        public void setViewContext(net.opengis.context.ViewContextType viewContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.ViewContextType target = null;
                target = (net.opengis.context.ViewContextType)get_store().find_element_user(VIEWCONTEXT$2, 0);
                if (target == null)
                {
                    target = (net.opengis.context.ViewContextType)get_store().add_element_user(VIEWCONTEXT$2);
                }
                target.set(viewContext);
            }
        }
        
        /**
         * Appends and returns a new empty "ViewContext" element
         */
        public net.opengis.context.ViewContextType addNewViewContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.context.ViewContextType target = null;
                target = (net.opengis.context.ViewContextType)get_store().add_element_user(VIEWCONTEXT$2);
                return target;
            }
        }
    }
}
