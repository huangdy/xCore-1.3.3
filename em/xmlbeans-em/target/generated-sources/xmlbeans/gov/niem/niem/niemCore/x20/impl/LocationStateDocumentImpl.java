/*
 * An XML document type.
 * Localname: LocationState
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationStateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationState(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationStateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationStateDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationStateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONSTATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationState");
    private static final org.apache.xmlbeans.QNameSet LOCATIONSTATE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationStateUSPostalServiceCode"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationState"),
    });
    
    
    /**
     * Gets the "LocationState" element
     */
    public org.apache.xmlbeans.XmlObject getLocationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONSTATE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocationState" element
     */
    public void setLocationState(org.apache.xmlbeans.XmlObject locationState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONSTATE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONSTATE$0);
            }
            target.set(locationState);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationState" element
     */
    public org.apache.xmlbeans.XmlObject addNewLocationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONSTATE$0);
            return target;
        }
    }
}
