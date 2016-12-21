/*
 * XML Type:  NotificationMessageHolderType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2;


/**
 * An XML NotificationMessageHolderType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public interface NotificationMessageHolderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationMessageHolderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("notificationmessageholdertypeb785type");
    
    /**
     * Gets the "SubscriptionReference" element
     */
    org.w3.x2005.x08.addressing.EndpointReferenceType getSubscriptionReference();
    
    /**
     * True if has "SubscriptionReference" element
     */
    boolean isSetSubscriptionReference();
    
    /**
     * Sets the "SubscriptionReference" element
     */
    void setSubscriptionReference(org.w3.x2005.x08.addressing.EndpointReferenceType subscriptionReference);
    
    /**
     * Appends and returns a new empty "SubscriptionReference" element
     */
    org.w3.x2005.x08.addressing.EndpointReferenceType addNewSubscriptionReference();
    
    /**
     * Unsets the "SubscriptionReference" element
     */
    void unsetSubscriptionReference();
    
    /**
     * Gets the "Topic" element
     */
    org.oasisOpen.docs.wsn.b2.TopicExpressionType getTopic();
    
    /**
     * True if has "Topic" element
     */
    boolean isSetTopic();
    
    /**
     * Sets the "Topic" element
     */
    void setTopic(org.oasisOpen.docs.wsn.b2.TopicExpressionType topic);
    
    /**
     * Appends and returns a new empty "Topic" element
     */
    org.oasisOpen.docs.wsn.b2.TopicExpressionType addNewTopic();
    
    /**
     * Unsets the "Topic" element
     */
    void unsetTopic();
    
    /**
     * Gets the "ProducerReference" element
     */
    org.w3.x2005.x08.addressing.EndpointReferenceType getProducerReference();
    
    /**
     * True if has "ProducerReference" element
     */
    boolean isSetProducerReference();
    
    /**
     * Sets the "ProducerReference" element
     */
    void setProducerReference(org.w3.x2005.x08.addressing.EndpointReferenceType producerReference);
    
    /**
     * Appends and returns a new empty "ProducerReference" element
     */
    org.w3.x2005.x08.addressing.EndpointReferenceType addNewProducerReference();
    
    /**
     * Unsets the "ProducerReference" element
     */
    void unsetProducerReference();
    
    /**
     * Gets the "Message" element
     */
    org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message getMessage();
    
    /**
     * Sets the "Message" element
     */
    void setMessage(org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message message);
    
    /**
     * Appends and returns a new empty "Message" element
     */
    org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message addNewMessage();
    
    /**
     * An XML Message(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public interface Message extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Message.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("messaged652elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message newInstance() {
              return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType newInstance() {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
