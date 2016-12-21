/*
 * An XML document type.
 * Localname: MeasureEstimatedIndicator
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.MeasureEstimatedIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one MeasureEstimatedIndicator(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class MeasureEstimatedIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.MeasureEstimatedIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureEstimatedIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREESTIMATEDINDICATOR$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureEstimatedIndicator");
    
    
    /**
     * Gets the "MeasureEstimatedIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean getMeasureEstimatedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(MEASUREESTIMATEDINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MeasureEstimatedIndicator" element
     */
    public boolean isNilMeasureEstimatedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(MEASUREESTIMATEDINDICATOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MeasureEstimatedIndicator" element
     */
    public void setMeasureEstimatedIndicator(gov.niem.niem.proxy.xsd.x20.Boolean measureEstimatedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(MEASUREESTIMATEDINDICATOR$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().add_element_user(MEASUREESTIMATEDINDICATOR$0);
            }
            target.set(measureEstimatedIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureEstimatedIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean addNewMeasureEstimatedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().add_element_user(MEASUREESTIMATEDINDICATOR$0);
            return target;
        }
    }
    
    /**
     * Nils the "MeasureEstimatedIndicator" element
     */
    public void setNilMeasureEstimatedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(MEASUREESTIMATEDINDICATOR$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().add_element_user(MEASUREESTIMATEDINDICATOR$0);
            }
            target.setNil();
        }
    }
}
