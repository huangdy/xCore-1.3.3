/*
 * An XML document type.
 * Localname: GetMessages
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.GetMessagesDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one GetMessages(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class GetMessagesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.GetMessagesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMessagesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMESSAGES$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "GetMessages");
    
    
    /**
     * Gets the "GetMessages" element
     */
    public org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages getGetMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages)get_store().find_element_user(GETMESSAGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMessages" element
     */
    public void setGetMessages(org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages getMessages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages)get_store().find_element_user(GETMESSAGES$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages)get_store().add_element_user(GETMESSAGES$0);
            }
            target.set(getMessages);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMessages" element
     */
    public org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages addNewGetMessages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages)get_store().add_element_user(GETMESSAGES$0);
            return target;
        }
    }
    /**
     * An XML GetMessages(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class GetMessagesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.GetMessagesDocument.GetMessages
    {
        private static final long serialVersionUID = 1L;
        
        public GetMessagesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAXIMUMNUMBER$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "MaximumNumber");
        
        
        /**
         * Gets the "MaximumNumber" element
         */
        public java.math.BigInteger getMaximumNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MaximumNumber" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetMaximumNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MAXIMUMNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MaximumNumber" element
         */
        public void setMaximumNumber(java.math.BigInteger maximumNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMNUMBER$0);
                }
                target.setBigIntegerValue(maximumNumber);
            }
        }
        
        /**
         * Sets (as xml) the "MaximumNumber" element
         */
        public void xsetMaximumNumber(org.apache.xmlbeans.XmlNonNegativeInteger maximumNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MAXIMUMNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(MAXIMUMNUMBER$0);
                }
                target.set(maximumNumber);
            }
        }
    }
}
