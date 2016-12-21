/*
 * An XML document type.
 * Localname: Record
 * Namespace: urn:oasis:names:tc:ciq:xnal:3
 * Java type: oasisNamesTcCiqXnal3.RecordDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnal3.impl;
/**
 * A document containing one Record(@urn:oasis:names:tc:ciq:xnal:3) element.
 *
 * This is a complex type.
 */
public class RecordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnal3.RecordDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORD$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "Record");
    
    
    /**
     * Gets the "Record" element
     */
    public oasisNamesTcCiqXnal3.RecordDocument.Record getRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnal3.RecordDocument.Record target = null;
            target = (oasisNamesTcCiqXnal3.RecordDocument.Record)get_store().find_element_user(RECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Record" element
     */
    public void setRecord(oasisNamesTcCiqXnal3.RecordDocument.Record record)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnal3.RecordDocument.Record target = null;
            target = (oasisNamesTcCiqXnal3.RecordDocument.Record)get_store().find_element_user(RECORD$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnal3.RecordDocument.Record)get_store().add_element_user(RECORD$0);
            }
            target.set(record);
        }
    }
    
    /**
     * Appends and returns a new empty "Record" element
     */
    public oasisNamesTcCiqXnal3.RecordDocument.Record addNewRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnal3.RecordDocument.Record target = null;
            target = (oasisNamesTcCiqXnal3.RecordDocument.Record)get_store().add_element_user(RECORD$0);
            return target;
        }
    }
    /**
     * An XML Record(@urn:oasis:names:tc:ciq:xnal:3).
     *
     * This is a complex type.
     */
    public static class RecordImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnal3.RecordDocument.Record
    {
        private static final long serialVersionUID = 1L;
        
        public RecordImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTYNAME$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PartyName");
        private static final javax.xml.namespace.QName ADDRESS$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Address");
        private static final javax.xml.namespace.QName RECORDID$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "RecordID");
        private static final javax.xml.namespace.QName RECORDIDTYPE$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "RecordIDType");
        private static final javax.xml.namespace.QName STATUS$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "Status");
        private static final javax.xml.namespace.QName DATEVALIDFROM$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
        private static final javax.xml.namespace.QName DATEVALIDTO$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
        private static final javax.xml.namespace.QName RECORDKEY$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "RecordKey");
        private static final javax.xml.namespace.QName RECORDKEYREF$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnal:3", "RecordKeyRef");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$18 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$20 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$22 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        private static final javax.xml.namespace.QName LANGUAGECODE$24 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "LanguageCode");
        
        
        /**
         * Gets array of all "PartyName" elements
         */
        public oasisNamesTcCiqXnl3.PartyNameType[] getPartyNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARTYNAME$0, targetList);
                oasisNamesTcCiqXnl3.PartyNameType[] result = new oasisNamesTcCiqXnl3.PartyNameType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "PartyName" element
         */
        public oasisNamesTcCiqXnl3.PartyNameType getPartyNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.PartyNameType target = null;
                target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().find_element_user(PARTYNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "PartyName" element
         */
        public int sizeOfPartyNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARTYNAME$0);
            }
        }
        
        /**
         * Sets array of all "PartyName" element
         */
        public void setPartyNameArray(oasisNamesTcCiqXnl3.PartyNameType[] partyNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(partyNameArray, PARTYNAME$0);
            }
        }
        
        /**
         * Sets ith "PartyName" element
         */
        public void setPartyNameArray(int i, oasisNamesTcCiqXnl3.PartyNameType partyName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.PartyNameType target = null;
                target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().find_element_user(PARTYNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(partyName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "PartyName" element
         */
        public oasisNamesTcCiqXnl3.PartyNameType insertNewPartyName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.PartyNameType target = null;
                target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().insert_element_user(PARTYNAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "PartyName" element
         */
        public oasisNamesTcCiqXnl3.PartyNameType addNewPartyName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.PartyNameType target = null;
                target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().add_element_user(PARTYNAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "PartyName" element
         */
        public void removePartyName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARTYNAME$0, i);
            }
        }
        
        /**
         * Gets array of all "Address" elements
         */
        public oasisNamesTcCiqXal3.AddressType[] getAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADDRESS$2, targetList);
                oasisNamesTcCiqXal3.AddressType[] result = new oasisNamesTcCiqXal3.AddressType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Address" element
         */
        public oasisNamesTcCiqXal3.AddressType getAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Address" element
         */
        public int sizeOfAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$2);
            }
        }
        
        /**
         * Sets array of all "Address" element
         */
        public void setAddressArray(oasisNamesTcCiqXal3.AddressType[] addressArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(addressArray, ADDRESS$2);
            }
        }
        
        /**
         * Sets ith "Address" element
         */
        public void setAddressArray(int i, oasisNamesTcCiqXal3.AddressType address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(address);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Address" element
         */
        public oasisNamesTcCiqXal3.AddressType insertNewAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().insert_element_user(ADDRESS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Address" element
         */
        public oasisNamesTcCiqXal3.AddressType addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXal3.AddressType target = null;
                target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Address" element
         */
        public void removeAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$2, i);
            }
        }
        
        /**
         * Gets the "RecordID" attribute
         */
        public java.lang.String getRecordID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RecordID" attribute
         */
        public oasisNamesTcCiqCt3.String xgetRecordID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(RECORDID$4);
                return target;
            }
        }
        
        /**
         * True if has "RecordID" attribute
         */
        public boolean isSetRecordID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RECORDID$4) != null;
            }
        }
        
        /**
         * Sets the "RecordID" attribute
         */
        public void setRecordID(java.lang.String recordID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDID$4);
                }
                target.setStringValue(recordID);
            }
        }
        
        /**
         * Sets (as xml) the "RecordID" attribute
         */
        public void xsetRecordID(oasisNamesTcCiqCt3.String recordID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(RECORDID$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(RECORDID$4);
                }
                target.set(recordID);
            }
        }
        
        /**
         * Unsets the "RecordID" attribute
         */
        public void unsetRecordID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RECORDID$4);
            }
        }
        
        /**
         * Gets the "RecordIDType" attribute
         */
        public java.lang.String getRecordIDType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDIDTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RecordIDType" attribute
         */
        public oasisNamesTcCiqXnal3.RecordIDTypeList xgetRecordIDType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnal3.RecordIDTypeList target = null;
                target = (oasisNamesTcCiqXnal3.RecordIDTypeList)get_store().find_attribute_user(RECORDIDTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "RecordIDType" attribute
         */
        public boolean isSetRecordIDType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RECORDIDTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "RecordIDType" attribute
         */
        public void setRecordIDType(java.lang.String recordIDType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDIDTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDIDTYPE$6);
                }
                target.setStringValue(recordIDType);
            }
        }
        
        /**
         * Sets (as xml) the "RecordIDType" attribute
         */
        public void xsetRecordIDType(oasisNamesTcCiqXnal3.RecordIDTypeList recordIDType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnal3.RecordIDTypeList target = null;
                target = (oasisNamesTcCiqXnal3.RecordIDTypeList)get_store().find_attribute_user(RECORDIDTYPE$6);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXnal3.RecordIDTypeList)get_store().add_attribute_user(RECORDIDTYPE$6);
                }
                target.set(recordIDType);
            }
        }
        
        /**
         * Unsets the "RecordIDType" attribute
         */
        public void unsetRecordIDType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RECORDIDTYPE$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
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
                target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$8);
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
                return get_store().find_attribute_user(STATUS$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$8);
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
                target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$8);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$8);
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
                get_store().remove_attribute(STATUS$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$10);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$10);
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
                return get_store().find_attribute_user(DATEVALIDFROM$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$10);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$10);
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
                get_store().remove_attribute(DATEVALIDFROM$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$12);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$12);
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
                return get_store().find_attribute_user(DATEVALIDTO$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$12);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$12);
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
                get_store().remove_attribute(DATEVALIDTO$12);
            }
        }
        
        /**
         * Gets the "RecordKey" attribute
         */
        public java.lang.String getRecordKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDKEY$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RecordKey" attribute
         */
        public oasisNamesTcCiqCt3.String xgetRecordKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(RECORDKEY$14);
                return target;
            }
        }
        
        /**
         * True if has "RecordKey" attribute
         */
        public boolean isSetRecordKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RECORDKEY$14) != null;
            }
        }
        
        /**
         * Sets the "RecordKey" attribute
         */
        public void setRecordKey(java.lang.String recordKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDKEY$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDKEY$14);
                }
                target.setStringValue(recordKey);
            }
        }
        
        /**
         * Sets (as xml) the "RecordKey" attribute
         */
        public void xsetRecordKey(oasisNamesTcCiqCt3.String recordKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(RECORDKEY$14);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(RECORDKEY$14);
                }
                target.set(recordKey);
            }
        }
        
        /**
         * Unsets the "RecordKey" attribute
         */
        public void unsetRecordKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RECORDKEY$14);
            }
        }
        
        /**
         * Gets the "RecordKeyRef" attribute
         */
        public java.lang.String getRecordKeyRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDKEYREF$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RecordKeyRef" attribute
         */
        public oasisNamesTcCiqCt3.String xgetRecordKeyRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(RECORDKEYREF$16);
                return target;
            }
        }
        
        /**
         * True if has "RecordKeyRef" attribute
         */
        public boolean isSetRecordKeyRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RECORDKEYREF$16) != null;
            }
        }
        
        /**
         * Sets the "RecordKeyRef" attribute
         */
        public void setRecordKeyRef(java.lang.String recordKeyRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECORDKEYREF$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECORDKEYREF$16);
                }
                target.setStringValue(recordKeyRef);
            }
        }
        
        /**
         * Sets (as xml) the "RecordKeyRef" attribute
         */
        public void xsetRecordKeyRef(oasisNamesTcCiqCt3.String recordKeyRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqCt3.String target = null;
                target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(RECORDKEYREF$16);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(RECORDKEYREF$16);
                }
                target.set(recordKeyRef);
            }
        }
        
        /**
         * Unsets the "RecordKeyRef" attribute
         */
        public void unsetRecordKeyRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RECORDKEYREF$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$18);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$18);
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
                return get_store().find_attribute_user(DATAQUALITYTYPE$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$18);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$18);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$18);
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
                get_store().remove_attribute(DATAQUALITYTYPE$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$20);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$20);
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
                return get_store().find_attribute_user(VALIDFROM$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$20);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$20);
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
                get_store().remove_attribute(VALIDFROM$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$22);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$22);
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
                return get_store().find_attribute_user(VALIDTO$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$22);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$22);
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
                get_store().remove_attribute(VALIDTO$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$24);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$24);
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
                return get_store().find_attribute_user(LANGUAGECODE$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$24);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANGUAGECODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANGUAGECODE$24);
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
                get_store().remove_attribute(LANGUAGECODE$24);
            }
        }
    }
}
