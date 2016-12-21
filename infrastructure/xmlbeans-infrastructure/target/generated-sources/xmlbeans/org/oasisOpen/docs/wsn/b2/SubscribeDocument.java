/*
 * An XML document type.
 * Localname: Subscribe
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.SubscribeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2;


/**
 * A document containing one Subscribe(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public interface SubscribeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscribeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("subscribef68ddoctype");
    
    /**
     * Gets the "Subscribe" element
     */
    org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe getSubscribe();
    
    /**
     * Sets the "Subscribe" element
     */
    void setSubscribe(org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe subscribe);
    
    /**
     * Appends and returns a new empty "Subscribe" element
     */
    org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe addNewSubscribe();
    
    /**
     * An XML Subscribe(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public interface Subscribe extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Subscribe.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("subscribed037elemtype");
        
        /**
         * Gets the "ConsumerReference" element
         */
        org.w3.x2005.x08.addressing.EndpointReferenceType getConsumerReference();
        
        /**
         * Sets the "ConsumerReference" element
         */
        void setConsumerReference(org.w3.x2005.x08.addressing.EndpointReferenceType consumerReference);
        
        /**
         * Appends and returns a new empty "ConsumerReference" element
         */
        org.w3.x2005.x08.addressing.EndpointReferenceType addNewConsumerReference();
        
        /**
         * Gets the "Filter" element
         */
        org.oasisOpen.docs.wsn.b2.FilterType getFilter();
        
        /**
         * True if has "Filter" element
         */
        boolean isSetFilter();
        
        /**
         * Sets the "Filter" element
         */
        void setFilter(org.oasisOpen.docs.wsn.b2.FilterType filter);
        
        /**
         * Appends and returns a new empty "Filter" element
         */
        org.oasisOpen.docs.wsn.b2.FilterType addNewFilter();
        
        /**
         * Unsets the "Filter" element
         */
        void unsetFilter();
        
        /**
         * Gets the "InitialTerminationTime" element
         */
        java.lang.Object getInitialTerminationTime();
        
        /**
         * Gets (as xml) the "InitialTerminationTime" element
         */
        org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType xgetInitialTerminationTime();
        
        /**
         * Tests for nil "InitialTerminationTime" element
         */
        boolean isNilInitialTerminationTime();
        
        /**
         * True if has "InitialTerminationTime" element
         */
        boolean isSetInitialTerminationTime();
        
        /**
         * Sets the "InitialTerminationTime" element
         */
        void setInitialTerminationTime(java.lang.Object initialTerminationTime);
        
        /**
         * Sets (as xml) the "InitialTerminationTime" element
         */
        void xsetInitialTerminationTime(org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType initialTerminationTime);
        
        /**
         * Nils the "InitialTerminationTime" element
         */
        void setNilInitialTerminationTime();
        
        /**
         * Unsets the "InitialTerminationTime" element
         */
        void unsetInitialTerminationTime();
        
        /**
         * Gets the "SubscriptionPolicy" element
         */
        org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy getSubscriptionPolicy();
        
        /**
         * True if has "SubscriptionPolicy" element
         */
        boolean isSetSubscriptionPolicy();
        
        /**
         * Sets the "SubscriptionPolicy" element
         */
        void setSubscriptionPolicy(org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy subscriptionPolicy);
        
        /**
         * Appends and returns a new empty "SubscriptionPolicy" element
         */
        org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy addNewSubscriptionPolicy();
        
        /**
         * Unsets the "SubscriptionPolicy" element
         */
        void unsetSubscriptionPolicy();
        
        /**
         * An XML SubscriptionPolicy(@http://docs.oasis-open.org/wsn/b-2).
         *
         * This is a complex type.
         */
        public interface SubscriptionPolicy extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriptionPolicy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("subscriptionpolicyc1ecelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy newInstance() {
                  return (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe newInstance() {
              return (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument newInstance() {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.SubscribeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.SubscribeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
