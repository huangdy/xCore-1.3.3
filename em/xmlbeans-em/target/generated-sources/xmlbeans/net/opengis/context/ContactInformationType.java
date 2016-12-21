/*
 * XML Type:  ContactInformationType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.ContactInformationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context;


/**
 * An XML ContactInformationType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public interface ContactInformationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("contactinformationtypeae3etype");
    
    /**
     * Gets the "ContactPersonPrimary" element
     */
    net.opengis.context.ContactPersonPrimaryType getContactPersonPrimary();
    
    /**
     * True if has "ContactPersonPrimary" element
     */
    boolean isSetContactPersonPrimary();
    
    /**
     * Sets the "ContactPersonPrimary" element
     */
    void setContactPersonPrimary(net.opengis.context.ContactPersonPrimaryType contactPersonPrimary);
    
    /**
     * Appends and returns a new empty "ContactPersonPrimary" element
     */
    net.opengis.context.ContactPersonPrimaryType addNewContactPersonPrimary();
    
    /**
     * Unsets the "ContactPersonPrimary" element
     */
    void unsetContactPersonPrimary();
    
    /**
     * Gets the "ContactPosition" element
     */
    java.lang.String getContactPosition();
    
    /**
     * Gets (as xml) the "ContactPosition" element
     */
    org.apache.xmlbeans.XmlString xgetContactPosition();
    
    /**
     * True if has "ContactPosition" element
     */
    boolean isSetContactPosition();
    
    /**
     * Sets the "ContactPosition" element
     */
    void setContactPosition(java.lang.String contactPosition);
    
    /**
     * Sets (as xml) the "ContactPosition" element
     */
    void xsetContactPosition(org.apache.xmlbeans.XmlString contactPosition);
    
    /**
     * Unsets the "ContactPosition" element
     */
    void unsetContactPosition();
    
    /**
     * Gets the "ContactAddress" element
     */
    net.opengis.context.AddressType getContactAddress();
    
    /**
     * True if has "ContactAddress" element
     */
    boolean isSetContactAddress();
    
    /**
     * Sets the "ContactAddress" element
     */
    void setContactAddress(net.opengis.context.AddressType contactAddress);
    
    /**
     * Appends and returns a new empty "ContactAddress" element
     */
    net.opengis.context.AddressType addNewContactAddress();
    
    /**
     * Unsets the "ContactAddress" element
     */
    void unsetContactAddress();
    
    /**
     * Gets the "ContactVoiceTelephone" element
     */
    java.lang.String getContactVoiceTelephone();
    
    /**
     * Gets (as xml) the "ContactVoiceTelephone" element
     */
    org.apache.xmlbeans.XmlString xgetContactVoiceTelephone();
    
    /**
     * True if has "ContactVoiceTelephone" element
     */
    boolean isSetContactVoiceTelephone();
    
    /**
     * Sets the "ContactVoiceTelephone" element
     */
    void setContactVoiceTelephone(java.lang.String contactVoiceTelephone);
    
    /**
     * Sets (as xml) the "ContactVoiceTelephone" element
     */
    void xsetContactVoiceTelephone(org.apache.xmlbeans.XmlString contactVoiceTelephone);
    
    /**
     * Unsets the "ContactVoiceTelephone" element
     */
    void unsetContactVoiceTelephone();
    
    /**
     * Gets the "ContactFacsimileTelephone" element
     */
    java.lang.String getContactFacsimileTelephone();
    
    /**
     * Gets (as xml) the "ContactFacsimileTelephone" element
     */
    org.apache.xmlbeans.XmlString xgetContactFacsimileTelephone();
    
    /**
     * True if has "ContactFacsimileTelephone" element
     */
    boolean isSetContactFacsimileTelephone();
    
    /**
     * Sets the "ContactFacsimileTelephone" element
     */
    void setContactFacsimileTelephone(java.lang.String contactFacsimileTelephone);
    
    /**
     * Sets (as xml) the "ContactFacsimileTelephone" element
     */
    void xsetContactFacsimileTelephone(org.apache.xmlbeans.XmlString contactFacsimileTelephone);
    
    /**
     * Unsets the "ContactFacsimileTelephone" element
     */
    void unsetContactFacsimileTelephone();
    
    /**
     * Gets the "ContactElectronicMailAddress" element
     */
    java.lang.String getContactElectronicMailAddress();
    
    /**
     * Gets (as xml) the "ContactElectronicMailAddress" element
     */
    org.apache.xmlbeans.XmlString xgetContactElectronicMailAddress();
    
    /**
     * True if has "ContactElectronicMailAddress" element
     */
    boolean isSetContactElectronicMailAddress();
    
    /**
     * Sets the "ContactElectronicMailAddress" element
     */
    void setContactElectronicMailAddress(java.lang.String contactElectronicMailAddress);
    
    /**
     * Sets (as xml) the "ContactElectronicMailAddress" element
     */
    void xsetContactElectronicMailAddress(org.apache.xmlbeans.XmlString contactElectronicMailAddress);
    
    /**
     * Unsets the "ContactElectronicMailAddress" element
     */
    void unsetContactElectronicMailAddress();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.context.ContactInformationType newInstance() {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.context.ContactInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.context.ContactInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.context.ContactInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.context.ContactInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.context.ContactInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.context.ContactInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.context.ContactInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.context.ContactInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.context.ContactInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.context.ContactInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.context.ContactInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.context.ContactInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.context.ContactInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.context.ContactInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.context.ContactInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.ContactInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.ContactInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.ContactInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
