/*
 * XML Type:  CauseOfRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.CauseOfRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML CauseOfRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class CauseOfRelationshipTypeImpl extends gov.ucore.ucore.x20.impl.RelationshipTypeImpl implements gov.ucore.ucore.x20.CauseOfRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public CauseOfRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAUSE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Cause");
    private static final javax.xml.namespace.QName EFFECT$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Effect");
    
    
    /**
     * Gets the "Cause" element
     */
    public gov.ucore.ucore.x20.ThingRefType getCause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingRefType target = null;
            target = (gov.ucore.ucore.x20.ThingRefType)get_store().find_element_user(CAUSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cause" element
     */
    public void setCause(gov.ucore.ucore.x20.ThingRefType cause)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingRefType target = null;
            target = (gov.ucore.ucore.x20.ThingRefType)get_store().find_element_user(CAUSE$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ThingRefType)get_store().add_element_user(CAUSE$0);
            }
            target.set(cause);
        }
    }
    
    /**
     * Appends and returns a new empty "Cause" element
     */
    public gov.ucore.ucore.x20.ThingRefType addNewCause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingRefType target = null;
            target = (gov.ucore.ucore.x20.ThingRefType)get_store().add_element_user(CAUSE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Effect" element
     */
    public gov.ucore.ucore.x20.EventRefType getEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventRefType target = null;
            target = (gov.ucore.ucore.x20.EventRefType)get_store().find_element_user(EFFECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Effect" element
     */
    public void setEffect(gov.ucore.ucore.x20.EventRefType effect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventRefType target = null;
            target = (gov.ucore.ucore.x20.EventRefType)get_store().find_element_user(EFFECT$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EventRefType)get_store().add_element_user(EFFECT$2);
            }
            target.set(effect);
        }
    }
    
    /**
     * Appends and returns a new empty "Effect" element
     */
    public gov.ucore.ucore.x20.EventRefType addNewEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventRefType target = null;
            target = (gov.ucore.ucore.x20.EventRefType)get_store().add_element_user(EFFECT$2);
            return target;
        }
    }
}
