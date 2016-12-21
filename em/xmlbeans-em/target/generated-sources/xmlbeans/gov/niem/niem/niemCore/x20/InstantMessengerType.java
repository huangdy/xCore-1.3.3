/*
 * XML Type:  InstantMessengerType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.InstantMessengerType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML InstantMessengerType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface InstantMessengerType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InstantMessengerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("instantmessengertypea087type");
    
    /**
     * Gets array of all "InstantMessengerClientName" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getInstantMessengerClientNameArray();
    
    /**
     * Gets ith "InstantMessengerClientName" element
     */
    gov.niem.niem.niemCore.x20.TextType getInstantMessengerClientNameArray(int i);
    
    /**
     * Tests for nil ith "InstantMessengerClientName" element
     */
    boolean isNilInstantMessengerClientNameArray(int i);
    
    /**
     * Returns number of "InstantMessengerClientName" element
     */
    int sizeOfInstantMessengerClientNameArray();
    
    /**
     * Sets array of all "InstantMessengerClientName" element
     */
    void setInstantMessengerClientNameArray(gov.niem.niem.niemCore.x20.TextType[] instantMessengerClientNameArray);
    
    /**
     * Sets ith "InstantMessengerClientName" element
     */
    void setInstantMessengerClientNameArray(int i, gov.niem.niem.niemCore.x20.TextType instantMessengerClientName);
    
    /**
     * Nils the ith "InstantMessengerClientName" element
     */
    void setNilInstantMessengerClientNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstantMessengerClientName" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewInstantMessengerClientName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InstantMessengerClientName" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewInstantMessengerClientName();
    
    /**
     * Removes the ith "InstantMessengerClientName" element
     */
    void removeInstantMessengerClientName(int i);
    
    /**
     * Gets array of all "InstantMessengerScreenID" elements
     */
    gov.niem.niem.proxy.xsd.x20.String[] getInstantMessengerScreenIDArray();
    
    /**
     * Gets ith "InstantMessengerScreenID" element
     */
    gov.niem.niem.proxy.xsd.x20.String getInstantMessengerScreenIDArray(int i);
    
    /**
     * Tests for nil ith "InstantMessengerScreenID" element
     */
    boolean isNilInstantMessengerScreenIDArray(int i);
    
    /**
     * Returns number of "InstantMessengerScreenID" element
     */
    int sizeOfInstantMessengerScreenIDArray();
    
    /**
     * Sets array of all "InstantMessengerScreenID" element
     */
    void setInstantMessengerScreenIDArray(gov.niem.niem.proxy.xsd.x20.String[] instantMessengerScreenIDArray);
    
    /**
     * Sets ith "InstantMessengerScreenID" element
     */
    void setInstantMessengerScreenIDArray(int i, gov.niem.niem.proxy.xsd.x20.String instantMessengerScreenID);
    
    /**
     * Nils the ith "InstantMessengerScreenID" element
     */
    void setNilInstantMessengerScreenIDArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstantMessengerScreenID" element
     */
    gov.niem.niem.proxy.xsd.x20.String insertNewInstantMessengerScreenID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InstantMessengerScreenID" element
     */
    gov.niem.niem.proxy.xsd.x20.String addNewInstantMessengerScreenID();
    
    /**
     * Removes the ith "InstantMessengerScreenID" element
     */
    void removeInstantMessengerScreenID(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.InstantMessengerType newInstance() {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.InstantMessengerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.InstantMessengerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
