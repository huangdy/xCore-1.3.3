/*
 * An XML document type.
 * Localname: BirthInfo
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.BirthInfoDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one BirthInfo(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class BirthInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.BirthInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public BirthInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIRTHINFO$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "BirthInfo");
    
    
    /**
     * Gets the "BirthInfo" element
     */
    public oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo getBirthInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo target = null;
            target = (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo)get_store().find_element_user(BIRTHINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BirthInfo" element
     */
    public void setBirthInfo(oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo birthInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo target = null;
            target = (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo)get_store().find_element_user(BIRTHINFO$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo)get_store().add_element_user(BIRTHINFO$0);
            }
            target.set(birthInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "BirthInfo" element
     */
    public oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo addNewBirthInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo target = null;
            target = (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo)get_store().add_element_user(BIRTHINFO$0);
            return target;
        }
    }
    /**
     * An XML BirthInfo(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class BirthInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo
    {
        private static final long serialVersionUID = 1L;
        
        public BirthInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BIRTHINFOELEMENT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "BirthInfoElement");
        private static final javax.xml.namespace.QName BIRTHPLACEDETAILS$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "BirthPlaceDetails");
        private static final javax.xml.namespace.QName BIRTHDATETIME$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "BirthDateTime");
        private static final javax.xml.namespace.QName BIRTHDATETIMEPRECISION$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "BirthDateTimePrecision");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "BirthInfoElement" elements
         */
        public oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement[] getBirthInfoElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BIRTHINFOELEMENT$0, targetList);
                oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement[] result = new oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BirthInfoElement" element
         */
        public oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement getBirthInfoElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement target = null;
                target = (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement)get_store().find_element_user(BIRTHINFOELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BirthInfoElement" element
         */
        public int sizeOfBirthInfoElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIRTHINFOELEMENT$0);
            }
        }
        
        /**
         * Sets array of all "BirthInfoElement" element
         */
        public void setBirthInfoElementArray(oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement[] birthInfoElementArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(birthInfoElementArray, BIRTHINFOELEMENT$0);
            }
        }
        
        /**
         * Sets ith "BirthInfoElement" element
         */
        public void setBirthInfoElementArray(int i, oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement birthInfoElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement target = null;
                target = (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement)get_store().find_element_user(BIRTHINFOELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(birthInfoElement);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BirthInfoElement" element
         */
        public oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement insertNewBirthInfoElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement target = null;
                target = (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement)get_store().insert_element_user(BIRTHINFOELEMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BirthInfoElement" element
         */
        public oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement addNewBirthInfoElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement target = null;
                target = (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement)get_store().add_element_user(BIRTHINFOELEMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "BirthInfoElement" element
         */
        public void removeBirthInfoElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIRTHINFOELEMENT$0, i);
            }
        }
        
        /**
         * Gets the "BirthPlaceDetails" element
         */
        public oasisNamesTcCiqXal3.AddressType getBirthPlaceDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(BIRTHPLACEDETAILS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "BirthPlaceDetails" element
         */
        public boolean isSetBirthPlaceDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIRTHPLACEDETAILS$2) != 0;
            }
        }
        
        /**
         * Sets the "BirthPlaceDetails" element
         */
        public void setBirthPlaceDetails(oasisNamesTcCiqXal3.AddressType birthPlaceDetails)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(BIRTHPLACEDETAILS$2, 0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(BIRTHPLACEDETAILS$2);
                }
                target.set(birthPlaceDetails);
            }
        }
        
        /**
         * Appends and returns a new empty "BirthPlaceDetails" element
         */
        public oasisNamesTcCiqXal3.AddressType addNewBirthPlaceDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(BIRTHPLACEDETAILS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "BirthPlaceDetails" element
         */
        public void unsetBirthPlaceDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIRTHPLACEDETAILS$2, 0);
            }
        }
        
        /**
         * Gets the "BirthDateTime" attribute
         */
        public java.util.Calendar getBirthDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIRTHDATETIME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "BirthDateTime" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetBirthDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(BIRTHDATETIME$4);
                return target;
            }
        }
        
        /**
         * True if has "BirthDateTime" attribute
         */
        public boolean isSetBirthDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BIRTHDATETIME$4) != null;
            }
        }
        
        /**
         * Sets the "BirthDateTime" attribute
         */
        public void setBirthDateTime(java.util.Calendar birthDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIRTHDATETIME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BIRTHDATETIME$4);
                }
                target.setCalendarValue(birthDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "BirthDateTime" attribute
         */
        public void xsetBirthDateTime(org.apache.xmlbeans.XmlDateTime birthDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(BIRTHDATETIME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(BIRTHDATETIME$4);
                }
                target.set(birthDateTime);
            }
        }
        
        /**
         * Unsets the "BirthDateTime" attribute
         */
        public void unsetBirthDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BIRTHDATETIME$4);
            }
        }
        
        /**
         * Gets the "BirthDateTimePrecision" attribute
         */
        public org.apache.xmlbeans.GDuration getBirthDateTimePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIRTHDATETIMEPRECISION$6);
                if (target == null)
                {
                    return null;
                }
                return target.getGDurationValue();
            }
        }
        
        /**
         * Gets (as xml) the "BirthDateTimePrecision" attribute
         */
        public org.apache.xmlbeans.XmlDuration xgetBirthDateTimePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDuration target = null;
                target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(BIRTHDATETIMEPRECISION$6);
                return target;
            }
        }
        
        /**
         * True if has "BirthDateTimePrecision" attribute
         */
        public boolean isSetBirthDateTimePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BIRTHDATETIMEPRECISION$6) != null;
            }
        }
        
        /**
         * Sets the "BirthDateTimePrecision" attribute
         */
        public void setBirthDateTimePrecision(org.apache.xmlbeans.GDuration birthDateTimePrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BIRTHDATETIMEPRECISION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BIRTHDATETIMEPRECISION$6);
                }
                target.setGDurationValue(birthDateTimePrecision);
            }
        }
        
        /**
         * Sets (as xml) the "BirthDateTimePrecision" attribute
         */
        public void xsetBirthDateTimePrecision(org.apache.xmlbeans.XmlDuration birthDateTimePrecision)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDuration target = null;
                target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(BIRTHDATETIMEPRECISION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDuration)get_store().add_attribute_user(BIRTHDATETIMEPRECISION$6);
                }
                target.set(birthDateTimePrecision);
            }
        }
        
        /**
         * Unsets the "BirthDateTimePrecision" attribute
         */
        public void unsetBirthDateTimePrecision()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BIRTHDATETIMEPRECISION$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$8);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$8);
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
                return get_store().find_attribute_user(DATAQUALITYTYPE$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$8);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$8);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$8);
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
                get_store().remove_attribute(DATAQUALITYTYPE$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$10);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$10);
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
                return get_store().find_attribute_user(VALIDFROM$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$10);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$10);
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
                get_store().remove_attribute(VALIDFROM$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$12);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$12);
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
                return get_store().find_attribute_user(VALIDTO$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$12);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$12);
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
                get_store().remove_attribute(VALIDTO$12);
            }
        }
        /**
         * An XML BirthInfoElement(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.BirthInfoDocument$BirthInfo$BirthInfoElement.
         */
        public static class BirthInfoElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement
        {
            private static final long serialVersionUID = 1L;
            
            public BirthInfoElementImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected BirthInfoElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            
            
            /**
             * Gets the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.BirthInfoElementList.Enum getType()
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
                    return (oasisNamesTcCiqXpil3.BirthInfoElementList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.BirthInfoElementList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.BirthInfoElementList target = null;
                    target = (oasisNamesTcCiqXpil3.BirthInfoElementList)get_store().find_attribute_user(TYPE$0);
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
            public void setType(oasisNamesTcCiqXpil3.BirthInfoElementList.Enum type)
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
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXpil3.BirthInfoElementList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.BirthInfoElementList target = null;
                    target = (oasisNamesTcCiqXpil3.BirthInfoElementList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.BirthInfoElementList)get_store().add_attribute_user(TYPE$0);
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
        }
    }
}
