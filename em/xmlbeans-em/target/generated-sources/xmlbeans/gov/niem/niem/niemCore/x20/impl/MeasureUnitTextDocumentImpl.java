/*
 * An XML document type.
 * Localname: MeasureUnitText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.MeasureUnitTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one MeasureUnitText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class MeasureUnitTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.MeasureUnitTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureUnitTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREUNITTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureUnitText");
    
    
    /**
     * Gets the "MeasureUnitText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getMeasureUnitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASUREUNITTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MeasureUnitText" element
     */
    public boolean isNilMeasureUnitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASUREUNITTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MeasureUnitText" element
     */
    public void setMeasureUnitText(gov.niem.niem.niemCore.x20.TextType measureUnitText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASUREUNITTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(MEASUREUNITTEXT$0);
            }
            target.set(measureUnitText);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureUnitText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewMeasureUnitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(MEASUREUNITTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "MeasureUnitText" element
     */
    public void setNilMeasureUnitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASUREUNITTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(MEASUREUNITTEXT$0);
            }
            target.setNil();
        }
    }
}
