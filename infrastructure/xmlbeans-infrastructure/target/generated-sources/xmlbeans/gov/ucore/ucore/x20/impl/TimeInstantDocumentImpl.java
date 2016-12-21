/*
 * An XML document type.
 * Localname: TimeInstant
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.TimeInstantDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one TimeInstant(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class TimeInstantDocumentImpl extends gov.ucore.ucore.x20.impl.TimeAbstractDocumentImpl implements gov.ucore.ucore.x20.TimeInstantDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeInstantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINSTANT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeInstant");
    
    
    /**
     * Gets the "TimeInstant" element
     */
    public gov.ucore.ucore.x20.TimeInstantType getTimeInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().find_element_user(TIMEINSTANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeInstant" element
     */
    public void setTimeInstant(gov.ucore.ucore.x20.TimeInstantType timeInstant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().find_element_user(TIMEINSTANT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.TimeInstantType)get_store().add_element_user(TIMEINSTANT$0);
            }
            target.set(timeInstant);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeInstant" element
     */
    public gov.ucore.ucore.x20.TimeInstantType addNewTimeInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().add_element_user(TIMEINSTANT$0);
            return target;
        }
    }
}
