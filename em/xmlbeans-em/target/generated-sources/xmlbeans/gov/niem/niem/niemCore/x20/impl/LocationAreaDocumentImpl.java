/*
 * An XML document type.
 * Localname: LocationArea
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationAreaDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationArea(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationAreaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationAreaDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationAreaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONAREA$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationArea");
    
    
    /**
     * Gets the "LocationArea" element
     */
    public gov.niem.niem.niemCore.x20.AreaType getLocationArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().find_element_user(LOCATIONAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationArea" element
     */
    public boolean isNilLocationArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().find_element_user(LOCATIONAREA$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationArea" element
     */
    public void setLocationArea(gov.niem.niem.niemCore.x20.AreaType locationArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().find_element_user(LOCATIONAREA$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AreaType)get_store().add_element_user(LOCATIONAREA$0);
            }
            target.set(locationArea);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationArea" element
     */
    public gov.niem.niem.niemCore.x20.AreaType addNewLocationArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().add_element_user(LOCATIONAREA$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationArea" element
     */
    public void setNilLocationArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().find_element_user(LOCATIONAREA$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AreaType)get_store().add_element_user(LOCATIONAREA$0);
            }
            target.setNil();
        }
    }
}
