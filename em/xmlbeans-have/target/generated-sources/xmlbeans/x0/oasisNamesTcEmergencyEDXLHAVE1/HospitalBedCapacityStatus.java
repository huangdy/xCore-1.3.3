/*
 * XML Type:  HospitalBedCapacityStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * An XML HospitalBedCapacityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public interface HospitalBedCapacityStatus extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HospitalBedCapacityStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("hospitalbedcapacitystatus8ef4type");
    
    /**
     * Gets array of all "BedCapacity" elements
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity[] getBedCapacityArray();
    
    /**
     * Gets ith "BedCapacity" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity getBedCapacityArray(int i);
    
    /**
     * Returns number of "BedCapacity" element
     */
    int sizeOfBedCapacityArray();
    
    /**
     * Sets array of all "BedCapacity" element
     */
    void setBedCapacityArray(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity[] bedCapacityArray);
    
    /**
     * Sets ith "BedCapacity" element
     */
    void setBedCapacityArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity bedCapacity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BedCapacity" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity insertNewBedCapacity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BedCapacity" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity addNewBedCapacity();
    
    /**
     * Removes the ith "BedCapacity" element
     */
    void removeBedCapacity(int i);
    
    /**
     * An XML BedCapacity(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public interface BedCapacity extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BedCapacity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("bedcapacity586delemtype");
        
        /**
         * Gets array of all "BedType" elements
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum[] getBedTypeArray();
        
        /**
         * Gets ith "BedType" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum getBedTypeArray(int i);
        
        /**
         * Gets (as xml) array of all "BedType" elements
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType[] xgetBedTypeArray();
        
        /**
         * Gets (as xml) ith "BedType" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType xgetBedTypeArray(int i);
        
        /**
         * Returns number of "BedType" element
         */
        int sizeOfBedTypeArray();
        
        /**
         * Sets array of all "BedType" element
         */
        void setBedTypeArray(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum[] bedTypeArray);
        
        /**
         * Sets ith "BedType" element
         */
        void setBedTypeArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum bedType);
        
        /**
         * Sets (as xml) array of all "BedType" element
         */
        void xsetBedTypeArray(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType[] bedTypeArray);
        
        /**
         * Sets (as xml) ith "BedType" element
         */
        void xsetBedTypeArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType bedType);
        
        /**
         * Inserts the value as the ith "BedType" element
         */
        void insertBedType(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum bedType);
        
        /**
         * Appends the value as the last "BedType" element
         */
        void addBedType(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum bedType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BedType" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType insertNewBedType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BedType" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType addNewBedType();
        
        /**
         * Removes the ith "BedType" element
         */
        void removeBedType(int i);
        
        /**
         * Gets array of all "SubCategoryBedType" elements
         */
        org.apache.xmlbeans.XmlObject[] getSubCategoryBedTypeArray();
        
        /**
         * Gets ith "SubCategoryBedType" element
         */
        org.apache.xmlbeans.XmlObject getSubCategoryBedTypeArray(int i);
        
        /**
         * Returns number of "SubCategoryBedType" element
         */
        int sizeOfSubCategoryBedTypeArray();
        
        /**
         * Sets array of all "SubCategoryBedType" element
         */
        void setSubCategoryBedTypeArray(org.apache.xmlbeans.XmlObject[] subCategoryBedTypeArray);
        
        /**
         * Sets ith "SubCategoryBedType" element
         */
        void setSubCategoryBedTypeArray(int i, org.apache.xmlbeans.XmlObject subCategoryBedType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SubCategoryBedType" element
         */
        org.apache.xmlbeans.XmlObject insertNewSubCategoryBedType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SubCategoryBedType" element
         */
        org.apache.xmlbeans.XmlObject addNewSubCategoryBedType();
        
        /**
         * Removes the ith "SubCategoryBedType" element
         */
        void removeSubCategoryBedType(int i);
        
        /**
         * Gets array of all "Capacity" elements
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity[] getCapacityArray();
        
        /**
         * Gets ith "Capacity" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity getCapacityArray(int i);
        
        /**
         * Returns number of "Capacity" element
         */
        int sizeOfCapacityArray();
        
        /**
         * Sets array of all "Capacity" element
         */
        void setCapacityArray(x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity[] capacityArray);
        
        /**
         * Sets ith "Capacity" element
         */
        void setCapacityArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity capacity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Capacity" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity insertNewCapacity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Capacity" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity addNewCapacity();
        
        /**
         * Removes the ith "Capacity" element
         */
        void removeCapacity(int i);
        
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
         * An XML BedType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus$BedCapacity$BedType.
         */
        public interface BedType extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BedType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("bedtype2326elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ADULT_ICU = Enum.forString("AdultICU");
            static final Enum PEDIATRIC_ICU = Enum.forString("PediatricICU");
            static final Enum NEONATAL_ICU = Enum.forString("NeonatalICU");
            static final Enum EMERGENCY_DEPARTMENT = Enum.forString("EmergencyDepartment");
            static final Enum NURSERY_BEDS = Enum.forString("NurseryBeds");
            static final Enum MEDICAL_SURGICAL = Enum.forString("MedicalSurgical");
            static final Enum REHAB_LONG_TERM_CARE = Enum.forString("RehabLongTermCare");
            static final Enum BURN = Enum.forString("Burn");
            static final Enum PEDIATRICS = Enum.forString("Pediatrics");
            static final Enum ADULT_PSYCHIATRIC = Enum.forString("AdultPsychiatric");
            static final Enum PEDIATRIC_PSYCHIATRIC = Enum.forString("PediatricPsychiatric");
            static final Enum NEGATIVE_FLOW_ISOLATION = Enum.forString("NegativeFlowIsolation");
            static final Enum OTHER_ISOLATION = Enum.forString("OtherIsolation");
            static final Enum OPERATING_ROOMS = Enum.forString("OperatingRooms");
            
            static final int INT_ADULT_ICU = Enum.INT_ADULT_ICU;
            static final int INT_PEDIATRIC_ICU = Enum.INT_PEDIATRIC_ICU;
            static final int INT_NEONATAL_ICU = Enum.INT_NEONATAL_ICU;
            static final int INT_EMERGENCY_DEPARTMENT = Enum.INT_EMERGENCY_DEPARTMENT;
            static final int INT_NURSERY_BEDS = Enum.INT_NURSERY_BEDS;
            static final int INT_MEDICAL_SURGICAL = Enum.INT_MEDICAL_SURGICAL;
            static final int INT_REHAB_LONG_TERM_CARE = Enum.INT_REHAB_LONG_TERM_CARE;
            static final int INT_BURN = Enum.INT_BURN;
            static final int INT_PEDIATRICS = Enum.INT_PEDIATRICS;
            static final int INT_ADULT_PSYCHIATRIC = Enum.INT_ADULT_PSYCHIATRIC;
            static final int INT_PEDIATRIC_PSYCHIATRIC = Enum.INT_PEDIATRIC_PSYCHIATRIC;
            static final int INT_NEGATIVE_FLOW_ISOLATION = Enum.INT_NEGATIVE_FLOW_ISOLATION;
            static final int INT_OTHER_ISOLATION = Enum.INT_OTHER_ISOLATION;
            static final int INT_OPERATING_ROOMS = Enum.INT_OPERATING_ROOMS;
            
            /**
             * Enumeration value class for x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus$BedCapacity$BedType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ADULT_ICU
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
                
                static final int INT_ADULT_ICU = 1;
                static final int INT_PEDIATRIC_ICU = 2;
                static final int INT_NEONATAL_ICU = 3;
                static final int INT_EMERGENCY_DEPARTMENT = 4;
                static final int INT_NURSERY_BEDS = 5;
                static final int INT_MEDICAL_SURGICAL = 6;
                static final int INT_REHAB_LONG_TERM_CARE = 7;
                static final int INT_BURN = 8;
                static final int INT_PEDIATRICS = 9;
                static final int INT_ADULT_PSYCHIATRIC = 10;
                static final int INT_PEDIATRIC_PSYCHIATRIC = 11;
                static final int INT_NEGATIVE_FLOW_ISOLATION = 12;
                static final int INT_OTHER_ISOLATION = 13;
                static final int INT_OPERATING_ROOMS = 14;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("AdultICU", INT_ADULT_ICU),
                      new Enum("PediatricICU", INT_PEDIATRIC_ICU),
                      new Enum("NeonatalICU", INT_NEONATAL_ICU),
                      new Enum("EmergencyDepartment", INT_EMERGENCY_DEPARTMENT),
                      new Enum("NurseryBeds", INT_NURSERY_BEDS),
                      new Enum("MedicalSurgical", INT_MEDICAL_SURGICAL),
                      new Enum("RehabLongTermCare", INT_REHAB_LONG_TERM_CARE),
                      new Enum("Burn", INT_BURN),
                      new Enum("Pediatrics", INT_PEDIATRICS),
                      new Enum("AdultPsychiatric", INT_ADULT_PSYCHIATRIC),
                      new Enum("PediatricPsychiatric", INT_PEDIATRIC_PSYCHIATRIC),
                      new Enum("NegativeFlowIsolation", INT_NEGATIVE_FLOW_ISOLATION),
                      new Enum("OtherIsolation", INT_OTHER_ISOLATION),
                      new Enum("OperatingRooms", INT_OPERATING_ROOMS),
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
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType newValue(java.lang.Object obj) {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType) type.newValue( obj ); }
                
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType newInstance() {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
