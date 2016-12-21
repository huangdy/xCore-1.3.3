/*
 * XML Type:  PlanningSectionType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.PlanningSectionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203;


/**
 * An XML PlanningSectionType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public interface PlanningSectionType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlanningSectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("planningsectiontype58detype");
    
    /**
     * Gets the "Chief" element
     */
    java.lang.String getChief();
    
    /**
     * Gets (as xml) the "Chief" element
     */
    org.apache.xmlbeans.XmlString xgetChief();
    
    /**
     * Sets the "Chief" element
     */
    void setChief(java.lang.String chief);
    
    /**
     * Sets (as xml) the "Chief" element
     */
    void xsetChief(org.apache.xmlbeans.XmlString chief);
    
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
     * Gets the "ResourcesUnit" element
     */
    java.lang.String getResourcesUnit();
    
    /**
     * Gets (as xml) the "ResourcesUnit" element
     */
    org.apache.xmlbeans.XmlString xgetResourcesUnit();
    
    /**
     * Sets the "ResourcesUnit" element
     */
    void setResourcesUnit(java.lang.String resourcesUnit);
    
    /**
     * Sets (as xml) the "ResourcesUnit" element
     */
    void xsetResourcesUnit(org.apache.xmlbeans.XmlString resourcesUnit);
    
    /**
     * Gets the "SituationUnit" element
     */
    java.lang.String getSituationUnit();
    
    /**
     * Gets (as xml) the "SituationUnit" element
     */
    org.apache.xmlbeans.XmlString xgetSituationUnit();
    
    /**
     * Sets the "SituationUnit" element
     */
    void setSituationUnit(java.lang.String situationUnit);
    
    /**
     * Sets (as xml) the "SituationUnit" element
     */
    void xsetSituationUnit(org.apache.xmlbeans.XmlString situationUnit);
    
    /**
     * Gets the "DocumentationUnit" element
     */
    java.lang.String getDocumentationUnit();
    
    /**
     * Gets (as xml) the "DocumentationUnit" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentationUnit();
    
    /**
     * Sets the "DocumentationUnit" element
     */
    void setDocumentationUnit(java.lang.String documentationUnit);
    
    /**
     * Sets (as xml) the "DocumentationUnit" element
     */
    void xsetDocumentationUnit(org.apache.xmlbeans.XmlString documentationUnit);
    
    /**
     * Gets the "DemobilizationUnit" element
     */
    java.lang.String getDemobilizationUnit();
    
    /**
     * Gets (as xml) the "DemobilizationUnit" element
     */
    org.apache.xmlbeans.XmlString xgetDemobilizationUnit();
    
    /**
     * Sets the "DemobilizationUnit" element
     */
    void setDemobilizationUnit(java.lang.String demobilizationUnit);
    
    /**
     * Sets (as xml) the "DemobilizationUnit" element
     */
    void xsetDemobilizationUnit(org.apache.xmlbeans.XmlString demobilizationUnit);
    
    /**
     * Gets the "TechnicalSpecialists" element
     */
    java.lang.String getTechnicalSpecialists();
    
    /**
     * Gets (as xml) the "TechnicalSpecialists" element
     */
    org.apache.xmlbeans.XmlString xgetTechnicalSpecialists();
    
    /**
     * Sets the "TechnicalSpecialists" element
     */
    void setTechnicalSpecialists(java.lang.String technicalSpecialists);
    
    /**
     * Sets (as xml) the "TechnicalSpecialists" element
     */
    void xsetTechnicalSpecialists(org.apache.xmlbeans.XmlString technicalSpecialists);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm203.PlanningSectionType newInstance() {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm203.PlanningSectionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm203.PlanningSectionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm203.PlanningSectionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm203.PlanningSectionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.PlanningSectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.PlanningSectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.PlanningSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
