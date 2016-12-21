/*
 * An XML document type.
 * Localname: IdentificationCategoryDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * A document containing one IdentificationCategoryDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public interface IdentificationCategoryDescriptionTextDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentificationCategoryDescriptionTextDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("identificationcategorydescriptiontext6398doctype");
    
    /**
     * Gets the "IdentificationCategoryDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType getIdentificationCategoryDescriptionText();
    
    /**
     * Tests for nil "IdentificationCategoryDescriptionText" element
     */
    boolean isNilIdentificationCategoryDescriptionText();
    
    /**
     * Sets the "IdentificationCategoryDescriptionText" element
     */
    void setIdentificationCategoryDescriptionText(gov.niem.niem.niemCore.x20.TextType identificationCategoryDescriptionText);
    
    /**
     * Appends and returns a new empty "IdentificationCategoryDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewIdentificationCategoryDescriptionText();
    
    /**
     * Nils the "IdentificationCategoryDescriptionText" element
     */
    void setNilIdentificationCategoryDescriptionText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument newInstance() {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.IdentificationCategoryDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}