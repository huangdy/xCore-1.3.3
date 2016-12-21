/*
 * XML Type:  PremisesType
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.PremisesType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3;


/**
 * An XML PremisesType(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is a complex type.
 */
public interface PremisesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PremisesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("premisestypec3c7type");
    
    /**
     * Gets array of all "NameElement" elements
     */
    oasisNamesTcCiqXal3.PremisesType.NameElement[] getNameElementArray();
    
    /**
     * Gets ith "NameElement" element
     */
    oasisNamesTcCiqXal3.PremisesType.NameElement getNameElementArray(int i);
    
    /**
     * Returns number of "NameElement" element
     */
    int sizeOfNameElementArray();
    
    /**
     * Sets array of all "NameElement" element
     */
    void setNameElementArray(oasisNamesTcCiqXal3.PremisesType.NameElement[] nameElementArray);
    
    /**
     * Sets ith "NameElement" element
     */
    void setNameElementArray(int i, oasisNamesTcCiqXal3.PremisesType.NameElement nameElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
     */
    oasisNamesTcCiqXal3.PremisesType.NameElement insertNewNameElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameElement" element
     */
    oasisNamesTcCiqXal3.PremisesType.NameElement addNewNameElement();
    
    /**
     * Removes the ith "NameElement" element
     */
    void removeNameElement(int i);
    
    /**
     * Gets array of all "Number" elements
     */
    oasisNamesTcCiqXal3.IdentifierType[] getNumberArray();
    
    /**
     * Gets ith "Number" element
     */
    oasisNamesTcCiqXal3.IdentifierType getNumberArray(int i);
    
    /**
     * Returns number of "Number" element
     */
    int sizeOfNumberArray();
    
    /**
     * Sets array of all "Number" element
     */
    void setNumberArray(oasisNamesTcCiqXal3.IdentifierType[] numberArray);
    
    /**
     * Sets ith "Number" element
     */
    void setNumberArray(int i, oasisNamesTcCiqXal3.IdentifierType number);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Number" element
     */
    oasisNamesTcCiqXal3.IdentifierType insertNewNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Number" element
     */
    oasisNamesTcCiqXal3.IdentifierType addNewNumber();
    
    /**
     * Removes the ith "Number" element
     */
    void removeNumber(int i);
    
    /**
     * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.PremisesType$NameElement.
     */
    public interface NameElement extends oasisNamesTcCiqXal3.NameType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("nameelement4684elemtype");
        
        /**
         * Gets the "NameType" attribute
         */
        oasisNamesTcCiqXal3.PremisesElementTypeList.Enum getNameType();
        
        /**
         * Gets (as xml) the "NameType" attribute
         */
        oasisNamesTcCiqXal3.PremisesElementTypeList xgetNameType();
        
        /**
         * True if has "NameType" attribute
         */
        boolean isSetNameType();
        
        /**
         * Sets the "NameType" attribute
         */
        void setNameType(oasisNamesTcCiqXal3.PremisesElementTypeList.Enum nameType);
        
        /**
         * Sets (as xml) the "NameType" attribute
         */
        void xsetNameType(oasisNamesTcCiqXal3.PremisesElementTypeList nameType);
        
        /**
         * Unsets the "NameType" attribute
         */
        void unsetNameType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXal3.PremisesType.NameElement newInstance() {
              return (oasisNamesTcCiqXal3.PremisesType.NameElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXal3.PremisesType.NameElement newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXal3.PremisesType.NameElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXal3.PremisesType newInstance() {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXal3.PremisesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXal3.PremisesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXal3.PremisesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXal3.PremisesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.PremisesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXal3.PremisesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXal3.PremisesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
