/*
 * An XML document type.
 * Localname: ICSFormList
 * Namespace: http://uicds.org/ICSForm
 * Java type: org.uicds.icsForm.ICSFormListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm.impl;
/**
 * A document containing one ICSFormList(@http://uicds.org/ICSForm) element.
 *
 * This is a complex type.
 */
public class ICSFormListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm.ICSFormListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ICSFormListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORMLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm", "ICSFormList");
    
    
    /**
     * Gets the "ICSFormList" element
     */
    public org.uicds.icsForm.ICSFormListDocument.ICSFormList getICSFormList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm.ICSFormListDocument.ICSFormList target = null;
            target = (org.uicds.icsForm.ICSFormListDocument.ICSFormList)get_store().find_element_user(ICSFORMLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSFormList" element
     */
    public void setICSFormList(org.uicds.icsForm.ICSFormListDocument.ICSFormList icsFormList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm.ICSFormListDocument.ICSFormList target = null;
            target = (org.uicds.icsForm.ICSFormListDocument.ICSFormList)get_store().find_element_user(ICSFORMLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm.ICSFormListDocument.ICSFormList)get_store().add_element_user(ICSFORMLIST$0);
            }
            target.set(icsFormList);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSFormList" element
     */
    public org.uicds.icsForm.ICSFormListDocument.ICSFormList addNewICSFormList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm.ICSFormListDocument.ICSFormList target = null;
            target = (org.uicds.icsForm.ICSFormListDocument.ICSFormList)get_store().add_element_user(ICSFORMLIST$0);
            return target;
        }
    }
    /**
     * An XML ICSFormList(@http://uicds.org/ICSForm).
     *
     * This is a complex type.
     */
    public static class ICSFormListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm.ICSFormListDocument.ICSFormList
    {
        private static final long serialVersionUID = 1L;
        
        public ICSFormListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ICSFORM$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm", "ICSForm");
        
        
        /**
         * Gets array of all "ICSForm" elements
         */
        public org.uicds.icsForm.ICSFormType[] getICSFormArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ICSFORM$0, targetList);
                org.uicds.icsForm.ICSFormType[] result = new org.uicds.icsForm.ICSFormType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ICSForm" element
         */
        public org.uicds.icsForm.ICSFormType getICSFormArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm.ICSFormType target = null;
                target = (org.uicds.icsForm.ICSFormType)get_store().find_element_user(ICSFORM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ICSForm" element
         */
        public int sizeOfICSFormArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ICSFORM$0);
            }
        }
        
        /**
         * Sets array of all "ICSForm" element
         */
        public void setICSFormArray(org.uicds.icsForm.ICSFormType[] icsFormArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(icsFormArray, ICSFORM$0);
            }
        }
        
        /**
         * Sets ith "ICSForm" element
         */
        public void setICSFormArray(int i, org.uicds.icsForm.ICSFormType icsForm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm.ICSFormType target = null;
                target = (org.uicds.icsForm.ICSFormType)get_store().find_element_user(ICSFORM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(icsForm);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ICSForm" element
         */
        public org.uicds.icsForm.ICSFormType insertNewICSForm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm.ICSFormType target = null;
                target = (org.uicds.icsForm.ICSFormType)get_store().insert_element_user(ICSFORM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ICSForm" element
         */
        public org.uicds.icsForm.ICSFormType addNewICSForm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm.ICSFormType target = null;
                target = (org.uicds.icsForm.ICSFormType)get_store().add_element_user(ICSFORM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ICSForm" element
         */
        public void removeICSForm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ICSFORM$0, i);
            }
        }
    }
}
