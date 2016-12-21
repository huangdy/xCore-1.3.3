/*
 * XML Type:  FinanceAdministrationSectionType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.FinanceAdministrationSectionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203;


/**
 * An XML FinanceAdministrationSectionType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public interface FinanceAdministrationSectionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FinanceAdministrationSectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("financeadministrationsectiontypee5b5type");
    
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
     * Gets the "TimeUnit" element
     */
    java.lang.String getTimeUnit();
    
    /**
     * Gets (as xml) the "TimeUnit" element
     */
    org.apache.xmlbeans.XmlString xgetTimeUnit();
    
    /**
     * Sets the "TimeUnit" element
     */
    void setTimeUnit(java.lang.String timeUnit);
    
    /**
     * Sets (as xml) the "TimeUnit" element
     */
    void xsetTimeUnit(org.apache.xmlbeans.XmlString timeUnit);
    
    /**
     * Gets the "ProcurementUnit" element
     */
    java.lang.String getProcurementUnit();
    
    /**
     * Gets (as xml) the "ProcurementUnit" element
     */
    org.apache.xmlbeans.XmlString xgetProcurementUnit();
    
    /**
     * Sets the "ProcurementUnit" element
     */
    void setProcurementUnit(java.lang.String procurementUnit);
    
    /**
     * Sets (as xml) the "ProcurementUnit" element
     */
    void xsetProcurementUnit(org.apache.xmlbeans.XmlString procurementUnit);
    
    /**
     * Gets the "CompensationClaimsUnit" element
     */
    java.lang.String getCompensationClaimsUnit();
    
    /**
     * Gets (as xml) the "CompensationClaimsUnit" element
     */
    org.apache.xmlbeans.XmlString xgetCompensationClaimsUnit();
    
    /**
     * Sets the "CompensationClaimsUnit" element
     */
    void setCompensationClaimsUnit(java.lang.String compensationClaimsUnit);
    
    /**
     * Sets (as xml) the "CompensationClaimsUnit" element
     */
    void xsetCompensationClaimsUnit(org.apache.xmlbeans.XmlString compensationClaimsUnit);
    
    /**
     * Gets the "CostUnit" element
     */
    java.lang.String getCostUnit();
    
    /**
     * Gets (as xml) the "CostUnit" element
     */
    org.apache.xmlbeans.XmlString xgetCostUnit();
    
    /**
     * Sets the "CostUnit" element
     */
    void setCostUnit(java.lang.String costUnit);
    
    /**
     * Sets (as xml) the "CostUnit" element
     */
    void xsetCostUnit(org.apache.xmlbeans.XmlString costUnit);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm203.FinanceAdministrationSectionType newInstance() {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.FinanceAdministrationSectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.FinanceAdministrationSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
