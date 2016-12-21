/*
 * XML Type:  LengthCodeSimpleType
 * Namespace: http://niem.gov/niem/unece_rec20-misc/2.0
 * Java type: gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.uneceRec20Misc.x20;


/**
 * An XML LengthCodeSimpleType(@http://niem.gov/niem/unece_rec20-misc/2.0).
 *
 * This is an atomic type that is a restriction of gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.
 */
public interface LengthCodeSimpleType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LengthCodeSimpleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("lengthcodesimpletype855btype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum KMT = Enum.forString("KMT");
    static final Enum FOT = Enum.forString("FOT");
    static final Enum YRD = Enum.forString("YRD");
    static final Enum SMI = Enum.forString("SMI");
    static final Enum MTR = Enum.forString("MTR");
    static final Enum NMI = Enum.forString("NMI");
    
    static final int INT_KMT = Enum.INT_KMT;
    static final int INT_FOT = Enum.INT_FOT;
    static final int INT_YRD = Enum.INT_YRD;
    static final int INT_SMI = Enum.INT_SMI;
    static final int INT_MTR = Enum.INT_MTR;
    static final int INT_NMI = Enum.INT_NMI;
    
    /**
     * Enumeration value class for gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_KMT
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
        
        static final int INT_KMT = 1;
        static final int INT_FOT = 2;
        static final int INT_YRD = 3;
        static final int INT_SMI = 4;
        static final int INT_MTR = 5;
        static final int INT_NMI = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("KMT", INT_KMT),
                new Enum("FOT", INT_FOT),
                new Enum("YRD", INT_YRD),
                new Enum("SMI", INT_SMI),
                new Enum("MTR", INT_MTR),
                new Enum("NMI", INT_NMI),
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
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType newValue(java.lang.Object obj) {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) type.newValue( obj ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType newInstance() {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.uneceRec20Misc.x20.LengthCodeSimpleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
