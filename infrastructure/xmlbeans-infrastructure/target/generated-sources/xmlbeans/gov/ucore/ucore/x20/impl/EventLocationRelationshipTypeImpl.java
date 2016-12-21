/*
 * XML Type:  EventLocationRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.EventLocationRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML EventLocationRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class EventLocationRelationshipTypeImpl extends gov.ucore.ucore.x20.impl.RelationshipTypeImpl implements gov.ucore.ucore.x20.EventLocationRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public EventLocationRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTREF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EventRef");
    private static final javax.xml.namespace.QName LOCATIONREF$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocationRef");
    
    
    /**
     * Gets the "EventRef" element
     */
    public gov.ucore.ucore.x20.EventRefType getEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventRefType target = null;
            target = (gov.ucore.ucore.x20.EventRefType)get_store().find_element_user(EVENTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EventRef" element
     */
    public void setEventRef(gov.ucore.ucore.x20.EventRefType eventRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventRefType target = null;
            target = (gov.ucore.ucore.x20.EventRefType)get_store().find_element_user(EVENTREF$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EventRefType)get_store().add_element_user(EVENTREF$0);
            }
            target.set(eventRef);
        }
    }
    
    /**
     * Appends and returns a new empty "EventRef" element
     */
    public gov.ucore.ucore.x20.EventRefType addNewEventRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventRefType target = null;
            target = (gov.ucore.ucore.x20.EventRefType)get_store().add_element_user(EVENTREF$0);
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
     * True if has "LocationRef" element
     */
    public boolean isSetLocationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONREF$2) != 0;
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
    
    /**
     * Unsets the "LocationRef" element
     */
    public void unsetLocationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONREF$2, 0);
        }
    }
}
