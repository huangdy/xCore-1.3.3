/*
 * An XML document type.
 * Localname: BinaryContent
 * Namespace: http://www.saic.com/precis/2009/06/payloads/binary
 * Java type: com.saic.precis.x2009.x06.payloads.binary.BinaryContentDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.payloads.binary.impl;
/**
 * A document containing one BinaryContent(@http://www.saic.com/precis/2009/06/payloads/binary) element.
 *
 * This is a complex type.
 */
public class BinaryContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.payloads.binary.BinaryContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public BinaryContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINARYCONTENT$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/payloads/binary", "BinaryContent");
    
    
    /**
     * Gets the "BinaryContent" element
     */
    public com.saic.precis.x2009.x06.payloads.binary.BinaryContentType getBinaryContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.payloads.binary.BinaryContentType target = null;
            target = (com.saic.precis.x2009.x06.payloads.binary.BinaryContentType)get_store().find_element_user(BINARYCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BinaryContent" element
     */
    public void setBinaryContent(com.saic.precis.x2009.x06.payloads.binary.BinaryContentType binaryContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.payloads.binary.BinaryContentType target = null;
            target = (com.saic.precis.x2009.x06.payloads.binary.BinaryContentType)get_store().find_element_user(BINARYCONTENT$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.payloads.binary.BinaryContentType)get_store().add_element_user(BINARYCONTENT$0);
            }
            target.set(binaryContent);
        }
    }
    
    /**
     * Appends and returns a new empty "BinaryContent" element
     */
    public com.saic.precis.x2009.x06.payloads.binary.BinaryContentType addNewBinaryContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.payloads.binary.BinaryContentType target = null;
            target = (com.saic.precis.x2009.x06.payloads.binary.BinaryContentType)get_store().add_element_user(BINARYCONTENT$0);
            return target;
        }
    }
}
