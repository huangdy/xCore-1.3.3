/*
 * XML Type:  ContactRadioType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactRadioType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML ContactRadioType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface ContactRadioType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactRadioType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("contactradiotypeda5etype");
    
    /**
     * Gets array of all "ContactRadioCategoryText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getContactRadioCategoryTextArray();
    
    /**
     * Gets ith "ContactRadioCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType getContactRadioCategoryTextArray(int i);
    
    /**
     * Tests for nil ith "ContactRadioCategoryText" element
     */
    boolean isNilContactRadioCategoryTextArray(int i);
    
    /**
     * Returns number of "ContactRadioCategoryText" element
     */
    int sizeOfContactRadioCategoryTextArray();
    
    /**
     * Sets array of all "ContactRadioCategoryText" element
     */
    void setContactRadioCategoryTextArray(gov.niem.niem.niemCore.x20.TextType[] contactRadioCategoryTextArray);
    
    /**
     * Sets ith "ContactRadioCategoryText" element
     */
    void setContactRadioCategoryTextArray(int i, gov.niem.niem.niemCore.x20.TextType contactRadioCategoryText);
    
    /**
     * Nils the ith "ContactRadioCategoryText" element
     */
    void setNilContactRadioCategoryTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContactRadioCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewContactRadioCategoryText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContactRadioCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewContactRadioCategoryText();
    
    /**
     * Removes the ith "ContactRadioCategoryText" element
     */
    void removeContactRadioCategoryText(int i);
    
    /**
     * Gets array of all "ContactRadioChannelText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getContactRadioChannelTextArray();
    
    /**
     * Gets ith "ContactRadioChannelText" element
     */
    gov.niem.niem.niemCore.x20.TextType getContactRadioChannelTextArray(int i);
    
    /**
     * Tests for nil ith "ContactRadioChannelText" element
     */
    boolean isNilContactRadioChannelTextArray(int i);
    
    /**
     * Returns number of "ContactRadioChannelText" element
     */
    int sizeOfContactRadioChannelTextArray();
    
    /**
     * Sets array of all "ContactRadioChannelText" element
     */
    void setContactRadioChannelTextArray(gov.niem.niem.niemCore.x20.TextType[] contactRadioChannelTextArray);
    
    /**
     * Sets ith "ContactRadioChannelText" element
     */
    void setContactRadioChannelTextArray(int i, gov.niem.niem.niemCore.x20.TextType contactRadioChannelText);
    
    /**
     * Nils the ith "ContactRadioChannelText" element
     */
    void setNilContactRadioChannelTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContactRadioChannelText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewContactRadioChannelText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContactRadioChannelText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewContactRadioChannelText();
    
    /**
     * Removes the ith "ContactRadioChannelText" element
     */
    void removeContactRadioChannelText(int i);
    
    /**
     * Gets array of all "ContactRadioCallSignID" elements
     */
    gov.niem.niem.proxy.xsd.x20.String[] getContactRadioCallSignIDArray();
    
    /**
     * Gets ith "ContactRadioCallSignID" element
     */
    gov.niem.niem.proxy.xsd.x20.String getContactRadioCallSignIDArray(int i);
    
    /**
     * Tests for nil ith "ContactRadioCallSignID" element
     */
    boolean isNilContactRadioCallSignIDArray(int i);
    
    /**
     * Returns number of "ContactRadioCallSignID" element
     */
    int sizeOfContactRadioCallSignIDArray();
    
    /**
     * Sets array of all "ContactRadioCallSignID" element
     */
    void setContactRadioCallSignIDArray(gov.niem.niem.proxy.xsd.x20.String[] contactRadioCallSignIDArray);
    
    /**
     * Sets ith "ContactRadioCallSignID" element
     */
    void setContactRadioCallSignIDArray(int i, gov.niem.niem.proxy.xsd.x20.String contactRadioCallSignID);
    
    /**
     * Nils the ith "ContactRadioCallSignID" element
     */
    void setNilContactRadioCallSignIDArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContactRadioCallSignID" element
     */
    gov.niem.niem.proxy.xsd.x20.String insertNewContactRadioCallSignID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContactRadioCallSignID" element
     */
    gov.niem.niem.proxy.xsd.x20.String addNewContactRadioCallSignID();
    
    /**
     * Removes the ith "ContactRadioCallSignID" element
     */
    void removeContactRadioCallSignID(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.ContactRadioType newInstance() {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.ContactRadioType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.ContactRadioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
