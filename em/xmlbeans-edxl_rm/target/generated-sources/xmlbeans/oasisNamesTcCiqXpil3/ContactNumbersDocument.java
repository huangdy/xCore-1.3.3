/*
 * An XML document type.
 * Localname: ContactNumbers
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.ContactNumbersDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one ContactNumbers(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface ContactNumbersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactNumbersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("contactnumbersdfc7doctype");
    
    /**
     * Gets the "ContactNumbers" element
     */
    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers getContactNumbers();
    
    /**
     * Sets the "ContactNumbers" element
     */
    void setContactNumbers(oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers contactNumbers);
    
    /**
     * Appends and returns a new empty "ContactNumbers" element
     */
    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers addNewContactNumbers();
    
    /**
     * An XML ContactNumbers(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface ContactNumbers extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactNumbers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("contactnumbers0a41elemtype");
        
        /**
         * Gets array of all "ContactNumber" elements
         */
        oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber[] getContactNumberArray();
        
        /**
         * Gets ith "ContactNumber" element
         */
        oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber getContactNumberArray(int i);
        
        /**
         * Returns number of "ContactNumber" element
         */
        int sizeOfContactNumberArray();
        
        /**
         * Sets array of all "ContactNumber" element
         */
        void setContactNumberArray(oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber[] contactNumberArray);
        
        /**
         * Sets ith "ContactNumber" element
         */
        void setContactNumberArray(int i, oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber contactNumber);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ContactNumber" element
         */
        oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber insertNewContactNumber(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ContactNumber" element
         */
        oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber addNewContactNumber();
        
        /**
         * Removes the ith "ContactNumber" element
         */
        void removeContactNumber(int i);
        
        /**
         * An XML ContactNumber(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public interface ContactNumber extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("contactnumber1416elemtype");
            
            /**
             * Gets array of all "ContactNumberElement" elements
             */
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement[] getContactNumberElementArray();
            
            /**
             * Gets ith "ContactNumberElement" element
             */
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement getContactNumberElementArray(int i);
            
            /**
             * Returns number of "ContactNumberElement" element
             */
            int sizeOfContactNumberElementArray();
            
            /**
             * Sets array of all "ContactNumberElement" element
             */
            void setContactNumberElementArray(oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement[] contactNumberElementArray);
            
            /**
             * Sets ith "ContactNumberElement" element
             */
            void setContactNumberElementArray(int i, oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement contactNumberElement);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ContactNumberElement" element
             */
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement insertNewContactNumberElement(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ContactNumberElement" element
             */
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement addNewContactNumberElement();
            
            /**
             * Removes the ith "ContactNumberElement" element
             */
            void removeContactNumberElement(int i);
            
            /**
             * Gets the "CommunicationMediaType" attribute
             */
            oasisNamesTcCiqXpil3.CommunicationMediaTypeList.Enum getCommunicationMediaType();
            
            /**
             * Gets (as xml) the "CommunicationMediaType" attribute
             */
            oasisNamesTcCiqXpil3.CommunicationMediaTypeList xgetCommunicationMediaType();
            
            /**
             * True if has "CommunicationMediaType" attribute
             */
            boolean isSetCommunicationMediaType();
            
            /**
             * Sets the "CommunicationMediaType" attribute
             */
            void setCommunicationMediaType(oasisNamesTcCiqXpil3.CommunicationMediaTypeList.Enum communicationMediaType);
            
            /**
             * Sets (as xml) the "CommunicationMediaType" attribute
             */
            void xsetCommunicationMediaType(oasisNamesTcCiqXpil3.CommunicationMediaTypeList communicationMediaType);
            
            /**
             * Unsets the "CommunicationMediaType" attribute
             */
            void unsetCommunicationMediaType();
            
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
             * Gets the "Usage" attribute
             */
            java.lang.String getUsage();
            
            /**
             * Gets (as xml) the "Usage" attribute
             */
            oasisNamesTcCiqXpil3.ContactNumberUsageList xgetUsage();
            
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
            void xsetUsage(oasisNamesTcCiqXpil3.ContactNumberUsageList usage);
            
            /**
             * Unsets the "Usage" attribute
             */
            void unsetUsage();
            
            /**
             * Gets the "ContactHours" attribute
             */
            java.lang.String getContactHours();
            
            /**
             * Gets (as xml) the "ContactHours" attribute
             */
            oasisNamesTcCiqCt3.String xgetContactHours();
            
            /**
             * True if has "ContactHours" attribute
             */
            boolean isSetContactHours();
            
            /**
             * Sets the "ContactHours" attribute
             */
            void setContactHours(java.lang.String contactHours);
            
            /**
             * Sets (as xml) the "ContactHours" attribute
             */
            void xsetContactHours(oasisNamesTcCiqCt3.String contactHours);
            
            /**
             * Unsets the "ContactHours" attribute
             */
            void unsetContactHours();
            
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
             * An XML ContactNumberElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.ContactNumbersDocument$ContactNumbers$ContactNumber$ContactNumberElement.
             */
            public interface ContactNumberElement extends oasisNamesTcCiqCt3.String
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactNumberElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("contactnumberelement6605elemtype");
                
                /**
                 * Gets the "Type" attribute
                 */
                oasisNamesTcCiqXpil3.ContactNumberElementList.Enum getType();
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                oasisNamesTcCiqXpil3.ContactNumberElementList xgetType();
                
                /**
                 * True if has "Type" attribute
                 */
                boolean isSetType();
                
                /**
                 * Sets the "Type" attribute
                 */
                void setType(oasisNamesTcCiqXpil3.ContactNumberElementList.Enum type);
                
                /**
                 * Sets (as xml) the "Type" attribute
                 */
                void xsetType(oasisNamesTcCiqXpil3.ContactNumberElementList type);
                
                /**
                 * Unsets the "Type" attribute
                 */
                void unsetType();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement newInstance() {
                      return (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber newInstance() {
                  return (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers newInstance() {
              return (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument newInstance() {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.ContactNumbersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.ContactNumbersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
