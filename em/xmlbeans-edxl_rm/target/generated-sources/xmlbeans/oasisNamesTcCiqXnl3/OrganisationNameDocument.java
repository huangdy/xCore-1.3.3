/*
 * An XML document type.
 * Localname: OrganisationName
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.OrganisationNameDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3;


/**
 * A document containing one OrganisationName(@urn:oasis:names:tc:ciq:xnl:3) element.
 *
 * This is a complex type.
 */
public interface OrganisationNameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationNameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("organisationnamec601doctype");
    
    /**
     * Gets the "OrganisationName" element
     */
    oasisNamesTcCiqXnl3.OrganisationNameType getOrganisationName();
    
    /**
     * Sets the "OrganisationName" element
     */
    void setOrganisationName(oasisNamesTcCiqXnl3.OrganisationNameType organisationName);
    
    /**
     * Appends and returns a new empty "OrganisationName" element
     */
    oasisNamesTcCiqXnl3.OrganisationNameType addNewOrganisationName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument newInstance() {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.OrganisationNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.OrganisationNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
