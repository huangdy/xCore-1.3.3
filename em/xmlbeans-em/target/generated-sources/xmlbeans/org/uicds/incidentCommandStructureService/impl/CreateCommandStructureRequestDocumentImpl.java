/*
 * An XML document type.
 * Localname: CreateCommandStructureRequest
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService.impl;
/**
 * A document containing one CreateCommandStructureRequest(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public class CreateCommandStructureRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateCommandStructureRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECOMMANDSTRUCTUREREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "CreateCommandStructureRequest");
    
    
    /**
     * Gets the "CreateCommandStructureRequest" element
     */
    public org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest getCreateCommandStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest)get_store().find_element_user(CREATECOMMANDSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateCommandStructureRequest" element
     */
    public void setCreateCommandStructureRequest(org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest createCommandStructureRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest)get_store().find_element_user(CREATECOMMANDSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest)get_store().add_element_user(CREATECOMMANDSTRUCTUREREQUEST$0);
            }
            target.set(createCommandStructureRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateCommandStructureRequest" element
     */
    public org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest addNewCreateCommandStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest target = null;
            target = (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest)get_store().add_element_user(CREATECOMMANDSTRUCTUREREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateCommandStructureRequest(@http://uicds.org/IncidentCommandStructureService).
     *
     * This is a complex type.
     */
    public static class CreateCommandStructureRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateCommandStructureRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANIZATIONELEMENT$0 = 
            new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizationElement");
        private static final javax.xml.namespace.QName INCIDENTID$2 = 
            new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "IncidentID");
        
        
        /**
         * Gets the "OrganizationElement" element
         */
        public org.uicds.organizationElement.OrganizationElementType getOrganizationElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.organizationElement.OrganizationElementType target = null;
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(ORGANIZATIONELEMENT$0, 0);
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
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(ORGANIZATIONELEMENT$0, 0);
                if (target == null)
                {
                    target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(ORGANIZATIONELEMENT$0);
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
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(ORGANIZATIONELEMENT$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$2, 0);
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
                return get_store().count_elements(INCIDENTID$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$2);
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
                get_store().remove_element(INCIDENTID$2, 0);
            }
        }
    }
}
