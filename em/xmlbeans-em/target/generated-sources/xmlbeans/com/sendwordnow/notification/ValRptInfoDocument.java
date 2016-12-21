/*
 * An XML document type.
 * Localname: ValRptInfo
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.ValRptInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification;


/**
 * A document containing one ValRptInfo(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public interface ValRptInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValRptInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("valrptinfo95e8doctype");
    
    /**
     * Gets the "ValRptInfo" element
     */
    com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo getValRptInfo();
    
    /**
     * Sets the "ValRptInfo" element
     */
    void setValRptInfo(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo valRptInfo);
    
    /**
     * Appends and returns a new empty "ValRptInfo" element
     */
    com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo addNewValRptInfo();
    
    /**
     * An XML ValRptInfo(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface ValRptInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValRptInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("valrptinfo8329elemtype");
        
        /**
         * Gets the "notificationHasErrors" element
         */
        boolean getNotificationHasErrors();
        
        /**
         * Gets (as xml) the "notificationHasErrors" element
         */
        org.apache.xmlbeans.XmlBoolean xgetNotificationHasErrors();
        
        /**
         * Sets the "notificationHasErrors" element
         */
        void setNotificationHasErrors(boolean notificationHasErrors);
        
        /**
         * Sets (as xml) the "notificationHasErrors" element
         */
        void xsetNotificationHasErrors(org.apache.xmlbeans.XmlBoolean notificationHasErrors);
        
        /**
         * Gets the "notificationHasWarnings" element
         */
        boolean getNotificationHasWarnings();
        
        /**
         * Gets (as xml) the "notificationHasWarnings" element
         */
        org.apache.xmlbeans.XmlBoolean xgetNotificationHasWarnings();
        
        /**
         * Sets the "notificationHasWarnings" element
         */
        void setNotificationHasWarnings(boolean notificationHasWarnings);
        
        /**
         * Sets (as xml) the "notificationHasWarnings" element
         */
        void xsetNotificationHasWarnings(org.apache.xmlbeans.XmlBoolean notificationHasWarnings);
        
        /**
         * Gets the "details" element
         */
        com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details getDetails();
        
        /**
         * Sets the "details" element
         */
        void setDetails(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details details);
        
        /**
         * Appends and returns a new empty "details" element
         */
        com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details addNewDetails();
        
        /**
         * An XML details(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public interface Details extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Details.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("detailsae57elemtype");
            
            /**
             * Gets array of all "valRptDetailInfo" elements
             */
            com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo[] getValRptDetailInfoArray();
            
            /**
             * Gets ith "valRptDetailInfo" element
             */
            com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo getValRptDetailInfoArray(int i);
            
            /**
             * Returns number of "valRptDetailInfo" element
             */
            int sizeOfValRptDetailInfoArray();
            
            /**
             * Sets array of all "valRptDetailInfo" element
             */
            void setValRptDetailInfoArray(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo[] valRptDetailInfoArray);
            
            /**
             * Sets ith "valRptDetailInfo" element
             */
            void setValRptDetailInfoArray(int i, com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo valRptDetailInfo);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "valRptDetailInfo" element
             */
            com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo insertNewValRptDetailInfo(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "valRptDetailInfo" element
             */
            com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo addNewValRptDetailInfo();
            
            /**
             * Removes the ith "valRptDetailInfo" element
             */
            void removeValRptDetailInfo(int i);
            
            /**
             * An XML valRptDetailInfo(@http://www.sendwordnow.com/notification).
             *
             * This is a complex type.
             */
            public interface ValRptDetailInfo extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValRptDetailInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("valrptdetailinfo8087elemtype");
                
                /**
                 * Gets the "description" element
                 */
                java.lang.String getDescription();
                
                /**
                 * Gets (as xml) the "description" element
                 */
                org.apache.xmlbeans.XmlString xgetDescription();
                
                /**
                 * Sets the "description" element
                 */
                void setDescription(java.lang.String description);
                
                /**
                 * Sets (as xml) the "description" element
                 */
                void xsetDescription(org.apache.xmlbeans.XmlString description);
                
                /**
                 * Gets the "code" element
                 */
                java.lang.String getCode();
                
                /**
                 * Gets (as xml) the "code" element
                 */
                org.apache.xmlbeans.XmlString xgetCode();
                
                /**
                 * True if has "code" element
                 */
                boolean isSetCode();
                
                /**
                 * Sets the "code" element
                 */
                void setCode(java.lang.String code);
                
                /**
                 * Sets (as xml) the "code" element
                 */
                void xsetCode(org.apache.xmlbeans.XmlString code);
                
                /**
                 * Unsets the "code" element
                 */
                void unsetCode();
                
                /**
                 * Gets the "type" attribute
                 */
                com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type.Enum getType();
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type xgetType();
                
                /**
                 * Sets the "type" attribute
                 */
                void setType(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type.Enum type);
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                void xsetType(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type type);
                
                /**
                 * An XML type(@).
                 *
                 * This is an atomic type that is a restriction of com.sendwordnow.notification.ValRptInfoDocument$ValRptInfo$Details$ValRptDetailInfo$Type.
                 */
                public interface Type extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("type7bedattrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum WARNING = Enum.forString("Warning");
                    static final Enum ERROR = Enum.forString("Error");
                    
                    static final int INT_WARNING = Enum.INT_WARNING;
                    static final int INT_ERROR = Enum.INT_ERROR;
                    
                    /**
                     * Enumeration value class for com.sendwordnow.notification.ValRptInfoDocument$ValRptInfo$Details$ValRptDetailInfo$Type.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_WARNING
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
                      
                      static final int INT_WARNING = 1;
                      static final int INT_ERROR = 2;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("Warning", INT_WARNING),
                          new Enum("Error", INT_ERROR),
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
                      public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type newValue(java.lang.Object obj) {
                        return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type) type.newValue( obj ); }
                      
                      public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type newInstance() {
                        return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo newInstance() {
                      return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details newInstance() {
                  return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo newInstance() {
              return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sendwordnow.notification.ValRptInfoDocument newInstance() {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sendwordnow.notification.ValRptInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.ValRptInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.ValRptInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.ValRptInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
