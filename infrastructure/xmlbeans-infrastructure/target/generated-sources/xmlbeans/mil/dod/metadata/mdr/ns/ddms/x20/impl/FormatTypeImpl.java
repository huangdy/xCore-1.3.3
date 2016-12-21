/*
 * XML Type:  FormatType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.FormatType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML FormatType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class FormatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.FormatType
{
    private static final long serialVersionUID = 1L;
    
    public FormatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIA$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Media");
    
    
    /**
     * Gets the "Media" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.MediaType getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.MediaType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.MediaType)get_store().find_element_user(MEDIA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Media" element
     */
    public void setMedia(mil.dod.metadata.mdr.ns.ddms.x20.MediaType media)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.MediaType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.MediaType)get_store().find_element_user(MEDIA$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.MediaType)get_store().add_element_user(MEDIA$0);
            }
            target.set(media);
        }
    }
    
    /**
     * Appends and returns a new empty "Media" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.MediaType addNewMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.MediaType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.MediaType)get_store().add_element_user(MEDIA$0);
            return target;
        }
    }
}
