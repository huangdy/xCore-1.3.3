/*
 * An XML attribute type.
 * Localname: classification
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.ClassificationAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2;


/**
 * A document containing one classification(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public interface ClassificationAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClassificationAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("classification3063attrtypetype");
    
    /**
     * Gets the "classification" attribute
     */
    usGovIcIsmV2.ClassificationType.Enum getClassification();
    
    /**
     * Gets (as xml) the "classification" attribute
     */
    usGovIcIsmV2.ClassificationType xgetClassification();
    
    /**
     * True if has "classification" attribute
     */
    boolean isSetClassification();
    
    /**
     * Sets the "classification" attribute
     */
    void setClassification(usGovIcIsmV2.ClassificationType.Enum classification);
    
    /**
     * Sets (as xml) the "classification" attribute
     */
    void xsetClassification(usGovIcIsmV2.ClassificationType classification);
    
    /**
     * Unsets the "classification" attribute
     */
    void unsetClassification();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static usGovIcIsmV2.ClassificationAttribute newInstance() {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static usGovIcIsmV2.ClassificationAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static usGovIcIsmV2.ClassificationAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static usGovIcIsmV2.ClassificationAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static usGovIcIsmV2.ClassificationAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static usGovIcIsmV2.ClassificationAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static usGovIcIsmV2.ClassificationAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (usGovIcIsmV2.ClassificationAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
