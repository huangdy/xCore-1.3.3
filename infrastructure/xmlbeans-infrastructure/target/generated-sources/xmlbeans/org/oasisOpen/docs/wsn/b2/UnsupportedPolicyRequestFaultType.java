/*
 * XML Type:  UnsupportedPolicyRequestFaultType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2;


/**
 * An XML UnsupportedPolicyRequestFaultType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public interface UnsupportedPolicyRequestFaultType extends org.oasisOpen.docs.wsrf.bf2.BaseFaultType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnsupportedPolicyRequestFaultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("unsupportedpolicyrequestfaulttype85f3type");
    
    /**
     * Gets array of all "UnsupportedPolicy" elements
     */
    javax.xml.namespace.QName[] getUnsupportedPolicyArray();
    
    /**
     * Gets ith "UnsupportedPolicy" element
     */
    javax.xml.namespace.QName getUnsupportedPolicyArray(int i);
    
    /**
     * Gets (as xml) array of all "UnsupportedPolicy" elements
     */
    org.apache.xmlbeans.XmlQName[] xgetUnsupportedPolicyArray();
    
    /**
     * Gets (as xml) ith "UnsupportedPolicy" element
     */
    org.apache.xmlbeans.XmlQName xgetUnsupportedPolicyArray(int i);
    
    /**
     * Returns number of "UnsupportedPolicy" element
     */
    int sizeOfUnsupportedPolicyArray();
    
    /**
     * Sets array of all "UnsupportedPolicy" element
     */
    void setUnsupportedPolicyArray(javax.xml.namespace.QName[] unsupportedPolicyArray);
    
    /**
     * Sets ith "UnsupportedPolicy" element
     */
    void setUnsupportedPolicyArray(int i, javax.xml.namespace.QName unsupportedPolicy);
    
    /**
     * Sets (as xml) array of all "UnsupportedPolicy" element
     */
    void xsetUnsupportedPolicyArray(org.apache.xmlbeans.XmlQName[] unsupportedPolicyArray);
    
    /**
     * Sets (as xml) ith "UnsupportedPolicy" element
     */
    void xsetUnsupportedPolicyArray(int i, org.apache.xmlbeans.XmlQName unsupportedPolicy);
    
    /**
     * Inserts the value as the ith "UnsupportedPolicy" element
     */
    void insertUnsupportedPolicy(int i, javax.xml.namespace.QName unsupportedPolicy);
    
    /**
     * Appends the value as the last "UnsupportedPolicy" element
     */
    void addUnsupportedPolicy(javax.xml.namespace.QName unsupportedPolicy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnsupportedPolicy" element
     */
    org.apache.xmlbeans.XmlQName insertNewUnsupportedPolicy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UnsupportedPolicy" element
     */
    org.apache.xmlbeans.XmlQName addNewUnsupportedPolicy();
    
    /**
     * Removes the ith "UnsupportedPolicy" element
     */
    void removeUnsupportedPolicy(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType newInstance() {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
