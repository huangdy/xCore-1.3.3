/*
 * An XML document type.
 * Localname: Memberships
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.MembershipsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one Memberships(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface MembershipsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MembershipsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("memberships4a48doctype");
    
    /**
     * Gets the "Memberships" element
     */
    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships getMemberships();
    
    /**
     * Sets the "Memberships" element
     */
    void setMemberships(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships memberships);
    
    /**
     * Appends and returns a new empty "Memberships" element
     */
    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships addNewMemberships();
    
    /**
     * An XML Memberships(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface Memberships extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Memberships.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("memberships7471elemtype");
        
        /**
         * Gets array of all "Membership" elements
         */
        oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership[] getMembershipArray();
        
        /**
         * Gets ith "Membership" element
         */
        oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership getMembershipArray(int i);
        
        /**
         * Returns number of "Membership" element
         */
        int sizeOfMembershipArray();
        
        /**
         * Sets array of all "Membership" element
         */
        void setMembershipArray(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership[] membershipArray);
        
        /**
         * Sets ith "Membership" element
         */
        void setMembershipArray(int i, oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership membership);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Membership" element
         */
        oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership insertNewMembership(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Membership" element
         */
        oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership addNewMembership();
        
        /**
         * Removes the ith "Membership" element
         */
        void removeMembership(int i);
        
        /**
         * An XML Membership(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public interface Membership extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Membership.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("membership4883elemtype");
            
            /**
             * Gets array of all "MembershipElement" elements
             */
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement[] getMembershipElementArray();
            
            /**
             * Gets ith "MembershipElement" element
             */
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement getMembershipElementArray(int i);
            
            /**
             * Returns number of "MembershipElement" element
             */
            int sizeOfMembershipElementArray();
            
            /**
             * Sets array of all "MembershipElement" element
             */
            void setMembershipElementArray(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement[] membershipElementArray);
            
            /**
             * Sets ith "MembershipElement" element
             */
            void setMembershipElementArray(int i, oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement membershipElement);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "MembershipElement" element
             */
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement insertNewMembershipElement(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "MembershipElement" element
             */
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement addNewMembershipElement();
            
            /**
             * Removes the ith "MembershipElement" element
             */
            void removeMembershipElement(int i);
            
            /**
             * Gets the "Organisation" element
             */
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation getOrganisation();
            
            /**
             * True if has "Organisation" element
             */
            boolean isSetOrganisation();
            
            /**
             * Sets the "Organisation" element
             */
            void setOrganisation(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation organisation);
            
            /**
             * Appends and returns a new empty "Organisation" element
             */
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation addNewOrganisation();
            
            /**
             * Unsets the "Organisation" element
             */
            void unsetOrganisation();
            
            /**
             * Gets the "Type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.MembershipTypeList xgetType();
            
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
            void xsetType(oasisNamesTcCiqXpil3.MembershipTypeList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
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
             * An XML MembershipElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.MembershipsDocument$Memberships$Membership$MembershipElement.
             */
            public interface MembershipElement extends oasisNamesTcCiqCt3.String
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MembershipElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("membershipelementa3b1elemtype");
                
                /**
                 * Gets the "Type" attribute
                 */
                oasisNamesTcCiqXpil3.MembershipElementList.Enum getType();
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                oasisNamesTcCiqXpil3.MembershipElementList xgetType();
                
                /**
                 * True if has "Type" attribute
                 */
                boolean isSetType();
                
                /**
                 * Sets the "Type" attribute
                 */
                void setType(oasisNamesTcCiqXpil3.MembershipElementList.Enum type);
                
                /**
                 * Sets (as xml) the "Type" attribute
                 */
                void xsetType(oasisNamesTcCiqXpil3.MembershipElementList type);
                
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
                    public static oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement newInstance() {
                      return (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Organisation(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is a complex type.
             */
            public interface Organisation extends oasisNamesTcCiqXnl3.OrganisationNameType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organisation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("organisationea2delemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation newInstance() {
                      return (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership newInstance() {
                  return (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.MembershipsDocument.Memberships newInstance() {
              return (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.MembershipsDocument.Memberships newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.MembershipsDocument newInstance() {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.MembershipsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.MembershipsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
