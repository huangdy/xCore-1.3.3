/*
 * XML Type:  WorkProductTypeListType
 * Namespace: http://uicds.org/DirectoryServiceData
 * Java type: org.uicds.directoryServiceData.WorkProductTypeListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryServiceData;


/**
 * An XML WorkProductTypeListType(@http://uicds.org/DirectoryServiceData).
 *
 * This is a complex type.
 */
public interface WorkProductTypeListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkProductTypeListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("workproducttypelisttypeeb06type");
    
    /**
     * Gets array of all "productType" elements
     */
    java.lang.String[] getProductTypeArray();
    
    /**
     * Gets ith "productType" element
     */
    java.lang.String getProductTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "productType" elements
     */
    org.apache.xmlbeans.XmlString[] xgetProductTypeArray();
    
    /**
     * Gets (as xml) ith "productType" element
     */
    org.apache.xmlbeans.XmlString xgetProductTypeArray(int i);
    
    /**
     * Returns number of "productType" element
     */
    int sizeOfProductTypeArray();
    
    /**
     * Sets array of all "productType" element
     */
    void setProductTypeArray(java.lang.String[] productTypeArray);
    
    /**
     * Sets ith "productType" element
     */
    void setProductTypeArray(int i, java.lang.String productType);
    
    /**
     * Sets (as xml) array of all "productType" element
     */
    void xsetProductTypeArray(org.apache.xmlbeans.XmlString[] productTypeArray);
    
    /**
     * Sets (as xml) ith "productType" element
     */
    void xsetProductTypeArray(int i, org.apache.xmlbeans.XmlString productType);
    
    /**
     * Inserts the value as the ith "productType" element
     */
    void insertProductType(int i, java.lang.String productType);
    
    /**
     * Appends the value as the last "productType" element
     */
    void addProductType(java.lang.String productType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "productType" element
     */
    org.apache.xmlbeans.XmlString insertNewProductType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "productType" element
     */
    org.apache.xmlbeans.XmlString addNewProductType();
    
    /**
     * Removes the ith "productType" element
     */
    void removeProductType(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.directoryServiceData.WorkProductTypeListType newInstance() {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.directoryServiceData.WorkProductTypeListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.directoryServiceData.WorkProductTypeListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
