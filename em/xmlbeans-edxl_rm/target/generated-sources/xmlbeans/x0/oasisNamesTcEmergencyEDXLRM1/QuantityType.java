/*
 * XML Type:  QuantityType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.QuantityType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1;


/**
 * An XML QuantityType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public interface QuantityType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QuantityType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("quantitytypecac3type");
    
    /**
     * Gets array of all "QuantityText" elements
     */
    java.lang.String[] getQuantityTextArray();
    
    /**
     * Gets ith "QuantityText" element
     */
    java.lang.String getQuantityTextArray(int i);
    
    /**
     * Gets (as xml) array of all "QuantityText" elements
     */
    org.apache.xmlbeans.XmlString[] xgetQuantityTextArray();
    
    /**
     * Gets (as xml) ith "QuantityText" element
     */
    org.apache.xmlbeans.XmlString xgetQuantityTextArray(int i);
    
    /**
     * Returns number of "QuantityText" element
     */
    int sizeOfQuantityTextArray();
    
    /**
     * Sets array of all "QuantityText" element
     */
    void setQuantityTextArray(java.lang.String[] quantityTextArray);
    
    /**
     * Sets ith "QuantityText" element
     */
    void setQuantityTextArray(int i, java.lang.String quantityText);
    
    /**
     * Sets (as xml) array of all "QuantityText" element
     */
    void xsetQuantityTextArray(org.apache.xmlbeans.XmlString[] quantityTextArray);
    
    /**
     * Sets (as xml) ith "QuantityText" element
     */
    void xsetQuantityTextArray(int i, org.apache.xmlbeans.XmlString quantityText);
    
    /**
     * Inserts the value as the ith "QuantityText" element
     */
    void insertQuantityText(int i, java.lang.String quantityText);
    
    /**
     * Appends the value as the last "QuantityText" element
     */
    void addQuantityText(java.lang.String quantityText);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityText" element
     */
    org.apache.xmlbeans.XmlString insertNewQuantityText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityText" element
     */
    org.apache.xmlbeans.XmlString addNewQuantityText();
    
    /**
     * Removes the ith "QuantityText" element
     */
    void removeQuantityText(int i);
    
    /**
     * Gets the "MeasuredQuantity" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity getMeasuredQuantity();
    
    /**
     * True if has "MeasuredQuantity" element
     */
    boolean isSetMeasuredQuantity();
    
    /**
     * Sets the "MeasuredQuantity" element
     */
    void setMeasuredQuantity(x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity measuredQuantity);
    
    /**
     * Appends and returns a new empty "MeasuredQuantity" element
     */
    x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity addNewMeasuredQuantity();
    
    /**
     * Unsets the "MeasuredQuantity" element
     */
    void unsetMeasuredQuantity();
    
    /**
     * An XML MeasuredQuantity(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
     *
     * This is a complex type.
     */
    public interface MeasuredQuantity extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MeasuredQuantity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("measuredquantity25f0elemtype");
        
        /**
         * Gets the "Amount" element
         */
        double getAmount();
        
        /**
         * Gets (as xml) the "Amount" element
         */
        org.apache.xmlbeans.XmlDouble xgetAmount();
        
        /**
         * Sets the "Amount" element
         */
        void setAmount(double amount);
        
        /**
         * Sets (as xml) the "Amount" element
         */
        void xsetAmount(org.apache.xmlbeans.XmlDouble amount);
        
        /**
         * Gets the "UnitOfMeasure" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getUnitOfMeasure();
        
        /**
         * True if has "UnitOfMeasure" element
         */
        boolean isSetUnitOfMeasure();
        
        /**
         * Sets the "UnitOfMeasure" element
         */
        void setUnitOfMeasure(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType unitOfMeasure);
        
        /**
         * Appends and returns a new empty "UnitOfMeasure" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewUnitOfMeasure();
        
        /**
         * Unsets the "UnitOfMeasure" element
         */
        void unsetUnitOfMeasure();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLRM1.QuantityType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
