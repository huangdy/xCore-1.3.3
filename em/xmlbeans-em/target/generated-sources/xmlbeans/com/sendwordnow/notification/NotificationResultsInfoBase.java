/*
 * XML Type:  NotificationResultsInfoBase
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.NotificationResultsInfoBase
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification;


/**
 * An XML NotificationResultsInfoBase(@http://www.sendwordnow.com/notification).
 *
 * This is a complex type.
 */
public interface NotificationResultsInfoBase extends com.sendwordnow.notification.SendNotificationInfoBase
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationResultsInfoBase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("notificationresultsinfobase6c4dtype");
    
    /**
     * Gets the "sentTimestamp" element
     */
    java.util.Calendar getSentTimestamp();
    
    /**
     * Gets (as xml) the "sentTimestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetSentTimestamp();
    
    /**
     * Sets the "sentTimestamp" element
     */
    void setSentTimestamp(java.util.Calendar sentTimestamp);
    
    /**
     * Sets (as xml) the "sentTimestamp" element
     */
    void xsetSentTimestamp(org.apache.xmlbeans.XmlDateTime sentTimestamp);
    
    /**
     * Gets the "statistics" element
     */
    com.sendwordnow.notification.NotificationResultsInfoBase.Statistics getStatistics();
    
    /**
     * Sets the "statistics" element
     */
    void setStatistics(com.sendwordnow.notification.NotificationResultsInfoBase.Statistics statistics);
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    com.sendwordnow.notification.NotificationResultsInfoBase.Statistics addNewStatistics();
    
    /**
     * Gets the "gwbStatistics" element
     */
    com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics getGwbStatistics();
    
    /**
     * True if has "gwbStatistics" element
     */
    boolean isSetGwbStatistics();
    
    /**
     * Sets the "gwbStatistics" element
     */
    void setGwbStatistics(com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics gwbStatistics);
    
    /**
     * Appends and returns a new empty "gwbStatistics" element
     */
    com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics addNewGwbStatistics();
    
    /**
     * Unsets the "gwbStatistics" element
     */
    void unsetGwbStatistics();
    
    /**
     * Gets the "confCallStatistics" element
     */
    com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics getConfCallStatistics();
    
    /**
     * True if has "confCallStatistics" element
     */
    boolean isSetConfCallStatistics();
    
    /**
     * Sets the "confCallStatistics" element
     */
    void setConfCallStatistics(com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics confCallStatistics);
    
    /**
     * Appends and returns a new empty "confCallStatistics" element
     */
    com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics addNewConfCallStatistics();
    
    /**
     * Unsets the "confCallStatistics" element
     */
    void unsetConfCallStatistics();
    
    /**
     * Gets the "resultGeneratedTimestamp" element
     */
    java.util.Calendar getResultGeneratedTimestamp();
    
    /**
     * Gets (as xml) the "resultGeneratedTimestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetResultGeneratedTimestamp();
    
    /**
     * Sets the "resultGeneratedTimestamp" element
     */
    void setResultGeneratedTimestamp(java.util.Calendar resultGeneratedTimestamp);
    
    /**
     * Sets (as xml) the "resultGeneratedTimestamp" element
     */
    void xsetResultGeneratedTimestamp(org.apache.xmlbeans.XmlDateTime resultGeneratedTimestamp);
    
    /**
     * Gets the "status" attribute
     */
    com.sendwordnow.notification.NotificationResultsInfoBase.Status.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" attribute
     */
    com.sendwordnow.notification.NotificationResultsInfoBase.Status xgetStatus();
    
    /**
     * Sets the "status" attribute
     */
    void setStatus(com.sendwordnow.notification.NotificationResultsInfoBase.Status.Enum status);
    
    /**
     * Sets (as xml) the "status" attribute
     */
    void xsetStatus(com.sendwordnow.notification.NotificationResultsInfoBase.Status status);
    
    /**
     * An XML statistics(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface Statistics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Statistics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("statisticsc4ccelemtype");
        
        /**
         * Gets the "nbrRcpts" element
         */
        java.math.BigInteger getNbrRcpts();
        
        /**
         * Gets (as xml) the "nbrRcpts" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrRcpts();
        
        /**
         * Sets the "nbrRcpts" element
         */
        void setNbrRcpts(java.math.BigInteger nbrRcpts);
        
        /**
         * Sets (as xml) the "nbrRcpts" element
         */
        void xsetNbrRcpts(org.apache.xmlbeans.XmlNonNegativeInteger nbrRcpts);
        
        /**
         * Gets the "nbrContactPnts" element
         */
        java.math.BigInteger getNbrContactPnts();
        
        /**
         * Gets (as xml) the "nbrContactPnts" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrContactPnts();
        
        /**
         * Sets the "nbrContactPnts" element
         */
        void setNbrContactPnts(java.math.BigInteger nbrContactPnts);
        
        /**
         * Sets (as xml) the "nbrContactPnts" element
         */
        void xsetNbrContactPnts(org.apache.xmlbeans.XmlNonNegativeInteger nbrContactPnts);
        
        /**
         * Gets the "nbrVoiceContactPnts" element
         */
        java.math.BigInteger getNbrVoiceContactPnts();
        
        /**
         * Gets (as xml) the "nbrVoiceContactPnts" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrVoiceContactPnts();
        
        /**
         * Sets the "nbrVoiceContactPnts" element
         */
        void setNbrVoiceContactPnts(java.math.BigInteger nbrVoiceContactPnts);
        
        /**
         * Sets (as xml) the "nbrVoiceContactPnts" element
         */
        void xsetNbrVoiceContactPnts(org.apache.xmlbeans.XmlNonNegativeInteger nbrVoiceContactPnts);
        
        /**
         * Gets the "nbrEmailAndTextContactPnts" element
         */
        java.math.BigInteger getNbrEmailAndTextContactPnts();
        
        /**
         * Gets (as xml) the "nbrEmailAndTextContactPnts" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrEmailAndTextContactPnts();
        
        /**
         * Sets the "nbrEmailAndTextContactPnts" element
         */
        void setNbrEmailAndTextContactPnts(java.math.BigInteger nbrEmailAndTextContactPnts);
        
        /**
         * Sets (as xml) the "nbrEmailAndTextContactPnts" element
         */
        void xsetNbrEmailAndTextContactPnts(org.apache.xmlbeans.XmlNonNegativeInteger nbrEmailAndTextContactPnts);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.NotificationResultsInfoBase.Statistics newInstance() {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.Statistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.NotificationResultsInfoBase.Statistics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.Statistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML gwbStatistics(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface GwbStatistics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GwbStatistics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("gwbstatisticsce2eelemtype");
        
        /**
         * Gets array of all "gwb" elements
         */
        com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb[] getGwbArray();
        
        /**
         * Gets ith "gwb" element
         */
        com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb getGwbArray(int i);
        
        /**
         * Returns number of "gwb" element
         */
        int sizeOfGwbArray();
        
        /**
         * Sets array of all "gwb" element
         */
        void setGwbArray(com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb[] gwbArray);
        
        /**
         * Sets ith "gwb" element
         */
        void setGwbArray(int i, com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb gwb);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gwb" element
         */
        com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb insertNewGwb(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gwb" element
         */
        com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb addNewGwb();
        
        /**
         * Removes the ith "gwb" element
         */
        void removeGwb(int i);
        
        /**
         * An XML gwb(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public interface Gwb extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gwb.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("gwba58celemtype");
            
            /**
             * Gets the "index" element
             */
            java.math.BigInteger getIndex();
            
            /**
             * Gets (as xml) the "index" element
             */
            org.apache.xmlbeans.XmlPositiveInteger xgetIndex();
            
            /**
             * Sets the "index" element
             */
            void setIndex(java.math.BigInteger index);
            
            /**
             * Sets (as xml) the "index" element
             */
            void xsetIndex(org.apache.xmlbeans.XmlPositiveInteger index);
            
            /**
             * Gets the "gwbText" element
             */
            java.lang.String getGwbText();
            
            /**
             * Gets (as xml) the "gwbText" element
             */
            com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText xgetGwbText();
            
            /**
             * Sets the "gwbText" element
             */
            void setGwbText(java.lang.String gwbText);
            
            /**
             * Sets (as xml) the "gwbText" element
             */
            void xsetGwbText(com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText gwbText);
            
            /**
             * Gets the "nbrResponses" element
             */
            java.math.BigInteger getNbrResponses();
            
            /**
             * Gets (as xml) the "nbrResponses" element
             */
            org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrResponses();
            
            /**
             * Sets the "nbrResponses" element
             */
            void setNbrResponses(java.math.BigInteger nbrResponses);
            
            /**
             * Sets (as xml) the "nbrResponses" element
             */
            void xsetNbrResponses(org.apache.xmlbeans.XmlNonNegativeInteger nbrResponses);
            
            /**
             * An XML gwbText(@http://www.sendwordnow.com/notification).
             *
             * This is an atomic type that is a restriction of com.sendwordnow.notification.NotificationResultsInfoBase$GwbStatistics$Gwb$GwbText.
             */
            public interface GwbText extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GwbText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("gwbtext0d37elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText newValue(java.lang.Object obj) {
                      return (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText) type.newValue( obj ); }
                    
                    public static com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText newInstance() {
                      return (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb newInstance() {
                  return (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics newInstance() {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML confCallStatistics(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface ConfCallStatistics extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConfCallStatistics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("confcallstatisticsc88eelemtype");
        
        /**
         * Gets the "idUsed" element
         */
        java.math.BigInteger getIdUsed();
        
        /**
         * Gets (as xml) the "idUsed" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetIdUsed();
        
        /**
         * Sets the "idUsed" element
         */
        void setIdUsed(java.math.BigInteger idUsed);
        
        /**
         * Sets (as xml) the "idUsed" element
         */
        void xsetIdUsed(org.apache.xmlbeans.XmlNonNegativeInteger idUsed);
        
        /**
         * Gets the "nbrRcptsJoined" element
         */
        java.math.BigInteger getNbrRcptsJoined();
        
        /**
         * Gets (as xml) the "nbrRcptsJoined" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrRcptsJoined();
        
        /**
         * Sets the "nbrRcptsJoined" element
         */
        void setNbrRcptsJoined(java.math.BigInteger nbrRcptsJoined);
        
        /**
         * Sets (as xml) the "nbrRcptsJoined" element
         */
        void xsetNbrRcptsJoined(org.apache.xmlbeans.XmlNonNegativeInteger nbrRcptsJoined);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics newInstance() {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML status(@).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.NotificationResultsInfoBase$Status.
     */
    public interface Status extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Status.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("status19dfattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum COMPLETE = Enum.forString("Complete");
        static final Enum INCOMPLETE = Enum.forString("Incomplete");
        
        static final int INT_COMPLETE = Enum.INT_COMPLETE;
        static final int INT_INCOMPLETE = Enum.INT_INCOMPLETE;
        
        /**
         * Enumeration value class for com.sendwordnow.notification.NotificationResultsInfoBase$Status.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_COMPLETE
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
            
            static final int INT_COMPLETE = 1;
            static final int INT_INCOMPLETE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Complete", INT_COMPLETE),
                    new Enum("Incomplete", INT_INCOMPLETE),
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
            public static com.sendwordnow.notification.NotificationResultsInfoBase.Status newValue(java.lang.Object obj) {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.Status) type.newValue( obj ); }
            
            public static com.sendwordnow.notification.NotificationResultsInfoBase.Status newInstance() {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.NotificationResultsInfoBase.Status newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.NotificationResultsInfoBase.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
        public static com.sendwordnow.notification.NotificationResultsInfoBase newInstance() {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.sendwordnow.notification.NotificationResultsInfoBase newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.NotificationResultsInfoBase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.NotificationResultsInfoBase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
