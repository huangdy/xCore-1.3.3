/*
 * An XML document type.
 * Localname: MeasurePointValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.MeasurePointValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one MeasurePointValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class MeasurePointValueDocumentImpl extends gov.niem.niem.niemCore.x20.impl.MeasureValueDocumentImpl implements gov.niem.niem.niemCore.x20.MeasurePointValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasurePointValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREPOINTVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasurePointValue");
    
    
    /**
     * Gets the "MeasurePointValue" element
     */
    public gov.niem.niem.niemCore.x20.MeasurePointValueType getMeasurePointValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MeasurePointValueType target = null;
            target = (gov.niem.niem.niemCore.x20.MeasurePointValueType)get_store().find_element_user(MEASUREPOINTVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MeasurePointValue" element
     */
    public boolean isNilMeasurePointValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MeasurePointValueType target = null;
            target = (gov.niem.niem.niemCore.x20.MeasurePointValueType)get_store().find_element_user(MEASUREPOINTVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MeasurePointValue" element
     */
    public void setMeasurePointValue(gov.niem.niem.niemCore.x20.MeasurePointValueType measurePointValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MeasurePointValueType target = null;
            target = (gov.niem.niem.niemCore.x20.MeasurePointValueType)get_store().find_element_user(MEASUREPOINTVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.MeasurePointValueType)get_store().add_element_user(MEASUREPOINTVALUE$0);
            }
            target.set(measurePointValue);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasurePointValue" element
     */
    public gov.niem.niem.niemCore.x20.MeasurePointValueType addNewMeasurePointValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MeasurePointValueType target = null;
            target = (gov.niem.niem.niemCore.x20.MeasurePointValueType)get_store().add_element_user(MEASUREPOINTVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "MeasurePointValue" element
     */
    public void setNilMeasurePointValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MeasurePointValueType target = null;
            target = (gov.niem.niem.niemCore.x20.MeasurePointValueType)get_store().find_element_user(MEASUREPOINTVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.MeasurePointValueType)get_store().add_element_user(MEASUREPOINTVALUE$0);
            }
            target.setNil();
        }
    }
}
