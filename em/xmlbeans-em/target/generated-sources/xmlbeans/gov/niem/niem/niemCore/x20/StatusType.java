/*
 * XML Type:  StatusType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StatusType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML StatusType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface StatusType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StatusType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("statustype8b87type");
    
    /**
     * Gets array of all "StatusDate" elements
     */
    gov.niem.niem.niemCore.x20.DateType[] getStatusDateArray();
    
    /**
     * Gets ith "StatusDate" element
     */
    gov.niem.niem.niemCore.x20.DateType getStatusDateArray(int i);
    
    /**
     * Tests for nil ith "StatusDate" element
     */
    boolean isNilStatusDateArray(int i);
    
    /**
     * Returns number of "StatusDate" element
     */
    int sizeOfStatusDateArray();
    
    /**
     * Sets array of all "StatusDate" element
     */
    void setStatusDateArray(gov.niem.niem.niemCore.x20.DateType[] statusDateArray);
    
    /**
     * Sets ith "StatusDate" element
     */
    void setStatusDateArray(int i, gov.niem.niem.niemCore.x20.DateType statusDate);
    
    /**
     * Nils the ith "StatusDate" element
     */
    void setNilStatusDateArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatusDate" element
     */
    gov.niem.niem.niemCore.x20.DateType insertNewStatusDate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StatusDate" element
     */
    gov.niem.niem.niemCore.x20.DateType addNewStatusDate();
    
    /**
     * Removes the ith "StatusDate" element
     */
    void removeStatusDate(int i);
    
    /**
     * Gets array of all "StatusDescriptionText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getStatusDescriptionTextArray();
    
    /**
     * Gets ith "StatusDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType getStatusDescriptionTextArray(int i);
    
    /**
     * Tests for nil ith "StatusDescriptionText" element
     */
    boolean isNilStatusDescriptionTextArray(int i);
    
    /**
     * Returns number of "StatusDescriptionText" element
     */
    int sizeOfStatusDescriptionTextArray();
    
    /**
     * Sets array of all "StatusDescriptionText" element
     */
    void setStatusDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] statusDescriptionTextArray);
    
    /**
     * Sets ith "StatusDescriptionText" element
     */
    void setStatusDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType statusDescriptionText);
    
    /**
     * Nils the ith "StatusDescriptionText" element
     */
    void setNilStatusDescriptionTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatusDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewStatusDescriptionText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StatusDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewStatusDescriptionText();
    
    /**
     * Removes the ith "StatusDescriptionText" element
     */
    void removeStatusDescriptionText(int i);
    
    /**
     * Gets array of all "StatusIssuerIdentification" elements
     */
    gov.niem.niem.niemCore.x20.IdentificationType[] getStatusIssuerIdentificationArray();
    
    /**
     * Gets ith "StatusIssuerIdentification" element
     */
    gov.niem.niem.niemCore.x20.IdentificationType getStatusIssuerIdentificationArray(int i);
    
    /**
     * Tests for nil ith "StatusIssuerIdentification" element
     */
    boolean isNilStatusIssuerIdentificationArray(int i);
    
    /**
     * Returns number of "StatusIssuerIdentification" element
     */
    int sizeOfStatusIssuerIdentificationArray();
    
    /**
     * Sets array of all "StatusIssuerIdentification" element
     */
    void setStatusIssuerIdentificationArray(gov.niem.niem.niemCore.x20.IdentificationType[] statusIssuerIdentificationArray);
    
    /**
     * Sets ith "StatusIssuerIdentification" element
     */
    void setStatusIssuerIdentificationArray(int i, gov.niem.niem.niemCore.x20.IdentificationType statusIssuerIdentification);
    
    /**
     * Nils the ith "StatusIssuerIdentification" element
     */
    void setNilStatusIssuerIdentificationArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatusIssuerIdentification" element
     */
    gov.niem.niem.niemCore.x20.IdentificationType insertNewStatusIssuerIdentification(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StatusIssuerIdentification" element
     */
    gov.niem.niem.niemCore.x20.IdentificationType addNewStatusIssuerIdentification();
    
    /**
     * Removes the ith "StatusIssuerIdentification" element
     */
    void removeStatusIssuerIdentification(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.StatusType newInstance() {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.StatusType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.StatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.StatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.StatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
