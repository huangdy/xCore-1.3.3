/*
 * An XML document type.
 * Localname: CircularRegionRadiusLengthMeasure
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CircularRegionRadiusLengthMeasureDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one CircularRegionRadiusLengthMeasure(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class CircularRegionRadiusLengthMeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.CircularRegionRadiusLengthMeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public CircularRegionRadiusLengthMeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCULARREGIONRADIUSLENGTHMEASURE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CircularRegionRadiusLengthMeasure");
    
    
    /**
     * Gets the "CircularRegionRadiusLengthMeasure" element
     */
    public gov.niem.niem.niemCore.x20.LengthMeasureType getCircularRegionRadiusLengthMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().find_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CircularRegionRadiusLengthMeasure" element
     */
    public boolean isNilCircularRegionRadiusLengthMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().find_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CircularRegionRadiusLengthMeasure" element
     */
    public void setCircularRegionRadiusLengthMeasure(gov.niem.niem.niemCore.x20.LengthMeasureType circularRegionRadiusLengthMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().find_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().add_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$0);
            }
            target.set(circularRegionRadiusLengthMeasure);
        }
    }
    
    /**
     * Appends and returns a new empty "CircularRegionRadiusLengthMeasure" element
     */
    public gov.niem.niem.niemCore.x20.LengthMeasureType addNewCircularRegionRadiusLengthMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().add_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$0);
            return target;
        }
    }
    
    /**
     * Nils the "CircularRegionRadiusLengthMeasure" element
     */
    public void setNilCircularRegionRadiusLengthMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().find_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().add_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$0);
            }
            target.setNil();
        }
    }
}
