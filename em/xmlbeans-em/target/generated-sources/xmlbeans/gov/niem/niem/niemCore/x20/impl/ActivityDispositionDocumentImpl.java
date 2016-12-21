/*
 * An XML document type.
 * Localname: ActivityDisposition
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityDispositionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ActivityDisposition(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityDispositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ActivityDispositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityDispositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYDISPOSITION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDisposition");
    
    
    /**
     * Gets the "ActivityDisposition" element
     */
    public gov.niem.niem.niemCore.x20.DispositionType getActivityDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().find_element_user(ACTIVITYDISPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ActivityDisposition" element
     */
    public boolean isNilActivityDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().find_element_user(ACTIVITYDISPOSITION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ActivityDisposition" element
     */
    public void setActivityDisposition(gov.niem.niem.niemCore.x20.DispositionType activityDisposition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().find_element_user(ACTIVITYDISPOSITION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().add_element_user(ACTIVITYDISPOSITION$0);
            }
            target.set(activityDisposition);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityDisposition" element
     */
    public gov.niem.niem.niemCore.x20.DispositionType addNewActivityDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().add_element_user(ACTIVITYDISPOSITION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ActivityDisposition" element
     */
    public void setNilActivityDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().find_element_user(ACTIVITYDISPOSITION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().add_element_user(ACTIVITYDISPOSITION$0);
            }
            target.setNil();
        }
    }
}
