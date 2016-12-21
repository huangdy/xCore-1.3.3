/*
 * XML Type:  requestParameterList
 * Namespace: http://gov.fema.dmopen.services/edxlrequest
 * Java type: services.dmopen.fema.gov.edxlrequest.RequestParameterList
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.edxlrequest;


/**
 * An XML requestParameterList(@http://gov.fema.dmopen.services/edxlrequest).
 *
 * This is a complex type.
 */
public interface RequestParameterList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestParameterList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("requestparameterlist913etype");
    
    /**
     * Gets the "requestAPI" element
     */
    java.lang.String getRequestAPI();
    
    /**
     * Gets (as xml) the "requestAPI" element
     */
    org.apache.xmlbeans.XmlString xgetRequestAPI();
    
    /**
     * True if has "requestAPI" element
     */
    boolean isSetRequestAPI();
    
    /**
     * Sets the "requestAPI" element
     */
    void setRequestAPI(java.lang.String requestAPI);
    
    /**
     * Sets (as xml) the "requestAPI" element
     */
    void xsetRequestAPI(org.apache.xmlbeans.XmlString requestAPI);
    
    /**
     * Unsets the "requestAPI" element
     */
    void unsetRequestAPI();
    
    /**
     * Gets the "requestOperation" element
     */
    java.lang.String getRequestOperation();
    
    /**
     * Gets (as xml) the "requestOperation" element
     */
    org.apache.xmlbeans.XmlString xgetRequestOperation();
    
    /**
     * True if has "requestOperation" element
     */
    boolean isSetRequestOperation();
    
    /**
     * Sets the "requestOperation" element
     */
    void setRequestOperation(java.lang.String requestOperation);
    
    /**
     * Sets (as xml) the "requestOperation" element
     */
    void xsetRequestOperation(org.apache.xmlbeans.XmlString requestOperation);
    
    /**
     * Unsets the "requestOperation" element
     */
    void unsetRequestOperation();
    
    /**
     * Gets array of all "parameters" elements
     */
    services.dmopen.fema.gov.edxlrequest.ParameterListItem[] getParametersArray();
    
    /**
     * Gets ith "parameters" element
     */
    services.dmopen.fema.gov.edxlrequest.ParameterListItem getParametersArray(int i);
    
    /**
     * Returns number of "parameters" element
     */
    int sizeOfParametersArray();
    
    /**
     * Sets array of all "parameters" element
     */
    void setParametersArray(services.dmopen.fema.gov.edxlrequest.ParameterListItem[] parametersArray);
    
    /**
     * Sets ith "parameters" element
     */
    void setParametersArray(int i, services.dmopen.fema.gov.edxlrequest.ParameterListItem parameters);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameters" element
     */
    services.dmopen.fema.gov.edxlrequest.ParameterListItem insertNewParameters(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameters" element
     */
    services.dmopen.fema.gov.edxlrequest.ParameterListItem addNewParameters();
    
    /**
     * Removes the ith "parameters" element
     */
    void removeParameters(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList newInstance() {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.edxlrequest.RequestParameterList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.edxlrequest.RequestParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
