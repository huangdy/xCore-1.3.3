/*
 * An XML attribute type.
 * Localname: typeOfExemptedSource
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.TypeOfExemptedSourceAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2;


/**
 * A document containing one typeOfExemptedSource(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public interface TypeOfExemptedSourceAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeOfExemptedSourceAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("typeofexemptedsource677fattrtypetype");
    
    /**
     * Gets the "typeOfExemptedSource" attribute
     */
    java.util.List getTypeOfExemptedSource();
    
    /**
     * Gets (as xml) the "typeOfExemptedSource" attribute
     */
    usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource xgetTypeOfExemptedSource();
    
    /**
     * True if has "typeOfExemptedSource" attribute
     */
    boolean isSetTypeOfExemptedSource();
    
    /**
     * Sets the "typeOfExemptedSource" attribute
     */
    void setTypeOfExemptedSource(java.util.List typeOfExemptedSource);
    
    /**
     * Sets (as xml) the "typeOfExemptedSource" attribute
     */
    void xsetTypeOfExemptedSource(usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource typeOfExemptedSource);
    
    /**
     * Unsets the "typeOfExemptedSource" attribute
     */
    void unsetTypeOfExemptedSource();
    
    /**
     * An XML typeOfExemptedSource(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public interface TypeOfExemptedSource extends org.apache.xmlbeans.XmlNMTOKENS
    {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List list);
        /** @deprecated */
        java.util.List listValue();
        /** @deprecated */
        java.util.List xlistValue();
        /** @deprecated */
        void set(java.util.List list);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeOfExemptedSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("typeofexemptedsourced419attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource newValue(java.lang.Object obj) {
              return (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource) type.newValue( obj ); }
            
            public static usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource newInstance() {
              return (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute newInstance() {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static usGovIcIsmV2.TypeOfExemptedSourceAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (usGovIcIsmV2.TypeOfExemptedSourceAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
