/*
 * An XML document type.
 * Localname: LongitudeSecondValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LongitudeSecondValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LongitudeSecondValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LongitudeSecondValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LongitudeSecondValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public LongitudeSecondValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LONGITUDESECONDVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LongitudeSecondValue");
    
    
    /**
     * Gets the "LongitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType getLongitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LONGITUDESECONDVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LongitudeSecondValue" element
     */
    public boolean isNilLongitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LONGITUDESECONDVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LongitudeSecondValue" element
     */
    public void setLongitudeSecondValue(gov.niem.niem.niemCore.x20.AngularSecondType longitudeSecondValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LONGITUDESECONDVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().add_element_user(LONGITUDESECONDVALUE$0);
            }
            target.set(longitudeSecondValue);
        }
    }
    
    /**
     * Appends and returns a new empty "LongitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType addNewLongitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().add_element_user(LONGITUDESECONDVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LongitudeSecondValue" element
     */
    public void setNilLongitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LONGITUDESECONDVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().add_element_user(LONGITUDESECONDVALUE$0);
            }
            target.setNil();
        }
    }
}
