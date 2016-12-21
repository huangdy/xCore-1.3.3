/*
 * XML Type:  PersonDetailsType
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.PersonDetailsType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * An XML PersonDetailsType(@urn:oasis:names:tc:ciq:xpil:3).
 *
 * This is a complex type.
 */
public interface PersonDetailsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonDetailsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("persondetailstype0a42type");
    
    /**
     * Gets the "FreeTextLines" element
     */
    oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines getFreeTextLines();
    
    /**
     * True if has "FreeTextLines" element
     */
    boolean isSetFreeTextLines();
    
    /**
     * Sets the "FreeTextLines" element
     */
    void setFreeTextLines(oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines freeTextLines);
    
    /**
     * Appends and returns a new empty "FreeTextLines" element
     */
    oasisNamesTcCiqXpil3.FreeTextLinesDocument.FreeTextLines addNewFreeTextLines();
    
    /**
     * Unsets the "FreeTextLines" element
     */
    void unsetFreeTextLines();
    
    /**
     * Gets array of all "PersonName" elements
     */
    oasisNamesTcCiqXnl3.PersonNameType[] getPersonNameArray();
    
    /**
     * Gets ith "PersonName" element
     */
    oasisNamesTcCiqXnl3.PersonNameType getPersonNameArray(int i);
    
    /**
     * Returns number of "PersonName" element
     */
    int sizeOfPersonNameArray();
    
    /**
     * Sets array of all "PersonName" element
     */
    void setPersonNameArray(oasisNamesTcCiqXnl3.PersonNameType[] personNameArray);
    
    /**
     * Sets ith "PersonName" element
     */
    void setPersonNameArray(int i, oasisNamesTcCiqXnl3.PersonNameType personName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonName" element
     */
    oasisNamesTcCiqXnl3.PersonNameType insertNewPersonName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonName" element
     */
    oasisNamesTcCiqXnl3.PersonNameType addNewPersonName();
    
    /**
     * Removes the ith "PersonName" element
     */
    void removePersonName(int i);
    
    /**
     * Gets the "Addresses" element
     */
    oasisNamesTcCiqXpil3.AddressesDocument.Addresses getAddresses();
    
    /**
     * True if has "Addresses" element
     */
    boolean isSetAddresses();
    
    /**
     * Sets the "Addresses" element
     */
    void setAddresses(oasisNamesTcCiqXpil3.AddressesDocument.Addresses addresses);
    
    /**
     * Appends and returns a new empty "Addresses" element
     */
    oasisNamesTcCiqXpil3.AddressesDocument.Addresses addNewAddresses();
    
    /**
     * Unsets the "Addresses" element
     */
    void unsetAddresses();
    
    /**
     * Gets the "Accounts" element
     */
    oasisNamesTcCiqXpil3.AccountsDocument.Accounts getAccounts();
    
    /**
     * True if has "Accounts" element
     */
    boolean isSetAccounts();
    
    /**
     * Sets the "Accounts" element
     */
    void setAccounts(oasisNamesTcCiqXpil3.AccountsDocument.Accounts accounts);
    
    /**
     * Appends and returns a new empty "Accounts" element
     */
    oasisNamesTcCiqXpil3.AccountsDocument.Accounts addNewAccounts();
    
    /**
     * Unsets the "Accounts" element
     */
    void unsetAccounts();
    
    /**
     * Gets the "ContactNumbers" element
     */
    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers getContactNumbers();
    
    /**
     * True if has "ContactNumbers" element
     */
    boolean isSetContactNumbers();
    
    /**
     * Sets the "ContactNumbers" element
     */
    void setContactNumbers(oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers contactNumbers);
    
    /**
     * Appends and returns a new empty "ContactNumbers" element
     */
    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers addNewContactNumbers();
    
    /**
     * Unsets the "ContactNumbers" element
     */
    void unsetContactNumbers();
    
    /**
     * Gets the "Documents" element
     */
    oasisNamesTcCiqXpil3.DocumentsDocument.Documents getDocuments();
    
    /**
     * True if has "Documents" element
     */
    boolean isSetDocuments();
    
    /**
     * Sets the "Documents" element
     */
    void setDocuments(oasisNamesTcCiqXpil3.DocumentsDocument.Documents documents);
    
    /**
     * Appends and returns a new empty "Documents" element
     */
    oasisNamesTcCiqXpil3.DocumentsDocument.Documents addNewDocuments();
    
    /**
     * Unsets the "Documents" element
     */
    void unsetDocuments();
    
    /**
     * Gets the "ElectronicAddressIdentifiers" element
     */
    oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers getElectronicAddressIdentifiers();
    
    /**
     * True if has "ElectronicAddressIdentifiers" element
     */
    boolean isSetElectronicAddressIdentifiers();
    
    /**
     * Sets the "ElectronicAddressIdentifiers" element
     */
    void setElectronicAddressIdentifiers(oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers electronicAddressIdentifiers);
    
    /**
     * Appends and returns a new empty "ElectronicAddressIdentifiers" element
     */
    oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers addNewElectronicAddressIdentifiers();
    
    /**
     * Unsets the "ElectronicAddressIdentifiers" element
     */
    void unsetElectronicAddressIdentifiers();
    
    /**
     * Gets the "Events" element
     */
    oasisNamesTcCiqXpil3.EventsDocument.Events getEvents();
    
    /**
     * True if has "Events" element
     */
    boolean isSetEvents();
    
    /**
     * Sets the "Events" element
     */
    void setEvents(oasisNamesTcCiqXpil3.EventsDocument.Events events);
    
    /**
     * Appends and returns a new empty "Events" element
     */
    oasisNamesTcCiqXpil3.EventsDocument.Events addNewEvents();
    
    /**
     * Unsets the "Events" element
     */
    void unsetEvents();
    
    /**
     * Gets the "Identifiers" element
     */
    oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers getIdentifiers();
    
    /**
     * True if has "Identifiers" element
     */
    boolean isSetIdentifiers();
    
    /**
     * Sets the "Identifiers" element
     */
    void setIdentifiers(oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers identifiers);
    
    /**
     * Appends and returns a new empty "Identifiers" element
     */
    oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers addNewIdentifiers();
    
    /**
     * Unsets the "Identifiers" element
     */
    void unsetIdentifiers();
    
    /**
     * Gets the "Memberships" element
     */
    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships getMemberships();
    
    /**
     * True if has "Memberships" element
     */
    boolean isSetMemberships();
    
    /**
     * Sets the "Memberships" element
     */
    void setMemberships(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships memberships);
    
    /**
     * Appends and returns a new empty "Memberships" element
     */
    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships addNewMemberships();
    
    /**
     * Unsets the "Memberships" element
     */
    void unsetMemberships();
    
    /**
     * Gets the "Relationships" element
     */
    oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships getRelationships();
    
    /**
     * True if has "Relationships" element
     */
    boolean isSetRelationships();
    
    /**
     * Sets the "Relationships" element
     */
    void setRelationships(oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships relationships);
    
    /**
     * Appends and returns a new empty "Relationships" element
     */
    oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships addNewRelationships();
    
    /**
     * Unsets the "Relationships" element
     */
    void unsetRelationships();
    
    /**
     * Gets the "Revenues" element
     */
    oasisNamesTcCiqXpil3.RevenuesDocument.Revenues getRevenues();
    
    /**
     * True if has "Revenues" element
     */
    boolean isSetRevenues();
    
    /**
     * Sets the "Revenues" element
     */
    void setRevenues(oasisNamesTcCiqXpil3.RevenuesDocument.Revenues revenues);
    
    /**
     * Appends and returns a new empty "Revenues" element
     */
    oasisNamesTcCiqXpil3.RevenuesDocument.Revenues addNewRevenues();
    
    /**
     * Unsets the "Revenues" element
     */
    void unsetRevenues();
    
    /**
     * Gets the "Stocks" element
     */
    oasisNamesTcCiqXpil3.StocksDocument.Stocks getStocks();
    
    /**
     * True if has "Stocks" element
     */
    boolean isSetStocks();
    
    /**
     * Sets the "Stocks" element
     */
    void setStocks(oasisNamesTcCiqXpil3.StocksDocument.Stocks stocks);
    
    /**
     * Appends and returns a new empty "Stocks" element
     */
    oasisNamesTcCiqXpil3.StocksDocument.Stocks addNewStocks();
    
    /**
     * Unsets the "Stocks" element
     */
    void unsetStocks();
    
    /**
     * Gets the "Vehicles" element
     */
    oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles getVehicles();
    
    /**
     * True if has "Vehicles" element
     */
    boolean isSetVehicles();
    
    /**
     * Sets the "Vehicles" element
     */
    void setVehicles(oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles vehicles);
    
    /**
     * Appends and returns a new empty "Vehicles" element
     */
    oasisNamesTcCiqXpil3.VehiclesDocument.Vehicles addNewVehicles();
    
    /**
     * Unsets the "Vehicles" element
     */
    void unsetVehicles();
    
    /**
     * Gets the "PersonInfo" element
     */
    oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo getPersonInfo();
    
    /**
     * True if has "PersonInfo" element
     */
    boolean isSetPersonInfo();
    
    /**
     * Sets the "PersonInfo" element
     */
    void setPersonInfo(oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo personInfo);
    
    /**
     * Appends and returns a new empty "PersonInfo" element
     */
    oasisNamesTcCiqXpil3.PersonInfoDocument.PersonInfo addNewPersonInfo();
    
    /**
     * Unsets the "PersonInfo" element
     */
    void unsetPersonInfo();
    
    /**
     * Gets the "BirthInfo" element
     */
    oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo getBirthInfo();
    
    /**
     * True if has "BirthInfo" element
     */
    boolean isSetBirthInfo();
    
    /**
     * Sets the "BirthInfo" element
     */
    void setBirthInfo(oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo birthInfo);
    
    /**
     * Appends and returns a new empty "BirthInfo" element
     */
    oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo addNewBirthInfo();
    
    /**
     * Unsets the "BirthInfo" element
     */
    void unsetBirthInfo();
    
    /**
     * Gets the "CountriesOfResidence" element
     */
    oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence getCountriesOfResidence();
    
    /**
     * True if has "CountriesOfResidence" element
     */
    boolean isSetCountriesOfResidence();
    
    /**
     * Sets the "CountriesOfResidence" element
     */
    void setCountriesOfResidence(oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence countriesOfResidence);
    
    /**
     * Appends and returns a new empty "CountriesOfResidence" element
     */
    oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence addNewCountriesOfResidence();
    
    /**
     * Unsets the "CountriesOfResidence" element
     */
    void unsetCountriesOfResidence();
    
    /**
     * Gets the "Favourites" element
     */
    oasisNamesTcCiqXpil3.FavouritesDocument.Favourites getFavourites();
    
    /**
     * True if has "Favourites" element
     */
    boolean isSetFavourites();
    
    /**
     * Sets the "Favourites" element
     */
    void setFavourites(oasisNamesTcCiqXpil3.FavouritesDocument.Favourites favourites);
    
    /**
     * Appends and returns a new empty "Favourites" element
     */
    oasisNamesTcCiqXpil3.FavouritesDocument.Favourites addNewFavourites();
    
    /**
     * Unsets the "Favourites" element
     */
    void unsetFavourites();
    
    /**
     * Gets the "Habits" element
     */
    oasisNamesTcCiqXpil3.HabitsDocument.Habits getHabits();
    
    /**
     * True if has "Habits" element
     */
    boolean isSetHabits();
    
    /**
     * Sets the "Habits" element
     */
    void setHabits(oasisNamesTcCiqXpil3.HabitsDocument.Habits habits);
    
    /**
     * Appends and returns a new empty "Habits" element
     */
    oasisNamesTcCiqXpil3.HabitsDocument.Habits addNewHabits();
    
    /**
     * Unsets the "Habits" element
     */
    void unsetHabits();
    
    /**
     * Gets the "Hobbies" element
     */
    oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies getHobbies();
    
    /**
     * True if has "Hobbies" element
     */
    boolean isSetHobbies();
    
    /**
     * Sets the "Hobbies" element
     */
    void setHobbies(oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies hobbies);
    
    /**
     * Appends and returns a new empty "Hobbies" element
     */
    oasisNamesTcCiqXpil3.HobbiesDocument.Hobbies addNewHobbies();
    
    /**
     * Unsets the "Hobbies" element
     */
    void unsetHobbies();
    
    /**
     * Gets the "Languages" element
     */
    oasisNamesTcCiqXpil3.LanguagesDocument.Languages getLanguages();
    
    /**
     * True if has "Languages" element
     */
    boolean isSetLanguages();
    
    /**
     * Sets the "Languages" element
     */
    void setLanguages(oasisNamesTcCiqXpil3.LanguagesDocument.Languages languages);
    
    /**
     * Appends and returns a new empty "Languages" element
     */
    oasisNamesTcCiqXpil3.LanguagesDocument.Languages addNewLanguages();
    
    /**
     * Unsets the "Languages" element
     */
    void unsetLanguages();
    
    /**
     * Gets the "Nationalities" element
     */
    oasisNamesTcCiqXpil3.NationalitiesDocument.Nationalities getNationalities();
    
    /**
     * True if has "Nationalities" element
     */
    boolean isSetNationalities();
    
    /**
     * Sets the "Nationalities" element
     */
    void setNationalities(oasisNamesTcCiqXpil3.NationalitiesDocument.Nationalities nationalities);
    
    /**
     * Appends and returns a new empty "Nationalities" element
     */
    oasisNamesTcCiqXpil3.NationalitiesDocument.Nationalities addNewNationalities();
    
    /**
     * Unsets the "Nationalities" element
     */
    void unsetNationalities();
    
    /**
     * Gets the "Occupations" element
     */
    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations getOccupations();
    
    /**
     * True if has "Occupations" element
     */
    boolean isSetOccupations();
    
    /**
     * Sets the "Occupations" element
     */
    void setOccupations(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations occupations);
    
    /**
     * Appends and returns a new empty "Occupations" element
     */
    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations addNewOccupations();
    
    /**
     * Unsets the "Occupations" element
     */
    void unsetOccupations();
    
    /**
     * Gets the "PhysicalInfo" element
     */
    oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo getPhysicalInfo();
    
    /**
     * True if has "PhysicalInfo" element
     */
    boolean isSetPhysicalInfo();
    
    /**
     * Sets the "PhysicalInfo" element
     */
    void setPhysicalInfo(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo physicalInfo);
    
    /**
     * Appends and returns a new empty "PhysicalInfo" element
     */
    oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo addNewPhysicalInfo();
    
    /**
     * Unsets the "PhysicalInfo" element
     */
    void unsetPhysicalInfo();
    
    /**
     * Gets the "Preferences" element
     */
    oasisNamesTcCiqXpil3.PreferencesDocument.Preferences getPreferences();
    
    /**
     * True if has "Preferences" element
     */
    boolean isSetPreferences();
    
    /**
     * Sets the "Preferences" element
     */
    void setPreferences(oasisNamesTcCiqXpil3.PreferencesDocument.Preferences preferences);
    
    /**
     * Appends and returns a new empty "Preferences" element
     */
    oasisNamesTcCiqXpil3.PreferencesDocument.Preferences addNewPreferences();
    
    /**
     * Unsets the "Preferences" element
     */
    void unsetPreferences();
    
    /**
     * Gets the "Qualifications" element
     */
    oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications getQualifications();
    
    /**
     * True if has "Qualifications" element
     */
    boolean isSetQualifications();
    
    /**
     * Sets the "Qualifications" element
     */
    void setQualifications(oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications qualifications);
    
    /**
     * Appends and returns a new empty "Qualifications" element
     */
    oasisNamesTcCiqXpil3.QualificationsDocument.Qualifications addNewQualifications();
    
    /**
     * Unsets the "Qualifications" element
     */
    void unsetQualifications();
    
    /**
     * Gets the "Visas" element
     */
    oasisNamesTcCiqXpil3.VisasDocument.Visas getVisas();
    
    /**
     * True if has "Visas" element
     */
    boolean isSetVisas();
    
    /**
     * Sets the "Visas" element
     */
    void setVisas(oasisNamesTcCiqXpil3.VisasDocument.Visas visas);
    
    /**
     * Appends and returns a new empty "Visas" element
     */
    oasisNamesTcCiqXpil3.VisasDocument.Visas addNewVisas();
    
    /**
     * Unsets the "Visas" element
     */
    void unsetVisas();
    
    /**
     * Gets the "Usage" attribute
     */
    java.lang.String getUsage();
    
    /**
     * Gets (as xml) the "Usage" attribute
     */
    oasisNamesTcCiqXpil3.PersonDetailsUsageList xgetUsage();
    
    /**
     * True if has "Usage" attribute
     */
    boolean isSetUsage();
    
    /**
     * Sets the "Usage" attribute
     */
    void setUsage(java.lang.String usage);
    
    /**
     * Sets (as xml) the "Usage" attribute
     */
    void xsetUsage(oasisNamesTcCiqXpil3.PersonDetailsUsageList usage);
    
    /**
     * Unsets the "Usage" attribute
     */
    void unsetUsage();
    
    /**
     * Gets the "Status" attribute
     */
    java.lang.String getStatus();
    
    /**
     * Gets (as xml) the "Status" attribute
     */
    oasisNamesTcCiqCt3.StatusList xgetStatus();
    
    /**
     * True if has "Status" attribute
     */
    boolean isSetStatus();
    
    /**
     * Sets the "Status" attribute
     */
    void setStatus(java.lang.String status);
    
    /**
     * Sets (as xml) the "Status" attribute
     */
    void xsetStatus(oasisNamesTcCiqCt3.StatusList status);
    
    /**
     * Unsets the "Status" attribute
     */
    void unsetStatus();
    
    /**
     * Gets the "DateValidFrom" attribute
     */
    java.util.Calendar getDateValidFrom();
    
    /**
     * Gets (as xml) the "DateValidFrom" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDateValidFrom();
    
    /**
     * True if has "DateValidFrom" attribute
     */
    boolean isSetDateValidFrom();
    
    /**
     * Sets the "DateValidFrom" attribute
     */
    void setDateValidFrom(java.util.Calendar dateValidFrom);
    
    /**
     * Sets (as xml) the "DateValidFrom" attribute
     */
    void xsetDateValidFrom(org.apache.xmlbeans.XmlDateTime dateValidFrom);
    
    /**
     * Unsets the "DateValidFrom" attribute
     */
    void unsetDateValidFrom();
    
    /**
     * Gets the "DateValidTo" attribute
     */
    java.util.Calendar getDateValidTo();
    
    /**
     * Gets (as xml) the "DateValidTo" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetDateValidTo();
    
    /**
     * True if has "DateValidTo" attribute
     */
    boolean isSetDateValidTo();
    
    /**
     * Sets the "DateValidTo" attribute
     */
    void setDateValidTo(java.util.Calendar dateValidTo);
    
    /**
     * Sets (as xml) the "DateValidTo" attribute
     */
    void xsetDateValidTo(org.apache.xmlbeans.XmlDateTime dateValidTo);
    
    /**
     * Unsets the "DateValidTo" attribute
     */
    void unsetDateValidTo();
    
    /**
     * Gets the "PersonDetailsKey" attribute
     */
    java.lang.String getPersonDetailsKey();
    
    /**
     * Gets (as xml) the "PersonDetailsKey" attribute
     */
    oasisNamesTcCiqCt3.String xgetPersonDetailsKey();
    
    /**
     * True if has "PersonDetailsKey" attribute
     */
    boolean isSetPersonDetailsKey();
    
    /**
     * Sets the "PersonDetailsKey" attribute
     */
    void setPersonDetailsKey(java.lang.String personDetailsKey);
    
    /**
     * Sets (as xml) the "PersonDetailsKey" attribute
     */
    void xsetPersonDetailsKey(oasisNamesTcCiqCt3.String personDetailsKey);
    
    /**
     * Unsets the "PersonDetailsKey" attribute
     */
    void unsetPersonDetailsKey();
    
    /**
     * Gets the "PersonDetailsKeyRef" attribute
     */
    java.lang.String getPersonDetailsKeyRef();
    
    /**
     * Gets (as xml) the "PersonDetailsKeyRef" attribute
     */
    oasisNamesTcCiqCt3.String xgetPersonDetailsKeyRef();
    
    /**
     * True if has "PersonDetailsKeyRef" attribute
     */
    boolean isSetPersonDetailsKeyRef();
    
    /**
     * Sets the "PersonDetailsKeyRef" attribute
     */
    void setPersonDetailsKeyRef(java.lang.String personDetailsKeyRef);
    
    /**
     * Sets (as xml) the "PersonDetailsKeyRef" attribute
     */
    void xsetPersonDetailsKeyRef(oasisNamesTcCiqCt3.String personDetailsKeyRef);
    
    /**
     * Unsets the "PersonDetailsKeyRef" attribute
     */
    void unsetPersonDetailsKeyRef();
    
    /**
     * Gets the "DataQualityType" attribute
     */
    oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
    
    /**
     * Gets (as xml) the "DataQualityType" attribute
     */
    oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
    
    /**
     * True if has "DataQualityType" attribute
     */
    boolean isSetDataQualityType();
    
    /**
     * Sets the "DataQualityType" attribute
     */
    void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
    
    /**
     * Sets (as xml) the "DataQualityType" attribute
     */
    void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
    
    /**
     * Unsets the "DataQualityType" attribute
     */
    void unsetDataQualityType();
    
    /**
     * Gets the "ValidFrom" attribute
     */
    java.util.Calendar getValidFrom();
    
    /**
     * Gets (as xml) the "ValidFrom" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidFrom();
    
    /**
     * True if has "ValidFrom" attribute
     */
    boolean isSetValidFrom();
    
    /**
     * Sets the "ValidFrom" attribute
     */
    void setValidFrom(java.util.Calendar validFrom);
    
    /**
     * Sets (as xml) the "ValidFrom" attribute
     */
    void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
    
    /**
     * Unsets the "ValidFrom" attribute
     */
    void unsetValidFrom();
    
    /**
     * Gets the "ValidTo" attribute
     */
    java.util.Calendar getValidTo();
    
    /**
     * Gets (as xml) the "ValidTo" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidTo();
    
    /**
     * True if has "ValidTo" attribute
     */
    boolean isSetValidTo();
    
    /**
     * Sets the "ValidTo" attribute
     */
    void setValidTo(java.util.Calendar validTo);
    
    /**
     * Sets (as xml) the "ValidTo" attribute
     */
    void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
    
    /**
     * Unsets the "ValidTo" attribute
     */
    void unsetValidTo();
    
    /**
     * Gets the "LanguageCode" attribute
     */
    java.lang.String getLanguageCode();
    
    /**
     * Gets (as xml) the "LanguageCode" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLanguageCode();
    
    /**
     * True if has "LanguageCode" attribute
     */
    boolean isSetLanguageCode();
    
    /**
     * Sets the "LanguageCode" attribute
     */
    void setLanguageCode(java.lang.String languageCode);
    
    /**
     * Sets (as xml) the "LanguageCode" attribute
     */
    void xsetLanguageCode(org.apache.xmlbeans.XmlLanguage languageCode);
    
    /**
     * Unsets the "LanguageCode" attribute
     */
    void unsetLanguageCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.PersonDetailsType newInstance() {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.PersonDetailsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.PersonDetailsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
