/*
 * An XML document type.
 * Localname: OrganisationInfo
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.OrganisationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one OrganisationInfo(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class OrganisationInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.OrganisationInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONINFO$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OrganisationInfo");
    
    
    /**
     * Gets the "OrganisationInfo" element
     */
    public oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo getOrganisationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo)get_store().find_element_user(ORGANISATIONINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationInfo" element
     */
    public void setOrganisationInfo(oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo organisationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo)get_store().find_element_user(ORGANISATIONINFO$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo)get_store().add_element_user(ORGANISATIONINFO$0);
            }
            target.set(organisationInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationInfo" element
     */
    public oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo addNewOrganisationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo)get_store().add_element_user(ORGANISATIONINFO$0);
            return target;
        }
    }
    /**
     * An XML OrganisationInfo(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class OrganisationInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
        private static final javax.xml.namespace.QName CATEGORYTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "CategoryType");
        private static final javax.xml.namespace.QName STATUS$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
        private static final javax.xml.namespace.QName NATURE$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Nature");
        private static final javax.xml.namespace.QName INDUSTRYTYPE$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "IndustryType");
        private static final javax.xml.namespace.QName INDUSTRYCODE$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "IndustryCode");
        private static final javax.xml.namespace.QName INDUSTRYCODETYPE$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "IndustryCodeType");
        private static final javax.xml.namespace.QName NUMBEROFEMPLOYEES$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "NumberOfEmployees");
        private static final javax.xml.namespace.QName OPERATINGHOURSTARTTIME$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OperatingHourStartTime");
        private static final javax.xml.namespace.QName OPERATINGHOURENDTIME$18 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OperatingHourEndTime");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$20 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$22 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$24 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXpil3.OrganisationInfoTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OrganisationInfoTypeList target = null;
                target = (oasisNamesTcCiqXpil3.OrganisationInfoTypeList)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "Type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "Type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXpil3.OrganisationInfoTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OrganisationInfoTypeList target = null;
                target = (oasisNamesTcCiqXpil3.OrganisationInfoTypeList)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.OrganisationInfoTypeList)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "Type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }
        
        /**
         * Gets the "CategoryType" attribute
         */
        public oasisNamesTcCiqXpil3.OrganisationCategoryTypeList.Enum getCategoryType()
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
                return (oasisNamesTcCiqXpil3.OrganisationCategoryTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "CategoryType" attribute
         */
        public oasisNamesTcCiqXpil3.OrganisationCategoryTypeList xgetCategoryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OrganisationCategoryTypeList target = null;
                target = (oasisNamesTcCiqXpil3.OrganisationCategoryTypeList)get_store().find_attribute_user(CATEGORYTYPE$2);
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
        public void setCategoryType(oasisNamesTcCiqXpil3.OrganisationCategoryTypeList.Enum categoryType)
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
        public void xsetCategoryType(oasisNamesTcCiqXpil3.OrganisationCategoryTypeList categoryType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OrganisationCategoryTypeList target = null;
                target = (oasisNamesTcCiqXpil3.OrganisationCategoryTypeList)get_store().find_attribute_user(CATEGORYTYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.OrganisationCategoryTypeList)get_store().add_attribute_user(CATEGORYTYPE$2);
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
         * Gets the "Status" attribute
         */
        public java.lang.String getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Status" attribute
         */
        public oasisNamesTcCiqCt3.StatusList xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.StatusList target = null;
                target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$4);
                return target;
            }
        }
        
        /**
         * True if has "Status" attribute
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATUS$4) != null;
            }
        }
        
        /**
         * Sets the "Status" attribute
         */
        public void setStatus(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$4);
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "Status" attribute
         */
        public void xsetStatus(oasisNamesTcCiqCt3.StatusList status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.StatusList target = null;
                target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$4);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "Status" attribute
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATUS$4);
            }
        }
        
        /**
         * Gets the "Nature" attribute
         */
        public java.lang.String getNature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NATURE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Nature" attribute
         */
        public oasisNamesTcCiqXpil3.OrganisationInfoNatureList xgetNature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OrganisationInfoNatureList target = null;
                target = (oasisNamesTcCiqXpil3.OrganisationInfoNatureList)get_store().find_attribute_user(NATURE$6);
                return target;
            }
        }
        
        /**
         * True if has "Nature" attribute
         */
        public boolean isSetNature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NATURE$6) != null;
            }
        }
        
        /**
         * Sets the "Nature" attribute
         */
        public void setNature(java.lang.String nature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NATURE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NATURE$6);
                }
                target.setStringValue(nature);
            }
        }
        
        /**
         * Sets (as xml) the "Nature" attribute
         */
        public void xsetNature(oasisNamesTcCiqXpil3.OrganisationInfoNatureList nature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OrganisationInfoNatureList target = null;
                target = (oasisNamesTcCiqXpil3.OrganisationInfoNatureList)get_store().find_attribute_user(NATURE$6);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.OrganisationInfoNatureList)get_store().add_attribute_user(NATURE$6);
                }
                target.set(nature);
            }
        }
        
        /**
         * Unsets the "Nature" attribute
         */
        public void unsetNature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NATURE$6);
            }
        }
        
        /**
         * Gets the "IndustryType" attribute
         */
        public java.lang.String getIndustryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDUSTRYTYPE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IndustryType" attribute
         */
        public oasisNamesTcCiqXpil3.IndustryTypeList xgetIndustryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.IndustryTypeList target = null;
                target = (oasisNamesTcCiqXpil3.IndustryTypeList)get_store().find_attribute_user(INDUSTRYTYPE$8);
                return target;
            }
        }
        
        /**
         * True if has "IndustryType" attribute
         */
        public boolean isSetIndustryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INDUSTRYTYPE$8) != null;
            }
        }
        
        /**
         * Sets the "IndustryType" attribute
         */
        public void setIndustryType(java.lang.String industryType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDUSTRYTYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDUSTRYTYPE$8);
                }
                target.setStringValue(industryType);
            }
        }
        
        /**
         * Sets (as xml) the "IndustryType" attribute
         */
        public void xsetIndustryType(oasisNamesTcCiqXpil3.IndustryTypeList industryType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.IndustryTypeList target = null;
                target = (oasisNamesTcCiqXpil3.IndustryTypeList)get_store().find_attribute_user(INDUSTRYTYPE$8);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.IndustryTypeList)get_store().add_attribute_user(INDUSTRYTYPE$8);
                }
                target.set(industryType);
            }
        }
        
        /**
         * Unsets the "IndustryType" attribute
         */
        public void unsetIndustryType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INDUSTRYTYPE$8);
            }
        }
        
        /**
         * Gets the "IndustryCode" attribute
         */
        public java.lang.String getIndustryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDUSTRYCODE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IndustryCode" attribute
         */
        public oasisNamesTcCiqXpil3.IndustryCodeList xgetIndustryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.IndustryCodeList target = null;
                target = (oasisNamesTcCiqXpil3.IndustryCodeList)get_store().find_attribute_user(INDUSTRYCODE$10);
                return target;
            }
        }
        
        /**
         * True if has "IndustryCode" attribute
         */
        public boolean isSetIndustryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INDUSTRYCODE$10) != null;
            }
        }
        
        /**
         * Sets the "IndustryCode" attribute
         */
        public void setIndustryCode(java.lang.String industryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDUSTRYCODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDUSTRYCODE$10);
                }
                target.setStringValue(industryCode);
            }
        }
        
        /**
         * Sets (as xml) the "IndustryCode" attribute
         */
        public void xsetIndustryCode(oasisNamesTcCiqXpil3.IndustryCodeList industryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.IndustryCodeList target = null;
                target = (oasisNamesTcCiqXpil3.IndustryCodeList)get_store().find_attribute_user(INDUSTRYCODE$10);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.IndustryCodeList)get_store().add_attribute_user(INDUSTRYCODE$10);
                }
                target.set(industryCode);
            }
        }
        
        /**
         * Unsets the "IndustryCode" attribute
         */
        public void unsetIndustryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INDUSTRYCODE$10);
            }
        }
        
        /**
         * Gets the "IndustryCodeType" attribute
         */
        public java.lang.String getIndustryCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDUSTRYCODETYPE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IndustryCodeType" attribute
         */
        public oasisNamesTcCiqCt3.String xgetIndustryCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(INDUSTRYCODETYPE$12);
                return target;
            }
        }
        
        /**
         * True if has "IndustryCodeType" attribute
         */
        public boolean isSetIndustryCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INDUSTRYCODETYPE$12) != null;
            }
        }
        
        /**
         * Sets the "IndustryCodeType" attribute
         */
        public void setIndustryCodeType(java.lang.String industryCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDUSTRYCODETYPE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDUSTRYCODETYPE$12);
                }
                target.setStringValue(industryCodeType);
            }
        }
        
        /**
         * Sets (as xml) the "IndustryCodeType" attribute
         */
        public void xsetIndustryCodeType(oasisNamesTcCiqCt3.String industryCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(INDUSTRYCODETYPE$12);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(INDUSTRYCODETYPE$12);
                }
                target.set(industryCodeType);
            }
        }
        
        /**
         * Unsets the "IndustryCodeType" attribute
         */
        public void unsetIndustryCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INDUSTRYCODETYPE$12);
            }
        }
        
        /**
         * Gets the "NumberOfEmployees" attribute
         */
        public java.lang.String getNumberOfEmployees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBEROFEMPLOYEES$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NumberOfEmployees" attribute
         */
        public oasisNamesTcCiqCt3.String xgetNumberOfEmployees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NUMBEROFEMPLOYEES$14);
                return target;
            }
        }
        
        /**
         * True if has "NumberOfEmployees" attribute
         */
        public boolean isSetNumberOfEmployees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMBEROFEMPLOYEES$14) != null;
            }
        }
        
        /**
         * Sets the "NumberOfEmployees" attribute
         */
        public void setNumberOfEmployees(java.lang.String numberOfEmployees)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMBEROFEMPLOYEES$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMBEROFEMPLOYEES$14);
                }
                target.setStringValue(numberOfEmployees);
            }
        }
        
        /**
         * Sets (as xml) the "NumberOfEmployees" attribute
         */
        public void xsetNumberOfEmployees(oasisNamesTcCiqCt3.String numberOfEmployees)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NUMBEROFEMPLOYEES$14);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NUMBEROFEMPLOYEES$14);
                }
                target.set(numberOfEmployees);
            }
        }
        
        /**
         * Unsets the "NumberOfEmployees" attribute
         */
        public void unsetNumberOfEmployees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMBEROFEMPLOYEES$14);
            }
        }
        
        /**
         * Gets the "OperatingHourStartTime" attribute
         */
        public java.util.Calendar getOperatingHourStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATINGHOURSTARTTIME$16);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperatingHourStartTime" attribute
         */
        public org.apache.xmlbeans.XmlTime xgetOperatingHourStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_attribute_user(OPERATINGHOURSTARTTIME$16);
                return target;
            }
        }
        
        /**
         * True if has "OperatingHourStartTime" attribute
         */
        public boolean isSetOperatingHourStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OPERATINGHOURSTARTTIME$16) != null;
            }
        }
        
        /**
         * Sets the "OperatingHourStartTime" attribute
         */
        public void setOperatingHourStartTime(java.util.Calendar operatingHourStartTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATINGHOURSTARTTIME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATINGHOURSTARTTIME$16);
                }
                target.setCalendarValue(operatingHourStartTime);
            }
        }
        
        /**
         * Sets (as xml) the "OperatingHourStartTime" attribute
         */
        public void xsetOperatingHourStartTime(org.apache.xmlbeans.XmlTime operatingHourStartTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_attribute_user(OPERATINGHOURSTARTTIME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_attribute_user(OPERATINGHOURSTARTTIME$16);
                }
                target.set(operatingHourStartTime);
            }
        }
        
        /**
         * Unsets the "OperatingHourStartTime" attribute
         */
        public void unsetOperatingHourStartTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OPERATINGHOURSTARTTIME$16);
            }
        }
        
        /**
         * Gets the "OperatingHourEndTime" attribute
         */
        public java.util.Calendar getOperatingHourEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATINGHOURENDTIME$18);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperatingHourEndTime" attribute
         */
        public org.apache.xmlbeans.XmlTime xgetOperatingHourEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_attribute_user(OPERATINGHOURENDTIME$18);
                return target;
            }
        }
        
        /**
         * True if has "OperatingHourEndTime" attribute
         */
        public boolean isSetOperatingHourEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OPERATINGHOURENDTIME$18) != null;
            }
        }
        
        /**
         * Sets the "OperatingHourEndTime" attribute
         */
        public void setOperatingHourEndTime(java.util.Calendar operatingHourEndTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATINGHOURENDTIME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATINGHOURENDTIME$18);
                }
                target.setCalendarValue(operatingHourEndTime);
            }
        }
        
        /**
         * Sets (as xml) the "OperatingHourEndTime" attribute
         */
        public void xsetOperatingHourEndTime(org.apache.xmlbeans.XmlTime operatingHourEndTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_attribute_user(OPERATINGHOURENDTIME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_attribute_user(OPERATINGHOURENDTIME$18);
                }
                target.set(operatingHourEndTime);
            }
        }
        
        /**
         * Unsets the "OperatingHourEndTime" attribute
         */
        public void unsetOperatingHourEndTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OPERATINGHOURENDTIME$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$20);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$20);
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
                return get_store().find_attribute_user(DATAQUALITYTYPE$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$20);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$20);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$20);
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
                get_store().remove_attribute(DATAQUALITYTYPE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$22);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$22);
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
                return get_store().find_attribute_user(VALIDFROM$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$22);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$22);
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
                get_store().remove_attribute(VALIDFROM$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$24);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$24);
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
                return get_store().find_attribute_user(VALIDTO$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$24);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$24);
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
                get_store().remove_attribute(VALIDTO$24);
            }
        }
    }
}
