/*
 * An XML document type.
 * Localname: PhysicalInfo
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.PhysicalInfoDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one PhysicalInfo(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface PhysicalInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhysicalInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("physicalinfo48e2doctype");
    
    /**
     * Gets the "PhysicalInfo" element
     */
    oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo getPhysicalInfo();
    
    /**
     * Sets the "PhysicalInfo" element
     */
    void setPhysicalInfo(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo physicalInfo);
    
    /**
     * Appends and returns a new empty "PhysicalInfo" element
     */
    oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo addNewPhysicalInfo();
    
    /**
     * An XML PhysicalInfo(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface PhysicalInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PhysicalInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("physicalinfod3a1elemtype");
        
        /**
         * Gets array of all "FreeTextLine" elements
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine[] getFreeTextLineArray();
        
        /**
         * Gets ith "FreeTextLine" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine getFreeTextLineArray(int i);
        
        /**
         * Returns number of "FreeTextLine" element
         */
        int sizeOfFreeTextLineArray();
        
        /**
         * Sets array of all "FreeTextLine" element
         */
        void setFreeTextLineArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine[] freeTextLineArray);
        
        /**
         * Sets ith "FreeTextLine" element
         */
        void setFreeTextLineArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine freeTextLine);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FreeTextLine" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine insertNewFreeTextLine(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FreeTextLine" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine addNewFreeTextLine();
        
        /**
         * Removes the ith "FreeTextLine" element
         */
        void removeFreeTextLine(int i);
        
        /**
         * Gets array of all "Feature" elements
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature[] getFeatureArray();
        
        /**
         * Gets ith "Feature" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature getFeatureArray(int i);
        
        /**
         * Returns number of "Feature" element
         */
        int sizeOfFeatureArray();
        
        /**
         * Sets array of all "Feature" element
         */
        void setFeatureArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature[] featureArray);
        
        /**
         * Sets ith "Feature" element
         */
        void setFeatureArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature feature);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Feature" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature insertNewFeature(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Feature" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature addNewFeature();
        
        /**
         * Removes the ith "Feature" element
         */
        void removeFeature(int i);
        
        /**
         * Gets array of all "BodyMark" elements
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark[] getBodyMarkArray();
        
        /**
         * Gets ith "BodyMark" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark getBodyMarkArray(int i);
        
        /**
         * Returns number of "BodyMark" element
         */
        int sizeOfBodyMarkArray();
        
        /**
         * Sets array of all "BodyMark" element
         */
        void setBodyMarkArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark[] bodyMarkArray);
        
        /**
         * Sets ith "BodyMark" element
         */
        void setBodyMarkArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark bodyMark);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BodyMark" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark insertNewBodyMark(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BodyMark" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark addNewBodyMark();
        
        /**
         * Removes the ith "BodyMark" element
         */
        void removeBodyMark(int i);
        
        /**
         * Gets array of all "Disability" elements
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability[] getDisabilityArray();
        
        /**
         * Gets ith "Disability" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability getDisabilityArray(int i);
        
        /**
         * Returns number of "Disability" element
         */
        int sizeOfDisabilityArray();
        
        /**
         * Sets array of all "Disability" element
         */
        void setDisabilityArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability[] disabilityArray);
        
        /**
         * Sets ith "Disability" element
         */
        void setDisabilityArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability disability);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Disability" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability insertNewDisability(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Disability" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability addNewDisability();
        
        /**
         * Removes the ith "Disability" element
         */
        void removeDisability(int i);
        
        /**
         * Gets array of all "Allergy" elements
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy[] getAllergyArray();
        
        /**
         * Gets ith "Allergy" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy getAllergyArray(int i);
        
        /**
         * Returns number of "Allergy" element
         */
        int sizeOfAllergyArray();
        
        /**
         * Sets array of all "Allergy" element
         */
        void setAllergyArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy[] allergyArray);
        
        /**
         * Sets ith "Allergy" element
         */
        void setAllergyArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy allergy);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Allergy" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy insertNewAllergy(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Allergy" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy addNewAllergy();
        
        /**
         * Removes the ith "Allergy" element
         */
        void removeAllergy(int i);
        
        /**
         * Gets array of all "HealthCondition" elements
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition[] getHealthConditionArray();
        
        /**
         * Gets ith "HealthCondition" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition getHealthConditionArray(int i);
        
        /**
         * Returns number of "HealthCondition" element
         */
        int sizeOfHealthConditionArray();
        
        /**
         * Sets array of all "HealthCondition" element
         */
        void setHealthConditionArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition[] healthConditionArray);
        
        /**
         * Sets ith "HealthCondition" element
         */
        void setHealthConditionArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition healthCondition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "HealthCondition" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition insertNewHealthCondition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "HealthCondition" element
         */
        oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition addNewHealthCondition();
        
        /**
         * Removes the ith "HealthCondition" element
         */
        void removeHealthCondition(int i);
        
        /**
         * Gets the "BloodGroup" attribute
         */
        oasisNamesTcCiqXpil3.BloodGroupList.Enum getBloodGroup();
        
        /**
         * Gets (as xml) the "BloodGroup" attribute
         */
        oasisNamesTcCiqXpil3.BloodGroupList xgetBloodGroup();
        
        /**
         * True if has "BloodGroup" attribute
         */
        boolean isSetBloodGroup();
        
        /**
         * Sets the "BloodGroup" attribute
         */
        void setBloodGroup(oasisNamesTcCiqXpil3.BloodGroupList.Enum bloodGroup);
        
        /**
         * Sets (as xml) the "BloodGroup" attribute
         */
        void xsetBloodGroup(oasisNamesTcCiqXpil3.BloodGroupList bloodGroup);
        
        /**
         * Unsets the "BloodGroup" attribute
         */
        void unsetBloodGroup();
        
        /**
         * Gets the "DataQualityType" attribute
         */
        oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
        
        /**
         * True if has "DataQualityType" attribute
         */
        boolean isSetDataQualityType();
        
        /**
         * Sets the "DataQualityType" attribute
         */
        void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        void unsetDataQualityType();
        
        /**
         * Gets the "ValidFrom" attribute
         */
        java.util.Calendar getValidFrom();
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetValidFrom();
        
        /**
         * True if has "ValidFrom" attribute
         */
        boolean isSetValidFrom();
        
        /**
         * Sets the "ValidFrom" attribute
         */
        void setValidFrom(java.util.Calendar validFrom);
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        void unsetValidFrom();
        
        /**
         * Gets the "ValidTo" attribute
         */
        java.util.Calendar getValidTo();
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetValidTo();
        
        /**
         * True if has "ValidTo" attribute
         */
        boolean isSetValidTo();
        
        /**
         * Sets the "ValidTo" attribute
         */
        void setValidTo(java.util.Calendar validTo);
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
        
        /**
         * Unsets the "ValidTo" attribute
         */
        void unsetValidTo();
        
        /**
         * An XML FreeTextLine(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$FreeTextLine.
         */
        public interface FreeTextLine extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FreeTextLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("freetextline0a2aelemtype");
            
            /**
             * Gets the "Type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList xgetType();
            
            /**
             * True if has "Type" attribute
             */
            boolean isSetType();
            
            /**
             * Sets the "Type" attribute
             */
            void setType(java.lang.String type);
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            void xsetType(oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
            /**
             * Gets the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
            
            /**
             * True if has "DataQualityType" attribute
             */
            boolean isSetDataQualityType();
            
            /**
             * Sets the "DataQualityType" attribute
             */
            void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            void unsetDataQualityType();
            
            /**
             * Gets the "ValidFrom" attribute
             */
            java.util.Calendar getValidFrom();
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidFrom();
            
            /**
             * True if has "ValidFrom" attribute
             */
            boolean isSetValidFrom();
            
            /**
             * Sets the "ValidFrom" attribute
             */
            void setValidFrom(java.util.Calendar validFrom);
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            void unsetValidFrom();
            
            /**
             * Gets the "ValidTo" attribute
             */
            java.util.Calendar getValidTo();
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidTo();
            
            /**
             * True if has "ValidTo" attribute
             */
            boolean isSetValidTo();
            
            /**
             * Sets the "ValidTo" attribute
             */
            void setValidTo(java.util.Calendar validTo);
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
            
            /**
             * Unsets the "ValidTo" attribute
             */
            void unsetValidTo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine newInstance() {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Feature(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$Feature.
         */
        public interface Feature extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Feature.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("feature63e3elemtype");
            
            /**
             * Gets the "Type" attribute
             */
            oasisNamesTcCiqXpil3.FeatureTypeList.Enum getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.FeatureTypeList xgetType();
            
            /**
             * True if has "Type" attribute
             */
            boolean isSetType();
            
            /**
             * Sets the "Type" attribute
             */
            void setType(oasisNamesTcCiqXpil3.FeatureTypeList.Enum type);
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            void xsetType(oasisNamesTcCiqXpil3.FeatureTypeList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
            /**
             * Gets the "UnitType" attribute
             */
            java.lang.String getUnitType();
            
            /**
             * Gets (as xml) the "UnitType" attribute
             */
            oasisNamesTcCiqXpil3.UnitTypeList xgetUnitType();
            
            /**
             * True if has "UnitType" attribute
             */
            boolean isSetUnitType();
            
            /**
             * Sets the "UnitType" attribute
             */
            void setUnitType(java.lang.String unitType);
            
            /**
             * Sets (as xml) the "UnitType" attribute
             */
            void xsetUnitType(oasisNamesTcCiqXpil3.UnitTypeList unitType);
            
            /**
             * Unsets the "UnitType" attribute
             */
            void unsetUnitType();
            
            /**
             * Gets the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
            
            /**
             * True if has "DataQualityType" attribute
             */
            boolean isSetDataQualityType();
            
            /**
             * Sets the "DataQualityType" attribute
             */
            void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            void unsetDataQualityType();
            
            /**
             * Gets the "ValidFrom" attribute
             */
            java.util.Calendar getValidFrom();
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidFrom();
            
            /**
             * True if has "ValidFrom" attribute
             */
            boolean isSetValidFrom();
            
            /**
             * Sets the "ValidFrom" attribute
             */
            void setValidFrom(java.util.Calendar validFrom);
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            void unsetValidFrom();
            
            /**
             * Gets the "ValidTo" attribute
             */
            java.util.Calendar getValidTo();
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidTo();
            
            /**
             * True if has "ValidTo" attribute
             */
            boolean isSetValidTo();
            
            /**
             * Sets the "ValidTo" attribute
             */
            void setValidTo(java.util.Calendar validTo);
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
            
            /**
             * Unsets the "ValidTo" attribute
             */
            void unsetValidTo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature newInstance() {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML BodyMark(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$BodyMark.
         */
        public interface BodyMark extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BodyMark.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("bodymark416celemtype");
            
            /**
             * Gets the "Part" attribute
             */
            java.lang.String getPart();
            
            /**
             * Gets (as xml) the "Part" attribute
             */
            oasisNamesTcCiqXpil3.BodyMarkPartList xgetPart();
            
            /**
             * True if has "Part" attribute
             */
            boolean isSetPart();
            
            /**
             * Sets the "Part" attribute
             */
            void setPart(java.lang.String part);
            
            /**
             * Sets (as xml) the "Part" attribute
             */
            void xsetPart(oasisNamesTcCiqXpil3.BodyMarkPartList part);
            
            /**
             * Unsets the "Part" attribute
             */
            void unsetPart();
            
            /**
             * Gets the "Location" attribute
             */
            java.lang.String getLocation();
            
            /**
             * Gets (as xml) the "Location" attribute
             */
            oasisNamesTcCiqXpil3.BodyMarkPartLocationList xgetLocation();
            
            /**
             * True if has "Location" attribute
             */
            boolean isSetLocation();
            
            /**
             * Sets the "Location" attribute
             */
            void setLocation(java.lang.String location);
            
            /**
             * Sets (as xml) the "Location" attribute
             */
            void xsetLocation(oasisNamesTcCiqXpil3.BodyMarkPartLocationList location);
            
            /**
             * Unsets the "Location" attribute
             */
            void unsetLocation();
            
            /**
             * Gets the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
            
            /**
             * True if has "DataQualityType" attribute
             */
            boolean isSetDataQualityType();
            
            /**
             * Sets the "DataQualityType" attribute
             */
            void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            void unsetDataQualityType();
            
            /**
             * Gets the "ValidFrom" attribute
             */
            java.util.Calendar getValidFrom();
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidFrom();
            
            /**
             * True if has "ValidFrom" attribute
             */
            boolean isSetValidFrom();
            
            /**
             * Sets the "ValidFrom" attribute
             */
            void setValidFrom(java.util.Calendar validFrom);
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            void unsetValidFrom();
            
            /**
             * Gets the "ValidTo" attribute
             */
            java.util.Calendar getValidTo();
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidTo();
            
            /**
             * True if has "ValidTo" attribute
             */
            boolean isSetValidTo();
            
            /**
             * Sets the "ValidTo" attribute
             */
            void setValidTo(java.util.Calendar validTo);
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
            
            /**
             * Unsets the "ValidTo" attribute
             */
            void unsetValidTo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark newInstance() {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Disability(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$Disability.
         */
        public interface Disability extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Disability.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("disability3b39elemtype");
            
            /**
             * Gets the "Cause" attribute
             */
            java.lang.String getCause();
            
            /**
             * Gets (as xml) the "Cause" attribute
             */
            oasisNamesTcCiqXpil3.DisabilityCauseList xgetCause();
            
            /**
             * True if has "Cause" attribute
             */
            boolean isSetCause();
            
            /**
             * Sets the "Cause" attribute
             */
            void setCause(java.lang.String cause);
            
            /**
             * Sets (as xml) the "Cause" attribute
             */
            void xsetCause(oasisNamesTcCiqXpil3.DisabilityCauseList cause);
            
            /**
             * Unsets the "Cause" attribute
             */
            void unsetCause();
            
            /**
             * Gets the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
            
            /**
             * True if has "DataQualityType" attribute
             */
            boolean isSetDataQualityType();
            
            /**
             * Sets the "DataQualityType" attribute
             */
            void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            void unsetDataQualityType();
            
            /**
             * Gets the "ValidFrom" attribute
             */
            java.util.Calendar getValidFrom();
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidFrom();
            
            /**
             * True if has "ValidFrom" attribute
             */
            boolean isSetValidFrom();
            
            /**
             * Sets the "ValidFrom" attribute
             */
            void setValidFrom(java.util.Calendar validFrom);
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            void unsetValidFrom();
            
            /**
             * Gets the "ValidTo" attribute
             */
            java.util.Calendar getValidTo();
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidTo();
            
            /**
             * True if has "ValidTo" attribute
             */
            boolean isSetValidTo();
            
            /**
             * Sets the "ValidTo" attribute
             */
            void setValidTo(java.util.Calendar validTo);
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
            
            /**
             * Unsets the "ValidTo" attribute
             */
            void unsetValidTo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability newInstance() {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Allergy(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$Allergy.
         */
        public interface Allergy extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Allergy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("allergyd16delemtype");
            
            /**
             * Gets the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
            
            /**
             * True if has "DataQualityType" attribute
             */
            boolean isSetDataQualityType();
            
            /**
             * Sets the "DataQualityType" attribute
             */
            void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            void unsetDataQualityType();
            
            /**
             * Gets the "ValidFrom" attribute
             */
            java.util.Calendar getValidFrom();
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidFrom();
            
            /**
             * True if has "ValidFrom" attribute
             */
            boolean isSetValidFrom();
            
            /**
             * Sets the "ValidFrom" attribute
             */
            void setValidFrom(java.util.Calendar validFrom);
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            void unsetValidFrom();
            
            /**
             * Gets the "ValidTo" attribute
             */
            java.util.Calendar getValidTo();
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidTo();
            
            /**
             * True if has "ValidTo" attribute
             */
            boolean isSetValidTo();
            
            /**
             * Sets the "ValidTo" attribute
             */
            void setValidTo(java.util.Calendar validTo);
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
            
            /**
             * Unsets the "ValidTo" attribute
             */
            void unsetValidTo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy newInstance() {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML HealthCondition(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$HealthCondition.
         */
        public interface HealthCondition extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HealthCondition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("healthconditionc78celemtype");
            
            /**
             * Gets the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
            
            /**
             * True if has "DataQualityType" attribute
             */
            boolean isSetDataQualityType();
            
            /**
             * Sets the "DataQualityType" attribute
             */
            void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            void unsetDataQualityType();
            
            /**
             * Gets the "ValidFrom" attribute
             */
            java.util.Calendar getValidFrom();
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidFrom();
            
            /**
             * True if has "ValidFrom" attribute
             */
            boolean isSetValidFrom();
            
            /**
             * Sets the "ValidFrom" attribute
             */
            void setValidFrom(java.util.Calendar validFrom);
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            void unsetValidFrom();
            
            /**
             * Gets the "ValidTo" attribute
             */
            java.util.Calendar getValidTo();
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidTo();
            
            /**
             * True if has "ValidTo" attribute
             */
            boolean isSetValidTo();
            
            /**
             * Sets the "ValidTo" attribute
             */
            void setValidTo(java.util.Calendar validTo);
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
            
            /**
             * Unsets the "ValidTo" attribute
             */
            void unsetValidTo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition newInstance() {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo newInstance() {
              return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument newInstance() {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.PhysicalInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.PhysicalInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
