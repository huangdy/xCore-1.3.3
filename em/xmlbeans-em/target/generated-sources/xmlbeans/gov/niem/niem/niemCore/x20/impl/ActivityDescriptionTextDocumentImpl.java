/*
 * An XML document type.
 * Localname: ActivityDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ActivityDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ActivityDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDescriptionText");
    
    
    /**
     * Gets the "ActivityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getActivityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ActivityDescriptionText" element
     */
    public boolean isNilActivityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ActivityDescriptionText" element
     */
    public void setActivityDescriptionText(gov.niem.niem.niemCore.x20.TextType activityDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYDESCRIPTIONTEXT$0);
            }
            target.set(activityDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewActivityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "ActivityDescriptionText" element
     */
    public void setNilActivityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
