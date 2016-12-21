/*
 * XML Type:  responseParameterList
 * Namespace: http://gov.fema.dmopen.services/edxlresponse
 * Java type: services.dmopen.fema.gov.edxlresponse.ResponseParameterList
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.edxlresponse;


/**
 * An XML responseParameterList(@http://gov.fema.dmopen.services/edxlresponse).
 *
 * This is a complex type.
 */
public interface ResponseParameterList extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseParameterList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("responseparameterlistcc16type");
    
    /**
     * Gets array of all "parameterListItem" elements
     */
    services.dmopen.fema.gov.edxlresponse.ParameterListItem[] getParameterListItemArray();
    
    /**
     * Gets ith "parameterListItem" element
     */
    services.dmopen.fema.gov.edxlresponse.ParameterListItem getParameterListItemArray(int i);
    
    /**
     * Returns number of "parameterListItem" element
     */
    int sizeOfParameterListItemArray();
    
    /**
     * Sets array of all "parameterListItem" element
     */
    void setParameterListItemArray(services.dmopen.fema.gov.edxlresponse.ParameterListItem[] parameterListItemArray);
    
    /**
     * Sets ith "parameterListItem" element
     */
    void setParameterListItemArray(int i, services.dmopen.fema.gov.edxlresponse.ParameterListItem parameterListItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterListItem" element
     */
    services.dmopen.fema.gov.edxlresponse.ParameterListItem insertNewParameterListItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterListItem" element
     */
    services.dmopen.fema.gov.edxlresponse.ParameterListItem addNewParameterListItem();
    
    /**
     * Removes the ith "parameterListItem" element
     */
    void removeParameterListItem(int i);
    
    /**
     * Gets the "ResponseOperation" element
     */
    java.lang.String getResponseOperation();
    
    /**
     * Gets (as xml) the "ResponseOperation" element
     */
    org.apache.xmlbeans.XmlString xgetResponseOperation();
    
    /**
     * True if has "ResponseOperation" element
     */
    boolean isSetResponseOperation();
    
    /**
     * Sets the "ResponseOperation" element
     */
    void setResponseOperation(java.lang.String responseOperation);
    
    /**
     * Sets (as xml) the "ResponseOperation" element
     */
    void xsetResponseOperation(org.apache.xmlbeans.XmlString responseOperation);
    
    /**
     * Unsets the "ResponseOperation" element
     */
    void unsetResponseOperation();
    
    /**
     * Gets the "ResponseType" element
     */
    java.lang.String getResponseType();
    
    /**
     * Gets (as xml) the "ResponseType" element
     */
    org.apache.xmlbeans.XmlString xgetResponseType();
    
    /**
     * True if has "ResponseType" element
     */
    boolean isSetResponseType();
    
    /**
     * Sets the "ResponseType" element
     */
    void setResponseType(java.lang.String responseType);
    
    /**
     * Sets (as xml) the "ResponseType" element
     */
    void xsetResponseType(org.apache.xmlbeans.XmlString responseType);
    
    /**
     * Unsets the "ResponseType" element
     */
    void unsetResponseType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList newInstance() {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.edxlresponse.ResponseParameterList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.edxlresponse.ResponseParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
