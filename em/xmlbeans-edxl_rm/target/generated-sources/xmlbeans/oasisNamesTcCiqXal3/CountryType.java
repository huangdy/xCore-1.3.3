/*
 * XML Type:  CountryType
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.CountryType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3;


/**
 * An XML CountryType(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is a complex type.
 */
public interface CountryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CountryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("countrytype0525type");
    
    /**
     * Gets array of all "NameElement" elements
     */
    oasisNamesTcCiqXal3.CountryType.NameElement[] getNameElementArray();
    
    /**
     * Gets ith "NameElement" element
     */
    oasisNamesTcCiqXal3.CountryType.NameElement getNameElementArray(int i);
    
    /**
     * Returns number of "NameElement" element
     */
    int sizeOfNameElementArray();
    
    /**
     * Sets array of all "NameElement" element
     */
    void setNameElementArray(oasisNamesTcCiqXal3.CountryType.NameElement[] nameElementArray);
    
    /**
     * Sets ith "NameElement" element
     */
    void setNameElementArray(int i, oasisNamesTcCiqXal3.CountryType.NameElement nameElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
     */
    oasisNamesTcCiqXal3.CountryType.NameElement insertNewNameElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameElement" element
     */
    oasisNamesTcCiqXal3.CountryType.NameElement addNewNameElement();
    
    /**
     * Removes the ith "NameElement" element
     */
    void removeNameElement(int i);
    
    /**
     * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.CountryType$NameElement.
     */
    public interface NameElement extends oasisNamesTcCiqXal3.NameType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("nameelementb6c8elemtype");
        
        /**
         * Gets the "NameType" attribute
         */
        oasisNamesTcCiqXal3.CountryNameTypeList.Enum getNameType();
        
        /**
         * Gets (as xml) the "NameType" attribute
         */
        oasisNamesTcCiqXal3.CountryNameTypeList xgetNameType();
        
        /**
         * True if has "NameType" attribute
         */
        boolean isSetNameType();
        
        /**
         * Sets the "NameType" attribute
         */
        void setNameType(oasisNamesTcCiqXal3.CountryNameTypeList.Enum nameType);
        
        /**
         * Sets (as xml) the "NameType" attribute
         */
        void xsetNameType(oasisNamesTcCiqXal3.CountryNameTypeList nameType);
        
        /**
         * Unsets the "NameType" attribute
         */
        void unsetNameType();
        
        /**
         * Gets the "NameCode" attribute
         */
        java.lang.String getNameCode();
        
        /**
         * Gets (as xml) the "NameCode" attribute
         */
        oasisNamesTcCiqXal3.CountryNameCodeList xgetNameCode();
        
        /**
         * True if has "NameCode" attribute
         */
        boolean isSetNameCode();
        
        /**
         * Sets the "NameCode" attribute
         */
        void setNameCode(java.lang.String nameCode);
        
        /**
         * Sets (as xml) the "NameCode" attribute
         */
        void xsetNameCode(oasisNamesTcCiqXal3.CountryNameCodeList nameCode);
        
        /**
         * Unsets the "NameCode" attribute
         */
        void unsetNameCode();
        
        /**
         * Gets the "NameCodeType" attribute
         */
        java.lang.String getNameCodeType();
        
        /**
         * Gets (as xml) the "NameCodeType" attribute
         */
        oasisNamesTcCiqCt3.String xgetNameCodeType();
        
        /**
         * True if has "NameCodeType" attribute
         */
        boolean isSetNameCodeType();
        
        /**
         * Sets the "NameCodeType" attribute
         */
        void setNameCodeType(java.lang.String nameCodeType);
        
        /**
         * Sets (as xml) the "NameCodeType" attribute
         */
        void xsetNameCodeType(oasisNamesTcCiqCt3.String nameCodeType);
        
        /**
         * Unsets the "NameCodeType" attribute
         */
        void unsetNameCodeType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXal3.CountryType.NameElement newInstance() {
              return (oasisNamesTcCiqXal3.CountryType.NameElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXal3.CountryType.NameElement newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXal3.CountryType.NameElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXal3.CountryType newInstance() {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXal3.CountryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXal3.CountryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXal3.CountryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXal3.CountryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.CountryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.CountryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.CountryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
