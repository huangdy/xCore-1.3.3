/*
 * XML Type:  OrganisationNameType
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.OrganisationNameType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3.impl;
/**
 * An XML OrganisationNameType(@urn:oasis:names:tc:ciq:xnl:3).
 *
 * This is a complex type.
 */
public class OrganisationNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnl3.OrganisationNameType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEELEMENT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameElement");
    private static final javax.xml.namespace.QName SUBDIVISIONNAME$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "SubDivisionName");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Type");
    private static final javax.xml.namespace.QName ORGANISATIONID$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "OrganisationID");
    private static final javax.xml.namespace.QName ORGANISATIONIDTYPE$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "OrganisationIDType");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "ID");
    private static final javax.xml.namespace.QName USAGE$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Usage");
    private static final javax.xml.namespace.QName STATUS$14 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Status");
    private static final javax.xml.namespace.QName DATEVALIDFROM$16 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
    private static final javax.xml.namespace.QName DATEVALIDTO$18 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
    private static final javax.xml.namespace.QName NAMEKEY$20 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameKey");
    private static final javax.xml.namespace.QName NAMEKEYREF$22 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameKeyRef");
    private static final javax.xml.namespace.QName TYPE2$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "type");
    private static final javax.xml.namespace.QName LABEL$26 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "label");
    private static final javax.xml.namespace.QName HREF$28 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink1", "href");
    private static final javax.xml.namespace.QName DATAQUALITYTYPE$30 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
    private static final javax.xml.namespace.QName VALIDFROM$32 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
    private static final javax.xml.namespace.QName VALIDTO$34 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
    private static final javax.xml.namespace.QName LANGUAGECODE$36 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "LanguageCode");
    
    
    /**
     * Gets array of all "NameElement" elements
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType.NameElement[] getNameElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEELEMENT$0, targetList);
            oasisNamesTcCiqXnl3.OrganisationNameType.NameElement[] result = new oasisNamesTcCiqXnl3.OrganisationNameType.NameElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NameElement" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType.NameElement getNameElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType.NameElement target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
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
    public void setNameElementArray(oasisNamesTcCiqXnl3.OrganisationNameType.NameElement[] nameElementArray)
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
    public void setNameElementArray(int i, oasisNamesTcCiqXnl3.OrganisationNameType.NameElement nameElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType.NameElement target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType.NameElement)get_store().find_element_user(NAMEELEMENT$0, i);
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
    public oasisNamesTcCiqXnl3.OrganisationNameType.NameElement insertNewNameElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType.NameElement target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType.NameElement)get_store().insert_element_user(NAMEELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NameElement" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType.NameElement addNewNameElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType.NameElement target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType.NameElement)get_store().add_element_user(NAMEELEMENT$0);
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
     * Gets array of all "SubDivisionName" elements
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName[] getSubDivisionNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBDIVISIONNAME$2, targetList);
            oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName[] result = new oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubDivisionName" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName getSubDivisionNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName)get_store().find_element_user(SUBDIVISIONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubDivisionName" element
     */
    public int sizeOfSubDivisionNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBDIVISIONNAME$2);
        }
    }
    
    /**
     * Sets array of all "SubDivisionName" element
     */
    public void setSubDivisionNameArray(oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName[] subDivisionNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subDivisionNameArray, SUBDIVISIONNAME$2);
        }
    }
    
    /**
     * Sets ith "SubDivisionName" element
     */
    public void setSubDivisionNameArray(int i, oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName subDivisionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName)get_store().find_element_user(SUBDIVISIONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subDivisionName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubDivisionName" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName insertNewSubDivisionName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName)get_store().insert_element_user(SUBDIVISIONNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubDivisionName" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName addNewSubDivisionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName)get_store().add_element_user(SUBDIVISIONNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubDivisionName" element
     */
    public void removeSubDivisionName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBDIVISIONNAME$2, i);
        }
    }
    
    /**
     * Gets the "Type" attribute
     */
    public oasisNamesTcCiqXnl3.OrganisationNameTypeList.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return (oasisNamesTcCiqXnl3.OrganisationNameTypeList.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public oasisNamesTcCiqXnl3.OrganisationNameTypeList xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameTypeList target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameTypeList)get_store().find_attribute_user(TYPE$4);
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
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(oasisNamesTcCiqXnl3.OrganisationNameTypeList.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(oasisNamesTcCiqXnl3.OrganisationNameTypeList type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameTypeList target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameTypeList)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.OrganisationNameTypeList)get_store().add_attribute_user(TYPE$4);
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
            get_store().remove_attribute(TYPE$4);
        }
    }
    
    /**
     * Gets the "OrganisationID" attribute
     */
    public java.lang.String getOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationID" attribute
     */
    public oasisNamesTcCiqCt3.String xgetOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ORGANISATIONID$6);
            return target;
        }
    }
    
    /**
     * True if has "OrganisationID" attribute
     */
    public boolean isSetOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORGANISATIONID$6) != null;
        }
    }
    
    /**
     * Sets the "OrganisationID" attribute
     */
    public void setOrganisationID(java.lang.String organisationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORGANISATIONID$6);
            }
            target.setStringValue(organisationID);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationID" attribute
     */
    public void xsetOrganisationID(oasisNamesTcCiqCt3.String organisationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqCt3.String target = null;
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(ORGANISATIONID$6);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(ORGANISATIONID$6);
            }
            target.set(organisationID);
        }
    }
    
    /**
     * Unsets the "OrganisationID" attribute
     */
    public void unsetOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORGANISATIONID$6);
        }
    }
    
    /**
     * Gets the "OrganisationIDType" attribute
     */
    public java.lang.String getOrganisationIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONIDTYPE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganisationIDType" attribute
     */
    public oasisNamesTcCiqXnl3.OrganisationIDTypeList xgetOrganisationIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationIDTypeList target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationIDTypeList)get_store().find_attribute_user(ORGANISATIONIDTYPE$8);
            return target;
        }
    }
    
    /**
     * True if has "OrganisationIDType" attribute
     */
    public boolean isSetOrganisationIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORGANISATIONIDTYPE$8) != null;
        }
    }
    
    /**
     * Sets the "OrganisationIDType" attribute
     */
    public void setOrganisationIDType(java.lang.String organisationIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORGANISATIONIDTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORGANISATIONIDTYPE$8);
            }
            target.setStringValue(organisationIDType);
        }
    }
    
    /**
     * Sets (as xml) the "OrganisationIDType" attribute
     */
    public void xsetOrganisationIDType(oasisNamesTcCiqXnl3.OrganisationIDTypeList organisationIDType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationIDTypeList target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationIDTypeList)get_store().find_attribute_user(ORGANISATIONIDTYPE$8);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.OrganisationIDTypeList)get_store().add_attribute_user(ORGANISATIONIDTYPE$8);
            }
            target.set(organisationIDType);
        }
    }
    
    /**
     * Unsets the "OrganisationIDType" attribute
     */
    public void unsetOrganisationIDType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORGANISATIONIDTYPE$8);
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
    public oasisNamesTcCiqXnl3.OrganisationNameUsageList xgetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameUsageList target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameUsageList)get_store().find_attribute_user(USAGE$12);
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
    public void xsetUsage(oasisNamesTcCiqXnl3.OrganisationNameUsageList usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameUsageList target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameUsageList)get_store().find_attribute_user(USAGE$12);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.OrganisationNameUsageList)get_store().add_attribute_user(USAGE$12);
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
     * Gets the "DateValidFrom" attribute
     */
    public java.util.Calendar getDateValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$16);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$16);
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
            return get_store().find_attribute_user(DATEVALIDFROM$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$16);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$16);
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
            get_store().remove_attribute(DATEVALIDFROM$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$18);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$18);
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
            return get_store().find_attribute_user(DATEVALIDTO$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$18);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$18);
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
            get_store().remove_attribute(DATEVALIDTO$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEY$20);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEY$20);
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
            return get_store().find_attribute_user(NAMEKEY$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEY$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMEKEY$20);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEY$20);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMEKEY$20);
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
            get_store().remove_attribute(NAMEKEY$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEYREF$22);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEYREF$22);
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
            return get_store().find_attribute_user(NAMEKEYREF$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEKEYREF$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMEKEYREF$22);
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
            target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(NAMEKEYREF$22);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(NAMEKEYREF$22);
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
            get_store().remove_attribute(NAMEKEYREF$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE2$24);
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
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE2$24);
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
            return get_store().find_attribute_user(TYPE2$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE2$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE2$24);
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
            target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().find_attribute_user(TYPE2$24);
            if (target == null)
            {
                target = (org.w3.x1999.xlink1.TypeAttribute.Type)get_store().add_attribute_user(TYPE2$24);
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
            get_store().remove_attribute(TYPE2$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$26);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$26);
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
            return get_store().find_attribute_user(LABEL$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$26);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(LABEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(LABEL$26);
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
            get_store().remove_attribute(LABEL$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$28);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$28);
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
            return get_store().find_attribute_user(HREF$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$28);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$28);
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
            get_store().remove_attribute(HREF$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$30);
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
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$30);
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
            return get_store().find_attribute_user(DATAQUALITYTYPE$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$30);
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
            target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$30);
            if (target == null)
            {
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$30);
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
            get_store().remove_attribute(DATAQUALITYTYPE$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$32);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$32);
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
            return get_store().find_attribute_user(VALIDFROM$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$32);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$32);
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
            get_store().remove_attribute(VALIDFROM$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$34);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$34);
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
            return get_store().find_attribute_user(VALIDTO$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$34);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$34);
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
            get_store().remove_attribute(VALIDTO$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$36);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$36);
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
            return get_store().find_attribute_user(LANGUAGECODE$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$36);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGECODE$36);
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
            get_store().remove_attribute(LANGUAGECODE$36);
        }
    }
    /**
     * An XML NameElement(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXnl3.OrganisationNameType$NameElement.
     */
    public static class NameElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXnl3.OrganisationNameType.NameElement
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
        public oasisNamesTcCiqXnl3.OrganisationNameElementList.Enum getElementType()
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
                return (oasisNamesTcCiqXnl3.OrganisationNameElementList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ElementType" attribute
         */
        public oasisNamesTcCiqXnl3.OrganisationNameElementList xgetElementType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.OrganisationNameElementList target = null;
                target = (oasisNamesTcCiqXnl3.OrganisationNameElementList)get_store().find_attribute_user(ELEMENTTYPE$0);
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
        public void setElementType(oasisNamesTcCiqXnl3.OrganisationNameElementList.Enum elementType)
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
        public void xsetElementType(oasisNamesTcCiqXnl3.OrganisationNameElementList elementType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.OrganisationNameElementList target = null;
                target = (oasisNamesTcCiqXnl3.OrganisationNameElementList)get_store().find_attribute_user(ELEMENTTYPE$0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXnl3.OrganisationNameElementList)get_store().add_attribute_user(ELEMENTTYPE$0);
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
    /**
     * An XML SubDivisionName(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXnl3.OrganisationNameType$SubDivisionName.
     */
    public static class SubDivisionNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXnl3.OrganisationNameType.SubDivisionName
    {
        private static final long serialVersionUID = 1L;
        
        public SubDivisionNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected SubDivisionNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Type");
        private static final javax.xml.namespace.QName ABBREVIATION$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
        
        
        /**
         * Gets the "Type" attribute
         */
        public oasisNamesTcCiqXnl3.SubDivisionTypeList.Enum getType()
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
                return (oasisNamesTcCiqXnl3.SubDivisionTypeList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXnl3.SubDivisionTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.SubDivisionTypeList target = null;
                target = (oasisNamesTcCiqXnl3.SubDivisionTypeList)get_store().find_attribute_user(TYPE$0);
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
        public void setType(oasisNamesTcCiqXnl3.SubDivisionTypeList.Enum type)
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
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXnl3.SubDivisionTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.SubDivisionTypeList target = null;
                target = (oasisNamesTcCiqXnl3.SubDivisionTypeList)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXnl3.SubDivisionTypeList)get_store().add_attribute_user(TYPE$0);
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
