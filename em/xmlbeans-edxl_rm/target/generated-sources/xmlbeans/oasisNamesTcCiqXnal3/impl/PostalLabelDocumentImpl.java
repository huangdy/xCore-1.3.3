/*
 * An XML document type.
 * Localname: PostalLabel
 * Namespace: urn:oasis:names:tc:ciq:xnal:3
 * Java type: oasisNamesTcCiqXnal3.PostalLabelDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnal3.impl;
/**
 * A document containing one PostalLabel(@urn:oasis:names:tc:ciq:xnal:3) element.
 *
 * This is a complex type.
 */
public class PostalLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnal3.PostalLabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostalLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTALLABEL$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "PostalLabel");
    
    
    /**
     * Gets the "PostalLabel" element
     */
    public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel getPostalLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel target = null;
            target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel)get_store().find_element_user(POSTALLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PostalLabel" element
     */
    public void setPostalLabel(oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel postalLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel target = null;
            target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel)get_store().find_element_user(POSTALLABEL$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel)get_store().add_element_user(POSTALLABEL$0);
            }
            target.set(postalLabel);
        }
    }
    
    /**
     * Appends and returns a new empty "PostalLabel" element
     */
    public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel addNewPostalLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel target = null;
            target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel)get_store().add_element_user(POSTALLABEL$0);
            return target;
        }
    }
    /**
     * An XML PostalLabel(@urn:oasis:names:tc:ciq:xnal:3).
     *
     * This is a complex type.
     */
    public static class PostalLabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel
    {
        private static final long serialVersionUID = 1L;
        
        public PostalLabelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESSEE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "Addressee");
        private static final javax.xml.namespace.QName ADDRESS$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Address");
        private static final javax.xml.namespace.QName STATUS$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "Status");
        private static final javax.xml.namespace.QName DATEVALIDFROM$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
        private static final javax.xml.namespace.QName DATEVALIDTO$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        private static final javax.xml.namespace.QName LANGUAGECODE$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "LanguageCode");
        
        
        /**
         * Gets array of all "Addressee" elements
         */
        public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee[] getAddresseeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADDRESSEE$0, targetList);
                oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee[] result = new oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Addressee" element
         */
        public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee getAddresseeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee target = null;
                target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee)get_store().find_element_user(ADDRESSEE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Addressee" element
         */
        public int sizeOfAddresseeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESSEE$0);
            }
        }
        
        /**
         * Sets array of all "Addressee" element
         */
        public void setAddresseeArray(oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee[] addresseeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(addresseeArray, ADDRESSEE$0);
            }
        }
        
        /**
         * Sets ith "Addressee" element
         */
        public void setAddresseeArray(int i, oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee addressee)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee target = null;
                target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee)get_store().find_element_user(ADDRESSEE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(addressee);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Addressee" element
         */
        public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee insertNewAddressee(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee target = null;
                target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee)get_store().insert_element_user(ADDRESSEE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Addressee" element
         */
        public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee addNewAddressee()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee target = null;
                target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee)get_store().add_element_user(ADDRESSEE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Addressee" element
         */
        public void removeAddressee(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESSEE$0, i);
            }
        }
        
        /**
         * Gets the "Address" element
         */
        public oasisNamesTcCiqXal3.AddressType getAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Address" element
         */
        public void setAddress(oasisNamesTcCiqXal3.AddressType address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESS$2, 0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESS$2);
                }
                target.set(address);
            }
        }
        
        /**
         * Appends and returns a new empty "Address" element
         */
        public oasisNamesTcCiqXal3.AddressType addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESS$2);
                return target;
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
         * Gets the "DateValidFrom" attribute
         */
        public java.util.Calendar getDateValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$6);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DateValidFrom" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetDateValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$6);
                return target;
            }
        }
        
        /**
         * True if has "DateValidFrom" attribute
         */
        public boolean isSetDateValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATEVALIDFROM$6) != null;
            }
        }
        
        /**
         * Sets the "DateValidFrom" attribute
         */
        public void setDateValidFrom(java.util.Calendar dateValidFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$6);
                }
                target.setCalendarValue(dateValidFrom);
            }
        }
        
        /**
         * Sets (as xml) the "DateValidFrom" attribute
         */
        public void xsetDateValidFrom(org.apache.xmlbeans.XmlDateTime dateValidFrom)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$6);
                }
                target.set(dateValidFrom);
            }
        }
        
        /**
         * Unsets the "DateValidFrom" attribute
         */
        public void unsetDateValidFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATEVALIDFROM$6);
            }
        }
        
        /**
         * Gets the "DateValidTo" attribute
         */
        public java.util.Calendar getDateValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$8);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DateValidTo" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetDateValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$8);
                return target;
            }
        }
        
        /**
         * True if has "DateValidTo" attribute
         */
        public boolean isSetDateValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DATEVALIDTO$8) != null;
            }
        }
        
        /**
         * Sets the "DateValidTo" attribute
         */
        public void setDateValidTo(java.util.Calendar dateValidTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$8);
                }
                target.setCalendarValue(dateValidTo);
            }
        }
        
        /**
         * Sets (as xml) the "DateValidTo" attribute
         */
        public void xsetDateValidTo(org.apache.xmlbeans.XmlDateTime dateValidTo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$8);
                }
                target.set(dateValidTo);
            }
        }
        
        /**
         * Unsets the "DateValidTo" attribute
         */
        public void unsetDateValidTo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DATEVALIDTO$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$10);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$10);
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
                return get_store().find_attribute_user(DATAQUALITYTYPE$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$10);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$10);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$10);
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
                get_store().remove_attribute(DATAQUALITYTYPE$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$12);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$12);
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
                return get_store().find_attribute_user(VALIDFROM$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$12);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$12);
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
                get_store().remove_attribute(VALIDFROM$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$14);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$14);
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
                return get_store().find_attribute_user(VALIDTO$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$14);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$14);
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
                get_store().remove_attribute(VALIDTO$14);
            }
        }
        
        /**
         * Gets the "LanguageCode" attribute
         */
        public java.lang.String getLanguageCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LanguageCode" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLanguageCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$16);
                return target;
            }
        }
        
        /**
         * True if has "LanguageCode" attribute
         */
        public boolean isSetLanguageCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANGUAGECODE$16) != null;
            }
        }
        
        /**
         * Sets the "LanguageCode" attribute
         */
        public void setLanguageCode(java.lang.String languageCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$16);
                }
                target.setStringValue(languageCode);
            }
        }
        
        /**
         * Sets (as xml) the "LanguageCode" attribute
         */
        public void xsetLanguageCode(org.apache.xmlbeans.XmlLanguage languageCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGECODE$16);
                }
                target.set(languageCode);
            }
        }
        
        /**
         * Unsets the "LanguageCode" attribute
         */
        public void unsetLanguageCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANGUAGECODE$16);
            }
        }
        /**
         * An XML Addressee(@urn:oasis:names:tc:ciq:xnal:3).
         *
         * This is a complex type.
         */
        public static class AddresseeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee
        {
            private static final long serialVersionUID = 1L;
            
            public AddresseeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DESIGNATION$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "Designation");
            private static final javax.xml.namespace.QName PARTYNAME$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PartyName");
            private static final javax.xml.namespace.QName DEPENDENCYNAME$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "DependencyName");
            private static final javax.xml.namespace.QName LANGUAGECODE$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "LanguageCode");
            
            
            /**
             * Gets array of all "Designation" elements
             */
            public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation[] getDesignationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DESIGNATION$0, targetList);
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation[] result = new oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Designation" element
             */
            public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation getDesignationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation target = null;
                    target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation)get_store().find_element_user(DESIGNATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Designation" element
             */
            public int sizeOfDesignationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DESIGNATION$0);
                }
            }
            
            /**
             * Sets array of all "Designation" element
             */
            public void setDesignationArray(oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation[] designationArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(designationArray, DESIGNATION$0);
                }
            }
            
            /**
             * Sets ith "Designation" element
             */
            public void setDesignationArray(int i, oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation designation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation target = null;
                    target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation)get_store().find_element_user(DESIGNATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(designation);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Designation" element
             */
            public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation insertNewDesignation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation target = null;
                    target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation)get_store().insert_element_user(DESIGNATION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Designation" element
             */
            public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation addNewDesignation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation target = null;
                    target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation)get_store().add_element_user(DESIGNATION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Designation" element
             */
            public void removeDesignation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DESIGNATION$0, i);
                }
            }
            
            /**
             * Gets the "PartyName" element
             */
            public oasisNamesTcCiqXnl3.PartyNameType getPartyName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PartyNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().find_element_user(PARTYNAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "PartyName" element
             */
            public boolean isSetPartyName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PARTYNAME$2) != 0;
                }
            }
            
            /**
             * Sets the "PartyName" element
             */
            public void setPartyName(oasisNamesTcCiqXnl3.PartyNameType partyName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PartyNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().find_element_user(PARTYNAME$2, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().add_element_user(PARTYNAME$2);
                    }
                    target.set(partyName);
                }
            }
            
            /**
             * Appends and returns a new empty "PartyName" element
             */
            public oasisNamesTcCiqXnl3.PartyNameType addNewPartyName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PartyNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().add_element_user(PARTYNAME$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "PartyName" element
             */
            public void unsetPartyName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PARTYNAME$2, 0);
                }
            }
            
            /**
             * Gets array of all "DependencyName" elements
             */
            public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName[] getDependencyNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DEPENDENCYNAME$4, targetList);
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName[] result = new oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "DependencyName" element
             */
            public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName getDependencyNameArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName target = null;
                    target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName)get_store().find_element_user(DEPENDENCYNAME$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "DependencyName" element
             */
            public int sizeOfDependencyNameArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DEPENDENCYNAME$4);
                }
            }
            
            /**
             * Sets array of all "DependencyName" element
             */
            public void setDependencyNameArray(oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName[] dependencyNameArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dependencyNameArray, DEPENDENCYNAME$4);
                }
            }
            
            /**
             * Sets ith "DependencyName" element
             */
            public void setDependencyNameArray(int i, oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName dependencyName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName target = null;
                    target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName)get_store().find_element_user(DEPENDENCYNAME$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dependencyName);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DependencyName" element
             */
            public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName insertNewDependencyName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName target = null;
                    target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName)get_store().insert_element_user(DEPENDENCYNAME$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DependencyName" element
             */
            public oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName addNewDependencyName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName target = null;
                    target = (oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName)get_store().add_element_user(DEPENDENCYNAME$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DependencyName" element
             */
            public void removeDependencyName(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DEPENDENCYNAME$4, i);
                }
            }
            
            /**
             * Gets the "LanguageCode" attribute
             */
            public java.lang.String getLanguageCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "LanguageCode" attribute
             */
            public org.apache.xmlbeans.XmlLanguage xgetLanguageCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLanguage target = null;
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$6);
                    return target;
                }
            }
            
            /**
             * True if has "LanguageCode" attribute
             */
            public boolean isSetLanguageCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LANGUAGECODE$6) != null;
                }
            }
            
            /**
             * Sets the "LanguageCode" attribute
             */
            public void setLanguageCode(java.lang.String languageCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$6);
                    }
                    target.setStringValue(languageCode);
                }
            }
            
            /**
             * Sets (as xml) the "LanguageCode" attribute
             */
            public void xsetLanguageCode(org.apache.xmlbeans.XmlLanguage languageCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLanguage target = null;
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGECODE$6);
                    }
                    target.set(languageCode);
                }
            }
            
            /**
             * Unsets the "LanguageCode" attribute
             */
            public void unsetLanguageCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LANGUAGECODE$6);
                }
            }
            /**
             * An XML Designation(@urn:oasis:names:tc:ciq:xnal:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXnal3.PostalLabelDocument$PostalLabel$Addressee$Designation.
             */
            public static class DesignationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.Designation
            {
                private static final long serialVersionUID = 1L;
                
                public DesignationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected DesignationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                
            }
            /**
             * An XML DependencyName(@urn:oasis:names:tc:ciq:xnal:3).
             *
             * This is a complex type.
             */
            public static class DependencyNameImpl extends oasisNamesTcCiqXnl3.impl.PartyNameTypeImpl implements oasisNamesTcCiqXnal3.PostalLabelDocument.PostalLabel.Addressee.DependencyName
            {
                private static final long serialVersionUID = 1L;
                
                public DependencyNameImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TYPE2$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "Type");
                
                
                /**
                 * Gets the "Type" attribute
                 */
                public java.lang.String getType2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE2$0);
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
                public oasisNamesTcCiqXnal3.DependencyTypeList xgetType2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXnal3.DependencyTypeList target = null;
                      target = (oasisNamesTcCiqXnal3.DependencyTypeList)get_store().find_attribute_user(TYPE2$0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Type" attribute
                 */
                public void setType2(java.lang.String type2)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE2$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE2$0);
                      }
                      target.setStringValue(type2);
                    }
                }
                
                /**
                 * Sets (as xml) the "Type" attribute
                 */
                public void xsetType2(oasisNamesTcCiqXnal3.DependencyTypeList type2)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXnal3.DependencyTypeList target = null;
                      target = (oasisNamesTcCiqXnal3.DependencyTypeList)get_store().find_attribute_user(TYPE2$0);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXnal3.DependencyTypeList)get_store().add_attribute_user(TYPE2$0);
                      }
                      target.set(type2);
                    }
                }
            }
        }
    }
}
