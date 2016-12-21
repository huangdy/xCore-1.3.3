/*
 * An XML document type.
 * Localname: LocationAddress
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationAddressDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationAddress(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONADDRESS$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationAddress");
    
    
    /**
     * Gets the "LocationAddress" element
     */
    public gov.niem.niem.niemCore.x20.AddressType getLocationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().find_element_user(LOCATIONADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationAddress" element
     */
    public boolean isNilLocationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().find_element_user(LOCATIONADDRESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationAddress" element
     */
    public void setLocationAddress(gov.niem.niem.niemCore.x20.AddressType locationAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().find_element_user(LOCATIONADDRESS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AddressType)get_store().add_element_user(LOCATIONADDRESS$0);
            }
            target.set(locationAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationAddress" element
     */
    public gov.niem.niem.niemCore.x20.AddressType addNewLocationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().add_element_user(LOCATIONADDRESS$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationAddress" element
     */
    public void setNilLocationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().find_element_user(LOCATIONADDRESS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AddressType)get_store().add_element_user(LOCATIONADDRESS$0);
            }
            target.setNil();
        }
    }
}
