/*
 * An XML document type.
 * Localname: ActivityReasonText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityReasonTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ActivityReasonText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityReasonTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ActivityReasonTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityReasonTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYREASONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityReasonText");
    
    
    /**
     * Gets the "ActivityReasonText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getActivityReasonText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYREASONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ActivityReasonText" element
     */
    public boolean isNilActivityReasonText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYREASONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ActivityReasonText" element
     */
    public void setActivityReasonText(gov.niem.niem.niemCore.x20.TextType activityReasonText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYREASONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYREASONTEXT$0);
            }
            target.set(activityReasonText);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityReasonText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewActivityReasonText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYREASONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ActivityReasonText" element
     */
    public void setNilActivityReasonText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYREASONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYREASONTEXT$0);
            }
            target.setNil();
        }
    }
}
