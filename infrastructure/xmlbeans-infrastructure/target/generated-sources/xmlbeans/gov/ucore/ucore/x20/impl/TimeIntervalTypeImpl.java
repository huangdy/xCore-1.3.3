/*
 * XML Type:  TimeIntervalType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.TimeIntervalType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML TimeIntervalType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class TimeIntervalTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.TimeIntervalType
{
    private static final long serialVersionUID = 1L;
    
    public TimeIntervalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTTIME$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "StartTime");
    private static final javax.xml.namespace.QName ENDTIME$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EndTime");
    
    
    /**
     * Gets the "StartTime" element
     */
    public gov.ucore.ucore.x20.TimeInstantType getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StartTime" element
     */
    public boolean isSetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "StartTime" element
     */
    public void setStartTime(gov.ucore.ucore.x20.TimeInstantType startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.TimeInstantType)get_store().add_element_user(STARTTIME$0);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Appends and returns a new empty "StartTime" element
     */
    public gov.ucore.ucore.x20.TimeInstantType addNewStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().add_element_user(STARTTIME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "StartTime" element
     */
    public void unsetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTTIME$0, 0);
        }
    }
    
    /**
     * Gets the "EndTime" element
     */
    public gov.ucore.ucore.x20.TimeInstantType getEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EndTime" element
     */
    public boolean isSetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "EndTime" element
     */
    public void setEndTime(gov.ucore.ucore.x20.TimeInstantType endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.TimeInstantType)get_store().add_element_user(ENDTIME$2);
            }
            target.set(endTime);
        }
    }
    
    /**
     * Appends and returns a new empty "EndTime" element
     */
    public gov.ucore.ucore.x20.TimeInstantType addNewEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeInstantType target = null;
            target = (gov.ucore.ucore.x20.TimeInstantType)get_store().add_element_user(ENDTIME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "EndTime" element
     */
    public void unsetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDTIME$2, 0);
        }
    }
}
