/*
 * XML Type:  CheckInInformationType
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.CheckInInformationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211;


/**
 * An XML CheckInInformationType(@http://uicds.org/ICSForm211).
 *
 * This is a complex type.
 */
public interface CheckInInformationType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckInInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("checkininformationtype56c4type");
    
    /**
     * Gets the "Agency" element
     */
    boolean getAgency();
    
    /**
     * Gets (as xml) the "Agency" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAgency();
    
    /**
     * Sets the "Agency" element
     */
    void setAgency(boolean agency);
    
    /**
     * Sets (as xml) the "Agency" element
     */
    void xsetAgency(org.apache.xmlbeans.XmlBoolean agency);
    
    /**
     * Gets the "Single" element
     */
    boolean getSingle();
    
    /**
     * Gets (as xml) the "Single" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSingle();
    
    /**
     * Sets the "Single" element
     */
    void setSingle(boolean single);
    
    /**
     * Sets (as xml) the "Single" element
     */
    void xsetSingle(org.apache.xmlbeans.XmlBoolean single);
    
    /**
     * Gets the "Kind" element
     */
    boolean getKind();
    
    /**
     * Gets (as xml) the "Kind" element
     */
    org.apache.xmlbeans.XmlBoolean xgetKind();
    
    /**
     * Sets the "Kind" element
     */
    void setKind(boolean kind);
    
    /**
     * Sets (as xml) the "Kind" element
     */
    void xsetKind(org.apache.xmlbeans.XmlBoolean kind);
    
    /**
     * Gets the "Type" element
     */
    boolean getType();
    
    /**
     * Gets (as xml) the "Type" element
     */
    org.apache.xmlbeans.XmlBoolean xgetType();
    
    /**
     * Sets the "Type" element
     */
    void setType(boolean type);
    
    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(org.apache.xmlbeans.XmlBoolean type);
    
    /**
     * Gets the "IDName" element
     */
    java.lang.String getIDName();
    
    /**
     * Gets (as xml) the "IDName" element
     */
    org.apache.xmlbeans.XmlString xgetIDName();
    
    /**
     * Sets the "IDName" element
     */
    void setIDName(java.lang.String idName);
    
    /**
     * Sets (as xml) the "IDName" element
     */
    void xsetIDName(org.apache.xmlbeans.XmlString idName);
    
    /**
     * Gets the "OrderRequestNumber" element
     */
    java.lang.String getOrderRequestNumber();
    
    /**
     * Gets (as xml) the "OrderRequestNumber" element
     */
    org.apache.xmlbeans.XmlString xgetOrderRequestNumber();
    
    /**
     * Sets the "OrderRequestNumber" element
     */
    void setOrderRequestNumber(java.lang.String orderRequestNumber);
    
    /**
     * Sets (as xml) the "OrderRequestNumber" element
     */
    void xsetOrderRequestNumber(org.apache.xmlbeans.XmlString orderRequestNumber);
    
    /**
     * Gets the "DateTimeCheckIn" element
     */
    java.util.Calendar getDateTimeCheckIn();
    
    /**
     * Gets (as xml) the "DateTimeCheckIn" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateTimeCheckIn();
    
    /**
     * Sets the "DateTimeCheckIn" element
     */
    void setDateTimeCheckIn(java.util.Calendar dateTimeCheckIn);
    
    /**
     * Sets (as xml) the "DateTimeCheckIn" element
     */
    void xsetDateTimeCheckIn(org.apache.xmlbeans.XmlDateTime dateTimeCheckIn);
    
    /**
     * Gets the "LeaderName" element
     */
    java.lang.String getLeaderName();
    
    /**
     * Gets (as xml) the "LeaderName" element
     */
    org.apache.xmlbeans.XmlString xgetLeaderName();
    
    /**
     * Sets the "LeaderName" element
     */
    void setLeaderName(java.lang.String leaderName);
    
    /**
     * Sets (as xml) the "LeaderName" element
     */
    void xsetLeaderName(org.apache.xmlbeans.XmlString leaderName);
    
    /**
     * Gets the "TotalNumberPersonnel" element
     */
    java.math.BigInteger getTotalNumberPersonnel();
    
    /**
     * Gets (as xml) the "TotalNumberPersonnel" element
     */
    org.apache.xmlbeans.XmlInteger xgetTotalNumberPersonnel();
    
    /**
     * Sets the "TotalNumberPersonnel" element
     */
    void setTotalNumberPersonnel(java.math.BigInteger totalNumberPersonnel);
    
    /**
     * Sets (as xml) the "TotalNumberPersonnel" element
     */
    void xsetTotalNumberPersonnel(org.apache.xmlbeans.XmlInteger totalNumberPersonnel);
    
    /**
     * Gets the "Manifest" element
     */
    boolean getManifest();
    
    /**
     * Gets (as xml) the "Manifest" element
     */
    org.apache.xmlbeans.XmlBoolean xgetManifest();
    
    /**
     * Sets the "Manifest" element
     */
    void setManifest(boolean manifest);
    
    /**
     * Sets (as xml) the "Manifest" element
     */
    void xsetManifest(org.apache.xmlbeans.XmlBoolean manifest);
    
    /**
     * Gets the "CrewWeight" element
     */
    java.lang.String getCrewWeight();
    
    /**
     * Gets (as xml) the "CrewWeight" element
     */
    org.apache.xmlbeans.XmlString xgetCrewWeight();
    
    /**
     * Sets the "CrewWeight" element
     */
    void setCrewWeight(java.lang.String crewWeight);
    
    /**
     * Sets (as xml) the "CrewWeight" element
     */
    void xsetCrewWeight(org.apache.xmlbeans.XmlString crewWeight);
    
    /**
     * Gets the "HomeBase" element
     */
    java.lang.String getHomeBase();
    
    /**
     * Gets (as xml) the "HomeBase" element
     */
    org.apache.xmlbeans.XmlString xgetHomeBase();
    
    /**
     * Sets the "HomeBase" element
     */
    void setHomeBase(java.lang.String homeBase);
    
    /**
     * Sets (as xml) the "HomeBase" element
     */
    void xsetHomeBase(org.apache.xmlbeans.XmlString homeBase);
    
    /**
     * Gets the "DeparturePoint" element
     */
    java.lang.String getDeparturePoint();
    
    /**
     * Gets (as xml) the "DeparturePoint" element
     */
    org.apache.xmlbeans.XmlString xgetDeparturePoint();
    
    /**
     * Sets the "DeparturePoint" element
     */
    void setDeparturePoint(java.lang.String departurePoint);
    
    /**
     * Sets (as xml) the "DeparturePoint" element
     */
    void xsetDeparturePoint(org.apache.xmlbeans.XmlString departurePoint);
    
    /**
     * Gets the "MethodOfTravel" element
     */
    java.lang.String getMethodOfTravel();
    
    /**
     * Gets (as xml) the "MethodOfTravel" element
     */
    org.apache.xmlbeans.XmlString xgetMethodOfTravel();
    
    /**
     * Sets the "MethodOfTravel" element
     */
    void setMethodOfTravel(java.lang.String methodOfTravel);
    
    /**
     * Sets (as xml) the "MethodOfTravel" element
     */
    void xsetMethodOfTravel(org.apache.xmlbeans.XmlString methodOfTravel);
    
    /**
     * Gets the "IncidentAssignment" element
     */
    java.lang.String getIncidentAssignment();
    
    /**
     * Gets (as xml) the "IncidentAssignment" element
     */
    org.apache.xmlbeans.XmlString xgetIncidentAssignment();
    
    /**
     * Sets the "IncidentAssignment" element
     */
    void setIncidentAssignment(java.lang.String incidentAssignment);
    
    /**
     * Sets (as xml) the "IncidentAssignment" element
     */
    void xsetIncidentAssignment(org.apache.xmlbeans.XmlString incidentAssignment);
    
    /**
     * Gets the "OtherQualifications" element
     */
    java.lang.String getOtherQualifications();
    
    /**
     * Gets (as xml) the "OtherQualifications" element
     */
    org.apache.xmlbeans.XmlString xgetOtherQualifications();
    
    /**
     * Sets the "OtherQualifications" element
     */
    void setOtherQualifications(java.lang.String otherQualifications);
    
    /**
     * Sets (as xml) the "OtherQualifications" element
     */
    void xsetOtherQualifications(org.apache.xmlbeans.XmlString otherQualifications);
    
    /**
     * Gets the "SentToRestat" element
     */
    java.lang.String getSentToRestat();
    
    /**
     * Gets (as xml) the "SentToRestat" element
     */
    org.apache.xmlbeans.XmlString xgetSentToRestat();
    
    /**
     * Sets the "SentToRestat" element
     */
    void setSentToRestat(java.lang.String sentToRestat);
    
    /**
     * Sets (as xml) the "SentToRestat" element
     */
    void xsetSentToRestat(org.apache.xmlbeans.XmlString sentToRestat);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm211.CheckInInformationType newInstance() {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm211.CheckInInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm211.CheckInInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm211.CheckInInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm211.CheckInInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm211.CheckInInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm211.CheckInInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm211.CheckInInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
