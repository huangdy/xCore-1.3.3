/*
 * XML Type:  PersonNameType
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.PersonNameType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3;


/**
 * An XML PersonNameType(@urn:oasis:names:tc:ciq:xnl:3).
 *
 * This is a complex type.
 */
public interface PersonNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("personnametype179ctype");
    
    /**
     * Gets array of all "NameElement" elements
     */
    oasisNamesTcCiqXnl3.PersonNameType.NameElement[] getNameElementArray();
    
    /**
     * Gets ith "NameElement" element
     */
    oasisNamesTcCiqXnl3.PersonNameType.NameElement getNameElementArray(int i);
    
    /**
     * Returns number of "NameElement" element
     */
    int sizeOfNameElementArray();
    
    /**
     * Sets array of all "NameElement" element
     */
    void setNameElementArray(oasisNamesTcCiqXnl3.PersonNameType.NameElement[] nameElementArray);
    
    /**
     * Sets ith "NameElement" element
     */
    void setNameElementArray(int i, oasisNamesTcCiqXnl3.PersonNameType.NameElement nameElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
     */
    oasisNamesTcCiqXnl3.PersonNameType.NameElement insertNewNameElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameElement" element
     */
    oasisNamesTcCiqXnl3.PersonNameType.NameElement addNewNameElement();
    
    /**
     * Removes the ith "NameElement" element
     */
    void removeNameElement(int i);
    
    /**
     * Gets the "Type" attribute
     */
    oasisNamesTcCiqXnl3.PersonNameTypeList.Enum getType();
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    oasisNamesTcCiqXnl3.PersonNameTypeList xgetType();
    
    /**
     * True if has "Type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" attribute
     */
    void setType(oasisNamesTcCiqXnl3.PersonNameTypeList.Enum type);
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    void xsetType(oasisNamesTcCiqXnl3.PersonNameTypeList type);
    
    /**
     * Unsets the "Type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "PersonID" attribute
     */
    java.lang.String getPersonID();
    
    /**
     * Gets (as xml) the "PersonID" attribute
     */
    oasisNamesTcCiqCt3.String xgetPersonID();
    
    /**
     * True if has "PersonID" attribute
     */
    boolean isSetPersonID();
    
    /**
     * Sets the "PersonID" attribute
     */
    void setPersonID(java.lang.String personID);
    
    /**
     * Sets (as xml) the "PersonID" attribute
     */
    void xsetPersonID(oasisNamesTcCiqCt3.String personID);
    
    /**
     * Unsets the "PersonID" attribute
     */
    void unsetPersonID();
    
    /**
     * Gets the "PersonIDType" attribute
     */
    java.lang.String getPersonIDType();
    
    /**
     * Gets (as xml) the "PersonIDType" attribute
     */
    oasisNamesTcCiqXnl3.PersonIDTypeList xgetPersonIDType();
    
    /**
     * True if has "PersonIDType" attribute
     */
    boolean isSetPersonIDType();
    
    /**
     * Sets the "PersonIDType" attribute
     */
    void setPersonIDType(java.lang.String personIDType);
    
    /**
     * Sets (as xml) the "PersonIDType" attribute
     */
    void xsetPersonIDType(oasisNamesTcCiqXnl3.PersonIDTypeList personIDType);
    
    /**
     * Unsets the "PersonIDType" attribute
     */
    void unsetPersonIDType();
    
    /**
     * Gets the "ID" attribute
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    oasisNamesTcCiqCt3.String xgetID();
    
    /**
     * True if has "ID" attribute
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(oasisNamesTcCiqCt3.String id);
    
    /**
     * Unsets the "ID" attribute
     */
    void unsetID();
    
    /**
     * Gets the "Usage" attribute
     */
    java.lang.String getUsage();
    
    /**
     * Gets (as xml) the "Usage" attribute
     */
    oasisNamesTcCiqXnl3.PersonNameUsageList xgetUsage();
    
    /**
     * True if has "Usage" attribute
     */
    boolean isSetUsage();
    
    /**
     * Sets the "Usage" attribute
     */
    void setUsage(java.lang.String usage);
    
    /**
     * Sets (as xml) the "Usage" attribute
     */
    void xsetUsage(oasisNamesTcCiqXnl3.PersonNameUsageList usage);
    
    /**
     * Unsets the "Usage" attribute
     */
    void unsetUsage();
    
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
     * Gets the "DateValidFrom" attribute
     */
    java.util.Calendar getDateValidFrom();
    
    /**
     * Gets (as xml) the "DateValidFrom" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDateValidFrom();
    
    /**
     * True if has "DateValidFrom" attribute
     */
    boolean isSetDateValidFrom();
    
    /**
     * Sets the "DateValidFrom" attribute
     */
    void setDateValidFrom(java.util.Calendar dateValidFrom);
    
    /**
     * Sets (as xml) the "DateValidFrom" attribute
     */
    void xsetDateValidFrom(org.apache.xmlbeans.XmlDateTime dateValidFrom);
    
    /**
     * Unsets the "DateValidFrom" attribute
     */
    void unsetDateValidFrom();
    
    /**
     * Gets the "DateValidTo" attribute
     */
    java.util.Calendar getDateValidTo();
    
    /**
     * Gets (as xml) the "DateValidTo" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDateValidTo();
    
    /**
     * True if has "DateValidTo" attribute
     */
    boolean isSetDateValidTo();
    
    /**
     * Sets the "DateValidTo" attribute
     */
    void setDateValidTo(java.util.Calendar dateValidTo);
    
    /**
     * Sets (as xml) the "DateValidTo" attribute
     */
    void xsetDateValidTo(org.apache.xmlbeans.XmlDateTime dateValidTo);
    
    /**
     * Unsets the "DateValidTo" attribute
     */
    void unsetDateValidTo();
    
    /**
     * Gets the "NameKey" attribute
     */
    java.lang.String getNameKey();
    
    /**
     * Gets (as xml) the "NameKey" attribute
     */
    oasisNamesTcCiqCt3.String xgetNameKey();
    
    /**
     * True if has "NameKey" attribute
     */
    boolean isSetNameKey();
    
    /**
     * Sets the "NameKey" attribute
     */
    void setNameKey(java.lang.String nameKey);
    
    /**
     * Sets (as xml) the "NameKey" attribute
     */
    void xsetNameKey(oasisNamesTcCiqCt3.String nameKey);
    
    /**
     * Unsets the "NameKey" attribute
     */
    void unsetNameKey();
    
    /**
     * Gets the "NameKeyRef" attribute
     */
    java.lang.String getNameKeyRef();
    
    /**
     * Gets (as xml) the "NameKeyRef" attribute
     */
    oasisNamesTcCiqCt3.String xgetNameKeyRef();
    
    /**
     * True if has "NameKeyRef" attribute
     */
    boolean isSetNameKeyRef();
    
    /**
     * Sets the "NameKeyRef" attribute
     */
    void setNameKeyRef(java.lang.String nameKeyRef);
    
    /**
     * Sets (as xml) the "NameKeyRef" attribute
     */
    void xsetNameKeyRef(oasisNamesTcCiqCt3.String nameKeyRef);
    
    /**
     * Unsets the "NameKeyRef" attribute
     */
    void unsetNameKeyRef();
    
    /**
     * Gets the "type" attribute
     */
    org.w3.x1999.xlink1.TypeAttribute.Type.Enum getType2();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.w3.x1999.xlink1.TypeAttribute.Type xgetType2();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType2();
    
    /**
     * Sets the "type" attribute
     */
    void setType2(org.w3.x1999.xlink1.TypeAttribute.Type.Enum type2);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType2(org.w3.x1999.xlink1.TypeAttribute.Type type2);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType2();
    
    /**
     * Gets the "label" attribute
     */
    java.lang.String getLabel();
    
    /**
     * Gets (as xml) the "label" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetLabel();
    
    /**
     * True if has "label" attribute
     */
    boolean isSetLabel();
    
    /**
     * Sets the "label" attribute
     */
    void setLabel(java.lang.String label);
    
    /**
     * Sets (as xml) the "label" attribute
     */
    void xsetLabel(org.apache.xmlbeans.XmlNCName label);
    
    /**
     * Unsets the "label" attribute
     */
    void unsetLabel();
    
    /**
     * Gets the "href" attribute
     */
    java.lang.String getHref();
    
    /**
     * Gets (as xml) the "href" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetHref();
    
    /**
     * True if has "href" attribute
     */
    boolean isSetHref();
    
    /**
     * Sets the "href" attribute
     */
    void setHref(java.lang.String href);
    
    /**
     * Sets (as xml) the "href" attribute
     */
    void xsetHref(org.apache.xmlbeans.XmlAnyURI href);
    
    /**
     * Unsets the "href" attribute
     */
    void unsetHref();
    
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
     * Gets the "LanguageCode" attribute
     */
    java.lang.String getLanguageCode();
    
    /**
     * Gets (as xml) the "LanguageCode" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLanguageCode();
    
    /**
     * True if has "LanguageCode" attribute
     */
    boolean isSetLanguageCode();
    
    /**
     * Sets the "LanguageCode" attribute
     */
    void setLanguageCode(java.lang.String languageCode);
    
    /**
     * Sets (as xml) the "LanguageCode" attribute
     */
    void xsetLanguageCode(org.apache.xmlbeans.XmlLanguage languageCode);
    
    /**
     * Unsets the "LanguageCode" attribute
     */
    void unsetLanguageCode();
    
    /**
     * An XML NameElement(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXnl3.PersonNameType$NameElement.
     */
    public interface NameElement extends oasisNamesTcCiqCt3.String
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("nameelementdf19elemtype");
        
        /**
         * Gets the "ElementType" attribute
         */
        oasisNamesTcCiqXnl3.PersonNameElementList.Enum getElementType();
        
        /**
         * Gets (as xml) the "ElementType" attribute
         */
        oasisNamesTcCiqXnl3.PersonNameElementList xgetElementType();
        
        /**
         * True if has "ElementType" attribute
         */
        boolean isSetElementType();
        
        /**
         * Sets the "ElementType" attribute
         */
        void setElementType(oasisNamesTcCiqXnl3.PersonNameElementList.Enum elementType);
        
        /**
         * Sets (as xml) the "ElementType" attribute
         */
        void xsetElementType(oasisNamesTcCiqXnl3.PersonNameElementList elementType);
        
        /**
         * Unsets the "ElementType" attribute
         */
        void unsetElementType();
        
        /**
         * Gets the "Abbreviation" attribute
         */
        boolean getAbbreviation();
        
        /**
         * Gets (as xml) the "Abbreviation" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetAbbreviation();
        
        /**
         * True if has "Abbreviation" attribute
         */
        boolean isSetAbbreviation();
        
        /**
         * Sets the "Abbreviation" attribute
         */
        void setAbbreviation(boolean abbreviation);
        
        /**
         * Sets (as xml) the "Abbreviation" attribute
         */
        void xsetAbbreviation(org.apache.xmlbeans.XmlBoolean abbreviation);
        
        /**
         * Unsets the "Abbreviation" attribute
         */
        void unsetAbbreviation();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXnl3.PersonNameType.NameElement newInstance() {
              return (oasisNamesTcCiqXnl3.PersonNameType.NameElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXnl3.PersonNameType.NameElement newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXnl3.PersonNameType.NameElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXnl3.PersonNameType newInstance() {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PersonNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.PersonNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.PersonNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.PersonNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
