/*
 * An XML document type.
 * Localname: CheckinResponse
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.CheckinResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one CheckinResponse(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class CheckinResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.CheckinResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckinResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKINRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "CheckinResponse");
    
    
    /**
     * Gets the "CheckinResponse" element
     */
    public org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse getCheckinResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse target = null;
            target = (org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse)get_store().find_element_user(CHECKINRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckinResponse" element
     */
    public void setCheckinResponse(org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse checkinResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse target = null;
            target = (org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse)get_store().find_element_user(CHECKINRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse)get_store().add_element_user(CHECKINRESPONSE$0);
            }
            target.set(checkinResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CheckinResponse" element
     */
    public org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse addNewCheckinResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse target = null;
            target = (org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse)get_store().add_element_user(CHECKINRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CheckinResponse(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class CheckinResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.CheckinResponseDocument.CheckinResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CheckinResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCEINSTANCE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ResourceInstance");
        
        
        /**
         * Gets the "ResourceInstance" element
         */
        public org.uicds.resourceInstanceService.ResourceInstance getResourceInstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstance target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().find_element_user(RESOURCEINSTANCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ResourceInstance" element
         */
        public void setResourceInstance(org.uicds.resourceInstanceService.ResourceInstance resourceInstance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstance target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().find_element_user(RESOURCEINSTANCE$0, 0);
                if (target == null)
                {
                    target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().add_element_user(RESOURCEINSTANCE$0);
                }
                target.set(resourceInstance);
            }
        }
        
        /**
         * Appends and returns a new empty "ResourceInstance" element
         */
        public org.uicds.resourceInstanceService.ResourceInstance addNewResourceInstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstance target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().add_element_user(RESOURCEINSTANCE$0);
                return target;
            }
        }
    }
}
