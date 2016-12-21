/*
 * XML Type:  StructuredAddressType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StructuredAddressType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML StructuredAddressType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface StructuredAddressType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructuredAddressType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("structuredaddresstypeac68type");
    
    /**
     * Gets array of all "AddressRecipientName" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getAddressRecipientNameArray();
    
    /**
     * Gets ith "AddressRecipientName" element
     */
    gov.niem.niem.niemCore.x20.TextType getAddressRecipientNameArray(int i);
    
    /**
     * Tests for nil ith "AddressRecipientName" element
     */
    boolean isNilAddressRecipientNameArray(int i);
    
    /**
     * Returns number of "AddressRecipientName" element
     */
    int sizeOfAddressRecipientNameArray();
    
    /**
     * Sets array of all "AddressRecipientName" element
     */
    void setAddressRecipientNameArray(gov.niem.niem.niemCore.x20.TextType[] addressRecipientNameArray);
    
    /**
     * Sets ith "AddressRecipientName" element
     */
    void setAddressRecipientNameArray(int i, gov.niem.niem.niemCore.x20.TextType addressRecipientName);
    
    /**
     * Nils the ith "AddressRecipientName" element
     */
    void setNilAddressRecipientNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressRecipientName" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewAddressRecipientName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressRecipientName" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewAddressRecipientName();
    
    /**
     * Removes the ith "AddressRecipientName" element
     */
    void removeAddressRecipientName(int i);
    
    /**
     * Gets array of all "AddressDeliveryPoint" elements
     */
    org.apache.xmlbeans.XmlObject[] getAddressDeliveryPointArray();
    
    /**
     * Gets ith "AddressDeliveryPoint" element
     */
    org.apache.xmlbeans.XmlObject getAddressDeliveryPointArray(int i);
    
    /**
     * Returns number of "AddressDeliveryPoint" element
     */
    int sizeOfAddressDeliveryPointArray();
    
    /**
     * Sets array of all "AddressDeliveryPoint" element
     */
    void setAddressDeliveryPointArray(org.apache.xmlbeans.XmlObject[] addressDeliveryPointArray);
    
    /**
     * Sets ith "AddressDeliveryPoint" element
     */
    void setAddressDeliveryPointArray(int i, org.apache.xmlbeans.XmlObject addressDeliveryPoint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressDeliveryPoint" element
     */
    org.apache.xmlbeans.XmlObject insertNewAddressDeliveryPoint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressDeliveryPoint" element
     */
    org.apache.xmlbeans.XmlObject addNewAddressDeliveryPoint();
    
    /**
     * Removes the ith "AddressDeliveryPoint" element
     */
    void removeAddressDeliveryPoint(int i);
    
    /**
     * Gets array of all "LocationCityName" elements
     */
    gov.niem.niem.niemCore.x20.ProperNameTextType[] getLocationCityNameArray();
    
    /**
     * Gets ith "LocationCityName" element
     */
    gov.niem.niem.niemCore.x20.ProperNameTextType getLocationCityNameArray(int i);
    
    /**
     * Tests for nil ith "LocationCityName" element
     */
    boolean isNilLocationCityNameArray(int i);
    
    /**
     * Returns number of "LocationCityName" element
     */
    int sizeOfLocationCityNameArray();
    
    /**
     * Sets array of all "LocationCityName" element
     */
    void setLocationCityNameArray(gov.niem.niem.niemCore.x20.ProperNameTextType[] locationCityNameArray);
    
    /**
     * Sets ith "LocationCityName" element
     */
    void setLocationCityNameArray(int i, gov.niem.niem.niemCore.x20.ProperNameTextType locationCityName);
    
    /**
     * Nils the ith "LocationCityName" element
     */
    void setNilLocationCityNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationCityName" element
     */
    gov.niem.niem.niemCore.x20.ProperNameTextType insertNewLocationCityName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationCityName" element
     */
    gov.niem.niem.niemCore.x20.ProperNameTextType addNewLocationCityName();
    
    /**
     * Removes the ith "LocationCityName" element
     */
    void removeLocationCityName(int i);
    
    /**
     * Gets array of all "LocationCounty" elements
     */
    org.apache.xmlbeans.XmlObject[] getLocationCountyArray();
    
    /**
     * Gets ith "LocationCounty" element
     */
    org.apache.xmlbeans.XmlObject getLocationCountyArray(int i);
    
    /**
     * Returns number of "LocationCounty" element
     */
    int sizeOfLocationCountyArray();
    
    /**
     * Sets array of all "LocationCounty" element
     */
    void setLocationCountyArray(org.apache.xmlbeans.XmlObject[] locationCountyArray);
    
    /**
     * Sets ith "LocationCounty" element
     */
    void setLocationCountyArray(int i, org.apache.xmlbeans.XmlObject locationCounty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationCounty" element
     */
    org.apache.xmlbeans.XmlObject insertNewLocationCounty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationCounty" element
     */
    org.apache.xmlbeans.XmlObject addNewLocationCounty();
    
    /**
     * Removes the ith "LocationCounty" element
     */
    void removeLocationCounty(int i);
    
    /**
     * Gets array of all "LocationState" elements
     */
    org.apache.xmlbeans.XmlObject[] getLocationStateArray();
    
    /**
     * Gets ith "LocationState" element
     */
    org.apache.xmlbeans.XmlObject getLocationStateArray(int i);
    
    /**
     * Returns number of "LocationState" element
     */
    int sizeOfLocationStateArray();
    
    /**
     * Sets array of all "LocationState" element
     */
    void setLocationStateArray(org.apache.xmlbeans.XmlObject[] locationStateArray);
    
    /**
     * Sets ith "LocationState" element
     */
    void setLocationStateArray(int i, org.apache.xmlbeans.XmlObject locationState);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationState" element
     */
    org.apache.xmlbeans.XmlObject insertNewLocationState(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationState" element
     */
    org.apache.xmlbeans.XmlObject addNewLocationState();
    
    /**
     * Removes the ith "LocationState" element
     */
    void removeLocationState(int i);
    
    /**
     * Gets array of all "LocationCountry" elements
     */
    org.apache.xmlbeans.XmlObject[] getLocationCountryArray();
    
    /**
     * Gets ith "LocationCountry" element
     */
    org.apache.xmlbeans.XmlObject getLocationCountryArray(int i);
    
    /**
     * Returns number of "LocationCountry" element
     */
    int sizeOfLocationCountryArray();
    
    /**
     * Sets array of all "LocationCountry" element
     */
    void setLocationCountryArray(org.apache.xmlbeans.XmlObject[] locationCountryArray);
    
    /**
     * Sets ith "LocationCountry" element
     */
    void setLocationCountryArray(int i, org.apache.xmlbeans.XmlObject locationCountry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationCountry" element
     */
    org.apache.xmlbeans.XmlObject insertNewLocationCountry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationCountry" element
     */
    org.apache.xmlbeans.XmlObject addNewLocationCountry();
    
    /**
     * Removes the ith "LocationCountry" element
     */
    void removeLocationCountry(int i);
    
    /**
     * Gets array of all "LocationPostalCode" elements
     */
    gov.niem.niem.proxy.xsd.x20.String[] getLocationPostalCodeArray();
    
    /**
     * Gets ith "LocationPostalCode" element
     */
    gov.niem.niem.proxy.xsd.x20.String getLocationPostalCodeArray(int i);
    
    /**
     * Tests for nil ith "LocationPostalCode" element
     */
    boolean isNilLocationPostalCodeArray(int i);
    
    /**
     * Returns number of "LocationPostalCode" element
     */
    int sizeOfLocationPostalCodeArray();
    
    /**
     * Sets array of all "LocationPostalCode" element
     */
    void setLocationPostalCodeArray(gov.niem.niem.proxy.xsd.x20.String[] locationPostalCodeArray);
    
    /**
     * Sets ith "LocationPostalCode" element
     */
    void setLocationPostalCodeArray(int i, gov.niem.niem.proxy.xsd.x20.String locationPostalCode);
    
    /**
     * Nils the ith "LocationPostalCode" element
     */
    void setNilLocationPostalCodeArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationPostalCode" element
     */
    gov.niem.niem.proxy.xsd.x20.String insertNewLocationPostalCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationPostalCode" element
     */
    gov.niem.niem.proxy.xsd.x20.String addNewLocationPostalCode();
    
    /**
     * Removes the ith "LocationPostalCode" element
     */
    void removeLocationPostalCode(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.StructuredAddressType newInstance() {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.StructuredAddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.StructuredAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
