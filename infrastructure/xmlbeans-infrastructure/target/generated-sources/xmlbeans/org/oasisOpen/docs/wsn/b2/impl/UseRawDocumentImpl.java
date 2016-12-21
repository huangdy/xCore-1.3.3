/*
 * An XML document type.
 * Localname: UseRaw
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UseRawDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UseRaw(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UseRawDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UseRawDocument
{
    private static final long serialVersionUID = 1L;
    
    public UseRawDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERAW$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UseRaw");
    
    
    /**
     * Gets the "UseRaw" element
     */
    public org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw getUseRaw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw target = null;
            target = (org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw)get_store().find_element_user(USERAW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UseRaw" element
     */
    public void setUseRaw(org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw useRaw)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw target = null;
            target = (org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw)get_store().find_element_user(USERAW$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw)get_store().add_element_user(USERAW$0);
            }
            target.set(useRaw);
        }
    }
    
    /**
     * Appends and returns a new empty "UseRaw" element
     */
    public org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw addNewUseRaw()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw target = null;
            target = (org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw)get_store().add_element_user(USERAW$0);
            return target;
        }
    }
    /**
     * An XML UseRaw(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class UseRawImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UseRawDocument.UseRaw
    {
        private static final long serialVersionUID = 1L;
        
        public UseRawImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
