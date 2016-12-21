/*
 * An XML document type.
 * Localname: LocationCounty
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationCountyDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationCounty(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationCountyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationCountyDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationCountyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCOUNTY$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCounty");
    private static final org.apache.xmlbeans.QNameSet LOCATIONCOUNTY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountyName"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCounty"),
    });
    
    
    /**
     * Gets the "LocationCounty" element
     */
    public org.apache.xmlbeans.XmlObject getLocationCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONCOUNTY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocationCounty" element
     */
    public void setLocationCounty(org.apache.xmlbeans.XmlObject locationCounty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONCOUNTY$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONCOUNTY$0);
            }
            target.set(locationCounty);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationCounty" element
     */
    public org.apache.xmlbeans.XmlObject addNewLocationCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONCOUNTY$0);
            return target;
        }
    }
}
