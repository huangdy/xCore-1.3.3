/*
 * An XML document type.
 * Localname: IAPDocumentList
 * Namespace: http://uicds.org/UICDSCommon
 * Java type: org.uicds.uicdsCommon.IAPDocumentListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.uicdsCommon.impl;
/**
 * A document containing one IAPDocumentList(@http://uicds.org/UICDSCommon) element.
 *
 * This is a complex type.
 */
public class IAPDocumentListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.uicdsCommon.IAPDocumentListDocument
{
    private static final long serialVersionUID = 1L;
    
    public IAPDocumentListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IAPDOCUMENTLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/UICDSCommon", "IAPDocumentList");
    
    
    /**
     * Gets the "IAPDocumentList" element
     */
    public org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList getIAPDocumentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList target = null;
            target = (org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList)get_store().find_element_user(IAPDOCUMENTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IAPDocumentList" element
     */
    public void setIAPDocumentList(org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList iapDocumentList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList target = null;
            target = (org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList)get_store().find_element_user(IAPDOCUMENTLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList)get_store().add_element_user(IAPDOCUMENTLIST$0);
            }
            target.set(iapDocumentList);
        }
    }
    
    /**
     * Appends and returns a new empty "IAPDocumentList" element
     */
    public org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList addNewIAPDocumentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList target = null;
            target = (org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList)get_store().add_element_user(IAPDOCUMENTLIST$0);
            return target;
        }
    }
    /**
     * An XML IAPDocumentList(@http://uicds.org/UICDSCommon).
     *
     * This is a complex type.
     */
    public static class IAPDocumentListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList
    {
        private static final long serialVersionUID = 1L;
        
        public IAPDocumentListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IAPDOCUMENT$0 = 
            new javax.xml.namespace.QName("http://uicds.org/UICDSCommon", "IAPDocument");
        
        
        /**
         * Gets array of all "IAPDocument" elements
         */
        public org.uicds.uicdsCommon.DocumentType[] getIAPDocumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IAPDOCUMENT$0, targetList);
                org.uicds.uicdsCommon.DocumentType[] result = new org.uicds.uicdsCommon.DocumentType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "IAPDocument" element
         */
        public org.uicds.uicdsCommon.DocumentType getIAPDocumentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.uicdsCommon.DocumentType target = null;
                target = (org.uicds.uicdsCommon.DocumentType)get_store().find_element_user(IAPDOCUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "IAPDocument" element
         */
        public int sizeOfIAPDocumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IAPDOCUMENT$0);
            }
        }
        
        /**
         * Sets array of all "IAPDocument" element
         */
        public void setIAPDocumentArray(org.uicds.uicdsCommon.DocumentType[] iapDocumentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(iapDocumentArray, IAPDOCUMENT$0);
            }
        }
        
        /**
         * Sets ith "IAPDocument" element
         */
        public void setIAPDocumentArray(int i, org.uicds.uicdsCommon.DocumentType iapDocument)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.uicdsCommon.DocumentType target = null;
                target = (org.uicds.uicdsCommon.DocumentType)get_store().find_element_user(IAPDOCUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(iapDocument);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IAPDocument" element
         */
        public org.uicds.uicdsCommon.DocumentType insertNewIAPDocument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.uicdsCommon.DocumentType target = null;
                target = (org.uicds.uicdsCommon.DocumentType)get_store().insert_element_user(IAPDOCUMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IAPDocument" element
         */
        public org.uicds.uicdsCommon.DocumentType addNewIAPDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.uicdsCommon.DocumentType target = null;
                target = (org.uicds.uicdsCommon.DocumentType)get_store().add_element_user(IAPDOCUMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "IAPDocument" element
         */
        public void removeIAPDocument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IAPDOCUMENT$0, i);
            }
        }
    }
}
