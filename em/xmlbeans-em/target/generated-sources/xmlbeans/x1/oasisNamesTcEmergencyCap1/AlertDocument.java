/*
 * An XML document type.
 * Localname: alert
 * Namespace: urn:oasis:names:tc:emergency:cap:1.1
 * Java type: x1.oasisNamesTcEmergencyCap1.AlertDocument
 *
 * Automatically generated - do not modify.
 */
package x1.oasisNamesTcEmergencyCap1;


/**
 * A document containing one alert(@urn:oasis:names:tc:emergency:cap:1.1) element.
 *
 * This is a complex type.
 */
public interface AlertDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlertDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("alert275fdoctype");
    
    /**
     * Gets the "alert" element
     */
    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlert();
    
    /**
     * Sets the "alert" element
     */
    void setAlert(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert);
    
    /**
     * Appends and returns a new empty "alert" element
     */
    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert addNewAlert();
    
    /**
     * An XML alert(@urn:oasis:names:tc:emergency:cap:1.1).
     *
     * This is a complex type.
     */
    public interface Alert extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Alert.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("alert0c97elemtype");
        
        /**
         * Gets the "identifier" element
         */
        java.lang.String getIdentifier();
        
        /**
         * Gets (as xml) the "identifier" element
         */
        org.apache.xmlbeans.XmlString xgetIdentifier();
        
        /**
         * Sets the "identifier" element
         */
        void setIdentifier(java.lang.String identifier);
        
        /**
         * Sets (as xml) the "identifier" element
         */
        void xsetIdentifier(org.apache.xmlbeans.XmlString identifier);
        
        /**
         * Gets the "sender" element
         */
        java.lang.String getSender();
        
        /**
         * Gets (as xml) the "sender" element
         */
        org.apache.xmlbeans.XmlString xgetSender();
        
        /**
         * Sets the "sender" element
         */
        void setSender(java.lang.String sender);
        
        /**
         * Sets (as xml) the "sender" element
         */
        void xsetSender(org.apache.xmlbeans.XmlString sender);
        
        /**
         * Gets the "sent" element
         */
        java.util.Calendar getSent();
        
        /**
         * Gets (as xml) the "sent" element
         */
        org.apache.xmlbeans.XmlDateTime xgetSent();
        
        /**
         * Sets the "sent" element
         */
        void setSent(java.util.Calendar sent);
        
        /**
         * Sets (as xml) the "sent" element
         */
        void xsetSent(org.apache.xmlbeans.XmlDateTime sent);
        
        /**
         * Gets the "status" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status.Enum getStatus();
        
        /**
         * Gets (as xml) the "status" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status xgetStatus();
        
        /**
         * Sets the "status" element
         */
        void setStatus(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status.Enum status);
        
        /**
         * Sets (as xml) the "status" element
         */
        void xsetStatus(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status status);
        
        /**
         * Gets the "msgType" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType.Enum getMsgType();
        
        /**
         * Gets (as xml) the "msgType" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType xgetMsgType();
        
        /**
         * Sets the "msgType" element
         */
        void setMsgType(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType.Enum msgType);
        
        /**
         * Sets (as xml) the "msgType" element
         */
        void xsetMsgType(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType msgType);
        
        /**
         * Gets the "source" element
         */
        java.lang.String getSource();
        
        /**
         * Gets (as xml) the "source" element
         */
        org.apache.xmlbeans.XmlString xgetSource();
        
        /**
         * True if has "source" element
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" element
         */
        void setSource(java.lang.String source);
        
        /**
         * Sets (as xml) the "source" element
         */
        void xsetSource(org.apache.xmlbeans.XmlString source);
        
        /**
         * Unsets the "source" element
         */
        void unsetSource();
        
        /**
         * Gets the "scope" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope.Enum getScope();
        
        /**
         * Gets (as xml) the "scope" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope xgetScope();
        
        /**
         * Sets the "scope" element
         */
        void setScope(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope.Enum scope);
        
        /**
         * Sets (as xml) the "scope" element
         */
        void xsetScope(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope scope);
        
        /**
         * Gets the "restriction" element
         */
        java.lang.String getRestriction();
        
        /**
         * Gets (as xml) the "restriction" element
         */
        org.apache.xmlbeans.XmlString xgetRestriction();
        
        /**
         * True if has "restriction" element
         */
        boolean isSetRestriction();
        
        /**
         * Sets the "restriction" element
         */
        void setRestriction(java.lang.String restriction);
        
        /**
         * Sets (as xml) the "restriction" element
         */
        void xsetRestriction(org.apache.xmlbeans.XmlString restriction);
        
        /**
         * Unsets the "restriction" element
         */
        void unsetRestriction();
        
        /**
         * Gets the "addresses" element
         */
        java.lang.String getAddresses();
        
        /**
         * Gets (as xml) the "addresses" element
         */
        org.apache.xmlbeans.XmlString xgetAddresses();
        
        /**
         * True if has "addresses" element
         */
        boolean isSetAddresses();
        
        /**
         * Sets the "addresses" element
         */
        void setAddresses(java.lang.String addresses);
        
        /**
         * Sets (as xml) the "addresses" element
         */
        void xsetAddresses(org.apache.xmlbeans.XmlString addresses);
        
        /**
         * Unsets the "addresses" element
         */
        void unsetAddresses();
        
        /**
         * Gets array of all "code" elements
         */
        java.lang.String[] getCodeArray();
        
        /**
         * Gets ith "code" element
         */
        java.lang.String getCodeArray(int i);
        
        /**
         * Gets (as xml) array of all "code" elements
         */
        org.apache.xmlbeans.XmlString[] xgetCodeArray();
        
        /**
         * Gets (as xml) ith "code" element
         */
        org.apache.xmlbeans.XmlString xgetCodeArray(int i);
        
        /**
         * Returns number of "code" element
         */
        int sizeOfCodeArray();
        
        /**
         * Sets array of all "code" element
         */
        void setCodeArray(java.lang.String[] codeArray);
        
        /**
         * Sets ith "code" element
         */
        void setCodeArray(int i, java.lang.String code);
        
        /**
         * Sets (as xml) array of all "code" element
         */
        void xsetCodeArray(org.apache.xmlbeans.XmlString[] codeArray);
        
        /**
         * Sets (as xml) ith "code" element
         */
        void xsetCodeArray(int i, org.apache.xmlbeans.XmlString code);
        
        /**
         * Inserts the value as the ith "code" element
         */
        void insertCode(int i, java.lang.String code);
        
        /**
         * Appends the value as the last "code" element
         */
        void addCode(java.lang.String code);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "code" element
         */
        org.apache.xmlbeans.XmlString insertNewCode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "code" element
         */
        org.apache.xmlbeans.XmlString addNewCode();
        
        /**
         * Removes the ith "code" element
         */
        void removeCode(int i);
        
        /**
         * Gets the "note" element
         */
        java.lang.String getNote();
        
        /**
         * Gets (as xml) the "note" element
         */
        org.apache.xmlbeans.XmlString xgetNote();
        
        /**
         * True if has "note" element
         */
        boolean isSetNote();
        
        /**
         * Sets the "note" element
         */
        void setNote(java.lang.String note);
        
        /**
         * Sets (as xml) the "note" element
         */
        void xsetNote(org.apache.xmlbeans.XmlString note);
        
        /**
         * Unsets the "note" element
         */
        void unsetNote();
        
        /**
         * Gets the "references" element
         */
        java.lang.String getReferences();
        
        /**
         * Gets (as xml) the "references" element
         */
        org.apache.xmlbeans.XmlString xgetReferences();
        
        /**
         * True if has "references" element
         */
        boolean isSetReferences();
        
        /**
         * Sets the "references" element
         */
        void setReferences(java.lang.String references);
        
        /**
         * Sets (as xml) the "references" element
         */
        void xsetReferences(org.apache.xmlbeans.XmlString references);
        
        /**
         * Unsets the "references" element
         */
        void unsetReferences();
        
        /**
         * Gets the "incidents" element
         */
        java.lang.String getIncidents();
        
        /**
         * Gets (as xml) the "incidents" element
         */
        org.apache.xmlbeans.XmlString xgetIncidents();
        
        /**
         * True if has "incidents" element
         */
        boolean isSetIncidents();
        
        /**
         * Sets the "incidents" element
         */
        void setIncidents(java.lang.String incidents);
        
        /**
         * Sets (as xml) the "incidents" element
         */
        void xsetIncidents(org.apache.xmlbeans.XmlString incidents);
        
        /**
         * Unsets the "incidents" element
         */
        void unsetIncidents();
        
        /**
         * Gets array of all "info" elements
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info[] getInfoArray();
        
        /**
         * Gets ith "info" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info getInfoArray(int i);
        
        /**
         * Returns number of "info" element
         */
        int sizeOfInfoArray();
        
        /**
         * Sets array of all "info" element
         */
        void setInfoArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info[] infoArray);
        
        /**
         * Sets ith "info" element
         */
        void setInfoArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info info);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "info" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info insertNewInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "info" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info addNewInfo();
        
        /**
         * Removes the ith "info" element
         */
        void removeInfo(int i);
        
        /**
         * An XML status(@urn:oasis:names:tc:emergency:cap:1.1).
         *
         * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Status.
         */
        public interface Status extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Status.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("status02c9elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ACTUAL = Enum.forString("Actual");
            static final Enum EXERCISE = Enum.forString("Exercise");
            static final Enum SYSTEM = Enum.forString("System");
            static final Enum TEST = Enum.forString("Test");
            static final Enum DRAFT = Enum.forString("Draft");
            
            static final int INT_ACTUAL = Enum.INT_ACTUAL;
            static final int INT_EXERCISE = Enum.INT_EXERCISE;
            static final int INT_SYSTEM = Enum.INT_SYSTEM;
            static final int INT_TEST = Enum.INT_TEST;
            static final int INT_DRAFT = Enum.INT_DRAFT;
            
            /**
             * Enumeration value class for x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Status.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ACTUAL
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
                
                static final int INT_ACTUAL = 1;
                static final int INT_EXERCISE = 2;
                static final int INT_SYSTEM = 3;
                static final int INT_TEST = 4;
                static final int INT_DRAFT = 5;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Actual", INT_ACTUAL),
                      new Enum("Exercise", INT_EXERCISE),
                      new Enum("System", INT_SYSTEM),
                      new Enum("Test", INT_TEST),
                      new Enum("Draft", INT_DRAFT),
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
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status newValue(java.lang.Object obj) {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status) type.newValue( obj ); }
                
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status newInstance() {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML msgType(@urn:oasis:names:tc:emergency:cap:1.1).
         *
         * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$MsgType.
         */
        public interface MsgType extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MsgType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("msgtype9c30elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ALERT = Enum.forString("Alert");
            static final Enum UPDATE = Enum.forString("Update");
            static final Enum CANCEL = Enum.forString("Cancel");
            static final Enum ACK = Enum.forString("Ack");
            static final Enum ERROR = Enum.forString("Error");
            
            static final int INT_ALERT = Enum.INT_ALERT;
            static final int INT_UPDATE = Enum.INT_UPDATE;
            static final int INT_CANCEL = Enum.INT_CANCEL;
            static final int INT_ACK = Enum.INT_ACK;
            static final int INT_ERROR = Enum.INT_ERROR;
            
            /**
             * Enumeration value class for x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$MsgType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ALERT
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
                
                static final int INT_ALERT = 1;
                static final int INT_UPDATE = 2;
                static final int INT_CANCEL = 3;
                static final int INT_ACK = 4;
                static final int INT_ERROR = 5;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Alert", INT_ALERT),
                      new Enum("Update", INT_UPDATE),
                      new Enum("Cancel", INT_CANCEL),
                      new Enum("Ack", INT_ACK),
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
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType newValue(java.lang.Object obj) {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType) type.newValue( obj ); }
                
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType newInstance() {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML scope(@urn:oasis:names:tc:emergency:cap:1.1).
         *
         * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Scope.
         */
        public interface Scope extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Scope.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("scopeafd7elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PUBLIC = Enum.forString("Public");
            static final Enum RESTRICTED = Enum.forString("Restricted");
            static final Enum PRIVATE = Enum.forString("Private");
            
            static final int INT_PUBLIC = Enum.INT_PUBLIC;
            static final int INT_RESTRICTED = Enum.INT_RESTRICTED;
            static final int INT_PRIVATE = Enum.INT_PRIVATE;
            
            /**
             * Enumeration value class for x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Scope.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PUBLIC
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
                
                static final int INT_PUBLIC = 1;
                static final int INT_RESTRICTED = 2;
                static final int INT_PRIVATE = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Public", INT_PUBLIC),
                      new Enum("Restricted", INT_RESTRICTED),
                      new Enum("Private", INT_PRIVATE),
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
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope newValue(java.lang.Object obj) {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope) type.newValue( obj ); }
                
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope newInstance() {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML info(@urn:oasis:names:tc:emergency:cap:1.1).
         *
         * This is a complex type.
         */
        public interface Info extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Info.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("infoe58delemtype");
            
            /**
             * Gets the "language" element
             */
            java.lang.String getLanguage();
            
            /**
             * Gets (as xml) the "language" element
             */
            org.apache.xmlbeans.XmlLanguage xgetLanguage();
            
            /**
             * True if has "language" element
             */
            boolean isSetLanguage();
            
            /**
             * Sets the "language" element
             */
            void setLanguage(java.lang.String language);
            
            /**
             * Sets (as xml) the "language" element
             */
            void xsetLanguage(org.apache.xmlbeans.XmlLanguage language);
            
            /**
             * Unsets the "language" element
             */
            void unsetLanguage();
            
            /**
             * Gets array of all "category" elements
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum[] getCategoryArray();
            
            /**
             * Gets ith "category" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum getCategoryArray(int i);
            
            /**
             * Gets (as xml) array of all "category" elements
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category[] xgetCategoryArray();
            
            /**
             * Gets (as xml) ith "category" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category xgetCategoryArray(int i);
            
            /**
             * Returns number of "category" element
             */
            int sizeOfCategoryArray();
            
            /**
             * Sets array of all "category" element
             */
            void setCategoryArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum[] categoryArray);
            
            /**
             * Sets ith "category" element
             */
            void setCategoryArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum category);
            
            /**
             * Sets (as xml) array of all "category" element
             */
            void xsetCategoryArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category[] categoryArray);
            
            /**
             * Sets (as xml) ith "category" element
             */
            void xsetCategoryArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category category);
            
            /**
             * Inserts the value as the ith "category" element
             */
            void insertCategory(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum category);
            
            /**
             * Appends the value as the last "category" element
             */
            void addCategory(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum category);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "category" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category insertNewCategory(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "category" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category addNewCategory();
            
            /**
             * Removes the ith "category" element
             */
            void removeCategory(int i);
            
            /**
             * Gets the "event" element
             */
            java.lang.String getEvent();
            
            /**
             * Gets (as xml) the "event" element
             */
            org.apache.xmlbeans.XmlString xgetEvent();
            
            /**
             * Sets the "event" element
             */
            void setEvent(java.lang.String event);
            
            /**
             * Sets (as xml) the "event" element
             */
            void xsetEvent(org.apache.xmlbeans.XmlString event);
            
            /**
             * Gets array of all "responseType" elements
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum[] getResponseTypeArray();
            
            /**
             * Gets ith "responseType" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum getResponseTypeArray(int i);
            
            /**
             * Gets (as xml) array of all "responseType" elements
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType[] xgetResponseTypeArray();
            
            /**
             * Gets (as xml) ith "responseType" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType xgetResponseTypeArray(int i);
            
            /**
             * Returns number of "responseType" element
             */
            int sizeOfResponseTypeArray();
            
            /**
             * Sets array of all "responseType" element
             */
            void setResponseTypeArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum[] responseTypeArray);
            
            /**
             * Sets ith "responseType" element
             */
            void setResponseTypeArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum responseType);
            
            /**
             * Sets (as xml) array of all "responseType" element
             */
            void xsetResponseTypeArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType[] responseTypeArray);
            
            /**
             * Sets (as xml) ith "responseType" element
             */
            void xsetResponseTypeArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType responseType);
            
            /**
             * Inserts the value as the ith "responseType" element
             */
            void insertResponseType(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum responseType);
            
            /**
             * Appends the value as the last "responseType" element
             */
            void addResponseType(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum responseType);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "responseType" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType insertNewResponseType(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "responseType" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType addNewResponseType();
            
            /**
             * Removes the ith "responseType" element
             */
            void removeResponseType(int i);
            
            /**
             * Gets the "urgency" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency.Enum getUrgency();
            
            /**
             * Gets (as xml) the "urgency" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency xgetUrgency();
            
            /**
             * Sets the "urgency" element
             */
            void setUrgency(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency.Enum urgency);
            
            /**
             * Sets (as xml) the "urgency" element
             */
            void xsetUrgency(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency urgency);
            
            /**
             * Gets the "severity" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity.Enum getSeverity();
            
            /**
             * Gets (as xml) the "severity" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity xgetSeverity();
            
            /**
             * Sets the "severity" element
             */
            void setSeverity(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity.Enum severity);
            
            /**
             * Sets (as xml) the "severity" element
             */
            void xsetSeverity(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity severity);
            
            /**
             * Gets the "certainty" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty.Enum getCertainty();
            
            /**
             * Gets (as xml) the "certainty" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty xgetCertainty();
            
            /**
             * Sets the "certainty" element
             */
            void setCertainty(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty.Enum certainty);
            
            /**
             * Sets (as xml) the "certainty" element
             */
            void xsetCertainty(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty certainty);
            
            /**
             * Gets the "audience" element
             */
            java.lang.String getAudience();
            
            /**
             * Gets (as xml) the "audience" element
             */
            org.apache.xmlbeans.XmlString xgetAudience();
            
            /**
             * True if has "audience" element
             */
            boolean isSetAudience();
            
            /**
             * Sets the "audience" element
             */
            void setAudience(java.lang.String audience);
            
            /**
             * Sets (as xml) the "audience" element
             */
            void xsetAudience(org.apache.xmlbeans.XmlString audience);
            
            /**
             * Unsets the "audience" element
             */
            void unsetAudience();
            
            /**
             * Gets array of all "eventCode" elements
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode[] getEventCodeArray();
            
            /**
             * Gets ith "eventCode" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode getEventCodeArray(int i);
            
            /**
             * Returns number of "eventCode" element
             */
            int sizeOfEventCodeArray();
            
            /**
             * Sets array of all "eventCode" element
             */
            void setEventCodeArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode[] eventCodeArray);
            
            /**
             * Sets ith "eventCode" element
             */
            void setEventCodeArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode eventCode);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "eventCode" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode insertNewEventCode(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "eventCode" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode addNewEventCode();
            
            /**
             * Removes the ith "eventCode" element
             */
            void removeEventCode(int i);
            
            /**
             * Gets the "effective" element
             */
            java.util.Calendar getEffective();
            
            /**
             * Gets (as xml) the "effective" element
             */
            org.apache.xmlbeans.XmlDateTime xgetEffective();
            
            /**
             * True if has "effective" element
             */
            boolean isSetEffective();
            
            /**
             * Sets the "effective" element
             */
            void setEffective(java.util.Calendar effective);
            
            /**
             * Sets (as xml) the "effective" element
             */
            void xsetEffective(org.apache.xmlbeans.XmlDateTime effective);
            
            /**
             * Unsets the "effective" element
             */
            void unsetEffective();
            
            /**
             * Gets the "onset" element
             */
            java.util.Calendar getOnset();
            
            /**
             * Gets (as xml) the "onset" element
             */
            org.apache.xmlbeans.XmlDateTime xgetOnset();
            
            /**
             * True if has "onset" element
             */
            boolean isSetOnset();
            
            /**
             * Sets the "onset" element
             */
            void setOnset(java.util.Calendar onset);
            
            /**
             * Sets (as xml) the "onset" element
             */
            void xsetOnset(org.apache.xmlbeans.XmlDateTime onset);
            
            /**
             * Unsets the "onset" element
             */
            void unsetOnset();
            
            /**
             * Gets the "expires" element
             */
            java.util.Calendar getExpires();
            
            /**
             * Gets (as xml) the "expires" element
             */
            org.apache.xmlbeans.XmlDateTime xgetExpires();
            
            /**
             * True if has "expires" element
             */
            boolean isSetExpires();
            
            /**
             * Sets the "expires" element
             */
            void setExpires(java.util.Calendar expires);
            
            /**
             * Sets (as xml) the "expires" element
             */
            void xsetExpires(org.apache.xmlbeans.XmlDateTime expires);
            
            /**
             * Unsets the "expires" element
             */
            void unsetExpires();
            
            /**
             * Gets the "senderName" element
             */
            java.lang.String getSenderName();
            
            /**
             * Gets (as xml) the "senderName" element
             */
            org.apache.xmlbeans.XmlString xgetSenderName();
            
            /**
             * True if has "senderName" element
             */
            boolean isSetSenderName();
            
            /**
             * Sets the "senderName" element
             */
            void setSenderName(java.lang.String senderName);
            
            /**
             * Sets (as xml) the "senderName" element
             */
            void xsetSenderName(org.apache.xmlbeans.XmlString senderName);
            
            /**
             * Unsets the "senderName" element
             */
            void unsetSenderName();
            
            /**
             * Gets the "headline" element
             */
            java.lang.String getHeadline();
            
            /**
             * Gets (as xml) the "headline" element
             */
            org.apache.xmlbeans.XmlString xgetHeadline();
            
            /**
             * True if has "headline" element
             */
            boolean isSetHeadline();
            
            /**
             * Sets the "headline" element
             */
            void setHeadline(java.lang.String headline);
            
            /**
             * Sets (as xml) the "headline" element
             */
            void xsetHeadline(org.apache.xmlbeans.XmlString headline);
            
            /**
             * Unsets the "headline" element
             */
            void unsetHeadline();
            
            /**
             * Gets the "description" element
             */
            java.lang.String getDescription();
            
            /**
             * Gets (as xml) the "description" element
             */
            org.apache.xmlbeans.XmlString xgetDescription();
            
            /**
             * True if has "description" element
             */
            boolean isSetDescription();
            
            /**
             * Sets the "description" element
             */
            void setDescription(java.lang.String description);
            
            /**
             * Sets (as xml) the "description" element
             */
            void xsetDescription(org.apache.xmlbeans.XmlString description);
            
            /**
             * Unsets the "description" element
             */
            void unsetDescription();
            
            /**
             * Gets the "instruction" element
             */
            java.lang.String getInstruction();
            
            /**
             * Gets (as xml) the "instruction" element
             */
            org.apache.xmlbeans.XmlString xgetInstruction();
            
            /**
             * True if has "instruction" element
             */
            boolean isSetInstruction();
            
            /**
             * Sets the "instruction" element
             */
            void setInstruction(java.lang.String instruction);
            
            /**
             * Sets (as xml) the "instruction" element
             */
            void xsetInstruction(org.apache.xmlbeans.XmlString instruction);
            
            /**
             * Unsets the "instruction" element
             */
            void unsetInstruction();
            
            /**
             * Gets the "web" element
             */
            java.lang.String getWeb();
            
            /**
             * Gets (as xml) the "web" element
             */
            org.apache.xmlbeans.XmlAnyURI xgetWeb();
            
            /**
             * True if has "web" element
             */
            boolean isSetWeb();
            
            /**
             * Sets the "web" element
             */
            void setWeb(java.lang.String web);
            
            /**
             * Sets (as xml) the "web" element
             */
            void xsetWeb(org.apache.xmlbeans.XmlAnyURI web);
            
            /**
             * Unsets the "web" element
             */
            void unsetWeb();
            
            /**
             * Gets the "contact" element
             */
            java.lang.String getContact();
            
            /**
             * Gets (as xml) the "contact" element
             */
            org.apache.xmlbeans.XmlString xgetContact();
            
            /**
             * True if has "contact" element
             */
            boolean isSetContact();
            
            /**
             * Sets the "contact" element
             */
            void setContact(java.lang.String contact);
            
            /**
             * Sets (as xml) the "contact" element
             */
            void xsetContact(org.apache.xmlbeans.XmlString contact);
            
            /**
             * Unsets the "contact" element
             */
            void unsetContact();
            
            /**
             * Gets array of all "parameter" elements
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter[] getParameterArray();
            
            /**
             * Gets ith "parameter" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter getParameterArray(int i);
            
            /**
             * Returns number of "parameter" element
             */
            int sizeOfParameterArray();
            
            /**
             * Sets array of all "parameter" element
             */
            void setParameterArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter[] parameterArray);
            
            /**
             * Sets ith "parameter" element
             */
            void setParameterArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter parameter);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "parameter" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter insertNewParameter(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "parameter" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter addNewParameter();
            
            /**
             * Removes the ith "parameter" element
             */
            void removeParameter(int i);
            
            /**
             * Gets array of all "resource" elements
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource[] getResourceArray();
            
            /**
             * Gets ith "resource" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource getResourceArray(int i);
            
            /**
             * Returns number of "resource" element
             */
            int sizeOfResourceArray();
            
            /**
             * Sets array of all "resource" element
             */
            void setResourceArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource[] resourceArray);
            
            /**
             * Sets ith "resource" element
             */
            void setResourceArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource resource);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "resource" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource insertNewResource(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "resource" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource addNewResource();
            
            /**
             * Removes the ith "resource" element
             */
            void removeResource(int i);
            
            /**
             * Gets array of all "area" elements
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area[] getAreaArray();
            
            /**
             * Gets ith "area" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area getAreaArray(int i);
            
            /**
             * Returns number of "area" element
             */
            int sizeOfAreaArray();
            
            /**
             * Sets array of all "area" element
             */
            void setAreaArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area[] areaArray);
            
            /**
             * Sets ith "area" element
             */
            void setAreaArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area area);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "area" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area insertNewArea(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "area" element
             */
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area addNewArea();
            
            /**
             * Removes the ith "area" element
             */
            void removeArea(int i);
            
            /**
             * An XML category(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Category.
             */
            public interface Category extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Category.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("categorya027elemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum GEO = Enum.forString("Geo");
                static final Enum MET = Enum.forString("Met");
                static final Enum SAFETY = Enum.forString("Safety");
                static final Enum SECURITY = Enum.forString("Security");
                static final Enum RESCUE = Enum.forString("Rescue");
                static final Enum FIRE = Enum.forString("Fire");
                static final Enum HEALTH = Enum.forString("Health");
                static final Enum ENV = Enum.forString("Env");
                static final Enum TRANSPORT = Enum.forString("Transport");
                static final Enum INFRA = Enum.forString("Infra");
                static final Enum CBRNE = Enum.forString("CBRNE");
                static final Enum OTHER = Enum.forString("Other");
                
                static final int INT_GEO = Enum.INT_GEO;
                static final int INT_MET = Enum.INT_MET;
                static final int INT_SAFETY = Enum.INT_SAFETY;
                static final int INT_SECURITY = Enum.INT_SECURITY;
                static final int INT_RESCUE = Enum.INT_RESCUE;
                static final int INT_FIRE = Enum.INT_FIRE;
                static final int INT_HEALTH = Enum.INT_HEALTH;
                static final int INT_ENV = Enum.INT_ENV;
                static final int INT_TRANSPORT = Enum.INT_TRANSPORT;
                static final int INT_INFRA = Enum.INT_INFRA;
                static final int INT_CBRNE = Enum.INT_CBRNE;
                static final int INT_OTHER = Enum.INT_OTHER;
                
                /**
                 * Enumeration value class for x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Category.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_GEO
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
                    
                    static final int INT_GEO = 1;
                    static final int INT_MET = 2;
                    static final int INT_SAFETY = 3;
                    static final int INT_SECURITY = 4;
                    static final int INT_RESCUE = 5;
                    static final int INT_FIRE = 6;
                    static final int INT_HEALTH = 7;
                    static final int INT_ENV = 8;
                    static final int INT_TRANSPORT = 9;
                    static final int INT_INFRA = 10;
                    static final int INT_CBRNE = 11;
                    static final int INT_OTHER = 12;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("Geo", INT_GEO),
                        new Enum("Met", INT_MET),
                        new Enum("Safety", INT_SAFETY),
                        new Enum("Security", INT_SECURITY),
                        new Enum("Rescue", INT_RESCUE),
                        new Enum("Fire", INT_FIRE),
                        new Enum("Health", INT_HEALTH),
                        new Enum("Env", INT_ENV),
                        new Enum("Transport", INT_TRANSPORT),
                        new Enum("Infra", INT_INFRA),
                        new Enum("CBRNE", INT_CBRNE),
                        new Enum("Other", INT_OTHER),
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
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category newValue(java.lang.Object obj) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category) type.newValue( obj ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML responseType(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$ResponseType.
             */
            public interface ResponseType extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("responsetype14c4elemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum SHELTER = Enum.forString("Shelter");
                static final Enum EVACUATE = Enum.forString("Evacuate");
                static final Enum PREPARE = Enum.forString("Prepare");
                static final Enum EXECUTE = Enum.forString("Execute");
                static final Enum MONITOR = Enum.forString("Monitor");
                static final Enum ASSESS = Enum.forString("Assess");
                static final Enum NONE = Enum.forString("None");
                
                static final int INT_SHELTER = Enum.INT_SHELTER;
                static final int INT_EVACUATE = Enum.INT_EVACUATE;
                static final int INT_PREPARE = Enum.INT_PREPARE;
                static final int INT_EXECUTE = Enum.INT_EXECUTE;
                static final int INT_MONITOR = Enum.INT_MONITOR;
                static final int INT_ASSESS = Enum.INT_ASSESS;
                static final int INT_NONE = Enum.INT_NONE;
                
                /**
                 * Enumeration value class for x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$ResponseType.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_SHELTER
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
                    
                    static final int INT_SHELTER = 1;
                    static final int INT_EVACUATE = 2;
                    static final int INT_PREPARE = 3;
                    static final int INT_EXECUTE = 4;
                    static final int INT_MONITOR = 5;
                    static final int INT_ASSESS = 6;
                    static final int INT_NONE = 7;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("Shelter", INT_SHELTER),
                        new Enum("Evacuate", INT_EVACUATE),
                        new Enum("Prepare", INT_PREPARE),
                        new Enum("Execute", INT_EXECUTE),
                        new Enum("Monitor", INT_MONITOR),
                        new Enum("Assess", INT_ASSESS),
                        new Enum("None", INT_NONE),
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
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType newValue(java.lang.Object obj) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType) type.newValue( obj ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML urgency(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Urgency.
             */
            public interface Urgency extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Urgency.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("urgency0fc2elemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum IMMEDIATE = Enum.forString("Immediate");
                static final Enum EXPECTED = Enum.forString("Expected");
                static final Enum FUTURE = Enum.forString("Future");
                static final Enum PAST = Enum.forString("Past");
                static final Enum UNKNOWN = Enum.forString("Unknown");
                
                static final int INT_IMMEDIATE = Enum.INT_IMMEDIATE;
                static final int INT_EXPECTED = Enum.INT_EXPECTED;
                static final int INT_FUTURE = Enum.INT_FUTURE;
                static final int INT_PAST = Enum.INT_PAST;
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                
                /**
                 * Enumeration value class for x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Urgency.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_IMMEDIATE
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
                    
                    static final int INT_IMMEDIATE = 1;
                    static final int INT_EXPECTED = 2;
                    static final int INT_FUTURE = 3;
                    static final int INT_PAST = 4;
                    static final int INT_UNKNOWN = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("Immediate", INT_IMMEDIATE),
                        new Enum("Expected", INT_EXPECTED),
                        new Enum("Future", INT_FUTURE),
                        new Enum("Past", INT_PAST),
                        new Enum("Unknown", INT_UNKNOWN),
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
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency newValue(java.lang.Object obj) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency) type.newValue( obj ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML severity(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Severity.
             */
            public interface Severity extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Severity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("severity55a6elemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum EXTREME = Enum.forString("Extreme");
                static final Enum SEVERE = Enum.forString("Severe");
                static final Enum MODERATE = Enum.forString("Moderate");
                static final Enum MINOR = Enum.forString("Minor");
                static final Enum UNKNOWN = Enum.forString("Unknown");
                
                static final int INT_EXTREME = Enum.INT_EXTREME;
                static final int INT_SEVERE = Enum.INT_SEVERE;
                static final int INT_MODERATE = Enum.INT_MODERATE;
                static final int INT_MINOR = Enum.INT_MINOR;
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                
                /**
                 * Enumeration value class for x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Severity.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_EXTREME
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
                    
                    static final int INT_EXTREME = 1;
                    static final int INT_SEVERE = 2;
                    static final int INT_MODERATE = 3;
                    static final int INT_MINOR = 4;
                    static final int INT_UNKNOWN = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("Extreme", INT_EXTREME),
                        new Enum("Severe", INT_SEVERE),
                        new Enum("Moderate", INT_MODERATE),
                        new Enum("Minor", INT_MINOR),
                        new Enum("Unknown", INT_UNKNOWN),
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
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity newValue(java.lang.Object obj) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity) type.newValue( obj ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML certainty(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Certainty.
             */
            public interface Certainty extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Certainty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("certaintyec20elemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum OBSERVED = Enum.forString("Observed");
                static final Enum LIKELY = Enum.forString("Likely");
                static final Enum POSSIBLE = Enum.forString("Possible");
                static final Enum UNLIKELY = Enum.forString("Unlikely");
                static final Enum UNKNOWN = Enum.forString("Unknown");
                
                static final int INT_OBSERVED = Enum.INT_OBSERVED;
                static final int INT_LIKELY = Enum.INT_LIKELY;
                static final int INT_POSSIBLE = Enum.INT_POSSIBLE;
                static final int INT_UNLIKELY = Enum.INT_UNLIKELY;
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                
                /**
                 * Enumeration value class for x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Certainty.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_OBSERVED
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
                    
                    static final int INT_OBSERVED = 1;
                    static final int INT_LIKELY = 2;
                    static final int INT_POSSIBLE = 3;
                    static final int INT_UNLIKELY = 4;
                    static final int INT_UNKNOWN = 5;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("Observed", INT_OBSERVED),
                        new Enum("Likely", INT_LIKELY),
                        new Enum("Possible", INT_POSSIBLE),
                        new Enum("Unlikely", INT_UNLIKELY),
                        new Enum("Unknown", INT_UNKNOWN),
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
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty newValue(java.lang.Object obj) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty) type.newValue( obj ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML eventCode(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is a complex type.
             */
            public interface EventCode extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("eventcodea920elemtype");
                
                /**
                 * Gets the "valueName" element
                 */
                java.lang.String getValueName();
                
                /**
                 * Gets (as xml) the "valueName" element
                 */
                org.apache.xmlbeans.XmlString xgetValueName();
                
                /**
                 * Sets the "valueName" element
                 */
                void setValueName(java.lang.String valueName);
                
                /**
                 * Sets (as xml) the "valueName" element
                 */
                void xsetValueName(org.apache.xmlbeans.XmlString valueName);
                
                /**
                 * Gets the "value" element
                 */
                java.lang.String getValue();
                
                /**
                 * Gets (as xml) the "value" element
                 */
                org.apache.xmlbeans.XmlString xgetValue();
                
                /**
                 * Sets the "value" element
                 */
                void setValue(java.lang.String value);
                
                /**
                 * Sets (as xml) the "value" element
                 */
                void xsetValue(org.apache.xmlbeans.XmlString value);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML parameter(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is a complex type.
             */
            public interface Parameter extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("parametere622elemtype");
                
                /**
                 * Gets the "valueName" element
                 */
                java.lang.String getValueName();
                
                /**
                 * Gets (as xml) the "valueName" element
                 */
                org.apache.xmlbeans.XmlString xgetValueName();
                
                /**
                 * Sets the "valueName" element
                 */
                void setValueName(java.lang.String valueName);
                
                /**
                 * Sets (as xml) the "valueName" element
                 */
                void xsetValueName(org.apache.xmlbeans.XmlString valueName);
                
                /**
                 * Gets the "value" element
                 */
                java.lang.String getValue();
                
                /**
                 * Gets (as xml) the "value" element
                 */
                org.apache.xmlbeans.XmlString xgetValue();
                
                /**
                 * Sets the "value" element
                 */
                void setValue(java.lang.String value);
                
                /**
                 * Sets (as xml) the "value" element
                 */
                void xsetValue(org.apache.xmlbeans.XmlString value);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML resource(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is a complex type.
             */
            public interface Resource extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("resource2f37elemtype");
                
                /**
                 * Gets the "resourceDesc" element
                 */
                java.lang.String getResourceDesc();
                
                /**
                 * Gets (as xml) the "resourceDesc" element
                 */
                org.apache.xmlbeans.XmlString xgetResourceDesc();
                
                /**
                 * Sets the "resourceDesc" element
                 */
                void setResourceDesc(java.lang.String resourceDesc);
                
                /**
                 * Sets (as xml) the "resourceDesc" element
                 */
                void xsetResourceDesc(org.apache.xmlbeans.XmlString resourceDesc);
                
                /**
                 * Gets the "mimeType" element
                 */
                java.lang.String getMimeType();
                
                /**
                 * Gets (as xml) the "mimeType" element
                 */
                org.apache.xmlbeans.XmlString xgetMimeType();
                
                /**
                 * True if has "mimeType" element
                 */
                boolean isSetMimeType();
                
                /**
                 * Sets the "mimeType" element
                 */
                void setMimeType(java.lang.String mimeType);
                
                /**
                 * Sets (as xml) the "mimeType" element
                 */
                void xsetMimeType(org.apache.xmlbeans.XmlString mimeType);
                
                /**
                 * Unsets the "mimeType" element
                 */
                void unsetMimeType();
                
                /**
                 * Gets the "size" element
                 */
                java.math.BigInteger getSize();
                
                /**
                 * Gets (as xml) the "size" element
                 */
                org.apache.xmlbeans.XmlInteger xgetSize();
                
                /**
                 * True if has "size" element
                 */
                boolean isSetSize();
                
                /**
                 * Sets the "size" element
                 */
                void setSize(java.math.BigInteger size);
                
                /**
                 * Sets (as xml) the "size" element
                 */
                void xsetSize(org.apache.xmlbeans.XmlInteger size);
                
                /**
                 * Unsets the "size" element
                 */
                void unsetSize();
                
                /**
                 * Gets the "uri" element
                 */
                java.lang.String getUri();
                
                /**
                 * Gets (as xml) the "uri" element
                 */
                org.apache.xmlbeans.XmlAnyURI xgetUri();
                
                /**
                 * True if has "uri" element
                 */
                boolean isSetUri();
                
                /**
                 * Sets the "uri" element
                 */
                void setUri(java.lang.String uri);
                
                /**
                 * Sets (as xml) the "uri" element
                 */
                void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);
                
                /**
                 * Unsets the "uri" element
                 */
                void unsetUri();
                
                /**
                 * Gets the "derefUri" element
                 */
                java.lang.String getDerefUri();
                
                /**
                 * Gets (as xml) the "derefUri" element
                 */
                org.apache.xmlbeans.XmlString xgetDerefUri();
                
                /**
                 * True if has "derefUri" element
                 */
                boolean isSetDerefUri();
                
                /**
                 * Sets the "derefUri" element
                 */
                void setDerefUri(java.lang.String derefUri);
                
                /**
                 * Sets (as xml) the "derefUri" element
                 */
                void xsetDerefUri(org.apache.xmlbeans.XmlString derefUri);
                
                /**
                 * Unsets the "derefUri" element
                 */
                void unsetDerefUri();
                
                /**
                 * Gets the "digest" element
                 */
                java.lang.String getDigest();
                
                /**
                 * Gets (as xml) the "digest" element
                 */
                org.apache.xmlbeans.XmlString xgetDigest();
                
                /**
                 * True if has "digest" element
                 */
                boolean isSetDigest();
                
                /**
                 * Sets the "digest" element
                 */
                void setDigest(java.lang.String digest);
                
                /**
                 * Sets (as xml) the "digest" element
                 */
                void xsetDigest(org.apache.xmlbeans.XmlString digest);
                
                /**
                 * Unsets the "digest" element
                 */
                void unsetDigest();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML area(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is a complex type.
             */
            public interface Area extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Area.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("areae736elemtype");
                
                /**
                 * Gets the "areaDesc" element
                 */
                java.lang.String getAreaDesc();
                
                /**
                 * Gets (as xml) the "areaDesc" element
                 */
                org.apache.xmlbeans.XmlString xgetAreaDesc();
                
                /**
                 * Sets the "areaDesc" element
                 */
                void setAreaDesc(java.lang.String areaDesc);
                
                /**
                 * Sets (as xml) the "areaDesc" element
                 */
                void xsetAreaDesc(org.apache.xmlbeans.XmlString areaDesc);
                
                /**
                 * Gets array of all "polygon" elements
                 */
                java.lang.String[] getPolygonArray();
                
                /**
                 * Gets ith "polygon" element
                 */
                java.lang.String getPolygonArray(int i);
                
                /**
                 * Gets (as xml) array of all "polygon" elements
                 */
                org.apache.xmlbeans.XmlString[] xgetPolygonArray();
                
                /**
                 * Gets (as xml) ith "polygon" element
                 */
                org.apache.xmlbeans.XmlString xgetPolygonArray(int i);
                
                /**
                 * Returns number of "polygon" element
                 */
                int sizeOfPolygonArray();
                
                /**
                 * Sets array of all "polygon" element
                 */
                void setPolygonArray(java.lang.String[] polygonArray);
                
                /**
                 * Sets ith "polygon" element
                 */
                void setPolygonArray(int i, java.lang.String polygon);
                
                /**
                 * Sets (as xml) array of all "polygon" element
                 */
                void xsetPolygonArray(org.apache.xmlbeans.XmlString[] polygonArray);
                
                /**
                 * Sets (as xml) ith "polygon" element
                 */
                void xsetPolygonArray(int i, org.apache.xmlbeans.XmlString polygon);
                
                /**
                 * Inserts the value as the ith "polygon" element
                 */
                void insertPolygon(int i, java.lang.String polygon);
                
                /**
                 * Appends the value as the last "polygon" element
                 */
                void addPolygon(java.lang.String polygon);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "polygon" element
                 */
                org.apache.xmlbeans.XmlString insertNewPolygon(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "polygon" element
                 */
                org.apache.xmlbeans.XmlString addNewPolygon();
                
                /**
                 * Removes the ith "polygon" element
                 */
                void removePolygon(int i);
                
                /**
                 * Gets array of all "circle" elements
                 */
                java.lang.String[] getCircleArray();
                
                /**
                 * Gets ith "circle" element
                 */
                java.lang.String getCircleArray(int i);
                
                /**
                 * Gets (as xml) array of all "circle" elements
                 */
                org.apache.xmlbeans.XmlString[] xgetCircleArray();
                
                /**
                 * Gets (as xml) ith "circle" element
                 */
                org.apache.xmlbeans.XmlString xgetCircleArray(int i);
                
                /**
                 * Returns number of "circle" element
                 */
                int sizeOfCircleArray();
                
                /**
                 * Sets array of all "circle" element
                 */
                void setCircleArray(java.lang.String[] circleArray);
                
                /**
                 * Sets ith "circle" element
                 */
                void setCircleArray(int i, java.lang.String circle);
                
                /**
                 * Sets (as xml) array of all "circle" element
                 */
                void xsetCircleArray(org.apache.xmlbeans.XmlString[] circleArray);
                
                /**
                 * Sets (as xml) ith "circle" element
                 */
                void xsetCircleArray(int i, org.apache.xmlbeans.XmlString circle);
                
                /**
                 * Inserts the value as the ith "circle" element
                 */
                void insertCircle(int i, java.lang.String circle);
                
                /**
                 * Appends the value as the last "circle" element
                 */
                void addCircle(java.lang.String circle);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "circle" element
                 */
                org.apache.xmlbeans.XmlString insertNewCircle(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "circle" element
                 */
                org.apache.xmlbeans.XmlString addNewCircle();
                
                /**
                 * Removes the ith "circle" element
                 */
                void removeCircle(int i);
                
                /**
                 * Gets array of all "geocode" elements
                 */
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode[] getGeocodeArray();
                
                /**
                 * Gets ith "geocode" element
                 */
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode getGeocodeArray(int i);
                
                /**
                 * Returns number of "geocode" element
                 */
                int sizeOfGeocodeArray();
                
                /**
                 * Sets array of all "geocode" element
                 */
                void setGeocodeArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode[] geocodeArray);
                
                /**
                 * Sets ith "geocode" element
                 */
                void setGeocodeArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode geocode);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "geocode" element
                 */
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode insertNewGeocode(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "geocode" element
                 */
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode addNewGeocode();
                
                /**
                 * Removes the ith "geocode" element
                 */
                void removeGeocode(int i);
                
                /**
                 * Gets the "altitude" element
                 */
                java.lang.String getAltitude();
                
                /**
                 * Gets (as xml) the "altitude" element
                 */
                org.apache.xmlbeans.XmlString xgetAltitude();
                
                /**
                 * True if has "altitude" element
                 */
                boolean isSetAltitude();
                
                /**
                 * Sets the "altitude" element
                 */
                void setAltitude(java.lang.String altitude);
                
                /**
                 * Sets (as xml) the "altitude" element
                 */
                void xsetAltitude(org.apache.xmlbeans.XmlString altitude);
                
                /**
                 * Unsets the "altitude" element
                 */
                void unsetAltitude();
                
                /**
                 * Gets the "ceiling" element
                 */
                java.lang.String getCeiling();
                
                /**
                 * Gets (as xml) the "ceiling" element
                 */
                org.apache.xmlbeans.XmlString xgetCeiling();
                
                /**
                 * True if has "ceiling" element
                 */
                boolean isSetCeiling();
                
                /**
                 * Sets the "ceiling" element
                 */
                void setCeiling(java.lang.String ceiling);
                
                /**
                 * Sets (as xml) the "ceiling" element
                 */
                void xsetCeiling(org.apache.xmlbeans.XmlString ceiling);
                
                /**
                 * Unsets the "ceiling" element
                 */
                void unsetCeiling();
                
                /**
                 * An XML geocode(@urn:oasis:names:tc:emergency:cap:1.1).
                 *
                 * This is a complex type.
                 */
                public interface Geocode extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Geocode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("geocodee5ccelemtype");
                    
                    /**
                     * Gets the "valueName" element
                     */
                    java.lang.String getValueName();
                    
                    /**
                     * Gets (as xml) the "valueName" element
                     */
                    org.apache.xmlbeans.XmlString xgetValueName();
                    
                    /**
                     * Sets the "valueName" element
                     */
                    void setValueName(java.lang.String valueName);
                    
                    /**
                     * Sets (as xml) the "valueName" element
                     */
                    void xsetValueName(org.apache.xmlbeans.XmlString valueName);
                    
                    /**
                     * Gets the "value" element
                     */
                    java.lang.String getValue();
                    
                    /**
                     * Gets (as xml) the "value" element
                     */
                    org.apache.xmlbeans.XmlString xgetValue();
                    
                    /**
                     * Sets the "value" element
                     */
                    void setValue(java.lang.String value);
                    
                    /**
                     * Sets (as xml) the "value" element
                     */
                    void xsetValue(org.apache.xmlbeans.XmlString value);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode newInstance() {
                        return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area newInstance() {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info newInstance() {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert newInstance() {
              return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument newInstance() {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x1.oasisNamesTcEmergencyCap1.AlertDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x1.oasisNamesTcEmergencyCap1.AlertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
