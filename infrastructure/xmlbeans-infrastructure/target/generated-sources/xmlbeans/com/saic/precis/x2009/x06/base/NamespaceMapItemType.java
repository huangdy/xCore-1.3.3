/*
 * XML Type:  NamespaceMapItemType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.NamespaceMapItemType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base;


/**
 * An XML NamespaceMapItemType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is a complex type.
 */
public interface NamespaceMapItemType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NamespaceMapItemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("namespacemapitemtypec2e3type");
    
    /**
     * Gets the "Prefix" element
     */
    java.lang.String getPrefix();
    
    /**
     * Gets (as xml) the "Prefix" element
     */
    org.apache.xmlbeans.XmlString xgetPrefix();
    
    /**
     * Sets the "Prefix" element
     */
    void setPrefix(java.lang.String prefix);
    
    /**
     * Sets (as xml) the "Prefix" element
     */
    void xsetPrefix(org.apache.xmlbeans.XmlString prefix);
    
    /**
     * Gets the "URI" element
     */
    java.lang.String getURI();
    
    /**
     * Gets (as xml) the "URI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetURI();
    
    /**
     * Sets the "URI" element
     */
    void setURI(java.lang.String uri);
    
    /**
     * Sets (as xml) the "URI" element
     */
    void xsetURI(org.apache.xmlbeans.XmlAnyURI uri);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType newInstance() {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.base.NamespaceMapItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.base.NamespaceMapItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
