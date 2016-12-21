/*
 * XML Type:  DatesType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.DatesType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20;


/**
 * An XML DatesType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public interface DatesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("datestype8319type");
    
    /**
     * Gets the "created" attribute
     */
    java.util.Calendar getCreated();
    
    /**
     * Gets (as xml) the "created" attribute
     */
    mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType xgetCreated();
    
    /**
     * True if has "created" attribute
     */
    boolean isSetCreated();
    
    /**
     * Sets the "created" attribute
     */
    void setCreated(java.util.Calendar created);
    
    /**
     * Sets (as xml) the "created" attribute
     */
    void xsetCreated(mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType created);
    
    /**
     * Unsets the "created" attribute
     */
    void unsetCreated();
    
    /**
     * Gets the "posted" attribute
     */
    java.util.Calendar getPosted();
    
    /**
     * Gets (as xml) the "posted" attribute
     */
    mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType xgetPosted();
    
    /**
     * True if has "posted" attribute
     */
    boolean isSetPosted();
    
    /**
     * Sets the "posted" attribute
     */
    void setPosted(java.util.Calendar posted);
    
    /**
     * Sets (as xml) the "posted" attribute
     */
    void xsetPosted(mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType posted);
    
    /**
     * Unsets the "posted" attribute
     */
    void unsetPosted();
    
    /**
     * Gets the "validTil" attribute
     */
    java.util.Calendar getValidTil();
    
    /**
     * Gets (as xml) the "validTil" attribute
     */
    mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType xgetValidTil();
    
    /**
     * True if has "validTil" attribute
     */
    boolean isSetValidTil();
    
    /**
     * Sets the "validTil" attribute
     */
    void setValidTil(java.util.Calendar validTil);
    
    /**
     * Sets (as xml) the "validTil" attribute
     */
    void xsetValidTil(mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType validTil);
    
    /**
     * Unsets the "validTil" attribute
     */
    void unsetValidTil();
    
    /**
     * Gets the "infoCutOff" attribute
     */
    java.util.Calendar getInfoCutOff();
    
    /**
     * Gets (as xml) the "infoCutOff" attribute
     */
    mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType xgetInfoCutOff();
    
    /**
     * True if has "infoCutOff" attribute
     */
    boolean isSetInfoCutOff();
    
    /**
     * Sets the "infoCutOff" attribute
     */
    void setInfoCutOff(java.util.Calendar infoCutOff);
    
    /**
     * Sets (as xml) the "infoCutOff" attribute
     */
    void xsetInfoCutOff(mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType infoCutOff);
    
    /**
     * Unsets the "infoCutOff" attribute
     */
    void unsetInfoCutOff();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType newInstance() {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.DatesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.DatesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
