/*
 * XML Type:  IncidentMedicalAidStationType
 * Namespace: http://uicds.org/ICSForm206
 * Java type: org.uicds.icsForm206.IncidentMedicalAidStationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm206;


/**
 * An XML IncidentMedicalAidStationType(@http://uicds.org/ICSForm206).
 *
 * This is a complex type.
 */
public interface IncidentMedicalAidStationType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentMedicalAidStationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("incidentmedicalaidstationtypeb270type");
    
    /**
     * Gets the "MedicalAidStation" element
     */
    java.lang.String getMedicalAidStation();
    
    /**
     * Gets (as xml) the "MedicalAidStation" element
     */
    org.apache.xmlbeans.XmlString xgetMedicalAidStation();
    
    /**
     * Sets the "MedicalAidStation" element
     */
    void setMedicalAidStation(java.lang.String medicalAidStation);
    
    /**
     * Sets (as xml) the "MedicalAidStation" element
     */
    void xsetMedicalAidStation(org.apache.xmlbeans.XmlString medicalAidStation);
    
    /**
     * Gets the "Location" element
     */
    java.lang.String getLocation();
    
    /**
     * Gets (as xml) the "Location" element
     */
    org.apache.xmlbeans.XmlString xgetLocation();
    
    /**
     * Sets the "Location" element
     */
    void setLocation(java.lang.String location);
    
    /**
     * Sets (as xml) the "Location" element
     */
    void xsetLocation(org.apache.xmlbeans.XmlString location);
    
    /**
     * Gets the "Paramedics" element
     */
    boolean getParamedics();
    
    /**
     * Gets (as xml) the "Paramedics" element
     */
    org.apache.xmlbeans.XmlBoolean xgetParamedics();
    
    /**
     * Sets the "Paramedics" element
     */
    void setParamedics(boolean paramedics);
    
    /**
     * Sets (as xml) the "Paramedics" element
     */
    void xsetParamedics(org.apache.xmlbeans.XmlBoolean paramedics);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm206.IncidentMedicalAidStationType newInstance() {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm206.IncidentMedicalAidStationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm206.IncidentMedicalAidStationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
