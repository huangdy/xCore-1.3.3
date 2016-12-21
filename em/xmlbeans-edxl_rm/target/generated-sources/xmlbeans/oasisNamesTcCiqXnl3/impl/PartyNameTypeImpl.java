/*
 * XML Type:  PartyNameType
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.PartyNameType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3.impl;
/**
 * An XML PartyNameType(@urn:oasis:names:tc:ciq:xnl:3).
 *
 * This is a complex type.
 */
public class PartyNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnl3.PartyNameType
{
    private static final long serialVersionUID = 1L;
    
    public PartyNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMELINE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameLine");
    private static final javax.xml.namespace.QName PERSONNAME$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PersonName");
    private static final javax.xml.namespace.QName ORGANISATIONNAME$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "OrganisationName");
    private static final javax.xml.namespace.QName PARTYNAMEID$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PartyNameID");
    private static final javax.xml.namespace.QName PARTYNAMEIDTYPE$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PartyNameIDType");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "ID");
    private static final javax.xml.namespace.QName USAGE$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Usage");
    private static final javax.xml.namespace.QName STATUS$14 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Status");
    private static final javax.xml.namespace.QName JOINTNAMECONNECTOR$16 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "JointNameConnector");
    private static final javax.xml.namespace.QName DATEVALIDFROM$18 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
    private static final javax.xml.namespace.QName DATEVALIDTO$20 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
    private static final javax.xml.namespace.QName NAMEKEY$22 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameKey");
    private static final javax.xml.namespace.QName NAMEKEYREF$24 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameKeyRef");
    private static final javax.xml.namespace.QName TYPE$26 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "type");
    private static final javax.xml.namespace.QName LABEL$28 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "label");
    private static final javax.xml.namespace.QName HREF$30 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "href");
    private static final javax.xml.namespace.QName DATAQUALITYTYPE$32 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
    private static final javax.xml.namespace.QName VALIDFROM$34 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
    private static final javax.xml.namespace.QName VALIDTO$36 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
    private static final javax.xml.namespace.QName LANGUAGECODE$38 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "LanguageCode");
    
    
    /**
     * Gets array of all "NameLine" elements
     */
    public oasisNamesTcCiqXnl3.NameLineDocument.NameLine[] getNameLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMELINE$0, targetList);
            oasisNamesTcCiqXnl3.NameLineDocument.NameLine[] result = new oasisNamesTcCiqXnl3.NameLineDocument.NameLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NameLine" element
     */
    public oasisNamesTcCiqXnl3.NameLineDocument.NameLine getNameLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.NameLineDocument.NameLine target = null;
            target = (oasisNamesTcCiqXnl3.NameLineDocument.NameLine)get_store().find_element_user(NAMELINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NameLine" element
     */
    public int sizeOfNameLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMELINE$0);
        }
    }
    
    /**
     * Sets array of all "NameLine" element
     */
    public void setNameLineArray(oasisNamesTcCiqXnl3.NameLineDocument.NameLine[] nameLineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameLineArray, NAMELINE$0);
        }
    }
    
    /**
     * Sets ith "NameLine" element
     */
    public void setNameLineArray(int i, oasisNamesTcCiqXnl3.NameLineDocument.NameLine nameLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.NameLineDocument.NameLine target = null;
            target = (oasisNamesTcCiqXnl3.NameLineDocument.NameLine)get_store().find_element_user(NAMELINE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nameLine);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameLine" element
     */
    public oasisNamesTcCiqXnl3.NameLineDocument.NameLine insertNewNameLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.NameLineDocument.NameLine target = null;
            target = (oasisNamesTcCiqXnl3.NameLineDocument.NameLine)get_store().insert_element_user(NAMELINE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameLine" element
     */
    public oasisNamesTcCiqXnl3.NameLineDocument.NameLine addNewNameLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.NameLineDocument.NameLine target = null;
            target = (oasisNamesTcCiqXnl3.NameLineDocument.NameLine)get_store().add_element_user(NAMELINE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "NameLine" element
     */
    public void removeNameLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMELINE$0, i);
        }
    }
    
    /**
     * Gets array of all "PersonName" elements
     */
    public oasisNamesTcCiqXnl3.PartyNameType.PersonName[] getPersonNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONNAME$2, targetList);
            oasisNamesTcCiqXnl3.PartyNameType.PersonName[] result = new oasisNamesTcCiqXnl3.PartyNameType.PersonName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonName" element
     */
    public oasisNamesTcCiqXnl3.PartyNameType.PersonName getPersonNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType.PersonName target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType.PersonName)get_store().find_element_user(PERSONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PersonName" element
     */
    public int sizeOfPersonNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONNAME$2);
        }
    }
    
    /**
     * Sets array of all "PersonName" element
     */
    public void setPersonNameArray(oasisNamesTcCiqXnl3.PartyNameType.PersonName[] personNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personNameArray, PERSONNAME$2);
        }
    }
    
    /**
     * Sets ith "PersonName" element
     */
    public void setPersonNameArray(int i, oasisNamesTcCiqXnl3.PartyNameType.PersonName personName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType.PersonName target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType.PersonName)get_store().find_element_user(PERSONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonName" element
     */
    public oasisNamesTcCiqXnl3.PartyNameType.PersonName insertNewPersonName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType.PersonName target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType.PersonName)get_store().insert_element_user(PERSONNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonName" element
     */
    public oasisNamesTcCiqXnl3.PartyNameType.PersonName addNewPersonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType.PersonName target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType.PersonName)get_store().add_element_user(PERSONNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonName" element
     */
    public void removePersonName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONNAME$2, i);
        }
    }
    
    /**
     * Gets array of all "OrganisationName" elements
     */
    public oasisNamesTcCiqXnl3.PartyNameType.OrganisationName[] getOrganisationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONNAME$4, targetList);
            oasisNamesTcCiqXnl3.PartyNameType.OrganisationName[] result = new oasisNamesTcCiqXnl3.PartyNameType.OrganisationName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationName" element
     */
    public oasisNamesTcCiqXnl3.PartyNameType.OrganisationName getOrganisationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType.OrganisationName target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType.OrganisationName)get_store().find_element_user(ORGANISATIONNAME$4, i);
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
            return get_store().count_elements(ORGANISATIONNAME$4);
        }
    }
    
    /**
     * Sets array of all "OrganisationName" element
     */
    public void setOrganisationNameArray(oasisNamesTcCiqXnl3.PartyNameType.OrganisationName[] organisationNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationNameArray, ORGANISATIONNAME$4);
        }
    }
    
    /**
     * Sets ith "OrganisationName" element
     */
    public void setOrganisationNameArray(int i, oasisNamesTcCiqXnl3.PartyNameType.OrganisationName organisationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType.OrganisationName target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType.OrganisationName)get_store().find_element_user(ORGANISATIONNAME$4, i);
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
    public oasisNamesTcCiqXnl3.PartyNameType.OrganisationName insertNewOrganisationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType.OrganisationName target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType.OrganisationName)get_store().insert_element_user(ORGANISATIONNAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationName" element
     */
    public oasisNamesTcCiqXnl3.PartyNameType.OrganisationName addNewOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType.OrganisationName target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType.OrganisationName)get_store().add_element_user(ORGANISATIONNAME$4);
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
            get_store().remove_element(ORGANISATIONNAME$4, i);
        }
    }
    
    /**
     * Gets the "PartyNameID" attribute
     */
    public java.lang.String getPartyNameID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTYNAMEID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartyNameID" attribute
     */
    public oasisNamesTcCiqCt3.String xgetPartyNameID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(PARTYNAMEID$6);
            return target;
        }
    }
    
    /**
     * True if has "PartyNameID" attribute
     */
    public boolean isSetPartyNameID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTYNAMEID$6) != null;
        }
    }
    
    /**
     * Sets the "PartyNameID" attribute
     */
    public void setPartyNameID(java.lang.String partyNameID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTYNAMEID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTYNAMEID$6);
            }
            target.setStringValue(partyNameID);
        }
    }
    
    /**
     * Sets (as xml) the "PartyNameID" attribute
     */
    public void xsetPartyNameID(oasisNamesTcCiqCt3.String partyNameID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(PARTYNAMEID$6);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(PARTYNAMEID$6);
            }
            target.set(partyNameID);
        }
    }
    
    /**
     * Unsets the "PartyNameID" attribute
     */
    public void unsetPartyNameID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTYNAMEID$6);
        }
    }
    
    /**
     * Gets the "PartyNameIDType" attribute
     */
    public java.lang.String getPartyNameIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTYNAMEIDTYPE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartyNameIDType" attribute
     */
    public oasisNamesTcCiqXnl3.PartyNameIDTypeList xgetPartyNameIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameIDTypeList target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameIDTypeList)get_store().find_attribute_user(PARTYNAMEIDTYPE$8);
            return target;
        }
    }
    
    /**
     * True if has "PartyNameIDType" attribute
     */
    public boolean isSetPartyNameIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTYNAMEIDTYPE$8) != null;
        }
    }
    
    /**
     * Sets the "PartyNameIDType" attribute
     */
    public void setPartyNameIDType(java.lang.String partyNameIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTYNAMEIDTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTYNAMEIDTYPE$8);
            }
            target.setStringValue(partyNameIDType);
        }
    }
    
    /**
     * Sets (as xml) the "PartyNameIDType" attribute
     */
    public void xsetPartyNameIDType(oasisNamesTcCiqXnl3.PartyNameIDTypeList partyNameIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameIDTypeList target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameIDTypeList)get_store().find_attribute_user(PARTYNAMEIDTYPE$8);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.PartyNameIDTypeList)get_store().add_attribute_user(PARTYNAMEIDTYPE$8);
            }
            target.set(partyNameIDType);
        }
    }
    
    /**
     * Unsets the "PartyNameIDType" attribute
     */
    public void unsetPartyNameIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTYNAMEIDTYPE$8);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public oasisNamesTcCiqCt3.String xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(oasisNamesTcCiqCt3.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$12);
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
    public oasisNamesTcCiqXnl3.PartyNameUsageList xgetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameUsageList target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameUsageList)get_store().find_attribute_user(USAGE$12);
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
            return get_store().find_attribute_user(USAGE$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$12);
            }
            target.setStringValue(usage);
        }
    }
    
    /**
     * Sets (as xml) the "Usage" attribute
     */
    public void xsetUsage(oasisNamesTcCiqXnl3.PartyNameUsageList usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameUsageList target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameUsageList)get_store().find_attribute_user(USAGE$12);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.PartyNameUsageList)get_store().add_attribute_user(USAGE$12);
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
            get_store().remove_attribute(USAGE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$14);
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
            target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$14);
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
            return get_store().find_attribute_user(STATUS$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$14);
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
            target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$14);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$14);
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
            get_store().remove_attribute(STATUS$14);
        }
    }
    
    /**
     * Gets the "JointNameConnector" attribute
     */
    public java.lang.String getJointNameConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINTNAMECONNECTOR$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "JointNameConnector" attribute
     */
    public oasisNamesTcCiqXnl3.JointNameConnectorList xgetJointNameConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.JointNameConnectorList target = null;
            target = (oasisNamesTcCiqXnl3.JointNameConnectorList)get_store().find_attribute_user(JOINTNAMECONNECTOR$16);
            return target;
        }
    }
    
    /**
     * True if has "JointNameConnector" attribute
     */
    public boolean isSetJointNameConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(JOINTNAMECONNECTOR$16) != null;
        }
    }
    
    /**
     * Sets the "JointNameConnector" attribute
     */
    public void setJointNameConnector(java.lang.String jointNameConnector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINTNAMECONNECTOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JOINTNAMECONNECTOR$16);
            }
            target.setStringValue(jointNameConnector);
        }
    }
    
    /**
     * Sets (as xml) the "JointNameConnector" attribute
     */
    public void xsetJointNameConnector(oasisNamesTcCiqXnl3.JointNameConnectorList jointNameConnector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.JointNameConnectorList target = null;
            target = (oasisNamesTcCiqXnl3.JointNameConnectorList)get_store().find_attribute_user(JOINTNAMECONNECTOR$16);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.JointNameConnectorList)get_store().add_attribute_user(JOINTNAMECONNECTOR$16);
            }
            target.set(jointNameConnector);
        }
    }
    
    /**
     * Unsets the "JointNameConnector" attribute
     */
    public void unsetJointNameConnector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(JOINTNAMECONNECTOR$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$18);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$18);
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
            return get_store().find_attribute_user(DATEVALIDFROM$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$18);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$18);
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
            get_store().remove_attribute(DATEVALIDFROM$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$20);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$20);
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
            return get_store().find_attribute_user(DATEVALIDTO$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$20);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$20);
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
            get_store().remove_attribute(DATEVALIDTO$20);
        }
    }
    
    /**
     * Gets the "NameKey" attribute
     */
    public java.lang.String getNameKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEY$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NameKey" attribute
     */
    public oasisNamesTcCiqCt3.String xgetNameKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEY$22);
            return target;
        }
    }
    
    /**
     * True if has "NameKey" attribute
     */
    public boolean isSetNameKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMEKEY$22) != null;
        }
    }
    
    /**
     * Sets the "NameKey" attribute
     */
    public void setNameKey(java.lang.String nameKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEY$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMEKEY$22);
            }
            target.setStringValue(nameKey);
        }
    }
    
    /**
     * Sets (as xml) the "NameKey" attribute
     */
    public void xsetNameKey(oasisNamesTcCiqCt3.String nameKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEY$22);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMEKEY$22);
            }
            target.set(nameKey);
        }
    }
    
    /**
     * Unsets the "NameKey" attribute
     */
    public void unsetNameKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMEKEY$22);
        }
    }
    
    /**
     * Gets the "NameKeyRef" attribute
     */
    public java.lang.String getNameKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEYREF$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NameKeyRef" attribute
     */
    public oasisNamesTcCiqCt3.String xgetNameKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEYREF$24);
            return target;
        }
    }
    
    /**
     * True if has "NameKeyRef" attribute
     */
    public boolean isSetNameKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMEKEYREF$24) != null;
        }
    }
    
    /**
     * Sets the "NameKeyRef" attribute
     */
    public void setNameKeyRef(java.lang.String nameKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEYREF$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMEKEYREF$24);
            }
            target.setStringValue(nameKeyRef);
        }
    }
    
    /**
     * Sets (as xml) the "NameKeyRef" attribute
     */
    public void xsetNameKeyRef(oasisNamesTcCiqCt3.String nameKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEYREF$24);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMEKEYREF$24);
            }
            target.set(nameKeyRef);
        }
    }
    
    /**
     * Unsets the "NameKeyRef" attribute
     */
    public void unsetNameKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMEKEYREF$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$26);
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
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE$26);
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
            return get_store().find_attribute_user(TYPE$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$26);
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
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE$26);
            if (target == null)
            {
                target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().add_attribute_user(TYPE$26);
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
            get_store().remove_attribute(TYPE$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$28);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$28);
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
            return get_store().find_attribute_user(LABEL$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$28);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(LABEL$28);
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
            get_store().remove_attribute(LABEL$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$30);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$30);
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
            return get_store().find_attribute_user(HREF$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$30);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$30);
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
            get_store().remove_attribute(HREF$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$32);
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
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$32);
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
            return get_store().find_attribute_user(DATAQUALITYTYPE$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$32);
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
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$32);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$32);
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
            get_store().remove_attribute(DATAQUALITYTYPE$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$34);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$34);
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
            return get_store().find_attribute_user(VALIDFROM$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$34);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$34);
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
            get_store().remove_attribute(VALIDFROM$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$36);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$36);
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
            return get_store().find_attribute_user(VALIDTO$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$36);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$36);
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
            get_store().remove_attribute(VALIDTO$36);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$38);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$38);
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
            return get_store().find_attribute_user(LANGUAGECODE$38) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$38);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGECODE$38);
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
            get_store().remove_attribute(LANGUAGECODE$38);
        }
    }
    /**
     * An XML PersonName(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is a complex type.
     */
    public static class PersonNameImpl extends oasisNamesTcCiqXnl3.impl.PersonNameTypeImpl implements oasisNamesTcCiqXnl3.PartyNameType.PersonName
    {
        private static final long serialVersionUID = 1L;
        
        public PersonNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML OrganisationName(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is a complex type.
     */
    public static class OrganisationNameImpl extends oasisNamesTcCiqXnl3.impl.OrganisationNameTypeImpl implements oasisNamesTcCiqXnl3.PartyNameType.OrganisationName
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
