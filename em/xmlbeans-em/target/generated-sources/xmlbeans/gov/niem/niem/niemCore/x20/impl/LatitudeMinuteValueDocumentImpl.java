/*
 * An XML document type.
 * Localname: LatitudeMinuteValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LatitudeMinuteValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LatitudeMinuteValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LatitudeMinuteValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LatitudeMinuteValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public LatitudeMinuteValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDEMINUTEVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LatitudeMinuteValue");
    
    
    /**
     * Gets the "LatitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType getLatitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LATITUDEMINUTEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LatitudeMinuteValue" element
     */
    public boolean isNilLatitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LATITUDEMINUTEVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LatitudeMinuteValue" element
     */
    public void setLatitudeMinuteValue(gov.niem.niem.niemCore.x20.AngularMinuteType latitudeMinuteValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LATITUDEMINUTEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().add_element_user(LATITUDEMINUTEVALUE$0);
            }
            target.set(latitudeMinuteValue);
        }
    }
    
    /**
     * Appends and returns a new empty "LatitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType addNewLatitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().add_element_user(LATITUDEMINUTEVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LatitudeMinuteValue" element
     */
    public void setNilLatitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LATITUDEMINUTEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().add_element_user(LATITUDEMINUTEVALUE$0);
            }
            target.setNil();
        }
    }
}
