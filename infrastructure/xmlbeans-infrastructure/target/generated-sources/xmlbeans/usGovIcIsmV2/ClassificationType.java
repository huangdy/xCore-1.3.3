/*
 * XML Type:  ClassificationType
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.ClassificationType
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2;


/**
 * An XML ClassificationType(@urn:us:gov:ic:ism:v2).
 *
 * This is an atomic type that is a restriction of usGovIcIsmV2.ClassificationType.
 */
public interface ClassificationType extends org.apache.xmlbeans.XmlNMTOKEN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClassificationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("classificationtype97abtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum U = Enum.forString("U");
    static final Enum C = Enum.forString("C");
    static final Enum S = Enum.forString("S");
    static final Enum TS = Enum.forString("TS");
    static final Enum R = Enum.forString("R");
    static final Enum CTS = Enum.forString("CTS");
    static final Enum CTS_B = Enum.forString("CTS-B");
    static final Enum CTS_BALK = Enum.forString("CTS-BALK");
    static final Enum NU = Enum.forString("NU");
    static final Enum NR = Enum.forString("NR");
    static final Enum NC = Enum.forString("NC");
    static final Enum NS = Enum.forString("NS");
    static final Enum NS_S = Enum.forString("NS-S");
    static final Enum NS_A = Enum.forString("NS-A");
    static final Enum CTSA = Enum.forString("CTSA");
    static final Enum NSAT = Enum.forString("NSAT");
    static final Enum NCA = Enum.forString("NCA");
    
    static final int INT_U = Enum.INT_U;
    static final int INT_C = Enum.INT_C;
    static final int INT_S = Enum.INT_S;
    static final int INT_TS = Enum.INT_TS;
    static final int INT_R = Enum.INT_R;
    static final int INT_CTS = Enum.INT_CTS;
    static final int INT_CTS_B = Enum.INT_CTS_B;
    static final int INT_CTS_BALK = Enum.INT_CTS_BALK;
    static final int INT_NU = Enum.INT_NU;
    static final int INT_NR = Enum.INT_NR;
    static final int INT_NC = Enum.INT_NC;
    static final int INT_NS = Enum.INT_NS;
    static final int INT_NS_S = Enum.INT_NS_S;
    static final int INT_NS_A = Enum.INT_NS_A;
    static final int INT_CTSA = Enum.INT_CTSA;
    static final int INT_NSAT = Enum.INT_NSAT;
    static final int INT_NCA = Enum.INT_NCA;
    
    /**
     * Enumeration value class for usGovIcIsmV2.ClassificationType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_U
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
        
        static final int INT_U = 1;
        static final int INT_C = 2;
        static final int INT_S = 3;
        static final int INT_TS = 4;
        static final int INT_R = 5;
        static final int INT_CTS = 6;
        static final int INT_CTS_B = 7;
        static final int INT_CTS_BALK = 8;
        static final int INT_NU = 9;
        static final int INT_NR = 10;
        static final int INT_NC = 11;
        static final int INT_NS = 12;
        static final int INT_NS_S = 13;
        static final int INT_NS_A = 14;
        static final int INT_CTSA = 15;
        static final int INT_NSAT = 16;
        static final int INT_NCA = 17;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("U", INT_U),
                new Enum("C", INT_C),
                new Enum("S", INT_S),
                new Enum("TS", INT_TS),
                new Enum("R", INT_R),
                new Enum("CTS", INT_CTS),
                new Enum("CTS-B", INT_CTS_B),
                new Enum("CTS-BALK", INT_CTS_BALK),
                new Enum("NU", INT_NU),
                new Enum("NR", INT_NR),
                new Enum("NC", INT_NC),
                new Enum("NS", INT_NS),
                new Enum("NS-S", INT_NS_S),
                new Enum("NS-A", INT_NS_A),
                new Enum("CTSA", INT_CTSA),
                new Enum("NSAT", INT_NSAT),
                new Enum("NCA", INT_NCA),
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
        public static usGovIcIsmV2.ClassificationType newValue(java.lang.Object obj) {
          return (usGovIcIsmV2.ClassificationType) type.newValue( obj ); }
        
        public static usGovIcIsmV2.ClassificationType newInstance() {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static usGovIcIsmV2.ClassificationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static usGovIcIsmV2.ClassificationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static usGovIcIsmV2.ClassificationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static usGovIcIsmV2.ClassificationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static usGovIcIsmV2.ClassificationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static usGovIcIsmV2.ClassificationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static usGovIcIsmV2.ClassificationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static usGovIcIsmV2.ClassificationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static usGovIcIsmV2.ClassificationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static usGovIcIsmV2.ClassificationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static usGovIcIsmV2.ClassificationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static usGovIcIsmV2.ClassificationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static usGovIcIsmV2.ClassificationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static usGovIcIsmV2.ClassificationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static usGovIcIsmV2.ClassificationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static usGovIcIsmV2.ClassificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static usGovIcIsmV2.ClassificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (usGovIcIsmV2.ClassificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
