/*
 * XML Type:  ValueListType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.ValueListType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML ValueListType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class ValueListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.ValueListType
{
    private static final long serialVersionUID = 1L;
    
    public ValueListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUELISTURN$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ValueListURN");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "Value");
    
    
    /**
     * Gets the "ValueListURN" element
     */
    public java.lang.String getValueListURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUELISTURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValueListURN" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType xgetValueListURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType)get_store().find_element_user(VALUELISTURN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ValueListURN" element
     */
    public void setValueListURN(java.lang.String valueListURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUELISTURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUELISTURN$0);
            }
            target.setStringValue(valueListURN);
        }
    }
    
    /**
     * Sets (as xml) the "ValueListURN" element
     */
    public void xsetValueListURN(x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType valueListURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType)get_store().find_element_user(VALUELISTURN$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListURNType)get_store().add_element_user(VALUELISTURN$0);
            }
            target.set(valueListURN);
        }
    }
    
    /**
     * Gets array of all "Value" elements
     */
    public java.lang.String[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Value" element
     */
    public java.lang.String getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Value" elements
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueType[] xgetValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$2, targetList);
            x0.oasisNamesTcEmergencyEDXLRM1.ValueType[] result = new x0.oasisNamesTcEmergencyEDXLRM1.ValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Value" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueType xgetValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueType)get_store().find_element_user(VALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (x0.oasisNamesTcEmergencyEDXLRM1.ValueType)target;
        }
    }
    
    /**
     * Returns number of "Value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$2);
        }
    }
    
    /**
     * Sets array of all "Value" element
     */
    public void setValueArray(java.lang.String[] valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$2);
        }
    }
    
    /**
     * Sets ith "Value" element
     */
    public void setValueArray(int i, java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) array of all "Value" element
     */
    public void xsetValueArray(x0.oasisNamesTcEmergencyEDXLRM1.ValueType[]valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "Value" element
     */
    public void xsetValueArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.ValueType value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueType)get_store().find_element_user(VALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts the value as the ith "Value" element
     */
    public void insertValue(int i, java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VALUE$2, i);
            target.setStringValue(value);
        }
    }
    
    /**
     * Appends the value as the last "Value" element
     */
    public void addValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
            target.setStringValue(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueType insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueType)get_store().insert_element_user(VALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueType)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$2, i);
        }
    }
}
