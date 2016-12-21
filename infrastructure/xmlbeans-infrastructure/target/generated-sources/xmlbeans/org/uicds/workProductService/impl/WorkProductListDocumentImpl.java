/*
 * An XML document type.
 * Localname: WorkProductList
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.WorkProductListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one WorkProductList(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class WorkProductListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.WorkProductListDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductList");
    
    
    /**
     * Gets the "WorkProductList" element
     */
    public org.uicds.workProductService.WorkProductListDocument.WorkProductList getWorkProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.WorkProductListDocument.WorkProductList target = null;
            target = (org.uicds.workProductService.WorkProductListDocument.WorkProductList)get_store().find_element_user(WORKPRODUCTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductList" element
     */
    public void setWorkProductList(org.uicds.workProductService.WorkProductListDocument.WorkProductList workProductList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.WorkProductListDocument.WorkProductList target = null;
            target = (org.uicds.workProductService.WorkProductListDocument.WorkProductList)get_store().find_element_user(WORKPRODUCTLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.WorkProductListDocument.WorkProductList)get_store().add_element_user(WORKPRODUCTLIST$0);
            }
            target.set(workProductList);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductList" element
     */
    public org.uicds.workProductService.WorkProductListDocument.WorkProductList addNewWorkProductList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.WorkProductListDocument.WorkProductList target = null;
            target = (org.uicds.workProductService.WorkProductListDocument.WorkProductList)get_store().add_element_user(WORKPRODUCTLIST$0);
            return target;
        }
    }
    /**
     * An XML WorkProductList(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class WorkProductListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.WorkProductListDocument.WorkProductList
    {
        private static final long serialVersionUID = 1L;
        
        public WorkProductListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCT$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
        
        
        /**
         * Gets array of all "WorkProduct" elements
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct[] getWorkProductArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WORKPRODUCT$0, targetList);
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct[] result = new com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProductArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "WorkProduct" element
         */
        public int sizeOfWorkProductArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKPRODUCT$0);
            }
        }
        
        /**
         * Sets array of all "WorkProduct" element
         */
        public void setWorkProductArray(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct[] workProductArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(workProductArray, WORKPRODUCT$0);
            }
        }
        
        /**
         * Sets ith "WorkProduct" element
         */
        public void setWorkProductArray(int i, com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(workProduct);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct insertNewWorkProduct(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().insert_element_user(WORKPRODUCT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct addNewWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "WorkProduct" element
         */
        public void removeWorkProduct(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKPRODUCT$0, i);
            }
        }
    }
}
