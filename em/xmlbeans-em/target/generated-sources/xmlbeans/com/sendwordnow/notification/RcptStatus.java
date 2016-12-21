/*
 * XML Type:  RcptStatus
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.RcptStatus
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification;


/**
 * An XML RcptStatus(@http://www.sendwordnow.com/notification).
 *
 * This is a complex type.
 */
public interface RcptStatus extends com.sendwordnow.notification.RcptInfoBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RcptStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("rcptstatusaabctype");
    
    /**
     * Gets the "contactPntsStatus" element
     */
    com.sendwordnow.notification.RcptStatus.ContactPntsStatus getContactPntsStatus();
    
    /**
     * Sets the "contactPntsStatus" element
     */
    void setContactPntsStatus(com.sendwordnow.notification.RcptStatus.ContactPntsStatus contactPntsStatus);
    
    /**
     * Appends and returns a new empty "contactPntsStatus" element
     */
    com.sendwordnow.notification.RcptStatus.ContactPntsStatus addNewContactPntsStatus();
    
    /**
     * Gets the "gwbRespIndex" element
     */
    java.math.BigInteger getGwbRespIndex();
    
    /**
     * Gets (as xml) the "gwbRespIndex" element
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetGwbRespIndex();
    
    /**
     * Sets the "gwbRespIndex" element
     */
    void setGwbRespIndex(java.math.BigInteger gwbRespIndex);
    
    /**
     * Sets (as xml) the "gwbRespIndex" element
     */
    void xsetGwbRespIndex(org.apache.xmlbeans.XmlNonNegativeInteger gwbRespIndex);
    
    /**
     * An XML contactPntsStatus(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface ContactPntsStatus extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactPntsStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("contactpntsstatusffa1elemtype");
        
        /**
         * Gets array of all "contactPntStatus" elements
         */
        com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus[] getContactPntStatusArray();
        
        /**
         * Gets ith "contactPntStatus" element
         */
        com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus getContactPntStatusArray(int i);
        
        /**
         * Returns number of "contactPntStatus" element
         */
        int sizeOfContactPntStatusArray();
        
        /**
         * Sets array of all "contactPntStatus" element
         */
        void setContactPntStatusArray(com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus[] contactPntStatusArray);
        
        /**
         * Sets ith "contactPntStatus" element
         */
        void setContactPntStatusArray(int i, com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus contactPntStatus);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contactPntStatus" element
         */
        com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus insertNewContactPntStatus(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contactPntStatus" element
         */
        com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus addNewContactPntStatus();
        
        /**
         * Removes the ith "contactPntStatus" element
         */
        void removeContactPntStatus(int i);
        
        /**
         * An XML contactPntStatus(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public interface ContactPntStatus extends com.sendwordnow.notification.ContactPnt
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactPntStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("contactpntstatuse1fdelemtype");
            
            /**
             * Gets the "deliveryTimestamp" element
             */
            java.util.Calendar getDeliveryTimestamp();
            
            /**
             * Gets (as xml) the "deliveryTimestamp" element
             */
            org.apache.xmlbeans.XmlDateTime xgetDeliveryTimestamp();
            
            /**
             * True if has "deliveryTimestamp" element
             */
            boolean isSetDeliveryTimestamp();
            
            /**
             * Sets the "deliveryTimestamp" element
             */
            void setDeliveryTimestamp(java.util.Calendar deliveryTimestamp);
            
            /**
             * Sets (as xml) the "deliveryTimestamp" element
             */
            void xsetDeliveryTimestamp(org.apache.xmlbeans.XmlDateTime deliveryTimestamp);
            
            /**
             * Unsets the "deliveryTimestamp" element
             */
            void unsetDeliveryTimestamp();
            
            /**
             * Gets the "gwbRespIndex" element
             */
            java.math.BigInteger getGwbRespIndex();
            
            /**
             * Gets (as xml) the "gwbRespIndex" element
             */
            org.apache.xmlbeans.XmlNonNegativeInteger xgetGwbRespIndex();
            
            /**
             * True if has "gwbRespIndex" element
             */
            boolean isSetGwbRespIndex();
            
            /**
             * Sets the "gwbRespIndex" element
             */
            void setGwbRespIndex(java.math.BigInteger gwbRespIndex);
            
            /**
             * Sets (as xml) the "gwbRespIndex" element
             */
            void xsetGwbRespIndex(org.apache.xmlbeans.XmlNonNegativeInteger gwbRespIndex);
            
            /**
             * Unsets the "gwbRespIndex" element
             */
            void unsetGwbRespIndex();
            
            /**
             * Gets the "status" attribute
             */
            java.lang.String getStatus();
            
            /**
             * Gets (as xml) the "status" attribute
             */
            com.sendwordnow.notification.StatusAttribute.Status xgetStatus();
            
            /**
             * Sets the "status" attribute
             */
            void setStatus(java.lang.String status);
            
            /**
             * Sets (as xml) the "status" attribute
             */
            void xsetStatus(com.sendwordnow.notification.StatusAttribute.Status status);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus newInstance() {
                  return (com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.RcptStatus.ContactPntsStatus newInstance() {
              return (com.sendwordnow.notification.RcptStatus.ContactPntsStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.RcptStatus.ContactPntsStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.RcptStatus.ContactPntsStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sendwordnow.notification.RcptStatus newInstance() {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sendwordnow.notification.RcptStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sendwordnow.notification.RcptStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sendwordnow.notification.RcptStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sendwordnow.notification.RcptStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.RcptStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.RcptStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.RcptStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
