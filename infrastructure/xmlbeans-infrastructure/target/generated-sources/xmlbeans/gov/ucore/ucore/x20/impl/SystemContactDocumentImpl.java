/*
 * An XML document type.
 * Localname: SystemContact
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.SystemContactDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one SystemContact(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class SystemContactDocumentImpl extends x0.messageStructure1.impl.SystemContactAbstractDocumentImpl implements gov.ucore.ucore.x20.SystemContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public SystemContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMCONTACT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SystemContact");
    
    
    /**
     * Gets the "SystemContact" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType getSystemContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().find_element_user(SYSTEMCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemContact" element
     */
    public void setSystemContact(mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType systemContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().find_element_user(SYSTEMCONTACT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().add_element_user(SYSTEMCONTACT$0);
            }
            target.set(systemContact);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemContact" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType addNewSystemContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().add_element_user(SYSTEMCONTACT$0);
            return target;
        }
    }
}
