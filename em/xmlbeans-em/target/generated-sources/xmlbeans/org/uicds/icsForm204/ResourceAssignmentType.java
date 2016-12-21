/*
 * XML Type:  ResourceAssignmentType
 * Namespace: http://uicds.org/ICSForm204
 * Java type: org.uicds.icsForm204.ResourceAssignmentType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm204;


/**
 * An XML ResourceAssignmentType(@http://uicds.org/ICSForm204).
 *
 * This is a complex type.
 */
public interface ResourceAssignmentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceAssignmentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("resourceassignmenttype4584type");
    
    /**
     * Gets the "ResourceDesignator" element
     */
    java.lang.String getResourceDesignator();
    
    /**
     * Gets (as xml) the "ResourceDesignator" element
     */
    org.apache.xmlbeans.XmlString xgetResourceDesignator();
    
    /**
     * Sets the "ResourceDesignator" element
     */
    void setResourceDesignator(java.lang.String resourceDesignator);
    
    /**
     * Sets (as xml) the "ResourceDesignator" element
     */
    void xsetResourceDesignator(org.apache.xmlbeans.XmlString resourceDesignator);
    
    /**
     * Gets the "EMT" element
     */
    java.lang.String getEMT();
    
    /**
     * Gets (as xml) the "EMT" element
     */
    org.apache.xmlbeans.XmlString xgetEMT();
    
    /**
     * Sets the "EMT" element
     */
    void setEMT(java.lang.String emt);
    
    /**
     * Sets (as xml) the "EMT" element
     */
    void xsetEMT(org.apache.xmlbeans.XmlString emt);
    
    /**
     * Gets the "Leader" element
     */
    java.lang.String getLeader();
    
    /**
     * Gets (as xml) the "Leader" element
     */
    org.apache.xmlbeans.XmlString xgetLeader();
    
    /**
     * Sets the "Leader" element
     */
    void setLeader(java.lang.String leader);
    
    /**
     * Sets (as xml) the "Leader" element
     */
    void xsetLeader(org.apache.xmlbeans.XmlString leader);
    
    /**
     * Gets the "NumberPersons" element
     */
    java.math.BigInteger getNumberPersons();
    
    /**
     * Gets (as xml) the "NumberPersons" element
     */
    org.apache.xmlbeans.XmlInteger xgetNumberPersons();
    
    /**
     * Sets the "NumberPersons" element
     */
    void setNumberPersons(java.math.BigInteger numberPersons);
    
    /**
     * Sets (as xml) the "NumberPersons" element
     */
    void xsetNumberPersons(org.apache.xmlbeans.XmlInteger numberPersons);
    
    /**
     * Gets the "TransNeeded" element
     */
    boolean getTransNeeded();
    
    /**
     * Gets (as xml) the "TransNeeded" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTransNeeded();
    
    /**
     * Sets the "TransNeeded" element
     */
    void setTransNeeded(boolean transNeeded);
    
    /**
     * Sets (as xml) the "TransNeeded" element
     */
    void xsetTransNeeded(org.apache.xmlbeans.XmlBoolean transNeeded);
    
    /**
     * Gets the "PickupPtTime" element
     */
    java.lang.String getPickupPtTime();
    
    /**
     * Gets (as xml) the "PickupPtTime" element
     */
    org.apache.xmlbeans.XmlString xgetPickupPtTime();
    
    /**
     * Sets the "PickupPtTime" element
     */
    void setPickupPtTime(java.lang.String pickupPtTime);
    
    /**
     * Sets (as xml) the "PickupPtTime" element
     */
    void xsetPickupPtTime(org.apache.xmlbeans.XmlString pickupPtTime);
    
    /**
     * Gets the "DropOffPtTime" element
     */
    java.lang.String getDropOffPtTime();
    
    /**
     * Gets (as xml) the "DropOffPtTime" element
     */
    org.apache.xmlbeans.XmlString xgetDropOffPtTime();
    
    /**
     * Sets the "DropOffPtTime" element
     */
    void setDropOffPtTime(java.lang.String dropOffPtTime);
    
    /**
     * Sets (as xml) the "DropOffPtTime" element
     */
    void xsetDropOffPtTime(org.apache.xmlbeans.XmlString dropOffPtTime);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm204.ResourceAssignmentType newInstance() {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm204.ResourceAssignmentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm204.ResourceAssignmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm204.ResourceAssignmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm204.ResourceAssignmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
