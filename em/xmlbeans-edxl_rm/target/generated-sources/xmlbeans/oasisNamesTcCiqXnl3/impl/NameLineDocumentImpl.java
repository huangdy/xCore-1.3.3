/*
 * An XML document type.
 * Localname: NameLine
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.NameLineDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3.impl;
/**
 * A document containing one NameLine(@urn:oasis:names:tc:ciq:xnl:3) element.
 *
 * This is a complex type.
 */
public class NameLineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnl3.NameLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMELINE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "NameLine");
    
    
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
     * An XML NameLine(@urn:oasis:names:tc:ciq:xnl:3).
     *
     * This is an atomic type that is a restriction of oasisNamesTcCiqXnl3.NameLineDocument$NameLine.
     */
    public static class NameLineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXnl3.NameLineDocument.NameLine
    {
        private static final long serialVersionUID = 1L;
        
        public NameLineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected NameLineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "Type");
        private static final javax.xml.namespace.QName ABBREVIATION$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets the "Type" attribute
         */
        public java.lang.String getType()
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
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Type" attribute
         */
        public oasisNamesTcCiqXnl3.NameLineTypeList xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.NameLineTypeList target = null;
                target = (oasisNamesTcCiqXnl3.NameLineTypeList)get_store().find_attribute_user(TYPE$0);
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
        public void setType(java.lang.String type)
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
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "Type" attribute
         */
        public void xsetType(oasisNamesTcCiqXnl3.NameLineTypeList type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXnl3.NameLineTypeList target = null;
                target = (oasisNamesTcCiqXnl3.NameLineTypeList)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXnl3.NameLineTypeList)get_store().add_attribute_user(TYPE$0);
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
        
        /**
         * Gets the "DataQualityType" attribute
         */
        public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
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
                return get_store().find_attribute_user(DATAQUALITYTYPE$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$4);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$4);
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
                get_store().remove_attribute(DATAQUALITYTYPE$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
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
                return get_store().find_attribute_user(VALIDFROM$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
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
                get_store().remove_attribute(VALIDFROM$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
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
                return get_store().find_attribute_user(VALIDTO$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
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
                get_store().remove_attribute(VALIDTO$8);
            }
        }
    }
}
