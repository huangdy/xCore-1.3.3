/*
 * XML Type:  PersonLocationRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PersonLocationRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML PersonLocationRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class PersonLocationRelationshipTypeImpl extends gov.ucore.ucore.x20.impl.RelationshipTypeImpl implements gov.ucore.ucore.x20.PersonLocationRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public PersonLocationRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONREF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonRef");
    private static final javax.xml.namespace.QName LOCATIONREF$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocationRef");
    
    
    /**
     * Gets the "PersonRef" element
     */
    public gov.ucore.ucore.x20.PersonRefType getPersonRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().find_element_user(PERSONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonRef" element
     */
    public void setPersonRef(gov.ucore.ucore.x20.PersonRefType personRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().find_element_user(PERSONREF$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PersonRefType)get_store().add_element_user(PERSONREF$0);
            }
            target.set(personRef);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonRef" element
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
     * Gets the "LocationRef" element
     */
    public gov.ucore.ucore.x20.LocationRefType getLocationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LocationRefType target = null;
            target = (gov.ucore.ucore.x20.LocationRefType)get_store().find_element_user(LOCATIONREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocationRef" element
     */
    public void setLocationRef(gov.ucore.ucore.x20.LocationRefType locationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LocationRefType target = null;
            target = (gov.ucore.ucore.x20.LocationRefType)get_store().find_element_user(LOCATIONREF$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.LocationRefType)get_store().add_element_user(LOCATIONREF$2);
            }
            target.set(locationRef);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationRef" element
     */
    public gov.ucore.ucore.x20.LocationRefType addNewLocationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LocationRefType target = null;
            target = (gov.ucore.ucore.x20.LocationRefType)get_store().add_element_user(LOCATIONREF$2);
            return target;
        }
    }
}
