/*
 * XML Type:  ResourcesSummaryType
 * Namespace: http://uicds.org/ICSForm201
 * Java type: org.uicds.icsForm201.ResourcesSummaryType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm201;


/**
 * An XML ResourcesSummaryType(@http://uicds.org/ICSForm201).
 *
 * This is a complex type.
 */
public interface ResourcesSummaryType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourcesSummaryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("resourcessummarytypefc07type");
    
    /**
     * Gets the "ResourcesOrdered" element
     */
    java.lang.String getResourcesOrdered();
    
    /**
     * Gets (as xml) the "ResourcesOrdered" element
     */
    org.apache.xmlbeans.XmlString xgetResourcesOrdered();
    
    /**
     * Sets the "ResourcesOrdered" element
     */
    void setResourcesOrdered(java.lang.String resourcesOrdered);
    
    /**
     * Sets (as xml) the "ResourcesOrdered" element
     */
    void xsetResourcesOrdered(org.apache.xmlbeans.XmlString resourcesOrdered);
    
    /**
     * Gets the "ResourceIdentification" element
     */
    java.lang.String getResourceIdentification();
    
    /**
     * Gets (as xml) the "ResourceIdentification" element
     */
    org.apache.xmlbeans.XmlString xgetResourceIdentification();
    
    /**
     * Sets the "ResourceIdentification" element
     */
    void setResourceIdentification(java.lang.String resourceIdentification);
    
    /**
     * Sets (as xml) the "ResourceIdentification" element
     */
    void xsetResourceIdentification(org.apache.xmlbeans.XmlString resourceIdentification);
    
    /**
     * Gets the "ETA" element
     */
    java.util.Calendar getETA();
    
    /**
     * Gets (as xml) the "ETA" element
     */
    org.apache.xmlbeans.XmlDateTime xgetETA();
    
    /**
     * Sets the "ETA" element
     */
    void setETA(java.util.Calendar eta);
    
    /**
     * Sets (as xml) the "ETA" element
     */
    void xsetETA(org.apache.xmlbeans.XmlDateTime eta);
    
    /**
     * Gets the "OnScene" element
     */
    boolean getOnScene();
    
    /**
     * Gets (as xml) the "OnScene" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOnScene();
    
    /**
     * Sets the "OnScene" element
     */
    void setOnScene(boolean onScene);
    
    /**
     * Sets (as xml) the "OnScene" element
     */
    void xsetOnScene(org.apache.xmlbeans.XmlBoolean onScene);
    
    /**
     * Gets the "LocationAssignment" element
     */
    java.lang.String getLocationAssignment();
    
    /**
     * Gets (as xml) the "LocationAssignment" element
     */
    org.apache.xmlbeans.XmlString xgetLocationAssignment();
    
    /**
     * Sets the "LocationAssignment" element
     */
    void setLocationAssignment(java.lang.String locationAssignment);
    
    /**
     * Sets (as xml) the "LocationAssignment" element
     */
    void xsetLocationAssignment(org.apache.xmlbeans.XmlString locationAssignment);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm201.ResourcesSummaryType newInstance() {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm201.ResourcesSummaryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm201.ResourcesSummaryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm201.ResourcesSummaryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm201.ResourcesSummaryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
