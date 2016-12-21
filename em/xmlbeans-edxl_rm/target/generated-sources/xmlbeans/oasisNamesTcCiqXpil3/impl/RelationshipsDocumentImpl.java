/*
 * An XML document type.
 * Localname: Relationships
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.RelationshipsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Relationships(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class RelationshipsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.RelationshipsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Relationships");
    
    
    /**
     * Gets the "Relationships" element
     */
    public oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships getRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships target = null;
            target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships)get_store().find_element_user(RELATIONSHIPS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships)get_store().find_element_user(RELATIONSHIPS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships)get_store().add_element_user(RELATIONSHIPS$0);
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
            target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships)get_store().add_element_user(RELATIONSHIPS$0);
            return target;
        }
    }
    /**
     * An XML Relationships(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class RelationshipsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships
    {
        private static final long serialVersionUID = 1L;
        
        public RelationshipsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RELATIONSHIP$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Relationship");
        
        
        /**
         * Gets array of all "Relationship" elements
         */
        public oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship[] getRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RELATIONSHIP$0, targetList);
                oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship[] result = new oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Relationship" element
         */
        public oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship getRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship target = null;
                target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship)get_store().find_element_user(RELATIONSHIP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Relationship" element
         */
        public int sizeOfRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATIONSHIP$0);
            }
        }
        
        /**
         * Sets array of all "Relationship" element
         */
        public void setRelationshipArray(oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship[] relationshipArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(relationshipArray, RELATIONSHIP$0);
            }
        }
        
        /**
         * Sets ith "Relationship" element
         */
        public void setRelationshipArray(int i, oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship relationship)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship target = null;
                target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship)get_store().find_element_user(RELATIONSHIP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(relationship);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Relationship" element
         */
        public oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship insertNewRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship target = null;
                target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship)get_store().insert_element_user(RELATIONSHIP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Relationship" element
         */
        public oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship addNewRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship target = null;
                target = (oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship)get_store().add_element_user(RELATIONSHIP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Relationship" element
         */
        public void removeRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATIONSHIP$0, i);
            }
        }
        /**
         * An XML Relationship(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class RelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.RelationshipsDocument.Relationships.Relationship
        {
            private static final long serialVersionUID = 1L;
            
            public RelationshipImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAMELINE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameLine");
            private static final javax.xml.namespace.QName PERSONNAME$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PersonName");
            private static final javax.xml.namespace.QName ORGANISATIONNAME$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "OrganisationName");
            private static final javax.xml.namespace.QName ADDRESSES$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Addresses");
            private static final javax.xml.namespace.QName CONTACTNUMBERS$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ContactNumbers");
            private static final javax.xml.namespace.QName ELECTRONICADDRESSIDENTIFIERS$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ElectronicAddressIdentifiers");
            private static final javax.xml.namespace.QName STATUS$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
            private static final javax.xml.namespace.QName PARTYTYPE$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "PartyType");
            private static final javax.xml.namespace.QName RELATIONSHIPWITHPERSON$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "RelationshipWithPerson");
            private static final javax.xml.namespace.QName RELATIONSHIPWITHORGANISATION$18 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "RelationshipWithOrganisation");
            private static final javax.xml.namespace.QName RELATIONSHIPVALIDFROM$20 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "RelationshipValidFrom");
            private static final javax.xml.namespace.QName RELATIONSHIPVALIDTO$22 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "RelationshipValidTo");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$24 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$26 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$28 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "NameLine" element
             */
            public oasisNamesTcCiqXnl3.NameLineDocument.NameLine getNameLine()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.NameLineDocument.NameLine target = null;
                    target = (oasisNamesTcCiqXnl3.NameLineDocument.NameLine)get_store().find_element_user(NAMELINE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "NameLine" element
             */
            public boolean isSetNameLine()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NAMELINE$0) != 0;
                }
            }
            
            /**
             * Sets the "NameLine" element
             */
            public void setNameLine(oasisNamesTcCiqXnl3.NameLineDocument.NameLine nameLine)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.NameLineDocument.NameLine target = null;
                    target = (oasisNamesTcCiqXnl3.NameLineDocument.NameLine)get_store().find_element_user(NAMELINE$0, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXnl3.NameLineDocument.NameLine)get_store().add_element_user(NAMELINE$0);
                    }
                    target.set(nameLine);
                }
            }
            
            /**
             * Appends and returns a new empty "NameLine" element
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
             * Unsets the "NameLine" element
             */
            public void unsetNameLine()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NAMELINE$0, 0);
                }
            }
            
            /**
             * Gets the "PersonName" element
             */
            public oasisNamesTcCiqXnl3.PersonNameType getPersonName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PersonNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PersonNameType)get_store().find_element_user(PERSONNAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "PersonName" element
             */
            public boolean isSetPersonName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PERSONNAME$2) != 0;
                }
            }
            
            /**
             * Sets the "PersonName" element
             */
            public void setPersonName(oasisNamesTcCiqXnl3.PersonNameType personName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PersonNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PersonNameType)get_store().find_element_user(PERSONNAME$2, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXnl3.PersonNameType)get_store().add_element_user(PERSONNAME$2);
                    }
                    target.set(personName);
                }
            }
            
            /**
             * Appends and returns a new empty "PersonName" element
             */
            public oasisNamesTcCiqXnl3.PersonNameType addNewPersonName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PersonNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PersonNameType)get_store().add_element_user(PERSONNAME$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "PersonName" element
             */
            public void unsetPersonName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PERSONNAME$2, 0);
                }
            }
            
            /**
             * Gets the "OrganisationName" element
             */
            public oasisNamesTcCiqXnl3.OrganisationNameType getOrganisationName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.OrganisationNameType target = null;
                    target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().find_element_user(ORGANISATIONNAME$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "OrganisationName" element
             */
            public boolean isSetOrganisationName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGANISATIONNAME$4) != 0;
                }
            }
            
            /**
             * Sets the "OrganisationName" element
             */
            public void setOrganisationName(oasisNamesTcCiqXnl3.OrganisationNameType organisationName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.OrganisationNameType target = null;
                    target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().find_element_user(ORGANISATIONNAME$4, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().add_element_user(ORGANISATIONNAME$4);
                    }
                    target.set(organisationName);
                }
            }
            
            /**
             * Appends and returns a new empty "OrganisationName" element
             */
            public oasisNamesTcCiqXnl3.OrganisationNameType addNewOrganisationName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.OrganisationNameType target = null;
                    target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().add_element_user(ORGANISATIONNAME$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "OrganisationName" element
             */
            public void unsetOrganisationName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGANISATIONNAME$4, 0);
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
                    target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().find_element_user(ADDRESSES$6, 0);
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
                    return get_store().count_elements(ADDRESSES$6) != 0;
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
                    target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().find_element_user(ADDRESSES$6, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().add_element_user(ADDRESSES$6);
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
                    target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().add_element_user(ADDRESSES$6);
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
                    get_store().remove_element(ADDRESSES$6, 0);
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
             * Gets the "ElectronicAddressIdentifiers" element
             */
            public oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers getElectronicAddressIdentifiers()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers target = null;
                    target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().find_element_user(ELECTRONICADDRESSIDENTIFIERS$10, 0);
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
                    return get_store().count_elements(ELECTRONICADDRESSIDENTIFIERS$10) != 0;
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
                    target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().find_element_user(ELECTRONICADDRESSIDENTIFIERS$10, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().add_element_user(ELECTRONICADDRESSIDENTIFIERS$10);
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
                    target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().add_element_user(ELECTRONICADDRESSIDENTIFIERS$10);
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
                    get_store().remove_element(ELECTRONICADDRESSIDENTIFIERS$10, 0);
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
             * Gets the "PartyType" attribute
             */
            public java.lang.String getPartyType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTYTYPE$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "PartyType" attribute
             */
            public oasisNamesTcCiqXpil3.PartyTypeList xgetPartyType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.PartyTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.PartyTypeList)get_store().find_attribute_user(PARTYTYPE$14);
                    return target;
                }
            }
            
            /**
             * True if has "PartyType" attribute
             */
            public boolean isSetPartyType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PARTYTYPE$14) != null;
                }
            }
            
            /**
             * Sets the "PartyType" attribute
             */
            public void setPartyType(java.lang.String partyType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTYTYPE$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTYTYPE$14);
                    }
                    target.setStringValue(partyType);
                }
            }
            
            /**
             * Sets (as xml) the "PartyType" attribute
             */
            public void xsetPartyType(oasisNamesTcCiqXpil3.PartyTypeList partyType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.PartyTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.PartyTypeList)get_store().find_attribute_user(PARTYTYPE$14);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.PartyTypeList)get_store().add_attribute_user(PARTYTYPE$14);
                    }
                    target.set(partyType);
                }
            }
            
            /**
             * Unsets the "PartyType" attribute
             */
            public void unsetPartyType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PARTYTYPE$14);
                }
            }
            
            /**
             * Gets the "RelationshipWithPerson" attribute
             */
            public java.lang.String getRelationshipWithPerson()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPWITHPERSON$16);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RelationshipWithPerson" attribute
             */
            public oasisNamesTcCiqXpil3.PersonRelationshipTypeList xgetRelationshipWithPerson()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.PersonRelationshipTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.PersonRelationshipTypeList)get_store().find_attribute_user(RELATIONSHIPWITHPERSON$16);
                    return target;
                }
            }
            
            /**
             * True if has "RelationshipWithPerson" attribute
             */
            public boolean isSetRelationshipWithPerson()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(RELATIONSHIPWITHPERSON$16) != null;
                }
            }
            
            /**
             * Sets the "RelationshipWithPerson" attribute
             */
            public void setRelationshipWithPerson(java.lang.String relationshipWithPerson)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPWITHPERSON$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONSHIPWITHPERSON$16);
                    }
                    target.setStringValue(relationshipWithPerson);
                }
            }
            
            /**
             * Sets (as xml) the "RelationshipWithPerson" attribute
             */
            public void xsetRelationshipWithPerson(oasisNamesTcCiqXpil3.PersonRelationshipTypeList relationshipWithPerson)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.PersonRelationshipTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.PersonRelationshipTypeList)get_store().find_attribute_user(RELATIONSHIPWITHPERSON$16);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.PersonRelationshipTypeList)get_store().add_attribute_user(RELATIONSHIPWITHPERSON$16);
                    }
                    target.set(relationshipWithPerson);
                }
            }
            
            /**
             * Unsets the "RelationshipWithPerson" attribute
             */
            public void unsetRelationshipWithPerson()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(RELATIONSHIPWITHPERSON$16);
                }
            }
            
            /**
             * Gets the "RelationshipWithOrganisation" attribute
             */
            public java.lang.String getRelationshipWithOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPWITHORGANISATION$18);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "RelationshipWithOrganisation" attribute
             */
            public oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList xgetRelationshipWithOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList)get_store().find_attribute_user(RELATIONSHIPWITHORGANISATION$18);
                    return target;
                }
            }
            
            /**
             * True if has "RelationshipWithOrganisation" attribute
             */
            public boolean isSetRelationshipWithOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(RELATIONSHIPWITHORGANISATION$18) != null;
                }
            }
            
            /**
             * Sets the "RelationshipWithOrganisation" attribute
             */
            public void setRelationshipWithOrganisation(java.lang.String relationshipWithOrganisation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPWITHORGANISATION$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONSHIPWITHORGANISATION$18);
                    }
                    target.setStringValue(relationshipWithOrganisation);
                }
            }
            
            /**
             * Sets (as xml) the "RelationshipWithOrganisation" attribute
             */
            public void xsetRelationshipWithOrganisation(oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList relationshipWithOrganisation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList)get_store().find_attribute_user(RELATIONSHIPWITHORGANISATION$18);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.OrganisationRelationshipTypeList)get_store().add_attribute_user(RELATIONSHIPWITHORGANISATION$18);
                    }
                    target.set(relationshipWithOrganisation);
                }
            }
            
            /**
             * Unsets the "RelationshipWithOrganisation" attribute
             */
            public void unsetRelationshipWithOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(RELATIONSHIPWITHORGANISATION$18);
                }
            }
            
            /**
             * Gets the "RelationshipValidFrom" attribute
             */
            public java.util.Calendar getRelationshipValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPVALIDFROM$20);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "RelationshipValidFrom" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetRelationshipValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(RELATIONSHIPVALIDFROM$20);
                    return target;
                }
            }
            
            /**
             * True if has "RelationshipValidFrom" attribute
             */
            public boolean isSetRelationshipValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(RELATIONSHIPVALIDFROM$20) != null;
                }
            }
            
            /**
             * Sets the "RelationshipValidFrom" attribute
             */
            public void setRelationshipValidFrom(java.util.Calendar relationshipValidFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPVALIDFROM$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONSHIPVALIDFROM$20);
                    }
                    target.setCalendarValue(relationshipValidFrom);
                }
            }
            
            /**
             * Sets (as xml) the "RelationshipValidFrom" attribute
             */
            public void xsetRelationshipValidFrom(org.apache.xmlbeans.XmlDateTime relationshipValidFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(RELATIONSHIPVALIDFROM$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(RELATIONSHIPVALIDFROM$20);
                    }
                    target.set(relationshipValidFrom);
                }
            }
            
            /**
             * Unsets the "RelationshipValidFrom" attribute
             */
            public void unsetRelationshipValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(RELATIONSHIPVALIDFROM$20);
                }
            }
            
            /**
             * Gets the "RelationshipValidTo" attribute
             */
            public java.util.Calendar getRelationshipValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPVALIDTO$22);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "RelationshipValidTo" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetRelationshipValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(RELATIONSHIPVALIDTO$22);
                    return target;
                }
            }
            
            /**
             * True if has "RelationshipValidTo" attribute
             */
            public boolean isSetRelationshipValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(RELATIONSHIPVALIDTO$22) != null;
                }
            }
            
            /**
             * Sets the "RelationshipValidTo" attribute
             */
            public void setRelationshipValidTo(java.util.Calendar relationshipValidTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPVALIDTO$22);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONSHIPVALIDTO$22);
                    }
                    target.setCalendarValue(relationshipValidTo);
                }
            }
            
            /**
             * Sets (as xml) the "RelationshipValidTo" attribute
             */
            public void xsetRelationshipValidTo(org.apache.xmlbeans.XmlDateTime relationshipValidTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(RELATIONSHIPVALIDTO$22);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(RELATIONSHIPVALIDTO$22);
                    }
                    target.set(relationshipValidTo);
                }
            }
            
            /**
             * Unsets the "RelationshipValidTo" attribute
             */
            public void unsetRelationshipValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(RELATIONSHIPVALIDTO$22);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$24);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$24);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$24) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$24);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$24);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$24);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$24);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$24);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$26);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$26);
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
                    return get_store().find_attribute_user(VALIDFROM$26) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$26);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$26);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$26);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$26);
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
                    get_store().remove_attribute(VALIDFROM$26);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$28);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$28);
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
                    return get_store().find_attribute_user(VALIDTO$28) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$28);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$28);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$28);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$28);
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
                    get_store().remove_attribute(VALIDTO$28);
                }
            }
        }
    }
}
