/*
 * XML Type:  parameterListItem
 * Namespace: http://gov.fema.dmopen.services/caprequest
 * Java type: services.dmopen.fema.gov.caprequest.ParameterListItem
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.caprequest;


/**
 * An XML parameterListItem(@http://gov.fema.dmopen.services/caprequest).
 *
 * This is a complex type.
 */
public interface ParameterListItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterListItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("parameterlistitemcb8btype");
    
    /**
     * Gets the "parameterName" element
     */
    java.lang.String getParameterName();
    
    /**
     * Gets (as xml) the "parameterName" element
     */
    org.apache.xmlbeans.XmlString xgetParameterName();
    
    /**
     * True if has "parameterName" element
     */
    boolean isSetParameterName();
    
    /**
     * Sets the "parameterName" element
     */
    void setParameterName(java.lang.String parameterName);
    
    /**
     * Sets (as xml) the "parameterName" element
     */
    void xsetParameterName(org.apache.xmlbeans.XmlString parameterName);
    
    /**
     * Unsets the "parameterName" element
     */
    void unsetParameterName();
    
    /**
     * Gets the "comparisonOp" element
     */
    java.lang.String getComparisonOp();
    
    /**
     * Gets (as xml) the "comparisonOp" element
     */
    org.apache.xmlbeans.XmlString xgetComparisonOp();
    
    /**
     * True if has "comparisonOp" element
     */
    boolean isSetComparisonOp();
    
    /**
     * Sets the "comparisonOp" element
     */
    void setComparisonOp(java.lang.String comparisonOp);
    
    /**
     * Sets (as xml) the "comparisonOp" element
     */
    void xsetComparisonOp(org.apache.xmlbeans.XmlString comparisonOp);
    
    /**
     * Unsets the "comparisonOp" element
     */
    void unsetComparisonOp();
    
    /**
     * Gets array of all "parameterValue" elements
     */
    java.lang.String[] getParameterValueArray();
    
    /**
     * Gets ith "parameterValue" element
     */
    java.lang.String getParameterValueArray(int i);
    
    /**
     * Gets (as xml) array of all "parameterValue" elements
     */
    org.apache.xmlbeans.XmlString[] xgetParameterValueArray();
    
    /**
     * Gets (as xml) ith "parameterValue" element
     */
    org.apache.xmlbeans.XmlString xgetParameterValueArray(int i);
    
    /**
     * Returns number of "parameterValue" element
     */
    int sizeOfParameterValueArray();
    
    /**
     * Sets array of all "parameterValue" element
     */
    void setParameterValueArray(java.lang.String[] parameterValueArray);
    
    /**
     * Sets ith "parameterValue" element
     */
    void setParameterValueArray(int i, java.lang.String parameterValue);
    
    /**
     * Sets (as xml) array of all "parameterValue" element
     */
    void xsetParameterValueArray(org.apache.xmlbeans.XmlString[] parameterValueArray);
    
    /**
     * Sets (as xml) ith "parameterValue" element
     */
    void xsetParameterValueArray(int i, org.apache.xmlbeans.XmlString parameterValue);
    
    /**
     * Inserts the value as the ith "parameterValue" element
     */
    void insertParameterValue(int i, java.lang.String parameterValue);
    
    /**
     * Appends the value as the last "parameterValue" element
     */
    void addParameterValue(java.lang.String parameterValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterValue" element
     */
    org.apache.xmlbeans.XmlString insertNewParameterValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterValue" element
     */
    org.apache.xmlbeans.XmlString addNewParameterValue();
    
    /**
     * Removes the ith "parameterValue" element
     */
    void removeParameterValue(int i);
    
    /**
     * Gets the "logicalOp" element
     */
    java.lang.String getLogicalOp();
    
    /**
     * Gets (as xml) the "logicalOp" element
     */
    org.apache.xmlbeans.XmlString xgetLogicalOp();
    
    /**
     * True if has "logicalOp" element
     */
    boolean isSetLogicalOp();
    
    /**
     * Sets the "logicalOp" element
     */
    void setLogicalOp(java.lang.String logicalOp);
    
    /**
     * Sets (as xml) the "logicalOp" element
     */
    void xsetLogicalOp(org.apache.xmlbeans.XmlString logicalOp);
    
    /**
     * Unsets the "logicalOp" element
     */
    void unsetLogicalOp();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.dmopen.fema.gov.caprequest.ParameterListItem newInstance() {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.caprequest.ParameterListItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.caprequest.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
