/*
 * XML Type:  ConditionType
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.ConditionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService;


/**
 * An XML ConditionType(@http://uicds.org/AgreementService).
 *
 * This is a complex type.
 */
public interface ConditionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConditionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("conditiontypecb64type");
    
    /**
     * Gets the "InterestGroup" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType getInterestGroup();
    
    /**
     * Sets the "InterestGroup" element
     */
    void setInterestGroup(com.saic.precis.x2009.x06.base.CodespaceValueType interestGroup);
    
    /**
     * Appends and returns a new empty "InterestGroup" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType addNewInterestGroup();
    
    /**
     * Gets the "RemoteCoreProximity" element
     */
    org.uicds.agreementService.ConditionType.RemoteCoreProximity getRemoteCoreProximity();
    
    /**
     * True if has "RemoteCoreProximity" element
     */
    boolean isSetRemoteCoreProximity();
    
    /**
     * Sets the "RemoteCoreProximity" element
     */
    void setRemoteCoreProximity(org.uicds.agreementService.ConditionType.RemoteCoreProximity remoteCoreProximity);
    
    /**
     * Appends and returns a new empty "RemoteCoreProximity" element
     */
    org.uicds.agreementService.ConditionType.RemoteCoreProximity addNewRemoteCoreProximity();
    
    /**
     * Unsets the "RemoteCoreProximity" element
     */
    void unsetRemoteCoreProximity();
    
    /**
     * Gets array of all "ExtendedMetadata" elements
     */
    com.saic.precis.x2009.x06.base.ExtendedMetadataType[] getExtendedMetadataArray();
    
    /**
     * Gets ith "ExtendedMetadata" element
     */
    com.saic.precis.x2009.x06.base.ExtendedMetadataType getExtendedMetadataArray(int i);
    
    /**
     * Returns number of "ExtendedMetadata" element
     */
    int sizeOfExtendedMetadataArray();
    
    /**
     * Sets array of all "ExtendedMetadata" element
     */
    void setExtendedMetadataArray(com.saic.precis.x2009.x06.base.ExtendedMetadataType[] extendedMetadataArray);
    
    /**
     * Sets ith "ExtendedMetadata" element
     */
    void setExtendedMetadataArray(int i, com.saic.precis.x2009.x06.base.ExtendedMetadataType extendedMetadata);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExtendedMetadata" element
     */
    com.saic.precis.x2009.x06.base.ExtendedMetadataType insertNewExtendedMetadata(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExtendedMetadata" element
     */
    com.saic.precis.x2009.x06.base.ExtendedMetadataType addNewExtendedMetadata();
    
    /**
     * Removes the ith "ExtendedMetadata" element
     */
    void removeExtendedMetadata(int i);
    
    /**
     * An XML RemoteCoreProximity(@http://uicds.org/AgreementService).
     *
     * This is an atomic type that is a restriction of org.uicds.agreementService.ConditionType$RemoteCoreProximity.
     */
    public interface RemoteCoreProximity extends org.apache.xmlbeans.XmlNonNegativeInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemoteCoreProximity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("remotecoreproximity332aelemtype");
        
        /**
         * Gets the "shareOnNoLoc" attribute
         */
        boolean getShareOnNoLoc();
        
        /**
         * Gets (as xml) the "shareOnNoLoc" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetShareOnNoLoc();
        
        /**
         * Sets the "shareOnNoLoc" attribute
         */
        void setShareOnNoLoc(boolean shareOnNoLoc);
        
        /**
         * Sets (as xml) the "shareOnNoLoc" attribute
         */
        void xsetShareOnNoLoc(org.apache.xmlbeans.XmlBoolean shareOnNoLoc);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.agreementService.ConditionType.RemoteCoreProximity newInstance() {
              return (org.uicds.agreementService.ConditionType.RemoteCoreProximity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.agreementService.ConditionType.RemoteCoreProximity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.agreementService.ConditionType.RemoteCoreProximity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.agreementService.ConditionType newInstance() {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.agreementService.ConditionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.agreementService.ConditionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.agreementService.ConditionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.agreementService.ConditionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.agreementService.ConditionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.agreementService.ConditionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.agreementService.ConditionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.agreementService.ConditionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.agreementService.ConditionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.agreementService.ConditionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.agreementService.ConditionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.agreementService.ConditionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.agreementService.ConditionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.agreementService.ConditionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.agreementService.ConditionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.agreementService.ConditionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.agreementService.ConditionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.agreementService.ConditionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
