/*
 * An XML document type.
 * Localname: LocationPostalCode
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationPostalCodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationPostalCode(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationPostalCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationPostalCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationPostalCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONPOSTALCODE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationPostalCode");
    
    
    /**
     * Gets the "LocationPostalCode" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getLocationPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(LOCATIONPOSTALCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationPostalCode" element
     */
    public boolean isNilLocationPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(LOCATIONPOSTALCODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationPostalCode" element
     */
    public void setLocationPostalCode(gov.niem.niem.proxy.xsd.x20.String locationPostalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(LOCATIONPOSTALCODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(LOCATIONPOSTALCODE$0);
            }
            target.set(locationPostalCode);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationPostalCode" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewLocationPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(LOCATIONPOSTALCODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationPostalCode" element
     */
    public void setNilLocationPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(LOCATIONPOSTALCODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(LOCATIONPOSTALCODE$0);
            }
            target.setNil();
        }
    }
}
