/*
 * XML Type:  RadioInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1;


/**
 * An XML RadioInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public interface RadioInformationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RadioInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("radioinformationtype4fddtype");
    
    /**
     * Gets the "RadioType" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getRadioType();
    
    /**
     * Sets the "RadioType" element
     */
    void setRadioType(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType radioType);
    
    /**
     * Appends and returns a new empty "RadioType" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewRadioType();
    
    /**
     * Gets the "RadioChannel" element
     */
    java.lang.String getRadioChannel();
    
    /**
     * Gets (as xml) the "RadioChannel" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType xgetRadioChannel();
    
    /**
     * Sets the "RadioChannel" element
     */
    void setRadioChannel(java.lang.String radioChannel);
    
    /**
     * Sets (as xml) the "RadioChannel" element
     */
    void xsetRadioChannel(x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType radioChannel);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
