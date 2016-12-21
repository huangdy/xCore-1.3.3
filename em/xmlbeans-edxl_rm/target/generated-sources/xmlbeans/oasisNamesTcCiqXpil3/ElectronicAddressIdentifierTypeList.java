/*
 * XML Type:  ElectronicAddressIdentifierTypeList
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * An XML ElectronicAddressIdentifierTypeList(@urn:oasis:names:tc:ciq:xpil:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList.
 */
public interface ElectronicAddressIdentifierTypeList extends org.apache.xmlbeans.XmlNormalizedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ElectronicAddressIdentifierTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("electronicaddressidentifiertypelist97b4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AIM = Enum.forString("AIM");
    static final Enum EMAIL = Enum.forString("EMAIL");
    static final Enum GOOGLE = Enum.forString("GOOGLE");
    static final Enum GIZMO = Enum.forString("GIZMO");
    static final Enum ICQ = Enum.forString("ICQ");
    static final Enum JABBER = Enum.forString("JABBER");
    static final Enum MSN = Enum.forString("MSN");
    static final Enum SIP = Enum.forString("SIP");
    static final Enum SKYPE = Enum.forString("SKYPE");
    static final Enum URL = Enum.forString("URL");
    static final Enum XRI = Enum.forString("XRI");
    static final Enum YAHOO = Enum.forString("YAHOO");
    
    static final int INT_AIM = Enum.INT_AIM;
    static final int INT_EMAIL = Enum.INT_EMAIL;
    static final int INT_GOOGLE = Enum.INT_GOOGLE;
    static final int INT_GIZMO = Enum.INT_GIZMO;
    static final int INT_ICQ = Enum.INT_ICQ;
    static final int INT_JABBER = Enum.INT_JABBER;
    static final int INT_MSN = Enum.INT_MSN;
    static final int INT_SIP = Enum.INT_SIP;
    static final int INT_SKYPE = Enum.INT_SKYPE;
    static final int INT_URL = Enum.INT_URL;
    static final int INT_XRI = Enum.INT_XRI;
    static final int INT_YAHOO = Enum.INT_YAHOO;
    
    /**
     * Enumeration value class for oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AIM
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
        
        static final int INT_AIM = 1;
        static final int INT_EMAIL = 2;
        static final int INT_GOOGLE = 3;
        static final int INT_GIZMO = 4;
        static final int INT_ICQ = 5;
        static final int INT_JABBER = 6;
        static final int INT_MSN = 7;
        static final int INT_SIP = 8;
        static final int INT_SKYPE = 9;
        static final int INT_URL = 10;
        static final int INT_XRI = 11;
        static final int INT_YAHOO = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("AIM", INT_AIM),
                new Enum("EMAIL", INT_EMAIL),
                new Enum("GOOGLE", INT_GOOGLE),
                new Enum("GIZMO", INT_GIZMO),
                new Enum("ICQ", INT_ICQ),
                new Enum("JABBER", INT_JABBER),
                new Enum("MSN", INT_MSN),
                new Enum("SIP", INT_SIP),
                new Enum("SKYPE", INT_SKYPE),
                new Enum("URL", INT_URL),
                new Enum("XRI", INT_XRI),
                new Enum("YAHOO", INT_YAHOO),
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
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList newValue(java.lang.Object obj) {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) type.newValue( obj ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList newInstance() {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
