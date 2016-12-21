/*
 * An XML document type.
 * Localname: NotificationProducerRP
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2;


/**
 * A document containing one NotificationProducerRP(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public interface NotificationProducerRPDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationProducerRPDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("notificationproducerrp0c0adoctype");
    
    /**
     * Gets the "NotificationProducerRP" element
     */
    org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP getNotificationProducerRP();
    
    /**
     * Sets the "NotificationProducerRP" element
     */
    void setNotificationProducerRP(org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP notificationProducerRP);
    
    /**
     * Appends and returns a new empty "NotificationProducerRP" element
     */
    org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP addNewNotificationProducerRP();
    
    /**
     * An XML NotificationProducerRP(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public interface NotificationProducerRP extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationProducerRP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("notificationproducerrp82e1elemtype");
        
        /**
         * Gets array of all "TopicExpression" elements
         */
        org.oasisOpen.docs.wsn.b2.TopicExpressionType[] getTopicExpressionArray();
        
        /**
         * Gets ith "TopicExpression" element
         */
        org.oasisOpen.docs.wsn.b2.TopicExpressionType getTopicExpressionArray(int i);
        
        /**
         * Returns number of "TopicExpression" element
         */
        int sizeOfTopicExpressionArray();
        
        /**
         * Sets array of all "TopicExpression" element
         */
        void setTopicExpressionArray(org.oasisOpen.docs.wsn.b2.TopicExpressionType[] topicExpressionArray);
        
        /**
         * Sets ith "TopicExpression" element
         */
        void setTopicExpressionArray(int i, org.oasisOpen.docs.wsn.b2.TopicExpressionType topicExpression);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TopicExpression" element
         */
        org.oasisOpen.docs.wsn.b2.TopicExpressionType insertNewTopicExpression(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TopicExpression" element
         */
        org.oasisOpen.docs.wsn.b2.TopicExpressionType addNewTopicExpression();
        
        /**
         * Removes the ith "TopicExpression" element
         */
        void removeTopicExpression(int i);
        
        /**
         * Gets the "FixedTopicSet" element
         */
        boolean getFixedTopicSet();
        
        /**
         * Gets (as xml) the "FixedTopicSet" element
         */
        org.apache.xmlbeans.XmlBoolean xgetFixedTopicSet();
        
        /**
         * True if has "FixedTopicSet" element
         */
        boolean isSetFixedTopicSet();
        
        /**
         * Sets the "FixedTopicSet" element
         */
        void setFixedTopicSet(boolean fixedTopicSet);
        
        /**
         * Sets (as xml) the "FixedTopicSet" element
         */
        void xsetFixedTopicSet(org.apache.xmlbeans.XmlBoolean fixedTopicSet);
        
        /**
         * Unsets the "FixedTopicSet" element
         */
        void unsetFixedTopicSet();
        
        /**
         * Gets array of all "TopicExpressionDialect" elements
         */
        java.lang.String[] getTopicExpressionDialectArray();
        
        /**
         * Gets ith "TopicExpressionDialect" element
         */
        java.lang.String getTopicExpressionDialectArray(int i);
        
        /**
         * Gets (as xml) array of all "TopicExpressionDialect" elements
         */
        org.apache.xmlbeans.XmlAnyURI[] xgetTopicExpressionDialectArray();
        
        /**
         * Gets (as xml) ith "TopicExpressionDialect" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetTopicExpressionDialectArray(int i);
        
        /**
         * Returns number of "TopicExpressionDialect" element
         */
        int sizeOfTopicExpressionDialectArray();
        
        /**
         * Sets array of all "TopicExpressionDialect" element
         */
        void setTopicExpressionDialectArray(java.lang.String[] topicExpressionDialectArray);
        
        /**
         * Sets ith "TopicExpressionDialect" element
         */
        void setTopicExpressionDialectArray(int i, java.lang.String topicExpressionDialect);
        
        /**
         * Sets (as xml) array of all "TopicExpressionDialect" element
         */
        void xsetTopicExpressionDialectArray(org.apache.xmlbeans.XmlAnyURI[] topicExpressionDialectArray);
        
        /**
         * Sets (as xml) ith "TopicExpressionDialect" element
         */
        void xsetTopicExpressionDialectArray(int i, org.apache.xmlbeans.XmlAnyURI topicExpressionDialect);
        
        /**
         * Inserts the value as the ith "TopicExpressionDialect" element
         */
        void insertTopicExpressionDialect(int i, java.lang.String topicExpressionDialect);
        
        /**
         * Appends the value as the last "TopicExpressionDialect" element
         */
        void addTopicExpressionDialect(java.lang.String topicExpressionDialect);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TopicExpressionDialect" element
         */
        org.apache.xmlbeans.XmlAnyURI insertNewTopicExpressionDialect(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TopicExpressionDialect" element
         */
        org.apache.xmlbeans.XmlAnyURI addNewTopicExpressionDialect();
        
        /**
         * Removes the ith "TopicExpressionDialect" element
         */
        void removeTopicExpressionDialect(int i);
        
        /**
         * Gets the "TopicSet" element
         */
        org.oasisOpen.docs.wsn.t1.TopicSetType getTopicSet();
        
        /**
         * True if has "TopicSet" element
         */
        boolean isSetTopicSet();
        
        /**
         * Sets the "TopicSet" element
         */
        void setTopicSet(org.oasisOpen.docs.wsn.t1.TopicSetType topicSet);
        
        /**
         * Appends and returns a new empty "TopicSet" element
         */
        org.oasisOpen.docs.wsn.t1.TopicSetType addNewTopicSet();
        
        /**
         * Unsets the "TopicSet" element
         */
        void unsetTopicSet();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP newInstance() {
              return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument newInstance() {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
