/*
 * XML Type:  PersonNameType
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.PersonNameType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3.impl;
/**
 * An XML PersonNameType(@urn:oasis:names:tc:ciq:xnl:3).
 *
 * This is a complex type.
 */
public class PersonNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnl3.PersonNameType
{
    private static final long serialVersionUID = 1L;
    
    public PersonNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameElement");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Type");
    private static final javax.xml.namespace.QName PERSONID$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PersonID");
    private static final javax.xml.namespace.QName PERSONIDTYPE$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PersonIDType");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "ID");
    private static final javax.xml.namespace.QName USAGE$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Usage");
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Status");
    private static final javax.xml.namespace.QName DATEVALIDFROM$14 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
    private static final javax.xml.namespace.QName DATEVALIDTO$16 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
    private static final javax.xml.namespace.QName NAMEKEY$18 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameKey");
    private static final javax.xml.namespace.QName NAMEKEYREF$20 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameKeyRef");
    private static final javax.xml.namespace.QName TYPE2$22 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "type");
    private static final javax.xml.namespace.QName LABEL$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "label");
    private static final javax.xml.namespace.QName HREF$26 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "href");
    private static final javax.xml.namespace.QName DATAQUALITYTYPE$28 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
    private static final javax.xml.namespace.QName VALIDFROM$30 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
    private static final javax.xml.namespace.QName VALIDTO$32 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
    private static final javax.xml.namespace.QName LANGUAGECODE$34 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "LanguageCode");
    
    
    /**
     * Gets array of all "NameElement" elements
     */
    public oasisNamesTcCiqXnl3.PersonNameType.NameElement[] getNameElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEELEMENT$0, targetList);
            oasisNamesTcCiqXnl3.PersonNameType.NameElement[] result = new oasisNamesTcCiqXnl3.PersonNameType.NameElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NameElement" element
     */
    public oasisNamesTcCiqXnl3.PersonNameType.NameElement getNameElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameType.NameElement target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NameElement" element
     */
    public int sizeOfNameElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEELEMENT$0);
        }
    }
    
    /**
     * Sets array of all "NameElement" element
     */
    public void setNameElementArray(oasisNamesTcCiqXnl3.PersonNameType.NameElement[] nameElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameElementArray, NAMEELEMENT$0);
        }
    }
    
    /**
     * Sets ith "NameElement" element
     */
    public void setNameElementArray(int i, oasisNamesTcCiqXnl3.PersonNameType.NameElement nameElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameType.NameElement target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nameElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NameElement" element
     */
    public oasisNamesTcCiqXnl3.PersonNameType.NameElement insertNewNameElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameType.NameElement target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameType.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameElement" element
     */
    public oasisNamesTcCiqXnl3.PersonNameType.NameElement addNewNameElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameType.NameElement target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameType.NameElement)get_store().add_element_user(NAMEELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "NameElement" element
     */
    public void removeNameElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEELEMENT$0, i);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public oasisNamesTcCiqXnl3.PersonNameTypeList.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return (oasisNamesTcCiqXnl3.PersonNameTypeList.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public oasisNamesTcCiqXnl3.PersonNameTypeList xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameTypeList target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameTypeList)get_store().find_attribute_user(TYPE$2);
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
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(oasisNamesTcCiqXnl3.PersonNameTypeList.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(oasisNamesTcCiqXnl3.PersonNameTypeList type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameTypeList target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameTypeList)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.PersonNameTypeList)get_store().add_attribute_user(TYPE$2);
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
            get_store().remove_attribute(TYPE$2);
        }
    }
    
    /**
     * Gets the "PersonID" attribute
     */
    public java.lang.String getPersonID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonID" attribute
     */
    public oasisNamesTcCiqCt3.String xgetPersonID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(PERSONID$4);
            return target;
        }
    }
    
    /**
     * True if has "PersonID" attribute
     */
    public boolean isSetPersonID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERSONID$4) != null;
        }
    }
    
    /**
     * Sets the "PersonID" attribute
     */
    public void setPersonID(java.lang.String personID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSONID$4);
            }
            target.setStringValue(personID);
        }
    }
    
    /**
     * Sets (as xml) the "PersonID" attribute
     */
    public void xsetPersonID(oasisNamesTcCiqCt3.String personID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(PERSONID$4);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(PERSONID$4);
            }
            target.set(personID);
        }
    }
    
    /**
     * Unsets the "PersonID" attribute
     */
    public void unsetPersonID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERSONID$4);
        }
    }
    
    /**
     * Gets the "PersonIDType" attribute
     */
    public java.lang.String getPersonIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONIDTYPE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonIDType" attribute
     */
    public oasisNamesTcCiqXnl3.PersonIDTypeList xgetPersonIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonIDTypeList target = null;
            target = (oasisNamesTcCiqXnl3.PersonIDTypeList)get_store().find_attribute_user(PERSONIDTYPE$6);
            return target;
        }
    }
    
    /**
     * True if has "PersonIDType" attribute
     */
    public boolean isSetPersonIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERSONIDTYPE$6) != null;
        }
    }
    
    /**
     * Sets the "PersonIDType" attribute
     */
    public void setPersonIDType(java.lang.String personIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONIDTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSONIDTYPE$6);
            }
            target.setStringValue(personIDType);
        }
    }
    
    /**
     * Sets (as xml) the "PersonIDType" attribute
     */
    public void xsetPersonIDType(oasisNamesTcCiqXnl3.PersonIDTypeList personIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonIDTypeList target = null;
            target = (oasisNamesTcCiqXnl3.PersonIDTypeList)get_store().find_attribute_user(PERSONIDTYPE$6);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.PersonIDTypeList)get_store().add_attribute_user(PERSONIDTYPE$6);
            }
            target.set(personIDType);
        }
    }
    
    /**
     * Unsets the "PersonIDType" attribute
     */
    public void unsetPersonIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERSONIDTYPE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$10);
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
    public oasisNamesTcCiqXnl3.PersonNameUsageList xgetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameUsageList target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameUsageList)get_store().find_attribute_user(USAGE$10);
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
            return get_store().find_attribute_user(USAGE$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$10);
            }
            target.setStringValue(usage);
        }
    }
    
    /**
     * Sets (as xml) the "Usage" attribute
     */
    public void xsetUsage(oasisNamesTcCiqXnl3.PersonNameUsageList usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameUsageList target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameUsageList)get_store().find_attribute_user(USAGE$10);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.PersonNameUsageList)get_store().add_attribute_user(USAGE$10);
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
            get_store().remove_attribute(USAGE$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$12);
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
            target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$12);
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
            return get_store().find_attribute_user(STATUS$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$12);
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
            target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$12);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$12);
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
            get_store().remove_attribute(STATUS$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$14);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$14);
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
            return get_store().find_attribute_user(DATEVALIDFROM$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$14);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$14);
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
            get_store().remove_attribute(DATEVALIDFROM$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$16);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$16);
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
            return get_store().find_attribute_user(DATEVALIDTO$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$16);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$16);
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
            get_store().remove_attribute(DATEVALIDTO$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEY$18);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEY$18);
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
            return get_store().find_attribute_user(NAMEKEY$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMEKEY$18);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEY$18);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMEKEY$18);
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
            get_store().remove_attribute(NAMEKEY$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEYREF$20);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEYREF$20);
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
            return get_store().find_attribute_user(NAMEKEYREF$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEYREF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMEKEYREF$20);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEYREF$20);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMEKEYREF$20);
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
            get_store().remove_attribute(NAMEKEYREF$20);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink1.TypeAttribute.Type.Enum getType2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE2$22);
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
    public org.w3.x1999.xlink1.TypeAttribute.Type xgetType2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.TypeAttribute.Type target = null;
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE2$22);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE2$22) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType2(org.w3.x1999.xlink1.TypeAttribute.Type.Enum type2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE2$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE2$22);
            }
            target.setEnumValue(type2);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType2(org.w3.x1999.xlink1.TypeAttribute.Type type2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink1.TypeAttribute.Type target = null;
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE2$22);
            if (target == null)
            {
                target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().add_attribute_user(TYPE2$22);
            }
            target.set(type2);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE2$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$24);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$24);
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
            return get_store().find_attribute_user(LABEL$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$24);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(LABEL$24);
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
            get_store().remove_attribute(LABEL$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$26);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$26);
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
            return get_store().find_attribute_user(HREF$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$26);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$26);
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
            get_store().remove_attribute(HREF$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$28);
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
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$28);
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
            return get_store().find_attribute_user(DATAQUALITYTYPE$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$28);
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
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$28);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$28);
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
            get_store().remove_attribute(DATAQUALITYTYPE$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$30);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$30);
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
            return get_store().find_attribute_user(VALIDFROM$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$30);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$30);
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
            get_store().remove_attribute(VALIDFROM$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$32);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$32);
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
            return get_store().find_attribute_user(VALIDTO$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$32);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$32);
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
            get_store().remove_attribute(VALIDTO$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$34);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$34);
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
            return get_store().find_attribute_user(LANGUAGECODE$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$34);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGECODE$34);
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
            get_store().remove_attribute(LANGUAGECODE$34);
        }
    }
    /**
     * An XML NameElement(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXnl3.PersonNameType$NameElement.
     */
    public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXnl3.PersonNameType.NameElement
    {
        private static final long serialVersionUID = 1L;
        
        public NameElementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected NameElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName ELEMENTTYPE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "ElementType");
        private static final javax.xml.namespace.QName ABBREVIATION$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
        
        
        /**
         * Gets the "ElementType" attribute
         */
        public oasisNamesTcCiqXnl3.PersonNameElementList.Enum getElementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENTTYPE$0);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqXnl3.PersonNameElementList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ElementType" attribute
         */
        public oasisNamesTcCiqXnl3.PersonNameElementList xgetElementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.PersonNameElementList target = null;
                target = (oasisNamesTcCiqXnl3.PersonNameElementList)get_store().find_attribute_user(ELEMENTTYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "ElementType" attribute
         */
        public boolean isSetElementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEMENTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "ElementType" attribute
         */
        public void setElementType(oasisNamesTcCiqXnl3.PersonNameElementList.Enum elementType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEMENTTYPE$0);
                }
                target.setEnumValue(elementType);
            }
        }
        
        /**
         * Sets (as xml) the "ElementType" attribute
         */
        public void xsetElementType(oasisNamesTcCiqXnl3.PersonNameElementList elementType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.PersonNameElementList target = null;
                target = (oasisNamesTcCiqXnl3.PersonNameElementList)get_store().find_attribute_user(ELEMENTTYPE$0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXnl3.PersonNameElementList)get_store().add_attribute_user(ELEMENTTYPE$0);
                }
                target.set(elementType);
            }
        }
        
        /**
         * Unsets the "ElementType" attribute
         */
        public void unsetElementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEMENTTYPE$0);
            }
        }
        
        /**
         * Gets the "Abbreviation" attribute
         */
        public boolean getAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$2);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Abbreviation" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$2);
                return target;
            }
        }
        
        /**
         * True if has "Abbreviation" attribute
         */
        public boolean isSetAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ABBREVIATION$2) != null;
            }
        }
        
        /**
         * Sets the "Abbreviation" attribute
         */
        public void setAbbreviation(boolean abbreviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBREVIATION$2);
                }
                target.setBooleanValue(abbreviation);
            }
        }
        
        /**
         * Sets (as xml) the "Abbreviation" attribute
         */
        public void xsetAbbreviation(org.apache.xmlbeans.XmlBoolean abbreviation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABBREVIATION$2);
                }
                target.set(abbreviation);
            }
        }
        
        /**
         * Unsets the "Abbreviation" attribute
         */
        public void unsetAbbreviation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ABBREVIATION$2);
            }
        }
    }
}
