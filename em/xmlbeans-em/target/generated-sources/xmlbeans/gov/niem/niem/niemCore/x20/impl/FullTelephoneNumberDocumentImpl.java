/*
 * An XML document type.
 * Localname: FullTelephoneNumber
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.FullTelephoneNumberDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one FullTelephoneNumber(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class FullTelephoneNumberDocumentImpl extends gov.niem.niem.niemCore.x20.impl.TelephoneNumberRepresentationDocumentImpl implements gov.niem.niem.niemCore.x20.FullTelephoneNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public FullTelephoneNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLTELEPHONENUMBER$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "FullTelephoneNumber");
    
    
    /**
     * Gets the "FullTelephoneNumber" element
     */
    public gov.niem.niem.niemCore.x20.FullTelephoneNumberType getFullTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.FullTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.FullTelephoneNumberType)get_store().find_element_user(FULLTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FullTelephoneNumber" element
     */
    public boolean isNilFullTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.FullTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.FullTelephoneNumberType)get_store().find_element_user(FULLTELEPHONENUMBER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FullTelephoneNumber" element
     */
    public void setFullTelephoneNumber(gov.niem.niem.niemCore.x20.FullTelephoneNumberType fullTelephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.FullTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.FullTelephoneNumberType)get_store().find_element_user(FULLTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.FullTelephoneNumberType)get_store().add_element_user(FULLTELEPHONENUMBER$0);
            }
            target.set(fullTelephoneNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "FullTelephoneNumber" element
     */
    public gov.niem.niem.niemCore.x20.FullTelephoneNumberType addNewFullTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.FullTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.FullTelephoneNumberType)get_store().add_element_user(FULLTELEPHONENUMBER$0);
            return target;
        }
    }
    
    /**
     * Nils the "FullTelephoneNumber" element
     */
    public void setNilFullTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.FullTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.FullTelephoneNumberType)get_store().find_element_user(FULLTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.FullTelephoneNumberType)get_store().add_element_user(FULLTELEPHONENUMBER$0);
            }
            target.setNil();
        }
    }
}
