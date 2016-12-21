/*
 * XML Type:  Capacity
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * An XML Capacity(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public interface Capacity extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Capacity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("capacityb9bbtype");
    
    /**
     * Gets the "CapacityStatus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus.Enum getCapacityStatus();
    
    /**
     * Gets (as xml) the "CapacityStatus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus xgetCapacityStatus();
    
    /**
     * True if has "CapacityStatus" element
     */
    boolean isSetCapacityStatus();
    
    /**
     * Sets the "CapacityStatus" element
     */
    void setCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus.Enum capacityStatus);
    
    /**
     * Sets (as xml) the "CapacityStatus" element
     */
    void xsetCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus capacityStatus);
    
    /**
     * Unsets the "CapacityStatus" element
     */
    void unsetCapacityStatus();
    
    /**
     * Gets the "AvailableCount" element
     */
    java.math.BigInteger getAvailableCount();
    
    /**
     * Gets (as xml) the "AvailableCount" element
     */
    org.apache.xmlbeans.XmlInteger xgetAvailableCount();
    
    /**
     * True if has "AvailableCount" element
     */
    boolean isSetAvailableCount();
    
    /**
     * Sets the "AvailableCount" element
     */
    void setAvailableCount(java.math.BigInteger availableCount);
    
    /**
     * Sets (as xml) the "AvailableCount" element
     */
    void xsetAvailableCount(org.apache.xmlbeans.XmlInteger availableCount);
    
    /**
     * Unsets the "AvailableCount" element
     */
    void unsetAvailableCount();
    
    /**
     * Gets the "BaselineCount" element
     */
    java.math.BigInteger getBaselineCount();
    
    /**
     * Gets (as xml) the "BaselineCount" element
     */
    org.apache.xmlbeans.XmlInteger xgetBaselineCount();
    
    /**
     * True if has "BaselineCount" element
     */
    boolean isSetBaselineCount();
    
    /**
     * Sets the "BaselineCount" element
     */
    void setBaselineCount(java.math.BigInteger baselineCount);
    
    /**
     * Sets (as xml) the "BaselineCount" element
     */
    void xsetBaselineCount(org.apache.xmlbeans.XmlInteger baselineCount);
    
    /**
     * Unsets the "BaselineCount" element
     */
    void unsetBaselineCount();
    
    /**
     * Gets the "AdditionalCapacityCount24Hr" element
     */
    java.math.BigInteger getAdditionalCapacityCount24Hr();
    
    /**
     * Gets (as xml) the "AdditionalCapacityCount24Hr" element
     */
    org.apache.xmlbeans.XmlInteger xgetAdditionalCapacityCount24Hr();
    
    /**
     * True if has "AdditionalCapacityCount24Hr" element
     */
    boolean isSetAdditionalCapacityCount24Hr();
    
    /**
     * Sets the "AdditionalCapacityCount24Hr" element
     */
    void setAdditionalCapacityCount24Hr(java.math.BigInteger additionalCapacityCount24Hr);
    
    /**
     * Sets (as xml) the "AdditionalCapacityCount24Hr" element
     */
    void xsetAdditionalCapacityCount24Hr(org.apache.xmlbeans.XmlInteger additionalCapacityCount24Hr);
    
    /**
     * Unsets the "AdditionalCapacityCount24Hr" element
     */
    void unsetAdditionalCapacityCount24Hr();
    
    /**
     * Gets the "AdditionalCapacityCount72Hr" element
     */
    java.math.BigInteger getAdditionalCapacityCount72Hr();
    
    /**
     * Gets (as xml) the "AdditionalCapacityCount72Hr" element
     */
    org.apache.xmlbeans.XmlInteger xgetAdditionalCapacityCount72Hr();
    
    /**
     * True if has "AdditionalCapacityCount72Hr" element
     */
    boolean isSetAdditionalCapacityCount72Hr();
    
    /**
     * Sets the "AdditionalCapacityCount72Hr" element
     */
    void setAdditionalCapacityCount72Hr(java.math.BigInteger additionalCapacityCount72Hr);
    
    /**
     * Sets (as xml) the "AdditionalCapacityCount72Hr" element
     */
    void xsetAdditionalCapacityCount72Hr(org.apache.xmlbeans.XmlInteger additionalCapacityCount72Hr);
    
    /**
     * Unsets the "AdditionalCapacityCount72Hr" element
     */
    void unsetAdditionalCapacityCount72Hr();
    
    /**
     * An XML CapacityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity$CapacityStatus.
     */
    public interface CapacityStatus extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CapacityStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("capacitystatus2bc3elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum VACANT_AVAILABLE = Enum.forString("Vacant/Available");
        static final Enum NOT_AVAILABLE = Enum.forString("NotAvailable");
        
        static final int INT_VACANT_AVAILABLE = Enum.INT_VACANT_AVAILABLE;
        static final int INT_NOT_AVAILABLE = Enum.INT_NOT_AVAILABLE;
        
        /**
         * Enumeration value class for x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity$CapacityStatus.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_VACANT_AVAILABLE
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
            
            static final int INT_VACANT_AVAILABLE = 1;
            static final int INT_NOT_AVAILABLE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Vacant/Available", INT_VACANT_AVAILABLE),
                    new Enum("NotAvailable", INT_NOT_AVAILABLE),
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
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus newValue(java.lang.Object obj) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus) type.newValue( obj ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
