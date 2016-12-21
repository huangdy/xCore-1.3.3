/*
 * An XML document type.
 * Localname: DestroyPullPoint
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one DestroyPullPoint(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class DestroyPullPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public DestroyPullPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESTROYPULLPOINT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "DestroyPullPoint");
    
    
    /**
     * Gets the "DestroyPullPoint" element
     */
    public org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint getDestroyPullPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint target = null;
            target = (org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint)get_store().find_element_user(DESTROYPULLPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DestroyPullPoint" element
     */
    public void setDestroyPullPoint(org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint destroyPullPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint target = null;
            target = (org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint)get_store().find_element_user(DESTROYPULLPOINT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint)get_store().add_element_user(DESTROYPULLPOINT$0);
            }
            target.set(destroyPullPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "DestroyPullPoint" element
     */
    public org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint addNewDestroyPullPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint target = null;
            target = (org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint)get_store().add_element_user(DESTROYPULLPOINT$0);
            return target;
        }
    }
    /**
     * An XML DestroyPullPoint(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class DestroyPullPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.DestroyPullPointDocument.DestroyPullPoint
    {
        private static final long serialVersionUID = 1L;
        
        public DestroyPullPointImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
