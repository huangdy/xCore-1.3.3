/*
 * An XML document type.
 * Localname: LatitudeSecondValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LatitudeSecondValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LatitudeSecondValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LatitudeSecondValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LatitudeSecondValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public LatitudeSecondValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDESECONDVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LatitudeSecondValue");
    
    
    /**
     * Gets the "LatitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType getLatitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LATITUDESECONDVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LatitudeSecondValue" element
     */
    public boolean isNilLatitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LATITUDESECONDVALUE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LatitudeSecondValue" element
     */
    public void setLatitudeSecondValue(gov.niem.niem.niemCore.x20.AngularSecondType latitudeSecondValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LATITUDESECONDVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().add_element_user(LATITUDESECONDVALUE$0);
            }
            target.set(latitudeSecondValue);
        }
    }
    
    /**
     * Appends and returns a new empty "LatitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType addNewLatitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().add_element_user(LATITUDESECONDVALUE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LatitudeSecondValue" element
     */
    public void setNilLatitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LATITUDESECONDVALUE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().add_element_user(LATITUDESECONDVALUE$0);
            }
            target.setNil();
        }
    }
}
