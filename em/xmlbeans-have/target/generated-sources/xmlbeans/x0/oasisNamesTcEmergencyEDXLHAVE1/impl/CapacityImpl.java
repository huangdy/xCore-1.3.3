/*
 * XML Type:  Capacity
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML Capacity(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public class CapacityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity
{
    private static final long serialVersionUID = 1L;
    
    public CapacityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPACITYSTATUS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CapacityStatus");
    private static final javax.xml.namespace.QName AVAILABLECOUNT$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "AvailableCount");
    private static final javax.xml.namespace.QName BASELINECOUNT$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "BaselineCount");
    private static final javax.xml.namespace.QName ADDITIONALCAPACITYCOUNT24HR$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "AdditionalCapacityCount24Hr");
    private static final javax.xml.namespace.QName ADDITIONALCAPACITYCOUNT72HR$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "AdditionalCapacityCount72Hr");
    
    
    /**
     * Gets the "CapacityStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus.Enum getCapacityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CapacityStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus xgetCapacityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus)get_store().find_element_user(CAPACITYSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CapacityStatus" element
     */
    public boolean isSetCapacityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPACITYSTATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "CapacityStatus" element
     */
    public void setCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus.Enum capacityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPACITYSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPACITYSTATUS$0);
            }
            target.setEnumValue(capacityStatus);
        }
    }
    
    /**
     * Sets (as xml) the "CapacityStatus" element
     */
    public void xsetCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus capacityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus)get_store().find_element_user(CAPACITYSTATUS$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus)get_store().add_element_user(CAPACITYSTATUS$0);
            }
            target.set(capacityStatus);
        }
    }
    
    /**
     * Unsets the "CapacityStatus" element
     */
    public void unsetCapacityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPACITYSTATUS$0, 0);
        }
    }
    
    /**
     * Gets the "AvailableCount" element
     */
    public java.math.BigInteger getAvailableCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLECOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "AvailableCount" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAvailableCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVAILABLECOUNT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AvailableCount" element
     */
    public boolean isSetAvailableCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVAILABLECOUNT$2) != 0;
        }
    }
    
    /**
     * Sets the "AvailableCount" element
     */
    public void setAvailableCount(java.math.BigInteger availableCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLECOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVAILABLECOUNT$2);
            }
            target.setBigIntegerValue(availableCount);
        }
    }
    
    /**
     * Sets (as xml) the "AvailableCount" element
     */
    public void xsetAvailableCount(org.apache.xmlbeans.XmlInteger availableCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(AVAILABLECOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(AVAILABLECOUNT$2);
            }
            target.set(availableCount);
        }
    }
    
    /**
     * Unsets the "AvailableCount" element
     */
    public void unsetAvailableCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVAILABLECOUNT$2, 0);
        }
    }
    
    /**
     * Gets the "BaselineCount" element
     */
    public java.math.BigInteger getBaselineCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASELINECOUNT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "BaselineCount" element
     */
    public org.apache.xmlbeans.XmlInteger xgetBaselineCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BASELINECOUNT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "BaselineCount" element
     */
    public boolean isSetBaselineCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASELINECOUNT$4) != 0;
        }
    }
    
    /**
     * Sets the "BaselineCount" element
     */
    public void setBaselineCount(java.math.BigInteger baselineCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASELINECOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASELINECOUNT$4);
            }
            target.setBigIntegerValue(baselineCount);
        }
    }
    
    /**
     * Sets (as xml) the "BaselineCount" element
     */
    public void xsetBaselineCount(org.apache.xmlbeans.XmlInteger baselineCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(BASELINECOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(BASELINECOUNT$4);
            }
            target.set(baselineCount);
        }
    }
    
    /**
     * Unsets the "BaselineCount" element
     */
    public void unsetBaselineCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASELINECOUNT$4, 0);
        }
    }
    
    /**
     * Gets the "AdditionalCapacityCount24Hr" element
     */
    public java.math.BigInteger getAdditionalCapacityCount24Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALCAPACITYCOUNT24HR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdditionalCapacityCount24Hr" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAdditionalCapacityCount24Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADDITIONALCAPACITYCOUNT24HR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "AdditionalCapacityCount24Hr" element
     */
    public boolean isSetAdditionalCapacityCount24Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALCAPACITYCOUNT24HR$6) != 0;
        }
    }
    
    /**
     * Sets the "AdditionalCapacityCount24Hr" element
     */
    public void setAdditionalCapacityCount24Hr(java.math.BigInteger additionalCapacityCount24Hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALCAPACITYCOUNT24HR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALCAPACITYCOUNT24HR$6);
            }
            target.setBigIntegerValue(additionalCapacityCount24Hr);
        }
    }
    
    /**
     * Sets (as xml) the "AdditionalCapacityCount24Hr" element
     */
    public void xsetAdditionalCapacityCount24Hr(org.apache.xmlbeans.XmlInteger additionalCapacityCount24Hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADDITIONALCAPACITYCOUNT24HR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ADDITIONALCAPACITYCOUNT24HR$6);
            }
            target.set(additionalCapacityCount24Hr);
        }
    }
    
    /**
     * Unsets the "AdditionalCapacityCount24Hr" element
     */
    public void unsetAdditionalCapacityCount24Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALCAPACITYCOUNT24HR$6, 0);
        }
    }
    
    /**
     * Gets the "AdditionalCapacityCount72Hr" element
     */
    public java.math.BigInteger getAdditionalCapacityCount72Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALCAPACITYCOUNT72HR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdditionalCapacityCount72Hr" element
     */
    public org.apache.xmlbeans.XmlInteger xgetAdditionalCapacityCount72Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADDITIONALCAPACITYCOUNT72HR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "AdditionalCapacityCount72Hr" element
     */
    public boolean isSetAdditionalCapacityCount72Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALCAPACITYCOUNT72HR$8) != 0;
        }
    }
    
    /**
     * Sets the "AdditionalCapacityCount72Hr" element
     */
    public void setAdditionalCapacityCount72Hr(java.math.BigInteger additionalCapacityCount72Hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALCAPACITYCOUNT72HR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALCAPACITYCOUNT72HR$8);
            }
            target.setBigIntegerValue(additionalCapacityCount72Hr);
        }
    }
    
    /**
     * Sets (as xml) the "AdditionalCapacityCount72Hr" element
     */
    public void xsetAdditionalCapacityCount72Hr(org.apache.xmlbeans.XmlInteger additionalCapacityCount72Hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADDITIONALCAPACITYCOUNT72HR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ADDITIONALCAPACITYCOUNT72HR$8);
            }
            target.set(additionalCapacityCount72Hr);
        }
    }
    
    /**
     * Unsets the "AdditionalCapacityCount72Hr" element
     */
    public void unsetAdditionalCapacityCount72Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALCAPACITYCOUNT72HR$8, 0);
        }
    }
    /**
     * An XML CapacityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity$CapacityStatus.
     */
    public static class CapacityStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity.CapacityStatus
    {
        private static final long serialVersionUID = 1L;
        
        public CapacityStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CapacityStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
