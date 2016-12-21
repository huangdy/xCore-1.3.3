/*
 * An XML document type.
 * Localname: OrganisationInfo
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.OrganisationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one OrganisationInfo(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface OrganisationInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("organisationinfo53a5doctype");
    
    /**
     * Gets the "OrganisationInfo" element
     */
    oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo getOrganisationInfo();
    
    /**
     * Sets the "OrganisationInfo" element
     */
    void setOrganisationInfo(oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo organisationInfo);
    
    /**
     * Appends and returns a new empty "OrganisationInfo" element
     */
    oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo addNewOrganisationInfo();
    
    /**
     * An XML OrganisationInfo(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface OrganisationInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("organisationinfo5ec1elemtype");
        
        /**
         * Gets the "Type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        oasisNamesTcCiqXpil3.OrganisationInfoTypeList xgetType();
        
        /**
         * True if has "Type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "Type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        void xsetType(oasisNamesTcCiqXpil3.OrganisationInfoTypeList type);
        
        /**
         * Unsets the "Type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "CategoryType" attribute
         */
        oasisNamesTcCiqXpil3.OrganisationCategoryTypeList.Enum getCategoryType();
        
        /**
         * Gets (as xml) the "CategoryType" attribute
         */
        oasisNamesTcCiqXpil3.OrganisationCategoryTypeList xgetCategoryType();
        
        /**
         * True if has "CategoryType" attribute
         */
        boolean isSetCategoryType();
        
        /**
         * Sets the "CategoryType" attribute
         */
        void setCategoryType(oasisNamesTcCiqXpil3.OrganisationCategoryTypeList.Enum categoryType);
        
        /**
         * Sets (as xml) the "CategoryType" attribute
         */
        void xsetCategoryType(oasisNamesTcCiqXpil3.OrganisationCategoryTypeList categoryType);
        
        /**
         * Unsets the "CategoryType" attribute
         */
        void unsetCategoryType();
        
        /**
         * Gets the "Status" attribute
         */
        java.lang.String getStatus();
        
        /**
         * Gets (as xml) the "Status" attribute
         */
        oasisNamesTcCiqCt3.StatusList xgetStatus();
        
        /**
         * True if has "Status" attribute
         */
        boolean isSetStatus();
        
        /**
         * Sets the "Status" attribute
         */
        void setStatus(java.lang.String status);
        
        /**
         * Sets (as xml) the "Status" attribute
         */
        void xsetStatus(oasisNamesTcCiqCt3.StatusList status);
        
        /**
         * Unsets the "Status" attribute
         */
        void unsetStatus();
        
        /**
         * Gets the "Nature" attribute
         */
        java.lang.String getNature();
        
        /**
         * Gets (as xml) the "Nature" attribute
         */
        oasisNamesTcCiqXpil3.OrganisationInfoNatureList xgetNature();
        
        /**
         * True if has "Nature" attribute
         */
        boolean isSetNature();
        
        /**
         * Sets the "Nature" attribute
         */
        void setNature(java.lang.String nature);
        
        /**
         * Sets (as xml) the "Nature" attribute
         */
        void xsetNature(oasisNamesTcCiqXpil3.OrganisationInfoNatureList nature);
        
        /**
         * Unsets the "Nature" attribute
         */
        void unsetNature();
        
        /**
         * Gets the "IndustryType" attribute
         */
        java.lang.String getIndustryType();
        
        /**
         * Gets (as xml) the "IndustryType" attribute
         */
        oasisNamesTcCiqXpil3.IndustryTypeList xgetIndustryType();
        
        /**
         * True if has "IndustryType" attribute
         */
        boolean isSetIndustryType();
        
        /**
         * Sets the "IndustryType" attribute
         */
        void setIndustryType(java.lang.String industryType);
        
        /**
         * Sets (as xml) the "IndustryType" attribute
         */
        void xsetIndustryType(oasisNamesTcCiqXpil3.IndustryTypeList industryType);
        
        /**
         * Unsets the "IndustryType" attribute
         */
        void unsetIndustryType();
        
        /**
         * Gets the "IndustryCode" attribute
         */
        java.lang.String getIndustryCode();
        
        /**
         * Gets (as xml) the "IndustryCode" attribute
         */
        oasisNamesTcCiqXpil3.IndustryCodeList xgetIndustryCode();
        
        /**
         * True if has "IndustryCode" attribute
         */
        boolean isSetIndustryCode();
        
        /**
         * Sets the "IndustryCode" attribute
         */
        void setIndustryCode(java.lang.String industryCode);
        
        /**
         * Sets (as xml) the "IndustryCode" attribute
         */
        void xsetIndustryCode(oasisNamesTcCiqXpil3.IndustryCodeList industryCode);
        
        /**
         * Unsets the "IndustryCode" attribute
         */
        void unsetIndustryCode();
        
        /**
         * Gets the "IndustryCodeType" attribute
         */
        java.lang.String getIndustryCodeType();
        
        /**
         * Gets (as xml) the "IndustryCodeType" attribute
         */
        oasisNamesTcCiqCt3.String xgetIndustryCodeType();
        
        /**
         * True if has "IndustryCodeType" attribute
         */
        boolean isSetIndustryCodeType();
        
        /**
         * Sets the "IndustryCodeType" attribute
         */
        void setIndustryCodeType(java.lang.String industryCodeType);
        
        /**
         * Sets (as xml) the "IndustryCodeType" attribute
         */
        void xsetIndustryCodeType(oasisNamesTcCiqCt3.String industryCodeType);
        
        /**
         * Unsets the "IndustryCodeType" attribute
         */
        void unsetIndustryCodeType();
        
        /**
         * Gets the "NumberOfEmployees" attribute
         */
        java.lang.String getNumberOfEmployees();
        
        /**
         * Gets (as xml) the "NumberOfEmployees" attribute
         */
        oasisNamesTcCiqCt3.String xgetNumberOfEmployees();
        
        /**
         * True if has "NumberOfEmployees" attribute
         */
        boolean isSetNumberOfEmployees();
        
        /**
         * Sets the "NumberOfEmployees" attribute
         */
        void setNumberOfEmployees(java.lang.String numberOfEmployees);
        
        /**
         * Sets (as xml) the "NumberOfEmployees" attribute
         */
        void xsetNumberOfEmployees(oasisNamesTcCiqCt3.String numberOfEmployees);
        
        /**
         * Unsets the "NumberOfEmployees" attribute
         */
        void unsetNumberOfEmployees();
        
        /**
         * Gets the "OperatingHourStartTime" attribute
         */
        java.util.Calendar getOperatingHourStartTime();
        
        /**
         * Gets (as xml) the "OperatingHourStartTime" attribute
         */
        org.apache.xmlbeans.XmlTime xgetOperatingHourStartTime();
        
        /**
         * True if has "OperatingHourStartTime" attribute
         */
        boolean isSetOperatingHourStartTime();
        
        /**
         * Sets the "OperatingHourStartTime" attribute
         */
        void setOperatingHourStartTime(java.util.Calendar operatingHourStartTime);
        
        /**
         * Sets (as xml) the "OperatingHourStartTime" attribute
         */
        void xsetOperatingHourStartTime(org.apache.xmlbeans.XmlTime operatingHourStartTime);
        
        /**
         * Unsets the "OperatingHourStartTime" attribute
         */
        void unsetOperatingHourStartTime();
        
        /**
         * Gets the "OperatingHourEndTime" attribute
         */
        java.util.Calendar getOperatingHourEndTime();
        
        /**
         * Gets (as xml) the "OperatingHourEndTime" attribute
         */
        org.apache.xmlbeans.XmlTime xgetOperatingHourEndTime();
        
        /**
         * True if has "OperatingHourEndTime" attribute
         */
        boolean isSetOperatingHourEndTime();
        
        /**
         * Sets the "OperatingHourEndTime" attribute
         */
        void setOperatingHourEndTime(java.util.Calendar operatingHourEndTime);
        
        /**
         * Sets (as xml) the "OperatingHourEndTime" attribute
         */
        void xsetOperatingHourEndTime(org.apache.xmlbeans.XmlTime operatingHourEndTime);
        
        /**
         * Unsets the "OperatingHourEndTime" attribute
         */
        void unsetOperatingHourEndTime();
        
        /**
         * Gets the "DataQualityType" attribute
         */
        oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
        
        /**
         * True if has "DataQualityType" attribute
         */
        boolean isSetDataQualityType();
        
        /**
         * Sets the "DataQualityType" attribute
         */
        void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        void unsetDataQualityType();
        
        /**
         * Gets the "ValidFrom" attribute
         */
        java.util.Calendar getValidFrom();
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetValidFrom();
        
        /**
         * True if has "ValidFrom" attribute
         */
        boolean isSetValidFrom();
        
        /**
         * Sets the "ValidFrom" attribute
         */
        void setValidFrom(java.util.Calendar validFrom);
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        void unsetValidFrom();
        
        /**
         * Gets the "ValidTo" attribute
         */
        java.util.Calendar getValidTo();
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetValidTo();
        
        /**
         * True if has "ValidTo" attribute
         */
        boolean isSetValidTo();
        
        /**
         * Sets the "ValidTo" attribute
         */
        void setValidTo(java.util.Calendar validTo);
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
        
        /**
         * Unsets the "ValidTo" attribute
         */
        void unsetValidTo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo newInstance() {
              return (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument newInstance() {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.OrganisationInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.OrganisationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
