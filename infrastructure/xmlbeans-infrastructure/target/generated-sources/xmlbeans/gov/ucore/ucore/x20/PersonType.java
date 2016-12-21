/*
 * XML Type:  PersonType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PersonType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20;


/**
 * An XML PersonType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface PersonType extends gov.ucore.ucore.x20.AgentType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("persontypebdd4type");
    
    /**
     * Gets array of all "AlternateName" elements
     */
    gov.ucore.ucore.x20.PersonNameType[] getAlternateNameArray();
    
    /**
     * Gets ith "AlternateName" element
     */
    gov.ucore.ucore.x20.PersonNameType getAlternateNameArray(int i);
    
    /**
     * Returns number of "AlternateName" element
     */
    int sizeOfAlternateNameArray();
    
    /**
     * Sets array of all "AlternateName" element
     */
    void setAlternateNameArray(gov.ucore.ucore.x20.PersonNameType[] alternateNameArray);
    
    /**
     * Sets ith "AlternateName" element
     */
    void setAlternateNameArray(int i, gov.ucore.ucore.x20.PersonNameType alternateName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AlternateName" element
     */
    gov.ucore.ucore.x20.PersonNameType insertNewAlternateName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AlternateName" element
     */
    gov.ucore.ucore.x20.PersonNameType addNewAlternateName();
    
    /**
     * Removes the ith "AlternateName" element
     */
    void removeAlternateName(int i);
    
    /**
     * Gets array of all "Citizenship" elements
     */
    mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] getCitizenshipArray();
    
    /**
     * Gets ith "Citizenship" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType getCitizenshipArray(int i);
    
    /**
     * Returns number of "Citizenship" element
     */
    int sizeOfCitizenshipArray();
    
    /**
     * Sets array of all "Citizenship" element
     */
    void setCitizenshipArray(mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] citizenshipArray);
    
    /**
     * Sets ith "Citizenship" element
     */
    void setCitizenshipArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType citizenship);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Citizenship" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType insertNewCitizenship(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Citizenship" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType addNewCitizenship();
    
    /**
     * Removes the ith "Citizenship" element
     */
    void removeCitizenship(int i);
    
    /**
     * Gets the "ContactInfo" element
     */
    gov.ucore.ucore.x20.ContactInfoType getContactInfo();
    
    /**
     * True if has "ContactInfo" element
     */
    boolean isSetContactInfo();
    
    /**
     * Sets the "ContactInfo" element
     */
    void setContactInfo(gov.ucore.ucore.x20.ContactInfoType contactInfo);
    
    /**
     * Appends and returns a new empty "ContactInfo" element
     */
    gov.ucore.ucore.x20.ContactInfoType addNewContactInfo();
    
    /**
     * Unsets the "ContactInfo" element
     */
    void unsetContactInfo();
    
    /**
     * Gets the "DateOfBirth" element
     */
    gov.ucore.ucore.x20.TimeInstantType getDateOfBirth();
    
    /**
     * True if has "DateOfBirth" element
     */
    boolean isSetDateOfBirth();
    
    /**
     * Sets the "DateOfBirth" element
     */
    void setDateOfBirth(gov.ucore.ucore.x20.TimeInstantType dateOfBirth);
    
    /**
     * Appends and returns a new empty "DateOfBirth" element
     */
    gov.ucore.ucore.x20.TimeInstantType addNewDateOfBirth();
    
    /**
     * Unsets the "DateOfBirth" element
     */
    void unsetDateOfBirth();
    
    /**
     * Gets the "Height" element
     */
    gov.ucore.ucore.x20.LengthMeasureType getHeight();
    
    /**
     * True if has "Height" element
     */
    boolean isSetHeight();
    
    /**
     * Sets the "Height" element
     */
    void setHeight(gov.ucore.ucore.x20.LengthMeasureType height);
    
    /**
     * Appends and returns a new empty "Height" element
     */
    gov.ucore.ucore.x20.LengthMeasureType addNewHeight();
    
    /**
     * Unsets the "Height" element
     */
    void unsetHeight();
    
    /**
     * Gets the "Name" element
     */
    gov.ucore.ucore.x20.PersonNameType getName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(gov.ucore.ucore.x20.PersonNameType name);
    
    /**
     * Appends and returns a new empty "Name" element
     */
    gov.ucore.ucore.x20.PersonNameType addNewName();
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Sex" element
     */
    gov.ucore.ucore.x20.PersonSexType.Enum getSex();
    
    /**
     * Gets (as xml) the "Sex" element
     */
    gov.ucore.ucore.x20.PersonSexType xgetSex();
    
    /**
     * True if has "Sex" element
     */
    boolean isSetSex();
    
    /**
     * Sets the "Sex" element
     */
    void setSex(gov.ucore.ucore.x20.PersonSexType.Enum sex);
    
    /**
     * Sets (as xml) the "Sex" element
     */
    void xsetSex(gov.ucore.ucore.x20.PersonSexType sex);
    
    /**
     * Unsets the "Sex" element
     */
    void unsetSex();
    
    /**
     * Gets the "Weight" element
     */
    gov.ucore.ucore.x20.MassMeasureType getWeight();
    
    /**
     * True if has "Weight" element
     */
    boolean isSetWeight();
    
    /**
     * Sets the "Weight" element
     */
    void setWeight(gov.ucore.ucore.x20.MassMeasureType weight);
    
    /**
     * Appends and returns a new empty "Weight" element
     */
    gov.ucore.ucore.x20.MassMeasureType addNewWeight();
    
    /**
     * Unsets the "Weight" element
     */
    void unsetWeight();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore.x20.PersonType newInstance() {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore.x20.PersonType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore.x20.PersonType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore.x20.PersonType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore.x20.PersonType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.PersonType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.PersonType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.PersonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
