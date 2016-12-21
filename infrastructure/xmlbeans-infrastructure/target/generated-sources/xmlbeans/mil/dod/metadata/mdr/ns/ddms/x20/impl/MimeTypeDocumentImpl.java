/*
 * An XML document type.
 * Localname: mimeType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one mimeType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class MimeTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MimeTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIMETYPE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "mimeType");
    
    
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
    public mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeType xgetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeType)get_store().find_element_user(MIMETYPE$0, 0);
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
    public void xsetMimeType(mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeType mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeType)get_store().find_element_user(MIMETYPE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.MimeTypeType)get_store().add_element_user(MIMETYPE$0);
            }
            target.set(mimeType);
        }
    }
}
