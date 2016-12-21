/*
 * An XML document type.
 * Localname: LocationCountry
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationCountryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationCountry(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationCountryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationCountryDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationCountryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCOUNTRY$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountry");
    private static final org.apache.xmlbeans.QNameSet LOCATIONCOUNTRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountry"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountryISO3166Alpha2Code"),
    });
    
    
    /**
     * Gets the "LocationCountry" element
     */
    public org.apache.xmlbeans.XmlObject getLocationCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONCOUNTRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocationCountry" element
     */
    public void setLocationCountry(org.apache.xmlbeans.XmlObject locationCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONCOUNTRY$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONCOUNTRY$0);
            }
            target.set(locationCountry);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationCountry" element
     */
    public org.apache.xmlbeans.XmlObject addNewLocationCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONCOUNTRY$0);
            return target;
        }
    }
}
