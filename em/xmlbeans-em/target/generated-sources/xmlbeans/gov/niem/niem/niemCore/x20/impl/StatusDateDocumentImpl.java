/*
 * An XML document type.
 * Localname: StatusDate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StatusDateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one StatusDate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class StatusDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.StatusDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSDATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StatusDate");
    
    
    /**
     * Gets the "StatusDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType getStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(STATUSDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StatusDate" element
     */
    public boolean isNilStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(STATUSDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StatusDate" element
     */
    public void setStatusDate(gov.niem.niem.niemCore.x20.DateType statusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(STATUSDATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(STATUSDATE$0);
            }
            target.set(statusDate);
        }
    }
    
    /**
     * Appends and returns a new empty "StatusDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType addNewStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(STATUSDATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "StatusDate" element
     */
    public void setNilStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(STATUSDATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(STATUSDATE$0);
            }
            target.setNil();
        }
    }
}
