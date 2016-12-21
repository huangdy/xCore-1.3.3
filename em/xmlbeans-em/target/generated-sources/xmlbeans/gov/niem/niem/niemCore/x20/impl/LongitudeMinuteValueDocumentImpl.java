/*
 * An XML document type.
 * Localname: LongitudeMinuteValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LongitudeMinuteValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LongitudeMinuteValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LongitudeMinuteValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LongitudeMinuteValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public LongitudeMinuteValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LONGITUDEMINUTEVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LongitudeMinuteValue");
    
    
    /**
     * Gets the "LongitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType getLongitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LONGITUDEMINUTEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LongitudeMinuteValue" element
     */
    public boolean isNilLongitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LONGITUDEMINUTEVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LongitudeMinuteValue" element
     */
    public void setLongitudeMinuteValue(gov.niem.niem.niemCore.x20.AngularMinuteType longitudeMinuteValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LONGITUDEMINUTEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().add_element_user(LONGITUDEMINUTEVALUE$0);
            }
            target.set(longitudeMinuteValue);
        }
    }
    
    /**
     * Appends and returns a new empty "LongitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType addNewLongitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().add_element_user(LONGITUDEMINUTEVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LongitudeMinuteValue" element
     */
    public void setNilLongitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LONGITUDEMINUTEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().add_element_user(LONGITUDEMINUTEVALUE$0);
            }
            target.setNil();
        }
    }
}
