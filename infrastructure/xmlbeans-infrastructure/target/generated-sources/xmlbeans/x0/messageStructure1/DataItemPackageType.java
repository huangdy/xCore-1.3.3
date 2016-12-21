/*
 * XML Type:  DataItemPackageType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemPackageType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1;


/**
 * An XML DataItemPackageType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public interface DataItemPackageType extends x0.messageStructure1.PackageAbstractType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataItemPackageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("dataitempackagetype29aftype");
    
    /**
     * Gets array of all "RenderingInstructions" elements
     */
    x0.messageStructure1.RenderingInstructionsType[] getRenderingInstructionsArray();
    
    /**
     * Gets ith "RenderingInstructions" element
     */
    x0.messageStructure1.RenderingInstructionsType getRenderingInstructionsArray(int i);
    
    /**
     * Returns number of "RenderingInstructions" element
     */
    int sizeOfRenderingInstructionsArray();
    
    /**
     * Sets array of all "RenderingInstructions" element
     */
    void setRenderingInstructionsArray(x0.messageStructure1.RenderingInstructionsType[] renderingInstructionsArray);
    
    /**
     * Sets ith "RenderingInstructions" element
     */
    void setRenderingInstructionsArray(int i, x0.messageStructure1.RenderingInstructionsType renderingInstructions);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RenderingInstructions" element
     */
    x0.messageStructure1.RenderingInstructionsType insertNewRenderingInstructions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RenderingInstructions" element
     */
    x0.messageStructure1.RenderingInstructionsType addNewRenderingInstructions();
    
    /**
     * Removes the ith "RenderingInstructions" element
     */
    void removeRenderingInstructions(int i);
    
    /**
     * Gets the "NarrativeAbstract" element
     */
    org.apache.xmlbeans.XmlObject getNarrativeAbstract();
    
    /**
     * True if has "NarrativeAbstract" element
     */
    boolean isSetNarrativeAbstract();
    
    /**
     * Sets the "NarrativeAbstract" element
     */
    void setNarrativeAbstract(org.apache.xmlbeans.XmlObject narrativeAbstract);
    
    /**
     * Appends and returns a new empty "NarrativeAbstract" element
     */
    org.apache.xmlbeans.XmlObject addNewNarrativeAbstract();
    
    /**
     * Unsets the "NarrativeAbstract" element
     */
    void unsetNarrativeAbstract();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.messageStructure1.DataItemPackageType newInstance() {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.messageStructure1.DataItemPackageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.messageStructure1.DataItemPackageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.messageStructure1.DataItemPackageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.messageStructure1.DataItemPackageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.DataItemPackageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.messageStructure1.DataItemPackageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.messageStructure1.DataItemPackageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
