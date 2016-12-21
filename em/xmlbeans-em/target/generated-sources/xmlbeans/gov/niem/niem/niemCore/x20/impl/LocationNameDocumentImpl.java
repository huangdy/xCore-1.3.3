/*
 * An XML document type.
 * Localname: LocationName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationName");
    
    
    /**
     * Gets the "LocationName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType getLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationName" element
     */
    public boolean isNilLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationName" element
     */
    public void setLocationName(gov.niem.niem.niemCore.x20.ProperNameTextType locationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(LOCATIONNAME$0);
            }
            target.set(locationName);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType addNewLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(LOCATIONNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationName" element
     */
    public void setNilLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(LOCATIONNAME$0);
            }
            target.setNil();
        }
    }
}
