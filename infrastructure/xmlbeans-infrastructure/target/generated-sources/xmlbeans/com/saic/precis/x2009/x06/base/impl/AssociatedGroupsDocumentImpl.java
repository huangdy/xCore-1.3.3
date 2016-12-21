/*
 * An XML document type.
 * Localname: AssociatedGroups
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.AssociatedGroupsDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one AssociatedGroups(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class AssociatedGroupsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.AssociatedGroupsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociatedGroupsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATEDGROUPS$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "AssociatedGroups");
    
    
    /**
     * Gets the "AssociatedGroups" element
     */
    public com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups getAssociatedGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups target = null;
            target = (com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups)get_store().find_element_user(ASSOCIATEDGROUPS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AssociatedGroups" element
     */
    public void setAssociatedGroups(com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups associatedGroups)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups target = null;
            target = (com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups)get_store().find_element_user(ASSOCIATEDGROUPS$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups)get_store().add_element_user(ASSOCIATEDGROUPS$0);
            }
            target.set(associatedGroups);
        }
    }
    
    /**
     * Appends and returns a new empty "AssociatedGroups" element
     */
    public com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups addNewAssociatedGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups target = null;
            target = (com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups)get_store().add_element_user(ASSOCIATEDGROUPS$0);
            return target;
        }
    }
    /**
     * An XML AssociatedGroups(@http://www.saic.com/precis/2009/06/base).
     *
     * This is a complex type.
     */
    public static class AssociatedGroupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups
    {
        private static final long serialVersionUID = 1L;
        
        public AssociatedGroupsImpl(org.apache.xmlbeans.SchemaType sType)
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
