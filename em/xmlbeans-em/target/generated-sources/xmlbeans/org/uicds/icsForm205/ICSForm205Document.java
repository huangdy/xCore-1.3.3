/*
 * An XML document type.
 * Localname: ICSForm205
 * Namespace: http://uicds.org/ICSForm205
 * Java type: org.uicds.icsForm205.ICSForm205Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm205;


/**
 * A document containing one ICSForm205(@http://uicds.org/ICSForm205) element.
 *
 * This is a complex type.
 */
public interface ICSForm205Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm205Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform2055ddadoctype");
    
    /**
     * Gets the "ICSForm205" element
     */
    org.uicds.icsForm205.ICSForm205Document.ICSForm205 getICSForm205();
    
    /**
     * Sets the "ICSForm205" element
     */
    void setICSForm205(org.uicds.icsForm205.ICSForm205Document.ICSForm205 icsForm205);
    
    /**
     * Appends and returns a new empty "ICSForm205" element
     */
    org.uicds.icsForm205.ICSForm205Document.ICSForm205 addNewICSForm205();
    
    /**
     * An XML ICSForm205(@http://uicds.org/ICSForm205).
     *
     * This is a complex type.
     */
    public interface ICSForm205 extends org.uicds.icsFormCommon.ICSFormDocumentType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm205.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform205ca44elemtype");
        
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
         * Gets the "DateTimePrepared" element
         */
        java.util.Calendar getDateTimePrepared();
        
        /**
         * Gets (as xml) the "DateTimePrepared" element
         */
        org.apache.xmlbeans.XmlDateTime xgetDateTimePrepared();
        
        /**
         * Sets the "DateTimePrepared" element
         */
        void setDateTimePrepared(java.util.Calendar dateTimePrepared);
        
        /**
         * Sets (as xml) the "DateTimePrepared" element
         */
        void xsetDateTimePrepared(org.apache.xmlbeans.XmlDateTime dateTimePrepared);
        
        /**
         * Gets the "OperationalPeriodDateTime" element
         */
        java.util.Calendar getOperationalPeriodDateTime();
        
        /**
         * Gets (as xml) the "OperationalPeriodDateTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetOperationalPeriodDateTime();
        
        /**
         * Sets the "OperationalPeriodDateTime" element
         */
        void setOperationalPeriodDateTime(java.util.Calendar operationalPeriodDateTime);
        
        /**
         * Sets (as xml) the "OperationalPeriodDateTime" element
         */
        void xsetOperationalPeriodDateTime(org.apache.xmlbeans.XmlDateTime operationalPeriodDateTime);
        
        /**
         * Gets array of all "BasicRadioChannelUtilization" elements
         */
        org.uicds.icsForm205.BasicRadioChannelUtilizationType[] getBasicRadioChannelUtilizationArray();
        
        /**
         * Gets ith "BasicRadioChannelUtilization" element
         */
        org.uicds.icsForm205.BasicRadioChannelUtilizationType getBasicRadioChannelUtilizationArray(int i);
        
        /**
         * Returns number of "BasicRadioChannelUtilization" element
         */
        int sizeOfBasicRadioChannelUtilizationArray();
        
        /**
         * Sets array of all "BasicRadioChannelUtilization" element
         */
        void setBasicRadioChannelUtilizationArray(org.uicds.icsForm205.BasicRadioChannelUtilizationType[] basicRadioChannelUtilizationArray);
        
        /**
         * Sets ith "BasicRadioChannelUtilization" element
         */
        void setBasicRadioChannelUtilizationArray(int i, org.uicds.icsForm205.BasicRadioChannelUtilizationType basicRadioChannelUtilization);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BasicRadioChannelUtilization" element
         */
        org.uicds.icsForm205.BasicRadioChannelUtilizationType insertNewBasicRadioChannelUtilization(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BasicRadioChannelUtilization" element
         */
        org.uicds.icsForm205.BasicRadioChannelUtilizationType addNewBasicRadioChannelUtilization();
        
        /**
         * Removes the ith "BasicRadioChannelUtilization" element
         */
        void removeBasicRadioChannelUtilization(int i);
        
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
            public static org.uicds.icsForm205.ICSForm205Document.ICSForm205 newInstance() {
              return (org.uicds.icsForm205.ICSForm205Document.ICSForm205) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm205.ICSForm205Document.ICSForm205 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm205.ICSForm205Document.ICSForm205) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm205.ICSForm205Document newInstance() {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm205.ICSForm205Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm205.ICSForm205Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm205.ICSForm205Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm205.ICSForm205Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm205.ICSForm205Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm205.ICSForm205Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm205.ICSForm205Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
