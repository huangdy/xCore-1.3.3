/*
 * An XML document type.
 * Localname: NameLine
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.NameLineDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3;


/**
 * A document containing one NameLine(@urn:oasis:names:tc:ciq:xnl:3) element.
 *
 * This is a complex type.
 */
public interface NameLineDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameLineDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("nameline4ca7doctype");
    
    /**
     * Gets the "NameLine" element
     */
    oasisNamesTcCiqXnl3.NameLineDocument.NameLine getNameLine();
    
    /**
     * Sets the "NameLine" element
     */
    void setNameLine(oasisNamesTcCiqXnl3.NameLineDocument.NameLine nameLine);
    
    /**
     * Appends and returns a new empty "NameLine" element
     */
    oasisNamesTcCiqXnl3.NameLineDocument.NameLine addNewNameLine();
    
    /**
     * An XML NameLine(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXnl3.NameLineDocument$NameLine.
     */
    public interface NameLine extends oasisNamesTcCiqCt3.String
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("namelinecb82elemtype");
        
        /**
         * Gets the "Type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        oasisNamesTcCiqXnl3.NameLineTypeList xgetType();
        
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
        void xsetType(oasisNamesTcCiqXnl3.NameLineTypeList type);
        
        /**
         * Unsets the "Type" attribute
         */
        void unsetType();
        
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
            public static oasisNamesTcCiqXnl3.NameLineDocument.NameLine newInstance() {
              return (oasisNamesTcCiqXnl3.NameLineDocument.NameLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXnl3.NameLineDocument.NameLine newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXnl3.NameLineDocument.NameLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXnl3.NameLineDocument newInstance() {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.NameLineDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.NameLineDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
