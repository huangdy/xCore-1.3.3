/*
 * XML Type:  ICSFormDocumentType
 * Namespace: http://uicds.org/ICSFormCommon
 * Java type: org.uicds.icsFormCommon.ICSFormDocumentType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsFormCommon;


/**
 * An XML ICSFormDocumentType(@http://uicds.org/ICSFormCommon).
 *
 * This is a complex type.
 */
public interface ICSFormDocumentType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSFormDocumentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsformdocumenttype41d2type");
    
    /**
     * Gets the "IncidentID" element
     */
    java.lang.String getIncidentID();
    
    /**
     * Gets (as xml) the "IncidentID" element
     */
    org.apache.xmlbeans.XmlString xgetIncidentID();
    
    /**
     * Sets the "IncidentID" element
     */
    void setIncidentID(java.lang.String incidentID);
    
    /**
     * Sets (as xml) the "IncidentID" element
     */
    void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID);
    
    /**
     * Gets the "ICSFormNumber" element
     */
    java.lang.String getICSFormNumber();
    
    /**
     * Gets (as xml) the "ICSFormNumber" element
     */
    org.apache.xmlbeans.XmlString xgetICSFormNumber();
    
    /**
     * Sets the "ICSFormNumber" element
     */
    void setICSFormNumber(java.lang.String icsFormNumber);
    
    /**
     * Sets (as xml) the "ICSFormNumber" element
     */
    void xsetICSFormNumber(org.apache.xmlbeans.XmlString icsFormNumber);
    
    /**
     * Gets the "DocumentFileName" element
     */
    java.lang.String getDocumentFileName();
    
    /**
     * Gets (as xml) the "DocumentFileName" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentFileName();
    
    /**
     * Sets the "DocumentFileName" element
     */
    void setDocumentFileName(java.lang.String documentFileName);
    
    /**
     * Sets (as xml) the "DocumentFileName" element
     */
    void xsetDocumentFileName(org.apache.xmlbeans.XmlString documentFileName);
    
    /**
     * Gets the "DocumentDescriptionText" element
     */
    java.lang.String getDocumentDescriptionText();
    
    /**
     * Gets (as xml) the "DocumentDescriptionText" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentDescriptionText();
    
    /**
     * Sets the "DocumentDescriptionText" element
     */
    void setDocumentDescriptionText(java.lang.String documentDescriptionText);
    
    /**
     * Sets (as xml) the "DocumentDescriptionText" element
     */
    void xsetDocumentDescriptionText(org.apache.xmlbeans.XmlString documentDescriptionText);
    
    /**
     * Gets the "DocumentBinary" element
     */
    byte[] getDocumentBinary();
    
    /**
     * Gets (as xml) the "DocumentBinary" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetDocumentBinary();
    
    /**
     * Sets the "DocumentBinary" element
     */
    void setDocumentBinary(byte[] documentBinary);
    
    /**
     * Sets (as xml) the "DocumentBinary" element
     */
    void xsetDocumentBinary(org.apache.xmlbeans.XmlBase64Binary documentBinary);
    
    /**
     * Gets the "DocumentSource" element
     */
    java.lang.String getDocumentSource();
    
    /**
     * Gets (as xml) the "DocumentSource" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentSource();
    
    /**
     * Sets the "DocumentSource" element
     */
    void setDocumentSource(java.lang.String documentSource);
    
    /**
     * Sets (as xml) the "DocumentSource" element
     */
    void xsetDocumentSource(org.apache.xmlbeans.XmlString documentSource);
    
    /**
     * Gets the "DocumentCreationDate" element
     */
    java.lang.String getDocumentCreationDate();
    
    /**
     * Gets (as xml) the "DocumentCreationDate" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentCreationDate();
    
    /**
     * Sets the "DocumentCreationDate" element
     */
    void setDocumentCreationDate(java.lang.String documentCreationDate);
    
    /**
     * Sets (as xml) the "DocumentCreationDate" element
     */
    void xsetDocumentCreationDate(org.apache.xmlbeans.XmlString documentCreationDate);
    
    /**
     * Gets the "DocumentLastModifiedDate" element
     */
    java.lang.String getDocumentLastModifiedDate();
    
    /**
     * Gets (as xml) the "DocumentLastModifiedDate" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentLastModifiedDate();
    
    /**
     * Sets the "DocumentLastModifiedDate" element
     */
    void setDocumentLastModifiedDate(java.lang.String documentLastModifiedDate);
    
    /**
     * Sets (as xml) the "DocumentLastModifiedDate" element
     */
    void xsetDocumentLastModifiedDate(org.apache.xmlbeans.XmlString documentLastModifiedDate);
    
    /**
     * Gets the "DocumentEffectiveDate" element
     */
    java.lang.String getDocumentEffectiveDate();
    
    /**
     * Gets (as xml) the "DocumentEffectiveDate" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentEffectiveDate();
    
    /**
     * Sets the "DocumentEffectiveDate" element
     */
    void setDocumentEffectiveDate(java.lang.String documentEffectiveDate);
    
    /**
     * Sets (as xml) the "DocumentEffectiveDate" element
     */
    void xsetDocumentEffectiveDate(org.apache.xmlbeans.XmlString documentEffectiveDate);
    
    /**
     * Gets the "DocumentExpirationDate" element
     */
    java.lang.String getDocumentExpirationDate();
    
    /**
     * Gets (as xml) the "DocumentExpirationDate" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentExpirationDate();
    
    /**
     * Sets the "DocumentExpirationDate" element
     */
    void setDocumentExpirationDate(java.lang.String documentExpirationDate);
    
    /**
     * Sets (as xml) the "DocumentExpirationDate" element
     */
    void xsetDocumentExpirationDate(org.apache.xmlbeans.XmlString documentExpirationDate);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsFormCommon.ICSFormDocumentType newInstance() {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsFormCommon.ICSFormDocumentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsFormCommon.ICSFormDocumentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
