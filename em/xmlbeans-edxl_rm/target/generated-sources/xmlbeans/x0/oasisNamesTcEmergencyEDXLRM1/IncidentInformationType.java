/*
 * XML Type:  IncidentInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1;


/**
 * An XML IncidentInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public interface IncidentInformationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("incidentinformationtypee826type");
    
    /**
     * Gets the "IncidentID" element
     */
    java.lang.String getIncidentID();
    
    /**
     * Gets (as xml) the "IncidentID" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType xgetIncidentID();
    
    /**
     * True if has "IncidentID" element
     */
    boolean isSetIncidentID();
    
    /**
     * Sets the "IncidentID" element
     */
    void setIncidentID(java.lang.String incidentID);
    
    /**
     * Sets (as xml) the "IncidentID" element
     */
    void xsetIncidentID(x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType incidentID);
    
    /**
     * Unsets the "IncidentID" element
     */
    void unsetIncidentID();
    
    /**
     * Gets the "IncidentDescription" element
     */
    java.lang.String getIncidentDescription();
    
    /**
     * Gets (as xml) the "IncidentDescription" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType xgetIncidentDescription();
    
    /**
     * True if has "IncidentDescription" element
     */
    boolean isSetIncidentDescription();
    
    /**
     * Sets the "IncidentDescription" element
     */
    void setIncidentDescription(java.lang.String incidentDescription);
    
    /**
     * Sets (as xml) the "IncidentDescription" element
     */
    void xsetIncidentDescription(x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType incidentDescription);
    
    /**
     * Unsets the "IncidentDescription" element
     */
    void unsetIncidentDescription();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
