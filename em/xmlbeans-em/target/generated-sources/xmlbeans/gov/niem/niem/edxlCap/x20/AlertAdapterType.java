/*
 * XML Type:  AlertAdapterType
 * Namespace: http://niem.gov/niem/edxl-cap/2.0
 * Java type: gov.niem.niem.edxlCap.x20.AlertAdapterType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.edxlCap.x20;


/**
 * An XML AlertAdapterType(@http://niem.gov/niem/edxl-cap/2.0).
 *
 * This is a complex type.
 */
public interface AlertAdapterType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlertAdapterType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("alertadaptertypeb3e5type");
    
    /**
     * Gets array of all "alert" elements
     */
    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[] getAlertArray();
    
    /**
     * Gets ith "alert" element
     */
    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlertArray(int i);
    
    /**
     * Returns number of "alert" element
     */
    int sizeOfAlertArray();
    
    /**
     * Sets array of all "alert" element
     */
    void setAlertArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[] alertArray);
    
    /**
     * Sets ith "alert" element
     */
    void setAlertArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alert" element
     */
    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert insertNewAlert(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alert" element
     */
    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert addNewAlert();
    
    /**
     * Removes the ith "alert" element
     */
    void removeAlert(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType newInstance() {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.edxlCap.x20.AlertAdapterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.edxlCap.x20.AlertAdapterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
