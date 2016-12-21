/*
 * XML Type:  WorkProductDeletedNotificationType
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.WorkProductDeletedNotificationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService;


/**
 * An XML WorkProductDeletedNotificationType(@http://uicds.org/NotificationService).
 *
 * This is a complex type.
 */
public interface WorkProductDeletedNotificationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkProductDeletedNotificationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("workproductdeletednotificationtypeb0f4type");
    
    /**
     * Gets the "WorkProductIdentification" element
     */
    com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification();
    
    /**
     * Sets the "WorkProductIdentification" element
     */
    void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification);
    
    /**
     * Appends and returns a new empty "WorkProductIdentification" element
     */
    com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification();
    
    /**
     * Gets the "WorkProductProperties" element
     */
    com.saic.precis.x2009.x06.base.PropertiesType getWorkProductProperties();
    
    /**
     * Sets the "WorkProductProperties" element
     */
    void setWorkProductProperties(com.saic.precis.x2009.x06.base.PropertiesType workProductProperties);
    
    /**
     * Appends and returns a new empty "WorkProductProperties" element
     */
    com.saic.precis.x2009.x06.base.PropertiesType addNewWorkProductProperties();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.notificationService.WorkProductDeletedNotificationType newInstance() {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.notificationService.WorkProductDeletedNotificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.notificationService.WorkProductDeletedNotificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
