/*
 * An XML document type.
 * Localname: Record
 * Namespace: urn:oasis:names:tc:ciq:xnal:3
 * Java type: oasisNamesTcCiqXnal3.RecordDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnal3;


/**
 * A document containing one Record(@urn:oasis:names:tc:ciq:xnal:3) element.
 *
 * This is a complex type.
 */
public interface RecordDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("record8ed4doctype");
    
    /**
     * Gets the "Record" element
     */
    oasisNamesTcCiqXnal3.RecordDocument.Record getRecord();
    
    /**
     * Sets the "Record" element
     */
    void setRecord(oasisNamesTcCiqXnal3.RecordDocument.Record record);
    
    /**
     * Appends and returns a new empty "Record" element
     */
    oasisNamesTcCiqXnal3.RecordDocument.Record addNewRecord();
    
    /**
     * An XML Record(@urn:oasis:names:tc:ciq:xnal:3).
     *
     * This is a complex type.
     */
    public interface Record extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Record.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("record5b27elemtype");
        
        /**
         * Gets array of all "PartyName" elements
         */
        oasisNamesTcCiqXnl3.PartyNameType[] getPartyNameArray();
        
        /**
         * Gets ith "PartyName" element
         */
        oasisNamesTcCiqXnl3.PartyNameType getPartyNameArray(int i);
        
        /**
         * Returns number of "PartyName" element
         */
        int sizeOfPartyNameArray();
        
        /**
         * Sets array of all "PartyName" element
         */
        void setPartyNameArray(oasisNamesTcCiqXnl3.PartyNameType[] partyNameArray);
        
        /**
         * Sets ith "PartyName" element
         */
        void setPartyNameArray(int i, oasisNamesTcCiqXnl3.PartyNameType partyName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PartyName" element
         */
        oasisNamesTcCiqXnl3.PartyNameType insertNewPartyName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PartyName" element
         */
        oasisNamesTcCiqXnl3.PartyNameType addNewPartyName();
        
        /**
         * Removes the ith "PartyName" element
         */
        void removePartyName(int i);
        
        /**
         * Gets array of all "Address" elements
         */
        oasisNamesTcCiqXal3.AddressType[] getAddressArray();
        
        /**
         * Gets ith "Address" element
         */
        oasisNamesTcCiqXal3.AddressType getAddressArray(int i);
        
        /**
         * Returns number of "Address" element
         */
        int sizeOfAddressArray();
        
        /**
         * Sets array of all "Address" element
         */
        void setAddressArray(oasisNamesTcCiqXal3.AddressType[] addressArray);
        
        /**
         * Sets ith "Address" element
         */
        void setAddressArray(int i, oasisNamesTcCiqXal3.AddressType address);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Address" element
         */
        oasisNamesTcCiqXal3.AddressType insertNewAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Address" element
         */
        oasisNamesTcCiqXal3.AddressType addNewAddress();
        
        /**
         * Removes the ith "Address" element
         */
        void removeAddress(int i);
        
        /**
         * Gets the "RecordID" attribute
         */
        java.lang.String getRecordID();
        
        /**
         * Gets (as xml) the "RecordID" attribute
         */
        oasisNamesTcCiqCt3.String xgetRecordID();
        
        /**
         * True if has "RecordID" attribute
         */
        boolean isSetRecordID();
        
        /**
         * Sets the "RecordID" attribute
         */
        void setRecordID(java.lang.String recordID);
        
        /**
         * Sets (as xml) the "RecordID" attribute
         */
        void xsetRecordID(oasisNamesTcCiqCt3.String recordID);
        
        /**
         * Unsets the "RecordID" attribute
         */
        void unsetRecordID();
        
        /**
         * Gets the "RecordIDType" attribute
         */
        java.lang.String getRecordIDType();
        
        /**
         * Gets (as xml) the "RecordIDType" attribute
         */
        oasisNamesTcCiqXnal3.RecordIDTypeList xgetRecordIDType();
        
        /**
         * True if has "RecordIDType" attribute
         */
        boolean isSetRecordIDType();
        
        /**
         * Sets the "RecordIDType" attribute
         */
        void setRecordIDType(java.lang.String recordIDType);
        
        /**
         * Sets (as xml) the "RecordIDType" attribute
         */
        void xsetRecordIDType(oasisNamesTcCiqXnal3.RecordIDTypeList recordIDType);
        
        /**
         * Unsets the "RecordIDType" attribute
         */
        void unsetRecordIDType();
        
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
         * Gets the "RecordKey" attribute
         */
        java.lang.String getRecordKey();
        
        /**
         * Gets (as xml) the "RecordKey" attribute
         */
        oasisNamesTcCiqCt3.String xgetRecordKey();
        
        /**
         * True if has "RecordKey" attribute
         */
        boolean isSetRecordKey();
        
        /**
         * Sets the "RecordKey" attribute
         */
        void setRecordKey(java.lang.String recordKey);
        
        /**
         * Sets (as xml) the "RecordKey" attribute
         */
        void xsetRecordKey(oasisNamesTcCiqCt3.String recordKey);
        
        /**
         * Unsets the "RecordKey" attribute
         */
        void unsetRecordKey();
        
        /**
         * Gets the "RecordKeyRef" attribute
         */
        java.lang.String getRecordKeyRef();
        
        /**
         * Gets (as xml) the "RecordKeyRef" attribute
         */
        oasisNamesTcCiqCt3.String xgetRecordKeyRef();
        
        /**
         * True if has "RecordKeyRef" attribute
         */
        boolean isSetRecordKeyRef();
        
        /**
         * Sets the "RecordKeyRef" attribute
         */
        void setRecordKeyRef(java.lang.String recordKeyRef);
        
        /**
         * Sets (as xml) the "RecordKeyRef" attribute
         */
        void xsetRecordKeyRef(oasisNamesTcCiqCt3.String recordKeyRef);
        
        /**
         * Unsets the "RecordKeyRef" attribute
         */
        void unsetRecordKeyRef();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXnal3.RecordDocument.Record newInstance() {
              return (oasisNamesTcCiqXnal3.RecordDocument.Record) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXnal3.RecordDocument.Record newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXnal3.RecordDocument.Record) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXnal3.RecordDocument newInstance() {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXnal3.RecordDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnal3.RecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnal3.RecordDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnal3.RecordDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
