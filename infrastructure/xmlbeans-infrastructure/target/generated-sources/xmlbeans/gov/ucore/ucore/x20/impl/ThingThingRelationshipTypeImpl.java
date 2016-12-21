/*
 * XML Type:  ThingThingRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.ThingThingRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML ThingThingRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class ThingThingRelationshipTypeImpl extends gov.ucore.ucore.x20.impl.RelationshipTypeImpl implements gov.ucore.ucore.x20.ThingThingRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public ThingThingRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THINGREF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingRef");
    
    
    /**
     * Gets array of all "ThingRef" elements
     */
    public gov.ucore.ucore.x20.ThingRefType[] getThingRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(THINGREF$0, targetList);
            gov.ucore.ucore.x20.ThingRefType[] result = new gov.ucore.ucore.x20.ThingRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ThingRef" element
     */
    public gov.ucore.ucore.x20.ThingRefType getThingRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingRefType target = null;
            target = (gov.ucore.ucore.x20.ThingRefType)get_store().find_element_user(THINGREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ThingRef" element
     */
    public int sizeOfThingRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THINGREF$0);
        }
    }
    
    /**
     * Sets array of all "ThingRef" element
     */
    public void setThingRefArray(gov.ucore.ucore.x20.ThingRefType[] thingRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(thingRefArray, THINGREF$0);
        }
    }
    
    /**
     * Sets ith "ThingRef" element
     */
    public void setThingRefArray(int i, gov.ucore.ucore.x20.ThingRefType thingRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingRefType target = null;
            target = (gov.ucore.ucore.x20.ThingRefType)get_store().find_element_user(THINGREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(thingRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ThingRef" element
     */
    public gov.ucore.ucore.x20.ThingRefType insertNewThingRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingRefType target = null;
            target = (gov.ucore.ucore.x20.ThingRefType)get_store().insert_element_user(THINGREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ThingRef" element
     */
    public gov.ucore.ucore.x20.ThingRefType addNewThingRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingRefType target = null;
            target = (gov.ucore.ucore.x20.ThingRefType)get_store().add_element_user(THINGREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ThingRef" element
     */
    public void removeThingRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THINGREF$0, i);
        }
    }
}
