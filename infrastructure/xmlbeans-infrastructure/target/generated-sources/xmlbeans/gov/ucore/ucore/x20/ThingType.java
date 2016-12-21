/*
 * XML Type:  ThingType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.ThingType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20;


/**
 * An XML ThingType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface ThingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ThingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("thingtype9c0dtype");
    
    /**
     * Gets the "Metadata" element
     */
    gov.ucore.ucore.x20.ContentMetadataType getMetadata();
    
    /**
     * True if has "Metadata" element
     */
    boolean isSetMetadata();
    
    /**
     * Sets the "Metadata" element
     */
    void setMetadata(gov.ucore.ucore.x20.ContentMetadataType metadata);
    
    /**
     * Appends and returns a new empty "Metadata" element
     */
    gov.ucore.ucore.x20.ContentMetadataType addNewMetadata();
    
    /**
     * Unsets the "Metadata" element
     */
    void unsetMetadata();
    
    /**
     * Gets the "Descriptor" element
     */
    gov.ucore.ucore.x20.StringType getDescriptor();
    
    /**
     * True if has "Descriptor" element
     */
    boolean isSetDescriptor();
    
    /**
     * Sets the "Descriptor" element
     */
    void setDescriptor(gov.ucore.ucore.x20.StringType descriptor);
    
    /**
     * Appends and returns a new empty "Descriptor" element
     */
    gov.ucore.ucore.x20.StringType addNewDescriptor();
    
    /**
     * Unsets the "Descriptor" element
     */
    void unsetDescriptor();
    
    /**
     * Gets array of all "Identifier" elements
     */
    gov.ucore.ucore.x20.IdentifierType[] getIdentifierArray();
    
    /**
     * Gets ith "Identifier" element
     */
    gov.ucore.ucore.x20.IdentifierType getIdentifierArray(int i);
    
    /**
     * Returns number of "Identifier" element
     */
    int sizeOfIdentifierArray();
    
    /**
     * Sets array of all "Identifier" element
     */
    void setIdentifierArray(gov.ucore.ucore.x20.IdentifierType[] identifierArray);
    
    /**
     * Sets ith "Identifier" element
     */
    void setIdentifierArray(int i, gov.ucore.ucore.x20.IdentifierType identifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
     */
    gov.ucore.ucore.x20.IdentifierType insertNewIdentifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Identifier" element
     */
    gov.ucore.ucore.x20.IdentifierType addNewIdentifier();
    
    /**
     * Removes the ith "Identifier" element
     */
    void removeIdentifier(int i);
    
    /**
     * Gets array of all "SimpleProperty" elements
     */
    gov.ucore.ucore.x20.SimplePropertyType[] getSimplePropertyArray();
    
    /**
     * Gets ith "SimpleProperty" element
     */
    gov.ucore.ucore.x20.SimplePropertyType getSimplePropertyArray(int i);
    
    /**
     * Returns number of "SimpleProperty" element
     */
    int sizeOfSimplePropertyArray();
    
    /**
     * Sets array of all "SimpleProperty" element
     */
    void setSimplePropertyArray(gov.ucore.ucore.x20.SimplePropertyType[] simplePropertyArray);
    
    /**
     * Sets ith "SimpleProperty" element
     */
    void setSimplePropertyArray(int i, gov.ucore.ucore.x20.SimplePropertyType simpleProperty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SimpleProperty" element
     */
    gov.ucore.ucore.x20.SimplePropertyType insertNewSimpleProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SimpleProperty" element
     */
    gov.ucore.ucore.x20.SimplePropertyType addNewSimpleProperty();
    
    /**
     * Removes the ith "SimpleProperty" element
     */
    void removeSimpleProperty(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore.x20.ThingType newInstance() {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore.x20.ThingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore.x20.ThingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore.x20.ThingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore.x20.ThingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.ThingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.ThingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.ThingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
