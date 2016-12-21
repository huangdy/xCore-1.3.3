/*
 * An XML document type.
 * Localname: UpdateMapRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.UpdateMapRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one UpdateMapRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class UpdateMapRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.UpdateMapRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateMapRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEMAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "UpdateMapRequest");
    
    
    /**
     * Gets the "UpdateMapRequest" element
     */
    public org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest getUpdateMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest target = null;
            target = (org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest)get_store().find_element_user(UPDATEMAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateMapRequest" element
     */
    public void setUpdateMapRequest(org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest updateMapRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest target = null;
            target = (org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest)get_store().find_element_user(UPDATEMAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest)get_store().add_element_user(UPDATEMAPREQUEST$0);
            }
            target.set(updateMapRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateMapRequest" element
     */
    public org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest addNewUpdateMapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest target = null;
            target = (org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest)get_store().add_element_user(UPDATEMAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateMapRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class UpdateMapRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.UpdateMapRequestDocument.UpdateMapRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateMapRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        private static final javax.xml.namespace.QName VIEWCONTEXT$2 = 
            new javax.xml.namespace.QName("http://www.opengis.net/context", "ViewContext");
        
        
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
