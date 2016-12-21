/*
 * An XML document type.
 * Localname: ICSForm209
 * Namespace: http://uicds.org/ICSForm209
 * Java type: org.uicds.icsForm209.ICSForm209Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm209;


/**
 * A document containing one ICSForm209(@http://uicds.org/ICSForm209) element.
 *
 * This is a complex type.
 */
public interface ICSForm209Document extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm209Document.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform209efe2doctype");
    
    /**
     * Gets the "ICSForm209" element
     */
    org.uicds.icsForm209.ICSForm209Document.ICSForm209 getICSForm209();
    
    /**
     * Sets the "ICSForm209" element
     */
    void setICSForm209(org.uicds.icsForm209.ICSForm209Document.ICSForm209 icsForm209);
    
    /**
     * Appends and returns a new empty "ICSForm209" element
     */
    org.uicds.icsForm209.ICSForm209Document.ICSForm209 addNewICSForm209();
    
    /**
     * An XML ICSForm209(@http://uicds.org/ICSForm209).
     *
     * This is a complex type.
     */
    public interface ICSForm209 extends org.uicds.icsFormCommon.ICSFormDocumentType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ICSForm209.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("icsform20930c8elemtype");
        
        /**
         * Gets the "IncidentDateTime" element
         */
        java.util.Calendar getIncidentDateTime();
        
        /**
         * Gets (as xml) the "IncidentDateTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetIncidentDateTime();
        
        /**
         * Sets the "IncidentDateTime" element
         */
        void setIncidentDateTime(java.util.Calendar incidentDateTime);
        
        /**
         * Sets (as xml) the "IncidentDateTime" element
         */
        void xsetIncidentDateTime(org.apache.xmlbeans.XmlDateTime incidentDateTime);
        
        /**
         * Gets the "Initial" element
         */
        boolean getInitial();
        
        /**
         * Gets (as xml) the "Initial" element
         */
        org.apache.xmlbeans.XmlBoolean xgetInitial();
        
        /**
         * Sets the "Initial" element
         */
        void setInitial(boolean initial);
        
        /**
         * Sets (as xml) the "Initial" element
         */
        void xsetInitial(org.apache.xmlbeans.XmlBoolean initial);
        
        /**
         * Gets the "Update" element
         */
        boolean getUpdate();
        
        /**
         * Gets (as xml) the "Update" element
         */
        org.apache.xmlbeans.XmlBoolean xgetUpdate();
        
        /**
         * Sets the "Update" element
         */
        void setUpdate(boolean update);
        
        /**
         * Sets (as xml) the "Update" element
         */
        void xsetUpdate(org.apache.xmlbeans.XmlBoolean update);
        
        /**
         * Gets the "Final" element
         */
        boolean getFinal();
        
        /**
         * Gets (as xml) the "Final" element
         */
        org.apache.xmlbeans.XmlBoolean xgetFinal();
        
        /**
         * Sets the "Final" element
         */
        void setFinal(boolean xfinal);
        
        /**
         * Sets (as xml) the "Final" element
         */
        void xsetFinal(org.apache.xmlbeans.XmlBoolean xfinal);
        
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
         * Gets the "IncidentNumber" element
         */
        java.lang.String getIncidentNumber();
        
        /**
         * Gets (as xml) the "IncidentNumber" element
         */
        org.apache.xmlbeans.XmlString xgetIncidentNumber();
        
        /**
         * Sets the "IncidentNumber" element
         */
        void setIncidentNumber(java.lang.String incidentNumber);
        
        /**
         * Sets (as xml) the "IncidentNumber" element
         */
        void xsetIncidentNumber(org.apache.xmlbeans.XmlString incidentNumber);
        
        /**
         * Gets the "IncidentCommander" element
         */
        java.lang.String getIncidentCommander();
        
        /**
         * Gets (as xml) the "IncidentCommander" element
         */
        org.apache.xmlbeans.XmlString xgetIncidentCommander();
        
        /**
         * Sets the "IncidentCommander" element
         */
        void setIncidentCommander(java.lang.String incidentCommander);
        
        /**
         * Sets (as xml) the "IncidentCommander" element
         */
        void xsetIncidentCommander(org.apache.xmlbeans.XmlString incidentCommander);
        
        /**
         * Gets the "Jurisdiction" element
         */
        java.lang.String getJurisdiction();
        
        /**
         * Gets (as xml) the "Jurisdiction" element
         */
        org.apache.xmlbeans.XmlString xgetJurisdiction();
        
        /**
         * Sets the "Jurisdiction" element
         */
        void setJurisdiction(java.lang.String jurisdiction);
        
        /**
         * Sets (as xml) the "Jurisdiction" element
         */
        void xsetJurisdiction(org.apache.xmlbeans.XmlString jurisdiction);
        
        /**
         * Gets the "County" element
         */
        java.lang.String getCounty();
        
        /**
         * Gets (as xml) the "County" element
         */
        org.apache.xmlbeans.XmlString xgetCounty();
        
        /**
         * Sets the "County" element
         */
        void setCounty(java.lang.String county);
        
        /**
         * Sets (as xml) the "County" element
         */
        void xsetCounty(org.apache.xmlbeans.XmlString county);
        
        /**
         * Gets the "TypeIncident" element
         */
        java.lang.String getTypeIncident();
        
        /**
         * Gets (as xml) the "TypeIncident" element
         */
        org.apache.xmlbeans.XmlString xgetTypeIncident();
        
        /**
         * Sets the "TypeIncident" element
         */
        void setTypeIncident(java.lang.String typeIncident);
        
        /**
         * Sets (as xml) the "TypeIncident" element
         */
        void xsetTypeIncident(org.apache.xmlbeans.XmlString typeIncident);
        
        /**
         * Gets the "Location" element
         */
        java.lang.String getLocation();
        
        /**
         * Gets (as xml) the "Location" element
         */
        org.apache.xmlbeans.XmlString xgetLocation();
        
        /**
         * Sets the "Location" element
         */
        void setLocation(java.lang.String location);
        
        /**
         * Sets (as xml) the "Location" element
         */
        void xsetLocation(org.apache.xmlbeans.XmlString location);
        
        /**
         * Gets the "StartedDateTime" element
         */
        java.util.Calendar getStartedDateTime();
        
        /**
         * Gets (as xml) the "StartedDateTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetStartedDateTime();
        
        /**
         * Sets the "StartedDateTime" element
         */
        void setStartedDateTime(java.util.Calendar startedDateTime);
        
        /**
         * Sets (as xml) the "StartedDateTime" element
         */
        void xsetStartedDateTime(org.apache.xmlbeans.XmlDateTime startedDateTime);
        
        /**
         * Gets the "Cause" element
         */
        java.lang.String getCause();
        
        /**
         * Gets (as xml) the "Cause" element
         */
        org.apache.xmlbeans.XmlString xgetCause();
        
        /**
         * Sets the "Cause" element
         */
        void setCause(java.lang.String cause);
        
        /**
         * Sets (as xml) the "Cause" element
         */
        void xsetCause(org.apache.xmlbeans.XmlString cause);
        
        /**
         * Gets the "AreaInvolved" element
         */
        java.lang.String getAreaInvolved();
        
        /**
         * Gets (as xml) the "AreaInvolved" element
         */
        org.apache.xmlbeans.XmlString xgetAreaInvolved();
        
        /**
         * Sets the "AreaInvolved" element
         */
        void setAreaInvolved(java.lang.String areaInvolved);
        
        /**
         * Sets (as xml) the "AreaInvolved" element
         */
        void xsetAreaInvolved(org.apache.xmlbeans.XmlString areaInvolved);
        
        /**
         * Gets the "PercentControlled" element
         */
        java.lang.String getPercentControlled();
        
        /**
         * Gets (as xml) the "PercentControlled" element
         */
        org.apache.xmlbeans.XmlString xgetPercentControlled();
        
        /**
         * Sets the "PercentControlled" element
         */
        void setPercentControlled(java.lang.String percentControlled);
        
        /**
         * Sets (as xml) the "PercentControlled" element
         */
        void xsetPercentControlled(org.apache.xmlbeans.XmlString percentControlled);
        
        /**
         * Gets the "ExpectedContainmentDateTime" element
         */
        java.util.Calendar getExpectedContainmentDateTime();
        
        /**
         * Gets (as xml) the "ExpectedContainmentDateTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetExpectedContainmentDateTime();
        
        /**
         * Sets the "ExpectedContainmentDateTime" element
         */
        void setExpectedContainmentDateTime(java.util.Calendar expectedContainmentDateTime);
        
        /**
         * Sets (as xml) the "ExpectedContainmentDateTime" element
         */
        void xsetExpectedContainmentDateTime(org.apache.xmlbeans.XmlDateTime expectedContainmentDateTime);
        
        /**
         * Gets the "EstimatedControlledDateTime" element
         */
        java.util.Calendar getEstimatedControlledDateTime();
        
        /**
         * Gets (as xml) the "EstimatedControlledDateTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetEstimatedControlledDateTime();
        
        /**
         * Sets the "EstimatedControlledDateTime" element
         */
        void setEstimatedControlledDateTime(java.util.Calendar estimatedControlledDateTime);
        
        /**
         * Sets (as xml) the "EstimatedControlledDateTime" element
         */
        void xsetEstimatedControlledDateTime(org.apache.xmlbeans.XmlDateTime estimatedControlledDateTime);
        
        /**
         * Gets the "DeclaredControlledDateTime" element
         */
        java.util.Calendar getDeclaredControlledDateTime();
        
        /**
         * Gets (as xml) the "DeclaredControlledDateTime" element
         */
        org.apache.xmlbeans.XmlDateTime xgetDeclaredControlledDateTime();
        
        /**
         * Sets the "DeclaredControlledDateTime" element
         */
        void setDeclaredControlledDateTime(java.util.Calendar declaredControlledDateTime);
        
        /**
         * Sets (as xml) the "DeclaredControlledDateTime" element
         */
        void xsetDeclaredControlledDateTime(org.apache.xmlbeans.XmlDateTime declaredControlledDateTime);
        
        /**
         * Gets the "CurrentThreat" element
         */
        java.lang.String getCurrentThreat();
        
        /**
         * Gets (as xml) the "CurrentThreat" element
         */
        org.apache.xmlbeans.XmlString xgetCurrentThreat();
        
        /**
         * Sets the "CurrentThreat" element
         */
        void setCurrentThreat(java.lang.String currentThreat);
        
        /**
         * Sets (as xml) the "CurrentThreat" element
         */
        void xsetCurrentThreat(org.apache.xmlbeans.XmlString currentThreat);
        
        /**
         * Gets the "ControlProblems" element
         */
        java.lang.String getControlProblems();
        
        /**
         * Gets (as xml) the "ControlProblems" element
         */
        org.apache.xmlbeans.XmlString xgetControlProblems();
        
        /**
         * Sets the "ControlProblems" element
         */
        void setControlProblems(java.lang.String controlProblems);
        
        /**
         * Sets (as xml) the "ControlProblems" element
         */
        void xsetControlProblems(org.apache.xmlbeans.XmlString controlProblems);
        
        /**
         * Gets the "EstLoss" element
         */
        java.lang.String getEstLoss();
        
        /**
         * Gets (as xml) the "EstLoss" element
         */
        org.apache.xmlbeans.XmlString xgetEstLoss();
        
        /**
         * Sets the "EstLoss" element
         */
        void setEstLoss(java.lang.String estLoss);
        
        /**
         * Sets (as xml) the "EstLoss" element
         */
        void xsetEstLoss(org.apache.xmlbeans.XmlString estLoss);
        
        /**
         * Gets the "EstSavings" element
         */
        java.lang.String getEstSavings();
        
        /**
         * Gets (as xml) the "EstSavings" element
         */
        org.apache.xmlbeans.XmlString xgetEstSavings();
        
        /**
         * Sets the "EstSavings" element
         */
        void setEstSavings(java.lang.String estSavings);
        
        /**
         * Sets (as xml) the "EstSavings" element
         */
        void xsetEstSavings(org.apache.xmlbeans.XmlString estSavings);
        
        /**
         * Gets the "Injuries" element
         */
        java.lang.String getInjuries();
        
        /**
         * Gets (as xml) the "Injuries" element
         */
        org.apache.xmlbeans.XmlString xgetInjuries();
        
        /**
         * Sets the "Injuries" element
         */
        void setInjuries(java.lang.String injuries);
        
        /**
         * Sets (as xml) the "Injuries" element
         */
        void xsetInjuries(org.apache.xmlbeans.XmlString injuries);
        
        /**
         * Gets the "Deaths" element
         */
        java.lang.String getDeaths();
        
        /**
         * Gets (as xml) the "Deaths" element
         */
        org.apache.xmlbeans.XmlString xgetDeaths();
        
        /**
         * Sets the "Deaths" element
         */
        void setDeaths(java.lang.String deaths);
        
        /**
         * Sets (as xml) the "Deaths" element
         */
        void xsetDeaths(org.apache.xmlbeans.XmlString deaths);
        
        /**
         * Gets the "LineBuilt" element
         */
        java.lang.String getLineBuilt();
        
        /**
         * Gets (as xml) the "LineBuilt" element
         */
        org.apache.xmlbeans.XmlString xgetLineBuilt();
        
        /**
         * Sets the "LineBuilt" element
         */
        void setLineBuilt(java.lang.String lineBuilt);
        
        /**
         * Sets (as xml) the "LineBuilt" element
         */
        void xsetLineBuilt(org.apache.xmlbeans.XmlString lineBuilt);
        
        /**
         * Gets the "LineToBuild" element
         */
        java.lang.String getLineToBuild();
        
        /**
         * Gets (as xml) the "LineToBuild" element
         */
        org.apache.xmlbeans.XmlString xgetLineToBuild();
        
        /**
         * Sets the "LineToBuild" element
         */
        void setLineToBuild(java.lang.String lineToBuild);
        
        /**
         * Sets (as xml) the "LineToBuild" element
         */
        void xsetLineToBuild(org.apache.xmlbeans.XmlString lineToBuild);
        
        /**
         * Gets the "CurrentWeatherWS" element
         */
        java.lang.String getCurrentWeatherWS();
        
        /**
         * Gets (as xml) the "CurrentWeatherWS" element
         */
        org.apache.xmlbeans.XmlString xgetCurrentWeatherWS();
        
        /**
         * Sets the "CurrentWeatherWS" element
         */
        void setCurrentWeatherWS(java.lang.String currentWeatherWS);
        
        /**
         * Sets (as xml) the "CurrentWeatherWS" element
         */
        void xsetCurrentWeatherWS(org.apache.xmlbeans.XmlString currentWeatherWS);
        
        /**
         * Gets the "CurrentWeatherWD" element
         */
        java.lang.String getCurrentWeatherWD();
        
        /**
         * Gets (as xml) the "CurrentWeatherWD" element
         */
        org.apache.xmlbeans.XmlString xgetCurrentWeatherWD();
        
        /**
         * Sets the "CurrentWeatherWD" element
         */
        void setCurrentWeatherWD(java.lang.String currentWeatherWD);
        
        /**
         * Sets (as xml) the "CurrentWeatherWD" element
         */
        void xsetCurrentWeatherWD(org.apache.xmlbeans.XmlString currentWeatherWD);
        
        /**
         * Gets the "CurrentWeatherTemp" element
         */
        java.lang.String getCurrentWeatherTemp();
        
        /**
         * Gets (as xml) the "CurrentWeatherTemp" element
         */
        org.apache.xmlbeans.XmlString xgetCurrentWeatherTemp();
        
        /**
         * Sets the "CurrentWeatherTemp" element
         */
        void setCurrentWeatherTemp(java.lang.String currentWeatherTemp);
        
        /**
         * Sets (as xml) the "CurrentWeatherTemp" element
         */
        void xsetCurrentWeatherTemp(org.apache.xmlbeans.XmlString currentWeatherTemp);
        
        /**
         * Gets the "CurrentWeatherRH" element
         */
        java.lang.String getCurrentWeatherRH();
        
        /**
         * Gets (as xml) the "CurrentWeatherRH" element
         */
        org.apache.xmlbeans.XmlString xgetCurrentWeatherRH();
        
        /**
         * Sets the "CurrentWeatherRH" element
         */
        void setCurrentWeatherRH(java.lang.String currentWeatherRH);
        
        /**
         * Sets (as xml) the "CurrentWeatherRH" element
         */
        void xsetCurrentWeatherRH(org.apache.xmlbeans.XmlString currentWeatherRH);
        
        /**
         * Gets the "PredictedWeatherWS" element
         */
        java.lang.String getPredictedWeatherWS();
        
        /**
         * Gets (as xml) the "PredictedWeatherWS" element
         */
        org.apache.xmlbeans.XmlString xgetPredictedWeatherWS();
        
        /**
         * Sets the "PredictedWeatherWS" element
         */
        void setPredictedWeatherWS(java.lang.String predictedWeatherWS);
        
        /**
         * Sets (as xml) the "PredictedWeatherWS" element
         */
        void xsetPredictedWeatherWS(org.apache.xmlbeans.XmlString predictedWeatherWS);
        
        /**
         * Gets the "PredictedWeatherWD" element
         */
        java.lang.String getPredictedWeatherWD();
        
        /**
         * Gets (as xml) the "PredictedWeatherWD" element
         */
        org.apache.xmlbeans.XmlString xgetPredictedWeatherWD();
        
        /**
         * Sets the "PredictedWeatherWD" element
         */
        void setPredictedWeatherWD(java.lang.String predictedWeatherWD);
        
        /**
         * Sets (as xml) the "PredictedWeatherWD" element
         */
        void xsetPredictedWeatherWD(org.apache.xmlbeans.XmlString predictedWeatherWD);
        
        /**
         * Gets the "PredictedWeatherTemp" element
         */
        java.lang.String getPredictedWeatherTemp();
        
        /**
         * Gets (as xml) the "PredictedWeatherTemp" element
         */
        org.apache.xmlbeans.XmlString xgetPredictedWeatherTemp();
        
        /**
         * Sets the "PredictedWeatherTemp" element
         */
        void setPredictedWeatherTemp(java.lang.String predictedWeatherTemp);
        
        /**
         * Sets (as xml) the "PredictedWeatherTemp" element
         */
        void xsetPredictedWeatherTemp(org.apache.xmlbeans.XmlString predictedWeatherTemp);
        
        /**
         * Gets the "PredictedWeatherRH" element
         */
        java.lang.String getPredictedWeatherRH();
        
        /**
         * Gets (as xml) the "PredictedWeatherRH" element
         */
        org.apache.xmlbeans.XmlString xgetPredictedWeatherRH();
        
        /**
         * Sets the "PredictedWeatherRH" element
         */
        void setPredictedWeatherRH(java.lang.String predictedWeatherRH);
        
        /**
         * Sets (as xml) the "PredictedWeatherRH" element
         */
        void xsetPredictedWeatherRH(org.apache.xmlbeans.XmlString predictedWeatherRH);
        
        /**
         * Gets the "CostToDate" element
         */
        java.lang.String getCostToDate();
        
        /**
         * Gets (as xml) the "CostToDate" element
         */
        org.apache.xmlbeans.XmlString xgetCostToDate();
        
        /**
         * Sets the "CostToDate" element
         */
        void setCostToDate(java.lang.String costToDate);
        
        /**
         * Sets (as xml) the "CostToDate" element
         */
        void xsetCostToDate(org.apache.xmlbeans.XmlString costToDate);
        
        /**
         * Gets the "EstTotalCost" element
         */
        java.lang.String getEstTotalCost();
        
        /**
         * Gets (as xml) the "EstTotalCost" element
         */
        org.apache.xmlbeans.XmlString xgetEstTotalCost();
        
        /**
         * Sets the "EstTotalCost" element
         */
        void setEstTotalCost(java.lang.String estTotalCost);
        
        /**
         * Sets (as xml) the "EstTotalCost" element
         */
        void xsetEstTotalCost(org.apache.xmlbeans.XmlString estTotalCost);
        
        /**
         * Gets the "CooperatingAgencies" element
         */
        java.lang.String getCooperatingAgencies();
        
        /**
         * Gets (as xml) the "CooperatingAgencies" element
         */
        org.apache.xmlbeans.XmlString xgetCooperatingAgencies();
        
        /**
         * Sets the "CooperatingAgencies" element
         */
        void setCooperatingAgencies(java.lang.String cooperatingAgencies);
        
        /**
         * Sets (as xml) the "CooperatingAgencies" element
         */
        void xsetCooperatingAgencies(org.apache.xmlbeans.XmlString cooperatingAgencies);
        
        /**
         * Gets the "Remarks" element
         */
        java.lang.String getRemarks();
        
        /**
         * Gets (as xml) the "Remarks" element
         */
        org.apache.xmlbeans.XmlString xgetRemarks();
        
        /**
         * Sets the "Remarks" element
         */
        void setRemarks(java.lang.String remarks);
        
        /**
         * Sets (as xml) the "Remarks" element
         */
        void xsetRemarks(org.apache.xmlbeans.XmlString remarks);
        
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
         * Gets the "SentToDate" element
         */
        java.lang.String getSentToDate();
        
        /**
         * Gets (as xml) the "SentToDate" element
         */
        org.apache.xmlbeans.XmlString xgetSentToDate();
        
        /**
         * Sets the "SentToDate" element
         */
        void setSentToDate(java.lang.String sentToDate);
        
        /**
         * Sets (as xml) the "SentToDate" element
         */
        void xsetSentToDate(org.apache.xmlbeans.XmlString sentToDate);
        
        /**
         * Gets the "SentToTime" element
         */
        java.lang.String getSentToTime();
        
        /**
         * Gets (as xml) the "SentToTime" element
         */
        org.apache.xmlbeans.XmlString xgetSentToTime();
        
        /**
         * Sets the "SentToTime" element
         */
        void setSentToTime(java.lang.String sentToTime);
        
        /**
         * Sets (as xml) the "SentToTime" element
         */
        void xsetSentToTime(org.apache.xmlbeans.XmlString sentToTime);
        
        /**
         * Gets the "SentToBy" element
         */
        java.lang.String getSentToBy();
        
        /**
         * Gets (as xml) the "SentToBy" element
         */
        org.apache.xmlbeans.XmlString xgetSentToBy();
        
        /**
         * Sets the "SentToBy" element
         */
        void setSentToBy(java.lang.String sentToBy);
        
        /**
         * Sets (as xml) the "SentToBy" element
         */
        void xsetSentToBy(org.apache.xmlbeans.XmlString sentToBy);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm209.ICSForm209Document.ICSForm209 newInstance() {
              return (org.uicds.icsForm209.ICSForm209Document.ICSForm209) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm209.ICSForm209Document.ICSForm209 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm209.ICSForm209Document.ICSForm209) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm209.ICSForm209Document newInstance() {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm209.ICSForm209Document newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm209.ICSForm209Document parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm209.ICSForm209Document parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm209.ICSForm209Document parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm209.ICSForm209Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm209.ICSForm209Document parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm209.ICSForm209Document) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
