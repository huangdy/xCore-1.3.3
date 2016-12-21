/*
 * An XML document type.
 * Localname: WorkProductProperties
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures;


/**
 * A document containing one WorkProductProperties(@http://www.saic.com/precis/2009/06/structures) element.
 *
 * This is a complex type.
 */
public interface WorkProductPropertiesDocument extends x0.messageStructure1.PackageMetadataExtensionAbstractDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkProductPropertiesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("workproductproperties0193doctype");
    
    /**
     * Gets the "WorkProductProperties" element
     */
    com.saic.precis.x2009.x06.base.PropertiesType getWorkProductProperties();
    
    /**
     * Sets the "WorkProductProperties" element
     */
    void setWorkProductProperties(com.saic.precis.x2009.x06.base.PropertiesType workProductProperties);
    
    /**
     * Appends and returns a new empty "WorkProductProperties" element
     */
    com.saic.precis.x2009.x06.base.PropertiesType addNewWorkProductProperties();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument newInstance() {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.structures.WorkProductPropertiesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
