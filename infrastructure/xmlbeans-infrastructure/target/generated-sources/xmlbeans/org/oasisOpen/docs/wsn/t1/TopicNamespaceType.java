/*
 * XML Type:  TopicNamespaceType
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.TopicNamespaceType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1;


/**
 * An XML TopicNamespaceType(@http://docs.oasis-open.org/wsn/t-1).
 *
 * This is a complex type.
 */
public interface TopicNamespaceType extends org.oasisOpen.docs.wsn.t1.ExtensibleDocumented
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TopicNamespaceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("topicnamespacetype85a0type");
    
    /**
     * Gets array of all "Topic" elements
     */
    org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic[] getTopicArray();
    
    /**
     * Gets ith "Topic" element
     */
    org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic getTopicArray(int i);
    
    /**
     * Returns number of "Topic" element
     */
    int sizeOfTopicArray();
    
    /**
     * Sets array of all "Topic" element
     */
    void setTopicArray(org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic[] topicArray);
    
    /**
     * Sets ith "Topic" element
     */
    void setTopicArray(int i, org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic topic);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Topic" element
     */
    org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic insertNewTopic(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Topic" element
     */
    org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic addNewTopic();
    
    /**
     * Removes the ith "Topic" element
     */
    void removeTopic(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "targetNamespace" attribute
     */
    java.lang.String getTargetNamespace();
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace();
    
    /**
     * Sets the "targetNamespace" attribute
     */
    void setTargetNamespace(java.lang.String targetNamespace);
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace);
    
    /**
     * Gets the "final" attribute
     */
    boolean getFinal();
    
    /**
     * Gets (as xml) the "final" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFinal();
    
    /**
     * True if has "final" attribute
     */
    boolean isSetFinal();
    
    /**
     * Sets the "final" attribute
     */
    void setFinal(boolean xfinal);
    
    /**
     * Sets (as xml) the "final" attribute
     */
    void xsetFinal(org.apache.xmlbeans.XmlBoolean xfinal);
    
    /**
     * Unsets the "final" attribute
     */
    void unsetFinal();
    
    /**
     * An XML Topic(@http://docs.oasis-open.org/wsn/t-1).
     *
     * This is a complex type.
     */
    public interface Topic extends org.oasisOpen.docs.wsn.t1.TopicType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Topic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("topic4c1belemtype");
        
        /**
         * Gets the "parent" attribute
         */
        java.lang.String getParent();
        
        /**
         * Gets (as xml) the "parent" attribute
         */
        org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression xgetParent();
        
        /**
         * True if has "parent" attribute
         */
        boolean isSetParent();
        
        /**
         * Sets the "parent" attribute
         */
        void setParent(java.lang.String parent);
        
        /**
         * Sets (as xml) the "parent" attribute
         */
        void xsetParent(org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression parent);
        
        /**
         * Unsets the "parent" attribute
         */
        void unsetParent();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic newInstance() {
              return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType newInstance() {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.t1.TopicNamespaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.t1.TopicNamespaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
