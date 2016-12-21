/*
 * An XML document type.
 * Localname: DateTime
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.DateTimeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one DateTime(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class DateTimeDocumentImpl extends gov.niem.niem.niemCore.x20.impl.DateRepresentationDocumentImpl implements gov.niem.niem.niemCore.x20.DateTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATETIME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "DateTime");
    
    
    /**
     * Gets the "DateTime" element
     */
    public gov.niem.niem.proxy.xsd.x20.DateTime getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd.x20.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "DateTime" element
     */
    public boolean isNilDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd.x20.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DateTime" element
     */
    public void setDateTime(gov.niem.niem.proxy.xsd.x20.DateTime dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd.x20.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.DateTime)get_store().add_element_user(DATETIME$0);
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Appends and returns a new empty "DateTime" element
     */
    public gov.niem.niem.proxy.xsd.x20.DateTime addNewDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd.x20.DateTime)get_store().add_element_user(DATETIME$0);
            return target;
        }
    }
    
    /**
     * Nils the "DateTime" element
     */
    public void setNilDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.DateTime target = null;
            target = (gov.niem.niem.proxy.xsd.x20.DateTime)get_store().find_element_user(DATETIME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.DateTime)get_store().add_element_user(DATETIME$0);
            }
            target.setNil();
        }
    }
}
