/*
 * XML Type:  IncidentHeaderType
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.IncidentHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211;


/**
 * An XML IncidentHeaderType(@http://uicds.org/ICSForm211).
 *
 * This is a complex type.
 */
public interface IncidentHeaderType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("incidentheadertype82a4type");
    
    /**
     * Gets the "IncidentName" element
     */
    java.lang.String getIncidentName();
    
    /**
     * Gets (as xml) the "IncidentName" element
     */
    org.apache.xmlbeans.XmlString xgetIncidentName();
    
    /**
     * Sets the "IncidentName" element
     */
    void setIncidentName(java.lang.String incidentName);
    
    /**
     * Sets (as xml) the "IncidentName" element
     */
    void xsetIncidentName(org.apache.xmlbeans.XmlString incidentName);
    
    /**
     * Gets the "Base" element
     */
    boolean getBase();
    
    /**
     * Gets (as xml) the "Base" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBase();
    
    /**
     * Sets the "Base" element
     */
    void setBase(boolean base);
    
    /**
     * Sets (as xml) the "Base" element
     */
    void xsetBase(org.apache.xmlbeans.XmlBoolean base);
    
    /**
     * Gets the "Camp" element
     */
    boolean getCamp();
    
    /**
     * Gets (as xml) the "Camp" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCamp();
    
    /**
     * Sets the "Camp" element
     */
    void setCamp(boolean camp);
    
    /**
     * Sets (as xml) the "Camp" element
     */
    void xsetCamp(org.apache.xmlbeans.XmlBoolean camp);
    
    /**
     * Gets the "StagingArea" element
     */
    boolean getStagingArea();
    
    /**
     * Gets (as xml) the "StagingArea" element
     */
    org.apache.xmlbeans.XmlBoolean xgetStagingArea();
    
    /**
     * Sets the "StagingArea" element
     */
    void setStagingArea(boolean stagingArea);
    
    /**
     * Sets (as xml) the "StagingArea" element
     */
    void xsetStagingArea(org.apache.xmlbeans.XmlBoolean stagingArea);
    
    /**
     * Gets the "ICPRestat" element
     */
    boolean getICPRestat();
    
    /**
     * Gets (as xml) the "ICPRestat" element
     */
    org.apache.xmlbeans.XmlBoolean xgetICPRestat();
    
    /**
     * Sets the "ICPRestat" element
     */
    void setICPRestat(boolean icpRestat);
    
    /**
     * Sets (as xml) the "ICPRestat" element
     */
    void xsetICPRestat(org.apache.xmlbeans.XmlBoolean icpRestat);
    
    /**
     * Gets the "Helibase" element
     */
    boolean getHelibase();
    
    /**
     * Gets (as xml) the "Helibase" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHelibase();
    
    /**
     * Sets the "Helibase" element
     */
    void setHelibase(boolean helibase);
    
    /**
     * Sets (as xml) the "Helibase" element
     */
    void xsetHelibase(org.apache.xmlbeans.XmlBoolean helibase);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm211.IncidentHeaderType newInstance() {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm211.IncidentHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm211.IncidentHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm211.IncidentHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm211.IncidentHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
