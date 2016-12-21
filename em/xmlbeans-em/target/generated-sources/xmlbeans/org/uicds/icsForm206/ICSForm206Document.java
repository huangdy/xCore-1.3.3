/*
 * An XML document type.
 * Localname: ICSForm206
 * Namespace: http://uicds.org/ICSForm206
 * Java type: org.uicds.icsForm206.ICSForm206Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm206;


/**
 * A document containing one ICSForm206(@http://uicds.org/ICSForm206) element.
 *
 * This is a complex type.
 */
public interface ICSForm206Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm206Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform206425cdoctype");
    
    /**
     * Gets the "ICSForm206" element
     */
    org.uicds.icsForm206.ICSForm206Document.ICSForm206 getICSForm206();
    
    /**
     * Sets the "ICSForm206" element
     */
    void setICSForm206(org.uicds.icsForm206.ICSForm206Document.ICSForm206 icsForm206);
    
    /**
     * Appends and returns a new empty "ICSForm206" element
     */
    org.uicds.icsForm206.ICSForm206Document.ICSForm206 addNewICSForm206();
    
    /**
     * An XML ICSForm206(@http://uicds.org/ICSForm206).
     *
     * This is a complex type.
     */
    public interface ICSForm206 extends org.uicds.icsFormCommon.ICSFormDocumentType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm206.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform206e3e5elemtype");
        
        /**
         * Gets the "IncidentName" element
         */
        java.lang.String getIncidentName();
        
        /**
         * Gets (as xml) the "IncidentName" element
         */
        org.apache.xmlbeans.XmlString xgetIncidentName();
        
        /**
         * Sets the "IncidentName" element
         */
        void setIncidentName(java.lang.String incidentName);
        
        /**
         * Sets (as xml) the "IncidentName" element
         */
        void xsetIncidentName(org.apache.xmlbeans.XmlString incidentName);
        
        /**
         * Gets the "DatePrepared" element
         */
        java.util.Calendar getDatePrepared();
        
        /**
         * Gets (as xml) the "DatePrepared" element
         */
        org.apache.xmlbeans.XmlDateTime xgetDatePrepared();
        
        /**
         * Sets the "DatePrepared" element
         */
        void setDatePrepared(java.util.Calendar datePrepared);
        
        /**
         * Sets (as xml) the "DatePrepared" element
         */
        void xsetDatePrepared(org.apache.xmlbeans.XmlDateTime datePrepared);
        
        /**
         * Gets the "TimePrepared" element
         */
        java.util.Calendar getTimePrepared();
        
        /**
         * Gets (as xml) the "TimePrepared" element
         */
        org.apache.xmlbeans.XmlDateTime xgetTimePrepared();
        
        /**
         * Sets the "TimePrepared" element
         */
        void setTimePrepared(java.util.Calendar timePrepared);
        
        /**
         * Sets (as xml) the "TimePrepared" element
         */
        void xsetTimePrepared(org.apache.xmlbeans.XmlDateTime timePrepared);
        
        /**
         * Gets the "OperationalPeriod" element
         */
        java.util.Calendar getOperationalPeriod();
        
        /**
         * Gets (as xml) the "OperationalPeriod" element
         */
        org.apache.xmlbeans.XmlDateTime xgetOperationalPeriod();
        
        /**
         * Sets the "OperationalPeriod" element
         */
        void setOperationalPeriod(java.util.Calendar operationalPeriod);
        
        /**
         * Sets (as xml) the "OperationalPeriod" element
         */
        void xsetOperationalPeriod(org.apache.xmlbeans.XmlDateTime operationalPeriod);
        
        /**
         * Gets the "IncidentMedicalAidStation" element
         */
        org.uicds.icsForm206.IncidentMedicalAidStationType getIncidentMedicalAidStation();
        
        /**
         * Sets the "IncidentMedicalAidStation" element
         */
        void setIncidentMedicalAidStation(org.uicds.icsForm206.IncidentMedicalAidStationType incidentMedicalAidStation);
        
        /**
         * Appends and returns a new empty "IncidentMedicalAidStation" element
         */
        org.uicds.icsForm206.IncidentMedicalAidStationType addNewIncidentMedicalAidStation();
        
        /**
         * Gets array of all "AmbulanceServices" elements
         */
        org.uicds.icsForm206.AmbulanceServicesType[] getAmbulanceServicesArray();
        
        /**
         * Gets ith "AmbulanceServices" element
         */
        org.uicds.icsForm206.AmbulanceServicesType getAmbulanceServicesArray(int i);
        
        /**
         * Returns number of "AmbulanceServices" element
         */
        int sizeOfAmbulanceServicesArray();
        
        /**
         * Sets array of all "AmbulanceServices" element
         */
        void setAmbulanceServicesArray(org.uicds.icsForm206.AmbulanceServicesType[] ambulanceServicesArray);
        
        /**
         * Sets ith "AmbulanceServices" element
         */
        void setAmbulanceServicesArray(int i, org.uicds.icsForm206.AmbulanceServicesType ambulanceServices);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AmbulanceServices" element
         */
        org.uicds.icsForm206.AmbulanceServicesType insertNewAmbulanceServices(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AmbulanceServices" element
         */
        org.uicds.icsForm206.AmbulanceServicesType addNewAmbulanceServices();
        
        /**
         * Removes the ith "AmbulanceServices" element
         */
        void removeAmbulanceServices(int i);
        
        /**
         * Gets array of all "IncidentAmbulances" elements
         */
        org.uicds.icsForm206.IncidentAmbulancesType[] getIncidentAmbulancesArray();
        
        /**
         * Gets ith "IncidentAmbulances" element
         */
        org.uicds.icsForm206.IncidentAmbulancesType getIncidentAmbulancesArray(int i);
        
        /**
         * Returns number of "IncidentAmbulances" element
         */
        int sizeOfIncidentAmbulancesArray();
        
        /**
         * Sets array of all "IncidentAmbulances" element
         */
        void setIncidentAmbulancesArray(org.uicds.icsForm206.IncidentAmbulancesType[] incidentAmbulancesArray);
        
        /**
         * Sets ith "IncidentAmbulances" element
         */
        void setIncidentAmbulancesArray(int i, org.uicds.icsForm206.IncidentAmbulancesType incidentAmbulances);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IncidentAmbulances" element
         */
        org.uicds.icsForm206.IncidentAmbulancesType insertNewIncidentAmbulances(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IncidentAmbulances" element
         */
        org.uicds.icsForm206.IncidentAmbulancesType addNewIncidentAmbulances();
        
        /**
         * Removes the ith "IncidentAmbulances" element
         */
        void removeIncidentAmbulances(int i);
        
        /**
         * Gets array of all "Hospitals" elements
         */
        org.uicds.icsForm206.HospitalsType[] getHospitalsArray();
        
        /**
         * Gets ith "Hospitals" element
         */
        org.uicds.icsForm206.HospitalsType getHospitalsArray(int i);
        
        /**
         * Returns number of "Hospitals" element
         */
        int sizeOfHospitalsArray();
        
        /**
         * Sets array of all "Hospitals" element
         */
        void setHospitalsArray(org.uicds.icsForm206.HospitalsType[] hospitalsArray);
        
        /**
         * Sets ith "Hospitals" element
         */
        void setHospitalsArray(int i, org.uicds.icsForm206.HospitalsType hospitals);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Hospitals" element
         */
        org.uicds.icsForm206.HospitalsType insertNewHospitals(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Hospitals" element
         */
        org.uicds.icsForm206.HospitalsType addNewHospitals();
        
        /**
         * Removes the ith "Hospitals" element
         */
        void removeHospitals(int i);
        
        /**
         * Gets the "MedicalEmergencyProcedures" element
         */
        java.lang.String getMedicalEmergencyProcedures();
        
        /**
         * Gets (as xml) the "MedicalEmergencyProcedures" element
         */
        org.apache.xmlbeans.XmlString xgetMedicalEmergencyProcedures();
        
        /**
         * Sets the "MedicalEmergencyProcedures" element
         */
        void setMedicalEmergencyProcedures(java.lang.String medicalEmergencyProcedures);
        
        /**
         * Sets (as xml) the "MedicalEmergencyProcedures" element
         */
        void xsetMedicalEmergencyProcedures(org.apache.xmlbeans.XmlString medicalEmergencyProcedures);
        
        /**
         * Gets the "PreparedBy" element
         */
        java.lang.String getPreparedBy();
        
        /**
         * Gets (as xml) the "PreparedBy" element
         */
        org.apache.xmlbeans.XmlString xgetPreparedBy();
        
        /**
         * Sets the "PreparedBy" element
         */
        void setPreparedBy(java.lang.String preparedBy);
        
        /**
         * Sets (as xml) the "PreparedBy" element
         */
        void xsetPreparedBy(org.apache.xmlbeans.XmlString preparedBy);
        
        /**
         * Gets the "ReviewedBy" element
         */
        java.lang.String getReviewedBy();
        
        /**
         * Gets (as xml) the "ReviewedBy" element
         */
        org.apache.xmlbeans.XmlString xgetReviewedBy();
        
        /**
         * Sets the "ReviewedBy" element
         */
        void setReviewedBy(java.lang.String reviewedBy);
        
        /**
         * Sets (as xml) the "ReviewedBy" element
         */
        void xsetReviewedBy(org.apache.xmlbeans.XmlString reviewedBy);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm206.ICSForm206Document.ICSForm206 newInstance() {
              return (org.uicds.icsForm206.ICSForm206Document.ICSForm206) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm206.ICSForm206Document.ICSForm206 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm206.ICSForm206Document.ICSForm206) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm206.ICSForm206Document newInstance() {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm206.ICSForm206Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm206.ICSForm206Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm206.ICSForm206Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm206.ICSForm206Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm206.ICSForm206Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm206.ICSForm206Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm206.ICSForm206Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
