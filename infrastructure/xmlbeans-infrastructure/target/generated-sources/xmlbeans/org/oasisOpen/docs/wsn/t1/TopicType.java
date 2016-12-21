/*
 * XML Type:  TopicType
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.TopicType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1;


/**
 * An XML TopicType(@http://docs.oasis-open.org/wsn/t-1).
 *
 * This is a complex type.
 */
public interface TopicType extends org.oasisOpen.docs.wsn.t1.ExtensibleDocumented
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TopicType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("topictype7feftype");
    
    /**
     * Gets the "MessagePattern" element
     */
    org.oasisOpen.docs.wsn.t1.QueryExpressionType getMessagePattern();
    
    /**
     * True if has "MessagePattern" element
     */
    boolean isSetMessagePattern();
    
    /**
     * Sets the "MessagePattern" element
     */
    void setMessagePattern(org.oasisOpen.docs.wsn.t1.QueryExpressionType messagePattern);
    
    /**
     * Appends and returns a new empty "MessagePattern" element
     */
    org.oasisOpen.docs.wsn.t1.QueryExpressionType addNewMessagePattern();
    
    /**
     * Unsets the "MessagePattern" element
     */
    void unsetMessagePattern();
    
    /**
     * Gets array of all "Topic" elements
     */
    org.oasisOpen.docs.wsn.t1.TopicType[] getTopicArray();
    
    /**
     * Gets ith "Topic" element
     */
    org.oasisOpen.docs.wsn.t1.TopicType getTopicArray(int i);
    
    /**
     * Returns number of "Topic" element
     */
    int sizeOfTopicArray();
    
    /**
     * Sets array of all "Topic" element
     */
    void setTopicArray(org.oasisOpen.docs.wsn.t1.TopicType[] topicArray);
    
    /**
     * Sets ith "Topic" element
     */
    void setTopicArray(int i, org.oasisOpen.docs.wsn.t1.TopicType topic);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Topic" element
     */
    org.oasisOpen.docs.wsn.t1.TopicType insertNewTopic(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Topic" element
     */
    org.oasisOpen.docs.wsn.t1.TopicType addNewTopic();
    
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
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);
    
    /**
     * Gets the "messageTypes" attribute
     */
    java.util.List getMessageTypes();
    
    /**
     * Gets (as xml) the "messageTypes" attribute
     */
    org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes xgetMessageTypes();
    
    /**
     * True if has "messageTypes" attribute
     */
    boolean isSetMessageTypes();
    
    /**
     * Sets the "messageTypes" attribute
     */
    void setMessageTypes(java.util.List messageTypes);
    
    /**
     * Sets (as xml) the "messageTypes" attribute
     */
    void xsetMessageTypes(org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes messageTypes);
    
    /**
     * Unsets the "messageTypes" attribute
     */
    void unsetMessageTypes();
    
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
     * An XML messageTypes(@).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlQName.
     */
    public interface MessageTypes extends org.apache.xmlbeans.XmlAnySimpleType
    {
        java.util.List getListValue();
        java.util.List xgetListValue();
        void setListValue(java.util.List list);
        /** @deprecated */
        java.util.List listValue();
        /** @deprecated */
        java.util.List xlistValue();
        /** @deprecated */
        void set(java.util.List list);
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("messagetypesf6ddattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes newValue(java.lang.Object obj) {
              return (org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes) type.newValue( obj ); }
            
            public static org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes newInstance() {
              return (org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.t1.TopicType newInstance() {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.t1.TopicType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.t1.TopicType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
