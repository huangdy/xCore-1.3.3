/*
 * An XML document type.
 * Localname: ActivityIdentification
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ActivityIdentification(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityIdentificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ActivityIdentificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityIdentification");
    
    
    /**
     * Gets the "ActivityIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType getActivityIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ACTIVITYIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ActivityIdentification" element
     */
    public boolean isNilActivityIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ACTIVITYIDENTIFICATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ActivityIdentification" element
     */
    public void setActivityIdentification(gov.niem.niem.niemCore.x20.IdentificationType activityIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ACTIVITYIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ACTIVITYIDENTIFICATION$0);
            }
            target.set(activityIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType addNewActivityIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ACTIVITYIDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "ActivityIdentification" element
     */
    public void setNilActivityIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ACTIVITYIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ACTIVITYIDENTIFICATION$0);
            }
            target.setNil();
        }
    }
}
