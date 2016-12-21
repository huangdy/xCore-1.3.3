/*
 * An XML document type.
 * Localname: ElectronicAddressIdentifiers
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one ElectronicAddressIdentifiers(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class ElectronicAddressIdentifiersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument
{
    private static final long serialVersionUID = 1L;
    
    public ElectronicAddressIdentifiersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELECTRONICADDRESSIDENTIFIERS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ElectronicAddressIdentifiers");
    
    
    /**
     * Gets the "ElectronicAddressIdentifiers" element
     */
    public oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers getElectronicAddressIdentifiers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers target = null;
            target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().find_element_user(ELECTRONICADDRESSIDENTIFIERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().find_element_user(ELECTRONICADDRESSIDENTIFIERS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().add_element_user(ELECTRONICADDRESSIDENTIFIERS$0);
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
            target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers)get_store().add_element_user(ELECTRONICADDRESSIDENTIFIERS$0);
            return target;
        }
    }
    /**
     * An XML ElectronicAddressIdentifiers(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class ElectronicAddressIdentifiersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers
    {
        private static final long serialVersionUID = 1L;
        
        public ElectronicAddressIdentifiersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ELECTRONICADDRESSIDENTIFIER$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ElectronicAddressIdentifier");
        
        
        /**
         * Gets array of all "ElectronicAddressIdentifier" elements
         */
        public oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier[] getElectronicAddressIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ELECTRONICADDRESSIDENTIFIER$0, targetList);
                oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier[] result = new oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ElectronicAddressIdentifier" element
         */
        public oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier getElectronicAddressIdentifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier target = null;
                target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier)get_store().find_element_user(ELECTRONICADDRESSIDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ElectronicAddressIdentifier" element
         */
        public int sizeOfElectronicAddressIdentifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELECTRONICADDRESSIDENTIFIER$0);
            }
        }
        
        /**
         * Sets array of all "ElectronicAddressIdentifier" element
         */
        public void setElectronicAddressIdentifierArray(oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier[] electronicAddressIdentifierArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(electronicAddressIdentifierArray, ELECTRONICADDRESSIDENTIFIER$0);
            }
        }
        
        /**
         * Sets ith "ElectronicAddressIdentifier" element
         */
        public void setElectronicAddressIdentifierArray(int i, oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier electronicAddressIdentifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier target = null;
                target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier)get_store().find_element_user(ELECTRONICADDRESSIDENTIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(electronicAddressIdentifier);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ElectronicAddressIdentifier" element
         */
        public oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier insertNewElectronicAddressIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier target = null;
                target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier)get_store().insert_element_user(ELECTRONICADDRESSIDENTIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ElectronicAddressIdentifier" element
         */
        public oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier addNewElectronicAddressIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier target = null;
                target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier)get_store().add_element_user(ELECTRONICADDRESSIDENTIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ElectronicAddressIdentifier" element
         */
        public void removeElectronicAddressIdentifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELECTRONICADDRESSIDENTIFIER$0, i);
            }
        }
        /**
         * An XML ElectronicAddressIdentifier(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument$ElectronicAddressIdentifiers$ElectronicAddressIdentifier.
         */
        public static class ElectronicAddressIdentifierImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier
        {
            private static final long serialVersionUID = 1L;
            
            public ElectronicAddressIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected ElectronicAddressIdentifierImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName STATUS$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
            private static final javax.xml.namespace.QName USAGE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Usage");
            private static final javax.xml.namespace.QName LABEL$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Label");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList.Enum getType()
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
                    return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList)get_store().find_attribute_user(TYPE$0);
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
            public void setType(oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList.Enum type)
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
            public void xsetType(oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList)get_store().add_attribute_user(TYPE$0);
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
             * Gets the "Status" attribute
             */
            public java.lang.String getStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$2);
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
                    return get_store().find_attribute_user(STATUS$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$2);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$2);
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
                    get_store().remove_attribute(STATUS$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$4);
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
            public oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList xgetUsage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList target = null;
                    target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList)get_store().find_attribute_user(USAGE$4);
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
                    return get_store().find_attribute_user(USAGE$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$4);
                    }
                    target.setStringValue(usage);
                }
            }
            
            /**
             * Sets (as xml) the "Usage" attribute
             */
            public void xsetUsage(oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList usage)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList target = null;
                    target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList)get_store().find_attribute_user(USAGE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList)get_store().add_attribute_user(USAGE$4);
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
                    get_store().remove_attribute(USAGE$4);
                }
            }
            
            /**
             * Gets the "Label" attribute
             */
            public java.lang.String getLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Label" attribute
             */
            public oasisNamesTcCiqCt3.String xgetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(LABEL$6);
                    return target;
                }
            }
            
            /**
             * True if has "Label" attribute
             */
            public boolean isSetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LABEL$6) != null;
                }
            }
            
            /**
             * Sets the "Label" attribute
             */
            public void setLabel(java.lang.String label)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$6);
                    }
                    target.setStringValue(label);
                }
            }
            
            /**
             * Sets (as xml) the "Label" attribute
             */
            public void xsetLabel(oasisNamesTcCiqCt3.String label)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(LABEL$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(LABEL$6);
                    }
                    target.set(label);
                }
            }
            
            /**
             * Unsets the "Label" attribute
             */
            public void unsetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LABEL$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$8);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$8);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$8) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$8);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$8);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$8);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$8);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$10);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$10);
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
                    return get_store().find_attribute_user(VALIDFROM$10) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$10);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$10);
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
                    get_store().remove_attribute(VALIDFROM$10);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$12);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$12);
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
                    return get_store().find_attribute_user(VALIDTO$12) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$12);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$12);
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
                    get_store().remove_attribute(VALIDTO$12);
                }
            }
        }
    }
}
