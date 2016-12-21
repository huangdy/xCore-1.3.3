/*
 * An XML document type.
 * Localname: Qualifications
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.QualificationsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one Qualifications(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface QualificationsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QualificationsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("qualificationsc8a1doctype");
    
    /**
     * Gets the "Qualifications" element
     */
    oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications getQualifications();
    
    /**
     * Sets the "Qualifications" element
     */
    void setQualifications(oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications qualifications);
    
    /**
     * Appends and returns a new empty "Qualifications" element
     */
    oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications addNewQualifications();
    
    /**
     * An XML Qualifications(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface Qualifications extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Qualifications.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("qualifications9981elemtype");
        
        /**
         * Gets array of all "Qualification" elements
         */
        oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification[] getQualificationArray();
        
        /**
         * Gets ith "Qualification" element
         */
        oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification getQualificationArray(int i);
        
        /**
         * Returns number of "Qualification" element
         */
        int sizeOfQualificationArray();
        
        /**
         * Sets array of all "Qualification" element
         */
        void setQualificationArray(oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification[] qualificationArray);
        
        /**
         * Sets ith "Qualification" element
         */
        void setQualificationArray(int i, oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification qualification);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Qualification" element
         */
        oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification insertNewQualification(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Qualification" element
         */
        oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification addNewQualification();
        
        /**
         * Removes the ith "Qualification" element
         */
        void removeQualification(int i);
        
        /**
         * An XML Qualification(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public interface Qualification extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Qualification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("qualificationbdbcelemtype");
            
            /**
             * Gets array of all "QualificationElement" elements
             */
            oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement[] getQualificationElementArray();
            
            /**
             * Gets ith "QualificationElement" element
             */
            oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement getQualificationElementArray(int i);
            
            /**
             * Returns number of "QualificationElement" element
             */
            int sizeOfQualificationElementArray();
            
            /**
             * Sets array of all "QualificationElement" element
             */
            void setQualificationElementArray(oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement[] qualificationElementArray);
            
            /**
             * Sets ith "QualificationElement" element
             */
            void setQualificationElementArray(int i, oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement qualificationElement);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "QualificationElement" element
             */
            oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement insertNewQualificationElement(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "QualificationElement" element
             */
            oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement addNewQualificationElement();
            
            /**
             * Removes the ith "QualificationElement" element
             */
            void removeQualificationElement(int i);
            
            /**
             * Gets the "Institution" element
             */
            oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.Institution getInstitution();
            
            /**
             * True if has "Institution" element
             */
            boolean isSetInstitution();
            
            /**
             * Sets the "Institution" element
             */
            void setInstitution(oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.Institution institution);
            
            /**
             * Appends and returns a new empty "Institution" element
             */
            oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.Institution addNewInstitution();
            
            /**
             * Unsets the "Institution" element
             */
            void unsetInstitution();
            
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
             * An XML QualificationElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.QualificationsDocument$Qualifications$Qualification$QualificationElement.
             */
            public interface QualificationElement extends oasisNamesTcCiqCt3.String
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QualificationElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("qualificationelementa285elemtype");
                
                /**
                 * Gets the "Type" attribute
                 */
                oasisNamesTcCiqXpil3.QualificationElementList.Enum getType();
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                oasisNamesTcCiqXpil3.QualificationElementList xgetType();
                
                /**
                 * True if has "Type" attribute
                 */
                boolean isSetType();
                
                /**
                 * Sets the "Type" attribute
                 */
                void setType(oasisNamesTcCiqXpil3.QualificationElementList.Enum type);
                
                /**
                 * Sets (as xml) the "Type" attribute
                 */
                void xsetType(oasisNamesTcCiqXpil3.QualificationElementList type);
                
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
                    public static oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement newInstance() {
                      return (oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.QualificationElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Institution(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is a complex type.
             */
            public interface Institution extends oasisNamesTcCiqXnl3.OrganisationNameType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Institution.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("institution8bc0elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.Institution newInstance() {
                      return (oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.Institution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.Institution newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification.Institution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification newInstance() {
                  return (oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications.Qualification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications newInstance() {
              return (oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.QualificationsDocument newInstance() {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.QualificationsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.QualificationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
