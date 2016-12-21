/*
 * XML Type:  UICDSIncidentType
 * Namespace: http://uicds.org/incident
 * Java type: org.uicds.incident.UICDSIncidentType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incident;


/**
 * An XML UICDSIncidentType(@http://uicds.org/incident).
 *
 * This is a complex type.
 */
public interface UICDSIncidentType extends gov.niem.niem.niemCore.x20.IncidentType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UICDSIncidentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("uicdsincidenttype1880type");
    
    /**
     * Gets array of all "SharedCoreName" elements
     */
    java.lang.String[] getSharedCoreNameArray();
    
    /**
     * Gets ith "SharedCoreName" element
     */
    java.lang.String getSharedCoreNameArray(int i);
    
    /**
     * Gets (as xml) array of all "SharedCoreName" elements
     */
    org.apache.xmlbeans.XmlString[] xgetSharedCoreNameArray();
    
    /**
     * Gets (as xml) ith "SharedCoreName" element
     */
    org.apache.xmlbeans.XmlString xgetSharedCoreNameArray(int i);
    
    /**
     * Returns number of "SharedCoreName" element
     */
    int sizeOfSharedCoreNameArray();
    
    /**
     * Sets array of all "SharedCoreName" element
     */
    void setSharedCoreNameArray(java.lang.String[] sharedCoreNameArray);
    
    /**
     * Sets ith "SharedCoreName" element
     */
    void setSharedCoreNameArray(int i, java.lang.String sharedCoreName);
    
    /**
     * Sets (as xml) array of all "SharedCoreName" element
     */
    void xsetSharedCoreNameArray(org.apache.xmlbeans.XmlString[] sharedCoreNameArray);
    
    /**
     * Sets (as xml) ith "SharedCoreName" element
     */
    void xsetSharedCoreNameArray(int i, org.apache.xmlbeans.XmlString sharedCoreName);
    
    /**
     * Inserts the value as the ith "SharedCoreName" element
     */
    void insertSharedCoreName(int i, java.lang.String sharedCoreName);
    
    /**
     * Appends the value as the last "SharedCoreName" element
     */
    void addSharedCoreName(java.lang.String sharedCoreName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SharedCoreName" element
     */
    org.apache.xmlbeans.XmlString insertNewSharedCoreName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SharedCoreName" element
     */
    org.apache.xmlbeans.XmlString addNewSharedCoreName();
    
    /**
     * Removes the ith "SharedCoreName" element
     */
    void removeSharedCoreName(int i);
    
    /**
     * Gets the "OwningCore" element
     */
    java.lang.String getOwningCore();
    
    /**
     * Gets (as xml) the "OwningCore" element
     */
    org.apache.xmlbeans.XmlString xgetOwningCore();
    
    /**
     * True if has "OwningCore" element
     */
    boolean isSetOwningCore();
    
    /**
     * Sets the "OwningCore" element
     */
    void setOwningCore(java.lang.String owningCore);
    
    /**
     * Sets (as xml) the "OwningCore" element
     */
    void xsetOwningCore(org.apache.xmlbeans.XmlString owningCore);
    
    /**
     * Unsets the "OwningCore" element
     */
    void unsetOwningCore();
    
    /**
     * Gets array of all "ExtendedMetadata" elements
     */
    org.uicds.incident.ExtendedMetadataType[] getExtendedMetadataArray();
    
    /**
     * Gets ith "ExtendedMetadata" element
     */
    org.uicds.incident.ExtendedMetadataType getExtendedMetadataArray(int i);
    
    /**
     * Returns number of "ExtendedMetadata" element
     */
    int sizeOfExtendedMetadataArray();
    
    /**
     * Sets array of all "ExtendedMetadata" element
     */
    void setExtendedMetadataArray(org.uicds.incident.ExtendedMetadataType[] extendedMetadataArray);
    
    /**
     * Sets ith "ExtendedMetadata" element
     */
    void setExtendedMetadataArray(int i, org.uicds.incident.ExtendedMetadataType extendedMetadata);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExtendedMetadata" element
     */
    org.uicds.incident.ExtendedMetadataType insertNewExtendedMetadata(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExtendedMetadata" element
     */
    org.uicds.incident.ExtendedMetadataType addNewExtendedMetadata();
    
    /**
     * Removes the ith "ExtendedMetadata" element
     */
    void removeExtendedMetadata(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.incident.UICDSIncidentType newInstance() {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.incident.UICDSIncidentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.incident.UICDSIncidentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.incident.UICDSIncidentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.incident.UICDSIncidentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incident.UICDSIncidentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incident.UICDSIncidentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incident.UICDSIncidentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
