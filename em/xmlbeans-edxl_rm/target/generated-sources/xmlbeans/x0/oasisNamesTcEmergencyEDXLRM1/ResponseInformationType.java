/*
 * XML Type:  ResponseInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1;


/**
 * An XML ResponseInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public interface ResponseInformationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("responseinformationtype9e95type");
    
    /**
     * Gets the "PrecedingResourceInfoElementID" element
     */
    java.lang.String getPrecedingResourceInfoElementID();
    
    /**
     * Gets (as xml) the "PrecedingResourceInfoElementID" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType xgetPrecedingResourceInfoElementID();
    
    /**
     * Sets the "PrecedingResourceInfoElementID" element
     */
    void setPrecedingResourceInfoElementID(java.lang.String precedingResourceInfoElementID);
    
    /**
     * Sets (as xml) the "PrecedingResourceInfoElementID" element
     */
    void xsetPrecedingResourceInfoElementID(x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType precedingResourceInfoElementID);
    
    /**
     * Gets the "ResponseType" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType.Enum getResponseType();
    
    /**
     * Gets (as xml) the "ResponseType" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType xgetResponseType();
    
    /**
     * Sets the "ResponseType" element
     */
    void setResponseType(x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType.Enum responseType);
    
    /**
     * Sets (as xml) the "ResponseType" element
     */
    void xsetResponseType(x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType responseType);
    
    /**
     * Gets the "ReasonCode" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getReasonCode();
    
    /**
     * True if has "ReasonCode" element
     */
    boolean isSetReasonCode();
    
    /**
     * Sets the "ReasonCode" element
     */
    void setReasonCode(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType reasonCode);
    
    /**
     * Appends and returns a new empty "ReasonCode" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewReasonCode();
    
    /**
     * Unsets the "ReasonCode" element
     */
    void unsetReasonCode();
    
    /**
     * Gets the "ResponseReason" element
     */
    java.lang.String getResponseReason();
    
    /**
     * Gets (as xml) the "ResponseReason" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType xgetResponseReason();
    
    /**
     * True if has "ResponseReason" element
     */
    boolean isSetResponseReason();
    
    /**
     * Sets the "ResponseReason" element
     */
    void setResponseReason(java.lang.String responseReason);
    
    /**
     * Sets (as xml) the "ResponseReason" element
     */
    void xsetResponseReason(x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType responseReason);
    
    /**
     * Unsets the "ResponseReason" element
     */
    void unsetResponseReason();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
