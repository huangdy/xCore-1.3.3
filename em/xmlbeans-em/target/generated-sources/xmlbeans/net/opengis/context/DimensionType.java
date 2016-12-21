/*
 * XML Type:  DimensionType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.DimensionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context;


/**
 * An XML DimensionType(@http://www.opengis.net/context).
 *
 * This is an atomic type that is a restriction of net.opengis.context.DimensionType.
 */
public interface DimensionType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DimensionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("dimensiontypef376type");
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "units" attribute
     */
    java.lang.String getUnits();
    
    /**
     * Gets (as xml) the "units" attribute
     */
    org.apache.xmlbeans.XmlString xgetUnits();
    
    /**
     * Sets the "units" attribute
     */
    void setUnits(java.lang.String units);
    
    /**
     * Sets (as xml) the "units" attribute
     */
    void xsetUnits(org.apache.xmlbeans.XmlString units);
    
    /**
     * Gets the "unitSymbol" attribute
     */
    java.lang.String getUnitSymbol();
    
    /**
     * Gets (as xml) the "unitSymbol" attribute
     */
    org.apache.xmlbeans.XmlString xgetUnitSymbol();
    
    /**
     * Sets the "unitSymbol" attribute
     */
    void setUnitSymbol(java.lang.String unitSymbol);
    
    /**
     * Sets (as xml) the "unitSymbol" attribute
     */
    void xsetUnitSymbol(org.apache.xmlbeans.XmlString unitSymbol);
    
    /**
     * Gets the "userValue" attribute
     */
    java.lang.String getUserValue();
    
    /**
     * Gets (as xml) the "userValue" attribute
     */
    org.apache.xmlbeans.XmlString xgetUserValue();
    
    /**
     * Sets the "userValue" attribute
     */
    void setUserValue(java.lang.String userValue);
    
    /**
     * Sets (as xml) the "userValue" attribute
     */
    void xsetUserValue(org.apache.xmlbeans.XmlString userValue);
    
    /**
     * Gets the "default" attribute
     */
    java.lang.String getDefault();
    
    /**
     * Gets (as xml) the "default" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefault();
    
    /**
     * True if has "default" attribute
     */
    boolean isSetDefault();
    
    /**
     * Sets the "default" attribute
     */
    void setDefault(java.lang.String xdefault);
    
    /**
     * Sets (as xml) the "default" attribute
     */
    void xsetDefault(org.apache.xmlbeans.XmlString xdefault);
    
    /**
     * Unsets the "default" attribute
     */
    void unsetDefault();
    
    /**
     * Gets the "multipleValues" attribute
     */
    boolean getMultipleValues();
    
    /**
     * Gets (as xml) the "multipleValues" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMultipleValues();
    
    /**
     * True if has "multipleValues" attribute
     */
    boolean isSetMultipleValues();
    
    /**
     * Sets the "multipleValues" attribute
     */
    void setMultipleValues(boolean multipleValues);
    
    /**
     * Sets (as xml) the "multipleValues" attribute
     */
    void xsetMultipleValues(org.apache.xmlbeans.XmlBoolean multipleValues);
    
    /**
     * Unsets the "multipleValues" attribute
     */
    void unsetMultipleValues();
    
    /**
     * Gets the "nearestValue" attribute
     */
    boolean getNearestValue();
    
    /**
     * Gets (as xml) the "nearestValue" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetNearestValue();
    
    /**
     * True if has "nearestValue" attribute
     */
    boolean isSetNearestValue();
    
    /**
     * Sets the "nearestValue" attribute
     */
    void setNearestValue(boolean nearestValue);
    
    /**
     * Sets (as xml) the "nearestValue" attribute
     */
    void xsetNearestValue(org.apache.xmlbeans.XmlBoolean nearestValue);
    
    /**
     * Unsets the "nearestValue" attribute
     */
    void unsetNearestValue();
    
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
        public static net.opengis.context.DimensionType newInstance() {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.context.DimensionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.context.DimensionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.context.DimensionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.context.DimensionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.context.DimensionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.context.DimensionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.context.DimensionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.context.DimensionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.context.DimensionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.context.DimensionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.context.DimensionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.context.DimensionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.context.DimensionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.context.DimensionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.context.DimensionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.DimensionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.DimensionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.DimensionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
