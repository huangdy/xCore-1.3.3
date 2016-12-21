/*
 * An XML document type.
 * Localname: Filter
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.FilterDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one Filter(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class FilterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.FilterDocument
{
    private static final long serialVersionUID = 1L;
    
    public FilterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Filter");
    
    
    /**
     * Gets the "Filter" element
     */
    public org.oasisOpen.docs.wsn.b2.FilterType getFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.FilterType target = null;
            target = (org.oasisOpen.docs.wsn.b2.FilterType)get_store().find_element_user(FILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Filter" element
     */
    public void setFilter(org.oasisOpen.docs.wsn.b2.FilterType filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.FilterType target = null;
            target = (org.oasisOpen.docs.wsn.b2.FilterType)get_store().find_element_user(FILTER$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.FilterType)get_store().add_element_user(FILTER$0);
            }
            target.set(filter);
        }
    }
    
    /**
     * Appends and returns a new empty "Filter" element
     */
    public org.oasisOpen.docs.wsn.b2.FilterType addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.FilterType target = null;
            target = (org.oasisOpen.docs.wsn.b2.FilterType)get_store().add_element_user(FILTER$0);
            return target;
        }
    }
}
