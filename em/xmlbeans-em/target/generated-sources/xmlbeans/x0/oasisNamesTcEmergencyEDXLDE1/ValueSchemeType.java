/*
 * XML Type:  valueSchemeType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1;


/**
 * An XML valueSchemeType(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
 *
 * This is a complex type.
 */
public interface ValueSchemeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValueSchemeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("valueschemetype6850type");
    
    /**
     * Gets the "explicitAddressScheme" element
     */
    java.lang.String getExplicitAddressScheme();
    
    /**
     * Gets (as xml) the "explicitAddressScheme" element
     */
    org.apache.xmlbeans.XmlString xgetExplicitAddressScheme();
    
    /**
     * Sets the "explicitAddressScheme" element
     */
    void setExplicitAddressScheme(java.lang.String explicitAddressScheme);
    
    /**
     * Sets (as xml) the "explicitAddressScheme" element
     */
    void xsetExplicitAddressScheme(org.apache.xmlbeans.XmlString explicitAddressScheme);
    
    /**
     * Gets array of all "explicitAddressValue" elements
     */
    java.lang.String[] getExplicitAddressValueArray();
    
    /**
     * Gets ith "explicitAddressValue" element
     */
    java.lang.String getExplicitAddressValueArray(int i);
    
    /**
     * Gets (as xml) array of all "explicitAddressValue" elements
     */
    org.apache.xmlbeans.XmlString[] xgetExplicitAddressValueArray();
    
    /**
     * Gets (as xml) ith "explicitAddressValue" element
     */
    org.apache.xmlbeans.XmlString xgetExplicitAddressValueArray(int i);
    
    /**
     * Returns number of "explicitAddressValue" element
     */
    int sizeOfExplicitAddressValueArray();
    
    /**
     * Sets array of all "explicitAddressValue" element
     */
    void setExplicitAddressValueArray(java.lang.String[] explicitAddressValueArray);
    
    /**
     * Sets ith "explicitAddressValue" element
     */
    void setExplicitAddressValueArray(int i, java.lang.String explicitAddressValue);
    
    /**
     * Sets (as xml) array of all "explicitAddressValue" element
     */
    void xsetExplicitAddressValueArray(org.apache.xmlbeans.XmlString[] explicitAddressValueArray);
    
    /**
     * Sets (as xml) ith "explicitAddressValue" element
     */
    void xsetExplicitAddressValueArray(int i, org.apache.xmlbeans.XmlString explicitAddressValue);
    
    /**
     * Inserts the value as the ith "explicitAddressValue" element
     */
    void insertExplicitAddressValue(int i, java.lang.String explicitAddressValue);
    
    /**
     * Appends the value as the last "explicitAddressValue" element
     */
    void addExplicitAddressValue(java.lang.String explicitAddressValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "explicitAddressValue" element
     */
    org.apache.xmlbeans.XmlString insertNewExplicitAddressValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "explicitAddressValue" element
     */
    org.apache.xmlbeans.XmlString addNewExplicitAddressValue();
    
    /**
     * Removes the ith "explicitAddressValue" element
     */
    void removeExplicitAddressValue(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
