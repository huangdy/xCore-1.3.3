/*
 * XML Type:  nonXMLContentType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1.impl;
/**
 * An XML nonXMLContentType(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
 *
 * This is a complex type.
 */
public class NonXMLContentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType
{
    private static final long serialVersionUID = 1L;
    
    public NonXMLContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIMETYPE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "mimeType");
    private static final javax.xml.namespace.QName SIZE$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "size");
    private static final javax.xml.namespace.QName DIGEST$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "digest");
    private static final javax.xml.namespace.QName URI$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "uri");
    private static final javax.xml.namespace.QName CONTENTDATA$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "contentData");
    
    
    /**
     * Gets the "mimeType" element
     */
    public java.lang.String getMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mimeType" element
     */
    public org.apache.xmlbeans.XmlString xgetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mimeType" element
     */
    public void setMimeType(java.lang.String mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMETYPE$0);
            }
            target.setStringValue(mimeType);
        }
    }
    
    /**
     * Sets (as xml) the "mimeType" element
     */
    public void xsetMimeType(org.apache.xmlbeans.XmlString mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIMETYPE$0);
            }
            target.set(mimeType);
        }
    }
    
    /**
     * Gets the "size" element
     */
    public java.math.BigInteger getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "size" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "size" element
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZE$2) != 0;
        }
    }
    
    /**
     * Sets the "size" element
     */
    public void setSize(java.math.BigInteger size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$2);
            }
            target.setBigIntegerValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "size" element
     */
    public void xsetSize(org.apache.xmlbeans.XmlInteger size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SIZE$2);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "size" element
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZE$2, 0);
        }
    }
    
    /**
     * Gets the "digest" element
     */
    public java.lang.String getDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGEST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "digest" element
     */
    public org.apache.xmlbeans.XmlString xgetDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIGEST$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "digest" element
     */
    public boolean isSetDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIGEST$4) != 0;
        }
    }
    
    /**
     * Sets the "digest" element
     */
    public void setDigest(java.lang.String digest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGEST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIGEST$4);
            }
            target.setStringValue(digest);
        }
    }
    
    /**
     * Sets (as xml) the "digest" element
     */
    public void xsetDigest(org.apache.xmlbeans.XmlString digest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIGEST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIGEST$4);
            }
            target.set(digest);
        }
    }
    
    /**
     * Unsets the "digest" element
     */
    public void unsetDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIGEST$4, 0);
        }
    }
    
    /**
     * Gets the "uri" element
     */
    public java.lang.String getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URI$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uri" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URI$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "uri" element
     */
    public boolean isSetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URI$6) != 0;
        }
    }
    
    /**
     * Sets the "uri" element
     */
    public void setUri(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URI$6);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "uri" element
     */
    public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URI$6);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "uri" element
     */
    public void unsetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URI$6, 0);
        }
    }
    
    /**
     * Gets the "contentData" element
     */
    public byte[] getContentData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTDATA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentData" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetContentData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(CONTENTDATA$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "contentData" element
     */
    public boolean isSetContentData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTDATA$8) != 0;
        }
    }
    
    /**
     * Sets the "contentData" element
     */
    public void setContentData(byte[] contentData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTDATA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTDATA$8);
            }
            target.setByteArrayValue(contentData);
        }
    }
    
    /**
     * Sets (as xml) the "contentData" element
     */
    public void xsetContentData(org.apache.xmlbeans.XmlBase64Binary contentData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(CONTENTDATA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(CONTENTDATA$8);
            }
            target.set(contentData);
        }
    }
    
    /**
     * Unsets the "contentData" element
     */
    public void unsetContentData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTDATA$8, 0);
        }
    }
}
