/*
 * XML Type:  ScheduleTypeType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1;


/**
 * An XML ScheduleTypeType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.
 */
public interface ScheduleTypeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScheduleTypeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("scheduletypetypeb71dtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum REQUESTED_ARRIVAL = Enum.forString("RequestedArrival");
    static final Enum ESTIMATED_ARRIVAL = Enum.forString("EstimatedArrival");
    static final Enum ACTUAL_ARRIVAL = Enum.forString("ActualArrival");
    static final Enum REQUESTED_DEPARTURE = Enum.forString("RequestedDeparture");
    static final Enum ESTIMATED_DEPARTURE = Enum.forString("EstimatedDeparture");
    static final Enum ACTUAL_DEPARTURE = Enum.forString("ActualDeparture");
    static final Enum ESTIMATED_RETURN_DEPARTURE = Enum.forString("EstimatedReturnDeparture");
    static final Enum ESTIMATED_RETURN_ARRIVAL = Enum.forString("EstimatedReturnArrival");
    static final Enum ACTUAL_RETURN_ARRIVAL = Enum.forString("ActualReturnArrival");
    static final Enum REQUESTED_RETURN_DEPARTURE = Enum.forString("RequestedReturnDeparture");
    static final Enum REQUESTED_RETURN_ARRIVAL = Enum.forString("RequestedReturnArrival");
    static final Enum ACTUAL_RETURN_DEPARTURE = Enum.forString("ActualReturnDeparture");
    static final Enum BEGIN_AVAILABLE = Enum.forString("BeginAvailable");
    static final Enum END_AVAILABLE = Enum.forString("EndAvailable");
    static final Enum COMMITTED = Enum.forString("Committed");
    static final Enum CURRENT = Enum.forString("Current");
    static final Enum REPORT_TO = Enum.forString("ReportTo");
    static final Enum ROUTE = Enum.forString("Route");
    
    static final int INT_REQUESTED_ARRIVAL = Enum.INT_REQUESTED_ARRIVAL;
    static final int INT_ESTIMATED_ARRIVAL = Enum.INT_ESTIMATED_ARRIVAL;
    static final int INT_ACTUAL_ARRIVAL = Enum.INT_ACTUAL_ARRIVAL;
    static final int INT_REQUESTED_DEPARTURE = Enum.INT_REQUESTED_DEPARTURE;
    static final int INT_ESTIMATED_DEPARTURE = Enum.INT_ESTIMATED_DEPARTURE;
    static final int INT_ACTUAL_DEPARTURE = Enum.INT_ACTUAL_DEPARTURE;
    static final int INT_ESTIMATED_RETURN_DEPARTURE = Enum.INT_ESTIMATED_RETURN_DEPARTURE;
    static final int INT_ESTIMATED_RETURN_ARRIVAL = Enum.INT_ESTIMATED_RETURN_ARRIVAL;
    static final int INT_ACTUAL_RETURN_ARRIVAL = Enum.INT_ACTUAL_RETURN_ARRIVAL;
    static final int INT_REQUESTED_RETURN_DEPARTURE = Enum.INT_REQUESTED_RETURN_DEPARTURE;
    static final int INT_REQUESTED_RETURN_ARRIVAL = Enum.INT_REQUESTED_RETURN_ARRIVAL;
    static final int INT_ACTUAL_RETURN_DEPARTURE = Enum.INT_ACTUAL_RETURN_DEPARTURE;
    static final int INT_BEGIN_AVAILABLE = Enum.INT_BEGIN_AVAILABLE;
    static final int INT_END_AVAILABLE = Enum.INT_END_AVAILABLE;
    static final int INT_COMMITTED = Enum.INT_COMMITTED;
    static final int INT_CURRENT = Enum.INT_CURRENT;
    static final int INT_REPORT_TO = Enum.INT_REPORT_TO;
    static final int INT_ROUTE = Enum.INT_ROUTE;
    
    /**
     * Enumeration value class for x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_REQUESTED_ARRIVAL
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
        
        static final int INT_REQUESTED_ARRIVAL = 1;
        static final int INT_ESTIMATED_ARRIVAL = 2;
        static final int INT_ACTUAL_ARRIVAL = 3;
        static final int INT_REQUESTED_DEPARTURE = 4;
        static final int INT_ESTIMATED_DEPARTURE = 5;
        static final int INT_ACTUAL_DEPARTURE = 6;
        static final int INT_ESTIMATED_RETURN_DEPARTURE = 7;
        static final int INT_ESTIMATED_RETURN_ARRIVAL = 8;
        static final int INT_ACTUAL_RETURN_ARRIVAL = 9;
        static final int INT_REQUESTED_RETURN_DEPARTURE = 10;
        static final int INT_REQUESTED_RETURN_ARRIVAL = 11;
        static final int INT_ACTUAL_RETURN_DEPARTURE = 12;
        static final int INT_BEGIN_AVAILABLE = 13;
        static final int INT_END_AVAILABLE = 14;
        static final int INT_COMMITTED = 15;
        static final int INT_CURRENT = 16;
        static final int INT_REPORT_TO = 17;
        static final int INT_ROUTE = 18;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("RequestedArrival", INT_REQUESTED_ARRIVAL),
                new Enum("EstimatedArrival", INT_ESTIMATED_ARRIVAL),
                new Enum("ActualArrival", INT_ACTUAL_ARRIVAL),
                new Enum("RequestedDeparture", INT_REQUESTED_DEPARTURE),
                new Enum("EstimatedDeparture", INT_ESTIMATED_DEPARTURE),
                new Enum("ActualDeparture", INT_ACTUAL_DEPARTURE),
                new Enum("EstimatedReturnDeparture", INT_ESTIMATED_RETURN_DEPARTURE),
                new Enum("EstimatedReturnArrival", INT_ESTIMATED_RETURN_ARRIVAL),
                new Enum("ActualReturnArrival", INT_ACTUAL_RETURN_ARRIVAL),
                new Enum("RequestedReturnDeparture", INT_REQUESTED_RETURN_DEPARTURE),
                new Enum("RequestedReturnArrival", INT_REQUESTED_RETURN_ARRIVAL),
                new Enum("ActualReturnDeparture", INT_ACTUAL_RETURN_DEPARTURE),
                new Enum("BeginAvailable", INT_BEGIN_AVAILABLE),
                new Enum("EndAvailable", INT_END_AVAILABLE),
                new Enum("Committed", INT_COMMITTED),
                new Enum("Current", INT_CURRENT),
                new Enum("ReportTo", INT_REPORT_TO),
                new Enum("Route", INT_ROUTE),
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
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType newValue(java.lang.Object obj) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) type.newValue( obj ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
