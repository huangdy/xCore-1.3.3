/*
 * An XML document type.
 * Localname: Languages
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.LanguagesDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one Languages(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface LanguagesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LanguagesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("languages8446doctype");
    
    /**
     * Gets the "Languages" element
     */
    oasisNamesTcCiqXpil3.LanguagesDocument.Languages getLanguages();
    
    /**
     * Sets the "Languages" element
     */
    void setLanguages(oasisNamesTcCiqXpil3.LanguagesDocument.Languages languages);
    
    /**
     * Appends and returns a new empty "Languages" element
     */
    oasisNamesTcCiqXpil3.LanguagesDocument.Languages addNewLanguages();
    
    /**
     * An XML Languages(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface Languages extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Languages.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("languagesadedelemtype");
        
        /**
         * Gets array of all "Language" elements
         */
        oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language[] getLanguageArray();
        
        /**
         * Gets ith "Language" element
         */
        oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language getLanguageArray(int i);
        
        /**
         * Returns number of "Language" element
         */
        int sizeOfLanguageArray();
        
        /**
         * Sets array of all "Language" element
         */
        void setLanguageArray(oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language[] languageArray);
        
        /**
         * Sets ith "Language" element
         */
        void setLanguageArray(int i, oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language language);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Language" element
         */
        oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language insertNewLanguage(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Language" element
         */
        oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language addNewLanguage();
        
        /**
         * Removes the ith "Language" element
         */
        void removeLanguage(int i);
        
        /**
         * An XML Language(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.LanguagesDocument$Languages$Language.
         */
        public interface Language extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Language.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("language3f01elemtype");
            
            /**
             * Gets the "Type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.LanguageTypeList xgetType();
            
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
            void xsetType(oasisNamesTcCiqXpil3.LanguageTypeList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
            /**
             * Gets the "Speak" attribute
             */
            oasisNamesTcCiqXpil3.LanguageSkillsList.Enum getSpeak();
            
            /**
             * Gets (as xml) the "Speak" attribute
             */
            oasisNamesTcCiqXpil3.LanguageSkillsList xgetSpeak();
            
            /**
             * True if has "Speak" attribute
             */
            boolean isSetSpeak();
            
            /**
             * Sets the "Speak" attribute
             */
            void setSpeak(oasisNamesTcCiqXpil3.LanguageSkillsList.Enum speak);
            
            /**
             * Sets (as xml) the "Speak" attribute
             */
            void xsetSpeak(oasisNamesTcCiqXpil3.LanguageSkillsList speak);
            
            /**
             * Unsets the "Speak" attribute
             */
            void unsetSpeak();
            
            /**
             * Gets the "Read" attribute
             */
            oasisNamesTcCiqXpil3.LanguageSkillsList.Enum getRead();
            
            /**
             * Gets (as xml) the "Read" attribute
             */
            oasisNamesTcCiqXpil3.LanguageSkillsList xgetRead();
            
            /**
             * True if has "Read" attribute
             */
            boolean isSetRead();
            
            /**
             * Sets the "Read" attribute
             */
            void setRead(oasisNamesTcCiqXpil3.LanguageSkillsList.Enum read);
            
            /**
             * Sets (as xml) the "Read" attribute
             */
            void xsetRead(oasisNamesTcCiqXpil3.LanguageSkillsList read);
            
            /**
             * Unsets the "Read" attribute
             */
            void unsetRead();
            
            /**
             * Gets the "Write" attribute
             */
            oasisNamesTcCiqXpil3.LanguageSkillsList.Enum getWrite();
            
            /**
             * Gets (as xml) the "Write" attribute
             */
            oasisNamesTcCiqXpil3.LanguageSkillsList xgetWrite();
            
            /**
             * True if has "Write" attribute
             */
            boolean isSetWrite();
            
            /**
             * Sets the "Write" attribute
             */
            void setWrite(oasisNamesTcCiqXpil3.LanguageSkillsList.Enum write);
            
            /**
             * Sets (as xml) the "Write" attribute
             */
            void xsetWrite(oasisNamesTcCiqXpil3.LanguageSkillsList write);
            
            /**
             * Unsets the "Write" attribute
             */
            void unsetWrite();
            
            /**
             * Gets the "Understand" attribute
             */
            oasisNamesTcCiqXpil3.LanguageSkillsList.Enum getUnderstand();
            
            /**
             * Gets (as xml) the "Understand" attribute
             */
            oasisNamesTcCiqXpil3.LanguageSkillsList xgetUnderstand();
            
            /**
             * True if has "Understand" attribute
             */
            boolean isSetUnderstand();
            
            /**
             * Sets the "Understand" attribute
             */
            void setUnderstand(oasisNamesTcCiqXpil3.LanguageSkillsList.Enum understand);
            
            /**
             * Sets (as xml) the "Understand" attribute
             */
            void xsetUnderstand(oasisNamesTcCiqXpil3.LanguageSkillsList understand);
            
            /**
             * Unsets the "Understand" attribute
             */
            void unsetUnderstand();
            
            /**
             * Gets the "Preference" attribute
             */
            java.lang.String getPreference();
            
            /**
             * Gets (as xml) the "Preference" attribute
             */
            oasisNamesTcCiqXpil3.LanguagePreferenceList xgetPreference();
            
            /**
             * True if has "Preference" attribute
             */
            boolean isSetPreference();
            
            /**
             * Sets the "Preference" attribute
             */
            void setPreference(java.lang.String preference);
            
            /**
             * Sets (as xml) the "Preference" attribute
             */
            void xsetPreference(oasisNamesTcCiqXpil3.LanguagePreferenceList preference);
            
            /**
             * Unsets the "Preference" attribute
             */
            void unsetPreference();
            
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
                public static oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language newInstance() {
                  return (oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.LanguagesDocument.Languages newInstance() {
              return (oasisNamesTcCiqXpil3.LanguagesDocument.Languages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.LanguagesDocument.Languages newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.LanguagesDocument.Languages) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.LanguagesDocument newInstance() {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.LanguagesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.LanguagesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
