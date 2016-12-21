/*
 * An XML document type.
 * Localname: UpdateInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.UpdateInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService;


/**
 * A document containing one UpdateInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public interface UpdateInterestGroupRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateInterestGroupRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("updateinterestgrouprequestd329doctype");
    
    /**
     * Gets the "UpdateInterestGroupRequest" element
     */
    org.uicds.interestGroupService.UpdateInterestGroupRequestDocument.UpdateInterestGroupRequest getUpdateInterestGroupRequest();
    
    /**
     * Sets the "UpdateInterestGroupRequest" element
     */
    void setUpdateInterestGroupRequest(org.uicds.interestGroupService.UpdateInterestGroupRequestDocument.UpdateInterestGroupRequest updateInterestGroupRequest);
    
    /**
     * Appends and returns a new empty "UpdateInterestGroupRequest" element
     */
    org.uicds.interestGroupService.UpdateInterestGroupRequestDocument.UpdateInterestGroupRequest addNewUpdateInterestGroupRequest();
    
    /**
     * An XML UpdateInterestGroupRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public interface UpdateInterestGroupRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateInterestGroupRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("updateinterestgrouprequest9e4aelemtype");
        
        /**
         * Gets the "InterestGroup" element
         */
        com.saic.precis.x2009.x06.structures.InterestGroupType getInterestGroup();
        
        /**
         * Sets the "InterestGroup" element
         */
        void setInterestGroup(com.saic.precis.x2009.x06.structures.InterestGroupType interestGroup);
        
        /**
         * Appends and returns a new empty "InterestGroup" element
         */
        com.saic.precis.x2009.x06.structures.InterestGroupType addNewInterestGroup();
        
        /**
         * Gets the "InterestGroupId" element
         */
        java.lang.String getInterestGroupId();
        
        /**
         * Gets (as xml) the "InterestGroupId" element
         */
        org.apache.xmlbeans.XmlString xgetInterestGroupId();
        
        /**
         * Sets the "InterestGroupId" element
         */
        void setInterestGroupId(java.lang.String interestGroupId);
        
        /**
         * Sets (as xml) the "InterestGroupId" element
         */
        void xsetInterestGroupId(org.apache.xmlbeans.XmlString interestGroupId);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument.UpdateInterestGroupRequest newInstance() {
              return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument.UpdateInterestGroupRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument.UpdateInterestGroupRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument.UpdateInterestGroupRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument newInstance() {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.interestGroupService.UpdateInterestGroupRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.interestGroupService.UpdateInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
