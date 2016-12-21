/*
 * An XML document type.
 * Localname: DeleteProfileResponse
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.DeleteProfileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one DeleteProfileResponse(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class DeleteProfileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.DeleteProfileResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteProfileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEPROFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "DeleteProfileResponse");
    
    
    /**
     * Gets the "DeleteProfileResponse" element
     */
    public org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse getDeleteProfileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse target = null;
            target = (org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse)get_store().find_element_user(DELETEPROFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteProfileResponse" element
     */
    public void setDeleteProfileResponse(org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse deleteProfileResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse target = null;
            target = (org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse)get_store().find_element_user(DELETEPROFILERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse)get_store().add_element_user(DELETEPROFILERESPONSE$0);
            }
            target.set(deleteProfileResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteProfileResponse" element
     */
    public org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse addNewDeleteProfileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse target = null;
            target = (org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse)get_store().add_element_user(DELETEPROFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteProfileResponse(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class DeleteProfileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.DeleteProfileResponseDocument.DeleteProfileResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteProfileResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "ID");
        
        
        /**
         * Gets the "ID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ID" element
         */
        public void setID(com.saic.precis.x2009.x06.base.IdentifierType id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "ID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ID$0);
                return target;
            }
        }
    }
}
