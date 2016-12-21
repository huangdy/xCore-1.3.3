/*
 * An XML document type.
 * Localname: ReferenceTarget
 * Namespace: http://niem.gov/niem/appinfo/2.0
 * Java type: gov.niem.niem.appinfo.x20.ReferenceTargetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.appinfo.x20;


/**
 * A document containing one ReferenceTarget(@http://niem.gov/niem/appinfo/2.0) element.
 *
 * This is a complex type.
 */
public interface ReferenceTargetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferenceTargetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("referencetarget89dfdoctype");
    
    /**
     * Gets the "ReferenceTarget" element
     */
    gov.niem.niem.appinfo.x20.ReferenceTargetDocument.ReferenceTarget getReferenceTarget();
    
    /**
     * Sets the "ReferenceTarget" element
     */
    void setReferenceTarget(gov.niem.niem.appinfo.x20.ReferenceTargetDocument.ReferenceTarget referenceTarget);
    
    /**
     * Appends and returns a new empty "ReferenceTarget" element
     */
    gov.niem.niem.appinfo.x20.ReferenceTargetDocument.ReferenceTarget addNewReferenceTarget();
    
    /**
     * An XML ReferenceTarget(@http://niem.gov/niem/appinfo/2.0).
     *
     * This is a complex type.
     */
    public interface ReferenceTarget extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferenceTarget.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("referencetarget17d7elemtype");
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlNCName xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlNCName name);
        
        /**
         * Gets the "namespace" attribute
         */
        java.lang.String getNamespace();
        
        /**
         * Gets (as xml) the "namespace" attribute
         */
        org.apache.xmlbeans.XmlAnyURI xgetNamespace();
        
        /**
         * True if has "namespace" attribute
         */
        boolean isSetNamespace();
        
        /**
         * Sets the "namespace" attribute
         */
        void setNamespace(java.lang.String namespace);
        
        /**
         * Sets (as xml) the "namespace" attribute
         */
        void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);
        
        /**
         * Unsets the "namespace" attribute
         */
        void unsetNamespace();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument.ReferenceTarget newInstance() {
              return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument.ReferenceTarget) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument.ReferenceTarget newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument.ReferenceTarget) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument newInstance() {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.appinfo.x20.ReferenceTargetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.appinfo.x20.ReferenceTargetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
