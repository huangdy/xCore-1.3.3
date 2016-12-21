/*
 * XML Type:  OrganisationDetailsType
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.OrganisationDetailsType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * An XML OrganisationDetailsType(@urn:oasis:names:tc:ciq:xpil:3).
 *
 * This is a complex type.
 */
public class OrganisationDetailsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.OrganisationDetailsType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FREETEXTLINES$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "FreeTextLines");
    private static final javax.xml.namespace.QName ORGANISATIONNAME$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "OrganisationName");
    private static final javax.xml.namespace.QName ADDRESSES$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Addresses");
    private static final javax.xml.namespace.QName ACCOUNTS$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Accounts");
    private static final javax.xml.namespace.QName CONTACTNUMBERS$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ContactNumbers");
    private static final javax.xml.namespace.QName DOCUMENTS$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Documents");
    private static final javax.xml.namespace.QName ELECTRONICADDRESSIDENTIFIERS$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ElectronicAddressIdentifiers");
    private static final javax.xml.namespace.QName EVENTS$14 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Events");
    private static final javax.xml.namespace.QName IDENTIFIERS$16 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Identifiers");
    private static final javax.xml.namespace.QName MEMBERSHIPS$18 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Memberships");
    private static final javax.xml.namespace.QName RELATIONSHIPS$20 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Relationships");
    private static final javax.xml.namespace.QName REVENUES$22 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Revenues");
    private static final javax.xml.namespace.QName STOCKS$24 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Stocks");
    private static final javax.xml.namespace.QName VEHICLES$26 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Vehicles");
    private static final javax.xml.namespace.QName ORGANISATIONINFO$28 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OrganisationInfo");
    private static final javax.xml.namespace.QName USAGE$30 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Usage");
    private static final javax.xml.namespace.QName STATUS$32 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
    private static final javax.xml.namespace.QName DATEVALIDFROM$34 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
    private static final javax.xml.namespace.QName DATEVALIDTO$36 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
    private static final javax.xml.namespace.QName ORGANISATIONDETAILSKEY$38 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OrganisationDetailsKey");
    private static final javax.xml.namespace.QName ORGANISATIONDETAILSKEYREF$40 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OrganisationDetailsKeyRef");
    private static final javax.xml.namespace.QName TYPE$42 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "type");
    private static final javax.xml.namespace.QName LABEL$44 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "label");
    private static final javax.xml.namespace.QName HREF$46 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "href");
    private static final javax.xml.namespace.QName DATAQUALITYTYPE$48 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
    private static final javax.xml.namespace.QName VALIDFROM$50 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
    private static final javax.xml.namespace.QName VALIDTO$52 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
    private static final javax.xml.namespace.QName LANGUAGECODE$54 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "LanguageCode");
    
    
    /**
     * Gets the "FreeTextLines" element
     */
    public oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines getFreeTextLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines target = null;
            target = (oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines)get_store().find_element_user(FREETEXTLINES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FreeTextLines" element
     */
    public boolean isSetFreeTextLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREETEXTLINES$0) != 0;
        }
    }
    
    /**
     * Sets the "FreeTextLines" element
     */
    public void setFreeTextLines(oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines freeTextLines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines target = null;
            target = (oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines)get_store().find_element_user(FREETEXTLINES$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines)get_store().add_element_user(FREETEXTLINES$0);
            }
            target.set(freeTextLines);
        }
    }
    
    /**
     * Appends and returns a new empty "FreeTextLines" element
     */
    public oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines addNewFreeTextLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines target = null;
            target = (oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines)get_store().add_element_user(FREETEXTLINES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "FreeTextLines" element
     */
    public void unsetFreeTextLines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREETEXTLINES$0, 0);
        }
    }
    
    /**
     * Gets array of all "OrganisationName" elements
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType[] getOrganisationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONNAME$2, targetList);
            oasisNamesTcCiqXnl3.OrganisationNameType[] result = new oasisNamesTcCiqXnl3.OrganisationNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationName" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType getOrganisationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().find_element_user(ORGANISATIONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationName" element
     */
    public int sizeOfOrganisationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONNAME$2);
        }
    }
    
    /**
     * Sets array of all "OrganisationName" element
     */
    public void setOrganisationNameArray(oasisNamesTcCiqXnl3.OrganisationNameType[] organisationNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationNameArray, ORGANISATIONNAME$2);
        }
    }
    
    /**
     * Sets ith "OrganisationName" element
     */
    public void setOrganisationNameArray(int i, oasisNamesTcCiqXnl3.OrganisationNameType organisationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().find_element_user(ORGANISATIONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationName" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType insertNewOrganisationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().insert_element_user(ORGANISATIONNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationName" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType addNewOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().add_element_user(ORGANISATIONNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationName" element
     */
    public void removeOrganisationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONNAME$2, i);
        }
    }
    
    /**
     * Gets the "Addresses" element
     */
    public oasisNamesTcCiqXpil3.AddressesDocument.Addresses getAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AddressesDocument.Addresses target = null;
            target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().find_element_user(ADDRESSES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Addresses" element
     */
    public boolean isSetAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSES$4) != 0;
        }
    }
    
    /**
     * Sets the "Addresses" element
     */
    public void setAddresses(oasisNamesTcCiqXpil3.AddressesDocument.Addresses addresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AddressesDocument.Addresses target = null;
            target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().find_element_user(ADDRESSES$4, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().add_element_user(ADDRESSES$4);
            }
            target.set(addresses);
        }
    }
    
    /**
     * Appends and returns a new empty "Addresses" element
     */
    public oasisNamesTcCiqXpil3.AddressesDocument.Addresses addNewAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AddressesDocument.Addresses target = null;
            target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().add_element_user(ADDRESSES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Addresses" element
     */
    public void unsetAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSES$4, 0);
        }
    }
    
    /**
     * Gets the "Accounts" element
     */
    public oasisNamesTcCiqXpil3.AccountsDocument.Accounts getAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AccountsDocument.Accounts target = null;
            target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts)get_store().find_element_user(ACCOUNTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Accounts" element
     */
    public boolean isSetAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTS$6) != 0;
        }
    }
    
    /**
     * Sets the "Accounts" element
     */
    public void setAccounts(oasisNamesTcCiqXpil3.AccountsDocument.Accounts accounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AccountsDocument.Accounts target = null;
            target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts)get_store().find_element_user(ACCOUNTS$6, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts)get_store().add_element_user(ACCOUNTS$6);
            }
            target.set(accounts);
        }
    }
    
    /**
     * Appends and returns a new empty "Accounts" element
     */
    public oasisNamesTcCiqXpil3.AccountsDocument.Accounts addNewAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AccountsDocument.Accounts target = null;
            target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts)get_store().add_element_user(ACCOUNTS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Accounts" element
     */
    public void unsetAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTS$6, 0);
        }
    }
    
    /**
     * Gets the "ContactNumbers" element
     */
    public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers getContactNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers target = null;
            target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers)get_store().find_element_user(CONTACTNUMBERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContactNumbers" element
     */
    public boolean isSetContactNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTNUMBERS$8) != 0;
        }
    }
    
    /**
     * Sets the "ContactNumbers" element
     */
    public void setContactNumbers(oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers contactNumbers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers target = null;
            target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers)get_store().find_element_user(CONTACTNUMBERS$8, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers)get_store().add_element_user(CONTACTNUMBERS$8);
            }
            target.set(contactNumbers);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactNumbers" element
     */
    public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers addNewContactNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers target = null;
            target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers)get_store().add_element_user(CONTACTNUMBERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ContactNumbers" element
     */
    public void unsetContactNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTNUMBERS$8, 0);
        }
    }
    
    /**
     * Gets the "Documents" element
     */
    public oasisNamesTcCiqXpil3.DocumentsDocument.Documents getDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.DocumentsDocument.Documents target = null;
            target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents)get_store().find_element_user(DOCUMENTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Documents" element
     */
    public boolean isSetDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTS$10) != 0;
        }
    }
    
    /**
     * Sets the "Documents" element
     */
    public void setDocuments(oasisNamesTcCiqXpil3.DocumentsDocument.Documents documents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.DocumentsDocument.Documents target = null;
            target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents)get_store().find_element_user(DOCUMENTS$10, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents)get_store().add_element_user(DOCUMENTS$10);
            }
            target.set(documents);
        }
    }
    
    /**
     * Appends and returns a new empty "Documents" element
     */
    public oasisNamesTcCiqXpil3.DocumentsDocument.Documents addNewDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.DocumentsDocument.Documents target = null;
            target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents)get_store().add_element_user(DOCUMENTS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Documents" element
     */
    public void unsetDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTS$10, 0);
        }
    }
    
    /**
     * Gets the "ElectronicAddressIdentifiers" element
     */
    public oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers getElectronicAddressIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers target = null;
            target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().find_element_user(ELECTRONICADDRESSIDENTIFIERS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ElectronicAddressIdentifiers" element
     */
    public boolean isSetElectronicAddressIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELECTRONICADDRESSIDENTIFIERS$12) != 0;
        }
    }
    
    /**
     * Sets the "ElectronicAddressIdentifiers" element
     */
    public void setElectronicAddressIdentifiers(oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers electronicAddressIdentifiers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers target = null;
            target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().find_element_user(ELECTRONICADDRESSIDENTIFIERS$12, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().add_element_user(ELECTRONICADDRESSIDENTIFIERS$12);
            }
            target.set(electronicAddressIdentifiers);
        }
    }
    
    /**
     * Appends and returns a new empty "ElectronicAddressIdentifiers" element
     */
    public oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers addNewElectronicAddressIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers target = null;
            target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().add_element_user(ELECTRONICADDRESSIDENTIFIERS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "ElectronicAddressIdentifiers" element
     */
    public void unsetElectronicAddressIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELECTRONICADDRESSIDENTIFIERS$12, 0);
        }
    }
    
    /**
     * Gets the "Events" element
     */
    public oasisNamesTcCiqXpil3.EventsDocument.Events getEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.EventsDocument.Events target = null;
            target = (oasisNamesTcCiqXpil3.EventsDocument.Events)get_store().find_element_user(EVENTS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Events" element
     */
    public boolean isSetEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTS$14) != 0;
        }
    }
    
    /**
     * Sets the "Events" element
     */
    public void setEvents(oasisNamesTcCiqXpil3.EventsDocument.Events events)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.EventsDocument.Events target = null;
            target = (oasisNamesTcCiqXpil3.EventsDocument.Events)get_store().find_element_user(EVENTS$14, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.EventsDocument.Events)get_store().add_element_user(EVENTS$14);
            }
            target.set(events);
        }
    }
    
    /**
     * Appends and returns a new empty "Events" element
     */
    public oasisNamesTcCiqXpil3.EventsDocument.Events addNewEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.EventsDocument.Events target = null;
            target = (oasisNamesTcCiqXpil3.EventsDocument.Events)get_store().add_element_user(EVENTS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Events" element
     */
    public void unsetEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTS$14, 0);
        }
    }
    
    /**
     * Gets the "Identifiers" element
     */
    public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers getIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers target = null;
            target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers)get_store().find_element_user(IDENTIFIERS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Identifiers" element
     */
    public boolean isSetIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIERS$16) != 0;
        }
    }
    
    /**
     * Sets the "Identifiers" element
     */
    public void setIdentifiers(oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers identifiers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers target = null;
            target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers)get_store().find_element_user(IDENTIFIERS$16, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers)get_store().add_element_user(IDENTIFIERS$16);
            }
            target.set(identifiers);
        }
    }
    
    /**
     * Appends and returns a new empty "Identifiers" element
     */
    public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers addNewIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers target = null;
            target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers)get_store().add_element_user(IDENTIFIERS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Identifiers" element
     */
    public void unsetIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIERS$16, 0);
        }
    }
    
    /**
     * Gets the "Memberships" element
     */
    public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships getMemberships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships target = null;
            target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships)get_store().find_element_user(MEMBERSHIPS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Memberships" element
     */
    public boolean isSetMemberships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERSHIPS$18) != 0;
        }
    }
    
    /**
     * Sets the "Memberships" element
     */
    public void setMemberships(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships memberships)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships target = null;
            target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships)get_store().find_element_user(MEMBERSHIPS$18, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships)get_store().add_element_user(MEMBERSHIPS$18);
            }
            target.set(memberships);
        }
    }
    
    /**
     * Appends and returns a new empty "Memberships" element
     */
    public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships addNewMemberships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships target = null;
            target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships)get_store().add_element_user(MEMBERSHIPS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "Memberships" element
     */
    public void unsetMemberships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERSHIPS$18, 0);
        }
    }
    
    /**
     * Gets the "Relationships" element
     */
    public oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships getRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships target = null;
            target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships)get_store().find_element_user(RELATIONSHIPS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Relationships" element
     */
    public boolean isSetRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPS$20) != 0;
        }
    }
    
    /**
     * Sets the "Relationships" element
     */
    public void setRelationships(oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships relationships)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships target = null;
            target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships)get_store().find_element_user(RELATIONSHIPS$20, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships)get_store().add_element_user(RELATIONSHIPS$20);
            }
            target.set(relationships);
        }
    }
    
    /**
     * Appends and returns a new empty "Relationships" element
     */
    public oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships addNewRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships target = null;
            target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships)get_store().add_element_user(RELATIONSHIPS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "Relationships" element
     */
    public void unsetRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPS$20, 0);
        }
    }
    
    /**
     * Gets the "Revenues" element
     */
    public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues getRevenues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RevenuesDocument.Revenues target = null;
            target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues)get_store().find_element_user(REVENUES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Revenues" element
     */
    public boolean isSetRevenues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVENUES$22) != 0;
        }
    }
    
    /**
     * Sets the "Revenues" element
     */
    public void setRevenues(oasisNamesTcCiqXpil3.RevenuesDocument.Revenues revenues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RevenuesDocument.Revenues target = null;
            target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues)get_store().find_element_user(REVENUES$22, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues)get_store().add_element_user(REVENUES$22);
            }
            target.set(revenues);
        }
    }
    
    /**
     * Appends and returns a new empty "Revenues" element
     */
    public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues addNewRevenues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RevenuesDocument.Revenues target = null;
            target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues)get_store().add_element_user(REVENUES$22);
            return target;
        }
    }
    
    /**
     * Unsets the "Revenues" element
     */
    public void unsetRevenues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVENUES$22, 0);
        }
    }
    
    /**
     * Gets the "Stocks" element
     */
    public oasisNamesTcCiqXpil3.StocksDocument.Stocks getStocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.StocksDocument.Stocks target = null;
            target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks)get_store().find_element_user(STOCKS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Stocks" element
     */
    public boolean isSetStocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STOCKS$24) != 0;
        }
    }
    
    /**
     * Sets the "Stocks" element
     */
    public void setStocks(oasisNamesTcCiqXpil3.StocksDocument.Stocks stocks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.StocksDocument.Stocks target = null;
            target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks)get_store().find_element_user(STOCKS$24, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks)get_store().add_element_user(STOCKS$24);
            }
            target.set(stocks);
        }
    }
    
    /**
     * Appends and returns a new empty "Stocks" element
     */
    public oasisNamesTcCiqXpil3.StocksDocument.Stocks addNewStocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.StocksDocument.Stocks target = null;
            target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks)get_store().add_element_user(STOCKS$24);
            return target;
        }
    }
    
    /**
     * Unsets the "Stocks" element
     */
    public void unsetStocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STOCKS$24, 0);
        }
    }
    
    /**
     * Gets the "Vehicles" element
     */
    public oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles getVehicles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles target = null;
            target = (oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles)get_store().find_element_user(VEHICLES$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Vehicles" element
     */
    public boolean isSetVehicles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VEHICLES$26) != 0;
        }
    }
    
    /**
     * Sets the "Vehicles" element
     */
    public void setVehicles(oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles vehicles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles target = null;
            target = (oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles)get_store().find_element_user(VEHICLES$26, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles)get_store().add_element_user(VEHICLES$26);
            }
            target.set(vehicles);
        }
    }
    
    /**
     * Appends and returns a new empty "Vehicles" element
     */
    public oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles addNewVehicles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles target = null;
            target = (oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles)get_store().add_element_user(VEHICLES$26);
            return target;
        }
    }
    
    /**
     * Unsets the "Vehicles" element
     */
    public void unsetVehicles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VEHICLES$26, 0);
        }
    }
    
    /**
     * Gets the "OrganisationInfo" element
     */
    public oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo getOrganisationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo)get_store().find_element_user(ORGANISATIONINFO$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrganisationInfo" element
     */
    public boolean isSetOrganisationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONINFO$28) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationInfo" element
     */
    public void setOrganisationInfo(oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo organisationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo)get_store().find_element_user(ORGANISATIONINFO$28, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo)get_store().add_element_user(ORGANISATIONINFO$28);
            }
            target.set(organisationInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationInfo" element
     */
    public oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo addNewOrganisationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationInfoDocument.OrganisationInfo)get_store().add_element_user(ORGANISATIONINFO$28);
            return target;
        }
    }
    
    /**
     * Unsets the "OrganisationInfo" element
     */
    public void unsetOrganisationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONINFO$28, 0);
        }
    }
    
    /**
     * Gets the "Usage" attribute
     */
    public java.lang.String getUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Usage" attribute
     */
    public oasisNamesTcCiqXpil3.OrganisationDetailsUsageList xgetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationDetailsUsageList target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationDetailsUsageList)get_store().find_attribute_user(USAGE$30);
            return target;
        }
    }
    
    /**
     * True if has "Usage" attribute
     */
    public boolean isSetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USAGE$30) != null;
        }
    }
    
    /**
     * Sets the "Usage" attribute
     */
    public void setUsage(java.lang.String usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$30);
            }
            target.setStringValue(usage);
        }
    }
    
    /**
     * Sets (as xml) the "Usage" attribute
     */
    public void xsetUsage(oasisNamesTcCiqXpil3.OrganisationDetailsUsageList usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationDetailsUsageList target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationDetailsUsageList)get_store().find_attribute_user(USAGE$30);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.OrganisationDetailsUsageList)get_store().add_attribute_user(USAGE$30);
            }
            target.set(usage);
        }
    }
    
    /**
     * Unsets the "Usage" attribute
     */
    public void unsetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USAGE$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$32);
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
            target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$32);
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
            return get_store().find_attribute_user(STATUS$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$32);
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
            target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$32);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$32);
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
            get_store().remove_attribute(STATUS$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$34);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$34);
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
            return get_store().find_attribute_user(DATEVALIDFROM$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$34);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$34);
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
            get_store().remove_attribute(DATEVALIDFROM$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$36);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$36);
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
            return get_store().find_attribute_user(DATEVALIDTO$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$36);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$36);
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
            get_store().remove_attribute(DATEVALIDTO$36);
        }
    }
    
    /**
     * Gets the "OrganisationDetailsKey" attribute
     */
    public java.lang.String getOrganisationDetailsKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONDETAILSKEY$38);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationDetailsKey" attribute
     */
    public oasisNamesTcCiqCt3.String xgetOrganisationDetailsKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ORGANISATIONDETAILSKEY$38);
            return target;
        }
    }
    
    /**
     * True if has "OrganisationDetailsKey" attribute
     */
    public boolean isSetOrganisationDetailsKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORGANISATIONDETAILSKEY$38) != null;
        }
    }
    
    /**
     * Sets the "OrganisationDetailsKey" attribute
     */
    public void setOrganisationDetailsKey(java.lang.String organisationDetailsKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONDETAILSKEY$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORGANISATIONDETAILSKEY$38);
            }
            target.setStringValue(organisationDetailsKey);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationDetailsKey" attribute
     */
    public void xsetOrganisationDetailsKey(oasisNamesTcCiqCt3.String organisationDetailsKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ORGANISATIONDETAILSKEY$38);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ORGANISATIONDETAILSKEY$38);
            }
            target.set(organisationDetailsKey);
        }
    }
    
    /**
     * Unsets the "OrganisationDetailsKey" attribute
     */
    public void unsetOrganisationDetailsKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORGANISATIONDETAILSKEY$38);
        }
    }
    
    /**
     * Gets the "OrganisationDetailsKeyRef" attribute
     */
    public java.lang.String getOrganisationDetailsKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONDETAILSKEYREF$40);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationDetailsKeyRef" attribute
     */
    public oasisNamesTcCiqCt3.String xgetOrganisationDetailsKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ORGANISATIONDETAILSKEYREF$40);
            return target;
        }
    }
    
    /**
     * True if has "OrganisationDetailsKeyRef" attribute
     */
    public boolean isSetOrganisationDetailsKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORGANISATIONDETAILSKEYREF$40) != null;
        }
    }
    
    /**
     * Sets the "OrganisationDetailsKeyRef" attribute
     */
    public void setOrganisationDetailsKeyRef(java.lang.String organisationDetailsKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONDETAILSKEYREF$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORGANISATIONDETAILSKEYREF$40);
            }
            target.setStringValue(organisationDetailsKeyRef);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationDetailsKeyRef" attribute
     */
    public void xsetOrganisationDetailsKeyRef(oasisNamesTcCiqCt3.String organisationDetailsKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ORGANISATIONDETAILSKEYREF$40);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ORGANISATIONDETAILSKEYREF$40);
            }
            target.set(organisationDetailsKeyRef);
        }
    }
    
    /**
     * Unsets the "OrganisationDetailsKeyRef" attribute
     */
    public void unsetOrganisationDetailsKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORGANISATIONDETAILSKEYREF$40);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink1.TypeAttribute.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$42);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink1.TypeAttribute.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.w3.x1999.xlink1.TypeAttribute.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.TypeAttribute.Type target = null;
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE$42);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$42) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.w3.x1999.xlink1.TypeAttribute.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$42);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.w3.x1999.xlink1.TypeAttribute.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.TypeAttribute.Type target = null;
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE$42);
            if (target == null)
            {
                target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().add_attribute_user(TYPE$42);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$42);
        }
    }
    
    /**
     * Gets the "label" attribute
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$44);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "label" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$44);
            return target;
        }
    }
    
    /**
     * True if has "label" attribute
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABEL$44) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
    public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$44);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" attribute
     */
    public void xsetLabel(org.apache.xmlbeans.XmlNCName label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(LABEL$44);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "label" attribute
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABEL$44);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$46);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
    public boolean isSetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$46) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$46);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$46);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
    public void unsetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$46);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$48);
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
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$48);
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
            return get_store().find_attribute_user(DATAQUALITYTYPE$48) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$48);
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
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$48);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$48);
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
            get_store().remove_attribute(DATAQUALITYTYPE$48);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$50);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$50);
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
            return get_store().find_attribute_user(VALIDFROM$50) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$50);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$50);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$50);
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
            get_store().remove_attribute(VALIDFROM$50);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$52);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$52);
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
            return get_store().find_attribute_user(VALIDTO$52) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$52);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$52);
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
            get_store().remove_attribute(VALIDTO$52);
        }
    }
    
    /**
     * Gets the "LanguageCode" attribute
     */
    public java.lang.String getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$54);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LanguageCode" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$54);
            return target;
        }
    }
    
    /**
     * True if has "LanguageCode" attribute
     */
    public boolean isSetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGECODE$54) != null;
        }
    }
    
    /**
     * Sets the "LanguageCode" attribute
     */
    public void setLanguageCode(java.lang.String languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$54);
            }
            target.setStringValue(languageCode);
        }
    }
    
    /**
     * Sets (as xml) the "LanguageCode" attribute
     */
    public void xsetLanguageCode(org.apache.xmlbeans.XmlLanguage languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGECODE$54);
            }
            target.set(languageCode);
        }
    }
    
    /**
     * Unsets the "LanguageCode" attribute
     */
    public void unsetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGECODE$54);
        }
    }
}
