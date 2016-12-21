/*
 * An XML document type.
 * Localname: pointOfContact
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one pointOfContact(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class PointOfContactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointOfContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTOFCONTACT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "pointOfContact");
    
    
    /**
     * Gets the "pointOfContact" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType getPointOfContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().find_element_user(POINTOFCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointOfContact" element
     */
    public void setPointOfContact(mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType pointOfContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().find_element_user(POINTOFCONTACT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().add_element_user(POINTOFCONTACT$0);
            }
            target.set(pointOfContact);
        }
    }
    
    /**
     * Appends and returns a new empty "pointOfContact" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType addNewPointOfContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().add_element_user(POINTOFCONTACT$0);
            return target;
        }
    }
}
