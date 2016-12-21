/*
 * An XML attribute type.
 * Localname: topicNamespaceLocation
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.TopicNamespaceLocationAttribute
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1.impl;
/**
 * A document containing one topicNamespaceLocation(@http://docs.oasis-open.org/wsn/t-1) attribute.
 *
 * This is a complex type.
 */
public class TopicNamespaceLocationAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.t1.TopicNamespaceLocationAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TopicNamespaceLocationAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICNAMESPACELOCATION$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "topicNamespaceLocation");
    
    
    /**
     * Gets the "topicNamespaceLocation" attribute
     */
    public java.lang.String getTopicNamespaceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPICNAMESPACELOCATION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topicNamespaceLocation" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTopicNamespaceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TOPICNAMESPACELOCATION$0);
            return target;
        }
    }
    
    /**
     * True if has "topicNamespaceLocation" attribute
     */
    public boolean isSetTopicNamespaceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPICNAMESPACELOCATION$0) != null;
        }
    }
    
    /**
     * Sets the "topicNamespaceLocation" attribute
     */
    public void setTopicNamespaceLocation(java.lang.String topicNamespaceLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPICNAMESPACELOCATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPICNAMESPACELOCATION$0);
            }
            target.setStringValue(topicNamespaceLocation);
        }
    }
    
    /**
     * Sets (as xml) the "topicNamespaceLocation" attribute
     */
    public void xsetTopicNamespaceLocation(org.apache.xmlbeans.XmlAnyURI topicNamespaceLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TOPICNAMESPACELOCATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TOPICNAMESPACELOCATION$0);
            }
            target.set(topicNamespaceLocation);
        }
    }
    
    /**
     * Unsets the "topicNamespaceLocation" attribute
     */
    public void unsetTopicNamespaceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPICNAMESPACELOCATION$0);
        }
    }
}
