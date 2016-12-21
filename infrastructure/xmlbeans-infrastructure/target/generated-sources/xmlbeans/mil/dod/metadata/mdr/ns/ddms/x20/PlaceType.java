/*
 * XML Type:  PlaceType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.PlaceType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20;


/**
 * An XML PlaceType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public interface PlaceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlaceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("placetypedbd7type");
    
    /**
     * Gets array of all "geographicIdentifier" elements
     */
    mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier[] getGeographicIdentifierArray();
    
    /**
     * Gets ith "geographicIdentifier" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier getGeographicIdentifierArray(int i);
    
    /**
     * Returns number of "geographicIdentifier" element
     */
    int sizeOfGeographicIdentifierArray();
    
    /**
     * Sets array of all "geographicIdentifier" element
     */
    void setGeographicIdentifierArray(mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier[] geographicIdentifierArray);
    
    /**
     * Sets ith "geographicIdentifier" element
     */
    void setGeographicIdentifierArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier geographicIdentifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geographicIdentifier" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier insertNewGeographicIdentifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geographicIdentifier" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier addNewGeographicIdentifier();
    
    /**
     * Removes the ith "geographicIdentifier" element
     */
    void removeGeographicIdentifier(int i);
    
    /**
     * Gets array of all "boundingBox" elements
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType[] getBoundingBoxArray();
    
    /**
     * Gets ith "boundingBox" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType getBoundingBoxArray(int i);
    
    /**
     * Returns number of "boundingBox" element
     */
    int sizeOfBoundingBoxArray();
    
    /**
     * Sets array of all "boundingBox" element
     */
    void setBoundingBoxArray(mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType[] boundingBoxArray);
    
    /**
     * Sets ith "boundingBox" element
     */
    void setBoundingBoxArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType boundingBox);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boundingBox" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType insertNewBoundingBox(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boundingBox" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType addNewBoundingBox();
    
    /**
     * Removes the ith "boundingBox" element
     */
    void removeBoundingBox(int i);
    
    /**
     * Gets array of all "boundingGeometry" elements
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType[] getBoundingGeometryArray();
    
    /**
     * Gets ith "boundingGeometry" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType getBoundingGeometryArray(int i);
    
    /**
     * Returns number of "boundingGeometry" element
     */
    int sizeOfBoundingGeometryArray();
    
    /**
     * Sets array of all "boundingGeometry" element
     */
    void setBoundingGeometryArray(mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType[] boundingGeometryArray);
    
    /**
     * Sets ith "boundingGeometry" element
     */
    void setBoundingGeometryArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType boundingGeometry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boundingGeometry" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType insertNewBoundingGeometry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boundingGeometry" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType addNewBoundingGeometry();
    
    /**
     * Removes the ith "boundingGeometry" element
     */
    void removeBoundingGeometry(int i);
    
    /**
     * Gets array of all "postalAddress" elements
     */
    mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress[] getPostalAddressArray();
    
    /**
     * Gets ith "postalAddress" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress getPostalAddressArray(int i);
    
    /**
     * Returns number of "postalAddress" element
     */
    int sizeOfPostalAddressArray();
    
    /**
     * Sets array of all "postalAddress" element
     */
    void setPostalAddressArray(mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress[] postalAddressArray);
    
    /**
     * Sets ith "postalAddress" element
     */
    void setPostalAddressArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress postalAddress);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "postalAddress" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress insertNewPostalAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "postalAddress" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress addNewPostalAddress();
    
    /**
     * Removes the ith "postalAddress" element
     */
    void removePostalAddress(int i);
    
    /**
     * Gets array of all "verticalExtent" elements
     */
    mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType[] getVerticalExtentArray();
    
    /**
     * Gets ith "verticalExtent" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType getVerticalExtentArray(int i);
    
    /**
     * Returns number of "verticalExtent" element
     */
    int sizeOfVerticalExtentArray();
    
    /**
     * Sets array of all "verticalExtent" element
     */
    void setVerticalExtentArray(mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType[] verticalExtentArray);
    
    /**
     * Sets ith "verticalExtent" element
     */
    void setVerticalExtentArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType verticalExtent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verticalExtent" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType insertNewVerticalExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verticalExtent" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType addNewVerticalExtent();
    
    /**
     * Removes the ith "verticalExtent" element
     */
    void removeVerticalExtent(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType newInstance() {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.PlaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
