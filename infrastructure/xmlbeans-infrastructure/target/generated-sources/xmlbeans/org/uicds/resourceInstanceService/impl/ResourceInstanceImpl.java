/*
 * XML Type:  ResourceInstance
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.ResourceInstance
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * An XML ResourceInstance(@http://uicds.org/ResourceInstanceService).
 *
 * This is a complex type.
 */
public class ResourceInstanceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.ResourceInstance
{
    private static final long serialVersionUID = 1L;
    
    public ResourceInstanceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ID");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "Description");
    private static final javax.xml.namespace.QName SOURCEIDENTIFICATION$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "SourceIdentification");
    private static final javax.xml.namespace.QName KEYWORD$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "Keyword");
    private static final javax.xml.namespace.QName ENDPOINTS$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "Endpoints");
    private static final javax.xml.namespace.QName PROFILEIDS$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ProfileIDs");
    
    
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
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "SourceIdentification" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification getSourceIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification)get_store().find_element_user(SOURCEIDENTIFICATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SourceIdentification" element
     */
    public void setSourceIdentification(org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification sourceIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification)get_store().find_element_user(SOURCEIDENTIFICATION$4, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification)get_store().add_element_user(SOURCEIDENTIFICATION$4);
            }
            target.set(sourceIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "SourceIdentification" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification addNewSourceIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification)get_store().add_element_user(SOURCEIDENTIFICATION$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "Keyword" elements
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType[] getKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYWORD$6, targetList);
            com.saic.precis.x2009.x06.base.CodespaceValueType[] result = new com.saic.precis.x2009.x06.base.CodespaceValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Keyword" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType getKeywordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(KEYWORD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Keyword" element
     */
    public int sizeOfKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORD$6);
        }
    }
    
    /**
     * Sets array of all "Keyword" element
     */
    public void setKeywordArray(com.saic.precis.x2009.x06.base.CodespaceValueType[] keywordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$6);
        }
    }
    
    /**
     * Sets ith "Keyword" element
     */
    public void setKeywordArray(int i, com.saic.precis.x2009.x06.base.CodespaceValueType keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(KEYWORD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyword);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType insertNewKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().insert_element_user(KEYWORD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Keyword" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(KEYWORD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Keyword" element
     */
    public void removeKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORD$6, i);
        }
    }
    
    /**
     * Gets the "Endpoints" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance.Endpoints getEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.Endpoints target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.Endpoints)get_store().find_element_user(ENDPOINTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Endpoints" element
     */
    public boolean isSetEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINTS$8) != 0;
        }
    }
    
    /**
     * Sets the "Endpoints" element
     */
    public void setEndpoints(org.uicds.resourceInstanceService.ResourceInstance.Endpoints endpoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.Endpoints target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.Endpoints)get_store().find_element_user(ENDPOINTS$8, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.ResourceInstance.Endpoints)get_store().add_element_user(ENDPOINTS$8);
            }
            target.set(endpoints);
        }
    }
    
    /**
     * Appends and returns a new empty "Endpoints" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance.Endpoints addNewEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.Endpoints target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.Endpoints)get_store().add_element_user(ENDPOINTS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Endpoints" element
     */
    public void unsetEndpoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINTS$8, 0);
        }
    }
    
    /**
     * Gets the "ProfileIDs" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs getProfileIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs)get_store().find_element_user(PROFILEIDS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProfileIDs" element
     */
    public boolean isSetProfileIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFILEIDS$10) != 0;
        }
    }
    
    /**
     * Sets the "ProfileIDs" element
     */
    public void setProfileIDs(org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs profileIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs)get_store().find_element_user(PROFILEIDS$10, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs)get_store().add_element_user(PROFILEIDS$10);
            }
            target.set(profileIDs);
        }
    }
    
    /**
     * Appends and returns a new empty "ProfileIDs" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs addNewProfileIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs)get_store().add_element_user(PROFILEIDS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ProfileIDs" element
     */
    public void unsetProfileIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFILEIDS$10, 0);
        }
    }
    /**
     * An XML SourceIdentification(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class SourceIdentificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification
    {
        private static final long serialVersionUID = 1L;
        
        public SourceIdentificationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALRESOURCEID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "LocalResourceID");
        private static final javax.xml.namespace.QName COREID$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "CoreID");
        
        
        /**
         * Gets the "LocalResourceID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getLocalResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LOCALRESOURCEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "LocalResourceID" element
         */
        public void setLocalResourceID(com.saic.precis.x2009.x06.base.IdentifierType localResourceID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LOCALRESOURCEID$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LOCALRESOURCEID$0);
                }
                target.set(localResourceID);
            }
        }
        
        /**
         * Appends and returns a new empty "LocalResourceID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewLocalResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LOCALRESOURCEID$0);
                return target;
            }
        }
        
        /**
         * Gets the "CoreID" element
         */
        public java.lang.String getCoreID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COREID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CoreID" element
         */
        public org.apache.xmlbeans.XmlString xgetCoreID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COREID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CoreID" element
         */
        public void setCoreID(java.lang.String coreID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COREID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COREID$2);
                }
                target.setStringValue(coreID);
            }
        }
        
        /**
         * Sets (as xml) the "CoreID" element
         */
        public void xsetCoreID(org.apache.xmlbeans.XmlString coreID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COREID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COREID$2);
                }
                target.set(coreID);
            }
        }
    }
    /**
     * An XML Endpoints(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class EndpointsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.ResourceInstance.Endpoints
    {
        private static final long serialVersionUID = 1L;
        
        public EndpointsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENDPOINT$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "Endpoint");
        
        
        /**
         * Gets array of all "Endpoint" elements
         */
        public org.w3.x2005.x08.addressing.EndpointReferenceType[] getEndpointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENDPOINT$0, targetList);
                org.w3.x2005.x08.addressing.EndpointReferenceType[] result = new org.w3.x2005.x08.addressing.EndpointReferenceType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Endpoint" element
         */
        public org.w3.x2005.x08.addressing.EndpointReferenceType getEndpointArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(ENDPOINT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Endpoint" element
         */
        public int sizeOfEndpointArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENDPOINT$0);
            }
        }
        
        /**
         * Sets array of all "Endpoint" element
         */
        public void setEndpointArray(org.w3.x2005.x08.addressing.EndpointReferenceType[] endpointArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(endpointArray, ENDPOINT$0);
            }
        }
        
        /**
         * Sets ith "Endpoint" element
         */
        public void setEndpointArray(int i, org.w3.x2005.x08.addressing.EndpointReferenceType endpoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(ENDPOINT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(endpoint);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Endpoint" element
         */
        public org.w3.x2005.x08.addressing.EndpointReferenceType insertNewEndpoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().insert_element_user(ENDPOINT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Endpoint" element
         */
        public org.w3.x2005.x08.addressing.EndpointReferenceType addNewEndpoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(ENDPOINT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Endpoint" element
         */
        public void removeEndpoint(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENDPOINT$0, i);
            }
        }
    }
    /**
     * An XML ProfileIDs(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class ProfileIDsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs
    {
        private static final long serialVersionUID = 1L;
        
        public ProfileIDsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROFILEID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ProfileID");
        
        
        /**
         * Gets array of all "ProfileID" elements
         */
        public com.saic.precis.x2009.x06.base.IdentifierType[] getProfileIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROFILEID$0, targetList);
                com.saic.precis.x2009.x06.base.IdentifierType[] result = new com.saic.precis.x2009.x06.base.IdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ProfileID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getProfileIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(PROFILEID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ProfileID" element
         */
        public int sizeOfProfileIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROFILEID$0);
            }
        }
        
        /**
         * Sets array of all "ProfileID" element
         */
        public void setProfileIDArray(com.saic.precis.x2009.x06.base.IdentifierType[] profileIDArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(profileIDArray, PROFILEID$0);
            }
        }
        
        /**
         * Sets ith "ProfileID" element
         */
        public void setProfileIDArray(int i, com.saic.precis.x2009.x06.base.IdentifierType profileID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(PROFILEID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(profileID);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ProfileID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType insertNewProfileID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().insert_element_user(PROFILEID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ProfileID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewProfileID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(PROFILEID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ProfileID" element
         */
        public void removeProfileID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROFILEID$0, i);
            }
        }
    }
}
