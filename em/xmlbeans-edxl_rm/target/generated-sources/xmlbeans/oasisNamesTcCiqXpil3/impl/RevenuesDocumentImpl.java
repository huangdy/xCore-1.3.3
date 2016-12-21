/*
 * An XML document type.
 * Localname: Revenues
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.RevenuesDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Revenues(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class RevenuesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.RevenuesDocument
{
    private static final long serialVersionUID = 1L;
    
    public RevenuesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REVENUES$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Revenues");
    
    
    /**
     * Gets the "Revenues" element
     */
    public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues getRevenues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RevenuesDocument.Revenues target = null;
            target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues)get_store().find_element_user(REVENUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Revenues" element
     */
    public void setRevenues(oasisNamesTcCiqXpil3.RevenuesDocument.Revenues revenues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RevenuesDocument.Revenues target = null;
            target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues)get_store().find_element_user(REVENUES$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues)get_store().add_element_user(REVENUES$0);
            }
            target.set(revenues);
        }
    }
    
    /**
     * Appends and returns a new empty "Revenues" element
     */
    public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues addNewRevenues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.RevenuesDocument.Revenues target = null;
            target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues)get_store().add_element_user(REVENUES$0);
            return target;
        }
    }
    /**
     * An XML Revenues(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class RevenuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.RevenuesDocument.Revenues
    {
        private static final long serialVersionUID = 1L;
        
        public RevenuesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REVENUE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Revenue");
        
        
        /**
         * Gets array of all "Revenue" elements
         */
        public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue[] getRevenueArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REVENUE$0, targetList);
                oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue[] result = new oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Revenue" element
         */
        public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue getRevenueArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue target = null;
                target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue)get_store().find_element_user(REVENUE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Revenue" element
         */
        public int sizeOfRevenueArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REVENUE$0);
            }
        }
        
        /**
         * Sets array of all "Revenue" element
         */
        public void setRevenueArray(oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue[] revenueArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(revenueArray, REVENUE$0);
            }
        }
        
        /**
         * Sets ith "Revenue" element
         */
        public void setRevenueArray(int i, oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue revenue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue target = null;
                target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue)get_store().find_element_user(REVENUE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(revenue);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Revenue" element
         */
        public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue insertNewRevenue(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue target = null;
                target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue)get_store().insert_element_user(REVENUE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Revenue" element
         */
        public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue addNewRevenue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue target = null;
                target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue)get_store().add_element_user(REVENUE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Revenue" element
         */
        public void removeRevenue(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REVENUE$0, i);
            }
        }
        /**
         * An XML Revenue(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.RevenuesDocument$Revenues$Revenue.
         */
        public static class RevenueImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue
        {
            private static final long serialVersionUID = 1L;
            
            public RevenueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected RevenueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName CURRENCYCODE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "CurrencyCode");
            private static final javax.xml.namespace.QName STATUS$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
            private static final javax.xml.namespace.QName PERIODFROM$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "PeriodFrom");
            private static final javax.xml.namespace.QName PERIODTO$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "PeriodTo");
            private static final javax.xml.namespace.QName TYPE$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName PRECISION$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Precision");
            private static final javax.xml.namespace.QName SOURCE$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Source");
            private static final javax.xml.namespace.QName COUNTRYNAME$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "CountryName");
            private static final javax.xml.namespace.QName AFTERTAX$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "AfterTax");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$18 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$20 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$22 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "CurrencyCode" attribute
             */
            public java.lang.String getCurrencyCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCYCODE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "CurrencyCode" attribute
             */
            public oasisNamesTcCiqXpil3.RevenueCurrencyCodeList xgetCurrencyCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.RevenueCurrencyCodeList target = null;
                    target = (oasisNamesTcCiqXpil3.RevenueCurrencyCodeList)get_store().find_attribute_user(CURRENCYCODE$0);
                    return target;
                }
            }
            
            /**
             * True if has "CurrencyCode" attribute
             */
            public boolean isSetCurrencyCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CURRENCYCODE$0) != null;
                }
            }
            
            /**
             * Sets the "CurrencyCode" attribute
             */
            public void setCurrencyCode(java.lang.String currencyCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCYCODE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCYCODE$0);
                    }
                    target.setStringValue(currencyCode);
                }
            }
            
            /**
             * Sets (as xml) the "CurrencyCode" attribute
             */
            public void xsetCurrencyCode(oasisNamesTcCiqXpil3.RevenueCurrencyCodeList currencyCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.RevenueCurrencyCodeList target = null;
                    target = (oasisNamesTcCiqXpil3.RevenueCurrencyCodeList)get_store().find_attribute_user(CURRENCYCODE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.RevenueCurrencyCodeList)get_store().add_attribute_user(CURRENCYCODE$0);
                    }
                    target.set(currencyCode);
                }
            }
            
            /**
             * Unsets the "CurrencyCode" attribute
             */
            public void unsetCurrencyCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CURRENCYCODE$0);
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
             * Gets the "PeriodFrom" attribute
             */
            public java.util.Calendar getPeriodFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIODFROM$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "PeriodFrom" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetPeriodFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PERIODFROM$4);
                    return target;
                }
            }
            
            /**
             * True if has "PeriodFrom" attribute
             */
            public boolean isSetPeriodFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PERIODFROM$4) != null;
                }
            }
            
            /**
             * Sets the "PeriodFrom" attribute
             */
            public void setPeriodFrom(java.util.Calendar periodFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIODFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIODFROM$4);
                    }
                    target.setCalendarValue(periodFrom);
                }
            }
            
            /**
             * Sets (as xml) the "PeriodFrom" attribute
             */
            public void xsetPeriodFrom(org.apache.xmlbeans.XmlDateTime periodFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PERIODFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PERIODFROM$4);
                    }
                    target.set(periodFrom);
                }
            }
            
            /**
             * Unsets the "PeriodFrom" attribute
             */
            public void unsetPeriodFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PERIODFROM$4);
                }
            }
            
            /**
             * Gets the "PeriodTo" attribute
             */
            public java.util.Calendar getPeriodTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIODTO$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "PeriodTo" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetPeriodTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PERIODTO$6);
                    return target;
                }
            }
            
            /**
             * True if has "PeriodTo" attribute
             */
            public boolean isSetPeriodTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PERIODTO$6) != null;
                }
            }
            
            /**
             * Sets the "PeriodTo" attribute
             */
            public void setPeriodTo(java.util.Calendar periodTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIODTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIODTO$6);
                    }
                    target.setCalendarValue(periodTo);
                }
            }
            
            /**
             * Sets (as xml) the "PeriodTo" attribute
             */
            public void xsetPeriodTo(org.apache.xmlbeans.XmlDateTime periodTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(PERIODTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(PERIODTO$6);
                    }
                    target.set(periodTo);
                }
            }
            
            /**
             * Unsets the "PeriodTo" attribute
             */
            public void unsetPeriodTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PERIODTO$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
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
            public oasisNamesTcCiqXpil3.RevenueTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.RevenueTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.RevenueTypeList)get_store().find_attribute_user(TYPE$8);
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
                    return get_store().find_attribute_user(TYPE$8) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
                    }
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXpil3.RevenueTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.RevenueTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.RevenueTypeList)get_store().find_attribute_user(TYPE$8);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.RevenueTypeList)get_store().add_attribute_user(TYPE$8);
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
                    get_store().remove_attribute(TYPE$8);
                }
            }
            
            /**
             * Gets the "Precision" attribute
             */
            public java.math.BigDecimal getPrecision()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRECISION$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigDecimalValue();
                }
            }
            
            /**
             * Gets (as xml) the "Precision" attribute
             */
            public oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision xgetPrecision()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision target = null;
                    target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision)get_store().find_attribute_user(PRECISION$10);
                    return target;
                }
            }
            
            /**
             * True if has "Precision" attribute
             */
            public boolean isSetPrecision()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PRECISION$10) != null;
                }
            }
            
            /**
             * Sets the "Precision" attribute
             */
            public void setPrecision(java.math.BigDecimal precision)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRECISION$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRECISION$10);
                    }
                    target.setBigDecimalValue(precision);
                }
            }
            
            /**
             * Sets (as xml) the "Precision" attribute
             */
            public void xsetPrecision(oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision precision)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision target = null;
                    target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision)get_store().find_attribute_user(PRECISION$10);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision)get_store().add_attribute_user(PRECISION$10);
                    }
                    target.set(precision);
                }
            }
            
            /**
             * Unsets the "Precision" attribute
             */
            public void unsetPrecision()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PRECISION$10);
                }
            }
            
            /**
             * Gets the "Source" attribute
             */
            public java.lang.String getSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Source" attribute
             */
            public oasisNamesTcCiqXpil3.RevenueSourceList xgetSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.RevenueSourceList target = null;
                    target = (oasisNamesTcCiqXpil3.RevenueSourceList)get_store().find_attribute_user(SOURCE$12);
                    return target;
                }
            }
            
            /**
             * True if has "Source" attribute
             */
            public boolean isSetSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(SOURCE$12) != null;
                }
            }
            
            /**
             * Sets the "Source" attribute
             */
            public void setSource(java.lang.String source)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$12);
                    }
                    target.setStringValue(source);
                }
            }
            
            /**
             * Sets (as xml) the "Source" attribute
             */
            public void xsetSource(oasisNamesTcCiqXpil3.RevenueSourceList source)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.RevenueSourceList target = null;
                    target = (oasisNamesTcCiqXpil3.RevenueSourceList)get_store().find_attribute_user(SOURCE$12);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.RevenueSourceList)get_store().add_attribute_user(SOURCE$12);
                    }
                    target.set(source);
                }
            }
            
            /**
             * Unsets the "Source" attribute
             */
            public void unsetSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(SOURCE$12);
                }
            }
            
            /**
             * Gets the "CountryName" attribute
             */
            public java.lang.String getCountryName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYNAME$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "CountryName" attribute
             */
            public oasisNamesTcCiqCt3.String xgetCountryName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(COUNTRYNAME$14);
                    return target;
                }
            }
            
            /**
             * True if has "CountryName" attribute
             */
            public boolean isSetCountryName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(COUNTRYNAME$14) != null;
                }
            }
            
            /**
             * Sets the "CountryName" attribute
             */
            public void setCountryName(java.lang.String countryName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYNAME$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRYNAME$14);
                    }
                    target.setStringValue(countryName);
                }
            }
            
            /**
             * Sets (as xml) the "CountryName" attribute
             */
            public void xsetCountryName(oasisNamesTcCiqCt3.String countryName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(COUNTRYNAME$14);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(COUNTRYNAME$14);
                    }
                    target.set(countryName);
                }
            }
            
            /**
             * Unsets the "CountryName" attribute
             */
            public void unsetCountryName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(COUNTRYNAME$14);
                }
            }
            
            /**
             * Gets the "AfterTax" attribute
             */
            public boolean getAfterTax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTERTAX$16);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "AfterTax" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetAfterTax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AFTERTAX$16);
                    return target;
                }
            }
            
            /**
             * True if has "AfterTax" attribute
             */
            public boolean isSetAfterTax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(AFTERTAX$16) != null;
                }
            }
            
            /**
             * Sets the "AfterTax" attribute
             */
            public void setAfterTax(boolean afterTax)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AFTERTAX$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AFTERTAX$16);
                    }
                    target.setBooleanValue(afterTax);
                }
            }
            
            /**
             * Sets (as xml) the "AfterTax" attribute
             */
            public void xsetAfterTax(org.apache.xmlbeans.XmlBoolean afterTax)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(AFTERTAX$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(AFTERTAX$16);
                    }
                    target.set(afterTax);
                }
            }
            
            /**
             * Unsets the "AfterTax" attribute
             */
            public void unsetAfterTax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(AFTERTAX$16);
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
             * An XML Precision(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.RevenuesDocument$Revenues$Revenue$Precision.
             */
            public static class PrecisionImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements oasisNamesTcCiqXpil3.RevenuesDocument.Revenues.Revenue.Precision
            {
                private static final long serialVersionUID = 1L;
                
                public PrecisionImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected PrecisionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
