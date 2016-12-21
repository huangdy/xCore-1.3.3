/*
 * An XML document type.
 * Localname: FreeTextLines
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.FreeTextLinesDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one FreeTextLines(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface FreeTextLinesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FreeTextLinesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("freetextlines4431doctype");
    
    /**
     * Gets the "FreeTextLines" element
     */
    oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines getFreeTextLines();
    
    /**
     * Sets the "FreeTextLines" element
     */
    void setFreeTextLines(oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines freeTextLines);
    
    /**
     * Appends and returns a new empty "FreeTextLines" element
     */
    oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines addNewFreeTextLines();
    
    /**
     * An XML FreeTextLines(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface FreeTextLines extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FreeTextLines.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("freetextlines63c3elemtype");
        
        /**
         * Gets array of all "FreeTextLine" elements
         */
        oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine[] getFreeTextLineArray();
        
        /**
         * Gets ith "FreeTextLine" element
         */
        oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine getFreeTextLineArray(int i);
        
        /**
         * Returns number of "FreeTextLine" element
         */
        int sizeOfFreeTextLineArray();
        
        /**
         * Sets array of all "FreeTextLine" element
         */
        void setFreeTextLineArray(oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine[] freeTextLineArray);
        
        /**
         * Sets ith "FreeTextLine" element
         */
        void setFreeTextLineArray(int i, oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine freeTextLine);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FreeTextLine" element
         */
        oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine insertNewFreeTextLine(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FreeTextLine" element
         */
        oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine addNewFreeTextLine();
        
        /**
         * Removes the ith "FreeTextLine" element
         */
        void removeFreeTextLine(int i);
        
        /**
         * An XML FreeTextLine(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.FreeTextLinesDocument$FreeTextLines$FreeTextLine.
         */
        public interface FreeTextLine extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FreeTextLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("freetextline1c0celemtype");
            
            /**
             * Gets the "Type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.FreeTextLineTypeList xgetType();
            
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
            void xsetType(oasisNamesTcCiqXpil3.FreeTextLineTypeList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
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
                public static oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine newInstance() {
                  return (oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines.FreeTextLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines newInstance() {
              return (oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument newInstance() {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.FreeTextLinesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.FreeTextLinesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
