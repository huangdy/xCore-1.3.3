/*
 * XML Type:  MeasureType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.MeasureType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML MeasureType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface MeasureType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MeasureType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("measuretype3f4dtype");
    
    /**
     * Gets array of all "MeasureValue" elements
     */
    org.apache.xmlbeans.XmlObject[] getMeasureValueArray();
    
    /**
     * Gets ith "MeasureValue" element
     */
    org.apache.xmlbeans.XmlObject getMeasureValueArray(int i);
    
    /**
     * Returns number of "MeasureValue" element
     */
    int sizeOfMeasureValueArray();
    
    /**
     * Sets array of all "MeasureValue" element
     */
    void setMeasureValueArray(org.apache.xmlbeans.XmlObject[] measureValueArray);
    
    /**
     * Sets ith "MeasureValue" element
     */
    void setMeasureValueArray(int i, org.apache.xmlbeans.XmlObject measureValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureValue" element
     */
    org.apache.xmlbeans.XmlObject insertNewMeasureValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureValue" element
     */
    org.apache.xmlbeans.XmlObject addNewMeasureValue();
    
    /**
     * Removes the ith "MeasureValue" element
     */
    void removeMeasureValue(int i);
    
    /**
     * Gets array of all "MeasureUnitText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getMeasureUnitTextArray();
    
    /**
     * Gets ith "MeasureUnitText" element
     */
    gov.niem.niem.niemCore.x20.TextType getMeasureUnitTextArray(int i);
    
    /**
     * Tests for nil ith "MeasureUnitText" element
     */
    boolean isNilMeasureUnitTextArray(int i);
    
    /**
     * Returns number of "MeasureUnitText" element
     */
    int sizeOfMeasureUnitTextArray();
    
    /**
     * Sets array of all "MeasureUnitText" element
     */
    void setMeasureUnitTextArray(gov.niem.niem.niemCore.x20.TextType[] measureUnitTextArray);
    
    /**
     * Sets ith "MeasureUnitText" element
     */
    void setMeasureUnitTextArray(int i, gov.niem.niem.niemCore.x20.TextType measureUnitText);
    
    /**
     * Nils the ith "MeasureUnitText" element
     */
    void setNilMeasureUnitTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureUnitText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewMeasureUnitText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureUnitText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewMeasureUnitText();
    
    /**
     * Removes the ith "MeasureUnitText" element
     */
    void removeMeasureUnitText(int i);
    
    /**
     * Gets array of all "MeasureCategoryText" elements
     */
    gov.niem.niem.niemCore.x20.TextType[] getMeasureCategoryTextArray();
    
    /**
     * Gets ith "MeasureCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType getMeasureCategoryTextArray(int i);
    
    /**
     * Tests for nil ith "MeasureCategoryText" element
     */
    boolean isNilMeasureCategoryTextArray(int i);
    
    /**
     * Returns number of "MeasureCategoryText" element
     */
    int sizeOfMeasureCategoryTextArray();
    
    /**
     * Sets array of all "MeasureCategoryText" element
     */
    void setMeasureCategoryTextArray(gov.niem.niem.niemCore.x20.TextType[] measureCategoryTextArray);
    
    /**
     * Sets ith "MeasureCategoryText" element
     */
    void setMeasureCategoryTextArray(int i, gov.niem.niem.niemCore.x20.TextType measureCategoryText);
    
    /**
     * Nils the ith "MeasureCategoryText" element
     */
    void setNilMeasureCategoryTextArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType insertNewMeasureCategoryText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureCategoryText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewMeasureCategoryText();
    
    /**
     * Removes the ith "MeasureCategoryText" element
     */
    void removeMeasureCategoryText(int i);
    
    /**
     * Gets array of all "MeasureEstimatedIndicator" elements
     */
    gov.niem.niem.proxy.xsd.x20.Boolean[] getMeasureEstimatedIndicatorArray();
    
    /**
     * Gets ith "MeasureEstimatedIndicator" element
     */
    gov.niem.niem.proxy.xsd.x20.Boolean getMeasureEstimatedIndicatorArray(int i);
    
    /**
     * Tests for nil ith "MeasureEstimatedIndicator" element
     */
    boolean isNilMeasureEstimatedIndicatorArray(int i);
    
    /**
     * Returns number of "MeasureEstimatedIndicator" element
     */
    int sizeOfMeasureEstimatedIndicatorArray();
    
    /**
     * Sets array of all "MeasureEstimatedIndicator" element
     */
    void setMeasureEstimatedIndicatorArray(gov.niem.niem.proxy.xsd.x20.Boolean[] measureEstimatedIndicatorArray);
    
    /**
     * Sets ith "MeasureEstimatedIndicator" element
     */
    void setMeasureEstimatedIndicatorArray(int i, gov.niem.niem.proxy.xsd.x20.Boolean measureEstimatedIndicator);
    
    /**
     * Nils the ith "MeasureEstimatedIndicator" element
     */
    void setNilMeasureEstimatedIndicatorArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureEstimatedIndicator" element
     */
    gov.niem.niem.proxy.xsd.x20.Boolean insertNewMeasureEstimatedIndicator(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureEstimatedIndicator" element
     */
    gov.niem.niem.proxy.xsd.x20.Boolean addNewMeasureEstimatedIndicator();
    
    /**
     * Removes the ith "MeasureEstimatedIndicator" element
     */
    void removeMeasureEstimatedIndicator(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.MeasureType newInstance() {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.MeasureType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.MeasureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.MeasureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.MeasureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
