/*
 * An XML document type.
 * Localname: ICSForm204
 * Namespace: http://uicds.org/ICSForm204
 * Java type: org.uicds.icsForm204.ICSForm204Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm204;


/**
 * A document containing one ICSForm204(@http://uicds.org/ICSForm204) element.
 *
 * This is a complex type.
 */
public interface ICSForm204Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm204Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform2047958doctype");
    
    /**
     * Gets the "ICSForm204" element
     */
    org.uicds.icsForm204.ICSForm204Document.ICSForm204 getICSForm204();
    
    /**
     * Sets the "ICSForm204" element
     */
    void setICSForm204(org.uicds.icsForm204.ICSForm204Document.ICSForm204 icsForm204);
    
    /**
     * Appends and returns a new empty "ICSForm204" element
     */
    org.uicds.icsForm204.ICSForm204Document.ICSForm204 addNewICSForm204();
    
    /**
     * An XML ICSForm204(@http://uicds.org/ICSForm204).
     *
     * This is a complex type.
     */
    public interface ICSForm204 extends org.uicds.icsFormCommon.ICSFormDocumentType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm204.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform204b0a3elemtype");
        
        /**
         * Gets the "Branch" element
         */
        java.lang.String getBranch();
        
        /**
         * Gets (as xml) the "Branch" element
         */
        org.apache.xmlbeans.XmlString xgetBranch();
        
        /**
         * Sets the "Branch" element
         */
        void setBranch(java.lang.String branch);
        
        /**
         * Sets (as xml) the "Branch" element
         */
        void xsetBranch(org.apache.xmlbeans.XmlString branch);
        
        /**
         * Gets the "DivisionGroup" element
         */
        java.lang.String getDivisionGroup();
        
        /**
         * Gets (as xml) the "DivisionGroup" element
         */
        org.apache.xmlbeans.XmlString xgetDivisionGroup();
        
        /**
         * Sets the "DivisionGroup" element
         */
        void setDivisionGroup(java.lang.String divisionGroup);
        
        /**
         * Sets (as xml) the "DivisionGroup" element
         */
        void xsetDivisionGroup(org.apache.xmlbeans.XmlString divisionGroup);
        
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
         * Gets the "OperationalPeriodDate" element
         */
        java.util.Calendar getOperationalPeriodDate();
        
        /**
         * Gets (as xml) the "OperationalPeriodDate" element
         */
        org.apache.xmlbeans.XmlDate xgetOperationalPeriodDate();
        
        /**
         * Sets the "OperationalPeriodDate" element
         */
        void setOperationalPeriodDate(java.util.Calendar operationalPeriodDate);
        
        /**
         * Sets (as xml) the "OperationalPeriodDate" element
         */
        void xsetOperationalPeriodDate(org.apache.xmlbeans.XmlDate operationalPeriodDate);
        
        /**
         * Gets the "OperationalPeriodTime" element
         */
        java.util.Calendar getOperationalPeriodTime();
        
        /**
         * Gets (as xml) the "OperationalPeriodTime" element
         */
        org.apache.xmlbeans.XmlTime xgetOperationalPeriodTime();
        
        /**
         * Sets the "OperationalPeriodTime" element
         */
        void setOperationalPeriodTime(java.util.Calendar operationalPeriodTime);
        
        /**
         * Sets (as xml) the "OperationalPeriodTime" element
         */
        void xsetOperationalPeriodTime(org.apache.xmlbeans.XmlTime operationalPeriodTime);
        
        /**
         * Gets the "OperationsChief" element
         */
        java.lang.String getOperationsChief();
        
        /**
         * Gets (as xml) the "OperationsChief" element
         */
        org.apache.xmlbeans.XmlString xgetOperationsChief();
        
        /**
         * Sets the "OperationsChief" element
         */
        void setOperationsChief(java.lang.String operationsChief);
        
        /**
         * Sets (as xml) the "OperationsChief" element
         */
        void xsetOperationsChief(org.apache.xmlbeans.XmlString operationsChief);
        
        /**
         * Gets the "BranchDirector" element
         */
        java.lang.String getBranchDirector();
        
        /**
         * Gets (as xml) the "BranchDirector" element
         */
        org.apache.xmlbeans.XmlString xgetBranchDirector();
        
        /**
         * Sets the "BranchDirector" element
         */
        void setBranchDirector(java.lang.String branchDirector);
        
        /**
         * Sets (as xml) the "BranchDirector" element
         */
        void xsetBranchDirector(org.apache.xmlbeans.XmlString branchDirector);
        
        /**
         * Gets the "DivisionGroupSupervisor" element
         */
        java.lang.String getDivisionGroupSupervisor();
        
        /**
         * Gets (as xml) the "DivisionGroupSupervisor" element
         */
        org.apache.xmlbeans.XmlString xgetDivisionGroupSupervisor();
        
        /**
         * Sets the "DivisionGroupSupervisor" element
         */
        void setDivisionGroupSupervisor(java.lang.String divisionGroupSupervisor);
        
        /**
         * Sets (as xml) the "DivisionGroupSupervisor" element
         */
        void xsetDivisionGroupSupervisor(org.apache.xmlbeans.XmlString divisionGroupSupervisor);
        
        /**
         * Gets the "AirTacticalGroupSupervisor" element
         */
        java.lang.String getAirTacticalGroupSupervisor();
        
        /**
         * Gets (as xml) the "AirTacticalGroupSupervisor" element
         */
        org.apache.xmlbeans.XmlString xgetAirTacticalGroupSupervisor();
        
        /**
         * Sets the "AirTacticalGroupSupervisor" element
         */
        void setAirTacticalGroupSupervisor(java.lang.String airTacticalGroupSupervisor);
        
        /**
         * Sets (as xml) the "AirTacticalGroupSupervisor" element
         */
        void xsetAirTacticalGroupSupervisor(org.apache.xmlbeans.XmlString airTacticalGroupSupervisor);
        
        /**
         * Gets array of all "ResourcesAssigned" elements
         */
        org.uicds.icsForm204.ResourceAssignmentType[] getResourcesAssignedArray();
        
        /**
         * Gets ith "ResourcesAssigned" element
         */
        org.uicds.icsForm204.ResourceAssignmentType getResourcesAssignedArray(int i);
        
        /**
         * Returns number of "ResourcesAssigned" element
         */
        int sizeOfResourcesAssignedArray();
        
        /**
         * Sets array of all "ResourcesAssigned" element
         */
        void setResourcesAssignedArray(org.uicds.icsForm204.ResourceAssignmentType[] resourcesAssignedArray);
        
        /**
         * Sets ith "ResourcesAssigned" element
         */
        void setResourcesAssignedArray(int i, org.uicds.icsForm204.ResourceAssignmentType resourcesAssigned);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ResourcesAssigned" element
         */
        org.uicds.icsForm204.ResourceAssignmentType insertNewResourcesAssigned(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResourcesAssigned" element
         */
        org.uicds.icsForm204.ResourceAssignmentType addNewResourcesAssigned();
        
        /**
         * Removes the ith "ResourcesAssigned" element
         */
        void removeResourcesAssigned(int i);
        
        /**
         * Gets the "ControlOperations" element
         */
        java.lang.String getControlOperations();
        
        /**
         * Gets (as xml) the "ControlOperations" element
         */
        org.apache.xmlbeans.XmlString xgetControlOperations();
        
        /**
         * Sets the "ControlOperations" element
         */
        void setControlOperations(java.lang.String controlOperations);
        
        /**
         * Sets (as xml) the "ControlOperations" element
         */
        void xsetControlOperations(org.apache.xmlbeans.XmlString controlOperations);
        
        /**
         * Gets the "SpecialInstructions" element
         */
        java.lang.String getSpecialInstructions();
        
        /**
         * Gets (as xml) the "SpecialInstructions" element
         */
        org.apache.xmlbeans.XmlString xgetSpecialInstructions();
        
        /**
         * Sets the "SpecialInstructions" element
         */
        void setSpecialInstructions(java.lang.String specialInstructions);
        
        /**
         * Sets (as xml) the "SpecialInstructions" element
         */
        void xsetSpecialInstructions(org.apache.xmlbeans.XmlString specialInstructions);
        
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
         * Gets the "ApprovedBy" element
         */
        java.lang.String getApprovedBy();
        
        /**
         * Gets (as xml) the "ApprovedBy" element
         */
        org.apache.xmlbeans.XmlString xgetApprovedBy();
        
        /**
         * Sets the "ApprovedBy" element
         */
        void setApprovedBy(java.lang.String approvedBy);
        
        /**
         * Sets (as xml) the "ApprovedBy" element
         */
        void xsetApprovedBy(org.apache.xmlbeans.XmlString approvedBy);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm204.ICSForm204Document.ICSForm204 newInstance() {
              return (org.uicds.icsForm204.ICSForm204Document.ICSForm204) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm204.ICSForm204Document.ICSForm204 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm204.ICSForm204Document.ICSForm204) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm204.ICSForm204Document newInstance() {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm204.ICSForm204Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm204.ICSForm204Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm204.ICSForm204Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm204.ICSForm204Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm204.ICSForm204Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm204.ICSForm204Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm204.ICSForm204Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
