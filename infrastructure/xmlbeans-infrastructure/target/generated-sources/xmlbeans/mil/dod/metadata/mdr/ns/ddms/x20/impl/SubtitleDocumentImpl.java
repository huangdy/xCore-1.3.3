/*
 * An XML document type.
 * Localname: subtitle
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.SubtitleDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one subtitle(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class SubtitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.SubtitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubtitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBTITLE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "subtitle");
    
    
    /**
     * Gets the "subtitle" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType getSubtitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType)get_store().find_element_user(SUBTITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subtitle" element
     */
    public void setSubtitle(mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType subtitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType)get_store().find_element_user(SUBTITLE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType)get_store().add_element_user(SUBTITLE$0);
            }
            target.set(subtitle);
        }
    }
    
    /**
     * Appends and returns a new empty "subtitle" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType addNewSubtitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.SubtitleType)get_store().add_element_user(SUBTITLE$0);
            return target;
        }
    }
}
