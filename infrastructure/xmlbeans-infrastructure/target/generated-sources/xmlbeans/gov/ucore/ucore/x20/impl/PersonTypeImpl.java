/*
 * XML Type:  PersonType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PersonType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML PersonType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class PersonTypeImpl extends gov.ucore.ucore.x20.impl.AgentTypeImpl implements gov.ucore.ucore.x20.PersonType
{
    private static final long serialVersionUID = 1L;
    
    public PersonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERNATENAME$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AlternateName");
    private static final javax.xml.namespace.QName CITIZENSHIP$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Citizenship");
    private static final javax.xml.namespace.QName CONTACTINFO$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ContactInfo");
    private static final javax.xml.namespace.QName DATEOFBIRTH$6 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DateOfBirth");
    private static final javax.xml.namespace.QName HEIGHT$8 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Height");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Name");
    private static final javax.xml.namespace.QName SEX$12 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Sex");
    private static final javax.xml.namespace.QName WEIGHT$14 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Weight");
    
    
    /**
     * Gets array of all "AlternateName" elements
     */
    public gov.ucore.ucore.x20.PersonNameType[] getAlternateNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALTERNATENAME$0, targetList);
            gov.ucore.ucore.x20.PersonNameType[] result = new gov.ucore.ucore.x20.PersonNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AlternateName" element
     */
    public gov.ucore.ucore.x20.PersonNameType getAlternateNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonNameType target = null;
            target = (gov.ucore.ucore.x20.PersonNameType)get_store().find_element_user(ALTERNATENAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AlternateName" element
     */
    public int sizeOfAlternateNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTERNATENAME$0);
        }
    }
    
    /**
     * Sets array of all "AlternateName" element
     */
    public void setAlternateNameArray(gov.ucore.ucore.x20.PersonNameType[] alternateNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alternateNameArray, ALTERNATENAME$0);
        }
    }
    
    /**
     * Sets ith "AlternateName" element
     */
    public void setAlternateNameArray(int i, gov.ucore.ucore.x20.PersonNameType alternateName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonNameType target = null;
            target = (gov.ucore.ucore.x20.PersonNameType)get_store().find_element_user(ALTERNATENAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alternateName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AlternateName" element
     */
    public gov.ucore.ucore.x20.PersonNameType insertNewAlternateName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonNameType target = null;
            target = (gov.ucore.ucore.x20.PersonNameType)get_store().insert_element_user(ALTERNATENAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AlternateName" element
     */
    public gov.ucore.ucore.x20.PersonNameType addNewAlternateName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonNameType target = null;
            target = (gov.ucore.ucore.x20.PersonNameType)get_store().add_element_user(ALTERNATENAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AlternateName" element
     */
    public void removeAlternateName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTERNATENAME$0, i);
        }
    }
    
    /**
     * Gets array of all "Citizenship" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] getCitizenshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CITIZENSHIP$2, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] result = new mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Citizenship" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType getCitizenshipArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().find_element_user(CITIZENSHIP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Citizenship" element
     */
    public int sizeOfCitizenshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITIZENSHIP$2);
        }
    }
    
    /**
     * Sets array of all "Citizenship" element
     */
    public void setCitizenshipArray(mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] citizenshipArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(citizenshipArray, CITIZENSHIP$2);
        }
    }
    
    /**
     * Sets ith "Citizenship" element
     */
    public void setCitizenshipArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType citizenship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().find_element_user(CITIZENSHIP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(citizenship);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Citizenship" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType insertNewCitizenship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().insert_element_user(CITIZENSHIP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Citizenship" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType addNewCitizenship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().add_element_user(CITIZENSHIP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Citizenship" element
     */
    public void removeCitizenship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITIZENSHIP$2, i);
        }
    }
    
    /**
     * Gets the "ContactInfo" element
     */
    public gov.ucore.ucore.x20.ContactInfoType getContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContactInfoType target = null;
            target = (gov.ucore.ucore.x20.ContactInfoType)get_store().find_element_user(CONTACTINFO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContactInfo" element
     */
    public boolean isSetContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTINFO$4) != 0;
        }
    }
    
    /**
     * Sets the "ContactInfo" element
     */
    public void setContactInfo(gov.ucore.ucore.x20.ContactInfoType contactInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContactInfoType target = null;
            target = (gov.ucore.ucore.x20.ContactInfoType)get_store().find_element_user(CONTACTINFO$4, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ContactInfoType)get_store().add_element_user(CONTACTINFO$4);
            }
            target.set(contactInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactInfo" element
     */
    public gov.ucore.ucore.x20.ContactInfoType addNewContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContactInfoType target = null;
            target = (gov.ucore.ucore.x20.ContactInfoType)get_store().add_element_user(CONTACTINFO$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ContactInfo" element
     */
    public void unsetContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTINFO$4, 0);
        }
    }
    
    /**
     * Gets the "DateOfBirth" element
     */
    public gov.ucore.ucore.x20.TimeInstantType getDateOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().find_element_user(DATEOFBIRTH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DateOfBirth" element
     */
    public boolean isSetDateOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEOFBIRTH$6) != 0;
        }
    }
    
    /**
     * Sets the "DateOfBirth" element
     */
    public void setDateOfBirth(gov.ucore.ucore.x20.TimeInstantType dateOfBirth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().find_element_user(DATEOFBIRTH$6, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.TimeInstantType)get_store().add_element_user(DATEOFBIRTH$6);
            }
            target.set(dateOfBirth);
        }
    }
    
    /**
     * Appends and returns a new empty "DateOfBirth" element
     */
    public gov.ucore.ucore.x20.TimeInstantType addNewDateOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().add_element_user(DATEOFBIRTH$6);
            return target;
        }
    }
    
    /**
     * Unsets the "DateOfBirth" element
     */
    public void unsetDateOfBirth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEOFBIRTH$6, 0);
        }
    }
    
    /**
     * Gets the "Height" element
     */
    public gov.ucore.ucore.x20.LengthMeasureType getHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LengthMeasureType target = null;
            target = (gov.ucore.ucore.x20.LengthMeasureType)get_store().find_element_user(HEIGHT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Height" element
     */
    public boolean isSetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEIGHT$8) != 0;
        }
    }
    
    /**
     * Sets the "Height" element
     */
    public void setHeight(gov.ucore.ucore.x20.LengthMeasureType height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LengthMeasureType target = null;
            target = (gov.ucore.ucore.x20.LengthMeasureType)get_store().find_element_user(HEIGHT$8, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.LengthMeasureType)get_store().add_element_user(HEIGHT$8);
            }
            target.set(height);
        }
    }
    
    /**
     * Appends and returns a new empty "Height" element
     */
    public gov.ucore.ucore.x20.LengthMeasureType addNewHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LengthMeasureType target = null;
            target = (gov.ucore.ucore.x20.LengthMeasureType)get_store().add_element_user(HEIGHT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Height" element
     */
    public void unsetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEIGHT$8, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public gov.ucore.ucore.x20.PersonNameType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonNameType target = null;
            target = (gov.ucore.ucore.x20.PersonNameType)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$10) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(gov.ucore.ucore.x20.PersonNameType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonNameType target = null;
            target = (gov.ucore.ucore.x20.PersonNameType)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PersonNameType)get_store().add_element_user(NAME$10);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "Name" element
     */
    public gov.ucore.ucore.x20.PersonNameType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonNameType target = null;
            target = (gov.ucore.ucore.x20.PersonNameType)get_store().add_element_user(NAME$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$10, 0);
        }
    }
    
    /**
     * Gets the "Sex" element
     */
    public gov.ucore.ucore.x20.PersonSexType.Enum getSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEX$12, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.ucore.ucore.x20.PersonSexType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Sex" element
     */
    public gov.ucore.ucore.x20.PersonSexType xgetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonSexType target = null;
            target = (gov.ucore.ucore.x20.PersonSexType)get_store().find_element_user(SEX$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Sex" element
     */
    public boolean isSetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEX$12) != 0;
        }
    }
    
    /**
     * Sets the "Sex" element
     */
    public void setSex(gov.ucore.ucore.x20.PersonSexType.Enum sex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEX$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEX$12);
            }
            target.setEnumValue(sex);
        }
    }
    
    /**
     * Sets (as xml) the "Sex" element
     */
    public void xsetSex(gov.ucore.ucore.x20.PersonSexType sex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonSexType target = null;
            target = (gov.ucore.ucore.x20.PersonSexType)get_store().find_element_user(SEX$12, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PersonSexType)get_store().add_element_user(SEX$12);
            }
            target.set(sex);
        }
    }
    
    /**
     * Unsets the "Sex" element
     */
    public void unsetSex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEX$12, 0);
        }
    }
    
    /**
     * Gets the "Weight" element
     */
    public gov.ucore.ucore.x20.MassMeasureType getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.MassMeasureType target = null;
            target = (gov.ucore.ucore.x20.MassMeasureType)get_store().find_element_user(WEIGHT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Weight" element
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEIGHT$14) != 0;
        }
    }
    
    /**
     * Sets the "Weight" element
     */
    public void setWeight(gov.ucore.ucore.x20.MassMeasureType weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.MassMeasureType target = null;
            target = (gov.ucore.ucore.x20.MassMeasureType)get_store().find_element_user(WEIGHT$14, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.MassMeasureType)get_store().add_element_user(WEIGHT$14);
            }
            target.set(weight);
        }
    }
    
    /**
     * Appends and returns a new empty "Weight" element
     */
    public gov.ucore.ucore.x20.MassMeasureType addNewWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.MassMeasureType target = null;
            target = (gov.ucore.ucore.x20.MassMeasureType)get_store().add_element_user(WEIGHT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Weight" element
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEIGHT$14, 0);
        }
    }
}
