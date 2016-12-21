/*
 * An XML document type.
 * Localname: LocationCityName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationCityNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationCityName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationCityNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationCityNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationCityNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCITYNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCityName");
    
    
    /**
     * Gets the "LocationCityName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType getLocationCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONCITYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationCityName" element
     */
    public boolean isNilLocationCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONCITYNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationCityName" element
     */
    public void setLocationCityName(gov.niem.niem.niemCore.x20.ProperNameTextType locationCityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONCITYNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(LOCATIONCITYNAME$0);
            }
            target.set(locationCityName);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationCityName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType addNewLocationCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(LOCATIONCITYNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationCityName" element
     */
    public void setNilLocationCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONCITYNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(LOCATIONCITYNAME$0);
            }
            target.setNil();
        }
    }
}
