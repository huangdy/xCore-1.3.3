/*
 * XML Type:  PremisesType
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.PremisesType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3.impl;
/**
 * An XML PremisesType(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is a complex type.
 */
public class PremisesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.PremisesType
{
    private static final long serialVersionUID = 1L;
    
    public PremisesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "NameElement");
    private static final javax.xml.namespace.QName NUMBER$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Number");
    
    
    /**
     * Gets array of all "NameElement" elements
     */
    public oasisNamesTcCiqXal3.PremisesType.NameElement[] getNameElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEELEMENT$0, targetList);
            oasisNamesTcCiqXal3.PremisesType.NameElement[] result = new oasisNamesTcCiqXal3.PremisesType.NameElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NameElement" element
     */
    public oasisNamesTcCiqXal3.PremisesType.NameElement getNameElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.PremisesType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.PremisesType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
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
    public void setNameElementArray(oasisNamesTcCiqXal3.PremisesType.NameElement[] nameElementArray)
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
    public void setNameElementArray(int i, oasisNamesTcCiqXal3.PremisesType.NameElement nameElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.PremisesType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.PremisesType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
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
    public oasisNamesTcCiqXal3.PremisesType.NameElement insertNewNameElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.PremisesType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.PremisesType.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameElement" element
     */
    public oasisNamesTcCiqXal3.PremisesType.NameElement addNewNameElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.PremisesType.NameElement target = null;
            target = (oasisNamesTcCiqXal3.PremisesType.NameElement)get_store().add_element_user(NAMEELEMENT$0);
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
     * An XML NameElement(@urn:oasis:names:tc:ciq:xal:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.PremisesType$NameElement.
     */
    public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.PremisesType.NameElement
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
        public oasisNamesTcCiqXal3.PremisesElementTypeList.Enum getNameType()
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
                return (oasisNamesTcCiqXal3.PremisesElementTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "NameType" attribute
         */
        public oasisNamesTcCiqXal3.PremisesElementTypeList xgetNameType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.PremisesElementTypeList target = null;
                target = (oasisNamesTcCiqXal3.PremisesElementTypeList)get_store().find_attribute_user(NAMETYPE$2);
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
        public void setNameType(oasisNamesTcCiqXal3.PremisesElementTypeList.Enum nameType)
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
        public void xsetNameType(oasisNamesTcCiqXal3.PremisesElementTypeList nameType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.PremisesElementTypeList target = null;
                target = (oasisNamesTcCiqXal3.PremisesElementTypeList)get_store().find_attribute_user(NAMETYPE$2);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXal3.PremisesElementTypeList)get_store().add_attribute_user(NAMETYPE$2);
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
