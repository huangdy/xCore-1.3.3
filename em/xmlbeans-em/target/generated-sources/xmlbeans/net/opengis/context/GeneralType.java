/*
 * XML Type:  GeneralType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.GeneralType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context;


/**
 * An XML GeneralType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public interface GeneralType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeneralType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("generaltypec6f4type");
    
    /**
     * Gets the "Window" element
     */
    net.opengis.context.WindowType getWindow();
    
    /**
     * True if has "Window" element
     */
    boolean isSetWindow();
    
    /**
     * Sets the "Window" element
     */
    void setWindow(net.opengis.context.WindowType window);
    
    /**
     * Appends and returns a new empty "Window" element
     */
    net.opengis.context.WindowType addNewWindow();
    
    /**
     * Unsets the "Window" element
     */
    void unsetWindow();
    
    /**
     * Gets the "BoundingBox" element
     */
    net.opengis.context.BoundingBoxType getBoundingBox();
    
    /**
     * Sets the "BoundingBox" element
     */
    void setBoundingBox(net.opengis.context.BoundingBoxType boundingBox);
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    net.opengis.context.BoundingBoxType addNewBoundingBox();
    
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
     * Gets the "KeywordList" element
     */
    net.opengis.context.KeywordListType getKeywordList();
    
    /**
     * True if has "KeywordList" element
     */
    boolean isSetKeywordList();
    
    /**
     * Sets the "KeywordList" element
     */
    void setKeywordList(net.opengis.context.KeywordListType keywordList);
    
    /**
     * Appends and returns a new empty "KeywordList" element
     */
    net.opengis.context.KeywordListType addNewKeywordList();
    
    /**
     * Unsets the "KeywordList" element
     */
    void unsetKeywordList();
    
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
     * Gets the "LogoURL" element
     */
    net.opengis.context.URLType getLogoURL();
    
    /**
     * True if has "LogoURL" element
     */
    boolean isSetLogoURL();
    
    /**
     * Sets the "LogoURL" element
     */
    void setLogoURL(net.opengis.context.URLType logoURL);
    
    /**
     * Appends and returns a new empty "LogoURL" element
     */
    net.opengis.context.URLType addNewLogoURL();
    
    /**
     * Unsets the "LogoURL" element
     */
    void unsetLogoURL();
    
    /**
     * Gets the "DescriptionURL" element
     */
    net.opengis.context.URLType getDescriptionURL();
    
    /**
     * True if has "DescriptionURL" element
     */
    boolean isSetDescriptionURL();
    
    /**
     * Sets the "DescriptionURL" element
     */
    void setDescriptionURL(net.opengis.context.URLType descriptionURL);
    
    /**
     * Appends and returns a new empty "DescriptionURL" element
     */
    net.opengis.context.URLType addNewDescriptionURL();
    
    /**
     * Unsets the "DescriptionURL" element
     */
    void unsetDescriptionURL();
    
    /**
     * Gets the "ContactInformation" element
     */
    net.opengis.context.ContactInformationType getContactInformation();
    
    /**
     * True if has "ContactInformation" element
     */
    boolean isSetContactInformation();
    
    /**
     * Sets the "ContactInformation" element
     */
    void setContactInformation(net.opengis.context.ContactInformationType contactInformation);
    
    /**
     * Appends and returns a new empty "ContactInformation" element
     */
    net.opengis.context.ContactInformationType addNewContactInformation();
    
    /**
     * Unsets the "ContactInformation" element
     */
    void unsetContactInformation();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.context.GeneralType newInstance() {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.context.GeneralType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.context.GeneralType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.context.GeneralType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.context.GeneralType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.context.GeneralType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.context.GeneralType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.context.GeneralType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.context.GeneralType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.context.GeneralType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.context.GeneralType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.context.GeneralType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.context.GeneralType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.context.GeneralType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.context.GeneralType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.context.GeneralType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.GeneralType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.GeneralType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.GeneralType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
