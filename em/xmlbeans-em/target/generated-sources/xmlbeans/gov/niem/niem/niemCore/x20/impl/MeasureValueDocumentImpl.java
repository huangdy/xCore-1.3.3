/*
 * An XML document type.
 * Localname: MeasureValue
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.MeasureValueDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one MeasureValue(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class MeasureValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.MeasureValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureValue");
    private static final org.apache.xmlbeans.QNameSet MEASUREVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureValue"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasurePointValue"),
    });
    
    
    /**
     * Gets the "MeasureValue" element
     */
    public org.apache.xmlbeans.XmlObject getMeasureValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(MEASUREVALUE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MeasureValue" element
     */
    public void setMeasureValue(org.apache.xmlbeans.XmlObject measureValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(MEASUREVALUE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(MEASUREVALUE$0);
            }
            target.set(measureValue);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureValue" element
     */
    public org.apache.xmlbeans.XmlObject addNewMeasureValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(MEASUREVALUE$0);
            return target;
        }
    }
}
