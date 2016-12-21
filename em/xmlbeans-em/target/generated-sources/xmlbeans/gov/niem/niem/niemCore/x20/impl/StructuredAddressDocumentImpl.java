/*
 * An XML document type.
 * Localname: StructuredAddress
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StructuredAddressDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one StructuredAddress(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class StructuredAddressDocumentImpl extends gov.niem.niem.niemCore.x20.impl.AddressRepresentationDocumentImpl implements gov.niem.niem.niemCore.x20.StructuredAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructuredAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREDADDRESS$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StructuredAddress");
    
    
    /**
     * Gets the "StructuredAddress" element
     */
    public gov.niem.niem.niemCore.x20.StructuredAddressType getStructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StructuredAddressType target = null;
            target = (gov.niem.niem.niemCore.x20.StructuredAddressType)get_store().find_element_user(STRUCTUREDADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StructuredAddress" element
     */
    public boolean isNilStructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StructuredAddressType target = null;
            target = (gov.niem.niem.niemCore.x20.StructuredAddressType)get_store().find_element_user(STRUCTUREDADDRESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StructuredAddress" element
     */
    public void setStructuredAddress(gov.niem.niem.niemCore.x20.StructuredAddressType structuredAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StructuredAddressType target = null;
            target = (gov.niem.niem.niemCore.x20.StructuredAddressType)get_store().find_element_user(STRUCTUREDADDRESS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.StructuredAddressType)get_store().add_element_user(STRUCTUREDADDRESS$0);
            }
            target.set(structuredAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuredAddress" element
     */
    public gov.niem.niem.niemCore.x20.StructuredAddressType addNewStructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StructuredAddressType target = null;
            target = (gov.niem.niem.niemCore.x20.StructuredAddressType)get_store().add_element_user(STRUCTUREDADDRESS$0);
            return target;
        }
    }
    
    /**
     * Nils the "StructuredAddress" element
     */
    public void setNilStructuredAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StructuredAddressType target = null;
            target = (gov.niem.niem.niemCore.x20.StructuredAddressType)get_store().find_element_user(STRUCTUREDADDRESS$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.StructuredAddressType)get_store().add_element_user(STRUCTUREDADDRESS$0);
            }
            target.setNil();
        }
    }
}
