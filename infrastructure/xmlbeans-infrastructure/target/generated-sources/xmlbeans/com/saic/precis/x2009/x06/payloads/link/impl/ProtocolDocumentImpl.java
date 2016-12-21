/*
 * An XML document type.
 * Localname: Protocol
 * Namespace: http://www.saic.com/precis/2009/06/payloads/link
 * Java type: com.saic.precis.x2009.x06.payloads.link.ProtocolDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.payloads.link.impl;
/**
 * A document containing one Protocol(@http://www.saic.com/precis/2009/06/payloads/link) element.
 *
 * This is a complex type.
 */
public class ProtocolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.payloads.link.ProtocolDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProtocolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTOCOL$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/payloads/link", "Protocol");
    
    
    /**
     * Gets the "Protocol" element
     */
    public java.lang.String getProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Protocol" element
     */
    public org.apache.xmlbeans.XmlString xgetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROTOCOL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Protocol" element
     */
    public void setProtocol(java.lang.String protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROTOCOL$0);
            }
            target.setStringValue(protocol);
        }
    }
    
    /**
     * Sets (as xml) the "Protocol" element
     */
    public void xsetProtocol(org.apache.xmlbeans.XmlString protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROTOCOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROTOCOL$0);
            }
            target.set(protocol);
        }
    }
}
