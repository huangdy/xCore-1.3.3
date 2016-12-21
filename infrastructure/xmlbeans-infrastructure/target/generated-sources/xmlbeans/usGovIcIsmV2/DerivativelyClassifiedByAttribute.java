/*
 * An XML attribute type.
 * Localname: derivativelyClassifiedBy
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.DerivativelyClassifiedByAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2;


/**
 * A document containing one derivativelyClassifiedBy(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public interface DerivativelyClassifiedByAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DerivativelyClassifiedByAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("derivativelyclassifiedby7bcbattrtypetype");
    
    /**
     * Gets the "derivativelyClassifiedBy" attribute
     */
    java.lang.String getDerivativelyClassifiedBy();
    
    /**
     * Gets (as xml) the "derivativelyClassifiedBy" attribute
     */
    usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy xgetDerivativelyClassifiedBy();
    
    /**
     * True if has "derivativelyClassifiedBy" attribute
     */
    boolean isSetDerivativelyClassifiedBy();
    
    /**
     * Sets the "derivativelyClassifiedBy" attribute
     */
    void setDerivativelyClassifiedBy(java.lang.String derivativelyClassifiedBy);
    
    /**
     * Sets (as xml) the "derivativelyClassifiedBy" attribute
     */
    void xsetDerivativelyClassifiedBy(usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy derivativelyClassifiedBy);
    
    /**
     * Unsets the "derivativelyClassifiedBy" attribute
     */
    void unsetDerivativelyClassifiedBy();
    
    /**
     * An XML derivativelyClassifiedBy(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of usGovIcIsmV2.DerivativelyClassifiedByAttribute$DerivativelyClassifiedBy.
     */
    public interface DerivativelyClassifiedBy extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DerivativelyClassifiedBy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("derivativelyclassifiedby0f19attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy newValue(java.lang.Object obj) {
              return (usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy) type.newValue( obj ); }
            
            public static usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy newInstance() {
              return (usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute newInstance() {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static usGovIcIsmV2.DerivativelyClassifiedByAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (usGovIcIsmV2.DerivativelyClassifiedByAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
