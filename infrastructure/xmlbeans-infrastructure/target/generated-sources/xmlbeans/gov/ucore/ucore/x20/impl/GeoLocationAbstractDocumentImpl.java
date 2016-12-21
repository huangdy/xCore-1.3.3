/*
 * An XML document type.
 * Localname: GeoLocationAbstract
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.GeoLocationAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one GeoLocationAbstract(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class GeoLocationAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.GeoLocationAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeoLocationAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOLOCATIONABSTRACT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GeoLocationAbstract");
    private static final org.apache.xmlbeans.QNameSet GEOLOCATIONABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Envelope"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Polygon"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GeoLocationAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Point"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LineString"),
    });
    
    
    /**
     * Gets the "GeoLocationAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getGeoLocationAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(GEOLOCATIONABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeoLocationAbstract" element
     */
    public void setGeoLocationAbstract(org.apache.xmlbeans.XmlObject geoLocationAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(GEOLOCATIONABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(GEOLOCATIONABSTRACT$0);
            }
            target.set(geoLocationAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "GeoLocationAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewGeoLocationAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(GEOLOCATIONABSTRACT$0);
            return target;
        }
    }
}
