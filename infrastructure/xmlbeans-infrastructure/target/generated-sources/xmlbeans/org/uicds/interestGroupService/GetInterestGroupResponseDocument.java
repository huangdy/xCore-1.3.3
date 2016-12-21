/*
 * An XML document type.
 * Localname: GetInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.GetInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService;


/**
 * A document containing one GetInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public interface GetInterestGroupResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInterestGroupResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("getinterestgroupresponseb506doctype");
    
    /**
     * Gets the "GetInterestGroupResponse" element
     */
    org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse getGetInterestGroupResponse();
    
    /**
     * Sets the "GetInterestGroupResponse" element
     */
    void setGetInterestGroupResponse(org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse getInterestGroupResponse);
    
    /**
     * Appends and returns a new empty "GetInterestGroupResponse" element
     */
    org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse addNewGetInterestGroupResponse();
    
    /**
     * An XML GetInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public interface GetInterestGroupResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetInterestGroupResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("getinterestgroupresponsedcaaelemtype");
        
        /**
         * Gets the "WorkProduct" element
         */
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProduct();
        
        /**
         * Sets the "WorkProduct" element
         */
        void setWorkProduct(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct);
        
        /**
         * Appends and returns a new empty "WorkProduct" element
         */
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct addNewWorkProduct();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse newInstance() {
              return (org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument newInstance() {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.interestGroupService.GetInterestGroupResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.interestGroupService.GetInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
