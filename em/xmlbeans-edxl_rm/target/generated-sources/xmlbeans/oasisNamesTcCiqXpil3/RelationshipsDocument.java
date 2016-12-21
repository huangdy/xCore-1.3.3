/*
 * An XML document type.
 * Localname: Relationships
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.RelationshipsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one Relationships(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface RelationshipsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelationshipsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("relationships49e6doctype");
    
    /**
     * Gets the "Relationships" element
     */
    oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships getRelationships();
    
    /**
     * Sets the "Relationships" element
     */
    void setRelationships(oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships relationships);
    
    /**
     * Appends and returns a new empty "Relationships" element
     */
    oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships addNewRelationships();
    
    /**
     * An XML Relationships(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface Relationships extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Relationships.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("relationships652delemtype");
        
        /**
         * Gets array of all "Relationship" elements
         */
        oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship[] getRelationshipArray();
        
        /**
         * Gets ith "Relationship" element
         */
        oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship getRelationshipArray(int i);
        
        /**
         * Returns number of "Relationship" element
         */
        int sizeOfRelationshipArray();
        
        /**
         * Sets array of all "Relationship" element
         */
        void setRelationshipArray(oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship[] relationshipArray);
        
        /**
         * Sets ith "Relationship" element
         */
        void setRelationshipArray(int i, oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship relationship);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Relationship" element
         */
        oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship insertNewRelationship(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Relationship" element
         */
        oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship addNewRelationship();
        
        /**
         * Removes the ith "Relationship" element
         */
        void removeRelationship(int i);
        
        /**
         * An XML Relationship(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public interface Relationship extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Relationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("relationshipa121elemtype");
            
            /**
             * Gets the "NameLine" element
             */
            oasisNamesTcCiqXnl3.NameLineDocument.NameLine getNameLine();
            
            /**
             * True if has "NameLine" element
             */
            boolean isSetNameLine();
            
            /**
             * Sets the "NameLine" element
             */
            void setNameLine(oasisNamesTcCiqXnl3.NameLineDocument.NameLine nameLine);
            
            /**
             * Appends and returns a new empty "NameLine" element
             */
            oasisNamesTcCiqXnl3.NameLineDocument.NameLine addNewNameLine();
            
            /**
             * Unsets the "NameLine" element
             */
            void unsetNameLine();
            
            /**
             * Gets the "PersonName" element
             */
            oasisNamesTcCiqXnl3.PersonNameType getPersonName();
            
            /**
             * True if has "PersonName" element
             */
            boolean isSetPersonName();
            
            /**
             * Sets the "PersonName" element
             */
            void setPersonName(oasisNamesTcCiqXnl3.PersonNameType personName);
            
            /**
             * Appends and returns a new empty "PersonName" element
             */
            oasisNamesTcCiqXnl3.PersonNameType addNewPersonName();
            
            /**
             * Unsets the "PersonName" element
             */
            void unsetPersonName();
            
            /**
             * Gets the "OrganisationName" element
             */
            oasisNamesTcCiqXnl3.OrganisationNameType getOrganisationName();
            
            /**
             * True if has "OrganisationName" element
             */
            boolean isSetOrganisationName();
            
            /**
             * Sets the "OrganisationName" element
             */
            void setOrganisationName(oasisNamesTcCiqXnl3.OrganisationNameType organisationName);
            
            /**
             * Appends and returns a new empty "OrganisationName" element
             */
            oasisNamesTcCiqXnl3.OrganisationNameType addNewOrganisationName();
            
            /**
             * Unsets the "OrganisationName" element
             */
            void unsetOrganisationName();
            
            /**
             * Gets the "Addresses" element
             */
            oasisNamesTcCiqXpil3.AddressesDocument.Addresses getAddresses();
            
            /**
             * True if has "Addresses" element
             */
            boolean isSetAddresses();
            
            /**
             * Sets the "Addresses" element
             */
            void setAddresses(oasisNamesTcCiqXpil3.AddressesDocument.Addresses addresses);
            
            /**
             * Appends and returns a new empty "Addresses" element
             */
            oasisNamesTcCiqXpil3.AddressesDocument.Addresses addNewAddresses();
            
            /**
             * Unsets the "Addresses" element
             */
            void unsetAddresses();
            
            /**
             * Gets the "ContactNumbers" element
             */
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers getContactNumbers();
            
            /**
             * True if has "ContactNumbers" element
             */
            boolean isSetContactNumbers();
            
            /**
             * Sets the "ContactNumbers" element
             */
            void setContactNumbers(oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers contactNumbers);
            
            /**
             * Appends and returns a new empty "ContactNumbers" element
             */
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers addNewContactNumbers();
            
            /**
             * Unsets the "ContactNumbers" element
             */
            void unsetContactNumbers();
            
            /**
             * Gets the "ElectronicAddressIdentifiers" element
             */
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers getElectronicAddressIdentifiers();
            
            /**
             * True if has "ElectronicAddressIdentifiers" element
             */
            boolean isSetElectronicAddressIdentifiers();
            
            /**
             * Sets the "ElectronicAddressIdentifiers" element
             */
            void setElectronicAddressIdentifiers(oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers electronicAddressIdentifiers);
            
            /**
             * Appends and returns a new empty "ElectronicAddressIdentifiers" element
             */
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers addNewElectronicAddressIdentifiers();
            
            /**
             * Unsets the "ElectronicAddressIdentifiers" element
             */
            void unsetElectronicAddressIdentifiers();
            
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
             * Gets the "PartyType" attribute
             */
            java.lang.String getPartyType();
            
            /**
             * Gets (as xml) the "PartyType" attribute
             */
            oasisNamesTcCiqXpil3.PartyTypeList xgetPartyType();
            
            /**
             * True if has "PartyType" attribute
             */
            boolean isSetPartyType();
            
            /**
             * Sets the "PartyType" attribute
             */
            void setPartyType(java.lang.String partyType);
            
            /**
             * Sets (as xml) the "PartyType" attribute
             */
            void xsetPartyType(oasisNamesTcCiqXpil3.PartyTypeList partyType);
            
            /**
             * Unsets the "PartyType" attribute
             */
            void unsetPartyType();
            
            /**
             * Gets the "RelationshipWithPerson" attribute
             */
            java.lang.String getRelationshipWithPerson();
            
            /**
             * Gets (as xml) the "RelationshipWithPerson" attribute
             */
            oasisNamesTcCiqXpil3.PersonRelationshipTypeList xgetRelationshipWithPerson();
            
            /**
             * True if has "RelationshipWithPerson" attribute
             */
            boolean isSetRelationshipWithPerson();
            
            /**
             * Sets the "RelationshipWithPerson" attribute
             */
            void setRelationshipWithPerson(java.lang.String relationshipWithPerson);
            
            /**
             * Sets (as xml) the "RelationshipWithPerson" attribute
             */
            void xsetRelationshipWithPerson(oasisNamesTcCiqXpil3.PersonRelationshipTypeList relationshipWithPerson);
            
            /**
             * Unsets the "RelationshipWithPerson" attribute
             */
            void unsetRelationshipWithPerson();
            
            /**
             * Gets the "RelationshipWithOrganisation" attribute
             */
            java.lang.String getRelationshipWithOrganisation();
            
            /**
             * Gets (as xml) the "RelationshipWithOrganisation" attribute
             */
            oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList xgetRelationshipWithOrganisation();
            
            /**
             * True if has "RelationshipWithOrganisation" attribute
             */
            boolean isSetRelationshipWithOrganisation();
            
            /**
             * Sets the "RelationshipWithOrganisation" attribute
             */
            void setRelationshipWithOrganisation(java.lang.String relationshipWithOrganisation);
            
            /**
             * Sets (as xml) the "RelationshipWithOrganisation" attribute
             */
            void xsetRelationshipWithOrganisation(oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList relationshipWithOrganisation);
            
            /**
             * Unsets the "RelationshipWithOrganisation" attribute
             */
            void unsetRelationshipWithOrganisation();
            
            /**
             * Gets the "RelationshipValidFrom" attribute
             */
            java.util.Calendar getRelationshipValidFrom();
            
            /**
             * Gets (as xml) the "RelationshipValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetRelationshipValidFrom();
            
            /**
             * True if has "RelationshipValidFrom" attribute
             */
            boolean isSetRelationshipValidFrom();
            
            /**
             * Sets the "RelationshipValidFrom" attribute
             */
            void setRelationshipValidFrom(java.util.Calendar relationshipValidFrom);
            
            /**
             * Sets (as xml) the "RelationshipValidFrom" attribute
             */
            void xsetRelationshipValidFrom(org.apache.xmlbeans.XmlDateTime relationshipValidFrom);
            
            /**
             * Unsets the "RelationshipValidFrom" attribute
             */
            void unsetRelationshipValidFrom();
            
            /**
             * Gets the "RelationshipValidTo" attribute
             */
            java.util.Calendar getRelationshipValidTo();
            
            /**
             * Gets (as xml) the "RelationshipValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetRelationshipValidTo();
            
            /**
             * True if has "RelationshipValidTo" attribute
             */
            boolean isSetRelationshipValidTo();
            
            /**
             * Sets the "RelationshipValidTo" attribute
             */
            void setRelationshipValidTo(java.util.Calendar relationshipValidTo);
            
            /**
             * Sets (as xml) the "RelationshipValidTo" attribute
             */
            void xsetRelationshipValidTo(org.apache.xmlbeans.XmlDateTime relationshipValidTo);
            
            /**
             * Unsets the "RelationshipValidTo" attribute
             */
            void unsetRelationshipValidTo();
            
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
                public static oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship newInstance() {
                  return (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships newInstance() {
              return (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.RelationshipsDocument newInstance() {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.RelationshipsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.RelationshipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
