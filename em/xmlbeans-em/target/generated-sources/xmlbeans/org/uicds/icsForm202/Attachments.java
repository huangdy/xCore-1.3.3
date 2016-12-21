/*
 * XML Type:  Attachments
 * Namespace: http://uicds.org/ICSForm202
 * Java type: org.uicds.icsForm202.Attachments
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm202;


/**
 * An XML Attachments(@http://uicds.org/ICSForm202).
 *
 * This is a complex type.
 */
public interface Attachments extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Attachments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("attachments2e6btype");
    
    /**
     * Gets the "OrganizationList" element
     */
    boolean getOrganizationList();
    
    /**
     * Gets (as xml) the "OrganizationList" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOrganizationList();
    
    /**
     * Sets the "OrganizationList" element
     */
    void setOrganizationList(boolean organizationList);
    
    /**
     * Sets (as xml) the "OrganizationList" element
     */
    void xsetOrganizationList(org.apache.xmlbeans.XmlBoolean organizationList);
    
    /**
     * Gets the "AssignmentList" element
     */
    boolean getAssignmentList();
    
    /**
     * Gets (as xml) the "AssignmentList" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAssignmentList();
    
    /**
     * Sets the "AssignmentList" element
     */
    void setAssignmentList(boolean assignmentList);
    
    /**
     * Sets (as xml) the "AssignmentList" element
     */
    void xsetAssignmentList(org.apache.xmlbeans.XmlBoolean assignmentList);
    
    /**
     * Gets the "CommunicationsPlan" element
     */
    boolean getCommunicationsPlan();
    
    /**
     * Gets (as xml) the "CommunicationsPlan" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCommunicationsPlan();
    
    /**
     * Sets the "CommunicationsPlan" element
     */
    void setCommunicationsPlan(boolean communicationsPlan);
    
    /**
     * Sets (as xml) the "CommunicationsPlan" element
     */
    void xsetCommunicationsPlan(org.apache.xmlbeans.XmlBoolean communicationsPlan);
    
    /**
     * Gets the "MedicalPlan" element
     */
    boolean getMedicalPlan();
    
    /**
     * Gets (as xml) the "MedicalPlan" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMedicalPlan();
    
    /**
     * Sets the "MedicalPlan" element
     */
    void setMedicalPlan(boolean medicalPlan);
    
    /**
     * Sets (as xml) the "MedicalPlan" element
     */
    void xsetMedicalPlan(org.apache.xmlbeans.XmlBoolean medicalPlan);
    
    /**
     * Gets the "IncidentMap" element
     */
    boolean getIncidentMap();
    
    /**
     * Gets (as xml) the "IncidentMap" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIncidentMap();
    
    /**
     * Sets the "IncidentMap" element
     */
    void setIncidentMap(boolean incidentMap);
    
    /**
     * Sets (as xml) the "IncidentMap" element
     */
    void xsetIncidentMap(org.apache.xmlbeans.XmlBoolean incidentMap);
    
    /**
     * Gets the "TrafficPlan" element
     */
    boolean getTrafficPlan();
    
    /**
     * Gets (as xml) the "TrafficPlan" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTrafficPlan();
    
    /**
     * Sets the "TrafficPlan" element
     */
    void setTrafficPlan(boolean trafficPlan);
    
    /**
     * Sets (as xml) the "TrafficPlan" element
     */
    void xsetTrafficPlan(org.apache.xmlbeans.XmlBoolean trafficPlan);
    
    /**
     * Gets the "WeatherForecast" element
     */
    boolean getWeatherForecast();
    
    /**
     * Gets (as xml) the "WeatherForecast" element
     */
    org.apache.xmlbeans.XmlBoolean xgetWeatherForecast();
    
    /**
     * Sets the "WeatherForecast" element
     */
    void setWeatherForecast(boolean weatherForecast);
    
    /**
     * Sets (as xml) the "WeatherForecast" element
     */
    void xsetWeatherForecast(org.apache.xmlbeans.XmlBoolean weatherForecast);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm202.Attachments newInstance() {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm202.Attachments newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm202.Attachments parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm202.Attachments parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm202.Attachments parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm202.Attachments parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm202.Attachments parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm202.Attachments parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm202.Attachments parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm202.Attachments parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm202.Attachments parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm202.Attachments parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm202.Attachments parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm202.Attachments parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm202.Attachments parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm202.Attachments parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm202.Attachments parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm202.Attachments parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm202.Attachments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
