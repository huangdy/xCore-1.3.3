/*
 * XML Type:  IncidentType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IncidentType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML IncidentType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface IncidentType extends gov.niem.niem.niemCore.x20.ActivityType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("incidenttypeb0e7type");
    
    /**
     * Gets array of all "IncidentLocation" elements
     */
    gov.niem.niem.niemCore.x20.LocationType[] getIncidentLocationArray();
    
    /**
     * Gets ith "IncidentLocation" element
     */
    gov.niem.niem.niemCore.x20.LocationType getIncidentLocationArray(int i);
    
    /**
     * Tests for nil ith "IncidentLocation" element
     */
    boolean isNilIncidentLocationArray(int i);
    
    /**
     * Returns number of "IncidentLocation" element
     */
    int sizeOfIncidentLocationArray();
    
    /**
     * Sets array of all "IncidentLocation" element
     */
    void setIncidentLocationArray(gov.niem.niem.niemCore.x20.LocationType[] incidentLocationArray);
    
    /**
     * Sets ith "IncidentLocation" element
     */
    void setIncidentLocationArray(int i, gov.niem.niem.niemCore.x20.LocationType incidentLocation);
    
    /**
     * Nils the ith "IncidentLocation" element
     */
    void setNilIncidentLocationArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentLocation" element
     */
    gov.niem.niem.niemCore.x20.LocationType insertNewIncidentLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentLocation" element
     */
    gov.niem.niem.niemCore.x20.LocationType addNewIncidentLocation();
    
    /**
     * Removes the ith "IncidentLocation" element
     */
    void removeIncidentLocation(int i);
    
    /**
     * Gets array of all "IncidentEvent" elements
     */
    gov.niem.niem.niemCore.x20.ActivityType[] getIncidentEventArray();
    
    /**
     * Gets ith "IncidentEvent" element
     */
    gov.niem.niem.niemCore.x20.ActivityType getIncidentEventArray(int i);
    
    /**
     * Tests for nil ith "IncidentEvent" element
     */
    boolean isNilIncidentEventArray(int i);
    
    /**
     * Returns number of "IncidentEvent" element
     */
    int sizeOfIncidentEventArray();
    
    /**
     * Sets array of all "IncidentEvent" element
     */
    void setIncidentEventArray(gov.niem.niem.niemCore.x20.ActivityType[] incidentEventArray);
    
    /**
     * Sets ith "IncidentEvent" element
     */
    void setIncidentEventArray(int i, gov.niem.niem.niemCore.x20.ActivityType incidentEvent);
    
    /**
     * Nils the ith "IncidentEvent" element
     */
    void setNilIncidentEventArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentEvent" element
     */
    gov.niem.niem.niemCore.x20.ActivityType insertNewIncidentEvent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentEvent" element
     */
    gov.niem.niem.niemCore.x20.ActivityType addNewIncidentEvent();
    
    /**
     * Removes the ith "IncidentEvent" element
     */
    void removeIncidentEvent(int i);
    
    /**
     * Gets array of all "IncidentJurisdictionalOrganization" elements
     */
    gov.niem.niem.niemCore.x20.OrganizationType[] getIncidentJurisdictionalOrganizationArray();
    
    /**
     * Gets ith "IncidentJurisdictionalOrganization" element
     */
    gov.niem.niem.niemCore.x20.OrganizationType getIncidentJurisdictionalOrganizationArray(int i);
    
    /**
     * Tests for nil ith "IncidentJurisdictionalOrganization" element
     */
    boolean isNilIncidentJurisdictionalOrganizationArray(int i);
    
    /**
     * Returns number of "IncidentJurisdictionalOrganization" element
     */
    int sizeOfIncidentJurisdictionalOrganizationArray();
    
    /**
     * Sets array of all "IncidentJurisdictionalOrganization" element
     */
    void setIncidentJurisdictionalOrganizationArray(gov.niem.niem.niemCore.x20.OrganizationType[] incidentJurisdictionalOrganizationArray);
    
    /**
     * Sets ith "IncidentJurisdictionalOrganization" element
     */
    void setIncidentJurisdictionalOrganizationArray(int i, gov.niem.niem.niemCore.x20.OrganizationType incidentJurisdictionalOrganization);
    
    /**
     * Nils the ith "IncidentJurisdictionalOrganization" element
     */
    void setNilIncidentJurisdictionalOrganizationArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentJurisdictionalOrganization" element
     */
    gov.niem.niem.niemCore.x20.OrganizationType insertNewIncidentJurisdictionalOrganization(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentJurisdictionalOrganization" element
     */
    gov.niem.niem.niemCore.x20.OrganizationType addNewIncidentJurisdictionalOrganization();
    
    /**
     * Removes the ith "IncidentJurisdictionalOrganization" element
     */
    void removeIncidentJurisdictionalOrganization(int i);
    
    /**
     * Gets array of all "IncidentObservationText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getIncidentObservationTextArray();
    
    /**
     * Gets ith "IncidentObservationText" element
     */
    gov.niem.niem.niemCore.x20.TextType getIncidentObservationTextArray(int i);
    
    /**
     * Tests for nil ith "IncidentObservationText" element
     */
    boolean isNilIncidentObservationTextArray(int i);
    
    /**
     * Returns number of "IncidentObservationText" element
     */
    int sizeOfIncidentObservationTextArray();
    
    /**
     * Sets array of all "IncidentObservationText" element
     */
    void setIncidentObservationTextArray(gov.niem.niem.niemCore.x20.TextType[] incidentObservationTextArray);
    
    /**
     * Sets ith "IncidentObservationText" element
     */
    void setIncidentObservationTextArray(int i, gov.niem.niem.niemCore.x20.TextType incidentObservationText);
    
    /**
     * Nils the ith "IncidentObservationText" element
     */
    void setNilIncidentObservationTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentObservationText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewIncidentObservationText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentObservationText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewIncidentObservationText();
    
    /**
     * Removes the ith "IncidentObservationText" element
     */
    void removeIncidentObservationText(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.IncidentType newInstance() {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.IncidentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.IncidentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.IncidentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.IncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
