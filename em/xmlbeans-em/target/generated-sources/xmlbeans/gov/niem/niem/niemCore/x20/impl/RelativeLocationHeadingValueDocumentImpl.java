/*
 * An XML document type.
 * Localname: RelativeLocationHeadingValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.RelativeLocationHeadingValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one RelativeLocationHeadingValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class RelativeLocationHeadingValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.RelativeLocationHeadingValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelativeLocationHeadingValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIVELOCATIONHEADINGVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationHeadingValue");
    
    
    /**
     * Gets the "RelativeLocationHeadingValue" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationHeadingType getRelativeLocationHeadingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().find_element_user(RELATIVELOCATIONHEADINGVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelativeLocationHeadingValue" element
     */
    public boolean isNilRelativeLocationHeadingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().find_element_user(RELATIVELOCATIONHEADINGVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelativeLocationHeadingValue" element
     */
    public void setRelativeLocationHeadingValue(gov.niem.niem.niemCore.x20.RelativeLocationHeadingType relativeLocationHeadingValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().find_element_user(RELATIVELOCATIONHEADINGVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().add_element_user(RELATIVELOCATIONHEADINGVALUE$0);
            }
            target.set(relativeLocationHeadingValue);
        }
    }
    
    /**
     * Appends and returns a new empty "RelativeLocationHeadingValue" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationHeadingType addNewRelativeLocationHeadingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().add_element_user(RELATIVELOCATIONHEADINGVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelativeLocationHeadingValue" element
     */
    public void setNilRelativeLocationHeadingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().find_element_user(RELATIVELOCATIONHEADINGVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().add_element_user(RELATIVELOCATIONHEADINGVALUE$0);
            }
            target.setNil();
        }
    }
}
