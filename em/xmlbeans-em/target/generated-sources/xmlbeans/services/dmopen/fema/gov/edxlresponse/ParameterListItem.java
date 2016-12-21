/*
 * XML Type:  parameterListItem
 * Namespace: http://gov.fema.dmopen.services/edxlresponse
 * Java type: services.dmopen.fema.gov.edxlresponse.ParameterListItem
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.edxlresponse;


/**
 * An XML parameterListItem(@http://gov.fema.dmopen.services/edxlresponse).
 *
 * This is a complex type.
 */
public interface ParameterListItem extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterListItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("parameterlistitem5ea2type");
    
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
     * Gets the "parameterValue" element
     */
    java.lang.String getParameterValue();
    
    /**
     * Gets (as xml) the "parameterValue" element
     */
    org.apache.xmlbeans.XmlString xgetParameterValue();
    
    /**
     * True if has "parameterValue" element
     */
    boolean isSetParameterValue();
    
    /**
     * Sets the "parameterValue" element
     */
    void setParameterValue(java.lang.String parameterValue);
    
    /**
     * Sets (as xml) the "parameterValue" element
     */
    void xsetParameterValue(org.apache.xmlbeans.XmlString parameterValue);
    
    /**
     * Unsets the "parameterValue" element
     */
    void unsetParameterValue();
    
    /**
     * Gets array of all "subParaListItem" elements
     */
    services.dmopen.fema.gov.edxlresponse.SubParameterListItem[] getSubParaListItemArray();
    
    /**
     * Gets ith "subParaListItem" element
     */
    services.dmopen.fema.gov.edxlresponse.SubParameterListItem getSubParaListItemArray(int i);
    
    /**
     * Returns number of "subParaListItem" element
     */
    int sizeOfSubParaListItemArray();
    
    /**
     * Sets array of all "subParaListItem" element
     */
    void setSubParaListItemArray(services.dmopen.fema.gov.edxlresponse.SubParameterListItem[] subParaListItemArray);
    
    /**
     * Sets ith "subParaListItem" element
     */
    void setSubParaListItemArray(int i, services.dmopen.fema.gov.edxlresponse.SubParameterListItem subParaListItem);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subParaListItem" element
     */
    services.dmopen.fema.gov.edxlresponse.SubParameterListItem insertNewSubParaListItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subParaListItem" element
     */
    services.dmopen.fema.gov.edxlresponse.SubParameterListItem addNewSubParaListItem();
    
    /**
     * Removes the ith "subParaListItem" element
     */
    void removeSubParaListItem(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem newInstance() {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.edxlresponse.ParameterListItem parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.edxlresponse.ParameterListItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
