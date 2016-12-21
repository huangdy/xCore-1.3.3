/*
 * XML Type:  TriageCount
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * An XML TriageCount(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public interface TriageCount extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriageCount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("triagecountb8cctype");
    
    /**
     * Gets the "TriageCodeListURN" element
     */
    java.lang.String getTriageCodeListURN();
    
    /**
     * Gets (as xml) the "TriageCodeListURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetTriageCodeListURN();
    
    /**
     * True if has "TriageCodeListURN" element
     */
    boolean isSetTriageCodeListURN();
    
    /**
     * Sets the "TriageCodeListURN" element
     */
    void setTriageCodeListURN(java.lang.String triageCodeListURN);
    
    /**
     * Sets (as xml) the "TriageCodeListURN" element
     */
    void xsetTriageCodeListURN(org.apache.xmlbeans.XmlAnyURI triageCodeListURN);
    
    /**
     * Unsets the "TriageCodeListURN" element
     */
    void unsetTriageCodeListURN();
    
    /**
     * Gets array of all "TriageCode" elements
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode[] getTriageCodeArray();
    
    /**
     * Gets ith "TriageCode" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode getTriageCodeArray(int i);
    
    /**
     * Returns number of "TriageCode" element
     */
    int sizeOfTriageCodeArray();
    
    /**
     * Sets array of all "TriageCode" element
     */
    void setTriageCodeArray(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode[] triageCodeArray);
    
    /**
     * Sets ith "TriageCode" element
     */
    void setTriageCodeArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode triageCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TriageCode" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode insertNewTriageCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TriageCode" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode addNewTriageCode();
    
    /**
     * Removes the ith "TriageCode" element
     */
    void removeTriageCode(int i);
    
    /**
     * An XML TriageCode(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public interface TriageCode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriageCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("triagecode592felemtype");
        
        /**
         * Gets array of all "TriageCodeValue" elements
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum[] getTriageCodeValueArray();
        
        /**
         * Gets ith "TriageCodeValue" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum getTriageCodeValueArray(int i);
        
        /**
         * Gets (as xml) array of all "TriageCodeValue" elements
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue[] xgetTriageCodeValueArray();
        
        /**
         * Gets (as xml) ith "TriageCodeValue" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue xgetTriageCodeValueArray(int i);
        
        /**
         * Returns number of "TriageCodeValue" element
         */
        int sizeOfTriageCodeValueArray();
        
        /**
         * Sets array of all "TriageCodeValue" element
         */
        void setTriageCodeValueArray(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum[] triageCodeValueArray);
        
        /**
         * Sets ith "TriageCodeValue" element
         */
        void setTriageCodeValueArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum triageCodeValue);
        
        /**
         * Sets (as xml) array of all "TriageCodeValue" element
         */
        void xsetTriageCodeValueArray(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue[] triageCodeValueArray);
        
        /**
         * Sets (as xml) ith "TriageCodeValue" element
         */
        void xsetTriageCodeValueArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue triageCodeValue);
        
        /**
         * Inserts the value as the ith "TriageCodeValue" element
         */
        void insertTriageCodeValue(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum triageCodeValue);
        
        /**
         * Appends the value as the last "TriageCodeValue" element
         */
        void addTriageCodeValue(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum triageCodeValue);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TriageCodeValue" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue insertNewTriageCodeValue(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TriageCodeValue" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue addNewTriageCodeValue();
        
        /**
         * Removes the ith "TriageCodeValue" element
         */
        void removeTriageCodeValue(int i);
        
        /**
         * Gets array of all "TriageCountQuantity" elements
         */
        java.math.BigInteger[] getTriageCountQuantityArray();
        
        /**
         * Gets ith "TriageCountQuantity" element
         */
        java.math.BigInteger getTriageCountQuantityArray(int i);
        
        /**
         * Gets (as xml) array of all "TriageCountQuantity" elements
         */
        org.apache.xmlbeans.XmlInteger[] xgetTriageCountQuantityArray();
        
        /**
         * Gets (as xml) ith "TriageCountQuantity" element
         */
        org.apache.xmlbeans.XmlInteger xgetTriageCountQuantityArray(int i);
        
        /**
         * Returns number of "TriageCountQuantity" element
         */
        int sizeOfTriageCountQuantityArray();
        
        /**
         * Sets array of all "TriageCountQuantity" element
         */
        void setTriageCountQuantityArray(java.math.BigInteger[] triageCountQuantityArray);
        
        /**
         * Sets ith "TriageCountQuantity" element
         */
        void setTriageCountQuantityArray(int i, java.math.BigInteger triageCountQuantity);
        
        /**
         * Sets (as xml) array of all "TriageCountQuantity" element
         */
        void xsetTriageCountQuantityArray(org.apache.xmlbeans.XmlInteger[] triageCountQuantityArray);
        
        /**
         * Sets (as xml) ith "TriageCountQuantity" element
         */
        void xsetTriageCountQuantityArray(int i, org.apache.xmlbeans.XmlInteger triageCountQuantity);
        
        /**
         * Inserts the value as the ith "TriageCountQuantity" element
         */
        void insertTriageCountQuantity(int i, java.math.BigInteger triageCountQuantity);
        
        /**
         * Appends the value as the last "TriageCountQuantity" element
         */
        void addTriageCountQuantity(java.math.BigInteger triageCountQuantity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TriageCountQuantity" element
         */
        org.apache.xmlbeans.XmlInteger insertNewTriageCountQuantity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TriageCountQuantity" element
         */
        org.apache.xmlbeans.XmlInteger addNewTriageCountQuantity();
        
        /**
         * Removes the ith "TriageCountQuantity" element
         */
        void removeTriageCountQuantity(int i);
        
        /**
         * An XML TriageCodeValue(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount$TriageCode$TriageCodeValue.
         */
        public interface TriageCodeValue extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriageCodeValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("triagecodevalue76ebelemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum RED = Enum.forString("Red");
            static final Enum YELLOW = Enum.forString("Yellow");
            static final Enum GREEN = Enum.forString("Green");
            static final Enum BLACK = Enum.forString("Black");
            
            static final int INT_RED = Enum.INT_RED;
            static final int INT_YELLOW = Enum.INT_YELLOW;
            static final int INT_GREEN = Enum.INT_GREEN;
            static final int INT_BLACK = Enum.INT_BLACK;
            
            /**
             * Enumeration value class for x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount$TriageCode$TriageCodeValue.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_RED
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
                
                static final int INT_RED = 1;
                static final int INT_YELLOW = 2;
                static final int INT_GREEN = 3;
                static final int INT_BLACK = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Red", INT_RED),
                      new Enum("Yellow", INT_YELLOW),
                      new Enum("Green", INT_GREEN),
                      new Enum("Black", INT_BLACK),
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
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue newValue(java.lang.Object obj) {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue) type.newValue( obj ); }
                
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue newInstance() {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
