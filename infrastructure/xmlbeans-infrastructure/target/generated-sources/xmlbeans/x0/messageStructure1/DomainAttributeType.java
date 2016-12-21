/*
 * XML Type:  DomainAttributeType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DomainAttributeType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1;


/**
 * An XML DomainAttributeType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface DomainAttributeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DomainAttributeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("domainattributetypef540type");
    
    /**
     * Gets the "AttributeName" element
     */
    java.lang.String getAttributeName();
    
    /**
     * Gets (as xml) the "AttributeName" element
     */
    org.apache.xmlbeans.XmlString xgetAttributeName();
    
    /**
     * True if has "AttributeName" element
     */
    boolean isSetAttributeName();
    
    /**
     * Sets the "AttributeName" element
     */
    void setAttributeName(java.lang.String attributeName);
    
    /**
     * Sets (as xml) the "AttributeName" element
     */
    void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName);
    
    /**
     * Unsets the "AttributeName" element
     */
    void unsetAttributeName();
    
    /**
     * Gets the "AttributeValue" element
     */
    java.lang.String getAttributeValue();
    
    /**
     * Gets (as xml) the "AttributeValue" element
     */
    org.apache.xmlbeans.XmlString xgetAttributeValue();
    
    /**
     * True if has "AttributeValue" element
     */
    boolean isSetAttributeValue();
    
    /**
     * Sets the "AttributeValue" element
     */
    void setAttributeValue(java.lang.String attributeValue);
    
    /**
     * Sets (as xml) the "AttributeValue" element
     */
    void xsetAttributeValue(org.apache.xmlbeans.XmlString attributeValue);
    
    /**
     * Unsets the "AttributeValue" element
     */
    void unsetAttributeValue();
    
    /**
     * Gets the "DomainName" element
     */
    java.lang.String getDomainName();
    
    /**
     * Gets (as xml) the "DomainName" element
     */
    org.apache.xmlbeans.XmlString xgetDomainName();
    
    /**
     * Sets the "DomainName" element
     */
    void setDomainName(java.lang.String domainName);
    
    /**
     * Sets (as xml) the "DomainName" element
     */
    void xsetDomainName(org.apache.xmlbeans.XmlString domainName);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.messageStructure1.DomainAttributeType newInstance() {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.messageStructure1.DomainAttributeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.messageStructure1.DomainAttributeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.messageStructure1.DomainAttributeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.messageStructure1.DomainAttributeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.DomainAttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.DomainAttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.DomainAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}