/*
 * An XML document type.
 * Localname: WorkProduct
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.WorkProductDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures.impl;
/**
 * A document containing one WorkProduct(@http://www.saic.com/precis/2009/06/structures) element.
 *
 * This is a complex type.
 */
public class WorkProductDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.structures.WorkProductDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCT$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
    
    
    /**
     * Gets the "WorkProduct" element
     */
    public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
            target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProduct" element
     */
    public void setWorkProduct(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
            target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
            }
            target.set(workProduct);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProduct" element
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
     * An XML WorkProduct(@http://www.saic.com/precis/2009/06/structures).
     *
     * This is a complex type.
     */
    public static class WorkProductImpl extends x0.messageStructure1.impl.DataItemPackageTypeImpl implements com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct
    {
        private static final long serialVersionUID = 1L;
        
        public WorkProductImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
