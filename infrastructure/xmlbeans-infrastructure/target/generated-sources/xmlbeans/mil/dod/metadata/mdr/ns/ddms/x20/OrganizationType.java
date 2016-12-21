/*
 * XML Type:  OrganizationType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20;


/**
 * An XML OrganizationType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public interface OrganizationType extends mil.dod.metadata.mdr.ns.ddms.x20.ProducerType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganizationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("organizationtype3679type");
    
    /**
     * Gets array of all "phone" elements
     */
    java.lang.String[] getPhoneArray();
    
    /**
     * Gets ith "phone" element
     */
    java.lang.String getPhoneArray(int i);
    
    /**
     * Gets (as xml) array of all "phone" elements
     */
    org.apache.xmlbeans.XmlString[] xgetPhoneArray();
    
    /**
     * Gets (as xml) ith "phone" element
     */
    org.apache.xmlbeans.XmlString xgetPhoneArray(int i);
    
    /**
     * Returns number of "phone" element
     */
    int sizeOfPhoneArray();
    
    /**
     * Sets array of all "phone" element
     */
    void setPhoneArray(java.lang.String[] phoneArray);
    
    /**
     * Sets ith "phone" element
     */
    void setPhoneArray(int i, java.lang.String phone);
    
    /**
     * Sets (as xml) array of all "phone" element
     */
    void xsetPhoneArray(org.apache.xmlbeans.XmlString[] phoneArray);
    
    /**
     * Sets (as xml) ith "phone" element
     */
    void xsetPhoneArray(int i, org.apache.xmlbeans.XmlString phone);
    
    /**
     * Inserts the value as the ith "phone" element
     */
    void insertPhone(int i, java.lang.String phone);
    
    /**
     * Appends the value as the last "phone" element
     */
    void addPhone(java.lang.String phone);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "phone" element
     */
    org.apache.xmlbeans.XmlString insertNewPhone(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "phone" element
     */
    org.apache.xmlbeans.XmlString addNewPhone();
    
    /**
     * Removes the ith "phone" element
     */
    void removePhone(int i);
    
    /**
     * Gets array of all "email" elements
     */
    java.lang.String[] getEmailArray();
    
    /**
     * Gets ith "email" element
     */
    java.lang.String getEmailArray(int i);
    
    /**
     * Gets (as xml) array of all "email" elements
     */
    org.apache.xmlbeans.XmlString[] xgetEmailArray();
    
    /**
     * Gets (as xml) ith "email" element
     */
    org.apache.xmlbeans.XmlString xgetEmailArray(int i);
    
    /**
     * Returns number of "email" element
     */
    int sizeOfEmailArray();
    
    /**
     * Sets array of all "email" element
     */
    void setEmailArray(java.lang.String[] emailArray);
    
    /**
     * Sets ith "email" element
     */
    void setEmailArray(int i, java.lang.String email);
    
    /**
     * Sets (as xml) array of all "email" element
     */
    void xsetEmailArray(org.apache.xmlbeans.XmlString[] emailArray);
    
    /**
     * Sets (as xml) ith "email" element
     */
    void xsetEmailArray(int i, org.apache.xmlbeans.XmlString email);
    
    /**
     * Inserts the value as the ith "email" element
     */
    void insertEmail(int i, java.lang.String email);
    
    /**
     * Appends the value as the last "email" element
     */
    void addEmail(java.lang.String email);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "email" element
     */
    org.apache.xmlbeans.XmlString insertNewEmail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "email" element
     */
    org.apache.xmlbeans.XmlString addNewEmail();
    
    /**
     * Removes the ith "email" element
     */
    void removeEmail(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType newInstance() {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
