/*
 * XML Type:  PropertiesType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.PropertiesType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base;


/**
 * An XML PropertiesType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is a complex type.
 */
public interface PropertiesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertiesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("propertiestypeeba2type");
    
    /**
     * Gets the "Created" element
     */
    com.saic.precis.x2009.x06.base.DateTimeType getCreated();
    
    /**
     * True if has "Created" element
     */
    boolean isSetCreated();
    
    /**
     * Sets the "Created" element
     */
    void setCreated(com.saic.precis.x2009.x06.base.DateTimeType created);
    
    /**
     * Appends and returns a new empty "Created" element
     */
    com.saic.precis.x2009.x06.base.DateTimeType addNewCreated();
    
    /**
     * Unsets the "Created" element
     */
    void unsetCreated();
    
    /**
     * Gets the "CreatedBy" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType getCreatedBy();
    
    /**
     * True if has "CreatedBy" element
     */
    boolean isSetCreatedBy();
    
    /**
     * Sets the "CreatedBy" element
     */
    void setCreatedBy(com.saic.precis.x2009.x06.base.IdentifierType createdBy);
    
    /**
     * Appends and returns a new empty "CreatedBy" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType addNewCreatedBy();
    
    /**
     * Unsets the "CreatedBy" element
     */
    void unsetCreatedBy();
    
    /**
     * Gets the "LastUpdated" element
     */
    com.saic.precis.x2009.x06.base.DateTimeType getLastUpdated();
    
    /**
     * True if has "LastUpdated" element
     */
    boolean isSetLastUpdated();
    
    /**
     * Sets the "LastUpdated" element
     */
    void setLastUpdated(com.saic.precis.x2009.x06.base.DateTimeType lastUpdated);
    
    /**
     * Appends and returns a new empty "LastUpdated" element
     */
    com.saic.precis.x2009.x06.base.DateTimeType addNewLastUpdated();
    
    /**
     * Unsets the "LastUpdated" element
     */
    void unsetLastUpdated();
    
    /**
     * Gets the "LastUpdatedBy" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType getLastUpdatedBy();
    
    /**
     * True if has "LastUpdatedBy" element
     */
    boolean isSetLastUpdatedBy();
    
    /**
     * Sets the "LastUpdatedBy" element
     */
    void setLastUpdatedBy(com.saic.precis.x2009.x06.base.IdentifierType lastUpdatedBy);
    
    /**
     * Appends and returns a new empty "LastUpdatedBy" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType addNewLastUpdatedBy();
    
    /**
     * Unsets the "LastUpdatedBy" element
     */
    void unsetLastUpdatedBy();
    
    /**
     * Gets the "Kilobytes" element
     */
    com.saic.precis.x2009.x06.base.IntegerType getKilobytes();
    
    /**
     * True if has "Kilobytes" element
     */
    boolean isSetKilobytes();
    
    /**
     * Sets the "Kilobytes" element
     */
    void setKilobytes(com.saic.precis.x2009.x06.base.IntegerType kilobytes);
    
    /**
     * Appends and returns a new empty "Kilobytes" element
     */
    com.saic.precis.x2009.x06.base.IntegerType addNewKilobytes();
    
    /**
     * Unsets the "Kilobytes" element
     */
    void unsetKilobytes();
    
    /**
     * Gets the "MimeType" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType getMimeType();
    
    /**
     * True if has "MimeType" element
     */
    boolean isSetMimeType();
    
    /**
     * Sets the "MimeType" element
     */
    void setMimeType(com.saic.precis.x2009.x06.base.CodespaceValueType mimeType);
    
    /**
     * Appends and returns a new empty "MimeType" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType addNewMimeType();
    
    /**
     * Unsets the "MimeType" element
     */
    void unsetMimeType();
    
    /**
     * Gets the "AssociatedGroups" element
     */
    com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups getAssociatedGroups();
    
    /**
     * True if has "AssociatedGroups" element
     */
    boolean isSetAssociatedGroups();
    
    /**
     * Sets the "AssociatedGroups" element
     */
    void setAssociatedGroups(com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups associatedGroups);
    
    /**
     * Appends and returns a new empty "AssociatedGroups" element
     */
    com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups addNewAssociatedGroups();
    
    /**
     * Unsets the "AssociatedGroups" element
     */
    void unsetAssociatedGroups();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.precis.x2009.x06.base.PropertiesType newInstance() {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.base.PropertiesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.base.PropertiesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
