/*
 * An XML document type.
 * Localname: LatitudeDegreeValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LatitudeDegreeValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LatitudeDegreeValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LatitudeDegreeValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LatitudeDegreeValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public LatitudeDegreeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDEDEGREEVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LatitudeDegreeValue");
    
    
    /**
     * Gets the "LatitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LatitudeDegreeType getLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LatitudeDegreeValue" element
     */
    public boolean isNilLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LatitudeDegreeValue" element
     */
    public void setLatitudeDegreeValue(gov.niem.niem.niemCore.x20.LatitudeDegreeType latitudeDegreeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().add_element_user(LATITUDEDEGREEVALUE$0);
            }
            target.set(latitudeDegreeValue);
        }
    }
    
    /**
     * Appends and returns a new empty "LatitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LatitudeDegreeType addNewLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().add_element_user(LATITUDEDEGREEVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LatitudeDegreeValue" element
     */
    public void setNilLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().add_element_user(LATITUDEDEGREEVALUE$0);
            }
            target.setNil();
        }
    }
}
