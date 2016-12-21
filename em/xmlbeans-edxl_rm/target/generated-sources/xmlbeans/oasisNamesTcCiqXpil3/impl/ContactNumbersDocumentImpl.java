/*
 * An XML document type.
 * Localname: ContactNumbers
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.ContactNumbersDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one ContactNumbers(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class ContactNumbersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.ContactNumbersDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactNumbersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTNUMBERS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ContactNumbers");
    
    
    /**
     * Gets the "ContactNumbers" element
     */
    public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers getContactNumbers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers target = null;
            target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers)get_store().find_element_user(CONTACTNUMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers)get_store().find_element_user(CONTACTNUMBERS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers)get_store().add_element_user(CONTACTNUMBERS$0);
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
            target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers)get_store().add_element_user(CONTACTNUMBERS$0);
            return target;
        }
    }
    /**
     * An XML ContactNumbers(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class ContactNumbersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers
    {
        private static final long serialVersionUID = 1L;
        
        public ContactNumbersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTNUMBER$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ContactNumber");
        
        
        /**
         * Gets array of all "ContactNumber" elements
         */
        public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber[] getContactNumberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACTNUMBER$0, targetList);
                oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber[] result = new oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ContactNumber" element
         */
        public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber getContactNumberArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber target = null;
                target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber)get_store().find_element_user(CONTACTNUMBER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ContactNumber" element
         */
        public int sizeOfContactNumberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTNUMBER$0);
            }
        }
        
        /**
         * Sets array of all "ContactNumber" element
         */
        public void setContactNumberArray(oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber[] contactNumberArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactNumberArray, CONTACTNUMBER$0);
            }
        }
        
        /**
         * Sets ith "ContactNumber" element
         */
        public void setContactNumberArray(int i, oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber contactNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber target = null;
                target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber)get_store().find_element_user(CONTACTNUMBER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contactNumber);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ContactNumber" element
         */
        public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber insertNewContactNumber(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber target = null;
                target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber)get_store().insert_element_user(CONTACTNUMBER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ContactNumber" element
         */
        public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber addNewContactNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber target = null;
                target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber)get_store().add_element_user(CONTACTNUMBER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ContactNumber" element
         */
        public void removeContactNumber(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTNUMBER$0, i);
            }
        }
        /**
         * An XML ContactNumber(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class ContactNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber
        {
            private static final long serialVersionUID = 1L;
            
            public ContactNumberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CONTACTNUMBERELEMENT$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ContactNumberElement");
            private static final javax.xml.namespace.QName COMMUNICATIONMEDIATYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "CommunicationMediaType");
            private static final javax.xml.namespace.QName STATUS$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
            private static final javax.xml.namespace.QName USAGE$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Usage");
            private static final javax.xml.namespace.QName CONTACTHOURS$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ContactHours");
            private static final javax.xml.namespace.QName DATEVALIDFROM$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
            private static final javax.xml.namespace.QName DATEVALIDTO$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$18 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets array of all "ContactNumberElement" elements
             */
            public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement[] getContactNumberElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CONTACTNUMBERELEMENT$0, targetList);
                    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement[] result = new oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ContactNumberElement" element
             */
            public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement getContactNumberElementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement target = null;
                    target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement)get_store().find_element_user(CONTACTNUMBERELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ContactNumberElement" element
             */
            public int sizeOfContactNumberElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONTACTNUMBERELEMENT$0);
                }
            }
            
            /**
             * Sets array of all "ContactNumberElement" element
             */
            public void setContactNumberElementArray(oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement[] contactNumberElementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(contactNumberElementArray, CONTACTNUMBERELEMENT$0);
                }
            }
            
            /**
             * Sets ith "ContactNumberElement" element
             */
            public void setContactNumberElementArray(int i, oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement contactNumberElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement target = null;
                    target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement)get_store().find_element_user(CONTACTNUMBERELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(contactNumberElement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ContactNumberElement" element
             */
            public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement insertNewContactNumberElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement target = null;
                    target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement)get_store().insert_element_user(CONTACTNUMBERELEMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ContactNumberElement" element
             */
            public oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement addNewContactNumberElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement target = null;
                    target = (oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement)get_store().add_element_user(CONTACTNUMBERELEMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ContactNumberElement" element
             */
            public void removeContactNumberElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONTACTNUMBERELEMENT$0, i);
                }
            }
            
            /**
             * Gets the "CommunicationMediaType" attribute
             */
            public oasisNamesTcCiqXpil3.CommunicationMediaTypeList.Enum getCommunicationMediaType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMUNICATIONMEDIATYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXpil3.CommunicationMediaTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "CommunicationMediaType" attribute
             */
            public oasisNamesTcCiqXpil3.CommunicationMediaTypeList xgetCommunicationMediaType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.CommunicationMediaTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.CommunicationMediaTypeList)get_store().find_attribute_user(COMMUNICATIONMEDIATYPE$2);
                    return target;
                }
            }
            
            /**
             * True if has "CommunicationMediaType" attribute
             */
            public boolean isSetCommunicationMediaType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(COMMUNICATIONMEDIATYPE$2) != null;
                }
            }
            
            /**
             * Sets the "CommunicationMediaType" attribute
             */
            public void setCommunicationMediaType(oasisNamesTcCiqXpil3.CommunicationMediaTypeList.Enum communicationMediaType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMMUNICATIONMEDIATYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMMUNICATIONMEDIATYPE$2);
                    }
                    target.setEnumValue(communicationMediaType);
                }
            }
            
            /**
             * Sets (as xml) the "CommunicationMediaType" attribute
             */
            public void xsetCommunicationMediaType(oasisNamesTcCiqXpil3.CommunicationMediaTypeList communicationMediaType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.CommunicationMediaTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.CommunicationMediaTypeList)get_store().find_attribute_user(COMMUNICATIONMEDIATYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.CommunicationMediaTypeList)get_store().add_attribute_user(COMMUNICATIONMEDIATYPE$2);
                    }
                    target.set(communicationMediaType);
                }
            }
            
            /**
             * Unsets the "CommunicationMediaType" attribute
             */
            public void unsetCommunicationMediaType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(COMMUNICATIONMEDIATYPE$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$4);
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
                    return get_store().find_attribute_user(STATUS$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$4);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$4);
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
                    get_store().remove_attribute(STATUS$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$6);
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
            public oasisNamesTcCiqXpil3.ContactNumberUsageList xgetUsage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ContactNumberUsageList target = null;
                    target = (oasisNamesTcCiqXpil3.ContactNumberUsageList)get_store().find_attribute_user(USAGE$6);
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
                    return get_store().find_attribute_user(USAGE$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$6);
                    }
                    target.setStringValue(usage);
                }
            }
            
            /**
             * Sets (as xml) the "Usage" attribute
             */
            public void xsetUsage(oasisNamesTcCiqXpil3.ContactNumberUsageList usage)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ContactNumberUsageList target = null;
                    target = (oasisNamesTcCiqXpil3.ContactNumberUsageList)get_store().find_attribute_user(USAGE$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.ContactNumberUsageList)get_store().add_attribute_user(USAGE$6);
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
                    get_store().remove_attribute(USAGE$6);
                }
            }
            
            /**
             * Gets the "ContactHours" attribute
             */
            public java.lang.String getContactHours()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTACTHOURS$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ContactHours" attribute
             */
            public oasisNamesTcCiqCt3.String xgetContactHours()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(CONTACTHOURS$8);
                    return target;
                }
            }
            
            /**
             * True if has "ContactHours" attribute
             */
            public boolean isSetContactHours()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CONTACTHOURS$8) != null;
                }
            }
            
            /**
             * Sets the "ContactHours" attribute
             */
            public void setContactHours(java.lang.String contactHours)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTACTHOURS$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTACTHOURS$8);
                    }
                    target.setStringValue(contactHours);
                }
            }
            
            /**
             * Sets (as xml) the "ContactHours" attribute
             */
            public void xsetContactHours(oasisNamesTcCiqCt3.String contactHours)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(CONTACTHOURS$8);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(CONTACTHOURS$8);
                    }
                    target.set(contactHours);
                }
            }
            
            /**
             * Unsets the "ContactHours" attribute
             */
            public void unsetContactHours()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CONTACTHOURS$8);
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
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$14);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$14);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$14) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$14);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$14);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$14);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$14);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$16);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$16);
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
                    return get_store().find_attribute_user(VALIDFROM$16) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$16);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$16);
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
                    get_store().remove_attribute(VALIDFROM$16);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$18);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$18);
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
                    return get_store().find_attribute_user(VALIDTO$18) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$18);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$18);
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
                    get_store().remove_attribute(VALIDTO$18);
                }
            }
            /**
             * An XML ContactNumberElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.ContactNumbersDocument$ContactNumbers$ContactNumber$ContactNumberElement.
             */
            public static class ContactNumberElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.ContactNumbersDocument.ContactNumbers.ContactNumber.ContactNumberElement
            {
                private static final long serialVersionUID = 1L;
                
                public ContactNumberElementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected ContactNumberElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName TYPE$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
                
                
                /**
                 * Gets the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.ContactNumberElementList.Enum getType()
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
                      return (oasisNamesTcCiqXpil3.ContactNumberElementList.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.ContactNumberElementList xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.ContactNumberElementList target = null;
                      target = (oasisNamesTcCiqXpil3.ContactNumberElementList)get_store().find_attribute_user(TYPE$0);
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
                public void setType(oasisNamesTcCiqXpil3.ContactNumberElementList.Enum type)
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
                public void xsetType(oasisNamesTcCiqXpil3.ContactNumberElementList type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.ContactNumberElementList target = null;
                      target = (oasisNamesTcCiqXpil3.ContactNumberElementList)get_store().find_attribute_user(TYPE$0);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXpil3.ContactNumberElementList)get_store().add_attribute_user(TYPE$0);
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
            }
        }
    }
}
