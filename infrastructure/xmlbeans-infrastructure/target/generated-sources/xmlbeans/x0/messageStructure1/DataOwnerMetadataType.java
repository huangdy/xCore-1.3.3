/*
 * XML Type:  DataOwnerMetadataType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataOwnerMetadataType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1;


/**
 * An XML DataOwnerMetadataType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface DataOwnerMetadataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataOwnerMetadataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("dataownermetadatatype5dc0type");
    
    /**
     * Gets the "DataOwnerIdentifierAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDataOwnerIdentifierAbstract();
    
    /**
     * Sets the "DataOwnerIdentifierAbstract" element
     */
    void setDataOwnerIdentifierAbstract(org.apache.xmlbeans.XmlObject dataOwnerIdentifierAbstract);
    
    /**
     * Appends and returns a new empty "DataOwnerIdentifierAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDataOwnerIdentifierAbstract();
    
    /**
     * Gets the "DataOwnerContactAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDataOwnerContactAbstract();
    
    /**
     * Sets the "DataOwnerContactAbstract" element
     */
    void setDataOwnerContactAbstract(org.apache.xmlbeans.XmlObject dataOwnerContactAbstract);
    
    /**
     * Appends and returns a new empty "DataOwnerContactAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDataOwnerContactAbstract();
    
    /**
     * Gets array of all "DataOwnerMetadataExtensionAbstract" elements
     */
    org.apache.xmlbeans.XmlObject[] getDataOwnerMetadataExtensionAbstractArray();
    
    /**
     * Gets ith "DataOwnerMetadataExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDataOwnerMetadataExtensionAbstractArray(int i);
    
    /**
     * Returns number of "DataOwnerMetadataExtensionAbstract" element
     */
    int sizeOfDataOwnerMetadataExtensionAbstractArray();
    
    /**
     * Sets array of all "DataOwnerMetadataExtensionAbstract" element
     */
    void setDataOwnerMetadataExtensionAbstractArray(org.apache.xmlbeans.XmlObject[] dataOwnerMetadataExtensionAbstractArray);
    
    /**
     * Sets ith "DataOwnerMetadataExtensionAbstract" element
     */
    void setDataOwnerMetadataExtensionAbstractArray(int i, org.apache.xmlbeans.XmlObject dataOwnerMetadataExtensionAbstract);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataOwnerMetadataExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject insertNewDataOwnerMetadataExtensionAbstract(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataOwnerMetadataExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDataOwnerMetadataExtensionAbstract();
    
    /**
     * Removes the ith "DataOwnerMetadataExtensionAbstract" element
     */
    void removeDataOwnerMetadataExtensionAbstract(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.messageStructure1.DataOwnerMetadataType newInstance() {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.messageStructure1.DataOwnerMetadataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.DataOwnerMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.DataOwnerMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.DataOwnerMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
