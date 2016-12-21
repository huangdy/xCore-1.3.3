/*
 * An XML document type.
 * Localname: Unsubscribe
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnsubscribeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one Unsubscribe(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnsubscribeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnsubscribeDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsubscribeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSUBSCRIBE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Unsubscribe");
    
    
    /**
     * Gets the "Unsubscribe" element
     */
    public org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe getUnsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe)get_store().find_element_user(UNSUBSCRIBE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Unsubscribe" element
     */
    public void setUnsubscribe(org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe unsubscribe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe)get_store().find_element_user(UNSUBSCRIBE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe)get_store().add_element_user(UNSUBSCRIBE$0);
            }
            target.set(unsubscribe);
        }
    }
    
    /**
     * Appends and returns a new empty "Unsubscribe" element
     */
    public org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe addNewUnsubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe)get_store().add_element_user(UNSUBSCRIBE$0);
            return target;
        }
    }
    /**
     * An XML Unsubscribe(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class UnsubscribeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnsubscribeDocument.Unsubscribe
    {
        private static final long serialVersionUID = 1L;
        
        public UnsubscribeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
