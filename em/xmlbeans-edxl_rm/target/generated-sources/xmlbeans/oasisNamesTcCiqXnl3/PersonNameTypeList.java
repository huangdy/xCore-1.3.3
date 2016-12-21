/*
 * XML Type:  PersonNameTypeList
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.PersonNameTypeList
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3;


/**
 * An XML PersonNameTypeList(@urn:oasis:names:tc:ciq:xnl:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXnl3.PersonNameTypeList.
 */
public interface PersonNameTypeList extends org.apache.xmlbeans.XmlNormalizedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonNameTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("personnametypelisted1etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ALIAS = Enum.forString("Alias");
    static final Enum LEGAL_NAME = Enum.forString("LegalName");
    static final Enum KNOWN_AS = Enum.forString("KnownAs");
    static final Enum MAIDEN_NAME = Enum.forString("MaidenName");
    static final Enum FORMER_NAME = Enum.forString("FormerName");
    static final Enum COMMON_USE = Enum.forString("CommonUse");
    static final Enum NAME_AT_BIRTH = Enum.forString("NameAtBirth");
    static final Enum PREFERRED_NAME = Enum.forString("PreferredName");
    static final Enum OFFICIAL_NAME = Enum.forString("OfficialName");
    static final Enum UNOFFICIAL_NAME = Enum.forString("UnofficialName");
    static final Enum NICK_NAME = Enum.forString("NickName");
    static final Enum PET_NAME = Enum.forString("PetName");
    
    static final int INT_ALIAS = Enum.INT_ALIAS;
    static final int INT_LEGAL_NAME = Enum.INT_LEGAL_NAME;
    static final int INT_KNOWN_AS = Enum.INT_KNOWN_AS;
    static final int INT_MAIDEN_NAME = Enum.INT_MAIDEN_NAME;
    static final int INT_FORMER_NAME = Enum.INT_FORMER_NAME;
    static final int INT_COMMON_USE = Enum.INT_COMMON_USE;
    static final int INT_NAME_AT_BIRTH = Enum.INT_NAME_AT_BIRTH;
    static final int INT_PREFERRED_NAME = Enum.INT_PREFERRED_NAME;
    static final int INT_OFFICIAL_NAME = Enum.INT_OFFICIAL_NAME;
    static final int INT_UNOFFICIAL_NAME = Enum.INT_UNOFFICIAL_NAME;
    static final int INT_NICK_NAME = Enum.INT_NICK_NAME;
    static final int INT_PET_NAME = Enum.INT_PET_NAME;
    
    /**
     * Enumeration value class for oasisNamesTcCiqXnl3.PersonNameTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ALIAS
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
        
        static final int INT_ALIAS = 1;
        static final int INT_LEGAL_NAME = 2;
        static final int INT_KNOWN_AS = 3;
        static final int INT_MAIDEN_NAME = 4;
        static final int INT_FORMER_NAME = 5;
        static final int INT_COMMON_USE = 6;
        static final int INT_NAME_AT_BIRTH = 7;
        static final int INT_PREFERRED_NAME = 8;
        static final int INT_OFFICIAL_NAME = 9;
        static final int INT_UNOFFICIAL_NAME = 10;
        static final int INT_NICK_NAME = 11;
        static final int INT_PET_NAME = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Alias", INT_ALIAS),
                new Enum("LegalName", INT_LEGAL_NAME),
                new Enum("KnownAs", INT_KNOWN_AS),
                new Enum("MaidenName", INT_MAIDEN_NAME),
                new Enum("FormerName", INT_FORMER_NAME),
                new Enum("CommonUse", INT_COMMON_USE),
                new Enum("NameAtBirth", INT_NAME_AT_BIRTH),
                new Enum("PreferredName", INT_PREFERRED_NAME),
                new Enum("OfficialName", INT_OFFICIAL_NAME),
                new Enum("UnofficialName", INT_UNOFFICIAL_NAME),
                new Enum("NickName", INT_NICK_NAME),
                new Enum("PetName", INT_PET_NAME),
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
        public static oasisNamesTcCiqXnl3.PersonNameTypeList newValue(java.lang.Object obj) {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) type.newValue( obj ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList newInstance() {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.PersonNameTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.PersonNameTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
