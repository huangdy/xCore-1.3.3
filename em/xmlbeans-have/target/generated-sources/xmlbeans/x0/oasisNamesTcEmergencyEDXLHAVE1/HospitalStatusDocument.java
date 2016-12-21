/*
 * An XML document type.
 * Localname: HospitalStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * A document containing one HospitalStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0) element.
 *
 * This is a complex type.
 */
public interface HospitalStatusDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HospitalStatusDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("hospitalstatusc719doctype");
    
    /**
     * Gets the "HospitalStatus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus getHospitalStatus();
    
    /**
     * Sets the "HospitalStatus" element
     */
    void setHospitalStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus hospitalStatus);
    
    /**
     * Appends and returns a new empty "HospitalStatus" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus addNewHospitalStatus();
    
    /**
     * An XML HospitalStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public interface HospitalStatus extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HospitalStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("hospitalstatus1ca1elemtype");
        
        /**
         * Gets array of all "Hospital" elements
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital[] getHospitalArray();
        
        /**
         * Gets ith "Hospital" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital getHospitalArray(int i);
        
        /**
         * Returns number of "Hospital" element
         */
        int sizeOfHospitalArray();
        
        /**
         * Sets array of all "Hospital" element
         */
        void setHospitalArray(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital[] hospitalArray);
        
        /**
         * Sets ith "Hospital" element
         */
        void setHospitalArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital hospital);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Hospital" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital insertNewHospital(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Hospital" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital addNewHospital();
        
        /**
         * Removes the ith "Hospital" element
         */
        void removeHospital(int i);
        
        /**
         * An XML Hospital(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is a complex type.
         */
        public interface Hospital extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Hospital.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("hospital796belemtype");
            
            /**
             * Gets the "Organization" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization getOrganization();
            
            /**
             * Sets the "Organization" element
             */
            void setOrganization(x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization organization);
            
            /**
             * Appends and returns a new empty "Organization" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization addNewOrganization();
            
            /**
             * Gets the "EmergencyDepartmentStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus getEmergencyDepartmentStatus();
            
            /**
             * True if has "EmergencyDepartmentStatus" element
             */
            boolean isSetEmergencyDepartmentStatus();
            
            /**
             * Sets the "EmergencyDepartmentStatus" element
             */
            void setEmergencyDepartmentStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus emergencyDepartmentStatus);
            
            /**
             * Appends and returns a new empty "EmergencyDepartmentStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus addNewEmergencyDepartmentStatus();
            
            /**
             * Unsets the "EmergencyDepartmentStatus" element
             */
            void unsetEmergencyDepartmentStatus();
            
            /**
             * Gets the "HospitalBedCapacityStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus getHospitalBedCapacityStatus();
            
            /**
             * True if has "HospitalBedCapacityStatus" element
             */
            boolean isSetHospitalBedCapacityStatus();
            
            /**
             * Sets the "HospitalBedCapacityStatus" element
             */
            void setHospitalBedCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus hospitalBedCapacityStatus);
            
            /**
             * Appends and returns a new empty "HospitalBedCapacityStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus addNewHospitalBedCapacityStatus();
            
            /**
             * Unsets the "HospitalBedCapacityStatus" element
             */
            void unsetHospitalBedCapacityStatus();
            
            /**
             * Gets the "ServiceCoverageStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus getServiceCoverageStatus();
            
            /**
             * True if has "ServiceCoverageStatus" element
             */
            boolean isSetServiceCoverageStatus();
            
            /**
             * Sets the "ServiceCoverageStatus" element
             */
            void setServiceCoverageStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus serviceCoverageStatus);
            
            /**
             * Appends and returns a new empty "ServiceCoverageStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus addNewServiceCoverageStatus();
            
            /**
             * Unsets the "ServiceCoverageStatus" element
             */
            void unsetServiceCoverageStatus();
            
            /**
             * Gets the "HospitalFacilityStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus getHospitalFacilityStatus();
            
            /**
             * True if has "HospitalFacilityStatus" element
             */
            boolean isSetHospitalFacilityStatus();
            
            /**
             * Sets the "HospitalFacilityStatus" element
             */
            void setHospitalFacilityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus hospitalFacilityStatus);
            
            /**
             * Appends and returns a new empty "HospitalFacilityStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus addNewHospitalFacilityStatus();
            
            /**
             * Unsets the "HospitalFacilityStatus" element
             */
            void unsetHospitalFacilityStatus();
            
            /**
             * Gets the "HospitalResourcesStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus getHospitalResourcesStatus();
            
            /**
             * True if has "HospitalResourcesStatus" element
             */
            boolean isSetHospitalResourcesStatus();
            
            /**
             * Sets the "HospitalResourcesStatus" element
             */
            void setHospitalResourcesStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus hospitalResourcesStatus);
            
            /**
             * Appends and returns a new empty "HospitalResourcesStatus" element
             */
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus addNewHospitalResourcesStatus();
            
            /**
             * Unsets the "HospitalResourcesStatus" element
             */
            void unsetHospitalResourcesStatus();
            
            /**
             * Gets the "LastUpdateTime" element
             */
            java.util.Calendar getLastUpdateTime();
            
            /**
             * Gets (as xml) the "LastUpdateTime" element
             */
            org.apache.xmlbeans.XmlDateTime xgetLastUpdateTime();
            
            /**
             * Sets the "LastUpdateTime" element
             */
            void setLastUpdateTime(java.util.Calendar lastUpdateTime);
            
            /**
             * Sets (as xml) the "LastUpdateTime" element
             */
            void xsetLastUpdateTime(org.apache.xmlbeans.XmlDateTime lastUpdateTime);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital newInstance() {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
