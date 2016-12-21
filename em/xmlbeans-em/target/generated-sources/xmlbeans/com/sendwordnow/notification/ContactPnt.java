/*
 * XML Type:  ContactPnt
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.ContactPnt
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification;


/**
 * An XML ContactPnt(@http://www.sendwordnow.com/notification).
 *
 * This is a complex type.
 */
public interface ContactPnt extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactPnt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("contactpntad6btype");
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    com.sendwordnow.notification.ContactPnt.Id xgetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(com.sendwordnow.notification.ContactPnt.Id id);
    
    /**
     * Gets the "label" element
     */
    java.lang.String getLabel();
    
    /**
     * Gets (as xml) the "label" element
     */
    org.apache.xmlbeans.XmlString xgetLabel();
    
    /**
     * True if has "label" element
     */
    boolean isSetLabel();
    
    /**
     * Sets the "label" element
     */
    void setLabel(java.lang.String label);
    
    /**
     * Sets (as xml) the "label" element
     */
    void xsetLabel(org.apache.xmlbeans.XmlString label);
    
    /**
     * Unsets the "label" element
     */
    void unsetLabel();
    
    /**
     * Gets the "address" element
     */
    java.lang.String getAddress();
    
    /**
     * Gets (as xml) the "address" element
     */
    org.apache.xmlbeans.XmlString xgetAddress();
    
    /**
     * Sets the "address" element
     */
    void setAddress(java.lang.String address);
    
    /**
     * Sets (as xml) the "address" element
     */
    void xsetAddress(org.apache.xmlbeans.XmlString address);
    
    /**
     * Gets the "type" attribute
     */
    com.sendwordnow.notification.ContactPnt.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    com.sendwordnow.notification.ContactPnt.Type xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(com.sendwordnow.notification.ContactPnt.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.sendwordnow.notification.ContactPnt.Type type);
    
    /**
     * An XML id(@http://www.sendwordnow.com/notification).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.ContactPnt$Id.
     */
    public interface Id extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("id4214elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.ContactPnt.Id newValue(java.lang.Object obj) {
              return (com.sendwordnow.notification.ContactPnt.Id) type.newValue( obj ); }
            
            public static com.sendwordnow.notification.ContactPnt.Id newInstance() {
              return (com.sendwordnow.notification.ContactPnt.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.ContactPnt.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.ContactPnt.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.ContactPnt$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("typea851attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum VOICE = Enum.forString("Voice");
        static final Enum EMAIL = Enum.forString("Email");
        static final Enum TEXT = Enum.forString("Text");
        
        static final int INT_VOICE = Enum.INT_VOICE;
        static final int INT_EMAIL = Enum.INT_EMAIL;
        static final int INT_TEXT = Enum.INT_TEXT;
        
        /**
         * Enumeration value class for com.sendwordnow.notification.ContactPnt$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_VOICE
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_VOICE = 1;
            static final int INT_EMAIL = 2;
            static final int INT_TEXT = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Voice", INT_VOICE),
                    new Enum("Email", INT_EMAIL),
                    new Enum("Text", INT_TEXT),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.ContactPnt.Type newValue(java.lang.Object obj) {
              return (com.sendwordnow.notification.ContactPnt.Type) type.newValue( obj ); }
            
            public static com.sendwordnow.notification.ContactPnt.Type newInstance() {
              return (com.sendwordnow.notification.ContactPnt.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.ContactPnt.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.ContactPnt.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sendwordnow.notification.ContactPnt newInstance() {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sendwordnow.notification.ContactPnt newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sendwordnow.notification.ContactPnt parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sendwordnow.notification.ContactPnt parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sendwordnow.notification.ContactPnt parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.ContactPnt parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.ContactPnt parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.ContactPnt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
