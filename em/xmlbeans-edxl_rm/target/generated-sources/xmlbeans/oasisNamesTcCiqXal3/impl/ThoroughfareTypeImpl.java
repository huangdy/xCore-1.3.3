/*
 * XML Type:  ThoroughfareType
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.ThoroughfareType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3.impl;
/**
 * An XML ThoroughfareType(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is a complex type.
 */
public class ThoroughfareTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.ThoroughfareType
{
    private static final long serialVersionUID = 1L;
    
    public ThoroughfareTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameElement");
    private static final javax.xml.namespace.QName NUMBER$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Number");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
    private static final javax.xml.namespace.QName TYPECODE$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "TypeCode");
    private static final javax.xml.namespace.QName DATAQUALITYTYPE$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
    private static final javax.xml.namespace.QName VALIDFROM$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
    private static final javax.xml.namespace.QName VALIDTO$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
    
    
    /**
     * Gets array of all "NameElement" elements
     */
    public oasisNamesTcCiqXal3.ThoroughfareType.NameElement[] getNameElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEELEMENT$0, targetList);
            oasisNamesTcCiqXal3.ThoroughfareType.NameElement[] result = new oasisNamesTcCiqXal3.ThoroughfareType.NameElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NameElement" element
     */
    public oasisNamesTcCiqXal3.ThoroughfareType.NameElement getNameElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.ThoroughfareType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.ThoroughfareType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NameElement" element
     */
    public int sizeOfNameElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEELEMENT$0);
        }
    }
    
    /**
     * Sets array of all "NameElement" element
     */
    public void setNameElementArray(oasisNamesTcCiqXal3.ThoroughfareType.NameElement[] nameElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameElementArray, NAMEELEMENT$0);
        }
    }
    
    /**
     * Sets ith "NameElement" element
     */
    public void setNameElementArray(int i, oasisNamesTcCiqXal3.ThoroughfareType.NameElement nameElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.ThoroughfareType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.ThoroughfareType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nameElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
     */
    public oasisNamesTcCiqXal3.ThoroughfareType.NameElement insertNewNameElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.ThoroughfareType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.ThoroughfareType.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameElement" element
     */
    public oasisNamesTcCiqXal3.ThoroughfareType.NameElement addNewNameElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.ThoroughfareType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.ThoroughfareType.NameElement)get_store().add_element_user(NAMEELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "NameElement" element
     */
    public void removeNameElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEELEMENT$0, i);
        }
    }
    
    /**
     * Gets array of all "Number" elements
     */
    public oasisNamesTcCiqXal3.IdentifierType[] getNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NUMBER$2, targetList);
            oasisNamesTcCiqXal3.IdentifierType[] result = new oasisNamesTcCiqXal3.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Number" element
     */
    public oasisNamesTcCiqXal3.IdentifierType getNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.IdentifierType target = null;
            target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(NUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Number" element
     */
    public int sizeOfNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBER$2);
        }
    }
    
    /**
     * Sets array of all "Number" element
     */
    public void setNumberArray(oasisNamesTcCiqXal3.IdentifierType[] numberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(numberArray, NUMBER$2);
        }
    }
    
    /**
     * Sets ith "Number" element
     */
    public void setNumberArray(int i, oasisNamesTcCiqXal3.IdentifierType number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.IdentifierType target = null;
            target = (oasisNamesTcCiqXal3.IdentifierType)get_store().find_element_user(NUMBER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(number);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Number" element
     */
    public oasisNamesTcCiqXal3.IdentifierType insertNewNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.IdentifierType target = null;
            target = (oasisNamesTcCiqXal3.IdentifierType)get_store().insert_element_user(NUMBER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Number" element
     */
    public oasisNamesTcCiqXal3.IdentifierType addNewNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.IdentifierType target = null;
            target = (oasisNamesTcCiqXal3.IdentifierType)get_store().add_element_user(NUMBER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Number" element
     */
    public void removeNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBER$2, i);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
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
    public oasisNamesTcCiqXal3.ThoroughfareTypeList xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.ThoroughfareTypeList target = null;
            target = (oasisNamesTcCiqXal3.ThoroughfareTypeList)get_store().find_attribute_user(TYPE$4);
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
            return get_store().find_attribute_user(TYPE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(oasisNamesTcCiqXal3.ThoroughfareTypeList type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.ThoroughfareTypeList target = null;
            target = (oasisNamesTcCiqXal3.ThoroughfareTypeList)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.ThoroughfareTypeList)get_store().add_attribute_user(TYPE$4);
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
            get_store().remove_attribute(TYPE$4);
        }
    }
    
    /**
     * Gets the "TypeCode" attribute
     */
    public java.lang.String getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeCode" attribute
     */
    public oasisNamesTcCiqCt3.String xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(TYPECODE$6);
            return target;
        }
    }
    
    /**
     * True if has "TypeCode" attribute
     */
    public boolean isSetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPECODE$6) != null;
        }
    }
    
    /**
     * Sets the "TypeCode" attribute
     */
    public void setTypeCode(java.lang.String typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$6);
            }
            target.setStringValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "TypeCode" attribute
     */
    public void xsetTypeCode(oasisNamesTcCiqCt3.String typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(TYPECODE$6);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(TYPECODE$6);
            }
            target.set(typeCode);
        }
    }
    
    /**
     * Unsets the "TypeCode" attribute
     */
    public void unsetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPECODE$6);
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
     * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.ThoroughfareType$NameElement.
     */
    public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.ThoroughfareType.NameElement
    {
        private static final long serialVersionUID = 1L;
        
        public NameElementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected NameElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName ABBREVIATION$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
        private static final javax.xml.namespace.QName NAMETYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameType");
        
        
        /**
         * Gets the "Abbreviation" attribute
         */
        public boolean getAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Abbreviation" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                return target;
            }
        }
        
        /**
         * True if has "Abbreviation" attribute
         */
        public boolean isSetAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ABBREVIATION$0) != null;
            }
        }
        
        /**
         * Sets the "Abbreviation" attribute
         */
        public void setAbbreviation(boolean abbreviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBREVIATION$0);
                }
                target.setBooleanValue(abbreviation);
            }
        }
        
        /**
         * Sets (as xml) the "Abbreviation" attribute
         */
        public void xsetAbbreviation(org.apache.xmlbeans.XmlBoolean abbreviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABBREVIATION$0);
                }
                target.set(abbreviation);
            }
        }
        
        /**
         * Unsets the "Abbreviation" attribute
         */
        public void unsetAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ABBREVIATION$0);
            }
        }
        
        /**
         * Gets the "NameType" attribute
         */
        public oasisNamesTcCiqXal3.ThoroughfareNameTypeList.Enum getNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqXal3.ThoroughfareNameTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NameType" attribute
         */
        public oasisNamesTcCiqXal3.ThoroughfareNameTypeList xgetNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.ThoroughfareNameTypeList target = null;
                target = (oasisNamesTcCiqXal3.ThoroughfareNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                return target;
            }
        }
        
        /**
         * True if has "NameType" attribute
         */
        public boolean isSetNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAMETYPE$2) != null;
            }
        }
        
        /**
         * Sets the "NameType" attribute
         */
        public void setNameType(oasisNamesTcCiqXal3.ThoroughfareNameTypeList.Enum nameType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMETYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMETYPE$2);
                }
                target.setEnumValue(nameType);
            }
        }
        
        /**
         * Sets (as xml) the "NameType" attribute
         */
        public void xsetNameType(oasisNamesTcCiqXal3.ThoroughfareNameTypeList nameType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.ThoroughfareNameTypeList target = null;
                target = (oasisNamesTcCiqXal3.ThoroughfareNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.ThoroughfareNameTypeList)get_store().add_attribute_user(NAMETYPE$2);
                }
                target.set(nameType);
            }
        }
        
        /**
         * Unsets the "NameType" attribute
         */
        public void unsetNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAMETYPE$2);
            }
        }
    }
}
