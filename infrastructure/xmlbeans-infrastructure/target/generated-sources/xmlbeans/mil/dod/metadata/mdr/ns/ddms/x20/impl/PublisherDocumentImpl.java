/*
 * An XML document type.
 * Localname: publisher
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.PublisherDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one publisher(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class PublisherDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.PublisherDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublisherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHER$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "publisher");
    
    
    /**
     * Gets the "publisher" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PublisherType getPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PublisherType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PublisherType)get_store().find_element_user(PUBLISHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "publisher" element
     */
    public void setPublisher(mil.dod.metadata.mdr.ns.ddms.x20.PublisherType publisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PublisherType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PublisherType)get_store().find_element_user(PUBLISHER$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PublisherType)get_store().add_element_user(PUBLISHER$0);
            }
            target.set(publisher);
        }
    }
    
    /**
     * Appends and returns a new empty "publisher" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PublisherType addNewPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PublisherType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PublisherType)get_store().add_element_user(PUBLISHER$0);
            return target;
        }
    }
}
