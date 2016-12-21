/*
 * An XML document type.
 * Localname: PersonInfo
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.PersonInfoDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one PersonInfo(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface PersonInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("personinfo6620doctype");
    
    /**
     * Gets the "PersonInfo" element
     */
    oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo getPersonInfo();
    
    /**
     * Sets the "PersonInfo" element
     */
    void setPersonInfo(oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo personInfo);
    
    /**
     * Appends and returns a new empty "PersonInfo" element
     */
    oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo addNewPersonInfo();
    
    /**
     * An XML PersonInfo(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface PersonInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("personinfob861elemtype");
        
        /**
         * Gets the "Age" attribute
         */
        java.lang.String getAge();
        
        /**
         * Gets (as xml) the "Age" attribute
         */
        oasisNamesTcCiqCt3.String xgetAge();
        
        /**
         * True if has "Age" attribute
         */
        boolean isSetAge();
        
        /**
         * Sets the "Age" attribute
         */
        void setAge(java.lang.String age);
        
        /**
         * Sets (as xml) the "Age" attribute
         */
        void xsetAge(oasisNamesTcCiqCt3.String age);
        
        /**
         * Unsets the "Age" attribute
         */
        void unsetAge();
        
        /**
         * Gets the "CategoryType" attribute
         */
        oasisNamesTcCiqXpil3.PersonCategoryTypeList.Enum getCategoryType();
        
        /**
         * Gets (as xml) the "CategoryType" attribute
         */
        oasisNamesTcCiqXpil3.PersonCategoryTypeList xgetCategoryType();
        
        /**
         * True if has "CategoryType" attribute
         */
        boolean isSetCategoryType();
        
        /**
         * Sets the "CategoryType" attribute
         */
        void setCategoryType(oasisNamesTcCiqXpil3.PersonCategoryTypeList.Enum categoryType);
        
        /**
         * Sets (as xml) the "CategoryType" attribute
         */
        void xsetCategoryType(oasisNamesTcCiqXpil3.PersonCategoryTypeList categoryType);
        
        /**
         * Unsets the "CategoryType" attribute
         */
        void unsetCategoryType();
        
        /**
         * Gets the "PhysicalStatus" attribute
         */
        java.lang.String getPhysicalStatus();
        
        /**
         * Gets (as xml) the "PhysicalStatus" attribute
         */
        oasisNamesTcCiqXpil3.PhysicalStatusList xgetPhysicalStatus();
        
        /**
         * True if has "PhysicalStatus" attribute
         */
        boolean isSetPhysicalStatus();
        
        /**
         * Sets the "PhysicalStatus" attribute
         */
        void setPhysicalStatus(java.lang.String physicalStatus);
        
        /**
         * Sets (as xml) the "PhysicalStatus" attribute
         */
        void xsetPhysicalStatus(oasisNamesTcCiqXpil3.PhysicalStatusList physicalStatus);
        
        /**
         * Unsets the "PhysicalStatus" attribute
         */
        void unsetPhysicalStatus();
        
        /**
         * Gets the "MaritalStatus" attribute
         */
        java.lang.String getMaritalStatus();
        
        /**
         * Gets (as xml) the "MaritalStatus" attribute
         */
        oasisNamesTcCiqXpil3.MaritalStatusList xgetMaritalStatus();
        
        /**
         * True if has "MaritalStatus" attribute
         */
        boolean isSetMaritalStatus();
        
        /**
         * Sets the "MaritalStatus" attribute
         */
        void setMaritalStatus(java.lang.String maritalStatus);
        
        /**
         * Sets (as xml) the "MaritalStatus" attribute
         */
        void xsetMaritalStatus(oasisNamesTcCiqXpil3.MaritalStatusList maritalStatus);
        
        /**
         * Unsets the "MaritalStatus" attribute
         */
        void unsetMaritalStatus();
        
        /**
         * Gets the "Ethnicity" attribute
         */
        java.lang.String getEthnicity();
        
        /**
         * Gets (as xml) the "Ethnicity" attribute
         */
        oasisNamesTcCiqXpil3.PersonEthnicityList xgetEthnicity();
        
        /**
         * True if has "Ethnicity" attribute
         */
        boolean isSetEthnicity();
        
        /**
         * Sets the "Ethnicity" attribute
         */
        void setEthnicity(java.lang.String ethnicity);
        
        /**
         * Sets (as xml) the "Ethnicity" attribute
         */
        void xsetEthnicity(oasisNamesTcCiqXpil3.PersonEthnicityList ethnicity);
        
        /**
         * Unsets the "Ethnicity" attribute
         */
        void unsetEthnicity();
        
        /**
         * Gets the "Gender" attribute
         */
        java.lang.String getGender();
        
        /**
         * Gets (as xml) the "Gender" attribute
         */
        oasisNamesTcCiqXpil3.GenderList xgetGender();
        
        /**
         * True if has "Gender" attribute
         */
        boolean isSetGender();
        
        /**
         * Sets the "Gender" attribute
         */
        void setGender(java.lang.String gender);
        
        /**
         * Sets (as xml) the "Gender" attribute
         */
        void xsetGender(oasisNamesTcCiqXpil3.GenderList gender);
        
        /**
         * Unsets the "Gender" attribute
         */
        void unsetGender();
        
        /**
         * Gets the "Religion" attribute
         */
        java.lang.String getReligion();
        
        /**
         * Gets (as xml) the "Religion" attribute
         */
        oasisNamesTcCiqXpil3.ReligionList xgetReligion();
        
        /**
         * True if has "Religion" attribute
         */
        boolean isSetReligion();
        
        /**
         * Sets the "Religion" attribute
         */
        void setReligion(java.lang.String religion);
        
        /**
         * Sets (as xml) the "Religion" attribute
         */
        void xsetReligion(oasisNamesTcCiqXpil3.ReligionList religion);
        
        /**
         * Unsets the "Religion" attribute
         */
        void unsetReligion();
        
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
            public static oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo newInstance() {
              return (oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.PersonInfoDocument newInstance() {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.PersonInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.PersonInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
