/*
 * An XML document type.
 * Localname: LocationCountryISO3166Alpha2Code
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationCountryISO3166Alpha2CodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationCountryISO3166Alpha2Code(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationCountryISO3166Alpha2CodeDocumentImpl extends gov.niem.niem.niemCore.x20.impl.LocationCountryDocumentImpl implements gov.niem.niem.niemCore.x20.LocationCountryISO3166Alpha2CodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationCountryISO3166Alpha2CodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCOUNTRYISO3166ALPHA2CODE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountryISO3166Alpha2Code");
    
    
    /**
     * Gets the "LocationCountryISO3166Alpha2Code" element
     */
    public gov.niem.niem.iso3166.x20.CountryAlpha2CodeType getLocationCountryISO3166Alpha2Code()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.iso3166.x20.CountryAlpha2CodeType target = null;
            target = (gov.niem.niem.iso3166.x20.CountryAlpha2CodeType)get_store().find_element_user(LOCATIONCOUNTRYISO3166ALPHA2CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationCountryISO3166Alpha2Code" element
     */
    public boolean isNilLocationCountryISO3166Alpha2Code()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.iso3166.x20.CountryAlpha2CodeType target = null;
            target = (gov.niem.niem.iso3166.x20.CountryAlpha2CodeType)get_store().find_element_user(LOCATIONCOUNTRYISO3166ALPHA2CODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationCountryISO3166Alpha2Code" element
     */
    public void setLocationCountryISO3166Alpha2Code(gov.niem.niem.iso3166.x20.CountryAlpha2CodeType locationCountryISO3166Alpha2Code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.iso3166.x20.CountryAlpha2CodeType target = null;
            target = (gov.niem.niem.iso3166.x20.CountryAlpha2CodeType)get_store().find_element_user(LOCATIONCOUNTRYISO3166ALPHA2CODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.iso3166.x20.CountryAlpha2CodeType)get_store().add_element_user(LOCATIONCOUNTRYISO3166ALPHA2CODE$0);
            }
            target.set(locationCountryISO3166Alpha2Code);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationCountryISO3166Alpha2Code" element
     */
    public gov.niem.niem.iso3166.x20.CountryAlpha2CodeType addNewLocationCountryISO3166Alpha2Code()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.iso3166.x20.CountryAlpha2CodeType target = null;
            target = (gov.niem.niem.iso3166.x20.CountryAlpha2CodeType)get_store().add_element_user(LOCATIONCOUNTRYISO3166ALPHA2CODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationCountryISO3166Alpha2Code" element
     */
    public void setNilLocationCountryISO3166Alpha2Code()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.iso3166.x20.CountryAlpha2CodeType target = null;
            target = (gov.niem.niem.iso3166.x20.CountryAlpha2CodeType)get_store().find_element_user(LOCATIONCOUNTRYISO3166ALPHA2CODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.iso3166.x20.CountryAlpha2CodeType)get_store().add_element_user(LOCATIONCOUNTRYISO3166ALPHA2CODE$0);
            }
            target.setNil();
        }
    }
}
