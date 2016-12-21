/*
 * XML Type:  PhysicalAddressType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PhysicalAddressType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML PhysicalAddressType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class PhysicalAddressTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.PhysicalAddressType
{
    private static final long serialVersionUID = 1L;
    
    public PhysicalAddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTALADDRESS$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "postalAddress");
    
    
    /**
     * Gets the "postalAddress" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress getPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().find_element_user(POSTALADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "postalAddress" element
     */
    public void setPostalAddress(mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress postalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().find_element_user(POSTALADDRESS$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().add_element_user(POSTALADDRESS$0);
            }
            target.set(postalAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "postalAddress" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress addNewPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().add_element_user(POSTALADDRESS$0);
            return target;
        }
    }
}
