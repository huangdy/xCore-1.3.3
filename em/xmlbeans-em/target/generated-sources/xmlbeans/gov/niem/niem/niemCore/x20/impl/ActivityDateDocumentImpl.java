/*
 * An XML document type.
 * Localname: ActivityDate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityDateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ActivityDate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityDateDocumentImpl extends gov.niem.niem.niemCore.x20.impl.ActivityDateRepresentationDocumentImpl implements gov.niem.niem.niemCore.x20.ActivityDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYDATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDate");
    
    
    /**
     * Gets the "ActivityDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType getActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(ACTIVITYDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ActivityDate" element
     */
    public boolean isNilActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(ACTIVITYDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ActivityDate" element
     */
    public void setActivityDate(gov.niem.niem.niemCore.x20.DateType activityDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(ACTIVITYDATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(ACTIVITYDATE$0);
            }
            target.set(activityDate);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType addNewActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(ACTIVITYDATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "ActivityDate" element
     */
    public void setNilActivityDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(ACTIVITYDATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(ACTIVITYDATE$0);
            }
            target.setNil();
        }
    }
}
