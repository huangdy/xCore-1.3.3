/*
 * XML Type:  StringListType
 * Namespace: http://uicds.org/UICDSCommon
 * Java type: org.uicds.uicdsCommon.StringListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.uicdsCommon;


/**
 * An XML StringListType(@http://uicds.org/UICDSCommon).
 *
 * This is a complex type.
 */
public interface StringListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StringListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("stringlisttypea0catype");
    
    /**
     * Gets array of all "StringValue" elements
     */
    java.lang.String[] getStringValue1Array();
    
    /**
     * Gets ith "StringValue" element
     */
    java.lang.String getStringValue1Array(int i);
    
    /**
     * Gets (as xml) array of all "StringValue" elements
     */
    org.apache.xmlbeans.XmlString[] xgetStringValue1Array();
    
    /**
     * Gets (as xml) ith "StringValue" element
     */
    org.apache.xmlbeans.XmlString xgetStringValue1Array(int i);
    
    /**
     * Returns number of "StringValue" element
     */
    int sizeOfStringValue1Array();
    
    /**
     * Sets array of all "StringValue" element
     */
    void setStringValue1Array(java.lang.String[] stringValue1Array);
    
    /**
     * Sets ith "StringValue" element
     */
    void setStringValue1Array(int i, java.lang.String stringValue1);
    
    /**
     * Sets (as xml) array of all "StringValue" element
     */
    void xsetStringValue1Array(org.apache.xmlbeans.XmlString[] stringValue1Array);
    
    /**
     * Sets (as xml) ith "StringValue" element
     */
    void xsetStringValue1Array(int i, org.apache.xmlbeans.XmlString stringValue1);
    
    /**
     * Inserts the value as the ith "StringValue" element
     */
    void insertStringValue1(int i, java.lang.String stringValue1);
    
    /**
     * Appends the value as the last "StringValue" element
     */
    void addStringValue1(java.lang.String stringValue1);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StringValue" element
     */
    org.apache.xmlbeans.XmlString insertNewStringValue1(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StringValue" element
     */
    org.apache.xmlbeans.XmlString addNewStringValue1();
    
    /**
     * Removes the ith "StringValue" element
     */
    void removeStringValue1(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.uicdsCommon.StringListType newInstance() {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.uicdsCommon.StringListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.uicdsCommon.StringListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.uicdsCommon.StringListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.uicdsCommon.StringListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.uicdsCommon.StringListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.uicdsCommon.StringListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.uicdsCommon.StringListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
