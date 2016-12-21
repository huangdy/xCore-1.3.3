/*
 * An XML document type.
 * Localname: MeasureCategoryText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.MeasureCategoryTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one MeasureCategoryText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class MeasureCategoryTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.MeasureCategoryTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureCategoryTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASURECATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureCategoryText");
    
    
    /**
     * Gets the "MeasureCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getMeasureCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASURECATEGORYTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "MeasureCategoryText" element
     */
    public boolean isNilMeasureCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASURECATEGORYTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "MeasureCategoryText" element
     */
    public void setMeasureCategoryText(gov.niem.niem.niemCore.x20.TextType measureCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASURECATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(MEASURECATEGORYTEXT$0);
            }
            target.set(measureCategoryText);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewMeasureCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(MEASURECATEGORYTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "MeasureCategoryText" element
     */
    public void setNilMeasureCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASURECATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(MEASURECATEGORYTEXT$0);
            }
            target.setNil();
        }
    }
}
