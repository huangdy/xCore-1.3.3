/*
 * XML Type:  DigestType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.DigestType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20;


/**
 * An XML DigestType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface DigestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DigestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("digesttype2d85type");
    
    /**
     * Gets the "DigestMetadata" element
     */
    gov.ucore.ucore.x20.DigestMetadataType getDigestMetadata();
    
    /**
     * True if has "DigestMetadata" element
     */
    boolean isSetDigestMetadata();
    
    /**
     * Sets the "DigestMetadata" element
     */
    void setDigestMetadata(gov.ucore.ucore.x20.DigestMetadataType digestMetadata);
    
    /**
     * Appends and returns a new empty "DigestMetadata" element
     */
    gov.ucore.ucore.x20.DigestMetadataType addNewDigestMetadata();
    
    /**
     * Unsets the "DigestMetadata" element
     */
    void unsetDigestMetadata();
    
    /**
     * Gets array of all "ThingAbstract" elements
     */
    gov.ucore.ucore.x20.ThingType[] getThingAbstractArray();
    
    /**
     * Gets ith "ThingAbstract" element
     */
    gov.ucore.ucore.x20.ThingType getThingAbstractArray(int i);
    
    /**
     * Returns number of "ThingAbstract" element
     */
    int sizeOfThingAbstractArray();
    
    /**
     * Sets array of all "ThingAbstract" element
     */
    void setThingAbstractArray(gov.ucore.ucore.x20.ThingType[] thingAbstractArray);
    
    /**
     * Sets ith "ThingAbstract" element
     */
    void setThingAbstractArray(int i, gov.ucore.ucore.x20.ThingType thingAbstract);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ThingAbstract" element
     */
    gov.ucore.ucore.x20.ThingType insertNewThingAbstract(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ThingAbstract" element
     */
    gov.ucore.ucore.x20.ThingType addNewThingAbstract();
    
    /**
     * Removes the ith "ThingAbstract" element
     */
    void removeThingAbstract(int i);
    
    /**
     * Gets array of all "RelationshipAbstract" elements
     */
    gov.ucore.ucore.x20.RelationshipType[] getRelationshipAbstractArray();
    
    /**
     * Gets ith "RelationshipAbstract" element
     */
    gov.ucore.ucore.x20.RelationshipType getRelationshipAbstractArray(int i);
    
    /**
     * Returns number of "RelationshipAbstract" element
     */
    int sizeOfRelationshipAbstractArray();
    
    /**
     * Sets array of all "RelationshipAbstract" element
     */
    void setRelationshipAbstractArray(gov.ucore.ucore.x20.RelationshipType[] relationshipAbstractArray);
    
    /**
     * Sets ith "RelationshipAbstract" element
     */
    void setRelationshipAbstractArray(int i, gov.ucore.ucore.x20.RelationshipType relationshipAbstract);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelationshipAbstract" element
     */
    gov.ucore.ucore.x20.RelationshipType insertNewRelationshipAbstract(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelationshipAbstract" element
     */
    gov.ucore.ucore.x20.RelationshipType addNewRelationshipAbstract();
    
    /**
     * Removes the ith "RelationshipAbstract" element
     */
    void removeRelationshipAbstract(int i);
    
    /**
     * Gets array of all "ThingAttachmentLinkAssociation" elements
     */
    gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType[] getThingAttachmentLinkAssociationArray();
    
    /**
     * Gets ith "ThingAttachmentLinkAssociation" element
     */
    gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType getThingAttachmentLinkAssociationArray(int i);
    
    /**
     * Returns number of "ThingAttachmentLinkAssociation" element
     */
    int sizeOfThingAttachmentLinkAssociationArray();
    
    /**
     * Sets array of all "ThingAttachmentLinkAssociation" element
     */
    void setThingAttachmentLinkAssociationArray(gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType[] thingAttachmentLinkAssociationArray);
    
    /**
     * Sets ith "ThingAttachmentLinkAssociation" element
     */
    void setThingAttachmentLinkAssociationArray(int i, gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType thingAttachmentLinkAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ThingAttachmentLinkAssociation" element
     */
    gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType insertNewThingAttachmentLinkAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ThingAttachmentLinkAssociation" element
     */
    gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType addNewThingAttachmentLinkAssociation();
    
    /**
     * Removes the ith "ThingAttachmentLinkAssociation" element
     */
    void removeThingAttachmentLinkAssociation(int i);
    
    /**
     * Gets array of all "SameAsPayloadAssociation" elements
     */
    x0.messageLibrary1.SameAsPayloadAssociationType[] getSameAsPayloadAssociationArray();
    
    /**
     * Gets ith "SameAsPayloadAssociation" element
     */
    x0.messageLibrary1.SameAsPayloadAssociationType getSameAsPayloadAssociationArray(int i);
    
    /**
     * Returns number of "SameAsPayloadAssociation" element
     */
    int sizeOfSameAsPayloadAssociationArray();
    
    /**
     * Sets array of all "SameAsPayloadAssociation" element
     */
    void setSameAsPayloadAssociationArray(x0.messageLibrary1.SameAsPayloadAssociationType[] sameAsPayloadAssociationArray);
    
    /**
     * Sets ith "SameAsPayloadAssociation" element
     */
    void setSameAsPayloadAssociationArray(int i, x0.messageLibrary1.SameAsPayloadAssociationType sameAsPayloadAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SameAsPayloadAssociation" element
     */
    x0.messageLibrary1.SameAsPayloadAssociationType insertNewSameAsPayloadAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SameAsPayloadAssociation" element
     */
    x0.messageLibrary1.SameAsPayloadAssociationType addNewSameAsPayloadAssociation();
    
    /**
     * Removes the ith "SameAsPayloadAssociation" element
     */
    void removeSameAsPayloadAssociation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore.x20.DigestType newInstance() {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore.x20.DigestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore.x20.DigestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore.x20.DigestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore.x20.DigestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.DigestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.DigestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.DigestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
