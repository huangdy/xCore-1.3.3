/*
 * XML Type:  OrganizationElementType
 * Namespace: http://uicds.org/OrganizationElement
 * Java type: org.uicds.organizationElement.OrganizationElementType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.organizationElement.impl;
/**
 * An XML OrganizationElementType(@http://uicds.org/OrganizationElement).
 *
 * This is a complex type.
 */
public class OrganizationElementTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.organizationElement.OrganizationElementType
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationElementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONNAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizationName");
    private static final javax.xml.namespace.QName ORGANIZATIONTYPE$2 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizationType");
    private static final javax.xml.namespace.QName PERSONINCHARGE$4 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "PersonInCharge");
    private static final javax.xml.namespace.QName STAFF$6 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "Staff");
    private static final javax.xml.namespace.QName ORGANIZATIONELEMENT$8 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizationElement");
    
    
    /**
     * Gets the "OrganizationName" element
     */
    public java.lang.String getOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationName" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganizationName" element
     */
    public void setOrganizationName(java.lang.String organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONNAME$0);
            }
            target.setStringValue(organizationName);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationName" element
     */
    public void xsetOrganizationName(org.apache.xmlbeans.XmlString organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATIONNAME$0);
            }
            target.set(organizationName);
        }
    }
    
    /**
     * Gets the "OrganizationType" element
     */
    public java.lang.String getOrganizationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationType" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganizationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganizationType" element
     */
    public void setOrganizationType(java.lang.String organizationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONTYPE$2);
            }
            target.setStringValue(organizationType);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationType" element
     */
    public void xsetOrganizationType(org.apache.xmlbeans.XmlString organizationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATIONTYPE$2);
            }
            target.set(organizationType);
        }
    }
    
    /**
     * Gets the "PersonInCharge" element
     */
    public org.uicds.organizationElement.OrganizationPositionType getPersonInCharge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().find_element_user(PERSONINCHARGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonInCharge" element
     */
    public void setPersonInCharge(org.uicds.organizationElement.OrganizationPositionType personInCharge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().find_element_user(PERSONINCHARGE$4, 0);
            if (target == null)
            {
                target = (org.uicds.organizationElement.OrganizationPositionType)get_store().add_element_user(PERSONINCHARGE$4);
            }
            target.set(personInCharge);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonInCharge" element
     */
    public org.uicds.organizationElement.OrganizationPositionType addNewPersonInCharge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().add_element_user(PERSONINCHARGE$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "Staff" elements
     */
    public org.uicds.organizationElement.OrganizationPositionType[] getStaffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STAFF$6, targetList);
            org.uicds.organizationElement.OrganizationPositionType[] result = new org.uicds.organizationElement.OrganizationPositionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Staff" element
     */
    public org.uicds.organizationElement.OrganizationPositionType getStaffArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().find_element_user(STAFF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Staff" element
     */
    public int sizeOfStaffArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STAFF$6);
        }
    }
    
    /**
     * Sets array of all "Staff" element
     */
    public void setStaffArray(org.uicds.organizationElement.OrganizationPositionType[] staffArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(staffArray, STAFF$6);
        }
    }
    
    /**
     * Sets ith "Staff" element
     */
    public void setStaffArray(int i, org.uicds.organizationElement.OrganizationPositionType staff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().find_element_user(STAFF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(staff);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Staff" element
     */
    public org.uicds.organizationElement.OrganizationPositionType insertNewStaff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().insert_element_user(STAFF$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Staff" element
     */
    public org.uicds.organizationElement.OrganizationPositionType addNewStaff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().add_element_user(STAFF$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Staff" element
     */
    public void removeStaff(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STAFF$6, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationElement" elements
     */
    public org.uicds.organizationElement.OrganizationElementType[] getOrganizationElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONELEMENT$8, targetList);
            org.uicds.organizationElement.OrganizationElementType[] result = new org.uicds.organizationElement.OrganizationElementType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationElement" element
     */
    public org.uicds.organizationElement.OrganizationElementType getOrganizationElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationElementType target = null;
            target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(ORGANIZATIONELEMENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganizationElement" element
     */
    public int sizeOfOrganizationElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONELEMENT$8);
        }
    }
    
    /**
     * Sets array of all "OrganizationElement" element
     */
    public void setOrganizationElementArray(org.uicds.organizationElement.OrganizationElementType[] organizationElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationElementArray, ORGANIZATIONELEMENT$8);
        }
    }
    
    /**
     * Sets ith "OrganizationElement" element
     */
    public void setOrganizationElementArray(int i, org.uicds.organizationElement.OrganizationElementType organizationElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationElementType target = null;
            target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(ORGANIZATIONELEMENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationElement" element
     */
    public org.uicds.organizationElement.OrganizationElementType insertNewOrganizationElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationElementType target = null;
            target = (org.uicds.organizationElement.OrganizationElementType)get_store().insert_element_user(ORGANIZATIONELEMENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationElement" element
     */
    public org.uicds.organizationElement.OrganizationElementType addNewOrganizationElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationElementType target = null;
            target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(ORGANIZATIONELEMENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationElement" element
     */
    public void removeOrganizationElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONELEMENT$8, i);
        }
    }
}
