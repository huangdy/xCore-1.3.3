/*
 * An XML document type.
 * Localname: TimeAbstract
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.TimeAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one TimeAbstract(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class TimeAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.TimeAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEABSTRACT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeAbstract");
    private static final org.apache.xmlbeans.QNameSet TIMEABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeInstant"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "TimeInterval"),
    });
    
    
    /**
     * Gets the "TimeAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getTimeAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TIMEABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeAbstract" element
     */
    public void setTimeAbstract(org.apache.xmlbeans.XmlObject timeAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TIMEABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(TIMEABSTRACT$0);
            }
            target.set(timeAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewTimeAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(TIMEABSTRACT$0);
            return target;
        }
    }
}
