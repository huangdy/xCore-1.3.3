/*
 * An XML document type.
 * Localname: ICSForm202
 * Namespace: http://uicds.org/ICSForm202
 * Java type: org.uicds.icsForm202.ICSForm202Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm202;


/**
 * A document containing one ICSForm202(@http://uicds.org/ICSForm202) element.
 *
 * This is a complex type.
 */
public interface ICSForm202Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm202Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform202b054doctype");
    
    /**
     * Gets the "ICSForm202" element
     */
    org.uicds.icsForm202.ICSForm202Document.ICSForm202 getICSForm202();
    
    /**
     * Sets the "ICSForm202" element
     */
    void setICSForm202(org.uicds.icsForm202.ICSForm202Document.ICSForm202 icsForm202);
    
    /**
     * Appends and returns a new empty "ICSForm202" element
     */
    org.uicds.icsForm202.ICSForm202Document.ICSForm202 addNewICSForm202();
    
    /**
     * An XML ICSForm202(@http://uicds.org/ICSForm202).
     *
     * This is a complex type.
     */
    public interface ICSForm202 extends org.uicds.icsFormCommon.ICSFormDocumentType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm202.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform2027d61elemtype");
        
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
         * Gets the "ContractorObjectives" element
         */
        java.lang.String getContractorObjectives();
        
        /**
         * Gets (as xml) the "ContractorObjectives" element
         */
        org.apache.xmlbeans.XmlString xgetContractorObjectives();
        
        /**
         * Sets the "ContractorObjectives" element
         */
        void setContractorObjectives(java.lang.String contractorObjectives);
        
        /**
         * Sets (as xml) the "ContractorObjectives" element
         */
        void xsetContractorObjectives(org.apache.xmlbeans.XmlString contractorObjectives);
        
        /**
         * Gets the "WeatherForecast" element
         */
        java.lang.String getWeatherForecast();
        
        /**
         * Gets (as xml) the "WeatherForecast" element
         */
        org.apache.xmlbeans.XmlString xgetWeatherForecast();
        
        /**
         * Sets the "WeatherForecast" element
         */
        void setWeatherForecast(java.lang.String weatherForecast);
        
        /**
         * Sets (as xml) the "WeatherForecast" element
         */
        void xsetWeatherForecast(org.apache.xmlbeans.XmlString weatherForecast);
        
        /**
         * Gets the "GeneralSafetyMessage" element
         */
        java.lang.String getGeneralSafetyMessage();
        
        /**
         * Gets (as xml) the "GeneralSafetyMessage" element
         */
        org.apache.xmlbeans.XmlString xgetGeneralSafetyMessage();
        
        /**
         * Sets the "GeneralSafetyMessage" element
         */
        void setGeneralSafetyMessage(java.lang.String generalSafetyMessage);
        
        /**
         * Sets (as xml) the "GeneralSafetyMessage" element
         */
        void xsetGeneralSafetyMessage(org.apache.xmlbeans.XmlString generalSafetyMessage);
        
        /**
         * Gets the "AttachmentList" element
         */
        org.uicds.icsForm202.Attachments getAttachmentList();
        
        /**
         * Sets the "AttachmentList" element
         */
        void setAttachmentList(org.uicds.icsForm202.Attachments attachmentList);
        
        /**
         * Appends and returns a new empty "AttachmentList" element
         */
        org.uicds.icsForm202.Attachments addNewAttachmentList();
        
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
            public static org.uicds.icsForm202.ICSForm202Document.ICSForm202 newInstance() {
              return (org.uicds.icsForm202.ICSForm202Document.ICSForm202) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm202.ICSForm202Document.ICSForm202 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm202.ICSForm202Document.ICSForm202) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm202.ICSForm202Document newInstance() {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm202.ICSForm202Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm202.ICSForm202Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm202.ICSForm202Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm202.ICSForm202Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm202.ICSForm202Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm202.ICSForm202Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm202.ICSForm202Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
