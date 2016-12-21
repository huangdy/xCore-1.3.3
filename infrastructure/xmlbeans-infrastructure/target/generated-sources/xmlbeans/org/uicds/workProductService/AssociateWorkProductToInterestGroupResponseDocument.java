/*
 * An XML document type.
 * Localname: AssociateWorkProductToInterestGroupResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService;


/**
 * A document containing one AssociateWorkProductToInterestGroupResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public interface AssociateWorkProductToInterestGroupResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssociateWorkProductToInterestGroupResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("associateworkproducttointerestgroupresponse4626doctype");
    
    /**
     * Gets the "AssociateWorkProductToInterestGroupResponse" element
     */
    org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse getAssociateWorkProductToInterestGroupResponse();
    
    /**
     * Sets the "AssociateWorkProductToInterestGroupResponse" element
     */
    void setAssociateWorkProductToInterestGroupResponse(org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse associateWorkProductToInterestGroupResponse);
    
    /**
     * Appends and returns a new empty "AssociateWorkProductToInterestGroupResponse" element
     */
    org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse addNewAssociateWorkProductToInterestGroupResponse();
    
    /**
     * An XML AssociateWorkProductToInterestGroupResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public interface AssociateWorkProductToInterestGroupResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssociateWorkProductToInterestGroupResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("associateworkproducttointerestgroupresponse3d0delemtype");
        
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
            public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse newInstance() {
              return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument newInstance() {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
