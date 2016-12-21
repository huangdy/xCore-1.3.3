/*
 * XML Type:  HospitalsType
 * Namespace: http://uicds.org/ICSForm206
 * Java type: org.uicds.icsForm206.HospitalsType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm206;


/**
 * An XML HospitalsType(@http://uicds.org/ICSForm206).
 *
 * This is a complex type.
 */
public interface HospitalsType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HospitalsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("hospitalstype4ed2type");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "Address" element
     */
    java.lang.String getAddress();
    
    /**
     * Gets (as xml) the "Address" element
     */
    org.apache.xmlbeans.XmlString xgetAddress();
    
    /**
     * Sets the "Address" element
     */
    void setAddress(java.lang.String address);
    
    /**
     * Sets (as xml) the "Address" element
     */
    void xsetAddress(org.apache.xmlbeans.XmlString address);
    
    /**
     * Gets the "TravelTimeAir" element
     */
    java.util.Calendar getTravelTimeAir();
    
    /**
     * Gets (as xml) the "TravelTimeAir" element
     */
    org.apache.xmlbeans.XmlTime xgetTravelTimeAir();
    
    /**
     * Sets the "TravelTimeAir" element
     */
    void setTravelTimeAir(java.util.Calendar travelTimeAir);
    
    /**
     * Sets (as xml) the "TravelTimeAir" element
     */
    void xsetTravelTimeAir(org.apache.xmlbeans.XmlTime travelTimeAir);
    
    /**
     * Gets the "TravelTimeGround" element
     */
    java.util.Calendar getTravelTimeGround();
    
    /**
     * Gets (as xml) the "TravelTimeGround" element
     */
    org.apache.xmlbeans.XmlTime xgetTravelTimeGround();
    
    /**
     * Sets the "TravelTimeGround" element
     */
    void setTravelTimeGround(java.util.Calendar travelTimeGround);
    
    /**
     * Sets (as xml) the "TravelTimeGround" element
     */
    void xsetTravelTimeGround(org.apache.xmlbeans.XmlTime travelTimeGround);
    
    /**
     * Gets the "Phone" element
     */
    java.lang.String getPhone();
    
    /**
     * Gets (as xml) the "Phone" element
     */
    org.apache.xmlbeans.XmlString xgetPhone();
    
    /**
     * Sets the "Phone" element
     */
    void setPhone(java.lang.String phone);
    
    /**
     * Sets (as xml) the "Phone" element
     */
    void xsetPhone(org.apache.xmlbeans.XmlString phone);
    
    /**
     * Gets the "Helipad" element
     */
    boolean getHelipad();
    
    /**
     * Gets (as xml) the "Helipad" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHelipad();
    
    /**
     * Sets the "Helipad" element
     */
    void setHelipad(boolean helipad);
    
    /**
     * Sets (as xml) the "Helipad" element
     */
    void xsetHelipad(org.apache.xmlbeans.XmlBoolean helipad);
    
    /**
     * Gets the "BurnCenter" element
     */
    boolean getBurnCenter();
    
    /**
     * Gets (as xml) the "BurnCenter" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBurnCenter();
    
    /**
     * Sets the "BurnCenter" element
     */
    void setBurnCenter(boolean burnCenter);
    
    /**
     * Sets (as xml) the "BurnCenter" element
     */
    void xsetBurnCenter(org.apache.xmlbeans.XmlBoolean burnCenter);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm206.HospitalsType newInstance() {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm206.HospitalsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm206.HospitalsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm206.HospitalsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm206.HospitalsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm206.HospitalsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm206.HospitalsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm206.HospitalsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
