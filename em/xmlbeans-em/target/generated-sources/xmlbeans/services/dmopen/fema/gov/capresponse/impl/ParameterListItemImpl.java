/*
 * XML Type:  parameterListItem
 * Namespace: http://gov.fema.dmopen.services/capresponse
 * Java type: services.dmopen.fema.gov.capresponse.ParameterListItem
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.capresponse.impl;
/**
 * An XML parameterListItem(@http://gov.fema.dmopen.services/capresponse).
 *
 * This is a complex type.
 */
public class ParameterListItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.capresponse.ParameterListItem
{
    private static final long serialVersionUID = 1L;
    
    public ParameterListItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERNAME$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/capresponse", "parameterName");
    private static final javax.xml.namespace.QName PARAMETERVALUE$2 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/capresponse", "parameterValue");
    private static final javax.xml.namespace.QName SUBPARALISTITEM$4 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/capresponse", "subParaListItem");
    
    
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
     * Gets the "parameterValue" element
     */
    public java.lang.String getParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterValue" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "parameterValue" element
     */
    public boolean isSetParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "parameterValue" element
     */
    public void setParameterValue(java.lang.String parameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERVALUE$2);
            }
            target.setStringValue(parameterValue);
        }
    }
    
    /**
     * Sets (as xml) the "parameterValue" element
     */
    public void xsetParameterValue(org.apache.xmlbeans.XmlString parameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERVALUE$2);
            }
            target.set(parameterValue);
        }
    }
    
    /**
     * Unsets the "parameterValue" element
     */
    public void unsetParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERVALUE$2, 0);
        }
    }
    
    /**
     * Gets array of all "subParaListItem" elements
     */
    public services.dmopen.fema.gov.capresponse.SubParameterListItem[] getSubParaListItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBPARALISTITEM$4, targetList);
            services.dmopen.fema.gov.capresponse.SubParameterListItem[] result = new services.dmopen.fema.gov.capresponse.SubParameterListItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subParaListItem" element
     */
    public services.dmopen.fema.gov.capresponse.SubParameterListItem getSubParaListItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.capresponse.SubParameterListItem target = null;
            target = (services.dmopen.fema.gov.capresponse.SubParameterListItem)get_store().find_element_user(SUBPARALISTITEM$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subParaListItem" element
     */
    public int sizeOfSubParaListItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBPARALISTITEM$4);
        }
    }
    
    /**
     * Sets array of all "subParaListItem" element
     */
    public void setSubParaListItemArray(services.dmopen.fema.gov.capresponse.SubParameterListItem[] subParaListItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subParaListItemArray, SUBPARALISTITEM$4);
        }
    }
    
    /**
     * Sets ith "subParaListItem" element
     */
    public void setSubParaListItemArray(int i, services.dmopen.fema.gov.capresponse.SubParameterListItem subParaListItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.capresponse.SubParameterListItem target = null;
            target = (services.dmopen.fema.gov.capresponse.SubParameterListItem)get_store().find_element_user(SUBPARALISTITEM$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subParaListItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subParaListItem" element
     */
    public services.dmopen.fema.gov.capresponse.SubParameterListItem insertNewSubParaListItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.capresponse.SubParameterListItem target = null;
            target = (services.dmopen.fema.gov.capresponse.SubParameterListItem)get_store().insert_element_user(SUBPARALISTITEM$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subParaListItem" element
     */
    public services.dmopen.fema.gov.capresponse.SubParameterListItem addNewSubParaListItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.capresponse.SubParameterListItem target = null;
            target = (services.dmopen.fema.gov.capresponse.SubParameterListItem)get_store().add_element_user(SUBPARALISTITEM$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "subParaListItem" element
     */
    public void removeSubParaListItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBPARALISTITEM$4, i);
        }
    }
}
