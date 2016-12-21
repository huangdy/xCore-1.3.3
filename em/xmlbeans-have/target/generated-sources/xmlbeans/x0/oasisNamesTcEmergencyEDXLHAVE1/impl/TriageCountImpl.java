/*
 * XML Type:  TriageCount
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML TriageCount(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public class TriageCountImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount
{
    private static final long serialVersionUID = 1L;
    
    public TriageCountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIAGECODELISTURN$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TriageCodeListURN");
    private static final javax.xml.namespace.QName TRIAGECODE$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TriageCode");
    
    
    /**
     * Gets the "TriageCodeListURN" element
     */
    public java.lang.String getTriageCodeListURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIAGECODELISTURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TriageCodeListURN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTriageCodeListURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TRIAGECODELISTURN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "TriageCodeListURN" element
     */
    public boolean isSetTriageCodeListURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIAGECODELISTURN$0) != 0;
        }
    }
    
    /**
     * Sets the "TriageCodeListURN" element
     */
    public void setTriageCodeListURN(java.lang.String triageCodeListURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIAGECODELISTURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIAGECODELISTURN$0);
            }
            target.setStringValue(triageCodeListURN);
        }
    }
    
    /**
     * Sets (as xml) the "TriageCodeListURN" element
     */
    public void xsetTriageCodeListURN(org.apache.xmlbeans.XmlAnyURI triageCodeListURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TRIAGECODELISTURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(TRIAGECODELISTURN$0);
            }
            target.set(triageCodeListURN);
        }
    }
    
    /**
     * Unsets the "TriageCodeListURN" element
     */
    public void unsetTriageCodeListURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIAGECODELISTURN$0, 0);
        }
    }
    
    /**
     * Gets array of all "TriageCode" elements
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode[] getTriageCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRIAGECODE$2, targetList);
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode[] result = new x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TriageCode" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode getTriageCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode)get_store().find_element_user(TRIAGECODE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TriageCode" element
     */
    public int sizeOfTriageCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIAGECODE$2);
        }
    }
    
    /**
     * Sets array of all "TriageCode" element
     */
    public void setTriageCodeArray(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode[] triageCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(triageCodeArray, TRIAGECODE$2);
        }
    }
    
    /**
     * Sets ith "TriageCode" element
     */
    public void setTriageCodeArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode triageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode)get_store().find_element_user(TRIAGECODE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(triageCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TriageCode" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode insertNewTriageCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode)get_store().insert_element_user(TRIAGECODE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TriageCode" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode addNewTriageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode)get_store().add_element_user(TRIAGECODE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "TriageCode" element
     */
    public void removeTriageCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIAGECODE$2, i);
        }
    }
    /**
     * An XML TriageCode(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class TriageCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode
    {
        private static final long serialVersionUID = 1L;
        
        public TriageCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TRIAGECODEVALUE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TriageCodeValue");
        private static final javax.xml.namespace.QName TRIAGECOUNTQUANTITY$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TriageCountQuantity");
        
        
        /**
         * Gets array of all "TriageCodeValue" elements
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum[] getTriageCodeValueArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRIAGECODEVALUE$0, targetList);
                x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum[] result = new x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                return result;
            }
        }
        
        /**
         * Gets ith "TriageCodeValue" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum getTriageCodeValueArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIAGECODEVALUE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "TriageCodeValue" elements
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue[] xgetTriageCodeValueArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRIAGECODEVALUE$0, targetList);
                x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue[] result = new x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "TriageCodeValue" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue xgetTriageCodeValueArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue)get_store().find_element_user(TRIAGECODEVALUE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue)target;
            }
        }
        
        /**
         * Returns number of "TriageCodeValue" element
         */
        public int sizeOfTriageCodeValueArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRIAGECODEVALUE$0);
            }
        }
        
        /**
         * Sets array of all "TriageCodeValue" element
         */
        public void setTriageCodeValueArray(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum[] triageCodeValueArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(triageCodeValueArray, TRIAGECODEVALUE$0);
            }
        }
        
        /**
         * Sets ith "TriageCodeValue" element
         */
        public void setTriageCodeValueArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum triageCodeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIAGECODEVALUE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setEnumValue(triageCodeValue);
            }
        }
        
        /**
         * Sets (as xml) array of all "TriageCodeValue" element
         */
        public void xsetTriageCodeValueArray(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue[]triageCodeValueArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(triageCodeValueArray, TRIAGECODEVALUE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "TriageCodeValue" element
         */
        public void xsetTriageCodeValueArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue triageCodeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue)get_store().find_element_user(TRIAGECODEVALUE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(triageCodeValue);
            }
        }
        
        /**
         * Inserts the value as the ith "TriageCodeValue" element
         */
        public void insertTriageCodeValue(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum triageCodeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TRIAGECODEVALUE$0, i);
                target.setEnumValue(triageCodeValue);
            }
        }
        
        /**
         * Appends the value as the last "TriageCodeValue" element
         */
        public void addTriageCodeValue(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue.Enum triageCodeValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIAGECODEVALUE$0);
                target.setEnumValue(triageCodeValue);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TriageCodeValue" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue insertNewTriageCodeValue(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue)get_store().insert_element_user(TRIAGECODEVALUE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TriageCodeValue" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue addNewTriageCodeValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue)get_store().add_element_user(TRIAGECODEVALUE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "TriageCodeValue" element
         */
        public void removeTriageCodeValue(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRIAGECODEVALUE$0, i);
            }
        }
        
        /**
         * Gets array of all "TriageCountQuantity" elements
         */
        public java.math.BigInteger[] getTriageCountQuantityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRIAGECOUNTQUANTITY$2, targetList);
                java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
                return result;
            }
        }
        
        /**
         * Gets ith "TriageCountQuantity" element
         */
        public java.math.BigInteger getTriageCountQuantityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIAGECOUNTQUANTITY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "TriageCountQuantity" elements
         */
        public org.apache.xmlbeans.XmlInteger[] xgetTriageCountQuantityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRIAGECOUNTQUANTITY$2, targetList);
                org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "TriageCountQuantity" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTriageCountQuantityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TRIAGECOUNTQUANTITY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInteger)target;
            }
        }
        
        /**
         * Returns number of "TriageCountQuantity" element
         */
        public int sizeOfTriageCountQuantityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRIAGECOUNTQUANTITY$2);
            }
        }
        
        /**
         * Sets array of all "TriageCountQuantity" element
         */
        public void setTriageCountQuantityArray(java.math.BigInteger[] triageCountQuantityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(triageCountQuantityArray, TRIAGECOUNTQUANTITY$2);
            }
        }
        
        /**
         * Sets ith "TriageCountQuantity" element
         */
        public void setTriageCountQuantityArray(int i, java.math.BigInteger triageCountQuantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIAGECOUNTQUANTITY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setBigIntegerValue(triageCountQuantity);
            }
        }
        
        /**
         * Sets (as xml) array of all "TriageCountQuantity" element
         */
        public void xsetTriageCountQuantityArray(org.apache.xmlbeans.XmlInteger[]triageCountQuantityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(triageCountQuantityArray, TRIAGECOUNTQUANTITY$2);
            }
        }
        
        /**
         * Sets (as xml) ith "TriageCountQuantity" element
         */
        public void xsetTriageCountQuantityArray(int i, org.apache.xmlbeans.XmlInteger triageCountQuantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TRIAGECOUNTQUANTITY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(triageCountQuantity);
            }
        }
        
        /**
         * Inserts the value as the ith "TriageCountQuantity" element
         */
        public void insertTriageCountQuantity(int i, java.math.BigInteger triageCountQuantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TRIAGECOUNTQUANTITY$2, i);
                target.setBigIntegerValue(triageCountQuantity);
            }
        }
        
        /**
         * Appends the value as the last "TriageCountQuantity" element
         */
        public void addTriageCountQuantity(java.math.BigInteger triageCountQuantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIAGECOUNTQUANTITY$2);
                target.setBigIntegerValue(triageCountQuantity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TriageCountQuantity" element
         */
        public org.apache.xmlbeans.XmlInteger insertNewTriageCountQuantity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(TRIAGECOUNTQUANTITY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TriageCountQuantity" element
         */
        public org.apache.xmlbeans.XmlInteger addNewTriageCountQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TRIAGECOUNTQUANTITY$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "TriageCountQuantity" element
         */
        public void removeTriageCountQuantity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRIAGECOUNTQUANTITY$2, i);
            }
        }
        /**
         * An XML TriageCodeValue(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount$TriageCode$TriageCodeValue.
         */
        public static class TriageCodeValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount.TriageCode.TriageCodeValue
        {
            private static final long serialVersionUID = 1L;
            
            public TriageCodeValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TriageCodeValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
