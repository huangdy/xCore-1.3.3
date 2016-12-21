/*
 * An XML document type.
 * Localname: LinkContent
 * Namespace: http://www.saic.com/precis/2009/06/payloads/link
 * Java type: com.saic.precis.x2009.x06.payloads.link.LinkContentDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.payloads.link.impl;
/**
 * A document containing one LinkContent(@http://www.saic.com/precis/2009/06/payloads/link) element.
 *
 * This is a complex type.
 */
public class LinkContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.payloads.link.LinkContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKCONTENT$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/payloads/link", "LinkContent");
    
    
    /**
     * Gets the "LinkContent" element
     */
    public com.saic.precis.x2009.x06.payloads.link.LinkContentType getLinkContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.payloads.link.LinkContentType target = null;
            target = (com.saic.precis.x2009.x06.payloads.link.LinkContentType)get_store().find_element_user(LINKCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LinkContent" element
     */
    public void setLinkContent(com.saic.precis.x2009.x06.payloads.link.LinkContentType linkContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.payloads.link.LinkContentType target = null;
            target = (com.saic.precis.x2009.x06.payloads.link.LinkContentType)get_store().find_element_user(LINKCONTENT$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.payloads.link.LinkContentType)get_store().add_element_user(LINKCONTENT$0);
            }
            target.set(linkContent);
        }
    }
    
    /**
     * Appends and returns a new empty "LinkContent" element
     */
    public com.saic.precis.x2009.x06.payloads.link.LinkContentType addNewLinkContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.payloads.link.LinkContentType target = null;
            target = (com.saic.precis.x2009.x06.payloads.link.LinkContentType)get_store().add_element_user(LINKCONTENT$0);
            return target;
        }
    }
}
