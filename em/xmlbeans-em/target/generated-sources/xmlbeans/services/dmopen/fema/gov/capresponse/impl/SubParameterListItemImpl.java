/*
 * XML Type:  subParameterListItem
 * Namespace: http://gov.fema.dmopen.services/capresponse
 * Java type: services.dmopen.fema.gov.capresponse.SubParameterListItem
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.capresponse.impl;
/**
 * An XML subParameterListItem(@http://gov.fema.dmopen.services/capresponse).
 *
 * This is a complex type.
 */
public class SubParameterListItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.capresponse.SubParameterListItem
{
    private static final long serialVersionUID = 1L;
    
    public SubParameterListItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBPARAMETERNAME$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/capresponse", "subParameterName");
    private static final javax.xml.namespace.QName SUBPARAMETERVALUE$2 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/capresponse", "subParameterValue");
    
    
    /**
     * Gets the "subParameterName" element
     */
    public java.lang.String getSubParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPARAMETERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subParameterName" element
     */
    public org.apache.xmlbeans.XmlString xgetSubParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPARAMETERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "subParameterName" element
     */
    public boolean isSetSubParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBPARAMETERNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "subParameterName" element
     */
    public void setSubParameterName(java.lang.String subParameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPARAMETERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBPARAMETERNAME$0);
            }
            target.setStringValue(subParameterName);
        }
    }
    
    /**
     * Sets (as xml) the "subParameterName" element
     */
    public void xsetSubParameterName(org.apache.xmlbeans.XmlString subParameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPARAMETERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBPARAMETERNAME$0);
            }
            target.set(subParameterName);
        }
    }
    
    /**
     * Unsets the "subParameterName" element
     */
    public void unsetSubParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBPARAMETERNAME$0, 0);
        }
    }
    
    /**
     * Gets the "subParameterValue" element
     */
    public java.lang.String getSubParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPARAMETERVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subParameterValue" element
     */
    public org.apache.xmlbeans.XmlString xgetSubParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPARAMETERVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "subParameterValue" element
     */
    public boolean isSetSubParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBPARAMETERVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "subParameterValue" element
     */
    public void setSubParameterValue(java.lang.String subParameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBPARAMETERVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBPARAMETERVALUE$2);
            }
            target.setStringValue(subParameterValue);
        }
    }
    
    /**
     * Sets (as xml) the "subParameterValue" element
     */
    public void xsetSubParameterValue(org.apache.xmlbeans.XmlString subParameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBPARAMETERVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBPARAMETERVALUE$2);
            }
            target.set(subParameterValue);
        }
    }
    
    /**
     * Unsets the "subParameterValue" element
     */
    public void unsetSubParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBPARAMETERVALUE$2, 0);
        }
    }
}
