/*
 * XML Type:  LayerType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.LayerType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context;


/**
 * An XML LayerType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public interface LayerType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LayerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("layertyped82btype");
    
    /**
     * Gets the "Server" element
     */
    net.opengis.context.ServerType getServer();
    
    /**
     * Sets the "Server" element
     */
    void setServer(net.opengis.context.ServerType server);
    
    /**
     * Appends and returns a new empty "Server" element
     */
    net.opengis.context.ServerType addNewServer();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "Title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "Title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * Sets the "Title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "Title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
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
     * Gets the "DataURL" element
     */
    net.opengis.context.URLType getDataURL();
    
    /**
     * True if has "DataURL" element
     */
    boolean isSetDataURL();
    
    /**
     * Sets the "DataURL" element
     */
    void setDataURL(net.opengis.context.URLType dataURL);
    
    /**
     * Appends and returns a new empty "DataURL" element
     */
    net.opengis.context.URLType addNewDataURL();
    
    /**
     * Unsets the "DataURL" element
     */
    void unsetDataURL();
    
    /**
     * Gets the "MetadataURL" element
     */
    net.opengis.context.URLType getMetadataURL();
    
    /**
     * True if has "MetadataURL" element
     */
    boolean isSetMetadataURL();
    
    /**
     * Sets the "MetadataURL" element
     */
    void setMetadataURL(net.opengis.context.URLType metadataURL);
    
    /**
     * Appends and returns a new empty "MetadataURL" element
     */
    net.opengis.context.URLType addNewMetadataURL();
    
    /**
     * Unsets the "MetadataURL" element
     */
    void unsetMetadataURL();
    
    /**
     * Gets array of all "SRS" elements
     */
    java.lang.String[] getSRSArray();
    
    /**
     * Gets ith "SRS" element
     */
    java.lang.String getSRSArray(int i);
    
    /**
     * Gets (as xml) array of all "SRS" elements
     */
    org.apache.xmlbeans.XmlString[] xgetSRSArray();
    
    /**
     * Gets (as xml) ith "SRS" element
     */
    org.apache.xmlbeans.XmlString xgetSRSArray(int i);
    
    /**
     * Returns number of "SRS" element
     */
    int sizeOfSRSArray();
    
    /**
     * Sets array of all "SRS" element
     */
    void setSRSArray(java.lang.String[] srsArray);
    
    /**
     * Sets ith "SRS" element
     */
    void setSRSArray(int i, java.lang.String srs);
    
    /**
     * Sets (as xml) array of all "SRS" element
     */
    void xsetSRSArray(org.apache.xmlbeans.XmlString[] srsArray);
    
    /**
     * Sets (as xml) ith "SRS" element
     */
    void xsetSRSArray(int i, org.apache.xmlbeans.XmlString srs);
    
    /**
     * Inserts the value as the ith "SRS" element
     */
    void insertSRS(int i, java.lang.String srs);
    
    /**
     * Appends the value as the last "SRS" element
     */
    void addSRS(java.lang.String srs);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SRS" element
     */
    org.apache.xmlbeans.XmlString insertNewSRS(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SRS" element
     */
    org.apache.xmlbeans.XmlString addNewSRS();
    
    /**
     * Removes the ith "SRS" element
     */
    void removeSRS(int i);
    
    /**
     * Gets the "FormatList" element
     */
    net.opengis.context.FormatListType getFormatList();
    
    /**
     * True if has "FormatList" element
     */
    boolean isSetFormatList();
    
    /**
     * Sets the "FormatList" element
     */
    void setFormatList(net.opengis.context.FormatListType formatList);
    
    /**
     * Appends and returns a new empty "FormatList" element
     */
    net.opengis.context.FormatListType addNewFormatList();
    
    /**
     * Unsets the "FormatList" element
     */
    void unsetFormatList();
    
    /**
     * Gets the "StyleList" element
     */
    net.opengis.context.StyleListType getStyleList();
    
    /**
     * True if has "StyleList" element
     */
    boolean isSetStyleList();
    
    /**
     * Sets the "StyleList" element
     */
    void setStyleList(net.opengis.context.StyleListType styleList);
    
    /**
     * Appends and returns a new empty "StyleList" element
     */
    net.opengis.context.StyleListType addNewStyleList();
    
    /**
     * Unsets the "StyleList" element
     */
    void unsetStyleList();
    
    /**
     * Gets the "DimensionList" element
     */
    net.opengis.context.DimensionListType getDimensionList();
    
    /**
     * True if has "DimensionList" element
     */
    boolean isSetDimensionList();
    
    /**
     * Sets the "DimensionList" element
     */
    void setDimensionList(net.opengis.context.DimensionListType dimensionList);
    
    /**
     * Appends and returns a new empty "DimensionList" element
     */
    net.opengis.context.DimensionListType addNewDimensionList();
    
    /**
     * Unsets the "DimensionList" element
     */
    void unsetDimensionList();
    
    /**
     * Gets the "Extension" element
     */
    net.opengis.context.ExtensionType getExtension();
    
    /**
     * True if has "Extension" element
     */
    boolean isSetExtension();
    
    /**
     * Sets the "Extension" element
     */
    void setExtension(net.opengis.context.ExtensionType extension);
    
    /**
     * Appends and returns a new empty "Extension" element
     */
    net.opengis.context.ExtensionType addNewExtension();
    
    /**
     * Unsets the "Extension" element
     */
    void unsetExtension();
    
    /**
     * Gets the "queryable" attribute
     */
    boolean getQueryable();
    
    /**
     * Gets (as xml) the "queryable" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetQueryable();
    
    /**
     * Sets the "queryable" attribute
     */
    void setQueryable(boolean queryable);
    
    /**
     * Sets (as xml) the "queryable" attribute
     */
    void xsetQueryable(org.apache.xmlbeans.XmlBoolean queryable);
    
    /**
     * Gets the "hidden" attribute
     */
    boolean getHidden();
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHidden();
    
    /**
     * Sets the "hidden" attribute
     */
    void setHidden(boolean hidden);
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.context.LayerType newInstance() {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.context.LayerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.context.LayerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.context.LayerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.context.LayerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.context.LayerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.context.LayerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.context.LayerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.context.LayerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.context.LayerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.context.LayerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.context.LayerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.context.LayerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.context.LayerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.context.LayerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.context.LayerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.LayerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.LayerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.LayerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
