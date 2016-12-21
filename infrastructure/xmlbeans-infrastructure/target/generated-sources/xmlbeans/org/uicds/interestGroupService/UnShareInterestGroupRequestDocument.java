/*
 * An XML document type.
 * Localname: UnShareInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.UnShareInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService;


/**
 * A document containing one UnShareInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public interface UnShareInterestGroupRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnShareInterestGroupRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("unshareinterestgrouprequestc6d4doctype");
    
    /**
     * Gets the "UnShareInterestGroupRequest" element
     */
    org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest getUnShareInterestGroupRequest();
    
    /**
     * Sets the "UnShareInterestGroupRequest" element
     */
    void setUnShareInterestGroupRequest(org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest unShareInterestGroupRequest);
    
    /**
     * Appends and returns a new empty "UnShareInterestGroupRequest" element
     */
    org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest addNewUnShareInterestGroupRequest();
    
    /**
     * An XML UnShareInterestGroupRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public interface UnShareInterestGroupRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnShareInterestGroupRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("unshareinterestgrouprequest4260elemtype");
        
        /**
         * Gets the "InterestGroupID" element
         */
        java.lang.String getInterestGroupID();
        
        /**
         * Gets (as xml) the "InterestGroupID" element
         */
        org.apache.xmlbeans.XmlString xgetInterestGroupID();
        
        /**
         * Sets the "InterestGroupID" element
         */
        void setInterestGroupID(java.lang.String interestGroupID);
        
        /**
         * Sets (as xml) the "InterestGroupID" element
         */
        void xsetInterestGroupID(org.apache.xmlbeans.XmlString interestGroupID);
        
        /**
         * Gets the "CoreName" element
         */
        java.lang.String getCoreName();
        
        /**
         * Gets (as xml) the "CoreName" element
         */
        org.apache.xmlbeans.XmlString xgetCoreName();
        
        /**
         * Sets the "CoreName" element
         */
        void setCoreName(java.lang.String coreName);
        
        /**
         * Sets (as xml) the "CoreName" element
         */
        void xsetCoreName(org.apache.xmlbeans.XmlString coreName);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest newInstance() {
              return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument newInstance() {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.interestGroupService.UnShareInterestGroupRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
