/*
 * XML Type:  CodespaceValueType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.CodespaceValueType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base;


/**
 * An XML CodespaceValueType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is an atomic type that is a restriction of com.saic.precis.x2009.x06.base.CodespaceValueType.
 */
public interface CodespaceValueType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodespaceValueType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("codespacevaluetypeac27type");
    
    /**
     * Gets the "label" attribute
     */
    java.lang.String getLabel();
    
    /**
     * Gets (as xml) the "label" attribute
     */
    org.apache.xmlbeans.XmlString xgetLabel();
    
    /**
     * True if has "label" attribute
     */
    boolean isSetLabel();
    
    /**
     * Sets the "label" attribute
     */
    void setLabel(java.lang.String label);
    
    /**
     * Sets (as xml) the "label" attribute
     */
    void xsetLabel(org.apache.xmlbeans.XmlString label);
    
    /**
     * Unsets the "label" attribute
     */
    void unsetLabel();
    
    /**
     * Gets the "codespace" attribute
     */
    java.lang.String getCodespace();
    
    /**
     * Gets (as xml) the "codespace" attribute
     */
    org.apache.xmlbeans.XmlString xgetCodespace();
    
    /**
     * True if has "codespace" attribute
     */
    boolean isSetCodespace();
    
    /**
     * Sets the "codespace" attribute
     */
    void setCodespace(java.lang.String codespace);
    
    /**
     * Sets (as xml) the "codespace" attribute
     */
    void xsetCodespace(org.apache.xmlbeans.XmlString codespace);
    
    /**
     * Unsets the "codespace" attribute
     */
    void unsetCodespace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.precis.x2009.x06.base.CodespaceValueType newInstance() {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.base.CodespaceValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.base.CodespaceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
