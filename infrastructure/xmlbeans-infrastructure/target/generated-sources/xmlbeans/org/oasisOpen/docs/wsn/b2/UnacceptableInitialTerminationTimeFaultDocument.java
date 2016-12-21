/*
 * An XML document type.
 * Localname: UnacceptableInitialTerminationTimeFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2;


/**
 * A document containing one UnacceptableInitialTerminationTimeFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public interface UnacceptableInitialTerminationTimeFaultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UnacceptableInitialTerminationTimeFaultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("unacceptableinitialterminationtimefaultb8bddoctype");
    
    /**
     * Gets the "UnacceptableInitialTerminationTimeFault" element
     */
    org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType getUnacceptableInitialTerminationTimeFault();
    
    /**
     * Sets the "UnacceptableInitialTerminationTimeFault" element
     */
    void setUnacceptableInitialTerminationTimeFault(org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType unacceptableInitialTerminationTimeFault);
    
    /**
     * Appends and returns a new empty "UnacceptableInitialTerminationTimeFault" element
     */
    org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType addNewUnacceptableInitialTerminationTimeFault();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument newInstance() {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}