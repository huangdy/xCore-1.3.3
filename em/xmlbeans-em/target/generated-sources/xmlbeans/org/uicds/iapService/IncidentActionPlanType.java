/*
 * XML Type:  IncidentActionPlanType
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.IncidentActionPlanType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService;


/**
 * An XML IncidentActionPlanType(@http://uicds.org/IAPService).
 *
 * This is a complex type.
 */
public interface IncidentActionPlanType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncidentActionPlanType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("incidentactionplantype489etype");
    
    /**
     * Gets the "IncidentID" element
     */
    java.lang.String getIncidentID();
    
    /**
     * Gets (as xml) the "IncidentID" element
     */
    org.apache.xmlbeans.XmlString xgetIncidentID();
    
    /**
     * Sets the "IncidentID" element
     */
    void setIncidentID(java.lang.String incidentID);
    
    /**
     * Sets (as xml) the "IncidentID" element
     */
    void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID);
    
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
     * Gets the "DescriptionText" element
     */
    java.lang.String getDescriptionText();
    
    /**
     * Gets (as xml) the "DescriptionText" element
     */
    org.apache.xmlbeans.XmlString xgetDescriptionText();
    
    /**
     * Sets the "DescriptionText" element
     */
    void setDescriptionText(java.lang.String descriptionText);
    
    /**
     * Sets (as xml) the "DescriptionText" element
     */
    void xsetDescriptionText(org.apache.xmlbeans.XmlString descriptionText);
    
    /**
     * Gets the "DocumentEffectiveDate" element
     */
    java.lang.String getDocumentEffectiveDate();
    
    /**
     * Gets (as xml) the "DocumentEffectiveDate" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentEffectiveDate();
    
    /**
     * Sets the "DocumentEffectiveDate" element
     */
    void setDocumentEffectiveDate(java.lang.String documentEffectiveDate);
    
    /**
     * Sets (as xml) the "DocumentEffectiveDate" element
     */
    void xsetDocumentEffectiveDate(org.apache.xmlbeans.XmlString documentEffectiveDate);
    
    /**
     * Gets the "DocumentExpirationDate" element
     */
    java.lang.String getDocumentExpirationDate();
    
    /**
     * Gets (as xml) the "DocumentExpirationDate" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentExpirationDate();
    
    /**
     * Sets the "DocumentExpirationDate" element
     */
    void setDocumentExpirationDate(java.lang.String documentExpirationDate);
    
    /**
     * Sets (as xml) the "DocumentExpirationDate" element
     */
    void xsetDocumentExpirationDate(org.apache.xmlbeans.XmlString documentExpirationDate);
    
    /**
     * Gets the "Components" element
     */
    org.uicds.iapService.IAPComponentListType getComponents();
    
    /**
     * Sets the "Components" element
     */
    void setComponents(org.uicds.iapService.IAPComponentListType components);
    
    /**
     * Appends and returns a new empty "Components" element
     */
    org.uicds.iapService.IAPComponentListType addNewComponents();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.iapService.IncidentActionPlanType newInstance() {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.iapService.IncidentActionPlanType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.iapService.IncidentActionPlanType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.iapService.IncidentActionPlanType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.iapService.IncidentActionPlanType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.iapService.IncidentActionPlanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.iapService.IncidentActionPlanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.iapService.IncidentActionPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
