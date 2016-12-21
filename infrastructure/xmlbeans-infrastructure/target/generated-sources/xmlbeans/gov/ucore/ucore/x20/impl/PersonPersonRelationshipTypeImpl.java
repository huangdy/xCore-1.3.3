/*
 * XML Type:  PersonPersonRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PersonPersonRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML PersonPersonRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class PersonPersonRelationshipTypeImpl extends gov.ucore.ucore.x20.impl.RelationshipTypeImpl implements gov.ucore.ucore.x20.PersonPersonRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public PersonPersonRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONREF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonRef");
    
    
    /**
     * Gets array of all "PersonRef" elements
     */
    public gov.ucore.ucore.x20.PersonRefType[] getPersonRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONREF$0, targetList);
            gov.ucore.ucore.x20.PersonRefType[] result = new gov.ucore.ucore.x20.PersonRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonRef" element
     */
    public gov.ucore.ucore.x20.PersonRefType getPersonRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().find_element_user(PERSONREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PersonRef" element
     */
    public int sizeOfPersonRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONREF$0);
        }
    }
    
    /**
     * Sets array of all "PersonRef" element
     */
    public void setPersonRefArray(gov.ucore.ucore.x20.PersonRefType[] personRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personRefArray, PERSONREF$0);
        }
    }
    
    /**
     * Sets ith "PersonRef" element
     */
    public void setPersonRefArray(int i, gov.ucore.ucore.x20.PersonRefType personRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().find_element_user(PERSONREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonRef" element
     */
    public gov.ucore.ucore.x20.PersonRefType insertNewPersonRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().insert_element_user(PERSONREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonRef" element
     */
    public gov.ucore.ucore.x20.PersonRefType addNewPersonRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().add_element_user(PERSONREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonRef" element
     */
    public void removePersonRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONREF$0, i);
        }
    }
}
