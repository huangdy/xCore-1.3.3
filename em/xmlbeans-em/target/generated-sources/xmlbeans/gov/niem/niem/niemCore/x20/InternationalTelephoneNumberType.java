/*
 * XML Type:  InternationalTelephoneNumberType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML InternationalTelephoneNumberType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface InternationalTelephoneNumberType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InternationalTelephoneNumberType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("internationaltelephonenumbertyped79atype");
    
    /**
     * Gets array of all "TelephoneCountryCodeID" elements
     */
    gov.niem.niem.proxy.xsd.x20.String[] getTelephoneCountryCodeIDArray();
    
    /**
     * Gets ith "TelephoneCountryCodeID" element
     */
    gov.niem.niem.proxy.xsd.x20.String getTelephoneCountryCodeIDArray(int i);
    
    /**
     * Tests for nil ith "TelephoneCountryCodeID" element
     */
    boolean isNilTelephoneCountryCodeIDArray(int i);
    
    /**
     * Returns number of "TelephoneCountryCodeID" element
     */
    int sizeOfTelephoneCountryCodeIDArray();
    
    /**
     * Sets array of all "TelephoneCountryCodeID" element
     */
    void setTelephoneCountryCodeIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneCountryCodeIDArray);
    
    /**
     * Sets ith "TelephoneCountryCodeID" element
     */
    void setTelephoneCountryCodeIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneCountryCodeID);
    
    /**
     * Nils the ith "TelephoneCountryCodeID" element
     */
    void setNilTelephoneCountryCodeIDArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneCountryCodeID" element
     */
    gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneCountryCodeID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneCountryCodeID" element
     */
    gov.niem.niem.proxy.xsd.x20.String addNewTelephoneCountryCodeID();
    
    /**
     * Removes the ith "TelephoneCountryCodeID" element
     */
    void removeTelephoneCountryCodeID(int i);
    
    /**
     * Gets array of all "TelephoneNumberID" elements
     */
    gov.niem.niem.proxy.xsd.x20.String[] getTelephoneNumberIDArray();
    
    /**
     * Gets ith "TelephoneNumberID" element
     */
    gov.niem.niem.proxy.xsd.x20.String getTelephoneNumberIDArray(int i);
    
    /**
     * Tests for nil ith "TelephoneNumberID" element
     */
    boolean isNilTelephoneNumberIDArray(int i);
    
    /**
     * Returns number of "TelephoneNumberID" element
     */
    int sizeOfTelephoneNumberIDArray();
    
    /**
     * Sets array of all "TelephoneNumberID" element
     */
    void setTelephoneNumberIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneNumberIDArray);
    
    /**
     * Sets ith "TelephoneNumberID" element
     */
    void setTelephoneNumberIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneNumberID);
    
    /**
     * Nils the ith "TelephoneNumberID" element
     */
    void setNilTelephoneNumberIDArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneNumberID" element
     */
    gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneNumberID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneNumberID" element
     */
    gov.niem.niem.proxy.xsd.x20.String addNewTelephoneNumberID();
    
    /**
     * Removes the ith "TelephoneNumberID" element
     */
    void removeTelephoneNumberID(int i);
    
    /**
     * Gets array of all "TelephoneSuffixID" elements
     */
    gov.niem.niem.proxy.xsd.x20.String[] getTelephoneSuffixIDArray();
    
    /**
     * Gets ith "TelephoneSuffixID" element
     */
    gov.niem.niem.proxy.xsd.x20.String getTelephoneSuffixIDArray(int i);
    
    /**
     * Tests for nil ith "TelephoneSuffixID" element
     */
    boolean isNilTelephoneSuffixIDArray(int i);
    
    /**
     * Returns number of "TelephoneSuffixID" element
     */
    int sizeOfTelephoneSuffixIDArray();
    
    /**
     * Sets array of all "TelephoneSuffixID" element
     */
    void setTelephoneSuffixIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneSuffixIDArray);
    
    /**
     * Sets ith "TelephoneSuffixID" element
     */
    void setTelephoneSuffixIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneSuffixID);
    
    /**
     * Nils the ith "TelephoneSuffixID" element
     */
    void setNilTelephoneSuffixIDArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneSuffixID" element
     */
    gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneSuffixID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneSuffixID" element
     */
    gov.niem.niem.proxy.xsd.x20.String addNewTelephoneSuffixID();
    
    /**
     * Removes the ith "TelephoneSuffixID" element
     */
    void removeTelephoneSuffixID(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType newInstance() {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
