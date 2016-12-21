/*
 * XML Type:  ContactInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1;


/**
 * An XML ContactInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public interface ContactInformationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("contactinformationtype8342type");
    
    /**
     * Gets the "ContactDescription" element
     */
    java.lang.String getContactDescription();
    
    /**
     * Gets (as xml) the "ContactDescription" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType xgetContactDescription();
    
    /**
     * True if has "ContactDescription" element
     */
    boolean isSetContactDescription();
    
    /**
     * Sets the "ContactDescription" element
     */
    void setContactDescription(java.lang.String contactDescription);
    
    /**
     * Sets (as xml) the "ContactDescription" element
     */
    void xsetContactDescription(x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType contactDescription);
    
    /**
     * Unsets the "ContactDescription" element
     */
    void unsetContactDescription();
    
    /**
     * Gets the "ContactRole" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType.Enum getContactRole();
    
    /**
     * Gets (as xml) the "ContactRole" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType xgetContactRole();
    
    /**
     * True if has "ContactRole" element
     */
    boolean isSetContactRole();
    
    /**
     * Sets the "ContactRole" element
     */
    void setContactRole(x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType.Enum contactRole);
    
    /**
     * Sets (as xml) the "ContactRole" element
     */
    void xsetContactRole(x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType contactRole);
    
    /**
     * Unsets the "ContactRole" element
     */
    void unsetContactRole();
    
    /**
     * Gets array of all "Radio" elements
     */
    x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType[] getRadioArray();
    
    /**
     * Gets ith "Radio" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType getRadioArray(int i);
    
    /**
     * Returns number of "Radio" element
     */
    int sizeOfRadioArray();
    
    /**
     * Sets array of all "Radio" element
     */
    void setRadioArray(x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType[] radioArray);
    
    /**
     * Sets ith "Radio" element
     */
    void setRadioArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType radio);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Radio" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType insertNewRadio(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Radio" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType addNewRadio();
    
    /**
     * Removes the ith "Radio" element
     */
    void removeRadio(int i);
    
    /**
     * Gets the "ContactLocation" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.LocationType getContactLocation();
    
    /**
     * True if has "ContactLocation" element
     */
    boolean isSetContactLocation();
    
    /**
     * Sets the "ContactLocation" element
     */
    void setContactLocation(x0.oasisNamesTcEmergencyEDXLRM1.LocationType contactLocation);
    
    /**
     * Appends and returns a new empty "ContactLocation" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.LocationType addNewContactLocation();
    
    /**
     * Unsets the "ContactLocation" element
     */
    void unsetContactLocation();
    
    /**
     * Gets the "AdditionalContactInformation" element
     */
    oasisNamesTcCiqXpil3.PartyType getAdditionalContactInformation();
    
    /**
     * True if has "AdditionalContactInformation" element
     */
    boolean isSetAdditionalContactInformation();
    
    /**
     * Sets the "AdditionalContactInformation" element
     */
    void setAdditionalContactInformation(oasisNamesTcCiqXpil3.PartyType additionalContactInformation);
    
    /**
     * Appends and returns a new empty "AdditionalContactInformation" element
     */
    oasisNamesTcCiqXpil3.PartyType addNewAdditionalContactInformation();
    
    /**
     * Unsets the "AdditionalContactInformation" element
     */
    void unsetAdditionalContactInformation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
