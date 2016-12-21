/*
 * XML Type:  EmergencyDepartmentStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * An XML EmergencyDepartmentStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public interface EmergencyDepartmentStatus extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmergencyDepartmentStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("emergencydepartmentstatusfd32type");
    
    /**
     * Gets the "EMSTraffic" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic getEMSTraffic();
    
    /**
     * True if has "EMSTraffic" element
     */
    boolean isSetEMSTraffic();
    
    /**
     * Sets the "EMSTraffic" element
     */
    void setEMSTraffic(x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic emsTraffic);
    
    /**
     * Appends and returns a new empty "EMSTraffic" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic addNewEMSTraffic();
    
    /**
     * Unsets the "EMSTraffic" element
     */
    void unsetEMSTraffic();
    
    /**
     * Gets the "EMSCapacity" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount getEMSCapacity();
    
    /**
     * True if has "EMSCapacity" element
     */
    boolean isSetEMSCapacity();
    
    /**
     * Sets the "EMSCapacity" element
     */
    void setEMSCapacity(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount emsCapacity);
    
    /**
     * Appends and returns a new empty "EMSCapacity" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount addNewEMSCapacity();
    
    /**
     * Unsets the "EMSCapacity" element
     */
    void unsetEMSCapacity();
    
    /**
     * Gets the "EMSCensus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount getEMSCensus();
    
    /**
     * True if has "EMSCensus" element
     */
    boolean isSetEMSCensus();
    
    /**
     * Sets the "EMSCensus" element
     */
    void setEMSCensus(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount emsCensus);
    
    /**
     * Appends and returns a new empty "EMSCensus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount addNewEMSCensus();
    
    /**
     * Unsets the "EMSCensus" element
     */
    void unsetEMSCensus();
    
    /**
     * Gets the "EMSAmbulanceStatus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.Offload getEMSAmbulanceStatus();
    
    /**
     * True if has "EMSAmbulanceStatus" element
     */
    boolean isSetEMSAmbulanceStatus();
    
    /**
     * Sets the "EMSAmbulanceStatus" element
     */
    void setEMSAmbulanceStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Offload emsAmbulanceStatus);
    
    /**
     * Appends and returns a new empty "EMSAmbulanceStatus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.Offload addNewEMSAmbulanceStatus();
    
    /**
     * Unsets the "EMSAmbulanceStatus" element
     */
    void unsetEMSAmbulanceStatus();
    
    /**
     * Gets the "EMSAirTransportStatus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.Offload getEMSAirTransportStatus();
    
    /**
     * True if has "EMSAirTransportStatus" element
     */
    boolean isSetEMSAirTransportStatus();
    
    /**
     * Sets the "EMSAirTransportStatus" element
     */
    void setEMSAirTransportStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Offload emsAirTransportStatus);
    
    /**
     * Appends and returns a new empty "EMSAirTransportStatus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.Offload addNewEMSAirTransportStatus();
    
    /**
     * Unsets the "EMSAirTransportStatus" element
     */
    void unsetEMSAirTransportStatus();
    
    /**
     * Gets array of all "CommentText" elements
     */
    java.lang.String[] getCommentTextArray();
    
    /**
     * Gets ith "CommentText" element
     */
    java.lang.String getCommentTextArray(int i);
    
    /**
     * Gets (as xml) array of all "CommentText" elements
     */
    org.apache.xmlbeans.XmlString[] xgetCommentTextArray();
    
    /**
     * Gets (as xml) ith "CommentText" element
     */
    org.apache.xmlbeans.XmlString xgetCommentTextArray(int i);
    
    /**
     * Returns number of "CommentText" element
     */
    int sizeOfCommentTextArray();
    
    /**
     * Sets array of all "CommentText" element
     */
    void setCommentTextArray(java.lang.String[] commentTextArray);
    
    /**
     * Sets ith "CommentText" element
     */
    void setCommentTextArray(int i, java.lang.String commentText);
    
    /**
     * Sets (as xml) array of all "CommentText" element
     */
    void xsetCommentTextArray(org.apache.xmlbeans.XmlString[] commentTextArray);
    
    /**
     * Sets (as xml) ith "CommentText" element
     */
    void xsetCommentTextArray(int i, org.apache.xmlbeans.XmlString commentText);
    
    /**
     * Inserts the value as the ith "CommentText" element
     */
    void insertCommentText(int i, java.lang.String commentText);
    
    /**
     * Appends the value as the last "CommentText" element
     */
    void addCommentText(java.lang.String commentText);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CommentText" element
     */
    org.apache.xmlbeans.XmlString insertNewCommentText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CommentText" element
     */
    org.apache.xmlbeans.XmlString addNewCommentText();
    
    /**
     * Removes the ith "CommentText" element
     */
    void removeCommentText(int i);
    
    /**
     * An XML EMSTraffic(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public interface EMSTraffic extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EMSTraffic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("emstraffic4404elemtype");
        
        /**
         * Gets the "EMSTrafficStatus" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus.Enum getEMSTrafficStatus();
        
        /**
         * Gets (as xml) the "EMSTrafficStatus" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus xgetEMSTrafficStatus();
        
        /**
         * True if has "EMSTrafficStatus" element
         */
        boolean isSetEMSTrafficStatus();
        
        /**
         * Sets the "EMSTrafficStatus" element
         */
        void setEMSTrafficStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus.Enum emsTrafficStatus);
        
        /**
         * Sets (as xml) the "EMSTrafficStatus" element
         */
        void xsetEMSTrafficStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus emsTrafficStatus);
        
        /**
         * Unsets the "EMSTrafficStatus" element
         */
        void unsetEMSTrafficStatus();
        
        /**
         * Gets the "EMSTrafficReason" element
         */
        java.lang.String getEMSTrafficReason();
        
        /**
         * Gets (as xml) the "EMSTrafficReason" element
         */
        org.apache.xmlbeans.XmlString xgetEMSTrafficReason();
        
        /**
         * True if has "EMSTrafficReason" element
         */
        boolean isSetEMSTrafficReason();
        
        /**
         * Sets the "EMSTrafficReason" element
         */
        void setEMSTrafficReason(java.lang.String emsTrafficReason);
        
        /**
         * Sets (as xml) the "EMSTrafficReason" element
         */
        void xsetEMSTrafficReason(org.apache.xmlbeans.XmlString emsTrafficReason);
        
        /**
         * Unsets the "EMSTrafficReason" element
         */
        void unsetEMSTrafficReason();
        
        /**
         * Gets the "CommentText" element
         */
        java.lang.String getCommentText();
        
        /**
         * Gets (as xml) the "CommentText" element
         */
        org.apache.xmlbeans.XmlString xgetCommentText();
        
        /**
         * True if has "CommentText" element
         */
        boolean isSetCommentText();
        
        /**
         * Sets the "CommentText" element
         */
        void setCommentText(java.lang.String commentText);
        
        /**
         * Sets (as xml) the "CommentText" element
         */
        void xsetCommentText(org.apache.xmlbeans.XmlString commentText);
        
        /**
         * Unsets the "CommentText" element
         */
        void unsetCommentText();
        
        /**
         * An XML EMSTrafficStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus$EMSTraffic$EMSTrafficStatus.
         */
        public interface EMSTrafficStatus extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EMSTrafficStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("emstrafficstatus1a04elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum NORMAL = Enum.forString("Normal");
            static final Enum ADVISORY = Enum.forString("Advisory");
            static final Enum CLOSED = Enum.forString("Closed");
            static final Enum NOT_APPLICABLE = Enum.forString("NotApplicable");
            
            static final int INT_NORMAL = Enum.INT_NORMAL;
            static final int INT_ADVISORY = Enum.INT_ADVISORY;
            static final int INT_CLOSED = Enum.INT_CLOSED;
            static final int INT_NOT_APPLICABLE = Enum.INT_NOT_APPLICABLE;
            
            /**
             * Enumeration value class for x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus$EMSTraffic$EMSTrafficStatus.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_NORMAL
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
                
                static final int INT_NORMAL = 1;
                static final int INT_ADVISORY = 2;
                static final int INT_CLOSED = 3;
                static final int INT_NOT_APPLICABLE = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Normal", INT_NORMAL),
                      new Enum("Advisory", INT_ADVISORY),
                      new Enum("Closed", INT_CLOSED),
                      new Enum("NotApplicable", INT_NOT_APPLICABLE),
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
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus newValue(java.lang.Object obj) {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus) type.newValue( obj ); }
                
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus newInstance() {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
