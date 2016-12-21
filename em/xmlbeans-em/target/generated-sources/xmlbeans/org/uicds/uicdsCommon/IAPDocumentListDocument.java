/*
 * An XML document type.
 * Localname: IAPDocumentList
 * Namespace: http://uicds.org/UICDSCommon
 * Java type: org.uicds.uicdsCommon.IAPDocumentListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.uicdsCommon;


/**
 * A document containing one IAPDocumentList(@http://uicds.org/UICDSCommon) element.
 *
 * This is a complex type.
 */
public interface IAPDocumentListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IAPDocumentListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("iapdocumentlist7c64doctype");
    
    /**
     * Gets the "IAPDocumentList" element
     */
    org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList getIAPDocumentList();
    
    /**
     * Sets the "IAPDocumentList" element
     */
    void setIAPDocumentList(org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList iapDocumentList);
    
    /**
     * Appends and returns a new empty "IAPDocumentList" element
     */
    org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList addNewIAPDocumentList();
    
    /**
     * An XML IAPDocumentList(@http://uicds.org/UICDSCommon).
     *
     * This is a complex type.
     */
    public interface IAPDocumentList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IAPDocumentList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("iapdocumentlist73a7elemtype");
        
        /**
         * Gets array of all "IAPDocument" elements
         */
        org.uicds.uicdsCommon.DocumentType[] getIAPDocumentArray();
        
        /**
         * Gets ith "IAPDocument" element
         */
        org.uicds.uicdsCommon.DocumentType getIAPDocumentArray(int i);
        
        /**
         * Returns number of "IAPDocument" element
         */
        int sizeOfIAPDocumentArray();
        
        /**
         * Sets array of all "IAPDocument" element
         */
        void setIAPDocumentArray(org.uicds.uicdsCommon.DocumentType[] iapDocumentArray);
        
        /**
         * Sets ith "IAPDocument" element
         */
        void setIAPDocumentArray(int i, org.uicds.uicdsCommon.DocumentType iapDocument);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IAPDocument" element
         */
        org.uicds.uicdsCommon.DocumentType insertNewIAPDocument(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IAPDocument" element
         */
        org.uicds.uicdsCommon.DocumentType addNewIAPDocument();
        
        /**
         * Removes the ith "IAPDocument" element
         */
        void removeIAPDocument(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList newInstance() {
              return (org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.uicdsCommon.IAPDocumentListDocument.IAPDocumentList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.uicdsCommon.IAPDocumentListDocument newInstance() {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.uicdsCommon.IAPDocumentListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.uicdsCommon.IAPDocumentListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
