/*
 * An XML document type.
 * Localname: Occupations
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.OccupationsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one Occupations(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface OccupationsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OccupationsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("occupations7a33doctype");
    
    /**
     * Gets the "Occupations" element
     */
    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations getOccupations();
    
    /**
     * Sets the "Occupations" element
     */
    void setOccupations(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations occupations);
    
    /**
     * Appends and returns a new empty "Occupations" element
     */
    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations addNewOccupations();
    
    /**
     * An XML Occupations(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface Occupations extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Occupations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("occupations1d07elemtype");
        
        /**
         * Gets array of all "Occupation" elements
         */
        oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation[] getOccupationArray();
        
        /**
         * Gets ith "Occupation" element
         */
        oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation getOccupationArray(int i);
        
        /**
         * Returns number of "Occupation" element
         */
        int sizeOfOccupationArray();
        
        /**
         * Sets array of all "Occupation" element
         */
        void setOccupationArray(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation[] occupationArray);
        
        /**
         * Sets ith "Occupation" element
         */
        void setOccupationArray(int i, oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation occupation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Occupation" element
         */
        oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation insertNewOccupation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Occupation" element
         */
        oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation addNewOccupation();
        
        /**
         * Removes the ith "Occupation" element
         */
        void removeOccupation(int i);
        
        /**
         * An XML Occupation(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public interface Occupation extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Occupation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("occupation264eelemtype");
            
            /**
             * Gets array of all "OccupationElement" elements
             */
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement[] getOccupationElementArray();
            
            /**
             * Gets ith "OccupationElement" element
             */
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement getOccupationElementArray(int i);
            
            /**
             * Returns number of "OccupationElement" element
             */
            int sizeOfOccupationElementArray();
            
            /**
             * Sets array of all "OccupationElement" element
             */
            void setOccupationElementArray(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement[] occupationElementArray);
            
            /**
             * Sets ith "OccupationElement" element
             */
            void setOccupationElementArray(int i, oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement occupationElement);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "OccupationElement" element
             */
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement insertNewOccupationElement(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "OccupationElement" element
             */
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement addNewOccupationElement();
            
            /**
             * Removes the ith "OccupationElement" element
             */
            void removeOccupationElement(int i);
            
            /**
             * Gets the "Employer" element
             */
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer getEmployer();
            
            /**
             * True if has "Employer" element
             */
            boolean isSetEmployer();
            
            /**
             * Sets the "Employer" element
             */
            void setEmployer(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer employer);
            
            /**
             * Appends and returns a new empty "Employer" element
             */
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer addNewEmployer();
            
            /**
             * Unsets the "Employer" element
             */
            void unsetEmployer();
            
            /**
             * Gets the "isSelfEmployed" attribute
             */
            boolean getIsSelfEmployed();
            
            /**
             * Gets (as xml) the "isSelfEmployed" attribute
             */
            org.apache.xmlbeans.XmlBoolean xgetIsSelfEmployed();
            
            /**
             * True if has "isSelfEmployed" attribute
             */
            boolean isSetIsSelfEmployed();
            
            /**
             * Sets the "isSelfEmployed" attribute
             */
            void setIsSelfEmployed(boolean isSelfEmployed);
            
            /**
             * Sets (as xml) the "isSelfEmployed" attribute
             */
            void xsetIsSelfEmployed(org.apache.xmlbeans.XmlBoolean isSelfEmployed);
            
            /**
             * Unsets the "isSelfEmployed" attribute
             */
            void unsetIsSelfEmployed();
            
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
             * An XML OccupationElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.OccupationsDocument$Occupations$Occupation$OccupationElement.
             */
            public interface OccupationElement extends oasisNamesTcCiqCt3.String
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OccupationElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("occupationelement0a31elemtype");
                
                /**
                 * Gets the "Type" attribute
                 */
                oasisNamesTcCiqXpil3.OccupationElementList.Enum getType();
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                oasisNamesTcCiqXpil3.OccupationElementList xgetType();
                
                /**
                 * True if has "Type" attribute
                 */
                boolean isSetType();
                
                /**
                 * Sets the "Type" attribute
                 */
                void setType(oasisNamesTcCiqXpil3.OccupationElementList.Enum type);
                
                /**
                 * Sets (as xml) the "Type" attribute
                 */
                void xsetType(oasisNamesTcCiqXpil3.OccupationElementList type);
                
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
                    public static oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement newInstance() {
                      return (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Employer(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is a complex type.
             */
            public interface Employer extends oasisNamesTcCiqXnl3.OrganisationNameType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Employer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("employer9ef7elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer newInstance() {
                      return (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation newInstance() {
                  return (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.OccupationsDocument.Occupations newInstance() {
              return (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.OccupationsDocument.Occupations newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.OccupationsDocument newInstance() {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.OccupationsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.OccupationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
