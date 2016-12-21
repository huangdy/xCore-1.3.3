/*
 * An XML document type.
 * Localname: AssociateWorkProductToInterestGroupRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one AssociateWorkProductToInterestGroupRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class AssociateWorkProductToInterestGroupRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociateWorkProductToInterestGroupRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATEWORKPRODUCTTOINTERESTGROUPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "AssociateWorkProductToInterestGroupRequest");
    
    
    /**
     * Gets the "AssociateWorkProductToInterestGroupRequest" element
     */
    public org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest getAssociateWorkProductToInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest target = null;
            target = (org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest)get_store().find_element_user(ASSOCIATEWORKPRODUCTTOINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AssociateWorkProductToInterestGroupRequest" element
     */
    public void setAssociateWorkProductToInterestGroupRequest(org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest associateWorkProductToInterestGroupRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest target = null;
            target = (org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest)get_store().find_element_user(ASSOCIATEWORKPRODUCTTOINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest)get_store().add_element_user(ASSOCIATEWORKPRODUCTTOINTERESTGROUPREQUEST$0);
            }
            target.set(associateWorkProductToInterestGroupRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "AssociateWorkProductToInterestGroupRequest" element
     */
    public org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest addNewAssociateWorkProductToInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest target = null;
            target = (org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest)get_store().add_element_user(ASSOCIATEWORKPRODUCTTOINTERESTGROUPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML AssociateWorkProductToInterestGroupRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class AssociateWorkProductToInterestGroupRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.AssociateWorkProductToInterestGroupRequestDocument.AssociateWorkProductToInterestGroupRequest
    {
        private static final long serialVersionUID = 1L;
        
        public AssociateWorkProductToInterestGroupRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductID");
        private static final javax.xml.namespace.QName INCIDENTID$2 = 
            new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "IncidentID");
        
        
        /**
         * Gets the "WorkProductID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getWorkProductID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(WORKPRODUCTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductID" element
         */
        public void setWorkProductID(com.saic.precis.x2009.x06.base.IdentifierType workProductID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(WORKPRODUCTID$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(WORKPRODUCTID$0);
                }
                target.set(workProductID);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewWorkProductID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(WORKPRODUCTID$0);
                return target;
            }
        }
        
        /**
         * Gets the "IncidentID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(INCIDENTID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "IncidentID" element
         */
        public void setIncidentID(com.saic.precis.x2009.x06.base.IdentifierType incidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(INCIDENTID$2, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(INCIDENTID$2);
                }
                target.set(incidentID);
            }
        }
        
        /**
         * Appends and returns a new empty "IncidentID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(INCIDENTID$2);
                return target;
            }
        }
    }
}
