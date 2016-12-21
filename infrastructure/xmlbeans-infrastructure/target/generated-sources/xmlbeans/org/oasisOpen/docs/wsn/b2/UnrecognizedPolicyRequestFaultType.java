/*
 * XML Type:  UnrecognizedPolicyRequestFaultType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2;


/**
 * An XML UnrecognizedPolicyRequestFaultType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public interface UnrecognizedPolicyRequestFaultType extends org.oasisOpen.docs.wsrf.bf2.BaseFaultType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnrecognizedPolicyRequestFaultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("unrecognizedpolicyrequestfaulttyped587type");
    
    /**
     * Gets array of all "UnrecognizedPolicy" elements
     */
    javax.xml.namespace.QName[] getUnrecognizedPolicyArray();
    
    /**
     * Gets ith "UnrecognizedPolicy" element
     */
    javax.xml.namespace.QName getUnrecognizedPolicyArray(int i);
    
    /**
     * Gets (as xml) array of all "UnrecognizedPolicy" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetUnrecognizedPolicyArray();
    
    /**
     * Gets (as xml) ith "UnrecognizedPolicy" element
     */
    org.apache.xmlbeans.XmlQName xgetUnrecognizedPolicyArray(int i);
    
    /**
     * Returns number of "UnrecognizedPolicy" element
     */
    int sizeOfUnrecognizedPolicyArray();
    
    /**
     * Sets array of all "UnrecognizedPolicy" element
     */
    void setUnrecognizedPolicyArray(javax.xml.namespace.QName[] unrecognizedPolicyArray);
    
    /**
     * Sets ith "UnrecognizedPolicy" element
     */
    void setUnrecognizedPolicyArray(int i, javax.xml.namespace.QName unrecognizedPolicy);
    
    /**
     * Sets (as xml) array of all "UnrecognizedPolicy" element
     */
    void xsetUnrecognizedPolicyArray(org.apache.xmlbeans.XmlQName[] unrecognizedPolicyArray);
    
    /**
     * Sets (as xml) ith "UnrecognizedPolicy" element
     */
    void xsetUnrecognizedPolicyArray(int i, org.apache.xmlbeans.XmlQName unrecognizedPolicy);
    
    /**
     * Inserts the value as the ith "UnrecognizedPolicy" element
     */
    void insertUnrecognizedPolicy(int i, javax.xml.namespace.QName unrecognizedPolicy);
    
    /**
     * Appends the value as the last "UnrecognizedPolicy" element
     */
    void addUnrecognizedPolicy(javax.xml.namespace.QName unrecognizedPolicy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnrecognizedPolicy" element
     */
    org.apache.xmlbeans.XmlQName insertNewUnrecognizedPolicy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UnrecognizedPolicy" element
     */
    org.apache.xmlbeans.XmlQName addNewUnrecognizedPolicy();
    
    /**
     * Removes the ith "UnrecognizedPolicy" element
     */
    void removeUnrecognizedPolicy(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType newInstance() {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
