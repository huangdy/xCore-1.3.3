/*
 * XML Type:  HospitalResourcesStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * An XML HospitalResourcesStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public interface HospitalResourcesStatus extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HospitalResourcesStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("hospitalresourcesstatuse72atype");
    
    /**
     * Gets the "Staffing" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing.Enum getStaffing();
    
    /**
     * Gets (as xml) the "Staffing" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing xgetStaffing();
    
    /**
     * True if has "Staffing" element
     */
    boolean isSetStaffing();
    
    /**
     * Sets the "Staffing" element
     */
    void setStaffing(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing.Enum staffing);
    
    /**
     * Sets (as xml) the "Staffing" element
     */
    void xsetStaffing(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing staffing);
    
    /**
     * Unsets the "Staffing" element
     */
    void unsetStaffing();
    
    /**
     * Gets the "FacilityOperations" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations.Enum getFacilityOperations();
    
    /**
     * Gets (as xml) the "FacilityOperations" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations xgetFacilityOperations();
    
    /**
     * True if has "FacilityOperations" element
     */
    boolean isSetFacilityOperations();
    
    /**
     * Sets the "FacilityOperations" element
     */
    void setFacilityOperations(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations.Enum facilityOperations);
    
    /**
     * Sets (as xml) the "FacilityOperations" element
     */
    void xsetFacilityOperations(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations facilityOperations);
    
    /**
     * Unsets the "FacilityOperations" element
     */
    void unsetFacilityOperations();
    
    /**
     * Gets the "ClinicalOperations" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations.Enum getClinicalOperations();
    
    /**
     * Gets (as xml) the "ClinicalOperations" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations xgetClinicalOperations();
    
    /**
     * True if has "ClinicalOperations" element
     */
    boolean isSetClinicalOperations();
    
    /**
     * Sets the "ClinicalOperations" element
     */
    void setClinicalOperations(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations.Enum clinicalOperations);
    
    /**
     * Sets (as xml) the "ClinicalOperations" element
     */
    void xsetClinicalOperations(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations clinicalOperations);
    
    /**
     * Unsets the "ClinicalOperations" element
     */
    void unsetClinicalOperations();
    
    /**
     * Gets array of all "ResourcesInformationText" elements
     */
    org.apache.xmlbeans.XmlObject[] getResourcesInformationTextArray();
    
    /**
     * Gets ith "ResourcesInformationText" element
     */
    org.apache.xmlbeans.XmlObject getResourcesInformationTextArray(int i);
    
    /**
     * Returns number of "ResourcesInformationText" element
     */
    int sizeOfResourcesInformationTextArray();
    
    /**
     * Sets array of all "ResourcesInformationText" element
     */
    void setResourcesInformationTextArray(org.apache.xmlbeans.XmlObject[] resourcesInformationTextArray);
    
    /**
     * Sets ith "ResourcesInformationText" element
     */
    void setResourcesInformationTextArray(int i, org.apache.xmlbeans.XmlObject resourcesInformationText);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourcesInformationText" element
     */
    org.apache.xmlbeans.XmlObject insertNewResourcesInformationText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourcesInformationText" element
     */
    org.apache.xmlbeans.XmlObject addNewResourcesInformationText();
    
    /**
     * Removes the ith "ResourcesInformationText" element
     */
    void removeResourcesInformationText(int i);
    
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
     * An XML Staffing(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$Staffing.
     */
    public interface Staffing extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Staffing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("staffing002celemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ADEQUATE = Enum.forString("Adequate");
        static final Enum INSUFFICIENT = Enum.forString("Insufficient");
        
        static final int INT_ADEQUATE = Enum.INT_ADEQUATE;
        static final int INT_INSUFFICIENT = Enum.INT_INSUFFICIENT;
        
        /**
         * Enumeration value class for x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$Staffing.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ADEQUATE
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
            
            static final int INT_ADEQUATE = 1;
            static final int INT_INSUFFICIENT = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Adequate", INT_ADEQUATE),
                    new Enum("Insufficient", INT_INSUFFICIENT),
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
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing newValue(java.lang.Object obj) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing) type.newValue( obj ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML FacilityOperations(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$FacilityOperations.
     */
    public interface FacilityOperations extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FacilityOperations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("facilityoperationsd05felemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ADEQUATE = Enum.forString("Adequate");
        static final Enum INSUFFICIENT = Enum.forString("Insufficient");
        
        static final int INT_ADEQUATE = Enum.INT_ADEQUATE;
        static final int INT_INSUFFICIENT = Enum.INT_INSUFFICIENT;
        
        /**
         * Enumeration value class for x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$FacilityOperations.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ADEQUATE
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
            
            static final int INT_ADEQUATE = 1;
            static final int INT_INSUFFICIENT = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Adequate", INT_ADEQUATE),
                    new Enum("Insufficient", INT_INSUFFICIENT),
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
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations newValue(java.lang.Object obj) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations) type.newValue( obj ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ClinicalOperations(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$ClinicalOperations.
     */
    public interface ClinicalOperations extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClinicalOperations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("clinicaloperations49efelemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ADEQUATE = Enum.forString("Adequate");
        static final Enum INSUFFICIENT = Enum.forString("Insufficient");
        
        static final int INT_ADEQUATE = Enum.INT_ADEQUATE;
        static final int INT_INSUFFICIENT = Enum.INT_INSUFFICIENT;
        
        /**
         * Enumeration value class for x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$ClinicalOperations.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ADEQUATE
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
            
            static final int INT_ADEQUATE = 1;
            static final int INT_INSUFFICIENT = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Adequate", INT_ADEQUATE),
                    new Enum("Insufficient", INT_INSUFFICIENT),
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
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations newValue(java.lang.Object obj) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations) type.newValue( obj ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
