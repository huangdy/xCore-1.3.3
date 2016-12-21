/*
 * An XML document type.
 * Localname: Identifiers
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.IdentifiersDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Identifiers(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class IdentifiersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.IdentifiersDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIERS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Identifiers");
    
    
    /**
     * Gets the "Identifiers" element
     */
    public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers getIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers target = null;
            target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers)get_store().find_element_user(IDENTIFIERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers)get_store().find_element_user(IDENTIFIERS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers)get_store().add_element_user(IDENTIFIERS$0);
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
            target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers)get_store().add_element_user(IDENTIFIERS$0);
            return target;
        }
    }
    /**
     * An XML Identifiers(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class IdentifiersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers
    {
        private static final long serialVersionUID = 1L;
        
        public IdentifiersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Identifier");
        
        
        /**
         * Gets array of all "Identifier" elements
         */
        public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier[] getIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IDENTIFIER$0, targetList);
                oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier[] result = new oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Identifier" element
         */
        public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier getIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier target = null;
                target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Identifier" element
         */
        public int sizeOfIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "Identifier" element
         */
        public void setIdentifierArray(oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier[] identifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(identifierArray, IDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "Identifier" element
         */
        public void setIdentifierArray(int i, oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier target = null;
                target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(identifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier insertNewIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier target = null;
                target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier)get_store().insert_element_user(IDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier addNewIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier target = null;
                target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier)get_store().add_element_user(IDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Identifier" element
         */
        public void removeIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$0, i);
            }
        }
        /**
         * An XML Identifier(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class IdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier
        {
            private static final long serialVersionUID = 1L;
            
            public IdentifierImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName IDENTIFIERELEMENT$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "IdentifierElement");
            private static final javax.xml.namespace.QName ISSUERNAME$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "IssuerName");
            private static final javax.xml.namespace.QName TYPE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName STATUS$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
            private static final javax.xml.namespace.QName DATEVALIDFROM$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
            private static final javax.xml.namespace.QName DATEVALIDTO$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets array of all "IdentifierElement" elements
             */
            public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement[] getIdentifierElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(IDENTIFIERELEMENT$0, targetList);
                    oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement[] result = new oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "IdentifierElement" element
             */
            public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement getIdentifierElementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement target = null;
                    target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement)get_store().find_element_user(IDENTIFIERELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "IdentifierElement" element
             */
            public int sizeOfIdentifierElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(IDENTIFIERELEMENT$0);
                }
            }
            
            /**
             * Sets array of all "IdentifierElement" element
             */
            public void setIdentifierElementArray(oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement[] identifierElementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(identifierElementArray, IDENTIFIERELEMENT$0);
                }
            }
            
            /**
             * Sets ith "IdentifierElement" element
             */
            public void setIdentifierElementArray(int i, oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement identifierElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement target = null;
                    target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement)get_store().find_element_user(IDENTIFIERELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(identifierElement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "IdentifierElement" element
             */
            public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement insertNewIdentifierElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement target = null;
                    target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement)get_store().insert_element_user(IDENTIFIERELEMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "IdentifierElement" element
             */
            public oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement addNewIdentifierElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement target = null;
                    target = (oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement)get_store().add_element_user(IDENTIFIERELEMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "IdentifierElement" element
             */
            public void removeIdentifierElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(IDENTIFIERELEMENT$0, i);
                }
            }
            
            /**
             * Gets the "IssuerName" element
             */
            public oasisNamesTcCiqXnl3.OrganisationNameType getIssuerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.OrganisationNameType target = null;
                    target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().find_element_user(ISSUERNAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "IssuerName" element
             */
            public boolean isSetIssuerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ISSUERNAME$2) != 0;
                }
            }
            
            /**
             * Sets the "IssuerName" element
             */
            public void setIssuerName(oasisNamesTcCiqXnl3.OrganisationNameType issuerName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.OrganisationNameType target = null;
                    target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().find_element_user(ISSUERNAME$2, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().add_element_user(ISSUERNAME$2);
                    }
                    target.set(issuerName);
                }
            }
            
            /**
             * Appends and returns a new empty "IssuerName" element
             */
            public oasisNamesTcCiqXnl3.OrganisationNameType addNewIssuerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.OrganisationNameType target = null;
                    target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().add_element_user(ISSUERNAME$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "IssuerName" element
             */
            public void unsetIssuerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ISSUERNAME$2, 0);
                }
            }
            
            /**
             * Gets the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.PartyIdentifierTypeList.Enum getType()
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
                    return (oasisNamesTcCiqXpil3.PartyIdentifierTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.PartyIdentifierTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.PartyIdentifierTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.PartyIdentifierTypeList)get_store().find_attribute_user(TYPE$4);
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
            public void setType(oasisNamesTcCiqXpil3.PartyIdentifierTypeList.Enum type)
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
            public void xsetType(oasisNamesTcCiqXpil3.PartyIdentifierTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.PartyIdentifierTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.PartyIdentifierTypeList)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.PartyIdentifierTypeList)get_store().add_attribute_user(TYPE$4);
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
             * Gets the "Status" attribute
             */
            public java.lang.String getStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$6);
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
                    return get_store().find_attribute_user(STATUS$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$6);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$6);
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
                    get_store().remove_attribute(STATUS$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$8);
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
                    return get_store().find_attribute_user(DATEVALIDFROM$8) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$8);
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
                    get_store().remove_attribute(DATEVALIDFROM$8);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$10);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$10);
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
                    return get_store().find_attribute_user(DATEVALIDTO$10) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$10);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$10);
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
                    get_store().remove_attribute(DATEVALIDTO$10);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$12);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$12);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$12) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$12);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$12);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$12);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$12);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$14);
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
                    return get_store().find_attribute_user(VALIDFROM$14) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$14);
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
                    get_store().remove_attribute(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$16);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$16);
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
                    return get_store().find_attribute_user(VALIDTO$16) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$16);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$16);
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
                    get_store().remove_attribute(VALIDTO$16);
                }
            }
            /**
             * An XML IdentifierElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.IdentifiersDocument$Identifiers$Identifier$IdentifierElement.
             */
            public static class IdentifierElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.IdentifiersDocument.Identifiers.Identifier.IdentifierElement
            {
                private static final long serialVersionUID = 1L;
                
                public IdentifierElementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected IdentifierElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName TYPE$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
                
                
                /**
                 * Gets the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.PartyIdentifierElementList.Enum getType()
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
                      return (oasisNamesTcCiqXpil3.PartyIdentifierElementList.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.PartyIdentifierElementList xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.PartyIdentifierElementList target = null;
                      target = (oasisNamesTcCiqXpil3.PartyIdentifierElementList)get_store().find_attribute_user(TYPE$0);
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
                public void setType(oasisNamesTcCiqXpil3.PartyIdentifierElementList.Enum type)
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
                public void xsetType(oasisNamesTcCiqXpil3.PartyIdentifierElementList type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.PartyIdentifierElementList target = null;
                      target = (oasisNamesTcCiqXpil3.PartyIdentifierElementList)get_store().find_attribute_user(TYPE$0);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXpil3.PartyIdentifierElementList)get_store().add_attribute_user(TYPE$0);
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
