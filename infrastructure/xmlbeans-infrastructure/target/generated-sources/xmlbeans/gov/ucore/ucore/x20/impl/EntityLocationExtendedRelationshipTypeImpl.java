/*
 * XML Type:  EntityLocationExtendedRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML EntityLocationExtendedRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class EntityLocationExtendedRelationshipTypeImpl extends gov.ucore.ucore.x20.impl.EntityLocationRelationshipTypeImpl implements gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public EntityLocationExtendedRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COURSEOVERGROUND$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CourseOverGround");
    private static final javax.xml.namespace.QName HEADING$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Heading");
    private static final javax.xml.namespace.QName SPEEDOVERGROUND$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SpeedOverGround");
    
    
    /**
     * Gets the "CourseOverGround" element
     */
    public gov.ucore.ucore.x20.AngleMeasureType getCourseOverGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AngleMeasureType target = null;
            target = (gov.ucore.ucore.x20.AngleMeasureType)get_store().find_element_user(COURSEOVERGROUND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CourseOverGround" element
     */
    public boolean isSetCourseOverGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COURSEOVERGROUND$0) != 0;
        }
    }
    
    /**
     * Sets the "CourseOverGround" element
     */
    public void setCourseOverGround(gov.ucore.ucore.x20.AngleMeasureType courseOverGround)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AngleMeasureType target = null;
            target = (gov.ucore.ucore.x20.AngleMeasureType)get_store().find_element_user(COURSEOVERGROUND$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.AngleMeasureType)get_store().add_element_user(COURSEOVERGROUND$0);
            }
            target.set(courseOverGround);
        }
    }
    
    /**
     * Appends and returns a new empty "CourseOverGround" element
     */
    public gov.ucore.ucore.x20.AngleMeasureType addNewCourseOverGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AngleMeasureType target = null;
            target = (gov.ucore.ucore.x20.AngleMeasureType)get_store().add_element_user(COURSEOVERGROUND$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CourseOverGround" element
     */
    public void unsetCourseOverGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COURSEOVERGROUND$0, 0);
        }
    }
    
    /**
     * Gets the "Heading" element
     */
    public gov.ucore.ucore.x20.AngleMeasureType getHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AngleMeasureType target = null;
            target = (gov.ucore.ucore.x20.AngleMeasureType)get_store().find_element_user(HEADING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Heading" element
     */
    public boolean isSetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADING$2) != 0;
        }
    }
    
    /**
     * Sets the "Heading" element
     */
    public void setHeading(gov.ucore.ucore.x20.AngleMeasureType heading)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AngleMeasureType target = null;
            target = (gov.ucore.ucore.x20.AngleMeasureType)get_store().find_element_user(HEADING$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.AngleMeasureType)get_store().add_element_user(HEADING$2);
            }
            target.set(heading);
        }
    }
    
    /**
     * Appends and returns a new empty "Heading" element
     */
    public gov.ucore.ucore.x20.AngleMeasureType addNewHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AngleMeasureType target = null;
            target = (gov.ucore.ucore.x20.AngleMeasureType)get_store().add_element_user(HEADING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Heading" element
     */
    public void unsetHeading()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADING$2, 0);
        }
    }
    
    /**
     * Gets the "SpeedOverGround" element
     */
    public gov.ucore.ucore.x20.VelocityMeasureType getSpeedOverGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.VelocityMeasureType target = null;
            target = (gov.ucore.ucore.x20.VelocityMeasureType)get_store().find_element_user(SPEEDOVERGROUND$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SpeedOverGround" element
     */
    public boolean isSetSpeedOverGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPEEDOVERGROUND$4) != 0;
        }
    }
    
    /**
     * Sets the "SpeedOverGround" element
     */
    public void setSpeedOverGround(gov.ucore.ucore.x20.VelocityMeasureType speedOverGround)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.VelocityMeasureType target = null;
            target = (gov.ucore.ucore.x20.VelocityMeasureType)get_store().find_element_user(SPEEDOVERGROUND$4, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.VelocityMeasureType)get_store().add_element_user(SPEEDOVERGROUND$4);
            }
            target.set(speedOverGround);
        }
    }
    
    /**
     * Appends and returns a new empty "SpeedOverGround" element
     */
    public gov.ucore.ucore.x20.VelocityMeasureType addNewSpeedOverGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.VelocityMeasureType target = null;
            target = (gov.ucore.ucore.x20.VelocityMeasureType)get_store().add_element_user(SPEEDOVERGROUND$4);
            return target;
        }
    }
    
    /**
     * Unsets the "SpeedOverGround" element
     */
    public void unsetSpeedOverGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPEEDOVERGROUND$4, 0);
        }
    }
}
