/*
 * XML Type:  MediaType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.MediaType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML MediaType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class MediaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.MediaType
{
    private static final long serialVersionUID = 1L;
    
    public MediaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIMETYPE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "mimeType");
    private static final javax.xml.namespace.QName EXTENT$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "extent");
    private static final javax.xml.namespace.QName MEDIUM$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "medium");
    
    
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
    
    /**
     * Gets the "extent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType)get_store().find_element_user(EXTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extent" element
     */
    public boolean isSetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENT$2) != 0;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType)get_store().find_element_user(EXTENT$2, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType)get_store().add_element_user(EXTENT$2);
            }
            target.set(extent);
        }
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType)get_store().add_element_user(EXTENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "extent" element
     */
    public void unsetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENT$2, 0);
        }
    }
    
    /**
     * Gets the "medium" element
     */
    public java.lang.String getMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "medium" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.MediumType xgetMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.MediumType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.MediumType)get_store().find_element_user(MEDIUM$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "medium" element
     */
    public boolean isSetMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIUM$4) != 0;
        }
    }
    
    /**
     * Sets the "medium" element
     */
    public void setMedium(java.lang.String medium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUM$4);
            }
            target.setStringValue(medium);
        }
    }
    
    /**
     * Sets (as xml) the "medium" element
     */
    public void xsetMedium(mil.dod.metadata.mdr.ns.ddms.x20.MediumType medium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.MediumType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.MediumType)get_store().find_element_user(MEDIUM$4, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.MediumType)get_store().add_element_user(MEDIUM$4);
            }
            target.set(medium);
        }
    }
    
    /**
     * Unsets the "medium" element
     */
    public void unsetMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIUM$4, 0);
        }
    }
}
