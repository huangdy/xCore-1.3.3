/*
 * XML Type:  parameterListItem
 * Namespace: http://gov.fema.dmopen.services/edxlrequest
 * Java type: services.dmopen.fema.gov.edxlrequest.ParameterListItem
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.edxlrequest.impl;
/**
 * An XML parameterListItem(@http://gov.fema.dmopen.services/edxlrequest).
 *
 * This is a complex type.
 */
public class ParameterListItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.edxlrequest.ParameterListItem
{
    private static final long serialVersionUID = 1L;
    
    public ParameterListItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERNAME$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/edxlrequest", "parameterName");
    private static final javax.xml.namespace.QName COMPARISONOP$2 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/edxlrequest", "comparisonOp");
    private static final javax.xml.namespace.QName PARAMETERVALUE$4 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/edxlrequest", "parameterValue");
    private static final javax.xml.namespace.QName LOGICALOP$6 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/edxlrequest", "logicalOp");
    
    
    /**
     * Gets the "parameterName" element
     */
    public java.lang.String getParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterName" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "parameterName" element
     */
    public boolean isSetParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "parameterName" element
     */
    public void setParameterName(java.lang.String parameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERNAME$0);
            }
            target.setStringValue(parameterName);
        }
    }
    
    /**
     * Sets (as xml) the "parameterName" element
     */
    public void xsetParameterName(org.apache.xmlbeans.XmlString parameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERNAME$0);
            }
            target.set(parameterName);
        }
    }
    
    /**
     * Unsets the "parameterName" element
     */
    public void unsetParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERNAME$0, 0);
        }
    }
    
    /**
     * Gets the "comparisonOp" element
     */
    public java.lang.String getComparisonOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPARISONOP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "comparisonOp" element
     */
    public org.apache.xmlbeans.XmlString xgetComparisonOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPARISONOP$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "comparisonOp" element
     */
    public boolean isSetComparisonOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPARISONOP$2) != 0;
        }
    }
    
    /**
     * Sets the "comparisonOp" element
     */
    public void setComparisonOp(java.lang.String comparisonOp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPARISONOP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPARISONOP$2);
            }
            target.setStringValue(comparisonOp);
        }
    }
    
    /**
     * Sets (as xml) the "comparisonOp" element
     */
    public void xsetComparisonOp(org.apache.xmlbeans.XmlString comparisonOp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPARISONOP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPARISONOP$2);
            }
            target.set(comparisonOp);
        }
    }
    
    /**
     * Unsets the "comparisonOp" element
     */
    public void unsetComparisonOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPARISONOP$2, 0);
        }
    }
    
    /**
     * Gets array of all "parameterValue" elements
     */
    public java.lang.String[] getParameterValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERVALUE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "parameterValue" element
     */
    public java.lang.String getParameterValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "parameterValue" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetParameterValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERVALUE$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "parameterValue" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "parameterValue" element
     */
    public int sizeOfParameterValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERVALUE$4);
        }
    }
    
    /**
     * Sets array of all "parameterValue" element
     */
    public void setParameterValueArray(java.lang.String[] parameterValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterValueArray, PARAMETERVALUE$4);
        }
    }
    
    /**
     * Sets ith "parameterValue" element
     */
    public void setParameterValueArray(int i, java.lang.String parameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(parameterValue);
        }
    }
    
    /**
     * Sets (as xml) array of all "parameterValue" element
     */
    public void xsetParameterValueArray(org.apache.xmlbeans.XmlString[]parameterValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterValueArray, PARAMETERVALUE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "parameterValue" element
     */
    public void xsetParameterValueArray(int i, org.apache.xmlbeans.XmlString parameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameterValue);
        }
    }
    
    /**
     * Inserts the value as the ith "parameterValue" element
     */
    public void insertParameterValue(int i, java.lang.String parameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PARAMETERVALUE$4, i);
            target.setStringValue(parameterValue);
        }
    }
    
    /**
     * Appends the value as the last "parameterValue" element
     */
    public void addParameterValue(java.lang.String parameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERVALUE$4);
            target.setStringValue(parameterValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterValue" element
     */
    public org.apache.xmlbeans.XmlString insertNewParameterValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PARAMETERVALUE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterValue" element
     */
    public org.apache.xmlbeans.XmlString addNewParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERVALUE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameterValue" element
     */
    public void removeParameterValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERVALUE$4, i);
        }
    }
    
    /**
     * Gets the "logicalOp" element
     */
    public java.lang.String getLogicalOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALOP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "logicalOp" element
     */
    public org.apache.xmlbeans.XmlString xgetLogicalOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALOP$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "logicalOp" element
     */
    public boolean isSetLogicalOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGICALOP$6) != 0;
        }
    }
    
    /**
     * Sets the "logicalOp" element
     */
    public void setLogicalOp(java.lang.String logicalOp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALOP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALOP$6);
            }
            target.setStringValue(logicalOp);
        }
    }
    
    /**
     * Sets (as xml) the "logicalOp" element
     */
    public void xsetLogicalOp(org.apache.xmlbeans.XmlString logicalOp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGICALOP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGICALOP$6);
            }
            target.set(logicalOp);
        }
    }
    
    /**
     * Unsets the "logicalOp" element
     */
    public void unsetLogicalOp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGICALOP$6, 0);
        }
    }
}
