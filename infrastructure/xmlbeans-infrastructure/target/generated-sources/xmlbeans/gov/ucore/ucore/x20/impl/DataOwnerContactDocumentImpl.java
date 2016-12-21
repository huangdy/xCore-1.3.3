/*
 * An XML document type.
 * Localname: DataOwnerContact
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.DataOwnerContactDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one DataOwnerContact(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerContactDocumentImpl extends x0.messageStructure1.impl.DataOwnerContactAbstractDocumentImpl implements gov.ucore.ucore.x20.DataOwnerContactDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerContactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERCONTACT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataOwnerContact");
    
    
    /**
     * Gets the "DataOwnerContact" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType getDataOwnerContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().find_element_user(DATAOWNERCONTACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerContact" element
     */
    public void setDataOwnerContact(mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType dataOwnerContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().find_element_user(DATAOWNERCONTACT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().add_element_user(DATAOWNERCONTACT$0);
            }
            target.set(dataOwnerContact);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerContact" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType addNewDataOwnerContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().add_element_user(DATAOWNERCONTACT$0);
            return target;
        }
    }
}
