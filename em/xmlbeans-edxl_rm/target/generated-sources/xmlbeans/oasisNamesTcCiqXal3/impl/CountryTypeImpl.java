/*
 * XML Type:  CountryType
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.CountryType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3.impl;
/**
 * An XML CountryType(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is a complex type.
 */
public class CountryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.CountryType
{
    private static final long serialVersionUID = 1L;
    
    public CountryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameElement");
    
    
    /**
     * Gets array of all "NameElement" elements
     */
    public oasisNamesTcCiqXal3.CountryType.NameElement[] getNameElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEELEMENT$0, targetList);
            oasisNamesTcCiqXal3.CountryType.NameElement[] result = new oasisNamesTcCiqXal3.CountryType.NameElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NameElement" element
     */
    public oasisNamesTcCiqXal3.CountryType.NameElement getNameElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.CountryType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.CountryType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
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
    public void setNameElementArray(oasisNamesTcCiqXal3.CountryType.NameElement[] nameElementArray)
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
    public void setNameElementArray(int i, oasisNamesTcCiqXal3.CountryType.NameElement nameElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.CountryType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.CountryType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
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
    public oasisNamesTcCiqXal3.CountryType.NameElement insertNewNameElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.CountryType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.CountryType.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameElement" element
     */
    public oasisNamesTcCiqXal3.CountryType.NameElement addNewNameElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.CountryType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.CountryType.NameElement)get_store().add_element_user(NAMEELEMENT$0);
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
     * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.CountryType$NameElement.
     */
    public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.CountryType.NameElement
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
        private static final javax.xml.namespace.QName NAMECODE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCode");
        private static final javax.xml.namespace.QName NAMECODETYPE$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameCodeType");
        
        
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
        public oasisNamesTcCiqXal3.CountryNameTypeList.Enum getNameType()
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
                return (oasisNamesTcCiqXal3.CountryNameTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NameType" attribute
         */
        public oasisNamesTcCiqXal3.CountryNameTypeList xgetNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.CountryNameTypeList target = null;
                target = (oasisNamesTcCiqXal3.CountryNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
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
        public void setNameType(oasisNamesTcCiqXal3.CountryNameTypeList.Enum nameType)
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
        public void xsetNameType(oasisNamesTcCiqXal3.CountryNameTypeList nameType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.CountryNameTypeList target = null;
                target = (oasisNamesTcCiqXal3.CountryNameTypeList)get_store().find_attribute_user(NAMETYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.CountryNameTypeList)get_store().add_attribute_user(NAMETYPE$2);
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
        
        /**
         * Gets the "NameCode" attribute
         */
        public java.lang.String getNameCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NameCode" attribute
         */
        public oasisNamesTcCiqXal3.CountryNameCodeList xgetNameCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.CountryNameCodeList target = null;
                target = (oasisNamesTcCiqXal3.CountryNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                return target;
            }
        }
        
        /**
         * True if has "NameCode" attribute
         */
        public boolean isSetNameCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAMECODE$4) != null;
            }
        }
        
        /**
         * Sets the "NameCode" attribute
         */
        public void setNameCode(java.lang.String nameCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODE$4);
                }
                target.setStringValue(nameCode);
            }
        }
        
        /**
         * Sets (as xml) the "NameCode" attribute
         */
        public void xsetNameCode(oasisNamesTcCiqXal3.CountryNameCodeList nameCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.CountryNameCodeList target = null;
                target = (oasisNamesTcCiqXal3.CountryNameCodeList)get_store().find_attribute_user(NAMECODE$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.CountryNameCodeList)get_store().add_attribute_user(NAMECODE$4);
                }
                target.set(nameCode);
            }
        }
        
        /**
         * Unsets the "NameCode" attribute
         */
        public void unsetNameCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAMECODE$4);
            }
        }
        
        /**
         * Gets the "NameCodeType" attribute
         */
        public java.lang.String getNameCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "NameCodeType" attribute
         */
        public oasisNamesTcCiqCt3.String xgetNameCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "NameCodeType" attribute
         */
        public boolean isSetNameCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAMECODETYPE$6) != null;
            }
        }
        
        /**
         * Sets the "NameCodeType" attribute
         */
        public void setNameCodeType(java.lang.String nameCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMECODETYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMECODETYPE$6);
                }
                target.setStringValue(nameCodeType);
            }
        }
        
        /**
         * Sets (as xml) the "NameCodeType" attribute
         */
        public void xsetNameCodeType(oasisNamesTcCiqCt3.String nameCodeType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMECODETYPE$6);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMECODETYPE$6);
                }
                target.set(nameCodeType);
            }
        }
        
        /**
         * Unsets the "NameCodeType" attribute
         */
        public void unsetNameCodeType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAMECODETYPE$6);
            }
        }
    }
}
