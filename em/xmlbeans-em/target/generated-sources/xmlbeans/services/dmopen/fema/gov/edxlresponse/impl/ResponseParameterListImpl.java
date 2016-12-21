/*
 * XML Type:  responseParameterList
 * Namespace: http://gov.fema.dmopen.services/edxlresponse
 * Java type: services.dmopen.fema.gov.edxlresponse.ResponseParameterList
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.edxlresponse.impl;
/**
 * An XML responseParameterList(@http://gov.fema.dmopen.services/edxlresponse).
 *
 * This is a complex type.
 */
public class ResponseParameterListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.edxlresponse.ResponseParameterList
{
    private static final long serialVersionUID = 1L;
    
    public ResponseParameterListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERLISTITEM$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/edxlresponse", "parameterListItem");
    private static final javax.xml.namespace.QName RESPONSEOPERATION$2 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/edxlresponse", "ResponseOperation");
    private static final javax.xml.namespace.QName RESPONSETYPE$4 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/edxlresponse", "ResponseType");
    
    
    /**
     * Gets array of all "parameterListItem" elements
     */
    public services.dmopen.fema.gov.edxlresponse.ParameterListItem[] getParameterListItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERLISTITEM$0, targetList);
            services.dmopen.fema.gov.edxlresponse.ParameterListItem[] result = new services.dmopen.fema.gov.edxlresponse.ParameterListItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameterListItem" element
     */
    public services.dmopen.fema.gov.edxlresponse.ParameterListItem getParameterListItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlresponse.ParameterListItem target = null;
            target = (services.dmopen.fema.gov.edxlresponse.ParameterListItem)get_store().find_element_user(PARAMETERLISTITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameterListItem" element
     */
    public int sizeOfParameterListItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERLISTITEM$0);
        }
    }
    
    /**
     * Sets array of all "parameterListItem" element
     */
    public void setParameterListItemArray(services.dmopen.fema.gov.edxlresponse.ParameterListItem[] parameterListItemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterListItemArray, PARAMETERLISTITEM$0);
        }
    }
    
    /**
     * Sets ith "parameterListItem" element
     */
    public void setParameterListItemArray(int i, services.dmopen.fema.gov.edxlresponse.ParameterListItem parameterListItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlresponse.ParameterListItem target = null;
            target = (services.dmopen.fema.gov.edxlresponse.ParameterListItem)get_store().find_element_user(PARAMETERLISTITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameterListItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterListItem" element
     */
    public services.dmopen.fema.gov.edxlresponse.ParameterListItem insertNewParameterListItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlresponse.ParameterListItem target = null;
            target = (services.dmopen.fema.gov.edxlresponse.ParameterListItem)get_store().insert_element_user(PARAMETERLISTITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterListItem" element
     */
    public services.dmopen.fema.gov.edxlresponse.ParameterListItem addNewParameterListItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlresponse.ParameterListItem target = null;
            target = (services.dmopen.fema.gov.edxlresponse.ParameterListItem)get_store().add_element_user(PARAMETERLISTITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameterListItem" element
     */
    public void removeParameterListItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERLISTITEM$0, i);
        }
    }
    
    /**
     * Gets the "ResponseOperation" element
     */
    public java.lang.String getResponseOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEOPERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponseOperation" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSEOPERATION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResponseOperation" element
     */
    public boolean isSetResponseOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSEOPERATION$2) != 0;
        }
    }
    
    /**
     * Sets the "ResponseOperation" element
     */
    public void setResponseOperation(java.lang.String responseOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEOPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSEOPERATION$2);
            }
            target.setStringValue(responseOperation);
        }
    }
    
    /**
     * Sets (as xml) the "ResponseOperation" element
     */
    public void xsetResponseOperation(org.apache.xmlbeans.XmlString responseOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSEOPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSEOPERATION$2);
            }
            target.set(responseOperation);
        }
    }
    
    /**
     * Unsets the "ResponseOperation" element
     */
    public void unsetResponseOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSEOPERATION$2, 0);
        }
    }
    
    /**
     * Gets the "ResponseType" element
     */
    public java.lang.String getResponseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponseType" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSETYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResponseType" element
     */
    public boolean isSetResponseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSETYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "ResponseType" element
     */
    public void setResponseType(java.lang.String responseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSETYPE$4);
            }
            target.setStringValue(responseType);
        }
    }
    
    /**
     * Sets (as xml) the "ResponseType" element
     */
    public void xsetResponseType(org.apache.xmlbeans.XmlString responseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSETYPE$4);
            }
            target.set(responseType);
        }
    }
    
    /**
     * Unsets the "ResponseType" element
     */
    public void unsetResponseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSETYPE$4, 0);
        }
    }
}
