/*
 * XML Type:  LengthCodeType
 * Namespace: http://niem.gov/niem/unece_rec20-misc/2.0
 * Java type: gov.niem.niem.uneceRec20Misc.x20.LengthCodeType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.uneceRec20Misc.x20;


/**
 * An XML LengthCodeType(@http://niem.gov/niem/unece_rec20-misc/2.0).
 *
 * This is an atomic type that is a restriction of gov.niem.niem.uneceRec20Misc.x20.LengthCodeType.
 */
public interface LengthCodeType extends gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LengthCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("lengthcodetypee409type");
    
    static final gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.Enum KMT = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.KMT;
    static final gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.Enum FOT = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.FOT;
    static final gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.Enum YRD = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.YRD;
    static final gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.Enum SMI = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.SMI;
    static final gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.Enum MTR = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.MTR;
    static final gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.Enum NMI = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.NMI;
    
    static final int INT_KMT = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.INT_KMT;
    static final int INT_FOT = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.INT_FOT;
    static final int INT_YRD = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.INT_YRD;
    static final int INT_SMI = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.INT_SMI;
    static final int INT_MTR = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.INT_MTR;
    static final int INT_NMI = gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.INT_NMI;
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "metadata" attribute
     */
    java.util.List getMetadata();
    
    /**
     * Gets (as xml) the "metadata" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetMetadata();
    
    /**
     * True if has "metadata" attribute
     */
    boolean isSetMetadata();
    
    /**
     * Sets the "metadata" attribute
     */
    void setMetadata(java.util.List metadata);
    
    /**
     * Sets (as xml) the "metadata" attribute
     */
    void xsetMetadata(org.apache.xmlbeans.XmlIDREFS metadata);
    
    /**
     * Unsets the "metadata" attribute
     */
    void unsetMetadata();
    
    /**
     * Gets the "linkMetadata" attribute
     */
    java.util.List getLinkMetadata();
    
    /**
     * Gets (as xml) the "linkMetadata" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetLinkMetadata();
    
    /**
     * True if has "linkMetadata" attribute
     */
    boolean isSetLinkMetadata();
    
    /**
     * Sets the "linkMetadata" attribute
     */
    void setLinkMetadata(java.util.List linkMetadata);
    
    /**
     * Sets (as xml) the "linkMetadata" attribute
     */
    void xsetLinkMetadata(org.apache.xmlbeans.XmlIDREFS linkMetadata);
    
    /**
     * Unsets the "linkMetadata" attribute
     */
    void unsetLinkMetadata();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType newInstance() {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
