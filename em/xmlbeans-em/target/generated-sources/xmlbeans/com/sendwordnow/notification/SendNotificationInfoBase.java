/*
 * XML Type:  SendNotificationInfoBase
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.SendNotificationInfoBase
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification;


/**
 * An XML SendNotificationInfoBase(@http://www.sendwordnow.com/notification).
 *
 * This is a complex type.
 */
public interface SendNotificationInfoBase extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendNotificationInfoBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("sendnotificationinfobase6607type");
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    com.sendwordnow.notification.SendNotificationInfoBase.Id xgetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(com.sendwordnow.notification.SendNotificationInfoBase.Id id);
    
    /**
     * Gets the "custSentTimestamp" element
     */
    java.util.Calendar getCustSentTimestamp();
    
    /**
     * Gets (as xml) the "custSentTimestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCustSentTimestamp();
    
    /**
     * Sets the "custSentTimestamp" element
     */
    void setCustSentTimestamp(java.util.Calendar custSentTimestamp);
    
    /**
     * Sets (as xml) the "custSentTimestamp" element
     */
    void xsetCustSentTimestamp(org.apache.xmlbeans.XmlDateTime custSentTimestamp);
    
    /**
     * Gets the "sender" element
     */
    com.sendwordnow.notification.SendNotificationInfoBase.Sender getSender();
    
    /**
     * True if has "sender" element
     */
    boolean isSetSender();
    
    /**
     * Sets the "sender" element
     */
    void setSender(com.sendwordnow.notification.SendNotificationInfoBase.Sender sender);
    
    /**
     * Appends and returns a new empty "sender" element
     */
    com.sendwordnow.notification.SendNotificationInfoBase.Sender addNewSender();
    
    /**
     * Unsets the "sender" element
     */
    void unsetSender();
    
    /**
     * Gets the "notification" element
     */
    com.sendwordnow.notification.SendNotificationInfoBase.Notification getNotification();
    
    /**
     * Sets the "notification" element
     */
    void setNotification(com.sendwordnow.notification.SendNotificationInfoBase.Notification notification);
    
    /**
     * Appends and returns a new empty "notification" element
     */
    com.sendwordnow.notification.SendNotificationInfoBase.Notification addNewNotification();
    
    /**
     * Gets the "confCall" element
     */
    com.sendwordnow.notification.SendNotificationInfoBase.ConfCall getConfCall();
    
    /**
     * True if has "confCall" element
     */
    boolean isSetConfCall();
    
    /**
     * Sets the "confCall" element
     */
    void setConfCall(com.sendwordnow.notification.SendNotificationInfoBase.ConfCall confCall);
    
    /**
     * Appends and returns a new empty "confCall" element
     */
    com.sendwordnow.notification.SendNotificationInfoBase.ConfCall addNewConfCall();
    
    /**
     * Unsets the "confCall" element
     */
    void unsetConfCall();
    
    /**
     * Gets the "device" attribute
     */
    com.sendwordnow.notification.SendNotificationInfoBase.Device.Enum getDevice();
    
    /**
     * Gets (as xml) the "device" attribute
     */
    com.sendwordnow.notification.SendNotificationInfoBase.Device xgetDevice();
    
    /**
     * True if has "device" attribute
     */
    boolean isSetDevice();
    
    /**
     * Sets the "device" attribute
     */
    void setDevice(com.sendwordnow.notification.SendNotificationInfoBase.Device.Enum device);
    
    /**
     * Sets (as xml) the "device" attribute
     */
    void xsetDevice(com.sendwordnow.notification.SendNotificationInfoBase.Device device);
    
    /**
     * Unsets the "device" attribute
     */
    void unsetDevice();
    
    /**
     * An XML id(@http://www.sendwordnow.com/notification).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoBase$Id.
     */
    public interface Id extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("id1ef0elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.SendNotificationInfoBase.Id newValue(java.lang.Object obj) {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Id) type.newValue( obj ); }
            
            public static com.sendwordnow.notification.SendNotificationInfoBase.Id newInstance() {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.SendNotificationInfoBase.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML sender(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface Sender extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sender.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("sender1f96elemtype");
        
        /**
         * Gets the "introName" element
         */
        java.lang.String getIntroName();
        
        /**
         * Gets (as xml) the "introName" element
         */
        org.apache.xmlbeans.XmlString xgetIntroName();
        
        /**
         * True if has "introName" element
         */
        boolean isSetIntroName();
        
        /**
         * Sets the "introName" element
         */
        void setIntroName(java.lang.String introName);
        
        /**
         * Sets (as xml) the "introName" element
         */
        void xsetIntroName(org.apache.xmlbeans.XmlString introName);
        
        /**
         * Unsets the "introName" element
         */
        void unsetIntroName();
        
        /**
         * Gets the "introOrganization" element
         */
        java.lang.String getIntroOrganization();
        
        /**
         * Gets (as xml) the "introOrganization" element
         */
        org.apache.xmlbeans.XmlString xgetIntroOrganization();
        
        /**
         * True if has "introOrganization" element
         */
        boolean isSetIntroOrganization();
        
        /**
         * Sets the "introOrganization" element
         */
        void setIntroOrganization(java.lang.String introOrganization);
        
        /**
         * Sets (as xml) the "introOrganization" element
         */
        void xsetIntroOrganization(org.apache.xmlbeans.XmlString introOrganization);
        
        /**
         * Unsets the "introOrganization" element
         */
        void unsetIntroOrganization();
        
        /**
         * Gets the "phone" element
         */
        java.lang.String getPhone();
        
        /**
         * Gets (as xml) the "phone" element
         */
        org.apache.xmlbeans.XmlString xgetPhone();
        
        /**
         * True if has "phone" element
         */
        boolean isSetPhone();
        
        /**
         * Sets the "phone" element
         */
        void setPhone(java.lang.String phone);
        
        /**
         * Sets (as xml) the "phone" element
         */
        void xsetPhone(org.apache.xmlbeans.XmlString phone);
        
        /**
         * Unsets the "phone" element
         */
        void unsetPhone();
        
        /**
         * Gets the "email" element
         */
        java.lang.String getEmail();
        
        /**
         * Gets (as xml) the "email" element
         */
        org.apache.xmlbeans.XmlString xgetEmail();
        
        /**
         * True if has "email" element
         */
        boolean isSetEmail();
        
        /**
         * Sets the "email" element
         */
        void setEmail(java.lang.String email);
        
        /**
         * Sets (as xml) the "email" element
         */
        void xsetEmail(org.apache.xmlbeans.XmlString email);
        
        /**
         * Unsets the "email" element
         */
        void unsetEmail();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.SendNotificationInfoBase.Sender newInstance() {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Sender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.SendNotificationInfoBase.Sender newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Sender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML notification(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface Notification extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Notification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("notificationef20elemtype");
        
        /**
         * Gets the "subject" element
         */
        java.lang.String getSubject();
        
        /**
         * Gets (as xml) the "subject" element
         */
        org.apache.xmlbeans.XmlString xgetSubject();
        
        /**
         * True if has "subject" element
         */
        boolean isSetSubject();
        
        /**
         * Sets the "subject" element
         */
        void setSubject(java.lang.String subject);
        
        /**
         * Sets (as xml) the "subject" element
         */
        void xsetSubject(org.apache.xmlbeans.XmlString subject);
        
        /**
         * Unsets the "subject" element
         */
        void unsetSubject();
        
        /**
         * Gets the "body" element
         */
        java.lang.String getBody();
        
        /**
         * Gets (as xml) the "body" element
         */
        org.apache.xmlbeans.XmlString xgetBody();
        
        /**
         * Sets the "body" element
         */
        void setBody(java.lang.String body);
        
        /**
         * Sets (as xml) the "body" element
         */
        void xsetBody(org.apache.xmlbeans.XmlString body);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.SendNotificationInfoBase.Notification newInstance() {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Notification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.SendNotificationInfoBase.Notification newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Notification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML confCall(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface ConfCall extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConfCall.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("confcalla909elemtype");
        
        /**
         * Gets the "id" element
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" element
         */
        com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id xgetId();
        
        /**
         * True if has "id" element
         */
        boolean isSetId();
        
        /**
         * Sets the "id" element
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" element
         */
        void xsetId(com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id id);
        
        /**
         * Unsets the "id" element
         */
        void unsetId();
        
        /**
         * Gets the "phone" element
         */
        java.lang.String getPhone();
        
        /**
         * Gets (as xml) the "phone" element
         */
        org.apache.xmlbeans.XmlString xgetPhone();
        
        /**
         * True if has "phone" element
         */
        boolean isSetPhone();
        
        /**
         * Sets the "phone" element
         */
        void setPhone(java.lang.String phone);
        
        /**
         * Sets (as xml) the "phone" element
         */
        void xsetPhone(org.apache.xmlbeans.XmlString phone);
        
        /**
         * Unsets the "phone" element
         */
        void unsetPhone();
        
        /**
         * Gets the "isConfCall" attribute
         */
        boolean getIsConfCall();
        
        /**
         * Gets (as xml) the "isConfCall" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetIsConfCall();
        
        /**
         * Sets the "isConfCall" attribute
         */
        void setIsConfCall(boolean isConfCall);
        
        /**
         * Sets (as xml) the "isConfCall" attribute
         */
        void xsetIsConfCall(org.apache.xmlbeans.XmlBoolean isConfCall);
        
        /**
         * An XML id(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoBase$ConfCall$Id.
         */
        public interface Id extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("id7480elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id newValue(java.lang.Object obj) {
                  return (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id) type.newValue( obj ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id newInstance() {
                  return (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.SendNotificationInfoBase.ConfCall newInstance() {
              return (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.SendNotificationInfoBase.ConfCall newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML device(@).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoBase$Device.
     */
    public interface Device extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Device.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("device78d1attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ALL = Enum.forString("All");
        static final Enum VOICE = Enum.forString("Voice");
        static final Enum TEXT = Enum.forString("Text");
        
        static final int INT_ALL = Enum.INT_ALL;
        static final int INT_VOICE = Enum.INT_VOICE;
        static final int INT_TEXT = Enum.INT_TEXT;
        
        /**
         * Enumeration value class for com.sendwordnow.notification.SendNotificationInfoBase$Device.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ALL
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
            
            static final int INT_ALL = 1;
            static final int INT_VOICE = 2;
            static final int INT_TEXT = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("All", INT_ALL),
                    new Enum("Voice", INT_VOICE),
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
            public static com.sendwordnow.notification.SendNotificationInfoBase.Device newValue(java.lang.Object obj) {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Device) type.newValue( obj ); }
            
            public static com.sendwordnow.notification.SendNotificationInfoBase.Device newInstance() {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.SendNotificationInfoBase.Device newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.SendNotificationInfoBase.Device) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.sendwordnow.notification.SendNotificationInfoBase newInstance() {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.sendwordnow.notification.SendNotificationInfoBase newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.SendNotificationInfoBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.SendNotificationInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
