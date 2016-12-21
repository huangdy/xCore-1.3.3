/*
 * An XML document type.
 * Localname: UpdateCommandStructureRequest
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService.impl;
/**
 * A document containing one UpdateCommandStructureRequest(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public class UpdateCommandStructureRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateCommandStructureRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECOMMANDSTRUCTUREREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "UpdateCommandStructureRequest");
    
    
    /**
     * Gets the "UpdateCommandStructureRequest" element
     */
    public org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest getUpdateCommandStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest)get_store().find_element_user(UPDATECOMMANDSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateCommandStructureRequest" element
     */
    public void setUpdateCommandStructureRequest(org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest updateCommandStructureRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest)get_store().find_element_user(UPDATECOMMANDSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest)get_store().add_element_user(UPDATECOMMANDSTRUCTUREREQUEST$0);
            }
            target.set(updateCommandStructureRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateCommandStructureRequest" element
     */
    public org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest addNewUpdateCommandStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest)get_store().add_element_user(UPDATECOMMANDSTRUCTUREREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateCommandStructureRequest(@http://uicds.org/IncidentCommandStructureService).
     *
     * This is a complex type.
     */
    public static class UpdateCommandStructureRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument.UpdateCommandStructureRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateCommandStructureRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        private static final javax.xml.namespace.QName ORGANIZATIONELEMENT$2 = 
            new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizationElement");
        private static final javax.xml.namespace.QName INCIDENTID$4 = 
            new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "IncidentID");
        
        
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
         * Gets the "OrganizationElement" element
         */
        public org.uicds.organizationElement.OrganizationElementType getOrganizationElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.organizationElement.OrganizationElementType target = null;
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(ORGANIZATIONELEMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OrganizationElement" element
         */
        public void setOrganizationElement(org.uicds.organizationElement.OrganizationElementType organizationElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.organizationElement.OrganizationElementType target = null;
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(ORGANIZATIONELEMENT$2, 0);
                if (target == null)
                {
                    target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(ORGANIZATIONELEMENT$2);
                }
                target.set(organizationElement);
            }
        }
        
        /**
         * Appends and returns a new empty "OrganizationElement" element
         */
        public org.uicds.organizationElement.OrganizationElementType addNewOrganizationElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.organizationElement.OrganizationElementType target = null;
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(ORGANIZATIONELEMENT$2);
                return target;
            }
        }
        
        /**
         * Gets the "IncidentID" element
         */
        public java.lang.String getIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncidentID" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "IncidentID" element
         */
        public boolean isSetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTID$4) != 0;
            }
        }
        
        /**
         * Sets the "IncidentID" element
         */
        public void setIncidentID(java.lang.String incidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$4);
                }
                target.setStringValue(incidentID);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentID" element
         */
        public void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$4);
                }
                target.set(incidentID);
            }
        }
        
        /**
         * Unsets the "IncidentID" element
         */
        public void unsetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTID$4, 0);
            }
        }
    }
}
