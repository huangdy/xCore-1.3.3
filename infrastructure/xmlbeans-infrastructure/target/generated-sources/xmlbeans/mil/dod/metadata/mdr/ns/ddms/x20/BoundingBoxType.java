/*
 * XML Type:  BoundingBoxType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20;


/**
 * An XML BoundingBoxType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public interface BoundingBoxType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BoundingBoxType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("boundingboxtypefc97type");
    
    /**
     * Gets the "WestBL" element
     */
    double getWestBL();
    
    /**
     * Gets (as xml) the "WestBL" element
     */
    org.apache.xmlbeans.XmlDouble xgetWestBL();
    
    /**
     * Sets the "WestBL" element
     */
    void setWestBL(double westBL);
    
    /**
     * Sets (as xml) the "WestBL" element
     */
    void xsetWestBL(org.apache.xmlbeans.XmlDouble westBL);
    
    /**
     * Gets the "EastBL" element
     */
    double getEastBL();
    
    /**
     * Gets (as xml) the "EastBL" element
     */
    org.apache.xmlbeans.XmlDouble xgetEastBL();
    
    /**
     * Sets the "EastBL" element
     */
    void setEastBL(double eastBL);
    
    /**
     * Sets (as xml) the "EastBL" element
     */
    void xsetEastBL(org.apache.xmlbeans.XmlDouble eastBL);
    
    /**
     * Gets the "SouthBL" element
     */
    double getSouthBL();
    
    /**
     * Gets (as xml) the "SouthBL" element
     */
    org.apache.xmlbeans.XmlDouble xgetSouthBL();
    
    /**
     * Sets the "SouthBL" element
     */
    void setSouthBL(double southBL);
    
    /**
     * Sets (as xml) the "SouthBL" element
     */
    void xsetSouthBL(org.apache.xmlbeans.XmlDouble southBL);
    
    /**
     * Gets the "NorthBL" element
     */
    double getNorthBL();
    
    /**
     * Gets (as xml) the "NorthBL" element
     */
    org.apache.xmlbeans.XmlDouble xgetNorthBL();
    
    /**
     * Sets the "NorthBL" element
     */
    void setNorthBL(double northBL);
    
    /**
     * Sets (as xml) the "NorthBL" element
     */
    void xsetNorthBL(org.apache.xmlbeans.XmlDouble northBL);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType newInstance() {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
