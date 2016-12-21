/*
 * An XML document type.
 * Localname: postalAddress
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one postalAddress(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class PostalAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostalAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTALADDRESS$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "postalAddress");
    
    
    /**
     * Gets the "postalAddress" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress getPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().find_element_user(POSTALADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "postalAddress" element
     */
    public void setPostalAddress(mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress postalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().find_element_user(POSTALADDRESS$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().add_element_user(POSTALADDRESS$0);
            }
            target.set(postalAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "postalAddress" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress addNewPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().add_element_user(POSTALADDRESS$0);
            return target;
        }
    }
    /**
     * An XML postalAddress(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
     *
     * This is a complex type.
     */
    public static class PostalAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress
    {
        private static final long serialVersionUID = 1L;
        
        public PostalAddressImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STREET$0 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "street");
        private static final javax.xml.namespace.QName CITY$2 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "city");
        private static final javax.xml.namespace.QName STATE$4 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "state");
        private static final javax.xml.namespace.QName PROVINCE$6 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "province");
        private static final javax.xml.namespace.QName POSTALCODE$8 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "postalCode");
        private static final javax.xml.namespace.QName COUNTRYCODE$10 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "countryCode");
        
        
        /**
         * Gets array of all "street" elements
         */
        public java.lang.String[] getStreetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STREET$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "street" element
         */
        public java.lang.String getStreetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "street" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetStreetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STREET$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "street" element
         */
        public org.apache.xmlbeans.XmlString xgetStreetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "street" element
         */
        public int sizeOfStreetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STREET$0);
            }
        }
        
        /**
         * Sets array of all "street" element
         */
        public void setStreetArray(java.lang.String[] streetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(streetArray, STREET$0);
            }
        }
        
        /**
         * Sets ith "street" element
         */
        public void setStreetArray(int i, java.lang.String street)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(street);
            }
        }
        
        /**
         * Sets (as xml) array of all "street" element
         */
        public void xsetStreetArray(org.apache.xmlbeans.XmlString[]streetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(streetArray, STREET$0);
            }
        }
        
        /**
         * Sets (as xml) ith "street" element
         */
        public void xsetStreetArray(int i, org.apache.xmlbeans.XmlString street)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STREET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(street);
            }
        }
        
        /**
         * Inserts the value as the ith "street" element
         */
        public void insertStreet(int i, java.lang.String street)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STREET$0, i);
                target.setStringValue(street);
            }
        }
        
        /**
         * Appends the value as the last "street" element
         */
        public void addStreet(java.lang.String street)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREET$0);
                target.setStringValue(street);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "street" element
         */
        public org.apache.xmlbeans.XmlString insertNewStreet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STREET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "street" element
         */
        public org.apache.xmlbeans.XmlString addNewStreet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STREET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "street" element
         */
        public void removeStreet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STREET$0, i);
            }
        }
        
        /**
         * Gets the "city" element
         */
        public java.lang.String getCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "city" element
         */
        public org.apache.xmlbeans.XmlString xgetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "city" element
         */
        public boolean isSetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CITY$2) != 0;
            }
        }
        
        /**
         * Sets the "city" element
         */
        public void setCity(java.lang.String city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$2);
                }
                target.setStringValue(city);
            }
        }
        
        /**
         * Sets (as xml) the "city" element
         */
        public void xsetCity(org.apache.xmlbeans.XmlString city)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$2);
                }
                target.set(city);
            }
        }
        
        /**
         * Unsets the "city" element
         */
        public void unsetCity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CITY$2, 0);
            }
        }
        
        /**
         * Gets the "state" element
         */
        public java.lang.String getState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "state" element
         */
        public org.apache.xmlbeans.XmlString xgetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "state" element
         */
        public boolean isSetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATE$4) != 0;
            }
        }
        
        /**
         * Sets the "state" element
         */
        public void setState(java.lang.String state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$4);
                }
                target.setStringValue(state);
            }
        }
        
        /**
         * Sets (as xml) the "state" element
         */
        public void xsetState(org.apache.xmlbeans.XmlString state)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATE$4);
                }
                target.set(state);
            }
        }
        
        /**
         * Unsets the "state" element
         */
        public void unsetState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATE$4, 0);
            }
        }
        
        /**
         * Gets the "province" element
         */
        public java.lang.String getProvince()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "province" element
         */
        public org.apache.xmlbeans.XmlString xgetProvince()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVINCE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "province" element
         */
        public boolean isSetProvince()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROVINCE$6) != 0;
            }
        }
        
        /**
         * Sets the "province" element
         */
        public void setProvince(java.lang.String province)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVINCE$6);
                }
                target.setStringValue(province);
            }
        }
        
        /**
         * Sets (as xml) the "province" element
         */
        public void xsetProvince(org.apache.xmlbeans.XmlString province)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVINCE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVINCE$6);
                }
                target.set(province);
            }
        }
        
        /**
         * Unsets the "province" element
         */
        public void unsetProvince()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROVINCE$6, 0);
            }
        }
        
        /**
         * Gets the "postalCode" element
         */
        public java.lang.String getPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postalCode" element
         */
        public org.apache.xmlbeans.XmlString xgetPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTALCODE$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "postalCode" element
         */
        public boolean isSetPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POSTALCODE$8) != 0;
            }
        }
        
        /**
         * Sets the "postalCode" element
         */
        public void setPostalCode(java.lang.String postalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTALCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTALCODE$8);
                }
                target.setStringValue(postalCode);
            }
        }
        
        /**
         * Sets (as xml) the "postalCode" element
         */
        public void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTALCODE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTALCODE$8);
                }
                target.set(postalCode);
            }
        }
        
        /**
         * Unsets the "postalCode" element
         */
        public void unsetPostalCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POSTALCODE$8, 0);
            }
        }
        
        /**
         * Gets the "countryCode" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType getCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().find_element_user(COUNTRYCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "countryCode" element
         */
        public boolean isSetCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTRYCODE$10) != 0;
            }
        }
        
        /**
         * Sets the "countryCode" element
         */
        public void setCountryCode(mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType countryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().find_element_user(COUNTRYCODE$10, 0);
                if (target == null)
                {
                    target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().add_element_user(COUNTRYCODE$10);
                }
                target.set(countryCode);
            }
        }
        
        /**
         * Appends and returns a new empty "countryCode" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType addNewCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().add_element_user(COUNTRYCODE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "countryCode" element
         */
        public void unsetCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTRYCODE$10, 0);
            }
        }
    }
}
