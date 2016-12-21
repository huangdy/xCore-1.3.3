/*
 * An XML document type.
 * Localname: AddInterestRequest
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.AddInterestRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one AddInterestRequest(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class AddInterestRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.AddInterestRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddInterestRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDINTERESTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "AddInterestRequest");
    
    
    /**
     * Gets the "AddInterestRequest" element
     */
    public org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest getAddInterestRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest target = null;
            target = (org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest)get_store().find_element_user(ADDINTERESTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddInterestRequest" element
     */
    public void setAddInterestRequest(org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest addInterestRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest target = null;
            target = (org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest)get_store().find_element_user(ADDINTERESTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest)get_store().add_element_user(ADDINTERESTREQUEST$0);
            }
            target.set(addInterestRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "AddInterestRequest" element
     */
    public org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest addNewAddInterestRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest target = null;
            target = (org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest)get_store().add_element_user(ADDINTERESTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML AddInterestRequest(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class AddInterestRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.AddInterestRequestDocument.AddInterestRequest
    {
        private static final long serialVersionUID = 1L;
        
        public AddInterestRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "ID");
        private static final javax.xml.namespace.QName INTEREST$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "Interest");
        
        
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
        
        /**
         * Gets the "Interest" element
         */
        public org.uicds.resourceProfileService.Interest getInterest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.Interest target = null;
                target = (org.uicds.resourceProfileService.Interest)get_store().find_element_user(INTEREST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Interest" element
         */
        public void setInterest(org.uicds.resourceProfileService.Interest interest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.Interest target = null;
                target = (org.uicds.resourceProfileService.Interest)get_store().find_element_user(INTEREST$2, 0);
                if (target == null)
                {
                    target = (org.uicds.resourceProfileService.Interest)get_store().add_element_user(INTEREST$2);
                }
                target.set(interest);
            }
        }
        
        /**
         * Appends and returns a new empty "Interest" element
         */
        public org.uicds.resourceProfileService.Interest addNewInterest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.Interest target = null;
                target = (org.uicds.resourceProfileService.Interest)get_store().add_element_user(INTEREST$2);
                return target;
            }
        }
    }
}
