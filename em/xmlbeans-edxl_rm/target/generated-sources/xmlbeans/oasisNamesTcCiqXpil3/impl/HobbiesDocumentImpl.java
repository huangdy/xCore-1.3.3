/*
 * An XML document type.
 * Localname: Hobbies
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.HobbiesDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Hobbies(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class HobbiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.HobbiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public HobbiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOBBIES$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Hobbies");
    
    
    /**
     * Gets the "Hobbies" element
     */
    public oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies getHobbies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies target = null;
            target = (oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies)get_store().find_element_user(HOBBIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Hobbies" element
     */
    public void setHobbies(oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies hobbies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies target = null;
            target = (oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies)get_store().find_element_user(HOBBIES$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies)get_store().add_element_user(HOBBIES$0);
            }
            target.set(hobbies);
        }
    }
    
    /**
     * Appends and returns a new empty "Hobbies" element
     */
    public oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies addNewHobbies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies target = null;
            target = (oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies)get_store().add_element_user(HOBBIES$0);
            return target;
        }
    }
    /**
     * An XML Hobbies(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class HobbiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies
    {
        private static final long serialVersionUID = 1L;
        
        public HobbiesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOBBY$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Hobby");
        
        
        /**
         * Gets array of all "Hobby" elements
         */
        public oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby[] getHobbyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HOBBY$0, targetList);
                oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby[] result = new oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Hobby" element
         */
        public oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby getHobbyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby target = null;
                target = (oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby)get_store().find_element_user(HOBBY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Hobby" element
         */
        public int sizeOfHobbyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOBBY$0);
            }
        }
        
        /**
         * Sets array of all "Hobby" element
         */
        public void setHobbyArray(oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby[] hobbyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hobbyArray, HOBBY$0);
            }
        }
        
        /**
         * Sets ith "Hobby" element
         */
        public void setHobbyArray(int i, oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby hobby)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby target = null;
                target = (oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby)get_store().find_element_user(HOBBY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hobby);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Hobby" element
         */
        public oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby insertNewHobby(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby target = null;
                target = (oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby)get_store().insert_element_user(HOBBY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Hobby" element
         */
        public oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby addNewHobby()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby target = null;
                target = (oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby)get_store().add_element_user(HOBBY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Hobby" element
         */
        public void removeHobby(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOBBY$0, i);
            }
        }
        /**
         * An XML Hobby(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.HobbiesDocument$Hobbies$Hobby.
         */
        public static class HobbyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies.Hobby
        {
            private static final long serialVersionUID = 1L;
            
            public HobbyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected HobbyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$6 = 
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
            public oasisNamesTcCiqXpil3.HobbyTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.HobbyTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.HobbyTypeList)get_store().find_attribute_user(TYPE$0);
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
            public void xsetType(oasisNamesTcCiqXpil3.HobbyTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.HobbyTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.HobbyTypeList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.HobbyTypeList)get_store().add_attribute_user(TYPE$0);
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
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$2);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$2);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
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
                    return get_store().find_attribute_user(VALIDFROM$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$4);
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
                    get_store().remove_attribute(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
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
                    return get_store().find_attribute_user(VALIDTO$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$6);
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
                    get_store().remove_attribute(VALIDTO$6);
                }
            }
        }
    }
}
