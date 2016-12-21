/*
 * An XML document type.
 * Localname: ICSForm201
 * Namespace: http://uicds.org/ICSForm201
 * Java type: org.uicds.icsForm201.ICSForm201Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm201;


/**
 * A document containing one ICSForm201(@http://uicds.org/ICSForm201) element.
 *
 * This is a complex type.
 */
public interface ICSForm201Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm201Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform201cbd2doctype");
    
    /**
     * Gets the "ICSForm201" element
     */
    org.uicds.icsForm201.ICSForm201Document.ICSForm201 getICSForm201();
    
    /**
     * Sets the "ICSForm201" element
     */
    void setICSForm201(org.uicds.icsForm201.ICSForm201Document.ICSForm201 icsForm201);
    
    /**
     * Appends and returns a new empty "ICSForm201" element
     */
    org.uicds.icsForm201.ICSForm201Document.ICSForm201 addNewICSForm201();
    
    /**
     * An XML ICSForm201(@http://uicds.org/ICSForm201).
     *
     * This is a complex type.
     */
    public interface ICSForm201 extends org.uicds.icsFormCommon.ICSFormDocumentType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm201.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform20163c0elemtype");
        
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
         * Gets the "MapSketch" element
         */
        org.uicds.icsForm201.MapSketchType getMapSketch();
        
        /**
         * Sets the "MapSketch" element
         */
        void setMapSketch(org.uicds.icsForm201.MapSketchType mapSketch);
        
        /**
         * Appends and returns a new empty "MapSketch" element
         */
        org.uicds.icsForm201.MapSketchType addNewMapSketch();
        
        /**
         * Gets array of all "ResourcesSummary" elements
         */
        org.uicds.icsForm201.ResourcesSummaryType[] getResourcesSummaryArray();
        
        /**
         * Gets ith "ResourcesSummary" element
         */
        org.uicds.icsForm201.ResourcesSummaryType getResourcesSummaryArray(int i);
        
        /**
         * Returns number of "ResourcesSummary" element
         */
        int sizeOfResourcesSummaryArray();
        
        /**
         * Sets array of all "ResourcesSummary" element
         */
        void setResourcesSummaryArray(org.uicds.icsForm201.ResourcesSummaryType[] resourcesSummaryArray);
        
        /**
         * Sets ith "ResourcesSummary" element
         */
        void setResourcesSummaryArray(int i, org.uicds.icsForm201.ResourcesSummaryType resourcesSummary);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ResourcesSummary" element
         */
        org.uicds.icsForm201.ResourcesSummaryType insertNewResourcesSummary(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResourcesSummary" element
         */
        org.uicds.icsForm201.ResourcesSummaryType addNewResourcesSummary();
        
        /**
         * Removes the ith "ResourcesSummary" element
         */
        void removeResourcesSummary(int i);
        
        /**
         * Gets the "SummaryOfCurrentActions" element
         */
        java.lang.String getSummaryOfCurrentActions();
        
        /**
         * Gets (as xml) the "SummaryOfCurrentActions" element
         */
        org.apache.xmlbeans.XmlString xgetSummaryOfCurrentActions();
        
        /**
         * Sets the "SummaryOfCurrentActions" element
         */
        void setSummaryOfCurrentActions(java.lang.String summaryOfCurrentActions);
        
        /**
         * Sets (as xml) the "SummaryOfCurrentActions" element
         */
        void xsetSummaryOfCurrentActions(org.apache.xmlbeans.XmlString summaryOfCurrentActions);
        
        /**
         * Gets the "CurrentOrganization" element
         */
        org.uicds.organizationElement.OrganizationElementType getCurrentOrganization();
        
        /**
         * Sets the "CurrentOrganization" element
         */
        void setCurrentOrganization(org.uicds.organizationElement.OrganizationElementType currentOrganization);
        
        /**
         * Appends and returns a new empty "CurrentOrganization" element
         */
        org.uicds.organizationElement.OrganizationElementType addNewCurrentOrganization();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm201.ICSForm201Document.ICSForm201 newInstance() {
              return (org.uicds.icsForm201.ICSForm201Document.ICSForm201) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm201.ICSForm201Document.ICSForm201 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm201.ICSForm201Document.ICSForm201) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm201.ICSForm201Document newInstance() {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm201.ICSForm201Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm201.ICSForm201Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm201.ICSForm201Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm201.ICSForm201Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm201.ICSForm201Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm201.ICSForm201Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm201.ICSForm201Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
