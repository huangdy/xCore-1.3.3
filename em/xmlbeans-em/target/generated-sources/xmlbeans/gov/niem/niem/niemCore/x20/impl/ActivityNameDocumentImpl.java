/*
 * An XML document type.
 * Localname: ActivityName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ActivityName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ActivityNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityName");
    
    
    /**
     * Gets the "ActivityName" element
     */
    public gov.niem.niem.niemCore.x20.TextType getActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ActivityName" element
     */
    public boolean isNilActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ActivityName" element
     */
    public void setActivityName(gov.niem.niem.niemCore.x20.TextType activityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYNAME$0);
            }
            target.set(activityName);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityName" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "ActivityName" element
     */
    public void setNilActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYNAME$0);
            }
            target.setNil();
        }
    }
}
