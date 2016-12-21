/*
 * An XML document type.
 * Localname: CountriesOfResidence
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.CountriesOfResidenceDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one CountriesOfResidence(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class CountriesOfResidenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.CountriesOfResidenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountriesOfResidenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRIESOFRESIDENCE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "CountriesOfResidence");
    
    
    /**
     * Gets the "CountriesOfResidence" element
     */
    public oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence getCountriesOfResidence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence target = null;
            target = (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence)get_store().find_element_user(COUNTRIESOFRESIDENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CountriesOfResidence" element
     */
    public void setCountriesOfResidence(oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence countriesOfResidence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence target = null;
            target = (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence)get_store().find_element_user(COUNTRIESOFRESIDENCE$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence)get_store().add_element_user(COUNTRIESOFRESIDENCE$0);
            }
            target.set(countriesOfResidence);
        }
    }
    
    /**
     * Appends and returns a new empty "CountriesOfResidence" element
     */
    public oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence addNewCountriesOfResidence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence target = null;
            target = (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence)get_store().add_element_user(COUNTRIESOFRESIDENCE$0);
            return target;
        }
    }
    /**
     * An XML CountriesOfResidence(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class CountriesOfResidenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence
    {
        private static final long serialVersionUID = 1L;
        
        public CountriesOfResidenceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRY$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Country");
        
        
        /**
         * Gets array of all "Country" elements
         */
        public oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country[] getCountryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COUNTRY$0, targetList);
                oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country[] result = new oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Country" element
         */
        public oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country getCountryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country target = null;
                target = (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country)get_store().find_element_user(COUNTRY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Country" element
         */
        public int sizeOfCountryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTRY$0);
            }
        }
        
        /**
         * Sets array of all "Country" element
         */
        public void setCountryArray(oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country[] countryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(countryArray, COUNTRY$0);
            }
        }
        
        /**
         * Sets ith "Country" element
         */
        public void setCountryArray(int i, oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country country)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country target = null;
                target = (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country)get_store().find_element_user(COUNTRY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(country);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Country" element
         */
        public oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country insertNewCountry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country target = null;
                target = (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country)get_store().insert_element_user(COUNTRY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Country" element
         */
        public oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country addNewCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country target = null;
                target = (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country)get_store().add_element_user(COUNTRY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Country" element
         */
        public void removeCountry(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTRY$0, i);
            }
        }
        /**
         * An XML Country(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class CountryImpl extends oasisNamesTcCiqXal3.impl.CountryTypeImpl implements oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country
        {
            private static final long serialVersionUID = 1L;
            
            public CountryImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName STATUS$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
            private static final javax.xml.namespace.QName DATEVALIDFROM$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
            private static final javax.xml.namespace.QName DATEVALIDTO$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
            
            
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
            public oasisNamesTcCiqXpil3.ResidencyTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ResidencyTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.ResidencyTypeList)get_store().find_attribute_user(TYPE$0);
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
            public void xsetType(oasisNamesTcCiqXpil3.ResidencyTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ResidencyTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.ResidencyTypeList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.ResidencyTypeList)get_store().add_attribute_user(TYPE$0);
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
             * Gets the "Status" attribute
             */
            public java.lang.String getStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$2);
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
                    return get_store().find_attribute_user(STATUS$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$2);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$2);
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
                    get_store().remove_attribute(STATUS$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$4);
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
                    return get_store().find_attribute_user(DATEVALIDFROM$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$4);
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
                    get_store().remove_attribute(DATEVALIDFROM$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$6);
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
                    return get_store().find_attribute_user(DATEVALIDTO$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$6);
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
                    get_store().remove_attribute(DATEVALIDTO$6);
                }
            }
        }
    }
}
