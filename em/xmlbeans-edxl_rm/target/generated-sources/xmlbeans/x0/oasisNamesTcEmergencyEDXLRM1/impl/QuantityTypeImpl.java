/*
 * XML Type:  QuantityType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.QuantityType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML QuantityType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class QuantityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.QuantityType
{
    private static final long serialVersionUID = 1L;
    
    public QuantityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYTEXT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "QuantityText");
    private static final javax.xml.namespace.QName MEASUREDQUANTITY$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "MeasuredQuantity");
    
    
    /**
     * Gets array of all "QuantityText" elements
     */
    public java.lang.String[] getQuantityTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUANTITYTEXT$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "QuantityText" element
     */
    public java.lang.String getQuantityTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "QuantityText" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetQuantityTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUANTITYTEXT$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "QuantityText" element
     */
    public org.apache.xmlbeans.XmlString xgetQuantityTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "QuantityText" element
     */
    public int sizeOfQuantityTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYTEXT$0);
        }
    }
    
    /**
     * Sets array of all "QuantityText" element
     */
    public void setQuantityTextArray(java.lang.String[] quantityTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(quantityTextArray, QUANTITYTEXT$0);
        }
    }
    
    /**
     * Sets ith "QuantityText" element
     */
    public void setQuantityTextArray(int i, java.lang.String quantityText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(quantityText);
        }
    }
    
    /**
     * Sets (as xml) array of all "QuantityText" element
     */
    public void xsetQuantityTextArray(org.apache.xmlbeans.XmlString[]quantityTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(quantityTextArray, QUANTITYTEXT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "QuantityText" element
     */
    public void xsetQuantityTextArray(int i, org.apache.xmlbeans.XmlString quantityText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUANTITYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(quantityText);
        }
    }
    
    /**
     * Inserts the value as the ith "QuantityText" element
     */
    public void insertQuantityText(int i, java.lang.String quantityText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(QUANTITYTEXT$0, i);
            target.setStringValue(quantityText);
        }
    }
    
    /**
     * Appends the value as the last "QuantityText" element
     */
    public void addQuantityText(java.lang.String quantityText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITYTEXT$0);
            target.setStringValue(quantityText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityText" element
     */
    public org.apache.xmlbeans.XmlString insertNewQuantityText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(QUANTITYTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityText" element
     */
    public org.apache.xmlbeans.XmlString addNewQuantityText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUANTITYTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuantityText" element
     */
    public void removeQuantityText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYTEXT$0, i);
        }
    }
    
    /**
     * Gets the "MeasuredQuantity" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity getMeasuredQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity)get_store().find_element_user(MEASUREDQUANTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MeasuredQuantity" element
     */
    public boolean isSetMeasuredQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDQUANTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "MeasuredQuantity" element
     */
    public void setMeasuredQuantity(x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity measuredQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity)get_store().find_element_user(MEASUREDQUANTITY$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity)get_store().add_element_user(MEASUREDQUANTITY$2);
            }
            target.set(measuredQuantity);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasuredQuantity" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity addNewMeasuredQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity)get_store().add_element_user(MEASUREDQUANTITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MeasuredQuantity" element
     */
    public void unsetMeasuredQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDQUANTITY$2, 0);
        }
    }
    /**
     * An XML MeasuredQuantity(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
     *
     * This is a complex type.
     */
    public static class MeasuredQuantityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.QuantityType.MeasuredQuantity
    {
        private static final long serialVersionUID = 1L;
        
        public MeasuredQuantityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AMOUNT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "Amount");
        private static final javax.xml.namespace.QName UNITOFMEASURE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "UnitOfMeasure");
        
        
        /**
         * Gets the "Amount" element
         */
        public double getAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$0, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "Amount" element
         */
        public org.apache.xmlbeans.XmlDouble xgetAmount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Amount" element
         */
        public void setAmount(double amount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$0);
                }
                target.setDoubleValue(amount);
            }
        }
        
        /**
         * Sets (as xml) the "Amount" element
         */
        public void xsetAmount(org.apache.xmlbeans.XmlDouble amount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(AMOUNT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(AMOUNT$0);
                }
                target.set(amount);
            }
        }
        
        /**
         * Gets the "UnitOfMeasure" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getUnitOfMeasure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(UNITOFMEASURE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "UnitOfMeasure" element
         */
        public boolean isSetUnitOfMeasure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNITOFMEASURE$2) != 0;
            }
        }
        
        /**
         * Sets the "UnitOfMeasure" element
         */
        public void setUnitOfMeasure(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType unitOfMeasure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(UNITOFMEASURE$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(UNITOFMEASURE$2);
                }
                target.set(unitOfMeasure);
            }
        }
        
        /**
         * Appends and returns a new empty "UnitOfMeasure" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewUnitOfMeasure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(UNITOFMEASURE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "UnitOfMeasure" element
         */
        public void unsetUnitOfMeasure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNITOFMEASURE$2, 0);
            }
        }
    }
}
