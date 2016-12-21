/*
 * XML Type:  IncidentCommandAndStaffType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.IncidentCommandAndStaffType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203;


/**
 * An XML IncidentCommandAndStaffType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public interface IncidentCommandAndStaffType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentCommandAndStaffType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("incidentcommandandstafftype3198type");
    
    /**
     * Gets the "IncidentCommander" element
     */
    java.lang.String getIncidentCommander();
    
    /**
     * Gets (as xml) the "IncidentCommander" element
     */
    org.apache.xmlbeans.XmlString xgetIncidentCommander();
    
    /**
     * Sets the "IncidentCommander" element
     */
    void setIncidentCommander(java.lang.String incidentCommander);
    
    /**
     * Sets (as xml) the "IncidentCommander" element
     */
    void xsetIncidentCommander(org.apache.xmlbeans.XmlString incidentCommander);
    
    /**
     * Gets the "Deputy" element
     */
    java.lang.String getDeputy();
    
    /**
     * Gets (as xml) the "Deputy" element
     */
    org.apache.xmlbeans.XmlString xgetDeputy();
    
    /**
     * Sets the "Deputy" element
     */
    void setDeputy(java.lang.String deputy);
    
    /**
     * Sets (as xml) the "Deputy" element
     */
    void xsetDeputy(org.apache.xmlbeans.XmlString deputy);
    
    /**
     * Gets the "SafetyOfficer" element
     */
    java.lang.String getSafetyOfficer();
    
    /**
     * Gets (as xml) the "SafetyOfficer" element
     */
    org.apache.xmlbeans.XmlString xgetSafetyOfficer();
    
    /**
     * Sets the "SafetyOfficer" element
     */
    void setSafetyOfficer(java.lang.String safetyOfficer);
    
    /**
     * Sets (as xml) the "SafetyOfficer" element
     */
    void xsetSafetyOfficer(org.apache.xmlbeans.XmlString safetyOfficer);
    
    /**
     * Gets the "InformationOfficer" element
     */
    java.lang.String getInformationOfficer();
    
    /**
     * Gets (as xml) the "InformationOfficer" element
     */
    org.apache.xmlbeans.XmlString xgetInformationOfficer();
    
    /**
     * Sets the "InformationOfficer" element
     */
    void setInformationOfficer(java.lang.String informationOfficer);
    
    /**
     * Sets (as xml) the "InformationOfficer" element
     */
    void xsetInformationOfficer(org.apache.xmlbeans.XmlString informationOfficer);
    
    /**
     * Gets the "LiasonOfficer" element
     */
    java.lang.String getLiasonOfficer();
    
    /**
     * Gets (as xml) the "LiasonOfficer" element
     */
    org.apache.xmlbeans.XmlString xgetLiasonOfficer();
    
    /**
     * Sets the "LiasonOfficer" element
     */
    void setLiasonOfficer(java.lang.String liasonOfficer);
    
    /**
     * Sets (as xml) the "LiasonOfficer" element
     */
    void xsetLiasonOfficer(org.apache.xmlbeans.XmlString liasonOfficer);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm203.IncidentCommandAndStaffType newInstance() {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.IncidentCommandAndStaffType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.IncidentCommandAndStaffType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
