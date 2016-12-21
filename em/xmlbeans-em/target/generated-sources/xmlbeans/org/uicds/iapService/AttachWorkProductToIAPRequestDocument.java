/*
 * An XML document type.
 * Localname: AttachWorkProductToIAPRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.AttachWorkProductToIAPRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService;


/**
 * A document containing one AttachWorkProductToIAPRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public interface AttachWorkProductToIAPRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttachWorkProductToIAPRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("attachworkproducttoiaprequest59bcdoctype");
    
    /**
     * Gets the "AttachWorkProductToIAPRequest" element
     */
    org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest getAttachWorkProductToIAPRequest();
    
    /**
     * Sets the "AttachWorkProductToIAPRequest" element
     */
    void setAttachWorkProductToIAPRequest(org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest attachWorkProductToIAPRequest);
    
    /**
     * Appends and returns a new empty "AttachWorkProductToIAPRequest" element
     */
    org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest addNewAttachWorkProductToIAPRequest();
    
    /**
     * An XML AttachWorkProductToIAPRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public interface AttachWorkProductToIAPRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttachWorkProductToIAPRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("attachworkproducttoiaprequest3133elemtype");
        
        /**
         * Gets the "IAP" element
         */
        org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP getIAP();
        
        /**
         * Sets the "IAP" element
         */
        void setIAP(org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP iap);
        
        /**
         * Appends and returns a new empty "IAP" element
         */
        org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP addNewIAP();
        
        /**
         * Gets the "WorkProductList" element
         */
        org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList getWorkProductList();
        
        /**
         * Sets the "WorkProductList" element
         */
        void setWorkProductList(org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList workProductList);
        
        /**
         * Appends and returns a new empty "WorkProductList" element
         */
        org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList addNewWorkProductList();
        
        /**
         * An XML IAP(@http://uicds.org/IAPService).
         *
         * This is a complex type.
         */
        public interface IAP extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IAP.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("iap9dd7elemtype");
            
            /**
             * Gets the "WorkProductIdentification" element
             */
            com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification();
            
            /**
             * Sets the "WorkProductIdentification" element
             */
            void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification);
            
            /**
             * Appends and returns a new empty "WorkProductIdentification" element
             */
            com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP newInstance() {
                  return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML WorkProductList(@http://uicds.org/IAPService).
         *
         * This is a complex type.
         */
        public interface WorkProductList extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkProductList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("workproductlistafdbelemtype");
            
            /**
             * Gets array of all "WorkProductIdentification" elements
             */
            com.saic.precis.x2009.x06.base.IdentificationType[] getWorkProductIdentificationArray();
            
            /**
             * Gets ith "WorkProductIdentification" element
             */
            com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentificationArray(int i);
            
            /**
             * Returns number of "WorkProductIdentification" element
             */
            int sizeOfWorkProductIdentificationArray();
            
            /**
             * Sets array of all "WorkProductIdentification" element
             */
            void setWorkProductIdentificationArray(com.saic.precis.x2009.x06.base.IdentificationType[] workProductIdentificationArray);
            
            /**
             * Sets ith "WorkProductIdentification" element
             */
            void setWorkProductIdentificationArray(int i, com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "WorkProductIdentification" element
             */
            com.saic.precis.x2009.x06.base.IdentificationType insertNewWorkProductIdentification(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "WorkProductIdentification" element
             */
            com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification();
            
            /**
             * Removes the ith "WorkProductIdentification" element
             */
            void removeWorkProductIdentification(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList newInstance() {
                  return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest newInstance() {
              return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument newInstance() {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.iapService.AttachWorkProductToIAPRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.iapService.AttachWorkProductToIAPRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
