/*
 * XML Type:  PersonNameElementList
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.PersonNameElementList
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3;


/**
 * An XML PersonNameElementList(@urn:oasis:names:tc:ciq:xnl:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXnl3.PersonNameElementList.
 */
public interface PersonNameElementList extends org.apache.xmlbeans.XmlNormalizedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonNameElementList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("personnameelementlist58cetype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PRECEDING_TITLE = Enum.forString("PrecedingTitle");
    static final Enum TITLE = Enum.forString("Title");
    static final Enum FIRST_NAME = Enum.forString("FirstName");
    static final Enum MIDDLE_NAME = Enum.forString("MiddleName");
    static final Enum LAST_NAME = Enum.forString("LastName");
    static final Enum OTHER_NAME = Enum.forString("OtherName");
    static final Enum ALIAS = Enum.forString("Alias");
    static final Enum GENERATION_IDENTIFIER = Enum.forString("GenerationIdentifier");
    static final Enum DEGREE = Enum.forString("Degree");
    
    static final int INT_PRECEDING_TITLE = Enum.INT_PRECEDING_TITLE;
    static final int INT_TITLE = Enum.INT_TITLE;
    static final int INT_FIRST_NAME = Enum.INT_FIRST_NAME;
    static final int INT_MIDDLE_NAME = Enum.INT_MIDDLE_NAME;
    static final int INT_LAST_NAME = Enum.INT_LAST_NAME;
    static final int INT_OTHER_NAME = Enum.INT_OTHER_NAME;
    static final int INT_ALIAS = Enum.INT_ALIAS;
    static final int INT_GENERATION_IDENTIFIER = Enum.INT_GENERATION_IDENTIFIER;
    static final int INT_DEGREE = Enum.INT_DEGREE;
    
    /**
     * Enumeration value class for oasisNamesTcCiqXnl3.PersonNameElementList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PRECEDING_TITLE
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
        
        static final int INT_PRECEDING_TITLE = 1;
        static final int INT_TITLE = 2;
        static final int INT_FIRST_NAME = 3;
        static final int INT_MIDDLE_NAME = 4;
        static final int INT_LAST_NAME = 5;
        static final int INT_OTHER_NAME = 6;
        static final int INT_ALIAS = 7;
        static final int INT_GENERATION_IDENTIFIER = 8;
        static final int INT_DEGREE = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("PrecedingTitle", INT_PRECEDING_TITLE),
                new Enum("Title", INT_TITLE),
                new Enum("FirstName", INT_FIRST_NAME),
                new Enum("MiddleName", INT_MIDDLE_NAME),
                new Enum("LastName", INT_LAST_NAME),
                new Enum("OtherName", INT_OTHER_NAME),
                new Enum("Alias", INT_ALIAS),
                new Enum("GenerationIdentifier", INT_GENERATION_IDENTIFIER),
                new Enum("Degree", INT_DEGREE),
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
        public static oasisNamesTcCiqXnl3.PersonNameElementList newValue(java.lang.Object obj) {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) type.newValue( obj ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList newInstance() {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.PersonNameElementList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.PersonNameElementList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
