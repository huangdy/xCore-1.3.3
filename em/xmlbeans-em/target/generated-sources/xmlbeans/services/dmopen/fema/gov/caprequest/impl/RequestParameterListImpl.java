/*
 * XML Type:  requestParameterList
 * Namespace: http://gov.fema.dmopen.services/caprequest
 * Java type: services.dmopen.fema.gov.caprequest.RequestParameterList
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.caprequest.impl;
/**
 * An XML requestParameterList(@http://gov.fema.dmopen.services/caprequest).
 *
 * This is a complex type.
 */
public class RequestParameterListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.caprequest.RequestParameterList
{
    private static final long serialVersionUID = 1L;
    
    public RequestParameterListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTAPI$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/caprequest", "requestAPI");
    private static final javax.xml.namespace.QName REQUESTOPERATION$2 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/caprequest", "requestOperation");
    private static final javax.xml.namespace.QName PARAMETERS$4 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/caprequest", "parameters");
    
    
    /**
     * Gets the "requestAPI" element
     */
    public java.lang.String getRequestAPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTAPI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestAPI" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestAPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTAPI$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestAPI" element
     */
    public boolean isSetRequestAPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTAPI$0) != 0;
        }
    }
    
    /**
     * Sets the "requestAPI" element
     */
    public void setRequestAPI(java.lang.String requestAPI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTAPI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTAPI$0);
            }
            target.setStringValue(requestAPI);
        }
    }
    
    /**
     * Sets (as xml) the "requestAPI" element
     */
    public void xsetRequestAPI(org.apache.xmlbeans.XmlString requestAPI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTAPI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTAPI$0);
            }
            target.set(requestAPI);
        }
    }
    
    /**
     * Unsets the "requestAPI" element
     */
    public void unsetRequestAPI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTAPI$0, 0);
        }
    }
    
    /**
     * Gets the "requestOperation" element
     */
    public java.lang.String getRequestOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTOPERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestOperation" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTOPERATION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "requestOperation" element
     */
    public boolean isSetRequestOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTOPERATION$2) != 0;
        }
    }
    
    /**
     * Sets the "requestOperation" element
     */
    public void setRequestOperation(java.lang.String requestOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTOPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTOPERATION$2);
            }
            target.setStringValue(requestOperation);
        }
    }
    
    /**
     * Sets (as xml) the "requestOperation" element
     */
    public void xsetRequestOperation(org.apache.xmlbeans.XmlString requestOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTOPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTOPERATION$2);
            }
            target.set(requestOperation);
        }
    }
    
    /**
     * Unsets the "requestOperation" element
     */
    public void unsetRequestOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTOPERATION$2, 0);
        }
    }
    
    /**
     * Gets array of all "parameters" elements
     */
    public services.dmopen.fema.gov.caprequest.ParameterListItem[] getParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERS$4, targetList);
            services.dmopen.fema.gov.caprequest.ParameterListItem[] result = new services.dmopen.fema.gov.caprequest.ParameterListItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameters" element
     */
    public services.dmopen.fema.gov.caprequest.ParameterListItem getParametersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.caprequest.ParameterListItem target = null;
            target = (services.dmopen.fema.gov.caprequest.ParameterListItem)get_store().find_element_user(PARAMETERS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameters" element
     */
    public int sizeOfParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$4);
        }
    }
    
    /**
     * Sets array of all "parameters" element
     */
    public void setParametersArray(services.dmopen.fema.gov.caprequest.ParameterListItem[] parametersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parametersArray, PARAMETERS$4);
        }
    }
    
    /**
     * Sets ith "parameters" element
     */
    public void setParametersArray(int i, services.dmopen.fema.gov.caprequest.ParameterListItem parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.caprequest.ParameterListItem target = null;
            target = (services.dmopen.fema.gov.caprequest.ParameterListItem)get_store().find_element_user(PARAMETERS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameters);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameters" element
     */
    public services.dmopen.fema.gov.caprequest.ParameterListItem insertNewParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.caprequest.ParameterListItem target = null;
            target = (services.dmopen.fema.gov.caprequest.ParameterListItem)get_store().insert_element_user(PARAMETERS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameters" element
     */
    public services.dmopen.fema.gov.caprequest.ParameterListItem addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.caprequest.ParameterListItem target = null;
            target = (services.dmopen.fema.gov.caprequest.ParameterListItem)get_store().add_element_user(PARAMETERS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameters" element
     */
    public void removeParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$4, i);
        }
    }
}
