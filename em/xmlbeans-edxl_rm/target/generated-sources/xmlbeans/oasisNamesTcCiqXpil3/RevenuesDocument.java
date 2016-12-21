/*
 * An XML document type.
 * Localname: Revenues
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.RevenuesDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one Revenues(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface RevenuesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RevenuesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("revenues2394doctype");
    
    /**
     * Gets the "Revenues" element
     */
    oasisNamesTcCiqXpil3.RevenuesDocument.Revenues getRevenues();
    
    /**
     * Sets the "Revenues" element
     */
    void setRevenues(oasisNamesTcCiqXpil3.RevenuesDocument.Revenues revenues);
    
    /**
     * Appends and returns a new empty "Revenues" element
     */
    oasisNamesTcCiqXpil3.RevenuesDocument.Revenues addNewRevenues();
    
    /**
     * An XML Revenues(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface Revenues extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Revenues.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("revenues9061elemtype");
        
        /**
         * Gets array of all "Revenue" elements
         */
        oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue[] getRevenueArray();
        
        /**
         * Gets ith "Revenue" element
         */
        oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue getRevenueArray(int i);
        
        /**
         * Returns number of "Revenue" element
         */
        int sizeOfRevenueArray();
        
        /**
         * Sets array of all "Revenue" element
         */
        void setRevenueArray(oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue[] revenueArray);
        
        /**
         * Sets ith "Revenue" element
         */
        void setRevenueArray(int i, oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue revenue);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Revenue" element
         */
        oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue insertNewRevenue(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Revenue" element
         */
        oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue addNewRevenue();
        
        /**
         * Removes the ith "Revenue" element
         */
        void removeRevenue(int i);
        
        /**
         * An XML Revenue(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.RevenuesDocument$Revenues$Revenue.
         */
        public interface Revenue extends org.apache.xmlbeans.XmlDecimal
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Revenue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("revenue24c9elemtype");
            
            /**
             * Gets the "CurrencyCode" attribute
             */
            java.lang.String getCurrencyCode();
            
            /**
             * Gets (as xml) the "CurrencyCode" attribute
             */
            oasisNamesTcCiqXpil3.RevenueCurrencyCodeList xgetCurrencyCode();
            
            /**
             * True if has "CurrencyCode" attribute
             */
            boolean isSetCurrencyCode();
            
            /**
             * Sets the "CurrencyCode" attribute
             */
            void setCurrencyCode(java.lang.String currencyCode);
            
            /**
             * Sets (as xml) the "CurrencyCode" attribute
             */
            void xsetCurrencyCode(oasisNamesTcCiqXpil3.RevenueCurrencyCodeList currencyCode);
            
            /**
             * Unsets the "CurrencyCode" attribute
             */
            void unsetCurrencyCode();
            
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
             * Gets the "PeriodFrom" attribute
             */
            java.util.Calendar getPeriodFrom();
            
            /**
             * Gets (as xml) the "PeriodFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetPeriodFrom();
            
            /**
             * True if has "PeriodFrom" attribute
             */
            boolean isSetPeriodFrom();
            
            /**
             * Sets the "PeriodFrom" attribute
             */
            void setPeriodFrom(java.util.Calendar periodFrom);
            
            /**
             * Sets (as xml) the "PeriodFrom" attribute
             */
            void xsetPeriodFrom(org.apache.xmlbeans.XmlDateTime periodFrom);
            
            /**
             * Unsets the "PeriodFrom" attribute
             */
            void unsetPeriodFrom();
            
            /**
             * Gets the "PeriodTo" attribute
             */
            java.util.Calendar getPeriodTo();
            
            /**
             * Gets (as xml) the "PeriodTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetPeriodTo();
            
            /**
             * True if has "PeriodTo" attribute
             */
            boolean isSetPeriodTo();
            
            /**
             * Sets the "PeriodTo" attribute
             */
            void setPeriodTo(java.util.Calendar periodTo);
            
            /**
             * Sets (as xml) the "PeriodTo" attribute
             */
            void xsetPeriodTo(org.apache.xmlbeans.XmlDateTime periodTo);
            
            /**
             * Unsets the "PeriodTo" attribute
             */
            void unsetPeriodTo();
            
            /**
             * Gets the "Type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.RevenueTypeList xgetType();
            
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
            void xsetType(oasisNamesTcCiqXpil3.RevenueTypeList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
            /**
             * Gets the "Precision" attribute
             */
            java.math.BigDecimal getPrecision();
            
            /**
             * Gets (as xml) the "Precision" attribute
             */
            oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision xgetPrecision();
            
            /**
             * True if has "Precision" attribute
             */
            boolean isSetPrecision();
            
            /**
             * Sets the "Precision" attribute
             */
            void setPrecision(java.math.BigDecimal precision);
            
            /**
             * Sets (as xml) the "Precision" attribute
             */
            void xsetPrecision(oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision precision);
            
            /**
             * Unsets the "Precision" attribute
             */
            void unsetPrecision();
            
            /**
             * Gets the "Source" attribute
             */
            java.lang.String getSource();
            
            /**
             * Gets (as xml) the "Source" attribute
             */
            oasisNamesTcCiqXpil3.RevenueSourceList xgetSource();
            
            /**
             * True if has "Source" attribute
             */
            boolean isSetSource();
            
            /**
             * Sets the "Source" attribute
             */
            void setSource(java.lang.String source);
            
            /**
             * Sets (as xml) the "Source" attribute
             */
            void xsetSource(oasisNamesTcCiqXpil3.RevenueSourceList source);
            
            /**
             * Unsets the "Source" attribute
             */
            void unsetSource();
            
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
             * Gets the "AfterTax" attribute
             */
            boolean getAfterTax();
            
            /**
             * Gets (as xml) the "AfterTax" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetAfterTax();
            
            /**
             * True if has "AfterTax" attribute
             */
            boolean isSetAfterTax();
            
            /**
             * Sets the "AfterTax" attribute
             */
            void setAfterTax(boolean afterTax);
            
            /**
             * Sets (as xml) the "AfterTax" attribute
             */
            void xsetAfterTax(org.apache.xmlbeans.XmlBoolean afterTax);
            
            /**
             * Unsets the "AfterTax" attribute
             */
            void unsetAfterTax();
            
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
             * An XML Precision(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.RevenuesDocument$Revenues$Revenue$Precision.
             */
            public interface Precision extends org.apache.xmlbeans.XmlDecimal
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Precision.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("precision4a1fattrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision newValue(java.lang.Object obj) {
                      return (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision) type.newValue( obj ); }
                    
                    public static oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision newInstance() {
                      return (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue newInstance() {
                  return (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.RevenuesDocument.Revenues newInstance() {
              return (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.RevenuesDocument.Revenues newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.RevenuesDocument newInstance() {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.RevenuesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.RevenuesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
