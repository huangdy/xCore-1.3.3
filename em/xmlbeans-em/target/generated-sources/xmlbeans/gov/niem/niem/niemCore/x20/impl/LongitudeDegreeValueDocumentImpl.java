/*
 * An XML document type.
 * Localname: LongitudeDegreeValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LongitudeDegreeValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LongitudeDegreeValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LongitudeDegreeValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LongitudeDegreeValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public LongitudeDegreeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LONGITUDEDEGREEVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LongitudeDegreeValue");
    
    
    /**
     * Gets the "LongitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LongitudeDegreeType getLongitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().find_element_user(LONGITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LongitudeDegreeValue" element
     */
    public boolean isNilLongitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().find_element_user(LONGITUDEDEGREEVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LongitudeDegreeValue" element
     */
    public void setLongitudeDegreeValue(gov.niem.niem.niemCore.x20.LongitudeDegreeType longitudeDegreeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().find_element_user(LONGITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().add_element_user(LONGITUDEDEGREEVALUE$0);
            }
            target.set(longitudeDegreeValue);
        }
    }
    
    /**
     * Appends and returns a new empty "LongitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LongitudeDegreeType addNewLongitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().add_element_user(LONGITUDEDEGREEVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LongitudeDegreeValue" element
     */
    public void setNilLongitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().find_element_user(LONGITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().add_element_user(LONGITUDEDEGREEVALUE$0);
            }
            target.setNil();
        }
    }
}
