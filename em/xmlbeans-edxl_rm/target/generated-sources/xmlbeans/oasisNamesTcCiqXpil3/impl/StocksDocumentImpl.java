/*
 * An XML document type.
 * Localname: Stocks
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.StocksDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Stocks(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class StocksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.StocksDocument
{
    private static final long serialVersionUID = 1L;
    
    public StocksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOCKS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Stocks");
    
    
    /**
     * Gets the "Stocks" element
     */
    public oasisNamesTcCiqXpil3.StocksDocument.Stocks getStocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.StocksDocument.Stocks target = null;
            target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks)get_store().find_element_user(STOCKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Stocks" element
     */
    public void setStocks(oasisNamesTcCiqXpil3.StocksDocument.Stocks stocks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.StocksDocument.Stocks target = null;
            target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks)get_store().find_element_user(STOCKS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks)get_store().add_element_user(STOCKS$0);
            }
            target.set(stocks);
        }
    }
    
    /**
     * Appends and returns a new empty "Stocks" element
     */
    public oasisNamesTcCiqXpil3.StocksDocument.Stocks addNewStocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.StocksDocument.Stocks target = null;
            target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks)get_store().add_element_user(STOCKS$0);
            return target;
        }
    }
    /**
     * An XML Stocks(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class StocksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.StocksDocument.Stocks
    {
        private static final long serialVersionUID = 1L;
        
        public StocksImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STOCK$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Stock");
        
        
        /**
         * Gets array of all "Stock" elements
         */
        public oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock[] getStockArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STOCK$0, targetList);
                oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock[] result = new oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Stock" element
         */
        public oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock getStockArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock target = null;
                target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock)get_store().find_element_user(STOCK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Stock" element
         */
        public int sizeOfStockArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STOCK$0);
            }
        }
        
        /**
         * Sets array of all "Stock" element
         */
        public void setStockArray(oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock[] stockArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stockArray, STOCK$0);
            }
        }
        
        /**
         * Sets ith "Stock" element
         */
        public void setStockArray(int i, oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock stock)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock target = null;
                target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock)get_store().find_element_user(STOCK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(stock);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Stock" element
         */
        public oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock insertNewStock(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock target = null;
                target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock)get_store().insert_element_user(STOCK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Stock" element
         */
        public oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock addNewStock()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock target = null;
                target = (oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock)get_store().add_element_user(STOCK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Stock" element
         */
        public void removeStock(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STOCK$0, i);
            }
        }
        /**
         * An XML Stock(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class StockImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.StocksDocument.Stocks.Stock
        {
            private static final long serialVersionUID = 1L;
            
            public StockImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LISTEDCODE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ListedCode");
            private static final javax.xml.namespace.QName MARKETNAME$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "MarketName");
            private static final javax.xml.namespace.QName COUNTRYNAME$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "CountryName");
            private static final javax.xml.namespace.QName INVESTEDDATE$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "InvestedDate");
            private static final javax.xml.namespace.QName SHAREQUANTITY$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ShareQuantity");
            private static final javax.xml.namespace.QName LISTEDDATE$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "ListedDate");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "ListedCode" attribute
             */
            public java.lang.String getListedCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTEDCODE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ListedCode" attribute
             */
            public oasisNamesTcCiqCt3.String xgetListedCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(LISTEDCODE$0);
                    return target;
                }
            }
            
            /**
             * True if has "ListedCode" attribute
             */
            public boolean isSetListedCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LISTEDCODE$0) != null;
                }
            }
            
            /**
             * Sets the "ListedCode" attribute
             */
            public void setListedCode(java.lang.String listedCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTEDCODE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTEDCODE$0);
                    }
                    target.setStringValue(listedCode);
                }
            }
            
            /**
             * Sets (as xml) the "ListedCode" attribute
             */
            public void xsetListedCode(oasisNamesTcCiqCt3.String listedCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(LISTEDCODE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(LISTEDCODE$0);
                    }
                    target.set(listedCode);
                }
            }
            
            /**
             * Unsets the "ListedCode" attribute
             */
            public void unsetListedCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LISTEDCODE$0);
                }
            }
            
            /**
             * Gets the "MarketName" attribute
             */
            public java.lang.String getMarketName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARKETNAME$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "MarketName" attribute
             */
            public oasisNamesTcCiqCt3.String xgetMarketName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(MARKETNAME$2);
                    return target;
                }
            }
            
            /**
             * True if has "MarketName" attribute
             */
            public boolean isSetMarketName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(MARKETNAME$2) != null;
                }
            }
            
            /**
             * Sets the "MarketName" attribute
             */
            public void setMarketName(java.lang.String marketName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARKETNAME$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARKETNAME$2);
                    }
                    target.setStringValue(marketName);
                }
            }
            
            /**
             * Sets (as xml) the "MarketName" attribute
             */
            public void xsetMarketName(oasisNamesTcCiqCt3.String marketName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(MARKETNAME$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(MARKETNAME$2);
                    }
                    target.set(marketName);
                }
            }
            
            /**
             * Unsets the "MarketName" attribute
             */
            public void unsetMarketName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(MARKETNAME$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYNAME$4);
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
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(COUNTRYNAME$4);
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
                    return get_store().find_attribute_user(COUNTRYNAME$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRYNAME$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRYNAME$4);
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
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(COUNTRYNAME$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(COUNTRYNAME$4);
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
                    get_store().remove_attribute(COUNTRYNAME$4);
                }
            }
            
            /**
             * Gets the "InvestedDate" attribute
             */
            public java.util.Calendar getInvestedDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVESTEDDATE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "InvestedDate" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetInvestedDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(INVESTEDDATE$6);
                    return target;
                }
            }
            
            /**
             * True if has "InvestedDate" attribute
             */
            public boolean isSetInvestedDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(INVESTEDDATE$6) != null;
                }
            }
            
            /**
             * Sets the "InvestedDate" attribute
             */
            public void setInvestedDate(java.util.Calendar investedDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVESTEDDATE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INVESTEDDATE$6);
                    }
                    target.setCalendarValue(investedDate);
                }
            }
            
            /**
             * Sets (as xml) the "InvestedDate" attribute
             */
            public void xsetInvestedDate(org.apache.xmlbeans.XmlDateTime investedDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(INVESTEDDATE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(INVESTEDDATE$6);
                    }
                    target.set(investedDate);
                }
            }
            
            /**
             * Unsets the "InvestedDate" attribute
             */
            public void unsetInvestedDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(INVESTEDDATE$6);
                }
            }
            
            /**
             * Gets the "ShareQuantity" attribute
             */
            public java.lang.String getShareQuantity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREQUANTITY$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ShareQuantity" attribute
             */
            public oasisNamesTcCiqCt3.String xgetShareQuantity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(SHAREQUANTITY$8);
                    return target;
                }
            }
            
            /**
             * True if has "ShareQuantity" attribute
             */
            public boolean isSetShareQuantity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(SHAREQUANTITY$8) != null;
                }
            }
            
            /**
             * Sets the "ShareQuantity" attribute
             */
            public void setShareQuantity(java.lang.String shareQuantity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREQUANTITY$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAREQUANTITY$8);
                    }
                    target.setStringValue(shareQuantity);
                }
            }
            
            /**
             * Sets (as xml) the "ShareQuantity" attribute
             */
            public void xsetShareQuantity(oasisNamesTcCiqCt3.String shareQuantity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.String target = null;
                    target = (oasisNamesTcCiqCt3.String)get_store().find_attribute_user(SHAREQUANTITY$8);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.String)get_store().add_attribute_user(SHAREQUANTITY$8);
                    }
                    target.set(shareQuantity);
                }
            }
            
            /**
             * Unsets the "ShareQuantity" attribute
             */
            public void unsetShareQuantity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(SHAREQUANTITY$8);
                }
            }
            
            /**
             * Gets the "ListedDate" attribute
             */
            public java.util.Calendar getListedDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTEDDATE$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ListedDate" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetListedDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LISTEDDATE$10);
                    return target;
                }
            }
            
            /**
             * True if has "ListedDate" attribute
             */
            public boolean isSetListedDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LISTEDDATE$10) != null;
                }
            }
            
            /**
             * Sets the "ListedDate" attribute
             */
            public void setListedDate(java.util.Calendar listedDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTEDDATE$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTEDDATE$10);
                    }
                    target.setCalendarValue(listedDate);
                }
            }
            
            /**
             * Sets (as xml) the "ListedDate" attribute
             */
            public void xsetListedDate(org.apache.xmlbeans.XmlDateTime listedDate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LISTEDDATE$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(LISTEDDATE$10);
                    }
                    target.set(listedDate);
                }
            }
            
            /**
             * Unsets the "ListedDate" attribute
             */
            public void unsetListedDate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LISTEDDATE$10);
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
        }
    }
}
