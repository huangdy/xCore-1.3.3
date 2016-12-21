/*
 * XML Type:  PackageAbstractType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PackageAbstractType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1;


/**
 * An XML PackageAbstractType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface PackageAbstractType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackageAbstractType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("packageabstracttype1af0type");
    
    /**
     * Gets the "PackageMetadata" element
     */
    x0.messageStructure1.PackageMetadataType getPackageMetadata();
    
    /**
     * Sets the "PackageMetadata" element
     */
    void setPackageMetadata(x0.messageStructure1.PackageMetadataType packageMetadata);
    
    /**
     * Appends and returns a new empty "PackageMetadata" element
     */
    x0.messageStructure1.PackageMetadataType addNewPackageMetadata();
    
    /**
     * Gets the "DigestAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDigestAbstract();
    
    /**
     * True if has "DigestAbstract" element
     */
    boolean isSetDigestAbstract();
    
    /**
     * Sets the "DigestAbstract" element
     */
    void setDigestAbstract(org.apache.xmlbeans.XmlObject digestAbstract);
    
    /**
     * Appends and returns a new empty "DigestAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDigestAbstract();
    
    /**
     * Unsets the "DigestAbstract" element
     */
    void unsetDigestAbstract();
    
    /**
     * Gets array of all "StructuredPayload" elements
     */
    x0.messageStructure1.StructuredPayloadType[] getStructuredPayloadArray();
    
    /**
     * Gets ith "StructuredPayload" element
     */
    x0.messageStructure1.StructuredPayloadType getStructuredPayloadArray(int i);
    
    /**
     * Returns number of "StructuredPayload" element
     */
    int sizeOfStructuredPayloadArray();
    
    /**
     * Sets array of all "StructuredPayload" element
     */
    void setStructuredPayloadArray(x0.messageStructure1.StructuredPayloadType[] structuredPayloadArray);
    
    /**
     * Sets ith "StructuredPayload" element
     */
    void setStructuredPayloadArray(int i, x0.messageStructure1.StructuredPayloadType structuredPayload);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredPayload" element
     */
    x0.messageStructure1.StructuredPayloadType insertNewStructuredPayload(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuredPayload" element
     */
    x0.messageStructure1.StructuredPayloadType addNewStructuredPayload();
    
    /**
     * Removes the ith "StructuredPayload" element
     */
    void removeStructuredPayload(int i);
    
    /**
     * Gets array of all "AttachmentLink" elements
     */
    x0.messageStructure1.AttachmentLinkType[] getAttachmentLinkArray();
    
    /**
     * Gets ith "AttachmentLink" element
     */
    x0.messageStructure1.AttachmentLinkType getAttachmentLinkArray(int i);
    
    /**
     * Returns number of "AttachmentLink" element
     */
    int sizeOfAttachmentLinkArray();
    
    /**
     * Sets array of all "AttachmentLink" element
     */
    void setAttachmentLinkArray(x0.messageStructure1.AttachmentLinkType[] attachmentLinkArray);
    
    /**
     * Sets ith "AttachmentLink" element
     */
    void setAttachmentLinkArray(int i, x0.messageStructure1.AttachmentLinkType attachmentLink);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentLink" element
     */
    x0.messageStructure1.AttachmentLinkType insertNewAttachmentLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentLink" element
     */
    x0.messageStructure1.AttachmentLinkType addNewAttachmentLink();
    
    /**
     * Removes the ith "AttachmentLink" element
     */
    void removeAttachmentLink(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static x0.messageStructure1.PackageAbstractType newInstance() {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static x0.messageStructure1.PackageAbstractType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.messageStructure1.PackageAbstractType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.messageStructure1.PackageAbstractType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.messageStructure1.PackageAbstractType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.PackageAbstractType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.PackageAbstractType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.PackageAbstractType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
