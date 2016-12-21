/*
 * XML Type:  ThoroughfareNameTypeList
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.ThoroughfareNameTypeList
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3;


/**
 * An XML ThoroughfareNameTypeList(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.ThoroughfareNameTypeList.
 */
public interface ThoroughfareNameTypeList extends org.apache.xmlbeans.XmlNormalizedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ThoroughfareNameTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("thoroughfarenametypelista5f4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NAME_ONLY = Enum.forString("NameOnly");
    static final Enum PRE_DIRECTION = Enum.forString("PreDirection");
    static final Enum POST_DIRECTION = Enum.forString("PostDirection");
    static final Enum NAME_AND_NUMBER = Enum.forString("NameAndNumber");
    static final Enum NAME_AND_TYPE = Enum.forString("NameAndType");
    static final Enum NAME_NUMBER_AND_TYPE = Enum.forString("NameNumberAndType");
    static final Enum UNSTRUCTURED = Enum.forString("Unstructured");
    static final Enum SUB_THOROUGHFARE_CONNECTOR = Enum.forString("SubThoroughfareConnector");
    static final Enum REFERENCE_LOCATION = Enum.forString("ReferenceLocation");
    static final Enum TYPE = Enum.forString("Type");
    
    static final int INT_NAME_ONLY = Enum.INT_NAME_ONLY;
    static final int INT_PRE_DIRECTION = Enum.INT_PRE_DIRECTION;
    static final int INT_POST_DIRECTION = Enum.INT_POST_DIRECTION;
    static final int INT_NAME_AND_NUMBER = Enum.INT_NAME_AND_NUMBER;
    static final int INT_NAME_AND_TYPE = Enum.INT_NAME_AND_TYPE;
    static final int INT_NAME_NUMBER_AND_TYPE = Enum.INT_NAME_NUMBER_AND_TYPE;
    static final int INT_UNSTRUCTURED = Enum.INT_UNSTRUCTURED;
    static final int INT_SUB_THOROUGHFARE_CONNECTOR = Enum.INT_SUB_THOROUGHFARE_CONNECTOR;
    static final int INT_REFERENCE_LOCATION = Enum.INT_REFERENCE_LOCATION;
    static final int INT_TYPE = Enum.INT_TYPE;
    
    /**
     * Enumeration value class for oasisNamesTcCiqXal3.ThoroughfareNameTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NAME_ONLY
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
        
        static final int INT_NAME_ONLY = 1;
        static final int INT_PRE_DIRECTION = 2;
        static final int INT_POST_DIRECTION = 3;
        static final int INT_NAME_AND_NUMBER = 4;
        static final int INT_NAME_AND_TYPE = 5;
        static final int INT_NAME_NUMBER_AND_TYPE = 6;
        static final int INT_UNSTRUCTURED = 7;
        static final int INT_SUB_THOROUGHFARE_CONNECTOR = 8;
        static final int INT_REFERENCE_LOCATION = 9;
        static final int INT_TYPE = 10;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("NameOnly", INT_NAME_ONLY),
                new Enum("PreDirection", INT_PRE_DIRECTION),
                new Enum("PostDirection", INT_POST_DIRECTION),
                new Enum("NameAndNumber", INT_NAME_AND_NUMBER),
                new Enum("NameAndType", INT_NAME_AND_TYPE),
                new Enum("NameNumberAndType", INT_NAME_NUMBER_AND_TYPE),
                new Enum("Unstructured", INT_UNSTRUCTURED),
                new Enum("SubThoroughfareConnector", INT_SUB_THOROUGHFARE_CONNECTOR),
                new Enum("ReferenceLocation", INT_REFERENCE_LOCATION),
                new Enum("Type", INT_TYPE),
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
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList newValue(java.lang.Object obj) {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) type.newValue( obj ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList newInstance() {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.ThoroughfareNameTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
