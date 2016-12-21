/*
 * XML Type:  LocationType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.LocationType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20;


/**
 * An XML LocationType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface LocationType extends gov.ucore.ucore.x20.ThingType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("locationtypec3b4type");
    
    /**
     * Gets array of all "CyberAddress" elements
     */
    gov.ucore.ucore.x20.CyberAddressType[] getCyberAddressArray();
    
    /**
     * Gets ith "CyberAddress" element
     */
    gov.ucore.ucore.x20.CyberAddressType getCyberAddressArray(int i);
    
    /**
     * Returns number of "CyberAddress" element
     */
    int sizeOfCyberAddressArray();
    
    /**
     * Sets array of all "CyberAddress" element
     */
    void setCyberAddressArray(gov.ucore.ucore.x20.CyberAddressType[] cyberAddressArray);
    
    /**
     * Sets ith "CyberAddress" element
     */
    void setCyberAddressArray(int i, gov.ucore.ucore.x20.CyberAddressType cyberAddress);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CyberAddress" element
     */
    gov.ucore.ucore.x20.CyberAddressType insertNewCyberAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CyberAddress" element
     */
    gov.ucore.ucore.x20.CyberAddressType addNewCyberAddress();
    
    /**
     * Removes the ith "CyberAddress" element
     */
    void removeCyberAddress(int i);
    
    /**
     * Gets array of all "GeoLocation" elements
     */
    gov.ucore.ucore.x20.GeoLocationType[] getGeoLocationArray();
    
    /**
     * Gets ith "GeoLocation" element
     */
    gov.ucore.ucore.x20.GeoLocationType getGeoLocationArray(int i);
    
    /**
     * Returns number of "GeoLocation" element
     */
    int sizeOfGeoLocationArray();
    
    /**
     * Sets array of all "GeoLocation" element
     */
    void setGeoLocationArray(gov.ucore.ucore.x20.GeoLocationType[] geoLocationArray);
    
    /**
     * Sets ith "GeoLocation" element
     */
    void setGeoLocationArray(int i, gov.ucore.ucore.x20.GeoLocationType geoLocation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoLocation" element
     */
    gov.ucore.ucore.x20.GeoLocationType insertNewGeoLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GeoLocation" element
     */
    gov.ucore.ucore.x20.GeoLocationType addNewGeoLocation();
    
    /**
     * Removes the ith "GeoLocation" element
     */
    void removeGeoLocation(int i);
    
    /**
     * Gets array of all "PhysicalAddress" elements
     */
    gov.ucore.ucore.x20.PhysicalAddressType[] getPhysicalAddressArray();
    
    /**
     * Gets ith "PhysicalAddress" element
     */
    gov.ucore.ucore.x20.PhysicalAddressType getPhysicalAddressArray(int i);
    
    /**
     * Returns number of "PhysicalAddress" element
     */
    int sizeOfPhysicalAddressArray();
    
    /**
     * Sets array of all "PhysicalAddress" element
     */
    void setPhysicalAddressArray(gov.ucore.ucore.x20.PhysicalAddressType[] physicalAddressArray);
    
    /**
     * Sets ith "PhysicalAddress" element
     */
    void setPhysicalAddressArray(int i, gov.ucore.ucore.x20.PhysicalAddressType physicalAddress);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalAddress" element
     */
    gov.ucore.ucore.x20.PhysicalAddressType insertNewPhysicalAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalAddress" element
     */
    gov.ucore.ucore.x20.PhysicalAddressType addNewPhysicalAddress();
    
    /**
     * Removes the ith "PhysicalAddress" element
     */
    void removePhysicalAddress(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore.x20.LocationType newInstance() {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore.x20.LocationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore.x20.LocationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore.x20.LocationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore.x20.LocationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.LocationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.LocationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.LocationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
