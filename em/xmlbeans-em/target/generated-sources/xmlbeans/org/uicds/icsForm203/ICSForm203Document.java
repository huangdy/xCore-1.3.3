/*
 * An XML document type.
 * Localname: ICSForm203
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.ICSForm203Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203;


/**
 * A document containing one ICSForm203(@http://uicds.org/ICSForm203) element.
 *
 * This is a complex type.
 */
public interface ICSForm203Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm203Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform20394d6doctype");
    
    /**
     * Gets the "ICSForm203" element
     */
    org.uicds.icsForm203.ICSForm203Document.ICSForm203 getICSForm203();
    
    /**
     * Sets the "ICSForm203" element
     */
    void setICSForm203(org.uicds.icsForm203.ICSForm203Document.ICSForm203 icsForm203);
    
    /**
     * Appends and returns a new empty "ICSForm203" element
     */
    org.uicds.icsForm203.ICSForm203Document.ICSForm203 addNewICSForm203();
    
    /**
     * An XML ICSForm203(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public interface ICSForm203 extends org.uicds.icsFormCommon.ICSFormDocumentType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm203.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform2039702elemtype");
        
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
        org.apache.xmlbeans.XmlDate xgetDatePrepared();
        
        /**
         * Sets the "DatePrepared" element
         */
        void setDatePrepared(java.util.Calendar datePrepared);
        
        /**
         * Sets (as xml) the "DatePrepared" element
         */
        void xsetDatePrepared(org.apache.xmlbeans.XmlDate datePrepared);
        
        /**
         * Gets the "TimePrepared" element
         */
        java.util.Calendar getTimePrepared();
        
        /**
         * Gets (as xml) the "TimePrepared" element
         */
        org.apache.xmlbeans.XmlTime xgetTimePrepared();
        
        /**
         * Sets the "TimePrepared" element
         */
        void setTimePrepared(java.util.Calendar timePrepared);
        
        /**
         * Sets (as xml) the "TimePrepared" element
         */
        void xsetTimePrepared(org.apache.xmlbeans.XmlTime timePrepared);
        
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
         * Gets the "IncidentCommandAndStaff" element
         */
        org.uicds.icsForm203.IncidentCommandAndStaffType getIncidentCommandAndStaff();
        
        /**
         * Sets the "IncidentCommandAndStaff" element
         */
        void setIncidentCommandAndStaff(org.uicds.icsForm203.IncidentCommandAndStaffType incidentCommandAndStaff);
        
        /**
         * Appends and returns a new empty "IncidentCommandAndStaff" element
         */
        org.uicds.icsForm203.IncidentCommandAndStaffType addNewIncidentCommandAndStaff();
        
        /**
         * Gets array of all "AgencyRepresentatives" elements
         */
        org.uicds.icsForm203.AgencyRepresentativeType[] getAgencyRepresentativesArray();
        
        /**
         * Gets ith "AgencyRepresentatives" element
         */
        org.uicds.icsForm203.AgencyRepresentativeType getAgencyRepresentativesArray(int i);
        
        /**
         * Returns number of "AgencyRepresentatives" element
         */
        int sizeOfAgencyRepresentativesArray();
        
        /**
         * Sets array of all "AgencyRepresentatives" element
         */
        void setAgencyRepresentativesArray(org.uicds.icsForm203.AgencyRepresentativeType[] agencyRepresentativesArray);
        
        /**
         * Sets ith "AgencyRepresentatives" element
         */
        void setAgencyRepresentativesArray(int i, org.uicds.icsForm203.AgencyRepresentativeType agencyRepresentatives);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AgencyRepresentatives" element
         */
        org.uicds.icsForm203.AgencyRepresentativeType insertNewAgencyRepresentatives(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AgencyRepresentatives" element
         */
        org.uicds.icsForm203.AgencyRepresentativeType addNewAgencyRepresentatives();
        
        /**
         * Removes the ith "AgencyRepresentatives" element
         */
        void removeAgencyRepresentatives(int i);
        
        /**
         * Gets the "PlanningSection" element
         */
        org.uicds.icsForm203.PlanningSectionType getPlanningSection();
        
        /**
         * Sets the "PlanningSection" element
         */
        void setPlanningSection(org.uicds.icsForm203.PlanningSectionType planningSection);
        
        /**
         * Appends and returns a new empty "PlanningSection" element
         */
        org.uicds.icsForm203.PlanningSectionType addNewPlanningSection();
        
        /**
         * Gets the "LogisticsSection" element
         */
        org.uicds.icsForm203.LogisticsSectionType getLogisticsSection();
        
        /**
         * Sets the "LogisticsSection" element
         */
        void setLogisticsSection(org.uicds.icsForm203.LogisticsSectionType logisticsSection);
        
        /**
         * Appends and returns a new empty "LogisticsSection" element
         */
        org.uicds.icsForm203.LogisticsSectionType addNewLogisticsSection();
        
        /**
         * Gets the "OperationsSection" element
         */
        org.uicds.icsForm203.OperationsSectionType getOperationsSection();
        
        /**
         * Sets the "OperationsSection" element
         */
        void setOperationsSection(org.uicds.icsForm203.OperationsSectionType operationsSection);
        
        /**
         * Appends and returns a new empty "OperationsSection" element
         */
        org.uicds.icsForm203.OperationsSectionType addNewOperationsSection();
        
        /**
         * Gets the "FinanceAdministrationSection" element
         */
        org.uicds.icsForm203.FinanceAdministrationSectionType getFinanceAdministrationSection();
        
        /**
         * Sets the "FinanceAdministrationSection" element
         */
        void setFinanceAdministrationSection(org.uicds.icsForm203.FinanceAdministrationSectionType financeAdministrationSection);
        
        /**
         * Appends and returns a new empty "FinanceAdministrationSection" element
         */
        org.uicds.icsForm203.FinanceAdministrationSectionType addNewFinanceAdministrationSection();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm203.ICSForm203Document.ICSForm203 newInstance() {
              return (org.uicds.icsForm203.ICSForm203Document.ICSForm203) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm203.ICSForm203Document.ICSForm203 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm203.ICSForm203Document.ICSForm203) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm203.ICSForm203Document newInstance() {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm203.ICSForm203Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm203.ICSForm203Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm203.ICSForm203Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm203.ICSForm203Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.ICSForm203Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.ICSForm203Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.ICSForm203Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
