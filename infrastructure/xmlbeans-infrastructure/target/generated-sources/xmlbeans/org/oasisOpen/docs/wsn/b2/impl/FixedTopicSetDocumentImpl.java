/*
 * An XML document type.
 * Localname: FixedTopicSet
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.FixedTopicSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one FixedTopicSet(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class FixedTopicSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.FixedTopicSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public FixedTopicSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIXEDTOPICSET$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "FixedTopicSet");
    
    
    /**
     * Gets the "FixedTopicSet" element
     */
    public boolean getFixedTopicSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIXEDTOPICSET$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "FixedTopicSet" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFixedTopicSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FIXEDTOPICSET$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FixedTopicSet" element
     */
    public void setFixedTopicSet(boolean fixedTopicSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIXEDTOPICSET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIXEDTOPICSET$0);
            }
            target.setBooleanValue(fixedTopicSet);
        }
    }
    
    /**
     * Sets (as xml) the "FixedTopicSet" element
     */
    public void xsetFixedTopicSet(org.apache.xmlbeans.XmlBoolean fixedTopicSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FIXEDTOPICSET$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FIXEDTOPICSET$0);
            }
            target.set(fixedTopicSet);
        }
    }
}
