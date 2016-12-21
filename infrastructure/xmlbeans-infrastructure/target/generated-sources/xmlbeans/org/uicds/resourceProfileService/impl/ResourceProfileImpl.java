/*
 * XML Type:  ResourceProfile
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.ResourceProfile
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * An XML ResourceProfile(@http://uicds.org/ResourceProfileService).
 *
 * This is a complex type.
 */
public class ResourceProfileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.ResourceProfile
{
    private static final long serialVersionUID = 1L;
    
    public ResourceProfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "ID");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "Description");
    private static final javax.xml.namespace.QName RESOURCETYPING$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "ResourceTyping");
    private static final javax.xml.namespace.QName INTERESTS$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "Interests");
    
    
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
     * Gets the "ResourceTyping" element
     */
    public org.uicds.resourceProfileService.ResourceProfile.ResourceTyping getResourceTyping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile.ResourceTyping target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile.ResourceTyping)get_store().find_element_user(RESOURCETYPING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceTyping" element
     */
    public boolean isSetResourceTyping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCETYPING$4) != 0;
        }
    }
    
    /**
     * Sets the "ResourceTyping" element
     */
    public void setResourceTyping(org.uicds.resourceProfileService.ResourceProfile.ResourceTyping resourceTyping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile.ResourceTyping target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile.ResourceTyping)get_store().find_element_user(RESOURCETYPING$4, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.ResourceProfile.ResourceTyping)get_store().add_element_user(RESOURCETYPING$4);
            }
            target.set(resourceTyping);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceTyping" element
     */
    public org.uicds.resourceProfileService.ResourceProfile.ResourceTyping addNewResourceTyping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile.ResourceTyping target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile.ResourceTyping)get_store().add_element_user(RESOURCETYPING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceTyping" element
     */
    public void unsetResourceTyping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCETYPING$4, 0);
        }
    }
    
    /**
     * Gets the "Interests" element
     */
    public org.uicds.resourceProfileService.ResourceProfile.Interests getInterests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile.Interests target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile.Interests)get_store().find_element_user(INTERESTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Interests" element
     */
    public boolean isSetInterests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERESTS$6) != 0;
        }
    }
    
    /**
     * Sets the "Interests" element
     */
    public void setInterests(org.uicds.resourceProfileService.ResourceProfile.Interests interests)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile.Interests target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile.Interests)get_store().find_element_user(INTERESTS$6, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.ResourceProfile.Interests)get_store().add_element_user(INTERESTS$6);
            }
            target.set(interests);
        }
    }
    
    /**
     * Appends and returns a new empty "Interests" element
     */
    public org.uicds.resourceProfileService.ResourceProfile.Interests addNewInterests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile.Interests target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile.Interests)get_store().add_element_user(INTERESTS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Interests" element
     */
    public void unsetInterests()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERESTS$6, 0);
        }
    }
    /**
     * An XML ResourceTyping(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class ResourceTypingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.ResourceProfile.ResourceTyping
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceTypingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "Type");
        
        
        /**
         * Gets array of all "Type" elements
         */
        public com.saic.precis.x2009.x06.base.CodespaceValueType[] getTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TYPE$0, targetList);
                com.saic.precis.x2009.x06.base.CodespaceValueType[] result = new com.saic.precis.x2009.x06.base.CodespaceValueType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Type" element
         */
        public com.saic.precis.x2009.x06.base.CodespaceValueType getTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Type" element
         */
        public int sizeOfTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$0);
            }
        }
        
        /**
         * Sets array of all "Type" element
         */
        public void setTypeArray(com.saic.precis.x2009.x06.base.CodespaceValueType[] typeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typeArray, TYPE$0);
            }
        }
        
        /**
         * Sets ith "Type" element
         */
        public void setTypeArray(int i, com.saic.precis.x2009.x06.base.CodespaceValueType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(type);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Type" element
         */
        public com.saic.precis.x2009.x06.base.CodespaceValueType insertNewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().insert_element_user(TYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Type" element
         */
        public com.saic.precis.x2009.x06.base.CodespaceValueType addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Type" element
         */
        public void removeType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$0, i);
            }
        }
    }
    /**
     * An XML Interests(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class InterestsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.ResourceProfile.Interests
    {
        private static final long serialVersionUID = 1L;
        
        public InterestsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTEREST$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "Interest");
        
        
        /**
         * Gets array of all "Interest" elements
         */
        public org.uicds.resourceProfileService.Interest[] getInterestArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INTEREST$0, targetList);
                org.uicds.resourceProfileService.Interest[] result = new org.uicds.resourceProfileService.Interest[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Interest" element
         */
        public org.uicds.resourceProfileService.Interest getInterestArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.Interest target = null;
                target = (org.uicds.resourceProfileService.Interest)get_store().find_element_user(INTEREST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Interest" element
         */
        public int sizeOfInterestArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTEREST$0);
            }
        }
        
        /**
         * Sets array of all "Interest" element
         */
        public void setInterestArray(org.uicds.resourceProfileService.Interest[] interestArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(interestArray, INTEREST$0);
            }
        }
        
        /**
         * Sets ith "Interest" element
         */
        public void setInterestArray(int i, org.uicds.resourceProfileService.Interest interest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.Interest target = null;
                target = (org.uicds.resourceProfileService.Interest)get_store().find_element_user(INTEREST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(interest);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Interest" element
         */
        public org.uicds.resourceProfileService.Interest insertNewInterest(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.Interest target = null;
                target = (org.uicds.resourceProfileService.Interest)get_store().insert_element_user(INTEREST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Interest" element
         */
        public org.uicds.resourceProfileService.Interest addNewInterest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.Interest target = null;
                target = (org.uicds.resourceProfileService.Interest)get_store().add_element_user(INTEREST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Interest" element
         */
        public void removeInterest(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTEREST$0, i);
            }
        }
    }
}
