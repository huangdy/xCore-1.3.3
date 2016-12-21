/*
 * An XML document type.
 * Localname: Languages
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.LanguagesDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Languages(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class LanguagesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.LanguagesDocument
{
    private static final long serialVersionUID = 1L;
    
    public LanguagesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANGUAGES$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Languages");
    
    
    /**
     * Gets the "Languages" element
     */
    public oasisNamesTcCiqXpil3.LanguagesDocument.Languages getLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.LanguagesDocument.Languages target = null;
            target = (oasisNamesTcCiqXpil3.LanguagesDocument.Languages)get_store().find_element_user(LANGUAGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Languages" element
     */
    public void setLanguages(oasisNamesTcCiqXpil3.LanguagesDocument.Languages languages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.LanguagesDocument.Languages target = null;
            target = (oasisNamesTcCiqXpil3.LanguagesDocument.Languages)get_store().find_element_user(LANGUAGES$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.LanguagesDocument.Languages)get_store().add_element_user(LANGUAGES$0);
            }
            target.set(languages);
        }
    }
    
    /**
     * Appends and returns a new empty "Languages" element
     */
    public oasisNamesTcCiqXpil3.LanguagesDocument.Languages addNewLanguages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.LanguagesDocument.Languages target = null;
            target = (oasisNamesTcCiqXpil3.LanguagesDocument.Languages)get_store().add_element_user(LANGUAGES$0);
            return target;
        }
    }
    /**
     * An XML Languages(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class LanguagesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.LanguagesDocument.Languages
    {
        private static final long serialVersionUID = 1L;
        
        public LanguagesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LANGUAGE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Language");
        
        
        /**
         * Gets array of all "Language" elements
         */
        public oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language[] getLanguageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LANGUAGE$0, targetList);
                oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language[] result = new oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Language" element
         */
        public oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language getLanguageArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language target = null;
                target = (oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language)get_store().find_element_user(LANGUAGE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Language" element
         */
        public int sizeOfLanguageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LANGUAGE$0);
            }
        }
        
        /**
         * Sets array of all "Language" element
         */
        public void setLanguageArray(oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language[] languageArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(languageArray, LANGUAGE$0);
            }
        }
        
        /**
         * Sets ith "Language" element
         */
        public void setLanguageArray(int i, oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language target = null;
                target = (oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language)get_store().find_element_user(LANGUAGE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(language);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Language" element
         */
        public oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language insertNewLanguage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language target = null;
                target = (oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language)get_store().insert_element_user(LANGUAGE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Language" element
         */
        public oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language addNewLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language target = null;
                target = (oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language)get_store().add_element_user(LANGUAGE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Language" element
         */
        public void removeLanguage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LANGUAGE$0, i);
            }
        }
        /**
         * An XML Language(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.LanguagesDocument$Languages$Language.
         */
        public static class LanguageImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.LanguagesDocument.Languages.Language
        {
            private static final long serialVersionUID = 1L;
            
            public LanguageImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected LanguageImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName SPEAK$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Speak");
            private static final javax.xml.namespace.QName READ$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Read");
            private static final javax.xml.namespace.QName WRITE$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Write");
            private static final javax.xml.namespace.QName UNDERSTAND$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Understand");
            private static final javax.xml.namespace.QName PREFERENCE$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Preference");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$16 = 
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
            public oasisNamesTcCiqXpil3.LanguageTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageTypeList)get_store().find_attribute_user(TYPE$0);
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
            public void xsetType(oasisNamesTcCiqXpil3.LanguageTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageTypeList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.LanguageTypeList)get_store().add_attribute_user(TYPE$0);
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
             * Gets the "Speak" attribute
             */
            public oasisNamesTcCiqXpil3.LanguageSkillsList.Enum getSpeak()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEAK$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXpil3.LanguageSkillsList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Speak" attribute
             */
            public oasisNamesTcCiqXpil3.LanguageSkillsList xgetSpeak()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageSkillsList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().find_attribute_user(SPEAK$2);
                    return target;
                }
            }
            
            /**
             * True if has "Speak" attribute
             */
            public boolean isSetSpeak()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(SPEAK$2) != null;
                }
            }
            
            /**
             * Sets the "Speak" attribute
             */
            public void setSpeak(oasisNamesTcCiqXpil3.LanguageSkillsList.Enum speak)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SPEAK$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SPEAK$2);
                    }
                    target.setEnumValue(speak);
                }
            }
            
            /**
             * Sets (as xml) the "Speak" attribute
             */
            public void xsetSpeak(oasisNamesTcCiqXpil3.LanguageSkillsList speak)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageSkillsList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().find_attribute_user(SPEAK$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().add_attribute_user(SPEAK$2);
                    }
                    target.set(speak);
                }
            }
            
            /**
             * Unsets the "Speak" attribute
             */
            public void unsetSpeak()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(SPEAK$2);
                }
            }
            
            /**
             * Gets the "Read" attribute
             */
            public oasisNamesTcCiqXpil3.LanguageSkillsList.Enum getRead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READ$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXpil3.LanguageSkillsList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Read" attribute
             */
            public oasisNamesTcCiqXpil3.LanguageSkillsList xgetRead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageSkillsList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().find_attribute_user(READ$4);
                    return target;
                }
            }
            
            /**
             * True if has "Read" attribute
             */
            public boolean isSetRead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(READ$4) != null;
                }
            }
            
            /**
             * Sets the "Read" attribute
             */
            public void setRead(oasisNamesTcCiqXpil3.LanguageSkillsList.Enum read)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READ$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READ$4);
                    }
                    target.setEnumValue(read);
                }
            }
            
            /**
             * Sets (as xml) the "Read" attribute
             */
            public void xsetRead(oasisNamesTcCiqXpil3.LanguageSkillsList read)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageSkillsList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().find_attribute_user(READ$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().add_attribute_user(READ$4);
                    }
                    target.set(read);
                }
            }
            
            /**
             * Unsets the "Read" attribute
             */
            public void unsetRead()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(READ$4);
                }
            }
            
            /**
             * Gets the "Write" attribute
             */
            public oasisNamesTcCiqXpil3.LanguageSkillsList.Enum getWrite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRITE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXpil3.LanguageSkillsList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Write" attribute
             */
            public oasisNamesTcCiqXpil3.LanguageSkillsList xgetWrite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageSkillsList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().find_attribute_user(WRITE$6);
                    return target;
                }
            }
            
            /**
             * True if has "Write" attribute
             */
            public boolean isSetWrite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(WRITE$6) != null;
                }
            }
            
            /**
             * Sets the "Write" attribute
             */
            public void setWrite(oasisNamesTcCiqXpil3.LanguageSkillsList.Enum write)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WRITE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WRITE$6);
                    }
                    target.setEnumValue(write);
                }
            }
            
            /**
             * Sets (as xml) the "Write" attribute
             */
            public void xsetWrite(oasisNamesTcCiqXpil3.LanguageSkillsList write)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageSkillsList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().find_attribute_user(WRITE$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().add_attribute_user(WRITE$6);
                    }
                    target.set(write);
                }
            }
            
            /**
             * Unsets the "Write" attribute
             */
            public void unsetWrite()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(WRITE$6);
                }
            }
            
            /**
             * Gets the "Understand" attribute
             */
            public oasisNamesTcCiqXpil3.LanguageSkillsList.Enum getUnderstand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNDERSTAND$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXpil3.LanguageSkillsList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Understand" attribute
             */
            public oasisNamesTcCiqXpil3.LanguageSkillsList xgetUnderstand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageSkillsList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().find_attribute_user(UNDERSTAND$8);
                    return target;
                }
            }
            
            /**
             * True if has "Understand" attribute
             */
            public boolean isSetUnderstand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(UNDERSTAND$8) != null;
                }
            }
            
            /**
             * Sets the "Understand" attribute
             */
            public void setUnderstand(oasisNamesTcCiqXpil3.LanguageSkillsList.Enum understand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNDERSTAND$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNDERSTAND$8);
                    }
                    target.setEnumValue(understand);
                }
            }
            
            /**
             * Sets (as xml) the "Understand" attribute
             */
            public void xsetUnderstand(oasisNamesTcCiqXpil3.LanguageSkillsList understand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguageSkillsList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().find_attribute_user(UNDERSTAND$8);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.LanguageSkillsList)get_store().add_attribute_user(UNDERSTAND$8);
                    }
                    target.set(understand);
                }
            }
            
            /**
             * Unsets the "Understand" attribute
             */
            public void unsetUnderstand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(UNDERSTAND$8);
                }
            }
            
            /**
             * Gets the "Preference" attribute
             */
            public java.lang.String getPreference()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERENCE$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Preference" attribute
             */
            public oasisNamesTcCiqXpil3.LanguagePreferenceList xgetPreference()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguagePreferenceList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguagePreferenceList)get_store().find_attribute_user(PREFERENCE$10);
                    return target;
                }
            }
            
            /**
             * True if has "Preference" attribute
             */
            public boolean isSetPreference()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PREFERENCE$10) != null;
                }
            }
            
            /**
             * Sets the "Preference" attribute
             */
            public void setPreference(java.lang.String preference)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFERENCE$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFERENCE$10);
                    }
                    target.setStringValue(preference);
                }
            }
            
            /**
             * Sets (as xml) the "Preference" attribute
             */
            public void xsetPreference(oasisNamesTcCiqXpil3.LanguagePreferenceList preference)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.LanguagePreferenceList target = null;
                    target = (oasisNamesTcCiqXpil3.LanguagePreferenceList)get_store().find_attribute_user(PREFERENCE$10);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.LanguagePreferenceList)get_store().add_attribute_user(PREFERENCE$10);
                    }
                    target.set(preference);
                }
            }
            
            /**
             * Unsets the "Preference" attribute
             */
            public void unsetPreference()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PREFERENCE$10);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$12);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$12);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$12) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$12);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$12);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$12);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$12);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$14);
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
                    return get_store().find_attribute_user(VALIDFROM$14) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$14);
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
                    get_store().remove_attribute(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$16);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$16);
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
                    return get_store().find_attribute_user(VALIDTO$16) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$16);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$16);
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
                    get_store().remove_attribute(VALIDTO$16);
                }
            }
        }
    }
}
