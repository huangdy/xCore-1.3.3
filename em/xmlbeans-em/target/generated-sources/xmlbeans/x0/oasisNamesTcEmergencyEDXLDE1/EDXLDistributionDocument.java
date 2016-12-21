/*
 * An XML document type.
 * Localname: EDXLDistribution
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1;


/**
 * A document containing one EDXLDistribution(@urn:oasis:names:tc:emergency:EDXL:DE:1.0) element.
 *
 * This is a complex type.
 */
public interface EDXLDistributionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EDXLDistributionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("edxldistribution1747doctype");
    
    /**
     * Gets the "EDXLDistribution" element
     */
    x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistribution();
    
    /**
     * Sets the "EDXLDistribution" element
     */
    void setEDXLDistribution(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution);
    
    /**
     * Appends and returns a new empty "EDXLDistribution" element
     */
    x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution addNewEDXLDistribution();
    
    /**
     * An XML EDXLDistribution(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
     *
     * This is a complex type.
     */
    public interface EDXLDistribution extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EDXLDistribution.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("edxldistributionff5aelemtype");
        
        /**
         * Gets the "distributionID" element
         */
        java.lang.String getDistributionID();
        
        /**
         * Gets (as xml) the "distributionID" element
         */
        org.apache.xmlbeans.XmlString xgetDistributionID();
        
        /**
         * Sets the "distributionID" element
         */
        void setDistributionID(java.lang.String distributionID);
        
        /**
         * Sets (as xml) the "distributionID" element
         */
        void xsetDistributionID(org.apache.xmlbeans.XmlString distributionID);
        
        /**
         * Gets the "senderID" element
         */
        java.lang.String getSenderID();
        
        /**
         * Gets (as xml) the "senderID" element
         */
        org.apache.xmlbeans.XmlString xgetSenderID();
        
        /**
         * Sets the "senderID" element
         */
        void setSenderID(java.lang.String senderID);
        
        /**
         * Sets (as xml) the "senderID" element
         */
        void xsetSenderID(org.apache.xmlbeans.XmlString senderID);
        
        /**
         * Gets the "dateTimeSent" element
         */
        java.util.Calendar getDateTimeSent();
        
        /**
         * Gets (as xml) the "dateTimeSent" element
         */
        org.apache.xmlbeans.XmlDateTime xgetDateTimeSent();
        
        /**
         * Sets the "dateTimeSent" element
         */
        void setDateTimeSent(java.util.Calendar dateTimeSent);
        
        /**
         * Sets (as xml) the "dateTimeSent" element
         */
        void xsetDateTimeSent(org.apache.xmlbeans.XmlDateTime dateTimeSent);
        
        /**
         * Gets the "distributionStatus" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.StatusValues.Enum getDistributionStatus();
        
        /**
         * Gets (as xml) the "distributionStatus" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.StatusValues xgetDistributionStatus();
        
        /**
         * Sets the "distributionStatus" element
         */
        void setDistributionStatus(x0.oasisNamesTcEmergencyEDXLDE1.StatusValues.Enum distributionStatus);
        
        /**
         * Sets (as xml) the "distributionStatus" element
         */
        void xsetDistributionStatus(x0.oasisNamesTcEmergencyEDXLDE1.StatusValues distributionStatus);
        
        /**
         * Gets the "distributionType" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.TypeValues.Enum getDistributionType();
        
        /**
         * Gets (as xml) the "distributionType" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.TypeValues xgetDistributionType();
        
        /**
         * Sets the "distributionType" element
         */
        void setDistributionType(x0.oasisNamesTcEmergencyEDXLDE1.TypeValues.Enum distributionType);
        
        /**
         * Sets (as xml) the "distributionType" element
         */
        void xsetDistributionType(x0.oasisNamesTcEmergencyEDXLDE1.TypeValues distributionType);
        
        /**
         * Gets the "combinedConfidentiality" element
         */
        java.lang.String getCombinedConfidentiality();
        
        /**
         * Gets (as xml) the "combinedConfidentiality" element
         */
        org.apache.xmlbeans.XmlString xgetCombinedConfidentiality();
        
        /**
         * Sets the "combinedConfidentiality" element
         */
        void setCombinedConfidentiality(java.lang.String combinedConfidentiality);
        
        /**
         * Sets (as xml) the "combinedConfidentiality" element
         */
        void xsetCombinedConfidentiality(org.apache.xmlbeans.XmlString combinedConfidentiality);
        
        /**
         * Gets the "language" element
         */
        java.lang.String getLanguage();
        
        /**
         * Gets (as xml) the "language" element
         */
        org.apache.xmlbeans.XmlString xgetLanguage();
        
        /**
         * True if has "language" element
         */
        boolean isSetLanguage();
        
        /**
         * Sets the "language" element
         */
        void setLanguage(java.lang.String language);
        
        /**
         * Sets (as xml) the "language" element
         */
        void xsetLanguage(org.apache.xmlbeans.XmlString language);
        
        /**
         * Unsets the "language" element
         */
        void unsetLanguage();
        
        /**
         * Gets array of all "senderRole" elements
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getSenderRoleArray();
        
        /**
         * Gets ith "senderRole" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getSenderRoleArray(int i);
        
        /**
         * Returns number of "senderRole" element
         */
        int sizeOfSenderRoleArray();
        
        /**
         * Sets array of all "senderRole" element
         */
        void setSenderRoleArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] senderRoleArray);
        
        /**
         * Sets ith "senderRole" element
         */
        void setSenderRoleArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType senderRole);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "senderRole" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewSenderRole(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "senderRole" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewSenderRole();
        
        /**
         * Removes the ith "senderRole" element
         */
        void removeSenderRole(int i);
        
        /**
         * Gets array of all "recipientRole" elements
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getRecipientRoleArray();
        
        /**
         * Gets ith "recipientRole" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getRecipientRoleArray(int i);
        
        /**
         * Returns number of "recipientRole" element
         */
        int sizeOfRecipientRoleArray();
        
        /**
         * Sets array of all "recipientRole" element
         */
        void setRecipientRoleArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] recipientRoleArray);
        
        /**
         * Sets ith "recipientRole" element
         */
        void setRecipientRoleArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType recipientRole);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recipientRole" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewRecipientRole(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recipientRole" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewRecipientRole();
        
        /**
         * Removes the ith "recipientRole" element
         */
        void removeRecipientRole(int i);
        
        /**
         * Gets array of all "keyword" elements
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getKeywordArray();
        
        /**
         * Gets ith "keyword" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getKeywordArray(int i);
        
        /**
         * Returns number of "keyword" element
         */
        int sizeOfKeywordArray();
        
        /**
         * Sets array of all "keyword" element
         */
        void setKeywordArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] keywordArray);
        
        /**
         * Sets ith "keyword" element
         */
        void setKeywordArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType keyword);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keyword" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewKeyword(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keyword" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewKeyword();
        
        /**
         * Removes the ith "keyword" element
         */
        void removeKeyword(int i);
        
        /**
         * Gets array of all "distributionReference" elements
         */
        java.lang.String[] getDistributionReferenceArray();
        
        /**
         * Gets ith "distributionReference" element
         */
        java.lang.String getDistributionReferenceArray(int i);
        
        /**
         * Gets (as xml) array of all "distributionReference" elements
         */
        org.apache.xmlbeans.XmlString[] xgetDistributionReferenceArray();
        
        /**
         * Gets (as xml) ith "distributionReference" element
         */
        org.apache.xmlbeans.XmlString xgetDistributionReferenceArray(int i);
        
        /**
         * Returns number of "distributionReference" element
         */
        int sizeOfDistributionReferenceArray();
        
        /**
         * Sets array of all "distributionReference" element
         */
        void setDistributionReferenceArray(java.lang.String[] distributionReferenceArray);
        
        /**
         * Sets ith "distributionReference" element
         */
        void setDistributionReferenceArray(int i, java.lang.String distributionReference);
        
        /**
         * Sets (as xml) array of all "distributionReference" element
         */
        void xsetDistributionReferenceArray(org.apache.xmlbeans.XmlString[] distributionReferenceArray);
        
        /**
         * Sets (as xml) ith "distributionReference" element
         */
        void xsetDistributionReferenceArray(int i, org.apache.xmlbeans.XmlString distributionReference);
        
        /**
         * Inserts the value as the ith "distributionReference" element
         */
        void insertDistributionReference(int i, java.lang.String distributionReference);
        
        /**
         * Appends the value as the last "distributionReference" element
         */
        void addDistributionReference(java.lang.String distributionReference);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "distributionReference" element
         */
        org.apache.xmlbeans.XmlString insertNewDistributionReference(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "distributionReference" element
         */
        org.apache.xmlbeans.XmlString addNewDistributionReference();
        
        /**
         * Removes the ith "distributionReference" element
         */
        void removeDistributionReference(int i);
        
        /**
         * Gets array of all "explicitAddress" elements
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType[] getExplicitAddressArray();
        
        /**
         * Gets ith "explicitAddress" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType getExplicitAddressArray(int i);
        
        /**
         * Returns number of "explicitAddress" element
         */
        int sizeOfExplicitAddressArray();
        
        /**
         * Sets array of all "explicitAddress" element
         */
        void setExplicitAddressArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType[] explicitAddressArray);
        
        /**
         * Sets ith "explicitAddress" element
         */
        void setExplicitAddressArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType explicitAddress);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "explicitAddress" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType insertNewExplicitAddress(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "explicitAddress" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType addNewExplicitAddress();
        
        /**
         * Removes the ith "explicitAddress" element
         */
        void removeExplicitAddress(int i);
        
        /**
         * Gets array of all "targetArea" elements
         */
        x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType[] getTargetAreaArray();
        
        /**
         * Gets ith "targetArea" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType getTargetAreaArray(int i);
        
        /**
         * Returns number of "targetArea" element
         */
        int sizeOfTargetAreaArray();
        
        /**
         * Sets array of all "targetArea" element
         */
        void setTargetAreaArray(x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType[] targetAreaArray);
        
        /**
         * Sets ith "targetArea" element
         */
        void setTargetAreaArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType targetArea);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "targetArea" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType insertNewTargetArea(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "targetArea" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType addNewTargetArea();
        
        /**
         * Removes the ith "targetArea" element
         */
        void removeTargetArea(int i);
        
        /**
         * Gets array of all "contentObject" elements
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType[] getContentObjectArray();
        
        /**
         * Gets ith "contentObject" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType getContentObjectArray(int i);
        
        /**
         * Returns number of "contentObject" element
         */
        int sizeOfContentObjectArray();
        
        /**
         * Sets array of all "contentObject" element
         */
        void setContentObjectArray(x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType[] contentObjectArray);
        
        /**
         * Sets ith "contentObject" element
         */
        void setContentObjectArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType contentObject);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contentObject" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType insertNewContentObject(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contentObject" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType addNewContentObject();
        
        /**
         * Removes the ith "contentObject" element
         */
        void removeContentObject(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
