/*
 * XML Type:  SubAdministrativeAreaTypeList
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3;


/**
 * An XML SubAdministrativeAreaTypeList(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList.
 */
public interface SubAdministrativeAreaTypeList extends org.apache.xmlbeans.XmlNormalizedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubAdministrativeAreaTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("subadministrativeareatypelist4a62type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum COUNTY = Enum.forString("County");
    static final Enum DISTRICT = Enum.forString("District");
    static final Enum PROVINCE = Enum.forString("Province");
    static final Enum REGION = Enum.forString("Region");
    
    static final int INT_COUNTY = Enum.INT_COUNTY;
    static final int INT_DISTRICT = Enum.INT_DISTRICT;
    static final int INT_PROVINCE = Enum.INT_PROVINCE;
    static final int INT_REGION = Enum.INT_REGION;
    
    /**
     * Enumeration value class for oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_COUNTY
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
        
        static final int INT_COUNTY = 1;
        static final int INT_DISTRICT = 2;
        static final int INT_PROVINCE = 3;
        static final int INT_REGION = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("County", INT_COUNTY),
                new Enum("District", INT_DISTRICT),
                new Enum("Province", INT_PROVINCE),
                new Enum("Region", INT_REGION),
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
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList newValue(java.lang.Object obj) {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) type.newValue( obj ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList newInstance() {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.SubAdministrativeAreaTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
