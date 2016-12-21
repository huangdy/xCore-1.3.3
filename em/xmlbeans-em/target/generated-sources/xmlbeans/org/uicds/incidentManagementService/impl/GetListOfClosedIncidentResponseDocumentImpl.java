/*
 * An XML document type.
 * Localname: GetListOfClosedIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one GetListOfClosedIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class GetListOfClosedIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfClosedIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFCLOSEDINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "GetListOfClosedIncidentResponse");
    
    
    /**
     * Gets the "GetListOfClosedIncidentResponse" element
     */
    public org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse getGetListOfClosedIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse)get_store().find_element_user(GETLISTOFCLOSEDINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListOfClosedIncidentResponse" element
     */
    public void setGetListOfClosedIncidentResponse(org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse getListOfClosedIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse)get_store().find_element_user(GETLISTOFCLOSEDINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse)get_store().add_element_user(GETLISTOFCLOSEDINCIDENTRESPONSE$0);
            }
            target.set(getListOfClosedIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetListOfClosedIncidentResponse" element
     */
    public org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse addNewGetListOfClosedIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse)get_store().add_element_user(GETLISTOFCLOSEDINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListOfClosedIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class GetListOfClosedIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListOfClosedIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Identifier");
        
        
        /**
         * Gets array of all "Identifier" elements
         */
        public com.saic.precis.x2009.x06.base.IdentifierType[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$0, targetList);
                com.saic.precis.x2009.x06.base.IdentifierType[] result = new com.saic.precis.x2009.x06.base.IdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "Identifier" element
         */
        public void setIdentifierArray(com.saic.precis.x2009.x06.base.IdentifierType[] identifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identifierArray, IDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, com.saic.precis.x2009.x06.base.IdentifierType identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(identifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().insert_element_user(IDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$0, i);
            }
        }
    }
}
