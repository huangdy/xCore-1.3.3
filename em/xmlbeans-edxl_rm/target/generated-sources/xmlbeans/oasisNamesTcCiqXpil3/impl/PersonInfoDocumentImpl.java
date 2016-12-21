/*
 * An XML document type.
 * Localname: PersonInfo
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.PersonInfoDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one PersonInfo(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class PersonInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.PersonInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONINFO$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "PersonInfo");
    
    
    /**
     * Gets the "PersonInfo" element
     */
    public oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo getPersonInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo target = null;
            target = (oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo)get_store().find_element_user(PERSONINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonInfo" element
     */
    public void setPersonInfo(oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo personInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo target = null;
            target = (oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo)get_store().find_element_user(PERSONINFO$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo)get_store().add_element_user(PERSONINFO$0);
            }
            target.set(personInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonInfo" element
     */
    public oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo addNewPersonInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo target = null;
            target = (oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo)get_store().add_element_user(PERSONINFO$0);
            return target;
        }
    }
    /**
     * An XML PersonInfo(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class PersonInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo
    {
        private static final long serialVersionUID = 1L;
        
        public PersonInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AGE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Age");
        private static final javax.xml.namespace.QName CATEGORYTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "CategoryType");
        private static final javax.xml.namespace.QName PHYSICALSTATUS$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "PhysicalStatus");
        private static final javax.xml.namespace.QName MARITALSTATUS$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "MaritalStatus");
        private static final javax.xml.namespace.QName ETHNICITY$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Ethnicity");
        private static final javax.xml.namespace.QName GENDER$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Gender");
        private static final javax.xml.namespace.QName RELIGION$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Religion");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$18 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets the "Age" attribute
         */
        public java.lang.String getAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Age" attribute
         */
        public oasisNamesTcCiqCt3.String xgetAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(AGE$0);
                return target;
            }
        }
        
        /**
         * True if has "Age" attribute
         */
        public boolean isSetAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AGE$0) != null;
            }
        }
        
        /**
         * Sets the "Age" attribute
         */
        public void setAge(java.lang.String age)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGE$0);
                }
                target.setStringValue(age);
            }
        }
        
        /**
         * Sets (as xml) the "Age" attribute
         */
        public void xsetAge(oasisNamesTcCiqCt3.String age)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(AGE$0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(AGE$0);
                }
                target.set(age);
            }
        }
        
        /**
         * Unsets the "Age" attribute
         */
        public void unsetAge()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AGE$0);
            }
        }
        
        /**
         * Gets the "CategoryType" attribute
         */
        public oasisNamesTcCiqXpil3.PersonCategoryTypeList.Enum getCategoryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYTYPE$2);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqXpil3.PersonCategoryTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CategoryType" attribute
         */
        public oasisNamesTcCiqXpil3.PersonCategoryTypeList xgetCategoryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PersonCategoryTypeList target = null;
                target = (oasisNamesTcCiqXpil3.PersonCategoryTypeList)get_store().find_attribute_user(CATEGORYTYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "CategoryType" attribute
         */
        public boolean isSetCategoryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CATEGORYTYPE$2) != null;
            }
        }
        
        /**
         * Sets the "CategoryType" attribute
         */
        public void setCategoryType(oasisNamesTcCiqXpil3.PersonCategoryTypeList.Enum categoryType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYTYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORYTYPE$2);
                }
                target.setEnumValue(categoryType);
            }
        }
        
        /**
         * Sets (as xml) the "CategoryType" attribute
         */
        public void xsetCategoryType(oasisNamesTcCiqXpil3.PersonCategoryTypeList categoryType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PersonCategoryTypeList target = null;
                target = (oasisNamesTcCiqXpil3.PersonCategoryTypeList)get_store().find_attribute_user(CATEGORYTYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.PersonCategoryTypeList)get_store().add_attribute_user(CATEGORYTYPE$2);
                }
                target.set(categoryType);
            }
        }
        
        /**
         * Unsets the "CategoryType" attribute
         */
        public void unsetCategoryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CATEGORYTYPE$2);
            }
        }
        
        /**
         * Gets the "PhysicalStatus" attribute
         */
        public java.lang.String getPhysicalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHYSICALSTATUS$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PhysicalStatus" attribute
         */
        public oasisNamesTcCiqXpil3.PhysicalStatusList xgetPhysicalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalStatusList target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalStatusList)get_store().find_attribute_user(PHYSICALSTATUS$4);
                return target;
            }
        }
        
        /**
         * True if has "PhysicalStatus" attribute
         */
        public boolean isSetPhysicalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PHYSICALSTATUS$4) != null;
            }
        }
        
        /**
         * Sets the "PhysicalStatus" attribute
         */
        public void setPhysicalStatus(java.lang.String physicalStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PHYSICALSTATUS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PHYSICALSTATUS$4);
                }
                target.setStringValue(physicalStatus);
            }
        }
        
        /**
         * Sets (as xml) the "PhysicalStatus" attribute
         */
        public void xsetPhysicalStatus(oasisNamesTcCiqXpil3.PhysicalStatusList physicalStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalStatusList target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalStatusList)get_store().find_attribute_user(PHYSICALSTATUS$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.PhysicalStatusList)get_store().add_attribute_user(PHYSICALSTATUS$4);
                }
                target.set(physicalStatus);
            }
        }
        
        /**
         * Unsets the "PhysicalStatus" attribute
         */
        public void unsetPhysicalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PHYSICALSTATUS$4);
            }
        }
        
        /**
         * Gets the "MaritalStatus" attribute
         */
        public java.lang.String getMaritalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARITALSTATUS$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MaritalStatus" attribute
         */
        public oasisNamesTcCiqXpil3.MaritalStatusList xgetMaritalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.MaritalStatusList target = null;
                target = (oasisNamesTcCiqXpil3.MaritalStatusList)get_store().find_attribute_user(MARITALSTATUS$6);
                return target;
            }
        }
        
        /**
         * True if has "MaritalStatus" attribute
         */
        public boolean isSetMaritalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MARITALSTATUS$6) != null;
            }
        }
        
        /**
         * Sets the "MaritalStatus" attribute
         */
        public void setMaritalStatus(java.lang.String maritalStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARITALSTATUS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARITALSTATUS$6);
                }
                target.setStringValue(maritalStatus);
            }
        }
        
        /**
         * Sets (as xml) the "MaritalStatus" attribute
         */
        public void xsetMaritalStatus(oasisNamesTcCiqXpil3.MaritalStatusList maritalStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.MaritalStatusList target = null;
                target = (oasisNamesTcCiqXpil3.MaritalStatusList)get_store().find_attribute_user(MARITALSTATUS$6);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.MaritalStatusList)get_store().add_attribute_user(MARITALSTATUS$6);
                }
                target.set(maritalStatus);
            }
        }
        
        /**
         * Unsets the "MaritalStatus" attribute
         */
        public void unsetMaritalStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MARITALSTATUS$6);
            }
        }
        
        /**
         * Gets the "Ethnicity" attribute
         */
        public java.lang.String getEthnicity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ETHNICITY$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Ethnicity" attribute
         */
        public oasisNamesTcCiqXpil3.PersonEthnicityList xgetEthnicity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PersonEthnicityList target = null;
                target = (oasisNamesTcCiqXpil3.PersonEthnicityList)get_store().find_attribute_user(ETHNICITY$8);
                return target;
            }
        }
        
        /**
         * True if has "Ethnicity" attribute
         */
        public boolean isSetEthnicity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ETHNICITY$8) != null;
            }
        }
        
        /**
         * Sets the "Ethnicity" attribute
         */
        public void setEthnicity(java.lang.String ethnicity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ETHNICITY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ETHNICITY$8);
                }
                target.setStringValue(ethnicity);
            }
        }
        
        /**
         * Sets (as xml) the "Ethnicity" attribute
         */
        public void xsetEthnicity(oasisNamesTcCiqXpil3.PersonEthnicityList ethnicity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PersonEthnicityList target = null;
                target = (oasisNamesTcCiqXpil3.PersonEthnicityList)get_store().find_attribute_user(ETHNICITY$8);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.PersonEthnicityList)get_store().add_attribute_user(ETHNICITY$8);
                }
                target.set(ethnicity);
            }
        }
        
        /**
         * Unsets the "Ethnicity" attribute
         */
        public void unsetEthnicity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ETHNICITY$8);
            }
        }
        
        /**
         * Gets the "Gender" attribute
         */
        public java.lang.String getGender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENDER$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Gender" attribute
         */
        public oasisNamesTcCiqXpil3.GenderList xgetGender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.GenderList target = null;
                target = (oasisNamesTcCiqXpil3.GenderList)get_store().find_attribute_user(GENDER$10);
                return target;
            }
        }
        
        /**
         * True if has "Gender" attribute
         */
        public boolean isSetGender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GENDER$10) != null;
            }
        }
        
        /**
         * Sets the "Gender" attribute
         */
        public void setGender(java.lang.String gender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENDER$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENDER$10);
                }
                target.setStringValue(gender);
            }
        }
        
        /**
         * Sets (as xml) the "Gender" attribute
         */
        public void xsetGender(oasisNamesTcCiqXpil3.GenderList gender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.GenderList target = null;
                target = (oasisNamesTcCiqXpil3.GenderList)get_store().find_attribute_user(GENDER$10);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.GenderList)get_store().add_attribute_user(GENDER$10);
                }
                target.set(gender);
            }
        }
        
        /**
         * Unsets the "Gender" attribute
         */
        public void unsetGender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GENDER$10);
            }
        }
        
        /**
         * Gets the "Religion" attribute
         */
        public java.lang.String getReligion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELIGION$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Religion" attribute
         */
        public oasisNamesTcCiqXpil3.ReligionList xgetReligion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ReligionList target = null;
                target = (oasisNamesTcCiqXpil3.ReligionList)get_store().find_attribute_user(RELIGION$12);
                return target;
            }
        }
        
        /**
         * True if has "Religion" attribute
         */
        public boolean isSetReligion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELIGION$12) != null;
            }
        }
        
        /**
         * Sets the "Religion" attribute
         */
        public void setReligion(java.lang.String religion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELIGION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELIGION$12);
                }
                target.setStringValue(religion);
            }
        }
        
        /**
         * Sets (as xml) the "Religion" attribute
         */
        public void xsetReligion(oasisNamesTcCiqXpil3.ReligionList religion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ReligionList target = null;
                target = (oasisNamesTcCiqXpil3.ReligionList)get_store().find_attribute_user(RELIGION$12);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.ReligionList)get_store().add_attribute_user(RELIGION$12);
                }
                target.set(religion);
            }
        }
        
        /**
         * Unsets the "Religion" attribute
         */
        public void unsetReligion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELIGION$12);
            }
        }
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$14);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$14);
                return target;
            }
        }
        
        /**
         * True if has "DataQualityType" attribute
         */
        public boolean isSetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATAQUALITYTYPE$14) != null;
            }
        }
        
        /**
         * Sets the "DataQualityType" attribute
         */
        public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$14);
                }
                target.setEnumValue(dataQualityType);
            }
        }
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$14);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$14);
                }
                target.set(dataQualityType);
            }
        }
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        public void unsetDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATAQUALITYTYPE$14);
            }
        }
        
        /**
         * Gets the "ValidFrom" attribute
         */
        public java.util.Calendar getValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$16);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$16);
                return target;
            }
        }
        
        /**
         * True if has "ValidFrom" attribute
         */
        public boolean isSetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDFROM$16) != null;
            }
        }
        
        /**
         * Sets the "ValidFrom" attribute
         */
        public void setValidFrom(java.util.Calendar validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$16);
                }
                target.setCalendarValue(validFrom);
            }
        }
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$16);
                }
                target.set(validFrom);
            }
        }
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        public void unsetValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDFROM$16);
            }
        }
        
        /**
         * Gets the "ValidTo" attribute
         */
        public java.util.Calendar getValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$18);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$18);
                return target;
            }
        }
        
        /**
         * True if has "ValidTo" attribute
         */
        public boolean isSetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDTO$18) != null;
            }
        }
        
        /**
         * Sets the "ValidTo" attribute
         */
        public void setValidTo(java.util.Calendar validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$18);
                }
                target.setCalendarValue(validTo);
            }
        }
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$18);
                }
                target.set(validTo);
            }
        }
        
        /**
         * Unsets the "ValidTo" attribute
         */
        public void unsetValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDTO$18);
            }
        }
    }
}
