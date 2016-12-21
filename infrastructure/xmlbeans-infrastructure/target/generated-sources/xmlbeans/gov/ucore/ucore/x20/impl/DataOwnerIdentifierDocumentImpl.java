/*
 * An XML document type.
 * Localname: DataOwnerIdentifier
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.DataOwnerIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one DataOwnerIdentifier(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerIdentifierDocumentImpl extends x0.messageStructure1.impl.DataOwnerIdentifierAbstractDocumentImpl implements gov.ucore.ucore.x20.DataOwnerIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataOwnerIdentifier");
    
    
    /**
     * Gets the "DataOwnerIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType getDataOwnerIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().find_element_user(DATAOWNERIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerIdentifier" element
     */
    public void setDataOwnerIdentifier(mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType dataOwnerIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().find_element_user(DATAOWNERIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().add_element_user(DATAOWNERIDENTIFIER$0);
            }
            target.set(dataOwnerIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType addNewDataOwnerIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PointOfContactType)get_store().add_element_user(DATAOWNERIDENTIFIER$0);
            return target;
        }
    }
}
