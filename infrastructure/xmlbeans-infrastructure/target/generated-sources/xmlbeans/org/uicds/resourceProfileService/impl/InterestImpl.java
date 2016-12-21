/*
 * XML Type:  Interest
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.Interest
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * An XML Interest(@http://uicds.org/ResourceProfileService).
 *
 * This is a complex type.
 */
public class InterestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.Interest
{
    private static final long serialVersionUID = 1L;
    
    public InterestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "TopicExpression");
    private static final javax.xml.namespace.QName MESSAGECONTENT$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "MessageContent");
    private static final javax.xml.namespace.QName NAMESPACEMAP$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "NamespaceMap");
    
    
    /**
     * Gets the "TopicExpression" element
     */
    public java.lang.String getTopicExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TopicExpression" element
     */
    public org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression xgetTopicExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression target = null;
            target = (org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression)get_store().find_element_user(TOPICEXPRESSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TopicExpression" element
     */
    public void setTopicExpression(java.lang.String topicExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPICEXPRESSION$0);
            }
            target.setStringValue(topicExpression);
        }
    }
    
    /**
     * Sets (as xml) the "TopicExpression" element
     */
    public void xsetTopicExpression(org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression topicExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression target = null;
            target = (org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression)get_store().find_element_user(TOPICEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression)get_store().add_element_user(TOPICEXPRESSION$0);
            }
            target.set(topicExpression);
        }
    }
    
    /**
     * Gets the "MessageContent" element
     */
    public org.oasisOpen.docs.wsn.b2.QueryExpressionType getMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().find_element_user(MESSAGECONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MessageContent" element
     */
    public boolean isSetMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGECONTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "MessageContent" element
     */
    public void setMessageContent(org.oasisOpen.docs.wsn.b2.QueryExpressionType messageContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().find_element_user(MESSAGECONTENT$2, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().add_element_user(MESSAGECONTENT$2);
            }
            target.set(messageContent);
        }
    }
    
    /**
     * Appends and returns a new empty "MessageContent" element
     */
    public org.oasisOpen.docs.wsn.b2.QueryExpressionType addNewMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().add_element_user(MESSAGECONTENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MessageContent" element
     */
    public void unsetMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGECONTENT$2, 0);
        }
    }
    
    /**
     * Gets the "NamespaceMap" element
     */
    public com.saic.precis.x2009.x06.base.NamespaceMapType getNamespaceMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.NamespaceMapType target = null;
            target = (com.saic.precis.x2009.x06.base.NamespaceMapType)get_store().find_element_user(NAMESPACEMAP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NamespaceMap" element
     */
    public boolean isSetNamespaceMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMESPACEMAP$4) != 0;
        }
    }
    
    /**
     * Sets the "NamespaceMap" element
     */
    public void setNamespaceMap(com.saic.precis.x2009.x06.base.NamespaceMapType namespaceMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.NamespaceMapType target = null;
            target = (com.saic.precis.x2009.x06.base.NamespaceMapType)get_store().find_element_user(NAMESPACEMAP$4, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.NamespaceMapType)get_store().add_element_user(NAMESPACEMAP$4);
            }
            target.set(namespaceMap);
        }
    }
    
    /**
     * Appends and returns a new empty "NamespaceMap" element
     */
    public com.saic.precis.x2009.x06.base.NamespaceMapType addNewNamespaceMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.NamespaceMapType target = null;
            target = (com.saic.precis.x2009.x06.base.NamespaceMapType)get_store().add_element_user(NAMESPACEMAP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "NamespaceMap" element
     */
    public void unsetNamespaceMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMESPACEMAP$4, 0);
        }
    }
}
