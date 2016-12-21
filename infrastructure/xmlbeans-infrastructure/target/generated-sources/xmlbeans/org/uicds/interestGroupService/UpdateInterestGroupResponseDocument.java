/*
 * An XML document type.
 * Localname: UpdateInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.UpdateInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService;


/**
 * A document containing one UpdateInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public interface UpdateInterestGroupResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateInterestGroupResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("updateinterestgroupresponse7f61doctype");
    
    /**
     * Gets the "UpdateInterestGroupResponse" element
     */
    org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse getUpdateInterestGroupResponse();
    
    /**
     * Sets the "UpdateInterestGroupResponse" element
     */
    void setUpdateInterestGroupResponse(org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse updateInterestGroupResponse);
    
    /**
     * Appends and returns a new empty "UpdateInterestGroupResponse" element
     */
    org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse addNewUpdateInterestGroupResponse();
    
    /**
     * An XML UpdateInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public interface UpdateInterestGroupResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateInterestGroupResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("updateinterestgroupresponsefebaelemtype");
        
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
            public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse newInstance() {
              return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument newInstance() {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.interestGroupService.UpdateInterestGroupResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
