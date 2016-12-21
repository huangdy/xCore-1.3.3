/*
 * An XML document type.
 * Localname: Event
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.EventDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Event(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class EventDocumentImpl extends gov.ucore.ucore.x20.impl.ThingAbstractDocumentImpl implements gov.ucore.ucore.x20.EventDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Event");
    
    
    /**
     * Gets the "Event" element
     */
    public gov.ucore.ucore.x20.EventType getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventType target = null;
            target = (gov.ucore.ucore.x20.EventType)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Event" element
     */
    public void setEvent(gov.ucore.ucore.x20.EventType event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventType target = null;
            target = (gov.ucore.ucore.x20.EventType)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EventType)get_store().add_element_user(EVENT$0);
            }
            target.set(event);
        }
    }
    
    /**
     * Appends and returns a new empty "Event" element
     */
    public gov.ucore.ucore.x20.EventType addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventType target = null;
            target = (gov.ucore.ucore.x20.EventType)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
}
