/*
 * XML Type:  InterestGroupType
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.InterestGroupType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures;


/**
 * An XML InterestGroupType(@http://www.saic.com/precis/2009/06/structures).
 *
 * This is a complex type.
 */
public interface InterestGroupType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InterestGroupType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("interestgrouptype7e81type");
    
    /**
     * Gets the "InterestGroupType" element
     */
    java.lang.String getInterestGroupType();
    
    /**
     * Gets (as xml) the "InterestGroupType" element
     */
    org.apache.xmlbeans.XmlString xgetInterestGroupType();
    
    /**
     * Sets the "InterestGroupType" element
     */
    void setInterestGroupType(java.lang.String interestGroupType);
    
    /**
     * Sets (as xml) the "InterestGroupType" element
     */
    void xsetInterestGroupType(org.apache.xmlbeans.XmlString interestGroupType);
    
    /**
     * Gets array of all "InterestGroupSubType" elements
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType[] getInterestGroupSubTypeArray();
    
    /**
     * Gets ith "InterestGroupSubType" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType getInterestGroupSubTypeArray(int i);
    
    /**
     * Returns number of "InterestGroupSubType" element
     */
    int sizeOfInterestGroupSubTypeArray();
    
    /**
     * Sets array of all "InterestGroupSubType" element
     */
    void setInterestGroupSubTypeArray(com.saic.precis.x2009.x06.base.CodespaceValueType[] interestGroupSubTypeArray);
    
    /**
     * Sets ith "InterestGroupSubType" element
     */
    void setInterestGroupSubTypeArray(int i, com.saic.precis.x2009.x06.base.CodespaceValueType interestGroupSubType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InterestGroupSubType" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType insertNewInterestGroupSubType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InterestGroupSubType" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType addNewInterestGroupSubType();
    
    /**
     * Removes the ith "InterestGroupSubType" element
     */
    void removeInterestGroupSubType(int i);
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    com.saic.precis.x2009.x06.structures.InterestGroupType.Name xgetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(com.saic.precis.x2009.x06.structures.InterestGroupType.Name name);
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets the "BoundingBox" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType getBoundingBox();
    
    /**
     * True if has "BoundingBox" element
     */
    boolean isSetBoundingBox();
    
    /**
     * Sets the "BoundingBox" element
     */
    void setBoundingBox(mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType boundingBox);
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType addNewBoundingBox();
    
    /**
     * Unsets the "BoundingBox" element
     */
    void unsetBoundingBox();
    
    /**
     * Gets the "SpecializedWorkProduct" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType getSpecializedWorkProduct();
    
    /**
     * Sets the "SpecializedWorkProduct" element
     */
    void setSpecializedWorkProduct(com.saic.precis.x2009.x06.base.IdentifierType specializedWorkProduct);
    
    /**
     * Appends and returns a new empty "SpecializedWorkProduct" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType addNewSpecializedWorkProduct();
    
    /**
     * Gets the "SpecializedUICDSService" element
     */
    java.lang.String getSpecializedUICDSService();
    
    /**
     * Gets (as xml) the "SpecializedUICDSService" element
     */
    org.apache.xmlbeans.XmlString xgetSpecializedUICDSService();
    
    /**
     * Sets the "SpecializedUICDSService" element
     */
    void setSpecializedUICDSService(java.lang.String specializedUICDSService);
    
    /**
     * Sets (as xml) the "SpecializedUICDSService" element
     */
    void xsetSpecializedUICDSService(org.apache.xmlbeans.XmlString specializedUICDSService);
    
    /**
     * Gets array of all "SharedCoreName" elements
     */
    java.lang.String[] getSharedCoreNameArray();
    
    /**
     * Gets ith "SharedCoreName" element
     */
    java.lang.String getSharedCoreNameArray(int i);
    
    /**
     * Gets (as xml) array of all "SharedCoreName" elements
     */
    org.apache.xmlbeans.XmlString[] xgetSharedCoreNameArray();
    
    /**
     * Gets (as xml) ith "SharedCoreName" element
     */
    org.apache.xmlbeans.XmlString xgetSharedCoreNameArray(int i);
    
    /**
     * Returns number of "SharedCoreName" element
     */
    int sizeOfSharedCoreNameArray();
    
    /**
     * Sets array of all "SharedCoreName" element
     */
    void setSharedCoreNameArray(java.lang.String[] sharedCoreNameArray);
    
    /**
     * Sets ith "SharedCoreName" element
     */
    void setSharedCoreNameArray(int i, java.lang.String sharedCoreName);
    
    /**
     * Sets (as xml) array of all "SharedCoreName" element
     */
    void xsetSharedCoreNameArray(org.apache.xmlbeans.XmlString[] sharedCoreNameArray);
    
    /**
     * Sets (as xml) ith "SharedCoreName" element
     */
    void xsetSharedCoreNameArray(int i, org.apache.xmlbeans.XmlString sharedCoreName);
    
    /**
     * Inserts the value as the ith "SharedCoreName" element
     */
    void insertSharedCoreName(int i, java.lang.String sharedCoreName);
    
    /**
     * Appends the value as the last "SharedCoreName" element
     */
    void addSharedCoreName(java.lang.String sharedCoreName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SharedCoreName" element
     */
    org.apache.xmlbeans.XmlString insertNewSharedCoreName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SharedCoreName" element
     */
    org.apache.xmlbeans.XmlString addNewSharedCoreName();
    
    /**
     * Removes the ith "SharedCoreName" element
     */
    void removeSharedCoreName(int i);
    
    /**
     * An XML Name(@http://www.saic.com/precis/2009/06/structures).
     *
     * This is an atomic type that is a restriction of com.saic.precis.x2009.x06.structures.InterestGroupType$Name.
     */
    public interface Name extends org.apache.xmlbeans.XmlName
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("namefc08elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.saic.precis.x2009.x06.structures.InterestGroupType.Name newValue(java.lang.Object obj) {
              return (com.saic.precis.x2009.x06.structures.InterestGroupType.Name) type.newValue( obj ); }
            
            public static com.saic.precis.x2009.x06.structures.InterestGroupType.Name newInstance() {
              return (com.saic.precis.x2009.x06.structures.InterestGroupType.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.saic.precis.x2009.x06.structures.InterestGroupType.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.saic.precis.x2009.x06.structures.InterestGroupType.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.precis.x2009.x06.structures.InterestGroupType newInstance() {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.precis.x2009.x06.structures.InterestGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.precis.x2009.x06.structures.InterestGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
