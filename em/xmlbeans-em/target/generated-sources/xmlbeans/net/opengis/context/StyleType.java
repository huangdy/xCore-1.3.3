/*
 * XML Type:  StyleType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.StyleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context;


/**
 * An XML StyleType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public interface StyleType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StyleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("styletypeb3cbtype");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "Title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "Title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "Title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "Title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "Title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "Abstract" element
     */
    java.lang.String getAbstract();
    
    /**
     * Gets (as xml) the "Abstract" element
     */
    org.apache.xmlbeans.XmlString xgetAbstract();
    
    /**
     * True if has "Abstract" element
     */
    boolean isSetAbstract();
    
    /**
     * Sets the "Abstract" element
     */
    void setAbstract(java.lang.String xabstract);
    
    /**
     * Sets (as xml) the "Abstract" element
     */
    void xsetAbstract(org.apache.xmlbeans.XmlString xabstract);
    
    /**
     * Unsets the "Abstract" element
     */
    void unsetAbstract();
    
    /**
     * Gets the "LegendURL" element
     */
    net.opengis.context.URLType getLegendURL();
    
    /**
     * True if has "LegendURL" element
     */
    boolean isSetLegendURL();
    
    /**
     * Sets the "LegendURL" element
     */
    void setLegendURL(net.opengis.context.URLType legendURL);
    
    /**
     * Appends and returns a new empty "LegendURL" element
     */
    net.opengis.context.URLType addNewLegendURL();
    
    /**
     * Unsets the "LegendURL" element
     */
    void unsetLegendURL();
    
    /**
     * Gets the "SLD" element
     */
    net.opengis.context.SLDType getSLD();
    
    /**
     * True if has "SLD" element
     */
    boolean isSetSLD();
    
    /**
     * Sets the "SLD" element
     */
    void setSLD(net.opengis.context.SLDType sld);
    
    /**
     * Appends and returns a new empty "SLD" element
     */
    net.opengis.context.SLDType addNewSLD();
    
    /**
     * Unsets the "SLD" element
     */
    void unsetSLD();
    
    /**
     * Gets the "current" attribute
     */
    boolean getCurrent();
    
    /**
     * Gets (as xml) the "current" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCurrent();
    
    /**
     * True if has "current" attribute
     */
    boolean isSetCurrent();
    
    /**
     * Sets the "current" attribute
     */
    void setCurrent(boolean current);
    
    /**
     * Sets (as xml) the "current" attribute
     */
    void xsetCurrent(org.apache.xmlbeans.XmlBoolean current);
    
    /**
     * Unsets the "current" attribute
     */
    void unsetCurrent();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.context.StyleType newInstance() {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.context.StyleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.context.StyleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.context.StyleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.context.StyleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.context.StyleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.context.StyleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.context.StyleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.context.StyleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.context.StyleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.context.StyleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.context.StyleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.context.StyleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.context.StyleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.context.StyleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.context.StyleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.StyleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.StyleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.StyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
