/*
 * XML Type:  OperationsSectionType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.OperationsSectionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203;


/**
 * An XML OperationsSectionType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public interface OperationsSectionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationsSectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("operationssectiontype3baftype");
    
    /**
     * Gets the "Chief" element
     */
    java.lang.String getChief();
    
    /**
     * Gets (as xml) the "Chief" element
     */
    org.apache.xmlbeans.XmlString xgetChief();
    
    /**
     * Sets the "Chief" element
     */
    void setChief(java.lang.String chief);
    
    /**
     * Sets (as xml) the "Chief" element
     */
    void xsetChief(org.apache.xmlbeans.XmlString chief);
    
    /**
     * Gets the "Deputy" element
     */
    java.lang.String getDeputy();
    
    /**
     * Gets (as xml) the "Deputy" element
     */
    org.apache.xmlbeans.XmlString xgetDeputy();
    
    /**
     * Sets the "Deputy" element
     */
    void setDeputy(java.lang.String deputy);
    
    /**
     * Sets (as xml) the "Deputy" element
     */
    void xsetDeputy(org.apache.xmlbeans.XmlString deputy);
    
    /**
     * Gets the "BranchIDivisionGroup" element
     */
    org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup getBranchIDivisionGroup();
    
    /**
     * Sets the "BranchIDivisionGroup" element
     */
    void setBranchIDivisionGroup(org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup branchIDivisionGroup);
    
    /**
     * Appends and returns a new empty "BranchIDivisionGroup" element
     */
    org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup addNewBranchIDivisionGroup();
    
    /**
     * Gets the "BranchIIDivisionGroup" element
     */
    org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup getBranchIIDivisionGroup();
    
    /**
     * Sets the "BranchIIDivisionGroup" element
     */
    void setBranchIIDivisionGroup(org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup branchIIDivisionGroup);
    
    /**
     * Appends and returns a new empty "BranchIIDivisionGroup" element
     */
    org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup addNewBranchIIDivisionGroup();
    
    /**
     * Gets the "BranchIIIDivisionGroup" element
     */
    org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup getBranchIIIDivisionGroup();
    
    /**
     * Sets the "BranchIIIDivisionGroup" element
     */
    void setBranchIIIDivisionGroup(org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup branchIIIDivisionGroup);
    
    /**
     * Appends and returns a new empty "BranchIIIDivisionGroup" element
     */
    org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup addNewBranchIIIDivisionGroup();
    
    /**
     * Gets the "AirOperationsBranch" element
     */
    org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch getAirOperationsBranch();
    
    /**
     * Sets the "AirOperationsBranch" element
     */
    void setAirOperationsBranch(org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch airOperationsBranch);
    
    /**
     * Appends and returns a new empty "AirOperationsBranch" element
     */
    org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch addNewAirOperationsBranch();
    
    /**
     * An XML BranchIDivisionGroup(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public interface BranchIDivisionGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BranchIDivisionGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("branchidivisiongroupf116elemtype");
        
        /**
         * Gets the "BranchDirector" element
         */
        java.lang.String getBranchDirector();
        
        /**
         * Gets (as xml) the "BranchDirector" element
         */
        org.apache.xmlbeans.XmlString xgetBranchDirector();
        
        /**
         * Sets the "BranchDirector" element
         */
        void setBranchDirector(java.lang.String branchDirector);
        
        /**
         * Sets (as xml) the "BranchDirector" element
         */
        void xsetBranchDirector(org.apache.xmlbeans.XmlString branchDirector);
        
        /**
         * Gets the "Deputy" element
         */
        java.lang.String getDeputy();
        
        /**
         * Gets (as xml) the "Deputy" element
         */
        org.apache.xmlbeans.XmlString xgetDeputy();
        
        /**
         * Sets the "Deputy" element
         */
        void setDeputy(java.lang.String deputy);
        
        /**
         * Sets (as xml) the "Deputy" element
         */
        void xsetDeputy(org.apache.xmlbeans.XmlString deputy);
        
        /**
         * Gets array of all "DivisionGroup" elements
         */
        org.uicds.icsForm203.DivisionGroupType[] getDivisionGroupArray();
        
        /**
         * Gets ith "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType getDivisionGroupArray(int i);
        
        /**
         * Returns number of "DivisionGroup" element
         */
        int sizeOfDivisionGroupArray();
        
        /**
         * Sets array of all "DivisionGroup" element
         */
        void setDivisionGroupArray(org.uicds.icsForm203.DivisionGroupType[] divisionGroupArray);
        
        /**
         * Sets ith "DivisionGroup" element
         */
        void setDivisionGroupArray(int i, org.uicds.icsForm203.DivisionGroupType divisionGroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType insertNewDivisionGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType addNewDivisionGroup();
        
        /**
         * Removes the ith "DivisionGroup" element
         */
        void removeDivisionGroup(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup newInstance() {
              return (org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML BranchIIDivisionGroup(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public interface BranchIIDivisionGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BranchIIDivisionGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("branchiidivisiongroupe2abelemtype");
        
        /**
         * Gets the "BranchDirector" element
         */
        java.lang.String getBranchDirector();
        
        /**
         * Gets (as xml) the "BranchDirector" element
         */
        org.apache.xmlbeans.XmlString xgetBranchDirector();
        
        /**
         * Sets the "BranchDirector" element
         */
        void setBranchDirector(java.lang.String branchDirector);
        
        /**
         * Sets (as xml) the "BranchDirector" element
         */
        void xsetBranchDirector(org.apache.xmlbeans.XmlString branchDirector);
        
        /**
         * Gets the "Deputy" element
         */
        java.lang.String getDeputy();
        
        /**
         * Gets (as xml) the "Deputy" element
         */
        org.apache.xmlbeans.XmlString xgetDeputy();
        
        /**
         * Sets the "Deputy" element
         */
        void setDeputy(java.lang.String deputy);
        
        /**
         * Sets (as xml) the "Deputy" element
         */
        void xsetDeputy(org.apache.xmlbeans.XmlString deputy);
        
        /**
         * Gets array of all "DivisionGroup" elements
         */
        org.uicds.icsForm203.DivisionGroupType[] getDivisionGroupArray();
        
        /**
         * Gets ith "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType getDivisionGroupArray(int i);
        
        /**
         * Returns number of "DivisionGroup" element
         */
        int sizeOfDivisionGroupArray();
        
        /**
         * Sets array of all "DivisionGroup" element
         */
        void setDivisionGroupArray(org.uicds.icsForm203.DivisionGroupType[] divisionGroupArray);
        
        /**
         * Sets ith "DivisionGroup" element
         */
        void setDivisionGroupArray(int i, org.uicds.icsForm203.DivisionGroupType divisionGroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType insertNewDivisionGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType addNewDivisionGroup();
        
        /**
         * Removes the ith "DivisionGroup" element
         */
        void removeDivisionGroup(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup newInstance() {
              return (org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML BranchIIIDivisionGroup(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public interface BranchIIIDivisionGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BranchIIIDivisionGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("branchiiidivisiongroup23b6elemtype");
        
        /**
         * Gets the "BranchDirector" element
         */
        java.lang.String getBranchDirector();
        
        /**
         * Gets (as xml) the "BranchDirector" element
         */
        org.apache.xmlbeans.XmlString xgetBranchDirector();
        
        /**
         * Sets the "BranchDirector" element
         */
        void setBranchDirector(java.lang.String branchDirector);
        
        /**
         * Sets (as xml) the "BranchDirector" element
         */
        void xsetBranchDirector(org.apache.xmlbeans.XmlString branchDirector);
        
        /**
         * Gets the "Deputy" element
         */
        java.lang.String getDeputy();
        
        /**
         * Gets (as xml) the "Deputy" element
         */
        org.apache.xmlbeans.XmlString xgetDeputy();
        
        /**
         * Sets the "Deputy" element
         */
        void setDeputy(java.lang.String deputy);
        
        /**
         * Sets (as xml) the "Deputy" element
         */
        void xsetDeputy(org.apache.xmlbeans.XmlString deputy);
        
        /**
         * Gets array of all "DivisionGroup" elements
         */
        org.uicds.icsForm203.DivisionGroupType[] getDivisionGroupArray();
        
        /**
         * Gets ith "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType getDivisionGroupArray(int i);
        
        /**
         * Returns number of "DivisionGroup" element
         */
        int sizeOfDivisionGroupArray();
        
        /**
         * Sets array of all "DivisionGroup" element
         */
        void setDivisionGroupArray(org.uicds.icsForm203.DivisionGroupType[] divisionGroupArray);
        
        /**
         * Sets ith "DivisionGroup" element
         */
        void setDivisionGroupArray(int i, org.uicds.icsForm203.DivisionGroupType divisionGroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType insertNewDivisionGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DivisionGroup" element
         */
        org.uicds.icsForm203.DivisionGroupType addNewDivisionGroup();
        
        /**
         * Removes the ith "DivisionGroup" element
         */
        void removeDivisionGroup(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup newInstance() {
              return (org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML AirOperationsBranch(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public interface AirOperationsBranch extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AirOperationsBranch.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("airoperationsbranchcc13elemtype");
        
        /**
         * Gets the "AirOperationsBranchDirector" element
         */
        java.lang.String getAirOperationsBranchDirector();
        
        /**
         * Gets (as xml) the "AirOperationsBranchDirector" element
         */
        org.apache.xmlbeans.XmlString xgetAirOperationsBranchDirector();
        
        /**
         * Sets the "AirOperationsBranchDirector" element
         */
        void setAirOperationsBranchDirector(java.lang.String airOperationsBranchDirector);
        
        /**
         * Sets (as xml) the "AirOperationsBranchDirector" element
         */
        void xsetAirOperationsBranchDirector(org.apache.xmlbeans.XmlString airOperationsBranchDirector);
        
        /**
         * Gets the "AirTacticalGroupSup" element
         */
        java.lang.String getAirTacticalGroupSup();
        
        /**
         * Gets (as xml) the "AirTacticalGroupSup" element
         */
        org.apache.xmlbeans.XmlString xgetAirTacticalGroupSup();
        
        /**
         * Sets the "AirTacticalGroupSup" element
         */
        void setAirTacticalGroupSup(java.lang.String airTacticalGroupSup);
        
        /**
         * Sets (as xml) the "AirTacticalGroupSup" element
         */
        void xsetAirTacticalGroupSup(org.apache.xmlbeans.XmlString airTacticalGroupSup);
        
        /**
         * Gets the "AirSupportGroupSup" element
         */
        java.lang.String getAirSupportGroupSup();
        
        /**
         * Gets (as xml) the "AirSupportGroupSup" element
         */
        org.apache.xmlbeans.XmlString xgetAirSupportGroupSup();
        
        /**
         * Sets the "AirSupportGroupSup" element
         */
        void setAirSupportGroupSup(java.lang.String airSupportGroupSup);
        
        /**
         * Sets (as xml) the "AirSupportGroupSup" element
         */
        void xsetAirSupportGroupSup(org.apache.xmlbeans.XmlString airSupportGroupSup);
        
        /**
         * Gets the "HelicopterCoordinator" element
         */
        java.lang.String getHelicopterCoordinator();
        
        /**
         * Gets (as xml) the "HelicopterCoordinator" element
         */
        org.apache.xmlbeans.XmlString xgetHelicopterCoordinator();
        
        /**
         * Sets the "HelicopterCoordinator" element
         */
        void setHelicopterCoordinator(java.lang.String helicopterCoordinator);
        
        /**
         * Sets (as xml) the "HelicopterCoordinator" element
         */
        void xsetHelicopterCoordinator(org.apache.xmlbeans.XmlString helicopterCoordinator);
        
        /**
         * Gets the "AirTankerFixedWingCrd" element
         */
        java.lang.String getAirTankerFixedWingCrd();
        
        /**
         * Gets (as xml) the "AirTankerFixedWingCrd" element
         */
        org.apache.xmlbeans.XmlString xgetAirTankerFixedWingCrd();
        
        /**
         * Sets the "AirTankerFixedWingCrd" element
         */
        void setAirTankerFixedWingCrd(java.lang.String airTankerFixedWingCrd);
        
        /**
         * Sets (as xml) the "AirTankerFixedWingCrd" element
         */
        void xsetAirTankerFixedWingCrd(org.apache.xmlbeans.XmlString airTankerFixedWingCrd);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch newInstance() {
              return (org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.icsForm203.OperationsSectionType newInstance() {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.icsForm203.OperationsSectionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.icsForm203.OperationsSectionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.icsForm203.OperationsSectionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.icsForm203.OperationsSectionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.OperationsSectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.icsForm203.OperationsSectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.icsForm203.OperationsSectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
