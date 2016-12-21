/*
 * XML Type:  valueSchemeType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1.impl;
/**
 * An XML valueSchemeType(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
 *
 * This is a complex type.
 */
public class ValueSchemeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType
{
    private static final long serialVersionUID = 1L;
    
    public ValueSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPLICITADDRESSSCHEME$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "explicitAddressScheme");
    private static final javax.xml.namespace.QName EXPLICITADDRESSVALUE$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "explicitAddressValue");
    
    
    /**
     * Gets the "explicitAddressScheme" element
     */
    public java.lang.String getExplicitAddressScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLICITADDRESSSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "explicitAddressScheme" element
     */
    public org.apache.xmlbeans.XmlString xgetExplicitAddressScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLICITADDRESSSCHEME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "explicitAddressScheme" element
     */
    public void setExplicitAddressScheme(java.lang.String explicitAddressScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLICITADDRESSSCHEME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPLICITADDRESSSCHEME$0);
            }
            target.setStringValue(explicitAddressScheme);
        }
    }
    
    /**
     * Sets (as xml) the "explicitAddressScheme" element
     */
    public void xsetExplicitAddressScheme(org.apache.xmlbeans.XmlString explicitAddressScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLICITADDRESSSCHEME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPLICITADDRESSSCHEME$0);
            }
            target.set(explicitAddressScheme);
        }
    }
    
    /**
     * Gets array of all "explicitAddressValue" elements
     */
    public java.lang.String[] getExplicitAddressValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXPLICITADDRESSVALUE$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "explicitAddressValue" element
     */
    public java.lang.String getExplicitAddressValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLICITADDRESSVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "explicitAddressValue" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetExplicitAddressValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXPLICITADDRESSVALUE$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "explicitAddressValue" element
     */
    public org.apache.xmlbeans.XmlString xgetExplicitAddressValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLICITADDRESSVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "explicitAddressValue" element
     */
    public int sizeOfExplicitAddressValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPLICITADDRESSVALUE$2);
        }
    }
    
    /**
     * Sets array of all "explicitAddressValue" element
     */
    public void setExplicitAddressValueArray(java.lang.String[] explicitAddressValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(explicitAddressValueArray, EXPLICITADDRESSVALUE$2);
        }
    }
    
    /**
     * Sets ith "explicitAddressValue" element
     */
    public void setExplicitAddressValueArray(int i, java.lang.String explicitAddressValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPLICITADDRESSVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(explicitAddressValue);
        }
    }
    
    /**
     * Sets (as xml) array of all "explicitAddressValue" element
     */
    public void xsetExplicitAddressValueArray(org.apache.xmlbeans.XmlString[]explicitAddressValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(explicitAddressValueArray, EXPLICITADDRESSVALUE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "explicitAddressValue" element
     */
    public void xsetExplicitAddressValueArray(int i, org.apache.xmlbeans.XmlString explicitAddressValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPLICITADDRESSVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(explicitAddressValue);
        }
    }
    
    /**
     * Inserts the value as the ith "explicitAddressValue" element
     */
    public void insertExplicitAddressValue(int i, java.lang.String explicitAddressValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EXPLICITADDRESSVALUE$2, i);
            target.setStringValue(explicitAddressValue);
        }
    }
    
    /**
     * Appends the value as the last "explicitAddressValue" element
     */
    public void addExplicitAddressValue(java.lang.String explicitAddressValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPLICITADDRESSVALUE$2);
            target.setStringValue(explicitAddressValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "explicitAddressValue" element
     */
    public org.apache.xmlbeans.XmlString insertNewExplicitAddressValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EXPLICITADDRESSVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "explicitAddressValue" element
     */
    public org.apache.xmlbeans.XmlString addNewExplicitAddressValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPLICITADDRESSVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "explicitAddressValue" element
     */
    public void removeExplicitAddressValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPLICITADDRESSVALUE$2, i);
        }
    }
}
