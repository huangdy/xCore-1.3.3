/*
 * An XML document type.
 * Localname: SubscriptionManagerRP
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2;


/**
 * A document containing one SubscriptionManagerRP(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public interface SubscriptionManagerRPDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriptionManagerRPDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("subscriptionmanagerrp05c9doctype");
    
    /**
     * Gets the "SubscriptionManagerRP" element
     */
    org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP getSubscriptionManagerRP();
    
    /**
     * Sets the "SubscriptionManagerRP" element
     */
    void setSubscriptionManagerRP(org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP subscriptionManagerRP);
    
    /**
     * Appends and returns a new empty "SubscriptionManagerRP" element
     */
    org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP addNewSubscriptionManagerRP();
    
    /**
     * An XML SubscriptionManagerRP(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public interface SubscriptionManagerRP extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriptionManagerRP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("subscriptionmanagerrpd52felemtype");
        
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
         * Gets the "SubscriptionPolicy" element
         */
        org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType getSubscriptionPolicy();
        
        /**
         * True if has "SubscriptionPolicy" element
         */
        boolean isSetSubscriptionPolicy();
        
        /**
         * Sets the "SubscriptionPolicy" element
         */
        void setSubscriptionPolicy(org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType subscriptionPolicy);
        
        /**
         * Appends and returns a new empty "SubscriptionPolicy" element
         */
        org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType addNewSubscriptionPolicy();
        
        /**
         * Unsets the "SubscriptionPolicy" element
         */
        void unsetSubscriptionPolicy();
        
        /**
         * Gets the "CreationTime" element
         */
        java.util.Calendar getCreationTime();
        
        /**
         * Gets (as xml) the "CreationTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCreationTime();
        
        /**
         * True if has "CreationTime" element
         */
        boolean isSetCreationTime();
        
        /**
         * Sets the "CreationTime" element
         */
        void setCreationTime(java.util.Calendar creationTime);
        
        /**
         * Sets (as xml) the "CreationTime" element
         */
        void xsetCreationTime(org.apache.xmlbeans.XmlDateTime creationTime);
        
        /**
         * Unsets the "CreationTime" element
         */
        void unsetCreationTime();
        
        /**
         * Gets the "CurrentTime" element
         */
        org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime getCurrentTime();
        
        /**
         * Sets the "CurrentTime" element
         */
        void setCurrentTime(org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime currentTime);
        
        /**
         * Appends and returns a new empty "CurrentTime" element
         */
        org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime addNewCurrentTime();
        
        /**
         * Gets the "TerminationTime" element
         */
        org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime getTerminationTime();
        
        /**
         * Tests for nil "TerminationTime" element
         */
        boolean isNilTerminationTime();
        
        /**
         * Sets the "TerminationTime" element
         */
        void setTerminationTime(org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime terminationTime);
        
        /**
         * Appends and returns a new empty "TerminationTime" element
         */
        org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime addNewTerminationTime();
        
        /**
         * Nils the "TerminationTime" element
         */
        void setNilTerminationTime();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP newInstance() {
              return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument newInstance() {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
