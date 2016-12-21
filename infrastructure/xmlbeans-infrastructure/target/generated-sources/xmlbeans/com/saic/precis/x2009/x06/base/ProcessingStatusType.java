/*
 * XML Type:  ProcessingStatusType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.ProcessingStatusType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base;


/**
 * An XML ProcessingStatusType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is a complex type.
 */
public interface ProcessingStatusType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessingStatusType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("processingstatustypef194type");
    
    /**
     * Gets the "Status" element
     */
    com.saic.precis.x2009.x06.base.ProcessingStateType.Enum getStatus();
    
    /**
     * Gets (as xml) the "Status" element
     */
    com.saic.precis.x2009.x06.base.ProcessingStateType xgetStatus();
    
    /**
     * Sets the "Status" element
     */
    void setStatus(com.saic.precis.x2009.x06.base.ProcessingStateType.Enum status);
    
    /**
     * Sets (as xml) the "Status" element
     */
    void xsetStatus(com.saic.precis.x2009.x06.base.ProcessingStateType status);
    
    /**
     * Gets the "ACT" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType getACT();
    
    /**
     * True if has "ACT" element
     */
    boolean isSetACT();
    
    /**
     * Sets the "ACT" element
     */
    void setACT(com.saic.precis.x2009.x06.base.IdentifierType act);
    
    /**
     * Appends and returns a new empty "ACT" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType addNewACT();
    
    /**
     * Unsets the "ACT" element
     */
    void unsetACT();
    
    /**
     * Gets the "Message" element
     */
    com.saic.precis.x2009.x06.base.UserMessageType getMessage();
    
    /**
     * True if has "Message" element
     */
    boolean isSetMessage();
    
    /**
     * Sets the "Message" element
     */
    void setMessage(com.saic.precis.x2009.x06.base.UserMessageType message);
    
    /**
     * Appends and returns a new empty "Message" element
     */
    com.saic.precis.x2009.x06.base.UserMessageType addNewMessage();
    
    /**
     * Unsets the "Message" element
     */
    void unsetMessage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType newInstance() {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.base.ProcessingStatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.base.ProcessingStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
