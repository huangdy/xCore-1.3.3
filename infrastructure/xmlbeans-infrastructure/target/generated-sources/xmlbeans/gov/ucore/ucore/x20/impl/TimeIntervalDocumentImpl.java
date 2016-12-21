/*
 * An XML document type.
 * Localname: TimeInterval
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.TimeIntervalDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one TimeInterval(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class TimeIntervalDocumentImpl extends gov.ucore.ucore.x20.impl.TimeAbstractDocumentImpl implements gov.ucore.ucore.x20.TimeIntervalDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeIntervalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINTERVAL$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeInterval");
    
    
    /**
     * Gets the "TimeInterval" element
     */
    public gov.ucore.ucore.x20.TimeIntervalType getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeIntervalType target = null;
            target = (gov.ucore.ucore.x20.TimeIntervalType)get_store().find_element_user(TIMEINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeInterval" element
     */
    public void setTimeInterval(gov.ucore.ucore.x20.TimeIntervalType timeInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeIntervalType target = null;
            target = (gov.ucore.ucore.x20.TimeIntervalType)get_store().find_element_user(TIMEINTERVAL$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.TimeIntervalType)get_store().add_element_user(TIMEINTERVAL$0);
            }
            target.set(timeInterval);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeInterval" element
     */
    public gov.ucore.ucore.x20.TimeIntervalType addNewTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeIntervalType target = null;
            target = (gov.ucore.ucore.x20.TimeIntervalType)get_store().add_element_user(TIMEINTERVAL$0);
            return target;
        }
    }
}
