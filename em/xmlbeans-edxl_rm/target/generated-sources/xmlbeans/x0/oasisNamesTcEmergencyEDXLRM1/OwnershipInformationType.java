/*
 * XML Type:  OwnershipInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1;


/**
 * An XML OwnershipInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public interface OwnershipInformationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OwnershipInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("ownershipinformationtypea7d1type");
    
    /**
     * Gets the "Owner" element
     */
    java.lang.String getOwner();
    
    /**
     * Gets (as xml) the "Owner" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.OwnerType xgetOwner();
    
    /**
     * True if has "Owner" element
     */
    boolean isSetOwner();
    
    /**
     * Sets the "Owner" element
     */
    void setOwner(java.lang.String owner);
    
    /**
     * Sets (as xml) the "Owner" element
     */
    void xsetOwner(x0.oasisNamesTcEmergencyEDXLRM1.OwnerType owner);
    
    /**
     * Unsets the "Owner" element
     */
    void unsetOwner();
    
    /**
     * Gets the "OwningJurisdiction" element
     */
    java.lang.String getOwningJurisdiction();
    
    /**
     * Gets (as xml) the "OwningJurisdiction" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType xgetOwningJurisdiction();
    
    /**
     * True if has "OwningJurisdiction" element
     */
    boolean isSetOwningJurisdiction();
    
    /**
     * Sets the "OwningJurisdiction" element
     */
    void setOwningJurisdiction(java.lang.String owningJurisdiction);
    
    /**
     * Sets (as xml) the "OwningJurisdiction" element
     */
    void xsetOwningJurisdiction(x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType owningJurisdiction);
    
    /**
     * Unsets the "OwningJurisdiction" element
     */
    void unsetOwningJurisdiction();
    
    /**
     * Gets the "HomeDispatch" element
     */
    java.lang.String getHomeDispatch();
    
    /**
     * Gets (as xml) the "HomeDispatch" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType xgetHomeDispatch();
    
    /**
     * True if has "HomeDispatch" element
     */
    boolean isSetHomeDispatch();
    
    /**
     * Sets the "HomeDispatch" element
     */
    void setHomeDispatch(java.lang.String homeDispatch);
    
    /**
     * Sets (as xml) the "HomeDispatch" element
     */
    void xsetHomeDispatch(x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType homeDispatch);
    
    /**
     * Unsets the "HomeDispatch" element
     */
    void unsetHomeDispatch();
    
    /**
     * Gets the "HomeUnit" element
     */
    java.lang.String getHomeUnit();
    
    /**
     * Gets (as xml) the "HomeUnit" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType xgetHomeUnit();
    
    /**
     * True if has "HomeUnit" element
     */
    boolean isSetHomeUnit();
    
    /**
     * Sets the "HomeUnit" element
     */
    void setHomeUnit(java.lang.String homeUnit);
    
    /**
     * Sets (as xml) the "HomeUnit" element
     */
    void xsetHomeUnit(x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType homeUnit);
    
    /**
     * Unsets the "HomeUnit" element
     */
    void unsetHomeUnit();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
