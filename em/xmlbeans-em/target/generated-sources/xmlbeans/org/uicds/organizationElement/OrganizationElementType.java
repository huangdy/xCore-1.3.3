/*
 * XML Type:  OrganizationElementType
 * Namespace: http://uicds.org/OrganizationElement
 * Java type: org.uicds.organizationElement.OrganizationElementType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.organizationElement;


/**
 * An XML OrganizationElementType(@http://uicds.org/OrganizationElement).
 *
 * This is a complex type.
 */
public interface OrganizationElementType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganizationElementType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("organizationelementtype70e2type");
    
    /**
     * Gets the "OrganizationName" element
     */
    java.lang.String getOrganizationName();
    
    /**
     * Gets (as xml) the "OrganizationName" element
     */
    org.apache.xmlbeans.XmlString xgetOrganizationName();
    
    /**
     * Sets the "OrganizationName" element
     */
    void setOrganizationName(java.lang.String organizationName);
    
    /**
     * Sets (as xml) the "OrganizationName" element
     */
    void xsetOrganizationName(org.apache.xmlbeans.XmlString organizationName);
    
    /**
     * Gets the "OrganizationType" element
     */
    java.lang.String getOrganizationType();
    
    /**
     * Gets (as xml) the "OrganizationType" element
     */
    org.apache.xmlbeans.XmlString xgetOrganizationType();
    
    /**
     * Sets the "OrganizationType" element
     */
    void setOrganizationType(java.lang.String organizationType);
    
    /**
     * Sets (as xml) the "OrganizationType" element
     */
    void xsetOrganizationType(org.apache.xmlbeans.XmlString organizationType);
    
    /**
     * Gets the "PersonInCharge" element
     */
    org.uicds.organizationElement.OrganizationPositionType getPersonInCharge();
    
    /**
     * Sets the "PersonInCharge" element
     */
    void setPersonInCharge(org.uicds.organizationElement.OrganizationPositionType personInCharge);
    
    /**
     * Appends and returns a new empty "PersonInCharge" element
     */
    org.uicds.organizationElement.OrganizationPositionType addNewPersonInCharge();
    
    /**
     * Gets array of all "Staff" elements
     */
    org.uicds.organizationElement.OrganizationPositionType[] getStaffArray();
    
    /**
     * Gets ith "Staff" element
     */
    org.uicds.organizationElement.OrganizationPositionType getStaffArray(int i);
    
    /**
     * Returns number of "Staff" element
     */
    int sizeOfStaffArray();
    
    /**
     * Sets array of all "Staff" element
     */
    void setStaffArray(org.uicds.organizationElement.OrganizationPositionType[] staffArray);
    
    /**
     * Sets ith "Staff" element
     */
    void setStaffArray(int i, org.uicds.organizationElement.OrganizationPositionType staff);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Staff" element
     */
    org.uicds.organizationElement.OrganizationPositionType insertNewStaff(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Staff" element
     */
    org.uicds.organizationElement.OrganizationPositionType addNewStaff();
    
    /**
     * Removes the ith "Staff" element
     */
    void removeStaff(int i);
    
    /**
     * Gets array of all "OrganizationElement" elements
     */
    org.uicds.organizationElement.OrganizationElementType[] getOrganizationElementArray();
    
    /**
     * Gets ith "OrganizationElement" element
     */
    org.uicds.organizationElement.OrganizationElementType getOrganizationElementArray(int i);
    
    /**
     * Returns number of "OrganizationElement" element
     */
    int sizeOfOrganizationElementArray();
    
    /**
     * Sets array of all "OrganizationElement" element
     */
    void setOrganizationElementArray(org.uicds.organizationElement.OrganizationElementType[] organizationElementArray);
    
    /**
     * Sets ith "OrganizationElement" element
     */
    void setOrganizationElementArray(int i, org.uicds.organizationElement.OrganizationElementType organizationElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationElement" element
     */
    org.uicds.organizationElement.OrganizationElementType insertNewOrganizationElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationElement" element
     */
    org.uicds.organizationElement.OrganizationElementType addNewOrganizationElement();
    
    /**
     * Removes the ith "OrganizationElement" element
     */
    void removeOrganizationElement(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.organizationElement.OrganizationElementType newInstance() {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.organizationElement.OrganizationElementType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.organizationElement.OrganizationElementType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.organizationElement.OrganizationElementType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.organizationElement.OrganizationElementType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.organizationElement.OrganizationElementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.organizationElement.OrganizationElementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.organizationElement.OrganizationElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
