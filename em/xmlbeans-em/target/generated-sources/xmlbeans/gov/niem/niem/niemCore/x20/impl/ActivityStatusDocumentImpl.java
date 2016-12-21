/*
 * An XML document type.
 * Localname: ActivityStatus
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityStatusDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ActivityStatus(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ActivityStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYSTATUS$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityStatus");
    
    
    /**
     * Gets the "ActivityStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType getActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ACTIVITYSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ActivityStatus" element
     */
    public boolean isNilActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ACTIVITYSTATUS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ActivityStatus" element
     */
    public void setActivityStatus(gov.niem.niem.niemCore.x20.StatusType activityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ACTIVITYSTATUS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.StatusType)get_store().add_element_user(ACTIVITYSTATUS$0);
            }
            target.set(activityStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType addNewActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().add_element_user(ACTIVITYSTATUS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ActivityStatus" element
     */
    public void setNilActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ACTIVITYSTATUS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.StatusType)get_store().add_element_user(ACTIVITYSTATUS$0);
            }
            target.setNil();
        }
    }
}
