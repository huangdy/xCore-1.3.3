/*
 * XML Type:  ValueListType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.ValueListType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1;


/**
 * An XML ValueListType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public interface ValueListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValueListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("valuelisttypedcd1type");
    
    /**
     * Gets the "ValueListURN" element
     */
    java.lang.String getValueListURN();
    
    /**
     * Gets (as xml) the "ValueListURN" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType xgetValueListURN();
    
    /**
     * Sets the "ValueListURN" element
     */
    void setValueListURN(java.lang.String valueListURN);
    
    /**
     * Sets (as xml) the "ValueListURN" element
     */
    void xsetValueListURN(x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType valueListURN);
    
    /**
     * Gets array of all "Value" elements
     */
    java.lang.String[] getValueArray();
    
    /**
     * Gets ith "Value" element
     */
    java.lang.String getValueArray(int i);
    
    /**
     * Gets (as xml) array of all "Value" elements
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueType[] xgetValueArray();
    
    /**
     * Gets (as xml) ith "Value" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueType xgetValueArray(int i);
    
    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();
    
    /**
     * Sets array of all "Value" element
     */
    void setValueArray(java.lang.String[] valueArray);
    
    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, java.lang.String value);
    
    /**
     * Sets (as xml) array of all "Value" element
     */
    void xsetValueArray(x0.oasisNamesTcEmergencyEDXLRM1.ValueType[] valueArray);
    
    /**
     * Sets (as xml) ith "Value" element
     */
    void xsetValueArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.ValueType value);
    
    /**
     * Inserts the value as the ith "Value" element
     */
    void insertValue(int i, java.lang.String value);
    
    /**
     * Appends the value as the last "Value" element
     */
    void addValue(java.lang.String value);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueType insertNewValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueType addNewValue();
    
    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ValueListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
