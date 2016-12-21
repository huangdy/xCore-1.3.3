/*
 * XML Type:  AgreementType
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.AgreementType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService;


/**
 * An XML AgreementType(@http://uicds.org/AgreementService).
 *
 * This is a complex type.
 */
public interface AgreementType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AgreementType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("agreementtype8513type");
    
    /**
     * Gets the "Principals" element
     */
    org.uicds.agreementService.AgreementType.Principals getPrincipals();
    
    /**
     * Sets the "Principals" element
     */
    void setPrincipals(org.uicds.agreementService.AgreementType.Principals principals);
    
    /**
     * Appends and returns a new empty "Principals" element
     */
    org.uicds.agreementService.AgreementType.Principals addNewPrincipals();
    
    /**
     * Gets the "ShareRules" element
     */
    org.uicds.agreementService.AgreementType.ShareRules getShareRules();
    
    /**
     * Tests for nil "ShareRules" element
     */
    boolean isNilShareRules();
    
    /**
     * Sets the "ShareRules" element
     */
    void setShareRules(org.uicds.agreementService.AgreementType.ShareRules shareRules);
    
    /**
     * Appends and returns a new empty "ShareRules" element
     */
    org.uicds.agreementService.AgreementType.ShareRules addNewShareRules();
    
    /**
     * Nils the "ShareRules" element
     */
    void setNilShareRules();
    
    /**
     * An XML Principals(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public interface Principals extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Principals.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("principals8f94elemtype");
        
        /**
         * Gets the "LocalCore" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType getLocalCore();
        
        /**
         * Sets the "LocalCore" element
         */
        void setLocalCore(com.saic.precis.x2009.x06.base.IdentifierType localCore);
        
        /**
         * Appends and returns a new empty "LocalCore" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType addNewLocalCore();
        
        /**
         * Gets the "RemoteCore" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType getRemoteCore();
        
        /**
         * Sets the "RemoteCore" element
         */
        void setRemoteCore(com.saic.precis.x2009.x06.base.IdentifierType remoteCore);
        
        /**
         * Appends and returns a new empty "RemoteCore" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType addNewRemoteCore();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.agreementService.AgreementType.Principals newInstance() {
              return (org.uicds.agreementService.AgreementType.Principals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.agreementService.AgreementType.Principals newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.agreementService.AgreementType.Principals) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ShareRules(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public interface ShareRules extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareRules.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("sharerules3b27elemtype");
        
        /**
         * Gets array of all "ShareRule" elements
         */
        org.uicds.agreementService.AgreementType.ShareRules.ShareRule[] getShareRuleArray();
        
        /**
         * Gets ith "ShareRule" element
         */
        org.uicds.agreementService.AgreementType.ShareRules.ShareRule getShareRuleArray(int i);
        
        /**
         * Returns number of "ShareRule" element
         */
        int sizeOfShareRuleArray();
        
        /**
         * Sets array of all "ShareRule" element
         */
        void setShareRuleArray(org.uicds.agreementService.AgreementType.ShareRules.ShareRule[] shareRuleArray);
        
        /**
         * Sets ith "ShareRule" element
         */
        void setShareRuleArray(int i, org.uicds.agreementService.AgreementType.ShareRules.ShareRule shareRule);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ShareRule" element
         */
        org.uicds.agreementService.AgreementType.ShareRules.ShareRule insertNewShareRule(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ShareRule" element
         */
        org.uicds.agreementService.AgreementType.ShareRules.ShareRule addNewShareRule();
        
        /**
         * Removes the ith "ShareRule" element
         */
        void removeShareRule(int i);
        
        /**
         * Gets the "enabled" attribute
         */
        boolean getEnabled();
        
        /**
         * Gets (as xml) the "enabled" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetEnabled();
        
        /**
         * Sets the "enabled" attribute
         */
        void setEnabled(boolean enabled);
        
        /**
         * Sets (as xml) the "enabled" attribute
         */
        void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled);
        
        /**
         * An XML ShareRule(@http://uicds.org/AgreementService).
         *
         * This is a complex type.
         */
        public interface ShareRule extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ShareRule.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("sharerule0880elemtype");
            
            /**
             * Gets the "Condition" element
             */
            org.uicds.agreementService.ConditionType getCondition();
            
            /**
             * Sets the "Condition" element
             */
            void setCondition(org.uicds.agreementService.ConditionType condition);
            
            /**
             * Appends and returns a new empty "Condition" element
             */
            org.uicds.agreementService.ConditionType addNewCondition();
            
            /**
             * Gets the "WorkProducts" element
             */
            org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts getWorkProducts();
            
            /**
             * True if has "WorkProducts" element
             */
            boolean isSetWorkProducts();
            
            /**
             * Sets the "WorkProducts" element
             */
            void setWorkProducts(org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts workProducts);
            
            /**
             * Appends and returns a new empty "WorkProducts" element
             */
            org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts addNewWorkProducts();
            
            /**
             * Unsets the "WorkProducts" element
             */
            void unsetWorkProducts();
            
            /**
             * Gets the "id" attribute
             */
            java.lang.String getId();
            
            /**
             * Gets (as xml) the "id" attribute
             */
            org.apache.xmlbeans.XmlID xgetId();
            
            /**
             * Sets the "id" attribute
             */
            void setId(java.lang.String id);
            
            /**
             * Sets (as xml) the "id" attribute
             */
            void xsetId(org.apache.xmlbeans.XmlID id);
            
            /**
             * Gets the "enabled" attribute
             */
            boolean getEnabled();
            
            /**
             * Gets (as xml) the "enabled" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetEnabled();
            
            /**
             * Sets the "enabled" attribute
             */
            void setEnabled(boolean enabled);
            
            /**
             * Sets (as xml) the "enabled" attribute
             */
            void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled);
            
            /**
             * An XML WorkProducts(@http://uicds.org/AgreementService).
             *
             * This is a complex type.
             */
            public interface WorkProducts extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkProducts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("workproducts4f8felemtype");
                
                /**
                 * Gets array of all "Type" elements
                 */
                com.saic.precis.x2009.x06.base.CodespaceValueType[] getTypeArray();
                
                /**
                 * Gets ith "Type" element
                 */
                com.saic.precis.x2009.x06.base.CodespaceValueType getTypeArray(int i);
                
                /**
                 * Returns number of "Type" element
                 */
                int sizeOfTypeArray();
                
                /**
                 * Sets array of all "Type" element
                 */
                void setTypeArray(com.saic.precis.x2009.x06.base.CodespaceValueType[] typeArray);
                
                /**
                 * Sets ith "Type" element
                 */
                void setTypeArray(int i, com.saic.precis.x2009.x06.base.CodespaceValueType type);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Type" element
                 */
                com.saic.precis.x2009.x06.base.CodespaceValueType insertNewType(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Type" element
                 */
                com.saic.precis.x2009.x06.base.CodespaceValueType addNewType();
                
                /**
                 * Removes the ith "Type" element
                 */
                void removeType(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts newInstance() {
                      return (org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.uicds.agreementService.AgreementType.ShareRules.ShareRule newInstance() {
                  return (org.uicds.agreementService.AgreementType.ShareRules.ShareRule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.uicds.agreementService.AgreementType.ShareRules.ShareRule newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.uicds.agreementService.AgreementType.ShareRules.ShareRule) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.agreementService.AgreementType.ShareRules newInstance() {
              return (org.uicds.agreementService.AgreementType.ShareRules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.agreementService.AgreementType.ShareRules newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.agreementService.AgreementType.ShareRules) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.agreementService.AgreementType newInstance() {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.agreementService.AgreementType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.agreementService.AgreementType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.agreementService.AgreementType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.agreementService.AgreementType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.agreementService.AgreementType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.agreementService.AgreementType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.agreementService.AgreementType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.agreementService.AgreementType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.agreementService.AgreementType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.agreementService.AgreementType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.agreementService.AgreementType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.agreementService.AgreementType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.agreementService.AgreementType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.agreementService.AgreementType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.agreementService.AgreementType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.agreementService.AgreementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.agreementService.AgreementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.agreementService.AgreementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
