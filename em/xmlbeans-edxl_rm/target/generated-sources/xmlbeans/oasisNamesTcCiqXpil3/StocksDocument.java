/*
 * An XML document type.
 * Localname: Stocks
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.StocksDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one Stocks(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface StocksDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StocksDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("stocks339adoctype");
    
    /**
     * Gets the "Stocks" element
     */
    oasisNamesTcCiqXpil3.StocksDocument.Stocks getStocks();
    
    /**
     * Sets the "Stocks" element
     */
    void setStocks(oasisNamesTcCiqXpil3.StocksDocument.Stocks stocks);
    
    /**
     * Appends and returns a new empty "Stocks" element
     */
    oasisNamesTcCiqXpil3.StocksDocument.Stocks addNewStocks();
    
    /**
     * An XML Stocks(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface Stocks extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Stocks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("stocks92a1elemtype");
        
        /**
         * Gets array of all "Stock" elements
         */
        oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock[] getStockArray();
        
        /**
         * Gets ith "Stock" element
         */
        oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock getStockArray(int i);
        
        /**
         * Returns number of "Stock" element
         */
        int sizeOfStockArray();
        
        /**
         * Sets array of all "Stock" element
         */
        void setStockArray(oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock[] stockArray);
        
        /**
         * Sets ith "Stock" element
         */
        void setStockArray(int i, oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock stock);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Stock" element
         */
        oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock insertNewStock(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Stock" element
         */
        oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock addNewStock();
        
        /**
         * Removes the ith "Stock" element
         */
        void removeStock(int i);
        
        /**
         * An XML Stock(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public interface Stock extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Stock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("stock2403elemtype");
            
            /**
             * Gets the "ListedCode" attribute
             */
            java.lang.String getListedCode();
            
            /**
             * Gets (as xml) the "ListedCode" attribute
             */
            oasisNamesTcCiqCt3.String xgetListedCode();
            
            /**
             * True if has "ListedCode" attribute
             */
            boolean isSetListedCode();
            
            /**
             * Sets the "ListedCode" attribute
             */
            void setListedCode(java.lang.String listedCode);
            
            /**
             * Sets (as xml) the "ListedCode" attribute
             */
            void xsetListedCode(oasisNamesTcCiqCt3.String listedCode);
            
            /**
             * Unsets the "ListedCode" attribute
             */
            void unsetListedCode();
            
            /**
             * Gets the "MarketName" attribute
             */
            java.lang.String getMarketName();
            
            /**
             * Gets (as xml) the "MarketName" attribute
             */
            oasisNamesTcCiqCt3.String xgetMarketName();
            
            /**
             * True if has "MarketName" attribute
             */
            boolean isSetMarketName();
            
            /**
             * Sets the "MarketName" attribute
             */
            void setMarketName(java.lang.String marketName);
            
            /**
             * Sets (as xml) the "MarketName" attribute
             */
            void xsetMarketName(oasisNamesTcCiqCt3.String marketName);
            
            /**
             * Unsets the "MarketName" attribute
             */
            void unsetMarketName();
            
            /**
             * Gets the "CountryName" attribute
             */
            java.lang.String getCountryName();
            
            /**
             * Gets (as xml) the "CountryName" attribute
             */
            oasisNamesTcCiqCt3.String xgetCountryName();
            
            /**
             * True if has "CountryName" attribute
             */
            boolean isSetCountryName();
            
            /**
             * Sets the "CountryName" attribute
             */
            void setCountryName(java.lang.String countryName);
            
            /**
             * Sets (as xml) the "CountryName" attribute
             */
            void xsetCountryName(oasisNamesTcCiqCt3.String countryName);
            
            /**
             * Unsets the "CountryName" attribute
             */
            void unsetCountryName();
            
            /**
             * Gets the "InvestedDate" attribute
             */
            java.util.Calendar getInvestedDate();
            
            /**
             * Gets (as xml) the "InvestedDate" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetInvestedDate();
            
            /**
             * True if has "InvestedDate" attribute
             */
            boolean isSetInvestedDate();
            
            /**
             * Sets the "InvestedDate" attribute
             */
            void setInvestedDate(java.util.Calendar investedDate);
            
            /**
             * Sets (as xml) the "InvestedDate" attribute
             */
            void xsetInvestedDate(org.apache.xmlbeans.XmlDateTime investedDate);
            
            /**
             * Unsets the "InvestedDate" attribute
             */
            void unsetInvestedDate();
            
            /**
             * Gets the "ShareQuantity" attribute
             */
            java.lang.String getShareQuantity();
            
            /**
             * Gets (as xml) the "ShareQuantity" attribute
             */
            oasisNamesTcCiqCt3.String xgetShareQuantity();
            
            /**
             * True if has "ShareQuantity" attribute
             */
            boolean isSetShareQuantity();
            
            /**
             * Sets the "ShareQuantity" attribute
             */
            void setShareQuantity(java.lang.String shareQuantity);
            
            /**
             * Sets (as xml) the "ShareQuantity" attribute
             */
            void xsetShareQuantity(oasisNamesTcCiqCt3.String shareQuantity);
            
            /**
             * Unsets the "ShareQuantity" attribute
             */
            void unsetShareQuantity();
            
            /**
             * Gets the "ListedDate" attribute
             */
            java.util.Calendar getListedDate();
            
            /**
             * Gets (as xml) the "ListedDate" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetListedDate();
            
            /**
             * True if has "ListedDate" attribute
             */
            boolean isSetListedDate();
            
            /**
             * Sets the "ListedDate" attribute
             */
            void setListedDate(java.util.Calendar listedDate);
            
            /**
             * Sets (as xml) the "ListedDate" attribute
             */
            void xsetListedDate(org.apache.xmlbeans.XmlDateTime listedDate);
            
            /**
             * Unsets the "ListedDate" attribute
             */
            void unsetListedDate();
            
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
                public static oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock newInstance() {
                  return (oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.StocksDocument.Stocks newInstance() {
              return (oasisNamesTcCiqXpil3.StocksDocument.Stocks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.StocksDocument.Stocks newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.StocksDocument.Stocks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.StocksDocument newInstance() {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.StocksDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.StocksDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.StocksDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.StocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
