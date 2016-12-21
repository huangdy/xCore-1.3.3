/*
 * An XML document type.
 * Localname: PhysicalAddress
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PhysicalAddressDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one PhysicalAddress(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PhysicalAddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.PhysicalAddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public PhysicalAddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHYSICALADDRESS$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PhysicalAddress");
    
    
    /**
     * Gets the "PhysicalAddress" element
     */
    public gov.ucore.ucore.x20.PhysicalAddressType getPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PhysicalAddressType target = null;
            target = (gov.ucore.ucore.x20.PhysicalAddressType)get_store().find_element_user(PHYSICALADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PhysicalAddress" element
     */
    public void setPhysicalAddress(gov.ucore.ucore.x20.PhysicalAddressType physicalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PhysicalAddressType target = null;
            target = (gov.ucore.ucore.x20.PhysicalAddressType)get_store().find_element_user(PHYSICALADDRESS$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PhysicalAddressType)get_store().add_element_user(PHYSICALADDRESS$0);
            }
            target.set(physicalAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "PhysicalAddress" element
     */
    public gov.ucore.ucore.x20.PhysicalAddressType addNewPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PhysicalAddressType target = null;
            target = (gov.ucore.ucore.x20.PhysicalAddressType)get_store().add_element_user(PHYSICALADDRESS$0);
            return target;
        }
    }
}
