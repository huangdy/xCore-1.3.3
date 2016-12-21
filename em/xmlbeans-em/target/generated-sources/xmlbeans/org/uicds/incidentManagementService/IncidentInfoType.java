/*
 * XML Type:  IncidentInfoType
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.IncidentInfoType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService;


/**
 * An XML IncidentInfoType(@http://uicds.org/IncidentManagementService).
 *
 * This is a complex type.
 */
public interface IncidentInfoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("incidentinfotype9670type");
    
    /**
     * Gets the "Id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "Id" element
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * Sets the "Id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "Id" element
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Gets the "WorkProductIdentification" element
     */
    com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification();
    
    /**
     * Sets the "WorkProductIdentification" element
     */
    void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification);
    
    /**
     * Appends and returns a new empty "WorkProductIdentification" element
     */
    com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets the "Date" element
     */
    java.lang.String getDate();
    
    /**
     * Gets (as xml) the "Date" element
     */
    org.apache.xmlbeans.XmlString xgetDate();
    
    /**
     * Sets the "Date" element
     */
    void setDate(java.lang.String date);
    
    /**
     * Sets (as xml) the "Date" element
     */
    void xsetDate(org.apache.xmlbeans.XmlString date);
    
    /**
     * Gets the "Latitude" element
     */
    double getLatitude();
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    org.apache.xmlbeans.XmlDouble xgetLatitude();
    
    /**
     * Sets the "Latitude" element
     */
    void setLatitude(double latitude);
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude);
    
    /**
     * Gets the "Longitude" element
     */
    double getLongitude();
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    org.apache.xmlbeans.XmlDouble xgetLongitude();
    
    /**
     * Sets the "Longitude" element
     */
    void setLongitude(double longitude);
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude);
    
    /**
     * Gets the "OwningCore" element
     */
    java.lang.String getOwningCore();
    
    /**
     * Gets (as xml) the "OwningCore" element
     */
    org.apache.xmlbeans.XmlString xgetOwningCore();
    
    /**
     * Sets the "OwningCore" element
     */
    void setOwningCore(java.lang.String owningCore);
    
    /**
     * Sets (as xml) the "OwningCore" element
     */
    void xsetOwningCore(org.apache.xmlbeans.XmlString owningCore);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.incidentManagementService.IncidentInfoType newInstance() {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.incidentManagementService.IncidentInfoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentManagementService.IncidentInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentManagementService.IncidentInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentManagementService.IncidentInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
