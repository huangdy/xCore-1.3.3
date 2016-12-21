/*
 * XML Type:  ServiceConfigType
 * Namespace: http://uicds.org/ServiceConfig
 * Java type: org.uicds.serviceConfig.ServiceConfigType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.serviceConfig;


/**
 * An XML ServiceConfigType(@http://uicds.org/ServiceConfig).
 *
 * This is a complex type.
 */
public interface ServiceConfigType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceConfigType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("serviceconfigtypef7a2type");
    
    /**
     * Gets the "URN" element
     */
    java.lang.String getURN();
    
    /**
     * Gets (as xml) the "URN" element
     */
    org.apache.xmlbeans.XmlString xgetURN();
    
    /**
     * Sets the "URN" element
     */
    void setURN(java.lang.String urn);
    
    /**
     * Sets (as xml) the "URN" element
     */
    void xsetURN(org.apache.xmlbeans.XmlString urn);
    
    /**
     * Gets the "serviceName" element
     */
    java.lang.String getServiceName();
    
    /**
     * Gets (as xml) the "serviceName" element
     */
    org.apache.xmlbeans.XmlString xgetServiceName();
    
    /**
     * Sets the "serviceName" element
     */
    void setServiceName(java.lang.String serviceName);
    
    /**
     * Sets (as xml) the "serviceName" element
     */
    void xsetServiceName(org.apache.xmlbeans.XmlString serviceName);
    
    /**
     * Gets the "coreName" element
     */
    java.lang.String getCoreName();
    
    /**
     * Gets (as xml) the "coreName" element
     */
    org.apache.xmlbeans.XmlString xgetCoreName();
    
    /**
     * Sets the "coreName" element
     */
    void setCoreName(java.lang.String coreName);
    
    /**
     * Sets (as xml) the "coreName" element
     */
    void xsetCoreName(org.apache.xmlbeans.XmlString coreName);
    
    /**
     * Gets the "publishedProducts" element
     */
    org.uicds.directoryServiceData.WorkProductTypeListType getPublishedProducts();
    
    /**
     * Sets the "publishedProducts" element
     */
    void setPublishedProducts(org.uicds.directoryServiceData.WorkProductTypeListType publishedProducts);
    
    /**
     * Appends and returns a new empty "publishedProducts" element
     */
    org.uicds.directoryServiceData.WorkProductTypeListType addNewPublishedProducts();
    
    /**
     * Gets the "subscribedProducts" element
     */
    org.uicds.directoryServiceData.WorkProductTypeListType getSubscribedProducts();
    
    /**
     * Sets the "subscribedProducts" element
     */
    void setSubscribedProducts(org.uicds.directoryServiceData.WorkProductTypeListType subscribedProducts);
    
    /**
     * Appends and returns a new empty "subscribedProducts" element
     */
    org.uicds.directoryServiceData.WorkProductTypeListType addNewSubscribedProducts();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.serviceConfig.ServiceConfigType newInstance() {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.serviceConfig.ServiceConfigType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.serviceConfig.ServiceConfigType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.serviceConfig.ServiceConfigType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.serviceConfig.ServiceConfigType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}