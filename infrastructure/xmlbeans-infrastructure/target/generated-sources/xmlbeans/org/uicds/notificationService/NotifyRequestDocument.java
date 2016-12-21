/*
 * An XML document type.
 * Localname: NotifyRequest
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.NotifyRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService;


/**
 * A document containing one NotifyRequest(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public interface NotifyRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotifyRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("notifyrequest3330doctype");
    
    /**
     * Gets the "NotifyRequest" element
     */
    org.uicds.notificationService.NotifyRequestDocument.NotifyRequest getNotifyRequest();
    
    /**
     * Sets the "NotifyRequest" element
     */
    void setNotifyRequest(org.uicds.notificationService.NotifyRequestDocument.NotifyRequest notifyRequest);
    
    /**
     * Appends and returns a new empty "NotifyRequest" element
     */
    org.uicds.notificationService.NotifyRequestDocument.NotifyRequest addNewNotifyRequest();
    
    /**
     * An XML NotifyRequest(@http://uicds.org/NotificationService).
     *
     * This is a complex type.
     */
    public interface NotifyRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotifyRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("notifyrequest251eelemtype");
        
        /**
         * Gets array of all "NotificationMessage" elements
         */
        org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType[] getNotificationMessageArray();
        
        /**
         * Gets ith "NotificationMessage" element
         */
        org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType getNotificationMessageArray(int i);
        
        /**
         * Returns number of "NotificationMessage" element
         */
        int sizeOfNotificationMessageArray();
        
        /**
         * Sets array of all "NotificationMessage" element
         */
        void setNotificationMessageArray(org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType[] notificationMessageArray);
        
        /**
         * Sets ith "NotificationMessage" element
         */
        void setNotificationMessageArray(int i, org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType notificationMessage);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "NotificationMessage" element
         */
        org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType insertNewNotificationMessage(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "NotificationMessage" element
         */
        org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType addNewNotificationMessage();
        
        /**
         * Removes the ith "NotificationMessage" element
         */
        void removeNotificationMessage(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.notificationService.NotifyRequestDocument.NotifyRequest newInstance() {
              return (org.uicds.notificationService.NotifyRequestDocument.NotifyRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.notificationService.NotifyRequestDocument.NotifyRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.notificationService.NotifyRequestDocument.NotifyRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.notificationService.NotifyRequestDocument newInstance() {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.notificationService.NotifyRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.notificationService.NotifyRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.notificationService.NotifyRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.notificationService.NotifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
