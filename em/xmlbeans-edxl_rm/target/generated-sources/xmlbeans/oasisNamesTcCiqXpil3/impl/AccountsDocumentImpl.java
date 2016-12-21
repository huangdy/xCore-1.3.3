/*
 * An XML document type.
 * Localname: Accounts
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.AccountsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Accounts(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class AccountsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.AccountsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccountsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCOUNTS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Accounts");
    
    
    /**
     * Gets the "Accounts" element
     */
    public oasisNamesTcCiqXpil3.AccountsDocument.Accounts getAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AccountsDocument.Accounts target = null;
            target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts)get_store().find_element_user(ACCOUNTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts)get_store().find_element_user(ACCOUNTS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts)get_store().add_element_user(ACCOUNTS$0);
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
            target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts)get_store().add_element_user(ACCOUNTS$0);
            return target;
        }
    }
    /**
     * An XML Accounts(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class AccountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.AccountsDocument.Accounts
    {
        private static final long serialVersionUID = 1L;
        
        public AccountsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACCOUNT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Account");
        
        
        /**
         * Gets array of all "Account" elements
         */
        public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account[] getAccountArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ACCOUNT$0, targetList);
                oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account[] result = new oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Account" element
         */
        public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account getAccountArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account target = null;
                target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account)get_store().find_element_user(ACCOUNT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Account" element
         */
        public int sizeOfAccountArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACCOUNT$0);
            }
        }
        
        /**
         * Sets array of all "Account" element
         */
        public void setAccountArray(oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account[] accountArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(accountArray, ACCOUNT$0);
            }
        }
        
        /**
         * Sets ith "Account" element
         */
        public void setAccountArray(int i, oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account account)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account target = null;
                target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account)get_store().find_element_user(ACCOUNT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(account);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Account" element
         */
        public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account insertNewAccount(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account target = null;
                target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account)get_store().insert_element_user(ACCOUNT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Account" element
         */
        public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account addNewAccount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account target = null;
                target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account)get_store().add_element_user(ACCOUNT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Account" element
         */
        public void removeAccount(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACCOUNT$0, i);
            }
        }
        /**
         * An XML Account(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class AccountImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account
        {
            private static final long serialVersionUID = 1L;
            
            public AccountImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ACCOUNTELEMENT$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "AccountElement");
            private static final javax.xml.namespace.QName ORGANISATION$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Organisation");
            private static final javax.xml.namespace.QName TYPE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName OWNERSHIPTYPE$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OwnershipType");
            private static final javax.xml.namespace.QName STATUS$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
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
             * Gets array of all "AccountElement" elements
             */
            public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement[] getAccountElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ACCOUNTELEMENT$0, targetList);
                    oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement[] result = new oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "AccountElement" element
             */
            public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement getAccountElementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement target = null;
                    target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement)get_store().find_element_user(ACCOUNTELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "AccountElement" element
             */
            public int sizeOfAccountElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ACCOUNTELEMENT$0);
                }
            }
            
            /**
             * Sets array of all "AccountElement" element
             */
            public void setAccountElementArray(oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement[] accountElementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(accountElementArray, ACCOUNTELEMENT$0);
                }
            }
            
            /**
             * Sets ith "AccountElement" element
             */
            public void setAccountElementArray(int i, oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement accountElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement target = null;
                    target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement)get_store().find_element_user(ACCOUNTELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(accountElement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "AccountElement" element
             */
            public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement insertNewAccountElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement target = null;
                    target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement)get_store().insert_element_user(ACCOUNTELEMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "AccountElement" element
             */
            public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement addNewAccountElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement target = null;
                    target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement)get_store().add_element_user(ACCOUNTELEMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "AccountElement" element
             */
            public void removeAccountElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ACCOUNTELEMENT$0, i);
                }
            }
            
            /**
             * Gets the "Organisation" element
             */
            public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation getOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation target = null;
                    target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation)get_store().find_element_user(ORGANISATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Organisation" element
             */
            public boolean isSetOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGANISATION$2) != 0;
                }
            }
            
            /**
             * Sets the "Organisation" element
             */
            public void setOrganisation(oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation organisation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation target = null;
                    target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation)get_store().find_element_user(ORGANISATION$2, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation)get_store().add_element_user(ORGANISATION$2);
                    }
                    target.set(organisation);
                }
            }
            
            /**
             * Appends and returns a new empty "Organisation" element
             */
            public oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation addNewOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation target = null;
                    target = (oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation)get_store().add_element_user(ORGANISATION$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "Organisation" element
             */
            public void unsetOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGANISATION$2, 0);
                }
            }
            
            /**
             * Gets the "Type" attribute
             */
            public java.lang.String getType()
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
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.AccountTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.AccountTypeList)get_store().find_attribute_user(TYPE$4);
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
            public void setType(java.lang.String type)
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
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXpil3.AccountTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.AccountTypeList)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.AccountTypeList)get_store().add_attribute_user(TYPE$4);
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
             * Gets the "OwnershipType" attribute
             */
            public java.util.Calendar getOwnershipType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERSHIPTYPE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "OwnershipType" attribute
             */
            public oasisNamesTcCiqXpil3.AccountOwnershipTypeList xgetOwnershipType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountOwnershipTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.AccountOwnershipTypeList)get_store().find_attribute_user(OWNERSHIPTYPE$6);
                    return target;
                }
            }
            
            /**
             * True if has "OwnershipType" attribute
             */
            public boolean isSetOwnershipType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(OWNERSHIPTYPE$6) != null;
                }
            }
            
            /**
             * Sets the "OwnershipType" attribute
             */
            public void setOwnershipType(java.util.Calendar ownershipType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERSHIPTYPE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNERSHIPTYPE$6);
                    }
                    target.setCalendarValue(ownershipType);
                }
            }
            
            /**
             * Sets (as xml) the "OwnershipType" attribute
             */
            public void xsetOwnershipType(oasisNamesTcCiqXpil3.AccountOwnershipTypeList ownershipType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.AccountOwnershipTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.AccountOwnershipTypeList)get_store().find_attribute_user(OWNERSHIPTYPE$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.AccountOwnershipTypeList)get_store().add_attribute_user(OWNERSHIPTYPE$6);
                    }
                    target.set(ownershipType);
                }
            }
            
            /**
             * Unsets the "OwnershipType" attribute
             */
            public void unsetOwnershipType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(OWNERSHIPTYPE$6);
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
             * An XML AccountElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.AccountsDocument$Accounts$Account$AccountElement.
             */
            public static class AccountElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.AccountElement
            {
                private static final long serialVersionUID = 1L;
                
                public AccountElementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected AccountElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName TYPE$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
                
                
                /**
                 * Gets the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.AccountElementList.Enum getType()
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
                      return (oasisNamesTcCiqXpil3.AccountElementList.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.AccountElementList xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.AccountElementList target = null;
                      target = (oasisNamesTcCiqXpil3.AccountElementList)get_store().find_attribute_user(TYPE$0);
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
                public void setType(oasisNamesTcCiqXpil3.AccountElementList.Enum type)
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
                public void xsetType(oasisNamesTcCiqXpil3.AccountElementList type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.AccountElementList target = null;
                      target = (oasisNamesTcCiqXpil3.AccountElementList)get_store().find_attribute_user(TYPE$0);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXpil3.AccountElementList)get_store().add_attribute_user(TYPE$0);
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
            /**
             * An XML Organisation(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is a complex type.
             */
            public static class OrganisationImpl extends oasisNamesTcCiqXnl3.impl.OrganisationNameTypeImpl implements oasisNamesTcCiqXpil3.AccountsDocument.Accounts.Account.Organisation
            {
                private static final long serialVersionUID = 1L;
                
                public OrganisationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
        }
    }
}
