/*
 * XML Type:  PackageMetadataType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PackageMetadataType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1;


/**
 * An XML PackageMetadataType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface PackageMetadataType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PackageMetadataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("packagemetadatatype6e43type");
    
    /**
     * Gets the "DataItemID" element
     */
    java.lang.String getDataItemID();
    
    /**
     * Gets (as xml) the "DataItemID" element
     */
    org.apache.xmlbeans.XmlString xgetDataItemID();
    
    /**
     * Sets the "DataItemID" element
     */
    void setDataItemID(java.lang.String dataItemID);
    
    /**
     * Sets (as xml) the "DataItemID" element
     */
    void xsetDataItemID(org.apache.xmlbeans.XmlString dataItemID);
    
    /**
     * Gets the "DataItemCompleteIndicator" element
     */
    boolean getDataItemCompleteIndicator();
    
    /**
     * Gets (as xml) the "DataItemCompleteIndicator" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDataItemCompleteIndicator();
    
    /**
     * True if has "DataItemCompleteIndicator" element
     */
    boolean isSetDataItemCompleteIndicator();
    
    /**
     * Sets the "DataItemCompleteIndicator" element
     */
    void setDataItemCompleteIndicator(boolean dataItemCompleteIndicator);
    
    /**
     * Sets (as xml) the "DataItemCompleteIndicator" element
     */
    void xsetDataItemCompleteIndicator(org.apache.xmlbeans.XmlBoolean dataItemCompleteIndicator);
    
    /**
     * Unsets the "DataItemCompleteIndicator" element
     */
    void unsetDataItemCompleteIndicator();
    
    /**
     * Gets array of all "DataItemContactAbstract" elements
     */
    org.apache.xmlbeans.XmlObject[] getDataItemContactAbstractArray();
    
    /**
     * Gets ith "DataItemContactAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDataItemContactAbstractArray(int i);
    
    /**
     * Returns number of "DataItemContactAbstract" element
     */
    int sizeOfDataItemContactAbstractArray();
    
    /**
     * Sets array of all "DataItemContactAbstract" element
     */
    void setDataItemContactAbstractArray(org.apache.xmlbeans.XmlObject[] dataItemContactAbstractArray);
    
    /**
     * Sets ith "DataItemContactAbstract" element
     */
    void setDataItemContactAbstractArray(int i, org.apache.xmlbeans.XmlObject dataItemContactAbstract);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataItemContactAbstract" element
     */
    org.apache.xmlbeans.XmlObject insertNewDataItemContactAbstract(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataItemContactAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDataItemContactAbstract();
    
    /**
     * Removes the ith "DataItemContactAbstract" element
     */
    void removeDataItemContactAbstract(int i);
    
    /**
     * Gets the "DataItemDate" element
     */
    java.util.Calendar getDataItemDate();
    
    /**
     * Gets (as xml) the "DataItemDate" element
     */
    org.apache.xmlbeans.XmlDate xgetDataItemDate();
    
    /**
     * Tests for nil "DataItemDate" element
     */
    boolean isNilDataItemDate();
    
    /**
     * True if has "DataItemDate" element
     */
    boolean isSetDataItemDate();
    
    /**
     * Sets the "DataItemDate" element
     */
    void setDataItemDate(java.util.Calendar dataItemDate);
    
    /**
     * Sets (as xml) the "DataItemDate" element
     */
    void xsetDataItemDate(org.apache.xmlbeans.XmlDate dataItemDate);
    
    /**
     * Nils the "DataItemDate" element
     */
    void setNilDataItemDate();
    
    /**
     * Unsets the "DataItemDate" element
     */
    void unsetDataItemDate();
    
    /**
     * Gets the "DataItemReferenceID" element
     */
    java.lang.String getDataItemReferenceID();
    
    /**
     * Gets (as xml) the "DataItemReferenceID" element
     */
    org.apache.xmlbeans.XmlString xgetDataItemReferenceID();
    
    /**
     * Tests for nil "DataItemReferenceID" element
     */
    boolean isNilDataItemReferenceID();
    
    /**
     * Sets the "DataItemReferenceID" element
     */
    void setDataItemReferenceID(java.lang.String dataItemReferenceID);
    
    /**
     * Sets (as xml) the "DataItemReferenceID" element
     */
    void xsetDataItemReferenceID(org.apache.xmlbeans.XmlString dataItemReferenceID);
    
    /**
     * Nils the "DataItemReferenceID" element
     */
    void setNilDataItemReferenceID();
    
    /**
     * Gets the "DataItemPublishInstruction" element
     */
    x0.messageCodes1.DataItemPublishInstructionCodeSimpleType.Enum getDataItemPublishInstruction();
    
    /**
     * Gets (as xml) the "DataItemPublishInstruction" element
     */
    x0.messageCodes1.DataItemPublishInstructionCodeSimpleType xgetDataItemPublishInstruction();
    
    /**
     * Tests for nil "DataItemPublishInstruction" element
     */
    boolean isNilDataItemPublishInstruction();
    
    /**
     * True if has "DataItemPublishInstruction" element
     */
    boolean isSetDataItemPublishInstruction();
    
    /**
     * Sets the "DataItemPublishInstruction" element
     */
    void setDataItemPublishInstruction(x0.messageCodes1.DataItemPublishInstructionCodeSimpleType.Enum dataItemPublishInstruction);
    
    /**
     * Sets (as xml) the "DataItemPublishInstruction" element
     */
    void xsetDataItemPublishInstruction(x0.messageCodes1.DataItemPublishInstructionCodeSimpleType dataItemPublishInstruction);
    
    /**
     * Nils the "DataItemPublishInstruction" element
     */
    void setNilDataItemPublishInstruction();
    
    /**
     * Unsets the "DataItemPublishInstruction" element
     */
    void unsetDataItemPublishInstruction();
    
    /**
     * Gets the "DataItemStatusAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDataItemStatusAbstract();
    
    /**
     * Sets the "DataItemStatusAbstract" element
     */
    void setDataItemStatusAbstract(org.apache.xmlbeans.XmlObject dataItemStatusAbstract);
    
    /**
     * Appends and returns a new empty "DataItemStatusAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDataItemStatusAbstract();
    
    /**
     * Gets the "DataOwnerMetadata" element
     */
    x0.messageStructure1.DataOwnerMetadataType getDataOwnerMetadata();
    
    /**
     * Sets the "DataOwnerMetadata" element
     */
    void setDataOwnerMetadata(x0.messageStructure1.DataOwnerMetadataType dataOwnerMetadata);
    
    /**
     * Appends and returns a new empty "DataOwnerMetadata" element
     */
    x0.messageStructure1.DataOwnerMetadataType addNewDataOwnerMetadata();
    
    /**
     * Gets the "DisseminationCriteriaAbstract" element
     */
    org.apache.xmlbeans.XmlObject getDisseminationCriteriaAbstract();
    
    /**
     * Sets the "DisseminationCriteriaAbstract" element
     */
    void setDisseminationCriteriaAbstract(org.apache.xmlbeans.XmlObject disseminationCriteriaAbstract);
    
    /**
     * Appends and returns a new empty "DisseminationCriteriaAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewDisseminationCriteriaAbstract();
    
    /**
     * Gets array of all "DataItemCategory" elements
     */
    x0.messageStructure1.DataItemCategoryType[] getDataItemCategoryArray();
    
    /**
     * Gets ith "DataItemCategory" element
     */
    x0.messageStructure1.DataItemCategoryType getDataItemCategoryArray(int i);
    
    /**
     * Returns number of "DataItemCategory" element
     */
    int sizeOfDataItemCategoryArray();
    
    /**
     * Sets array of all "DataItemCategory" element
     */
    void setDataItemCategoryArray(x0.messageStructure1.DataItemCategoryType[] dataItemCategoryArray);
    
    /**
     * Sets ith "DataItemCategory" element
     */
    void setDataItemCategoryArray(int i, x0.messageStructure1.DataItemCategoryType dataItemCategory);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataItemCategory" element
     */
    x0.messageStructure1.DataItemCategoryType insertNewDataItemCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataItemCategory" element
     */
    x0.messageStructure1.DataItemCategoryType addNewDataItemCategory();
    
    /**
     * Removes the ith "DataItemCategory" element
     */
    void removeDataItemCategory(int i);
    
    /**
     * Gets array of all "PackageMetadataExtensionAbstract" elements
     */
    org.apache.xmlbeans.XmlObject[] getPackageMetadataExtensionAbstractArray();
    
    /**
     * Gets ith "PackageMetadataExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject getPackageMetadataExtensionAbstractArray(int i);
    
    /**
     * Returns number of "PackageMetadataExtensionAbstract" element
     */
    int sizeOfPackageMetadataExtensionAbstractArray();
    
    /**
     * Sets array of all "PackageMetadataExtensionAbstract" element
     */
    void setPackageMetadataExtensionAbstractArray(org.apache.xmlbeans.XmlObject[] packageMetadataExtensionAbstractArray);
    
    /**
     * Sets ith "PackageMetadataExtensionAbstract" element
     */
    void setPackageMetadataExtensionAbstractArray(int i, org.apache.xmlbeans.XmlObject packageMetadataExtensionAbstract);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PackageMetadataExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject insertNewPackageMetadataExtensionAbstract(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PackageMetadataExtensionAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewPackageMetadataExtensionAbstract();
    
    /**
     * Removes the ith "PackageMetadataExtensionAbstract" element
     */
    void removePackageMetadataExtensionAbstract(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.messageStructure1.PackageMetadataType newInstance() {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.messageStructure1.PackageMetadataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.messageStructure1.PackageMetadataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.messageStructure1.PackageMetadataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.messageStructure1.PackageMetadataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.PackageMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.PackageMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.PackageMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
