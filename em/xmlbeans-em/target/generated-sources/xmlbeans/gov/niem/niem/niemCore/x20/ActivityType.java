/*
 * XML Type:  ActivityType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML ActivityType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface ActivityType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("activitytypea80atype");
    
    /**
     * Gets array of all "ActivityIdentification" elements
     */
    gov.niem.niem.niemCore.x20.IdentificationType[] getActivityIdentificationArray();
    
    /**
     * Gets ith "ActivityIdentification" element
     */
    gov.niem.niem.niemCore.x20.IdentificationType getActivityIdentificationArray(int i);
    
    /**
     * Tests for nil ith "ActivityIdentification" element
     */
    boolean isNilActivityIdentificationArray(int i);
    
    /**
     * Returns number of "ActivityIdentification" element
     */
    int sizeOfActivityIdentificationArray();
    
    /**
     * Sets array of all "ActivityIdentification" element
     */
    void setActivityIdentificationArray(gov.niem.niem.niemCore.x20.IdentificationType[] activityIdentificationArray);
    
    /**
     * Sets ith "ActivityIdentification" element
     */
    void setActivityIdentificationArray(int i, gov.niem.niem.niemCore.x20.IdentificationType activityIdentification);
    
    /**
     * Nils the ith "ActivityIdentification" element
     */
    void setNilActivityIdentificationArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityIdentification" element
     */
    gov.niem.niem.niemCore.x20.IdentificationType insertNewActivityIdentification(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityIdentification" element
     */
    gov.niem.niem.niemCore.x20.IdentificationType addNewActivityIdentification();
    
    /**
     * Removes the ith "ActivityIdentification" element
     */
    void removeActivityIdentification(int i);
    
    /**
     * Gets array of all "ActivityCategoryText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getActivityCategoryTextArray();
    
    /**
     * Gets ith "ActivityCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType getActivityCategoryTextArray(int i);
    
    /**
     * Tests for nil ith "ActivityCategoryText" element
     */
    boolean isNilActivityCategoryTextArray(int i);
    
    /**
     * Returns number of "ActivityCategoryText" element
     */
    int sizeOfActivityCategoryTextArray();
    
    /**
     * Sets array of all "ActivityCategoryText" element
     */
    void setActivityCategoryTextArray(gov.niem.niem.niemCore.x20.TextType[] activityCategoryTextArray);
    
    /**
     * Sets ith "ActivityCategoryText" element
     */
    void setActivityCategoryTextArray(int i, gov.niem.niem.niemCore.x20.TextType activityCategoryText);
    
    /**
     * Nils the ith "ActivityCategoryText" element
     */
    void setNilActivityCategoryTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewActivityCategoryText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewActivityCategoryText();
    
    /**
     * Removes the ith "ActivityCategoryText" element
     */
    void removeActivityCategoryText(int i);
    
    /**
     * Gets array of all "ActivityDateRepresentation" elements
     */
    org.apache.xmlbeans.XmlObject[] getActivityDateRepresentationArray();
    
    /**
     * Gets ith "ActivityDateRepresentation" element
     */
    org.apache.xmlbeans.XmlObject getActivityDateRepresentationArray(int i);
    
    /**
     * Returns number of "ActivityDateRepresentation" element
     */
    int sizeOfActivityDateRepresentationArray();
    
    /**
     * Sets array of all "ActivityDateRepresentation" element
     */
    void setActivityDateRepresentationArray(org.apache.xmlbeans.XmlObject[] activityDateRepresentationArray);
    
    /**
     * Sets ith "ActivityDateRepresentation" element
     */
    void setActivityDateRepresentationArray(int i, org.apache.xmlbeans.XmlObject activityDateRepresentation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityDateRepresentation" element
     */
    org.apache.xmlbeans.XmlObject insertNewActivityDateRepresentation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityDateRepresentation" element
     */
    org.apache.xmlbeans.XmlObject addNewActivityDateRepresentation();
    
    /**
     * Removes the ith "ActivityDateRepresentation" element
     */
    void removeActivityDateRepresentation(int i);
    
    /**
     * Gets array of all "ActivityDescriptionText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getActivityDescriptionTextArray();
    
    /**
     * Gets ith "ActivityDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType getActivityDescriptionTextArray(int i);
    
    /**
     * Tests for nil ith "ActivityDescriptionText" element
     */
    boolean isNilActivityDescriptionTextArray(int i);
    
    /**
     * Returns number of "ActivityDescriptionText" element
     */
    int sizeOfActivityDescriptionTextArray();
    
    /**
     * Sets array of all "ActivityDescriptionText" element
     */
    void setActivityDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] activityDescriptionTextArray);
    
    /**
     * Sets ith "ActivityDescriptionText" element
     */
    void setActivityDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType activityDescriptionText);
    
    /**
     * Nils the ith "ActivityDescriptionText" element
     */
    void setNilActivityDescriptionTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewActivityDescriptionText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewActivityDescriptionText();
    
    /**
     * Removes the ith "ActivityDescriptionText" element
     */
    void removeActivityDescriptionText(int i);
    
    /**
     * Gets array of all "ActivityName" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getActivityNameArray();
    
    /**
     * Gets ith "ActivityName" element
     */
    gov.niem.niem.niemCore.x20.TextType getActivityNameArray(int i);
    
    /**
     * Tests for nil ith "ActivityName" element
     */
    boolean isNilActivityNameArray(int i);
    
    /**
     * Returns number of "ActivityName" element
     */
    int sizeOfActivityNameArray();
    
    /**
     * Sets array of all "ActivityName" element
     */
    void setActivityNameArray(gov.niem.niem.niemCore.x20.TextType[] activityNameArray);
    
    /**
     * Sets ith "ActivityName" element
     */
    void setActivityNameArray(int i, gov.niem.niem.niemCore.x20.TextType activityName);
    
    /**
     * Nils the ith "ActivityName" element
     */
    void setNilActivityNameArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityName" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewActivityName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityName" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewActivityName();
    
    /**
     * Removes the ith "ActivityName" element
     */
    void removeActivityName(int i);
    
    /**
     * Gets array of all "ActivityStatus" elements
     */
    gov.niem.niem.niemCore.x20.StatusType[] getActivityStatusArray();
    
    /**
     * Gets ith "ActivityStatus" element
     */
    gov.niem.niem.niemCore.x20.StatusType getActivityStatusArray(int i);
    
    /**
     * Tests for nil ith "ActivityStatus" element
     */
    boolean isNilActivityStatusArray(int i);
    
    /**
     * Returns number of "ActivityStatus" element
     */
    int sizeOfActivityStatusArray();
    
    /**
     * Sets array of all "ActivityStatus" element
     */
    void setActivityStatusArray(gov.niem.niem.niemCore.x20.StatusType[] activityStatusArray);
    
    /**
     * Sets ith "ActivityStatus" element
     */
    void setActivityStatusArray(int i, gov.niem.niem.niemCore.x20.StatusType activityStatus);
    
    /**
     * Nils the ith "ActivityStatus" element
     */
    void setNilActivityStatusArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityStatus" element
     */
    gov.niem.niem.niemCore.x20.StatusType insertNewActivityStatus(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityStatus" element
     */
    gov.niem.niem.niemCore.x20.StatusType addNewActivityStatus();
    
    /**
     * Removes the ith "ActivityStatus" element
     */
    void removeActivityStatus(int i);
    
    /**
     * Gets array of all "ActivityReasonText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getActivityReasonTextArray();
    
    /**
     * Gets ith "ActivityReasonText" element
     */
    gov.niem.niem.niemCore.x20.TextType getActivityReasonTextArray(int i);
    
    /**
     * Tests for nil ith "ActivityReasonText" element
     */
    boolean isNilActivityReasonTextArray(int i);
    
    /**
     * Returns number of "ActivityReasonText" element
     */
    int sizeOfActivityReasonTextArray();
    
    /**
     * Sets array of all "ActivityReasonText" element
     */
    void setActivityReasonTextArray(gov.niem.niem.niemCore.x20.TextType[] activityReasonTextArray);
    
    /**
     * Sets ith "ActivityReasonText" element
     */
    void setActivityReasonTextArray(int i, gov.niem.niem.niemCore.x20.TextType activityReasonText);
    
    /**
     * Nils the ith "ActivityReasonText" element
     */
    void setNilActivityReasonTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityReasonText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewActivityReasonText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityReasonText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewActivityReasonText();
    
    /**
     * Removes the ith "ActivityReasonText" element
     */
    void removeActivityReasonText(int i);
    
    /**
     * Gets array of all "ActivityDisposition" elements
     */
    gov.niem.niem.niemCore.x20.DispositionType[] getActivityDispositionArray();
    
    /**
     * Gets ith "ActivityDisposition" element
     */
    gov.niem.niem.niemCore.x20.DispositionType getActivityDispositionArray(int i);
    
    /**
     * Tests for nil ith "ActivityDisposition" element
     */
    boolean isNilActivityDispositionArray(int i);
    
    /**
     * Returns number of "ActivityDisposition" element
     */
    int sizeOfActivityDispositionArray();
    
    /**
     * Sets array of all "ActivityDisposition" element
     */
    void setActivityDispositionArray(gov.niem.niem.niemCore.x20.DispositionType[] activityDispositionArray);
    
    /**
     * Sets ith "ActivityDisposition" element
     */
    void setActivityDispositionArray(int i, gov.niem.niem.niemCore.x20.DispositionType activityDisposition);
    
    /**
     * Nils the ith "ActivityDisposition" element
     */
    void setNilActivityDispositionArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityDisposition" element
     */
    gov.niem.niem.niemCore.x20.DispositionType insertNewActivityDisposition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityDisposition" element
     */
    gov.niem.niem.niemCore.x20.DispositionType addNewActivityDisposition();
    
    /**
     * Removes the ith "ActivityDisposition" element
     */
    void removeActivityDisposition(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.ActivityType newInstance() {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.ActivityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.ActivityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.ActivityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.ActivityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
