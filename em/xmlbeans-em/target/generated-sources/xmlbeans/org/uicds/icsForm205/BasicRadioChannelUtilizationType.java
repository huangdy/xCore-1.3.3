/*
 * XML Type:  BasicRadioChannelUtilizationType
 * Namespace: http://uicds.org/ICSForm205
 * Java type: org.uicds.icsForm205.BasicRadioChannelUtilizationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm205;


/**
 * An XML BasicRadioChannelUtilizationType(@http://uicds.org/ICSForm205).
 *
 * This is a complex type.
 */
public interface BasicRadioChannelUtilizationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BasicRadioChannelUtilizationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("basicradiochannelutilizationtype0d36type");
    
    /**
     * Gets the "SystemCache" element
     */
    java.lang.String getSystemCache();
    
    /**
     * Gets (as xml) the "SystemCache" element
     */
    org.apache.xmlbeans.XmlString xgetSystemCache();
    
    /**
     * Sets the "SystemCache" element
     */
    void setSystemCache(java.lang.String systemCache);
    
    /**
     * Sets (as xml) the "SystemCache" element
     */
    void xsetSystemCache(org.apache.xmlbeans.XmlString systemCache);
    
    /**
     * Gets the "Channel" element
     */
    java.lang.String getChannel();
    
    /**
     * Gets (as xml) the "Channel" element
     */
    org.apache.xmlbeans.XmlString xgetChannel();
    
    /**
     * Sets the "Channel" element
     */
    void setChannel(java.lang.String channel);
    
    /**
     * Sets (as xml) the "Channel" element
     */
    void xsetChannel(org.apache.xmlbeans.XmlString channel);
    
    /**
     * Gets the "Function" element
     */
    java.lang.String getFunction();
    
    /**
     * Gets (as xml) the "Function" element
     */
    org.apache.xmlbeans.XmlString xgetFunction();
    
    /**
     * Sets the "Function" element
     */
    void setFunction(java.lang.String function);
    
    /**
     * Sets (as xml) the "Function" element
     */
    void xsetFunction(org.apache.xmlbeans.XmlString function);
    
    /**
     * Gets the "FrequencyTone" element
     */
    java.lang.String getFrequencyTone();
    
    /**
     * Gets (as xml) the "FrequencyTone" element
     */
    org.apache.xmlbeans.XmlString xgetFrequencyTone();
    
    /**
     * Sets the "FrequencyTone" element
     */
    void setFrequencyTone(java.lang.String frequencyTone);
    
    /**
     * Sets (as xml) the "FrequencyTone" element
     */
    void xsetFrequencyTone(org.apache.xmlbeans.XmlString frequencyTone);
    
    /**
     * Gets the "Assignment" element
     */
    java.lang.String getAssignment();
    
    /**
     * Gets (as xml) the "Assignment" element
     */
    org.apache.xmlbeans.XmlString xgetAssignment();
    
    /**
     * Sets the "Assignment" element
     */
    void setAssignment(java.lang.String assignment);
    
    /**
     * Sets (as xml) the "Assignment" element
     */
    void xsetAssignment(org.apache.xmlbeans.XmlString assignment);
    
    /**
     * Gets the "Remarks" element
     */
    java.lang.String getRemarks();
    
    /**
     * Gets (as xml) the "Remarks" element
     */
    org.apache.xmlbeans.XmlString xgetRemarks();
    
    /**
     * True if has "Remarks" element
     */
    boolean isSetRemarks();
    
    /**
     * Sets the "Remarks" element
     */
    void setRemarks(java.lang.String remarks);
    
    /**
     * Sets (as xml) the "Remarks" element
     */
    void xsetRemarks(org.apache.xmlbeans.XmlString remarks);
    
    /**
     * Unsets the "Remarks" element
     */
    void unsetRemarks();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType newInstance() {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm205.BasicRadioChannelUtilizationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm205.BasicRadioChannelUtilizationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
