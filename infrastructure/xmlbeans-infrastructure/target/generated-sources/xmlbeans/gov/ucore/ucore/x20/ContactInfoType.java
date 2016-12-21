/*
 * XML Type:  ContactInfoType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.ContactInfoType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20;


/**
 * An XML ContactInfoType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface ContactInfoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactInfoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("contactinfotypec94dtype");
    
    /**
     * Gets array of all "Email" elements
     */
    java.lang.String[] getEmailArray();
    
    /**
     * Gets ith "Email" element
     */
    java.lang.String getEmailArray(int i);
    
    /**
     * Gets (as xml) array of all "Email" elements
     */
    org.apache.xmlbeans.XmlString[] xgetEmailArray();
    
    /**
     * Gets (as xml) ith "Email" element
     */
    org.apache.xmlbeans.XmlString xgetEmailArray(int i);
    
    /**
     * Returns number of "Email" element
     */
    int sizeOfEmailArray();
    
    /**
     * Sets array of all "Email" element
     */
    void setEmailArray(java.lang.String[] emailArray);
    
    /**
     * Sets ith "Email" element
     */
    void setEmailArray(int i, java.lang.String email);
    
    /**
     * Sets (as xml) array of all "Email" element
     */
    void xsetEmailArray(org.apache.xmlbeans.XmlString[] emailArray);
    
    /**
     * Sets (as xml) ith "Email" element
     */
    void xsetEmailArray(int i, org.apache.xmlbeans.XmlString email);
    
    /**
     * Inserts the value as the ith "Email" element
     */
    void insertEmail(int i, java.lang.String email);
    
    /**
     * Appends the value as the last "Email" element
     */
    void addEmail(java.lang.String email);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Email" element
     */
    org.apache.xmlbeans.XmlString insertNewEmail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Email" element
     */
    org.apache.xmlbeans.XmlString addNewEmail();
    
    /**
     * Removes the ith "Email" element
     */
    void removeEmail(int i);
    
    /**
     * Gets array of all "Phone" elements
     */
    java.lang.String[] getPhoneArray();
    
    /**
     * Gets ith "Phone" element
     */
    java.lang.String getPhoneArray(int i);
    
    /**
     * Gets (as xml) array of all "Phone" elements
     */
    org.apache.xmlbeans.XmlString[] xgetPhoneArray();
    
    /**
     * Gets (as xml) ith "Phone" element
     */
    org.apache.xmlbeans.XmlString xgetPhoneArray(int i);
    
    /**
     * Returns number of "Phone" element
     */
    int sizeOfPhoneArray();
    
    /**
     * Sets array of all "Phone" element
     */
    void setPhoneArray(java.lang.String[] phoneArray);
    
    /**
     * Sets ith "Phone" element
     */
    void setPhoneArray(int i, java.lang.String phone);
    
    /**
     * Sets (as xml) array of all "Phone" element
     */
    void xsetPhoneArray(org.apache.xmlbeans.XmlString[] phoneArray);
    
    /**
     * Sets (as xml) ith "Phone" element
     */
    void xsetPhoneArray(int i, org.apache.xmlbeans.XmlString phone);
    
    /**
     * Inserts the value as the ith "Phone" element
     */
    void insertPhone(int i, java.lang.String phone);
    
    /**
     * Appends the value as the last "Phone" element
     */
    void addPhone(java.lang.String phone);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Phone" element
     */
    org.apache.xmlbeans.XmlString insertNewPhone(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Phone" element
     */
    org.apache.xmlbeans.XmlString addNewPhone();
    
    /**
     * Removes the ith "Phone" element
     */
    void removePhone(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore.x20.ContactInfoType newInstance() {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore.x20.ContactInfoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.ContactInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.ContactInfoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.ContactInfoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
