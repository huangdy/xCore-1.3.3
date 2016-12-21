/*
 * XML Type:  EntityLocationRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.EntityLocationRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML EntityLocationRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class EntityLocationRelationshipTypeImpl extends gov.ucore.ucore.x20.impl.RelationshipTypeImpl implements gov.ucore.ucore.x20.EntityLocationRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public EntityLocationRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYREF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EntityRef");
    private static final javax.xml.namespace.QName LOCATIONREF$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocationRef");
    
    
    /**
     * Gets the "EntityRef" element
     */
    public gov.ucore.ucore.x20.EntityRefType getEntityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityRefType target = null;
            target = (gov.ucore.ucore.x20.EntityRefType)get_store().find_element_user(ENTITYREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EntityRef" element
     */
    public void setEntityRef(gov.ucore.ucore.x20.EntityRefType entityRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityRefType target = null;
            target = (gov.ucore.ucore.x20.EntityRefType)get_store().find_element_user(ENTITYREF$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EntityRefType)get_store().add_element_user(ENTITYREF$0);
            }
            target.set(entityRef);
        }
    }
    
    /**
     * Appends and returns a new empty "EntityRef" element
     */
    public gov.ucore.ucore.x20.EntityRefType addNewEntityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityRefType target = null;
            target = (gov.ucore.ucore.x20.EntityRefType)get_store().add_element_user(ENTITYREF$0);
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
