/*
 * XML Type:  ContactInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML ContactInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class ContactInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType
{
    private static final long serialVersionUID = 1L;
    
    public ContactInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ContactDescription");
    private static final javax.xml.namespace.QName CONTACTROLE$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ContactRole");
    private static final javax.xml.namespace.QName RADIO$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "Radio");
    private static final javax.xml.namespace.QName CONTACTLOCATION$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ContactLocation");
    private static final javax.xml.namespace.QName ADDITIONALCONTACTINFORMATION$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "AdditionalContactInformation");
    
    
    /**
     * Gets the "ContactDescription" element
     */
    public java.lang.String getContactDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactDescription" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType xgetContactDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType)get_store().find_element_user(CONTACTDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactDescription" element
     */
    public boolean isSetContactDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "ContactDescription" element
     */
    public void setContactDescription(java.lang.String contactDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTDESCRIPTION$0);
            }
            target.setStringValue(contactDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ContactDescription" element
     */
    public void xsetContactDescription(x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType contactDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType)get_store().find_element_user(CONTACTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactDescriptionType)get_store().add_element_user(CONTACTDESCRIPTION$0);
            }
            target.set(contactDescription);
        }
    }
    
    /**
     * Unsets the "ContactDescription" element
     */
    public void unsetContactDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTDESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "ContactRole" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType.Enum getContactRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTROLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContactRole" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType xgetContactRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType)get_store().find_element_user(CONTACTROLE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContactRole" element
     */
    public boolean isSetContactRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTROLE$2) != 0;
        }
    }
    
    /**
     * Sets the "ContactRole" element
     */
    public void setContactRole(x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType.Enum contactRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACTROLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACTROLE$2);
            }
            target.setEnumValue(contactRole);
        }
    }
    
    /**
     * Sets (as xml) the "ContactRole" element
     */
    public void xsetContactRole(x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType contactRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType)get_store().find_element_user(CONTACTROLE$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactRoleType)get_store().add_element_user(CONTACTROLE$2);
            }
            target.set(contactRole);
        }
    }
    
    /**
     * Unsets the "ContactRole" element
     */
    public void unsetContactRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTROLE$2, 0);
        }
    }
    
    /**
     * Gets array of all "Radio" elements
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType[] getRadioArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RADIO$4, targetList);
            x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType[] result = new x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Radio" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType getRadioArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType)get_store().find_element_user(RADIO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Radio" element
     */
    public int sizeOfRadioArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADIO$4);
        }
    }
    
    /**
     * Sets array of all "Radio" element
     */
    public void setRadioArray(x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType[] radioArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(radioArray, RADIO$4);
        }
    }
    
    /**
     * Sets ith "Radio" element
     */
    public void setRadioArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType radio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType)get_store().find_element_user(RADIO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(radio);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Radio" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType insertNewRadio(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType)get_store().insert_element_user(RADIO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Radio" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType addNewRadio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType)get_store().add_element_user(RADIO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Radio" element
     */
    public void removeRadio(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADIO$4, i);
        }
    }
    
    /**
     * Gets the "ContactLocation" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.LocationType getContactLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.LocationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationType)get_store().find_element_user(CONTACTLOCATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContactLocation" element
     */
    public boolean isSetContactLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTLOCATION$6) != 0;
        }
    }
    
    /**
     * Sets the "ContactLocation" element
     */
    public void setContactLocation(x0.oasisNamesTcEmergencyEDXLRM1.LocationType contactLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.LocationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationType)get_store().find_element_user(CONTACTLOCATION$6, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationType)get_store().add_element_user(CONTACTLOCATION$6);
            }
            target.set(contactLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactLocation" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.LocationType addNewContactLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.LocationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationType)get_store().add_element_user(CONTACTLOCATION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ContactLocation" element
     */
    public void unsetContactLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTLOCATION$6, 0);
        }
    }
    
    /**
     * Gets the "AdditionalContactInformation" element
     */
    public oasisNamesTcCiqXpil3.PartyType getAdditionalContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PartyType target = null;
            target = (oasisNamesTcCiqXpil3.PartyType)get_store().find_element_user(ADDITIONALCONTACTINFORMATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AdditionalContactInformation" element
     */
    public boolean isSetAdditionalContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALCONTACTINFORMATION$8) != 0;
        }
    }
    
    /**
     * Sets the "AdditionalContactInformation" element
     */
    public void setAdditionalContactInformation(oasisNamesTcCiqXpil3.PartyType additionalContactInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PartyType target = null;
            target = (oasisNamesTcCiqXpil3.PartyType)get_store().find_element_user(ADDITIONALCONTACTINFORMATION$8, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.PartyType)get_store().add_element_user(ADDITIONALCONTACTINFORMATION$8);
            }
            target.set(additionalContactInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "AdditionalContactInformation" element
     */
    public oasisNamesTcCiqXpil3.PartyType addNewAdditionalContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PartyType target = null;
            target = (oasisNamesTcCiqXpil3.PartyType)get_store().add_element_user(ADDITIONALCONTACTINFORMATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "AdditionalContactInformation" element
     */
    public void unsetAdditionalContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALCONTACTINFORMATION$8, 0);
        }
    }
}
