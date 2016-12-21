/*
 * XML Type:  LogisticsSectionType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.LogisticsSectionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203;


/**
 * An XML LogisticsSectionType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public interface LogisticsSectionType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LogisticsSectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("logisticssectiontype8b9atype");
    
    /**
     * Gets the "Chief" element
     */
    java.lang.String getChief();
    
    /**
     * Gets (as xml) the "Chief" element
     */
    org.apache.xmlbeans.XmlString xgetChief();
    
    /**
     * Sets the "Chief" element
     */
    void setChief(java.lang.String chief);
    
    /**
     * Sets (as xml) the "Chief" element
     */
    void xsetChief(org.apache.xmlbeans.XmlString chief);
    
    /**
     * Gets the "Deputy" element
     */
    java.lang.String getDeputy();
    
    /**
     * Gets (as xml) the "Deputy" element
     */
    org.apache.xmlbeans.XmlString xgetDeputy();
    
    /**
     * Sets the "Deputy" element
     */
    void setDeputy(java.lang.String deputy);
    
    /**
     * Sets (as xml) the "Deputy" element
     */
    void xsetDeputy(org.apache.xmlbeans.XmlString deputy);
    
    /**
     * Gets the "SupportBranch" element
     */
    org.uicds.icsForm203.LogisticsSectionType.SupportBranch getSupportBranch();
    
    /**
     * Sets the "SupportBranch" element
     */
    void setSupportBranch(org.uicds.icsForm203.LogisticsSectionType.SupportBranch supportBranch);
    
    /**
     * Appends and returns a new empty "SupportBranch" element
     */
    org.uicds.icsForm203.LogisticsSectionType.SupportBranch addNewSupportBranch();
    
    /**
     * Gets the "ServiceBranch" element
     */
    org.uicds.icsForm203.LogisticsSectionType.ServiceBranch getServiceBranch();
    
    /**
     * Sets the "ServiceBranch" element
     */
    void setServiceBranch(org.uicds.icsForm203.LogisticsSectionType.ServiceBranch serviceBranch);
    
    /**
     * Appends and returns a new empty "ServiceBranch" element
     */
    org.uicds.icsForm203.LogisticsSectionType.ServiceBranch addNewServiceBranch();
    
    /**
     * An XML SupportBranch(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public interface SupportBranch extends gov.niem.niem.structures.x20.ComplexObjectType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SupportBranch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("supportbranch1fddelemtype");
        
        /**
         * Gets the "Director" element
         */
        java.lang.String getDirector();
        
        /**
         * Gets (as xml) the "Director" element
         */
        org.apache.xmlbeans.XmlString xgetDirector();
        
        /**
         * Sets the "Director" element
         */
        void setDirector(java.lang.String director);
        
        /**
         * Sets (as xml) the "Director" element
         */
        void xsetDirector(org.apache.xmlbeans.XmlString director);
        
        /**
         * Gets the "SupplyUnit" element
         */
        java.lang.String getSupplyUnit();
        
        /**
         * Gets (as xml) the "SupplyUnit" element
         */
        org.apache.xmlbeans.XmlString xgetSupplyUnit();
        
        /**
         * Sets the "SupplyUnit" element
         */
        void setSupplyUnit(java.lang.String supplyUnit);
        
        /**
         * Sets (as xml) the "SupplyUnit" element
         */
        void xsetSupplyUnit(org.apache.xmlbeans.XmlString supplyUnit);
        
        /**
         * Gets the "FacilitiesUnit" element
         */
        java.lang.String getFacilitiesUnit();
        
        /**
         * Gets (as xml) the "FacilitiesUnit" element
         */
        org.apache.xmlbeans.XmlString xgetFacilitiesUnit();
        
        /**
         * Sets the "FacilitiesUnit" element
         */
        void setFacilitiesUnit(java.lang.String facilitiesUnit);
        
        /**
         * Sets (as xml) the "FacilitiesUnit" element
         */
        void xsetFacilitiesUnit(org.apache.xmlbeans.XmlString facilitiesUnit);
        
        /**
         * Gets the "GroundSupportUnit" element
         */
        java.lang.String getGroundSupportUnit();
        
        /**
         * Gets (as xml) the "GroundSupportUnit" element
         */
        org.apache.xmlbeans.XmlString xgetGroundSupportUnit();
        
        /**
         * Sets the "GroundSupportUnit" element
         */
        void setGroundSupportUnit(java.lang.String groundSupportUnit);
        
        /**
         * Sets (as xml) the "GroundSupportUnit" element
         */
        void xsetGroundSupportUnit(org.apache.xmlbeans.XmlString groundSupportUnit);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm203.LogisticsSectionType.SupportBranch newInstance() {
              return (org.uicds.icsForm203.LogisticsSectionType.SupportBranch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm203.LogisticsSectionType.SupportBranch newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm203.LogisticsSectionType.SupportBranch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ServiceBranch(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public interface ServiceBranch extends gov.niem.niem.structures.x20.ComplexObjectType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceBranch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("servicebranch5fb7elemtype");
        
        /**
         * Gets the "Director" element
         */
        java.lang.String getDirector();
        
        /**
         * Gets (as xml) the "Director" element
         */
        org.apache.xmlbeans.XmlString xgetDirector();
        
        /**
         * Sets the "Director" element
         */
        void setDirector(java.lang.String director);
        
        /**
         * Sets (as xml) the "Director" element
         */
        void xsetDirector(org.apache.xmlbeans.XmlString director);
        
        /**
         * Gets the "CommunicationsUnit" element
         */
        java.lang.String getCommunicationsUnit();
        
        /**
         * Gets (as xml) the "CommunicationsUnit" element
         */
        org.apache.xmlbeans.XmlString xgetCommunicationsUnit();
        
        /**
         * Sets the "CommunicationsUnit" element
         */
        void setCommunicationsUnit(java.lang.String communicationsUnit);
        
        /**
         * Sets (as xml) the "CommunicationsUnit" element
         */
        void xsetCommunicationsUnit(org.apache.xmlbeans.XmlString communicationsUnit);
        
        /**
         * Gets the "MedicalUnit" element
         */
        java.lang.String getMedicalUnit();
        
        /**
         * Gets (as xml) the "MedicalUnit" element
         */
        org.apache.xmlbeans.XmlString xgetMedicalUnit();
        
        /**
         * Sets the "MedicalUnit" element
         */
        void setMedicalUnit(java.lang.String medicalUnit);
        
        /**
         * Sets (as xml) the "MedicalUnit" element
         */
        void xsetMedicalUnit(org.apache.xmlbeans.XmlString medicalUnit);
        
        /**
         * Gets the "FoodUnit" element
         */
        java.lang.String getFoodUnit();
        
        /**
         * Gets (as xml) the "FoodUnit" element
         */
        org.apache.xmlbeans.XmlString xgetFoodUnit();
        
        /**
         * Sets the "FoodUnit" element
         */
        void setFoodUnit(java.lang.String foodUnit);
        
        /**
         * Sets (as xml) the "FoodUnit" element
         */
        void xsetFoodUnit(org.apache.xmlbeans.XmlString foodUnit);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm203.LogisticsSectionType.ServiceBranch newInstance() {
              return (org.uicds.icsForm203.LogisticsSectionType.ServiceBranch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm203.LogisticsSectionType.ServiceBranch newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm203.LogisticsSectionType.ServiceBranch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm203.LogisticsSectionType newInstance() {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm203.LogisticsSectionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.LogisticsSectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.LogisticsSectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.LogisticsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
