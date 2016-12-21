/*
 * XML Type:  PartyNameType
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.PartyNameType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3;


/**
 * An XML PartyNameType(@urn:oasis:names:tc:ciq:xnl:3).
 *
 * This is a complex type.
 */
public interface PartyNameType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PartyNameType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("partynametypeec1dtype");
    
    /**
     * Gets array of all "NameLine" elements
     */
    oasisNamesTcCiqXnl3.NameLineDocument.NameLine[] getNameLineArray();
    
    /**
     * Gets ith "NameLine" element
     */
    oasisNamesTcCiqXnl3.NameLineDocument.NameLine getNameLineArray(int i);
    
    /**
     * Returns number of "NameLine" element
     */
    int sizeOfNameLineArray();
    
    /**
     * Sets array of all "NameLine" element
     */
    void setNameLineArray(oasisNamesTcCiqXnl3.NameLineDocument.NameLine[] nameLineArray);
    
    /**
     * Sets ith "NameLine" element
     */
    void setNameLineArray(int i, oasisNamesTcCiqXnl3.NameLineDocument.NameLine nameLine);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameLine" element
     */
    oasisNamesTcCiqXnl3.NameLineDocument.NameLine insertNewNameLine(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameLine" element
     */
    oasisNamesTcCiqXnl3.NameLineDocument.NameLine addNewNameLine();
    
    /**
     * Removes the ith "NameLine" element
     */
    void removeNameLine(int i);
    
    /**
     * Gets array of all "PersonName" elements
     */
    oasisNamesTcCiqXnl3.PartyNameType.PersonName[] getPersonNameArray();
    
    /**
     * Gets ith "PersonName" element
     */
    oasisNamesTcCiqXnl3.PartyNameType.PersonName getPersonNameArray(int i);
    
    /**
     * Returns number of "PersonName" element
     */
    int sizeOfPersonNameArray();
    
    /**
     * Sets array of all "PersonName" element
     */
    void setPersonNameArray(oasisNamesTcCiqXnl3.PartyNameType.PersonName[] personNameArray);
    
    /**
     * Sets ith "PersonName" element
     */
    void setPersonNameArray(int i, oasisNamesTcCiqXnl3.PartyNameType.PersonName personName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonName" element
     */
    oasisNamesTcCiqXnl3.PartyNameType.PersonName insertNewPersonName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonName" element
     */
    oasisNamesTcCiqXnl3.PartyNameType.PersonName addNewPersonName();
    
    /**
     * Removes the ith "PersonName" element
     */
    void removePersonName(int i);
    
    /**
     * Gets array of all "OrganisationName" elements
     */
    oasisNamesTcCiqXnl3.PartyNameType.OrganisationName[] getOrganisationNameArray();
    
    /**
     * Gets ith "OrganisationName" element
     */
    oasisNamesTcCiqXnl3.PartyNameType.OrganisationName getOrganisationNameArray(int i);
    
    /**
     * Returns number of "OrganisationName" element
     */
    int sizeOfOrganisationNameArray();
    
    /**
     * Sets array of all "OrganisationName" element
     */
    void setOrganisationNameArray(oasisNamesTcCiqXnl3.PartyNameType.OrganisationName[] organisationNameArray);
    
    /**
     * Sets ith "OrganisationName" element
     */
    void setOrganisationNameArray(int i, oasisNamesTcCiqXnl3.PartyNameType.OrganisationName organisationName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationName" element
     */
    oasisNamesTcCiqXnl3.PartyNameType.OrganisationName insertNewOrganisationName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationName" element
     */
    oasisNamesTcCiqXnl3.PartyNameType.OrganisationName addNewOrganisationName();
    
    /**
     * Removes the ith "OrganisationName" element
     */
    void removeOrganisationName(int i);
    
    /**
     * Gets the "PartyNameID" attribute
     */
    java.lang.String getPartyNameID();
    
    /**
     * Gets (as xml) the "PartyNameID" attribute
     */
    oasisNamesTcCiqCt3.String xgetPartyNameID();
    
    /**
     * True if has "PartyNameID" attribute
     */
    boolean isSetPartyNameID();
    
    /**
     * Sets the "PartyNameID" attribute
     */
    void setPartyNameID(java.lang.String partyNameID);
    
    /**
     * Sets (as xml) the "PartyNameID" attribute
     */
    void xsetPartyNameID(oasisNamesTcCiqCt3.String partyNameID);
    
    /**
     * Unsets the "PartyNameID" attribute
     */
    void unsetPartyNameID();
    
    /**
     * Gets the "PartyNameIDType" attribute
     */
    java.lang.String getPartyNameIDType();
    
    /**
     * Gets (as xml) the "PartyNameIDType" attribute
     */
    oasisNamesTcCiqXnl3.PartyNameIDTypeList xgetPartyNameIDType();
    
    /**
     * True if has "PartyNameIDType" attribute
     */
    boolean isSetPartyNameIDType();
    
    /**
     * Sets the "PartyNameIDType" attribute
     */
    void setPartyNameIDType(java.lang.String partyNameIDType);
    
    /**
     * Sets (as xml) the "PartyNameIDType" attribute
     */
    void xsetPartyNameIDType(oasisNamesTcCiqXnl3.PartyNameIDTypeList partyNameIDType);
    
    /**
     * Unsets the "PartyNameIDType" attribute
     */
    void unsetPartyNameIDType();
    
    /**
     * Gets the "ID" attribute
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    oasisNamesTcCiqCt3.String xgetID();
    
    /**
     * True if has "ID" attribute
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(oasisNamesTcCiqCt3.String id);
    
    /**
     * Unsets the "ID" attribute
     */
    void unsetID();
    
    /**
     * Gets the "Usage" attribute
     */
    java.lang.String getUsage();
    
    /**
     * Gets (as xml) the "Usage" attribute
     */
    oasisNamesTcCiqXnl3.PartyNameUsageList xgetUsage();
    
    /**
     * True if has "Usage" attribute
     */
    boolean isSetUsage();
    
    /**
     * Sets the "Usage" attribute
     */
    void setUsage(java.lang.String usage);
    
    /**
     * Sets (as xml) the "Usage" attribute
     */
    void xsetUsage(oasisNamesTcCiqXnl3.PartyNameUsageList usage);
    
    /**
     * Unsets the "Usage" attribute
     */
    void unsetUsage();
    
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
     * Gets the "JointNameConnector" attribute
     */
    java.lang.String getJointNameConnector();
    
    /**
     * Gets (as xml) the "JointNameConnector" attribute
     */
    oasisNamesTcCiqXnl3.JointNameConnectorList xgetJointNameConnector();
    
    /**
     * True if has "JointNameConnector" attribute
     */
    boolean isSetJointNameConnector();
    
    /**
     * Sets the "JointNameConnector" attribute
     */
    void setJointNameConnector(java.lang.String jointNameConnector);
    
    /**
     * Sets (as xml) the "JointNameConnector" attribute
     */
    void xsetJointNameConnector(oasisNamesTcCiqXnl3.JointNameConnectorList jointNameConnector);
    
    /**
     * Unsets the "JointNameConnector" attribute
     */
    void unsetJointNameConnector();
    
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
     * Gets the "NameKey" attribute
     */
    java.lang.String getNameKey();
    
    /**
     * Gets (as xml) the "NameKey" attribute
     */
    oasisNamesTcCiqCt3.String xgetNameKey();
    
    /**
     * True if has "NameKey" attribute
     */
    boolean isSetNameKey();
    
    /**
     * Sets the "NameKey" attribute
     */
    void setNameKey(java.lang.String nameKey);
    
    /**
     * Sets (as xml) the "NameKey" attribute
     */
    void xsetNameKey(oasisNamesTcCiqCt3.String nameKey);
    
    /**
     * Unsets the "NameKey" attribute
     */
    void unsetNameKey();
    
    /**
     * Gets the "NameKeyRef" attribute
     */
    java.lang.String getNameKeyRef();
    
    /**
     * Gets (as xml) the "NameKeyRef" attribute
     */
    oasisNamesTcCiqCt3.String xgetNameKeyRef();
    
    /**
     * True if has "NameKeyRef" attribute
     */
    boolean isSetNameKeyRef();
    
    /**
     * Sets the "NameKeyRef" attribute
     */
    void setNameKeyRef(java.lang.String nameKeyRef);
    
    /**
     * Sets (as xml) the "NameKeyRef" attribute
     */
    void xsetNameKeyRef(oasisNamesTcCiqCt3.String nameKeyRef);
    
    /**
     * Unsets the "NameKeyRef" attribute
     */
    void unsetNameKeyRef();
    
    /**
     * Gets the "type" attribute
     */
    org.w3.x1999.xlink1.TypeAttribute.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.w3.x1999.xlink1.TypeAttribute.Type xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.w3.x1999.xlink1.TypeAttribute.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.w3.x1999.xlink1.TypeAttribute.Type type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "label" attribute
     */
    java.lang.String getLabel();
    
    /**
     * Gets (as xml) the "label" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetLabel();
    
    /**
     * True if has "label" attribute
     */
    boolean isSetLabel();
    
    /**
     * Sets the "label" attribute
     */
    void setLabel(java.lang.String label);
    
    /**
     * Sets (as xml) the "label" attribute
     */
    void xsetLabel(org.apache.xmlbeans.XmlNCName label);
    
    /**
     * Unsets the "label" attribute
     */
    void unsetLabel();
    
    /**
     * Gets the "href" attribute
     */
    java.lang.String getHref();
    
    /**
     * Gets (as xml) the "href" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetHref();
    
    /**
     * True if has "href" attribute
     */
    boolean isSetHref();
    
    /**
     * Sets the "href" attribute
     */
    void setHref(java.lang.String href);
    
    /**
     * Sets (as xml) the "href" attribute
     */
    void xsetHref(org.apache.xmlbeans.XmlAnyURI href);
    
    /**
     * Unsets the "href" attribute
     */
    void unsetHref();
    
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
     * Gets the "LanguageCode" attribute
     */
    java.lang.String getLanguageCode();
    
    /**
     * Gets (as xml) the "LanguageCode" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLanguageCode();
    
    /**
     * True if has "LanguageCode" attribute
     */
    boolean isSetLanguageCode();
    
    /**
     * Sets the "LanguageCode" attribute
     */
    void setLanguageCode(java.lang.String languageCode);
    
    /**
     * Sets (as xml) the "LanguageCode" attribute
     */
    void xsetLanguageCode(org.apache.xmlbeans.XmlLanguage languageCode);
    
    /**
     * Unsets the "LanguageCode" attribute
     */
    void unsetLanguageCode();
    
    /**
     * An XML PersonName(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is a complex type.
     */
    public interface PersonName extends oasisNamesTcCiqXnl3.PersonNameType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("personnameff61elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXnl3.PartyNameType.PersonName newInstance() {
              return (oasisNamesTcCiqXnl3.PartyNameType.PersonName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXnl3.PartyNameType.PersonName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXnl3.PartyNameType.PersonName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML OrganisationName(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is a complex type.
     */
    public interface OrganisationName extends oasisNamesTcCiqXnl3.OrganisationNameType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("organisationname327celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXnl3.PartyNameType.OrganisationName newInstance() {
              return (oasisNamesTcCiqXnl3.PartyNameType.OrganisationName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXnl3.PartyNameType.OrganisationName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXnl3.PartyNameType.OrganisationName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXnl3.PartyNameType newInstance() {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXnl3.PartyNameType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.PartyNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXnl3.PartyNameType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXnl3.PartyNameType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
