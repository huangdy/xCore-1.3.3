/*
 * An XML document type.
 * Localname: NotificationResultsInfo
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.NotificationResultsInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification;


/**
 * A document containing one NotificationResultsInfo(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public interface NotificationResultsInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationResultsInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("notificationresultsinfo0e4cdoctype");
    
    /**
     * Gets the "NotificationResultsInfo" element
     */
    com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo getNotificationResultsInfo();
    
    /**
     * Sets the "NotificationResultsInfo" element
     */
    void setNotificationResultsInfo(com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo notificationResultsInfo);
    
    /**
     * Appends and returns a new empty "NotificationResultsInfo" element
     */
    com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo addNewNotificationResultsInfo();
    
    /**
     * An XML NotificationResultsInfo(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface NotificationResultsInfo extends com.sendwordnow.notification.NotificationResultsInfoBase
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationResultsInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("notificationresultsinfoad31elemtype");
        
        /**
         * Gets the "rcptsStatus" element
         */
        com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus getRcptsStatus();
        
        /**
         * Sets the "rcptsStatus" element
         */
        void setRcptsStatus(com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus rcptsStatus);
        
        /**
         * Appends and returns a new empty "rcptsStatus" element
         */
        com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus addNewRcptsStatus();
        
        /**
         * An XML rcptsStatus(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public interface RcptsStatus extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RcptsStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("rcptsstatus0c4delemtype");
            
            /**
             * Gets array of all "rcptStatus" elements
             */
            com.sendwordnow.notification.RcptStatus[] getRcptStatusArray();
            
            /**
             * Gets ith "rcptStatus" element
             */
            com.sendwordnow.notification.RcptStatus getRcptStatusArray(int i);
            
            /**
             * Returns number of "rcptStatus" element
             */
            int sizeOfRcptStatusArray();
            
            /**
             * Sets array of all "rcptStatus" element
             */
            void setRcptStatusArray(com.sendwordnow.notification.RcptStatus[] rcptStatusArray);
            
            /**
             * Sets ith "rcptStatus" element
             */
            void setRcptStatusArray(int i, com.sendwordnow.notification.RcptStatus rcptStatus);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "rcptStatus" element
             */
            com.sendwordnow.notification.RcptStatus insertNewRcptStatus(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "rcptStatus" element
             */
            com.sendwordnow.notification.RcptStatus addNewRcptStatus();
            
            /**
             * Removes the ith "rcptStatus" element
             */
            void removeRcptStatus(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus newInstance() {
                  return (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo newInstance() {
              return (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sendwordnow.notification.NotificationResultsInfoDocument newInstance() {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.NotificationResultsInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.NotificationResultsInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
