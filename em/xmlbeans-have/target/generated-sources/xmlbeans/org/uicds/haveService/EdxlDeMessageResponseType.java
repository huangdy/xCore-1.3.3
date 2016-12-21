/*
 * XML Type:  EdxlDeMessageResponseType
 * Namespace: http://uicds.org/HAVEService
 * Java type: org.uicds.haveService.EdxlDeMessageResponseType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.haveService;


/**
 * An XML EdxlDeMessageResponseType(@http://uicds.org/HAVEService).
 *
 * This is a complex type.
 */
public interface EdxlDeMessageResponseType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EdxlDeMessageResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("edxldemessageresponsetype4e3btype");
    
    /**
     * Gets the "errorExists" element
     */
    boolean getErrorExists();
    
    /**
     * Gets (as xml) the "errorExists" element
     */
    org.apache.xmlbeans.XmlBoolean xgetErrorExists();
    
    /**
     * Sets the "errorExists" element
     */
    void setErrorExists(boolean errorExists);
    
    /**
     * Sets (as xml) the "errorExists" element
     */
    void xsetErrorExists(org.apache.xmlbeans.XmlBoolean errorExists);
    
    /**
     * Gets the "Digest" element
     */
    gov.ucore.ucore.x20.DigestType getDigest();
    
    /**
     * True if has "Digest" element
     */
    boolean isSetDigest();
    
    /**
     * Sets the "Digest" element
     */
    void setDigest(gov.ucore.ucore.x20.DigestType digest);
    
    /**
     * Appends and returns a new empty "Digest" element
     */
    gov.ucore.ucore.x20.DigestType addNewDigest();
    
    /**
     * Unsets the "Digest" element
     */
    void unsetDigest();
    
    /**
     * Gets the "errorString" element
     */
    java.lang.String getErrorString();
    
    /**
     * Gets (as xml) the "errorString" element
     */
    org.apache.xmlbeans.XmlString xgetErrorString();
    
    /**
     * True if has "errorString" element
     */
    boolean isSetErrorString();
    
    /**
     * Sets the "errorString" element
     */
    void setErrorString(java.lang.String errorString);
    
    /**
     * Sets (as xml) the "errorString" element
     */
    void xsetErrorString(org.apache.xmlbeans.XmlString errorString);
    
    /**
     * Unsets the "errorString" element
     */
    void unsetErrorString();
    
    /**
     * Gets array of all "coreError" elements
     */
    org.uicds.haveService.EdxlDeMessageErrorType[] getCoreErrorArray();
    
    /**
     * Gets ith "coreError" element
     */
    org.uicds.haveService.EdxlDeMessageErrorType getCoreErrorArray(int i);
    
    /**
     * Returns number of "coreError" element
     */
    int sizeOfCoreErrorArray();
    
    /**
     * Sets array of all "coreError" element
     */
    void setCoreErrorArray(org.uicds.haveService.EdxlDeMessageErrorType[] coreErrorArray);
    
    /**
     * Sets ith "coreError" element
     */
    void setCoreErrorArray(int i, org.uicds.haveService.EdxlDeMessageErrorType coreError);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coreError" element
     */
    org.uicds.haveService.EdxlDeMessageErrorType insertNewCoreError(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coreError" element
     */
    org.uicds.haveService.EdxlDeMessageErrorType addNewCoreError();
    
    /**
     * Removes the ith "coreError" element
     */
    void removeCoreError(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.haveService.EdxlDeMessageResponseType newInstance() {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.haveService.EdxlDeMessageResponseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.haveService.EdxlDeMessageResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
