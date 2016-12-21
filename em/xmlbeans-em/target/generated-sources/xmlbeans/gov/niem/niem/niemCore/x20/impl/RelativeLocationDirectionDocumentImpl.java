/*
 * An XML document type.
 * Localname: RelativeLocationDirection
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.RelativeLocationDirectionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one RelativeLocationDirection(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class RelativeLocationDirectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.RelativeLocationDirectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelativeLocationDirectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIVELOCATIONDIRECTION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationDirection");
    
    
    /**
     * Gets the "RelativeLocationDirection" element
     */
    public org.apache.xmlbeans.XmlObject getRelativeLocationDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(RELATIVELOCATIONDIRECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RelativeLocationDirection" element
     */
    public void setRelativeLocationDirection(org.apache.xmlbeans.XmlObject relativeLocationDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(RELATIVELOCATIONDIRECTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(RELATIVELOCATIONDIRECTION$0);
            }
            target.set(relativeLocationDirection);
        }
    }
    
    /**
     * Appends and returns a new empty "RelativeLocationDirection" element
     */
    public org.apache.xmlbeans.XmlObject addNewRelativeLocationDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(RELATIVELOCATIONDIRECTION$0);
            return target;
        }
    }
}
