/*
 * XML Type:  IdentifierElementTypeList
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.IdentifierElementTypeList
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3;


/**
 * An XML IdentifierElementTypeList(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.IdentifierElementTypeList.
 */
public interface IdentifierElementTypeList extends org.apache.xmlbeans.XmlNormalizedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifierElementTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("identifierelementtypelist3d0atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NAME = Enum.forString("Name");
    static final Enum RANGE_FROM = Enum.forString("RangeFrom");
    static final Enum RANGE = Enum.forString("Range");
    static final Enum RANGE_TO = Enum.forString("RangeTo");
    static final Enum PREFIX = Enum.forString("Prefix");
    static final Enum SUFFIX = Enum.forString("Suffix");
    static final Enum NUMBER = Enum.forString("Number");
    static final Enum SEPARATOR = Enum.forString("Separator");
    static final Enum EXTENSION = Enum.forString("Extension");
    
    static final int INT_NAME = Enum.INT_NAME;
    static final int INT_RANGE_FROM = Enum.INT_RANGE_FROM;
    static final int INT_RANGE = Enum.INT_RANGE;
    static final int INT_RANGE_TO = Enum.INT_RANGE_TO;
    static final int INT_PREFIX = Enum.INT_PREFIX;
    static final int INT_SUFFIX = Enum.INT_SUFFIX;
    static final int INT_NUMBER = Enum.INT_NUMBER;
    static final int INT_SEPARATOR = Enum.INT_SEPARATOR;
    static final int INT_EXTENSION = Enum.INT_EXTENSION;
    
    /**
     * Enumeration value class for oasisNamesTcCiqXal3.IdentifierElementTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NAME
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
        
        static final int INT_NAME = 1;
        static final int INT_RANGE_FROM = 2;
        static final int INT_RANGE = 3;
        static final int INT_RANGE_TO = 4;
        static final int INT_PREFIX = 5;
        static final int INT_SUFFIX = 6;
        static final int INT_NUMBER = 7;
        static final int INT_SEPARATOR = 8;
        static final int INT_EXTENSION = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Name", INT_NAME),
                new Enum("RangeFrom", INT_RANGE_FROM),
                new Enum("Range", INT_RANGE),
                new Enum("RangeTo", INT_RANGE_TO),
                new Enum("Prefix", INT_PREFIX),
                new Enum("Suffix", INT_SUFFIX),
                new Enum("Number", INT_NUMBER),
                new Enum("Separator", INT_SEPARATOR),
                new Enum("Extension", INT_EXTENSION),
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
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList newValue(java.lang.Object obj) {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) type.newValue( obj ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList newInstance() {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.IdentifierElementTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.IdentifierElementTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
