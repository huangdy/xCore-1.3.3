/*
 * XML Type:  PublishMessageType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PublishMessageType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1;


/**
 * An XML PublishMessageType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface PublishMessageType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublishMessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("publishmessagetype48cetype");
    
    /**
     * Gets the "PDMessageMetadata" element
     */
    x0.messageStructure1.PDMessageMetadataType getPDMessageMetadata();
    
    /**
     * Sets the "PDMessageMetadata" element
     */
    void setPDMessageMetadata(x0.messageStructure1.PDMessageMetadataType pdMessageMetadata);
    
    /**
     * Appends and returns a new empty "PDMessageMetadata" element
     */
    x0.messageStructure1.PDMessageMetadataType addNewPDMessageMetadata();
    
    /**
     * Gets the "DataSubmitterMetadata" element
     */
    x0.messageStructure1.SystemMetadataType getDataSubmitterMetadata();
    
    /**
     * Sets the "DataSubmitterMetadata" element
     */
    void setDataSubmitterMetadata(x0.messageStructure1.SystemMetadataType dataSubmitterMetadata);
    
    /**
     * Appends and returns a new empty "DataSubmitterMetadata" element
     */
    x0.messageStructure1.SystemMetadataType addNewDataSubmitterMetadata();
    
    /**
     * Gets array of all "PublishMessageItemAbstract" elements
     */
    org.apache.xmlbeans.XmlObject[] getPublishMessageItemAbstractArray();
    
    /**
     * Gets ith "PublishMessageItemAbstract" element
     */
    org.apache.xmlbeans.XmlObject getPublishMessageItemAbstractArray(int i);
    
    /**
     * Returns number of "PublishMessageItemAbstract" element
     */
    int sizeOfPublishMessageItemAbstractArray();
    
    /**
     * Sets array of all "PublishMessageItemAbstract" element
     */
    void setPublishMessageItemAbstractArray(org.apache.xmlbeans.XmlObject[] publishMessageItemAbstractArray);
    
    /**
     * Sets ith "PublishMessageItemAbstract" element
     */
    void setPublishMessageItemAbstractArray(int i, org.apache.xmlbeans.XmlObject publishMessageItemAbstract);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PublishMessageItemAbstract" element
     */
    org.apache.xmlbeans.XmlObject insertNewPublishMessageItemAbstract(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PublishMessageItemAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewPublishMessageItemAbstract();
    
    /**
     * Removes the ith "PublishMessageItemAbstract" element
     */
    void removePublishMessageItemAbstract(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.messageStructure1.PublishMessageType newInstance() {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.messageStructure1.PublishMessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.messageStructure1.PublishMessageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.messageStructure1.PublishMessageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.messageStructure1.PublishMessageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.messageStructure1.PublishMessageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.messageStructure1.PublishMessageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.messageStructure1.PublishMessageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.messageStructure1.PublishMessageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.messageStructure1.PublishMessageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.messageStructure1.PublishMessageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.messageStructure1.PublishMessageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.messageStructure1.PublishMessageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.messageStructure1.PublishMessageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.messageStructure1.PublishMessageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.messageStructure1.PublishMessageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.PublishMessageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.PublishMessageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.PublishMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
