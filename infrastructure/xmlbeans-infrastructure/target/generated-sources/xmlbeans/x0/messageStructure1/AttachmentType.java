/*
 * XML Type:  AttachmentType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1;


/**
 * An XML AttachmentType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface AttachmentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttachmentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("attachmenttypea9c3type");
    
    /**
     * Gets the "AttachmentURI" element
     */
    java.lang.String getAttachmentURI();
    
    /**
     * Gets (as xml) the "AttachmentURI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetAttachmentURI();
    
    /**
     * Sets the "AttachmentURI" element
     */
    void setAttachmentURI(java.lang.String attachmentURI);
    
    /**
     * Sets (as xml) the "AttachmentURI" element
     */
    void xsetAttachmentURI(org.apache.xmlbeans.XmlAnyURI attachmentURI);
    
    /**
     * Gets the "AttachmentContentAbstract" element
     */
    org.apache.xmlbeans.XmlObject getAttachmentContentAbstract();
    
    /**
     * Sets the "AttachmentContentAbstract" element
     */
    void setAttachmentContentAbstract(org.apache.xmlbeans.XmlObject attachmentContentAbstract);
    
    /**
     * Appends and returns a new empty "AttachmentContentAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewAttachmentContentAbstract();
    
    /**
     * Gets the "DataOwnerMetadata" element
     */
    x0.messageStructure1.DataOwnerMetadataType getDataOwnerMetadata();
    
    /**
     * True if has "DataOwnerMetadata" element
     */
    boolean isSetDataOwnerMetadata();
    
    /**
     * Sets the "DataOwnerMetadata" element
     */
    void setDataOwnerMetadata(x0.messageStructure1.DataOwnerMetadataType dataOwnerMetadata);
    
    /**
     * Appends and returns a new empty "DataOwnerMetadata" element
     */
    x0.messageStructure1.DataOwnerMetadataType addNewDataOwnerMetadata();
    
    /**
     * Unsets the "DataOwnerMetadata" element
     */
    void unsetDataOwnerMetadata();
    
    /**
     * Gets array of all "AttachmentExtensionAbstract" elements
     */
    org.apache.xmlbeans.XmlObject[] getAttachmentExtensionAbstractArray();
    
    /**
     * Gets ith "AttachmentExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject getAttachmentExtensionAbstractArray(int i);
    
    /**
     * Returns number of "AttachmentExtensionAbstract" element
     */
    int sizeOfAttachmentExtensionAbstractArray();
    
    /**
     * Sets array of all "AttachmentExtensionAbstract" element
     */
    void setAttachmentExtensionAbstractArray(org.apache.xmlbeans.XmlObject[] attachmentExtensionAbstractArray);
    
    /**
     * Sets ith "AttachmentExtensionAbstract" element
     */
    void setAttachmentExtensionAbstractArray(int i, org.apache.xmlbeans.XmlObject attachmentExtensionAbstract);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject insertNewAttachmentExtensionAbstract(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewAttachmentExtensionAbstract();
    
    /**
     * Removes the ith "AttachmentExtensionAbstract" element
     */
    void removeAttachmentExtensionAbstract(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.messageStructure1.AttachmentType newInstance() {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.messageStructure1.AttachmentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.messageStructure1.AttachmentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.messageStructure1.AttachmentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.messageStructure1.AttachmentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.messageStructure1.AttachmentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.messageStructure1.AttachmentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.messageStructure1.AttachmentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.messageStructure1.AttachmentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.messageStructure1.AttachmentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.messageStructure1.AttachmentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.messageStructure1.AttachmentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.messageStructure1.AttachmentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.messageStructure1.AttachmentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.messageStructure1.AttachmentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.messageStructure1.AttachmentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.AttachmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.AttachmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.AttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}