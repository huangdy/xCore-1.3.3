/*
 * An XML document type.
 * Localname: geographicIdentifier
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one geographicIdentifier(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class GeographicIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeographicIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "geographicIdentifier");
    
    
    /**
     * Gets the "geographicIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier getGeographicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier)get_store().find_element_user(GEOGRAPHICIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geographicIdentifier" element
     */
    public void setGeographicIdentifier(mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier geographicIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier)get_store().find_element_user(GEOGRAPHICIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier)get_store().add_element_user(GEOGRAPHICIDENTIFIER$0);
            }
            target.set(geographicIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "geographicIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier addNewGeographicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier)get_store().add_element_user(GEOGRAPHICIDENTIFIER$0);
            return target;
        }
    }
    /**
     * An XML geographicIdentifier(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
     *
     * This is a complex type.
     */
    public static class GeographicIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier
    {
        private static final long serialVersionUID = 1L;
        
        public GeographicIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "name");
        private static final javax.xml.namespace.QName REGION$2 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "region");
        private static final javax.xml.namespace.QName COUNTRYCODE$4 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "countryCode");
        private static final javax.xml.namespace.QName FACILITYIDENTIFIER$6 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "facilityIdentifier");
        
        
        /**
         * Gets array of all "name" elements
         */
        public java.lang.String[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "name" element
         */
        public java.lang.String getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "name" element
         */
        public org.apache.xmlbeans.XmlString xgetNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0);
            }
        }
        
        /**
         * Sets array of all "name" element
         */
        public void setNameArray(java.lang.String[] nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets ith "name" element
         */
        public void setNameArray(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) array of all "name" element
         */
        public void xsetNameArray(org.apache.xmlbeans.XmlString[]nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets (as xml) ith "name" element
         */
        public void xsetNameArray(int i, org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(name);
            }
        }
        
        /**
         * Inserts the value as the ith "name" element
         */
        public void insertName(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAME$0, i);
                target.setStringValue(name);
            }
        }
        
        /**
         * Appends the value as the last "name" element
         */
        public void addName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                target.setStringValue(name);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        public org.apache.xmlbeans.XmlString insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        public org.apache.xmlbeans.XmlString addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, i);
            }
        }
        
        /**
         * Gets array of all "region" elements
         */
        public java.lang.String[] getRegionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REGION$2, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "region" element
         */
        public java.lang.String getRegionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "region" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetRegionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REGION$2, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "region" element
         */
        public org.apache.xmlbeans.XmlString xgetRegionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "region" element
         */
        public int sizeOfRegionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGION$2);
            }
        }
        
        /**
         * Sets array of all "region" element
         */
        public void setRegionArray(java.lang.String[] regionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(regionArray, REGION$2);
            }
        }
        
        /**
         * Sets ith "region" element
         */
        public void setRegionArray(int i, java.lang.String region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(region);
            }
        }
        
        /**
         * Sets (as xml) array of all "region" element
         */
        public void xsetRegionArray(org.apache.xmlbeans.XmlString[]regionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(regionArray, REGION$2);
            }
        }
        
        /**
         * Sets (as xml) ith "region" element
         */
        public void xsetRegionArray(int i, org.apache.xmlbeans.XmlString region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(region);
            }
        }
        
        /**
         * Inserts the value as the ith "region" element
         */
        public void insertRegion(int i, java.lang.String region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REGION$2, i);
                target.setStringValue(region);
            }
        }
        
        /**
         * Appends the value as the last "region" element
         */
        public void addRegion(java.lang.String region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$2);
                target.setStringValue(region);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "region" element
         */
        public org.apache.xmlbeans.XmlString insertNewRegion(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(REGION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "region" element
         */
        public org.apache.xmlbeans.XmlString addNewRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "region" element
         */
        public void removeRegion(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGION$2, i);
            }
        }
        
        /**
         * Gets array of all "countryCode" elements
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] getCountryCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COUNTRYCODE$4, targetList);
                mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] result = new mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "countryCode" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType getCountryCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().find_element_user(COUNTRYCODE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "countryCode" element
         */
        public int sizeOfCountryCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COUNTRYCODE$4);
            }
        }
        
        /**
         * Sets array of all "countryCode" element
         */
        public void setCountryCodeArray(mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] countryCodeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(countryCodeArray, COUNTRYCODE$4);
            }
        }
        
        /**
         * Sets ith "countryCode" element
         */
        public void setCountryCodeArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType countryCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().find_element_user(COUNTRYCODE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(countryCode);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "countryCode" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType insertNewCountryCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().insert_element_user(COUNTRYCODE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "countryCode" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType addNewCountryCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().add_element_user(COUNTRYCODE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "countryCode" element
         */
        public void removeCountryCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COUNTRYCODE$4, i);
            }
        }
        
        /**
         * Gets array of all "facilityIdentifier" elements
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType[] getFacilityIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FACILITYIDENTIFIER$6, targetList);
                mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType[] result = new mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "facilityIdentifier" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType getFacilityIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType)get_store().find_element_user(FACILITYIDENTIFIER$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "facilityIdentifier" element
         */
        public int sizeOfFacilityIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FACILITYIDENTIFIER$6);
            }
        }
        
        /**
         * Sets array of all "facilityIdentifier" element
         */
        public void setFacilityIdentifierArray(mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType[] facilityIdentifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(facilityIdentifierArray, FACILITYIDENTIFIER$6);
            }
        }
        
        /**
         * Sets ith "facilityIdentifier" element
         */
        public void setFacilityIdentifierArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType facilityIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType)get_store().find_element_user(FACILITYIDENTIFIER$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(facilityIdentifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "facilityIdentifier" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType insertNewFacilityIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType)get_store().insert_element_user(FACILITYIDENTIFIER$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "facilityIdentifier" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType addNewFacilityIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType)get_store().add_element_user(FACILITYIDENTIFIER$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "facilityIdentifier" element
         */
        public void removeFacilityIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FACILITYIDENTIFIER$6, i);
            }
        }
    }
}
