/*
 * An XML document type.
 * Localname: CreatePullPoint
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.CreatePullPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one CreatePullPoint(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class CreatePullPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.CreatePullPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreatePullPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPULLPOINT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CreatePullPoint");
    
    
    /**
     * Gets the "CreatePullPoint" element
     */
    public org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint getCreatePullPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint target = null;
            target = (org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint)get_store().find_element_user(CREATEPULLPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatePullPoint" element
     */
    public void setCreatePullPoint(org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint createPullPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint target = null;
            target = (org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint)get_store().find_element_user(CREATEPULLPOINT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint)get_store().add_element_user(CREATEPULLPOINT$0);
            }
            target.set(createPullPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatePullPoint" element
     */
    public org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint addNewCreatePullPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint target = null;
            target = (org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint)get_store().add_element_user(CREATEPULLPOINT$0);
            return target;
        }
    }
    /**
     * An XML CreatePullPoint(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class CreatePullPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.CreatePullPointDocument.CreatePullPoint
    {
        private static final long serialVersionUID = 1L;
        
        public CreatePullPointImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
