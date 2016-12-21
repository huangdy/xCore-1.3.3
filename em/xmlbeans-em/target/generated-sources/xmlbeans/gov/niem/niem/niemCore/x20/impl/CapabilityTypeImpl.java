/*
 * XML Type:  CapabilityType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CapabilityType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML CapabilityType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class CapabilityTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.CapabilityType
{
    private static final long serialVersionUID = 1L;
    
    public CapabilityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPABILITYGENERALCATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CapabilityGeneralCategoryText");
    private static final javax.xml.namespace.QName CAPABILITYCATEGORYTEXT$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CapabilityCategoryText");
    private static final javax.xml.namespace.QName CAPABILITYDESCRIPTIONTEXT$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CapabilityDescriptionText");
    private static final javax.xml.namespace.QName CAPABILITYISLIMITATIONINDICATOR$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CapabilityIsLimitationIndicator");
    
    
    /**
     * Gets array of all "CapabilityGeneralCategoryText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getCapabilityGeneralCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPABILITYGENERALCATEGORYTEXT$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CapabilityGeneralCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getCapabilityGeneralCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYGENERALCATEGORYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CapabilityGeneralCategoryText" element
     */
    public boolean isNilCapabilityGeneralCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYGENERALCATEGORYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CapabilityGeneralCategoryText" element
     */
    public int sizeOfCapabilityGeneralCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPABILITYGENERALCATEGORYTEXT$0);
        }
    }
    
    /**
     * Sets array of all "CapabilityGeneralCategoryText" element
     */
    public void setCapabilityGeneralCategoryTextArray(gov.niem.niem.niemCore.x20.TextType[] capabilityGeneralCategoryTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capabilityGeneralCategoryTextArray, CAPABILITYGENERALCATEGORYTEXT$0);
        }
    }
    
    /**
     * Sets ith "CapabilityGeneralCategoryText" element
     */
    public void setCapabilityGeneralCategoryTextArray(int i, gov.niem.niem.niemCore.x20.TextType capabilityGeneralCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYGENERALCATEGORYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(capabilityGeneralCategoryText);
        }
    }
    
    /**
     * Nils the ith "CapabilityGeneralCategoryText" element
     */
    public void setNilCapabilityGeneralCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYGENERALCATEGORYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CapabilityGeneralCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewCapabilityGeneralCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(CAPABILITYGENERALCATEGORYTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CapabilityGeneralCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewCapabilityGeneralCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYGENERALCATEGORYTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CapabilityGeneralCategoryText" element
     */
    public void removeCapabilityGeneralCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPABILITYGENERALCATEGORYTEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "CapabilityCategoryText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getCapabilityCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPABILITYCATEGORYTEXT$2, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CapabilityCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getCapabilityCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYCATEGORYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CapabilityCategoryText" element
     */
    public boolean isNilCapabilityCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYCATEGORYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CapabilityCategoryText" element
     */
    public int sizeOfCapabilityCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPABILITYCATEGORYTEXT$2);
        }
    }
    
    /**
     * Sets array of all "CapabilityCategoryText" element
     */
    public void setCapabilityCategoryTextArray(gov.niem.niem.niemCore.x20.TextType[] capabilityCategoryTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capabilityCategoryTextArray, CAPABILITYCATEGORYTEXT$2);
        }
    }
    
    /**
     * Sets ith "CapabilityCategoryText" element
     */
    public void setCapabilityCategoryTextArray(int i, gov.niem.niem.niemCore.x20.TextType capabilityCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYCATEGORYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(capabilityCategoryText);
        }
    }
    
    /**
     * Nils the ith "CapabilityCategoryText" element
     */
    public void setNilCapabilityCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYCATEGORYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CapabilityCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewCapabilityCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(CAPABILITYCATEGORYTEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CapabilityCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewCapabilityCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYCATEGORYTEXT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "CapabilityCategoryText" element
     */
    public void removeCapabilityCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPABILITYCATEGORYTEXT$2, i);
        }
    }
    
    /**
     * Gets array of all "CapabilityDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getCapabilityDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPABILITYDESCRIPTIONTEXT$4, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CapabilityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getCapabilityDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CapabilityDescriptionText" element
     */
    public boolean isNilCapabilityDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CapabilityDescriptionText" element
     */
    public int sizeOfCapabilityDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPABILITYDESCRIPTIONTEXT$4);
        }
    }
    
    /**
     * Sets array of all "CapabilityDescriptionText" element
     */
    public void setCapabilityDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] capabilityDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capabilityDescriptionTextArray, CAPABILITYDESCRIPTIONTEXT$4);
        }
    }
    
    /**
     * Sets ith "CapabilityDescriptionText" element
     */
    public void setCapabilityDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType capabilityDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(capabilityDescriptionText);
        }
    }
    
    /**
     * Nils the ith "CapabilityDescriptionText" element
     */
    public void setNilCapabilityDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CAPABILITYDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CapabilityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewCapabilityDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(CAPABILITYDESCRIPTIONTEXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CapabilityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewCapabilityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CAPABILITYDESCRIPTIONTEXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "CapabilityDescriptionText" element
     */
    public void removeCapabilityDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPABILITYDESCRIPTIONTEXT$4, i);
        }
    }
    
    /**
     * Gets array of all "CapabilityIsLimitationIndicator" elements
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean[] getCapabilityIsLimitationIndicatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPABILITYISLIMITATIONINDICATOR$6, targetList);
            gov.niem.niem.proxy.xsd.x20.Boolean[] result = new gov.niem.niem.proxy.xsd.x20.Boolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CapabilityIsLimitationIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean getCapabilityIsLimitationIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(CAPABILITYISLIMITATIONINDICATOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CapabilityIsLimitationIndicator" element
     */
    public boolean isNilCapabilityIsLimitationIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(CAPABILITYISLIMITATIONINDICATOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CapabilityIsLimitationIndicator" element
     */
    public int sizeOfCapabilityIsLimitationIndicatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPABILITYISLIMITATIONINDICATOR$6);
        }
    }
    
    /**
     * Sets array of all "CapabilityIsLimitationIndicator" element
     */
    public void setCapabilityIsLimitationIndicatorArray(gov.niem.niem.proxy.xsd.x20.Boolean[] capabilityIsLimitationIndicatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capabilityIsLimitationIndicatorArray, CAPABILITYISLIMITATIONINDICATOR$6);
        }
    }
    
    /**
     * Sets ith "CapabilityIsLimitationIndicator" element
     */
    public void setCapabilityIsLimitationIndicatorArray(int i, gov.niem.niem.proxy.xsd.x20.Boolean capabilityIsLimitationIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(CAPABILITYISLIMITATIONINDICATOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(capabilityIsLimitationIndicator);
        }
    }
    
    /**
     * Nils the ith "CapabilityIsLimitationIndicator" element
     */
    public void setNilCapabilityIsLimitationIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(CAPABILITYISLIMITATIONINDICATOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CapabilityIsLimitationIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean insertNewCapabilityIsLimitationIndicator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().insert_element_user(CAPABILITYISLIMITATIONINDICATOR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CapabilityIsLimitationIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean addNewCapabilityIsLimitationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().add_element_user(CAPABILITYISLIMITATIONINDICATOR$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "CapabilityIsLimitationIndicator" element
     */
    public void removeCapabilityIsLimitationIndicator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPABILITYISLIMITATIONINDICATOR$6, i);
        }
    }
}
