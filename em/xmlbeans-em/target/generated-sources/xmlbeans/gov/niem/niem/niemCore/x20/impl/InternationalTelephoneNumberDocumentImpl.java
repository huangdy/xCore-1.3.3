/*
 * An XML document type.
 * Localname: InternationalTelephoneNumber
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.InternationalTelephoneNumberDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one InternationalTelephoneNumber(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class InternationalTelephoneNumberDocumentImpl extends gov.niem.niem.niemCore.x20.impl.TelephoneNumberRepresentationDocumentImpl implements gov.niem.niem.niemCore.x20.InternationalTelephoneNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public InternationalTelephoneNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERNATIONALTELEPHONENUMBER$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "InternationalTelephoneNumber");
    
    
    /**
     * Gets the "InternationalTelephoneNumber" element
     */
    public gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType getInternationalTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType)get_store().find_element_user(INTERNATIONALTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "InternationalTelephoneNumber" element
     */
    public boolean isNilInternationalTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType)get_store().find_element_user(INTERNATIONALTELEPHONENUMBER$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "InternationalTelephoneNumber" element
     */
    public void setInternationalTelephoneNumber(gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType internationalTelephoneNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType)get_store().find_element_user(INTERNATIONALTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType)get_store().add_element_user(INTERNATIONALTELEPHONENUMBER$0);
            }
            target.set(internationalTelephoneNumber);
        }
    }
    
    /**
     * Appends and returns a new empty "InternationalTelephoneNumber" element
     */
    public gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType addNewInternationalTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType)get_store().add_element_user(INTERNATIONALTELEPHONENUMBER$0);
            return target;
        }
    }
    
    /**
     * Nils the "InternationalTelephoneNumber" element
     */
    public void setNilInternationalTelephoneNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType target = null;
            target = (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType)get_store().find_element_user(INTERNATIONALTELEPHONENUMBER$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType)get_store().add_element_user(INTERNATIONALTELEPHONENUMBER$0);
            }
            target.setNil();
        }
    }
}
