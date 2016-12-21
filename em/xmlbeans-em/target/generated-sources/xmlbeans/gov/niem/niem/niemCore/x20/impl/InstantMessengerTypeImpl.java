/*
 * XML Type:  InstantMessengerType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.InstantMessengerType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML InstantMessengerType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class InstantMessengerTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.InstantMessengerType
{
    private static final long serialVersionUID = 1L;
    
    public InstantMessengerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANTMESSENGERCLIENTNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "InstantMessengerClientName");
    private static final javax.xml.namespace.QName INSTANTMESSENGERSCREENID$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "InstantMessengerScreenID");
    
    
    /**
     * Gets array of all "InstantMessengerClientName" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getInstantMessengerClientNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTANTMESSENGERCLIENTNAME$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InstantMessengerClientName" element
     */
    public gov.niem.niem.niemCore.x20.TextType getInstantMessengerClientNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INSTANTMESSENGERCLIENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "InstantMessengerClientName" element
     */
    public boolean isNilInstantMessengerClientNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INSTANTMESSENGERCLIENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "InstantMessengerClientName" element
     */
    public int sizeOfInstantMessengerClientNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANTMESSENGERCLIENTNAME$0);
        }
    }
    
    /**
     * Sets array of all "InstantMessengerClientName" element
     */
    public void setInstantMessengerClientNameArray(gov.niem.niem.niemCore.x20.TextType[] instantMessengerClientNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(instantMessengerClientNameArray, INSTANTMESSENGERCLIENTNAME$0);
        }
    }
    
    /**
     * Sets ith "InstantMessengerClientName" element
     */
    public void setInstantMessengerClientNameArray(int i, gov.niem.niem.niemCore.x20.TextType instantMessengerClientName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INSTANTMESSENGERCLIENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(instantMessengerClientName);
        }
    }
    
    /**
     * Nils the ith "InstantMessengerClientName" element
     */
    public void setNilInstantMessengerClientNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INSTANTMESSENGERCLIENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstantMessengerClientName" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewInstantMessengerClientName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(INSTANTMESSENGERCLIENTNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InstantMessengerClientName" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewInstantMessengerClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(INSTANTMESSENGERCLIENTNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "InstantMessengerClientName" element
     */
    public void removeInstantMessengerClientName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANTMESSENGERCLIENTNAME$0, i);
        }
    }
    
    /**
     * Gets array of all "InstantMessengerScreenID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getInstantMessengerScreenIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTANTMESSENGERSCREENID$2, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InstantMessengerScreenID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getInstantMessengerScreenIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(INSTANTMESSENGERSCREENID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "InstantMessengerScreenID" element
     */
    public boolean isNilInstantMessengerScreenIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(INSTANTMESSENGERSCREENID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "InstantMessengerScreenID" element
     */
    public int sizeOfInstantMessengerScreenIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTANTMESSENGERSCREENID$2);
        }
    }
    
    /**
     * Sets array of all "InstantMessengerScreenID" element
     */
    public void setInstantMessengerScreenIDArray(gov.niem.niem.proxy.xsd.x20.String[] instantMessengerScreenIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(instantMessengerScreenIDArray, INSTANTMESSENGERSCREENID$2);
        }
    }
    
    /**
     * Sets ith "InstantMessengerScreenID" element
     */
    public void setInstantMessengerScreenIDArray(int i, gov.niem.niem.proxy.xsd.x20.String instantMessengerScreenID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(INSTANTMESSENGERSCREENID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(instantMessengerScreenID);
        }
    }
    
    /**
     * Nils the ith "InstantMessengerScreenID" element
     */
    public void setNilInstantMessengerScreenIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(INSTANTMESSENGERSCREENID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InstantMessengerScreenID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewInstantMessengerScreenID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(INSTANTMESSENGERSCREENID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InstantMessengerScreenID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewInstantMessengerScreenID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(INSTANTMESSENGERSCREENID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "InstantMessengerScreenID" element
     */
    public void removeInstantMessengerScreenID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTANTMESSENGERSCREENID$2, i);
        }
    }
}
