/*
 * XML Type:  ExtensibleDocumented
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.ExtensibleDocumented
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1.impl;
/**
 * An XML ExtensibleDocumented(@http://docs.oasis-open.org/wsn/t-1).
 *
 * This is a complex type.
 */
public class ExtensibleDocumentedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.t1.ExtensibleDocumented
{
    private static final long serialVersionUID = 1L;
    
    public ExtensibleDocumentedImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTATION$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "documentation");
    
    
    /**
     * Gets the "documentation" element
     */
    public org.oasisOpen.docs.wsn.t1.Documentation getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.Documentation target = null;
            target = (org.oasisOpen.docs.wsn.t1.Documentation)get_store().find_element_user(DOCUMENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "documentation" element
     */
    public boolean isSetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$0) != 0;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.oasisOpen.docs.wsn.t1.Documentation documentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.Documentation target = null;
            target = (org.oasisOpen.docs.wsn.t1.Documentation)get_store().find_element_user(DOCUMENTATION$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.t1.Documentation)get_store().add_element_user(DOCUMENTATION$0);
            }
            target.set(documentation);
        }
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.oasisOpen.docs.wsn.t1.Documentation addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.Documentation target = null;
            target = (org.oasisOpen.docs.wsn.t1.Documentation)get_store().add_element_user(DOCUMENTATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "documentation" element
     */
    public void unsetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$0, 0);
        }
    }
}
