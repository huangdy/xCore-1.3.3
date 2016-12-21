/*
 * An XML document type.
 * Localname: PostalLabel
 * Namespace: urn:oasis:names:tc:ciq:xnal:3
 * Java type: oasisNamesTcCiqXnal3.PostalLabelDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnal3;


/**
 * A document containing one PostalLabel(@urn:oasis:names:tc:ciq:xnal:3) element.
 *
 * This is a complex type.
 */
public interface PostalLabelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostalLabelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("postallabela0dadoctype");
    
    /**
     * Gets the "PostalLabel" element
     */
    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel getPostalLabel();
    
    /**
     * Sets the "PostalLabel" element
     */
    void setPostalLabel(oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel postalLabel);
    
    /**
     * Appends and returns a new empty "PostalLabel" element
     */
    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel addNewPostalLabel();
    
    /**
     * An XML PostalLabel(@urn:oasis:names:tc:ciq:xnal:3).
     *
     * This is a complex type.
     */
    public interface PostalLabel extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostalLabel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("postallabel0e8felemtype");
        
        /**
         * Gets array of all "Addressee" elements
         */
        oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee[] getAddresseeArray();
        
        /**
         * Gets ith "Addressee" element
         */
        oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee getAddresseeArray(int i);
        
        /**
         * Returns number of "Addressee" element
         */
        int sizeOfAddresseeArray();
        
        /**
         * Sets array of all "Addressee" element
         */
        void setAddresseeArray(oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee[] addresseeArray);
        
        /**
         * Sets ith "Addressee" element
         */
        void setAddresseeArray(int i, oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee addressee);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Addressee" element
         */
        oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee insertNewAddressee(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Addressee" element
         */
        oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee addNewAddressee();
        
        /**
         * Removes the ith "Addressee" element
         */
        void removeAddressee(int i);
        
        /**
         * Gets the "Address" element
         */
        oasisNamesTcCiqXal3.AddressType getAddress();
        
        /**
         * Sets the "Address" element
         */
        void setAddress(oasisNamesTcCiqXal3.AddressType address);
        
        /**
         * Appends and returns a new empty "Address" element
         */
        oasisNamesTcCiqXal3.AddressType addNewAddress();
        
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
         * An XML Addressee(@urn:oasis:names:tc:ciq:xnal:3).
         *
         * This is a complex type.
         */
        public interface Addressee extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Addressee.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("addresseeb46felemtype");
            
            /**
             * Gets array of all "Designation" elements
             */
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation[] getDesignationArray();
            
            /**
             * Gets ith "Designation" element
             */
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation getDesignationArray(int i);
            
            /**
             * Returns number of "Designation" element
             */
            int sizeOfDesignationArray();
            
            /**
             * Sets array of all "Designation" element
             */
            void setDesignationArray(oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation[] designationArray);
            
            /**
             * Sets ith "Designation" element
             */
            void setDesignationArray(int i, oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation designation);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Designation" element
             */
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation insertNewDesignation(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Designation" element
             */
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation addNewDesignation();
            
            /**
             * Removes the ith "Designation" element
             */
            void removeDesignation(int i);
            
            /**
             * Gets the "PartyName" element
             */
            oasisNamesTcCiqXnl3.PartyNameType getPartyName();
            
            /**
             * True if has "PartyName" element
             */
            boolean isSetPartyName();
            
            /**
             * Sets the "PartyName" element
             */
            void setPartyName(oasisNamesTcCiqXnl3.PartyNameType partyName);
            
            /**
             * Appends and returns a new empty "PartyName" element
             */
            oasisNamesTcCiqXnl3.PartyNameType addNewPartyName();
            
            /**
             * Unsets the "PartyName" element
             */
            void unsetPartyName();
            
            /**
             * Gets array of all "DependencyName" elements
             */
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName[] getDependencyNameArray();
            
            /**
             * Gets ith "DependencyName" element
             */
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName getDependencyNameArray(int i);
            
            /**
             * Returns number of "DependencyName" element
             */
            int sizeOfDependencyNameArray();
            
            /**
             * Sets array of all "DependencyName" element
             */
            void setDependencyNameArray(oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName[] dependencyNameArray);
            
            /**
             * Sets ith "DependencyName" element
             */
            void setDependencyNameArray(int i, oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName dependencyName);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DependencyName" element
             */
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName insertNewDependencyName(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DependencyName" element
             */
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName addNewDependencyName();
            
            /**
             * Removes the ith "DependencyName" element
             */
            void removeDependencyName(int i);
            
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
             * An XML Designation(@urn:oasis:names:tc:ciq:xnal:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXnal3.PostalLabelDocument$PostalLabel$Addressee$Designation.
             */
            public interface Designation extends oasisNamesTcCiqCt3.String
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Designation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("designation4e72elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation newInstance() {
                      return (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML DependencyName(@urn:oasis:names:tc:ciq:xnal:3).
             *
             * This is a complex type.
             */
            public interface DependencyName extends oasisNamesTcCiqXnl3.PartyNameType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DependencyName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("dependencyname8621elemtype");
                
                /**
                 * Gets the "Type" attribute
                 */
                java.lang.String getType2();
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                oasisNamesTcCiqXnal3.DependencyTypeList xgetType2();
                
                /**
                 * Sets the "Type" attribute
                 */
                void setType2(java.lang.String type2);
                
                /**
                 * Sets (as xml) the "Type" attribute
                 */
                void xsetType2(oasisNamesTcCiqXnal3.DependencyTypeList type2);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName newInstance() {
                      return (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee newInstance() {
                  return (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel newInstance() {
              return (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXnal3.PostalLabelDocument newInstance() {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnal3.PostalLabelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnal3.PostalLabelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
