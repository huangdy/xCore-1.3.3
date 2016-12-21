/*
 * XML Type:  AddressTypeList
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.AddressTypeList
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3;


/**
 * An XML AddressTypeList(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.AddressTypeList.
 */
public interface AddressTypeList extends org.apache.xmlbeans.XmlNormalizedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddressTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("addresstypelist0b09type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AIRPORT = Enum.forString("Airport");
    static final Enum BUSINESS = Enum.forString("Business");
    static final Enum CARAVAN_PARK = Enum.forString("CaravanPark");
    static final Enum COMMERCIAL_PARK = Enum.forString("CommercialPark");
    static final Enum COMMUNITY_DEVELOPMENT = Enum.forString("CommunityDevelopment");
    static final Enum EDUCATIONAL_INSTITUTION = Enum.forString("EducationalInstitution");
    static final Enum ENTERTAINMENT = Enum.forString("Entertainment");
    static final Enum HOSPITAL = Enum.forString("Hospital");
    static final Enum LOCATION = Enum.forString("Location");
    static final Enum MARINA = Enum.forString("Marina");
    static final Enum MILITARY_BASE = Enum.forString("MilitaryBase");
    static final Enum OVERSEAS_MILITARY = Enum.forString("OverseasMilitary");
    static final Enum PORT = Enum.forString("Port");
    static final Enum PRIMARY = Enum.forString("Primary");
    static final Enum RECREATIONAL_PARK = Enum.forString("RecreationalPark");
    static final Enum RESORT = Enum.forString("Resort");
    static final Enum RETIREMENT_VILLAGE = Enum.forString("RetirementVillage");
    static final Enum RURAL = Enum.forString("Rural");
    static final Enum SECONDARY = Enum.forString("Secondary");
    static final Enum SHOPPING_CENTRE = Enum.forString("ShoppingCentre");
    static final Enum SPORTING_CENTRE = Enum.forString("SportingCentre");
    static final Enum URBAN = Enum.forString("Urban");
    
    static final int INT_AIRPORT = Enum.INT_AIRPORT;
    static final int INT_BUSINESS = Enum.INT_BUSINESS;
    static final int INT_CARAVAN_PARK = Enum.INT_CARAVAN_PARK;
    static final int INT_COMMERCIAL_PARK = Enum.INT_COMMERCIAL_PARK;
    static final int INT_COMMUNITY_DEVELOPMENT = Enum.INT_COMMUNITY_DEVELOPMENT;
    static final int INT_EDUCATIONAL_INSTITUTION = Enum.INT_EDUCATIONAL_INSTITUTION;
    static final int INT_ENTERTAINMENT = Enum.INT_ENTERTAINMENT;
    static final int INT_HOSPITAL = Enum.INT_HOSPITAL;
    static final int INT_LOCATION = Enum.INT_LOCATION;
    static final int INT_MARINA = Enum.INT_MARINA;
    static final int INT_MILITARY_BASE = Enum.INT_MILITARY_BASE;
    static final int INT_OVERSEAS_MILITARY = Enum.INT_OVERSEAS_MILITARY;
    static final int INT_PORT = Enum.INT_PORT;
    static final int INT_PRIMARY = Enum.INT_PRIMARY;
    static final int INT_RECREATIONAL_PARK = Enum.INT_RECREATIONAL_PARK;
    static final int INT_RESORT = Enum.INT_RESORT;
    static final int INT_RETIREMENT_VILLAGE = Enum.INT_RETIREMENT_VILLAGE;
    static final int INT_RURAL = Enum.INT_RURAL;
    static final int INT_SECONDARY = Enum.INT_SECONDARY;
    static final int INT_SHOPPING_CENTRE = Enum.INT_SHOPPING_CENTRE;
    static final int INT_SPORTING_CENTRE = Enum.INT_SPORTING_CENTRE;
    static final int INT_URBAN = Enum.INT_URBAN;
    
    /**
     * Enumeration value class for oasisNamesTcCiqXal3.AddressTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AIRPORT
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
        
        static final int INT_AIRPORT = 1;
        static final int INT_BUSINESS = 2;
        static final int INT_CARAVAN_PARK = 3;
        static final int INT_COMMERCIAL_PARK = 4;
        static final int INT_COMMUNITY_DEVELOPMENT = 5;
        static final int INT_EDUCATIONAL_INSTITUTION = 6;
        static final int INT_ENTERTAINMENT = 7;
        static final int INT_HOSPITAL = 8;
        static final int INT_LOCATION = 9;
        static final int INT_MARINA = 10;
        static final int INT_MILITARY_BASE = 11;
        static final int INT_OVERSEAS_MILITARY = 12;
        static final int INT_PORT = 13;
        static final int INT_PRIMARY = 14;
        static final int INT_RECREATIONAL_PARK = 15;
        static final int INT_RESORT = 16;
        static final int INT_RETIREMENT_VILLAGE = 17;
        static final int INT_RURAL = 18;
        static final int INT_SECONDARY = 19;
        static final int INT_SHOPPING_CENTRE = 20;
        static final int INT_SPORTING_CENTRE = 21;
        static final int INT_URBAN = 22;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Airport", INT_AIRPORT),
                new Enum("Business", INT_BUSINESS),
                new Enum("CaravanPark", INT_CARAVAN_PARK),
                new Enum("CommercialPark", INT_COMMERCIAL_PARK),
                new Enum("CommunityDevelopment", INT_COMMUNITY_DEVELOPMENT),
                new Enum("EducationalInstitution", INT_EDUCATIONAL_INSTITUTION),
                new Enum("Entertainment", INT_ENTERTAINMENT),
                new Enum("Hospital", INT_HOSPITAL),
                new Enum("Location", INT_LOCATION),
                new Enum("Marina", INT_MARINA),
                new Enum("MilitaryBase", INT_MILITARY_BASE),
                new Enum("OverseasMilitary", INT_OVERSEAS_MILITARY),
                new Enum("Port", INT_PORT),
                new Enum("Primary", INT_PRIMARY),
                new Enum("RecreationalPark", INT_RECREATIONAL_PARK),
                new Enum("Resort", INT_RESORT),
                new Enum("RetirementVillage", INT_RETIREMENT_VILLAGE),
                new Enum("Rural", INT_RURAL),
                new Enum("Secondary", INT_SECONDARY),
                new Enum("ShoppingCentre", INT_SHOPPING_CENTRE),
                new Enum("SportingCentre", INT_SPORTING_CENTRE),
                new Enum("Urban", INT_URBAN),
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
        public static oasisNamesTcCiqXal3.AddressTypeList newValue(java.lang.Object obj) {
          return (oasisNamesTcCiqXal3.AddressTypeList) type.newValue( obj ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList newInstance() {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXal3.AddressTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.AddressTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.AddressTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.AddressTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
