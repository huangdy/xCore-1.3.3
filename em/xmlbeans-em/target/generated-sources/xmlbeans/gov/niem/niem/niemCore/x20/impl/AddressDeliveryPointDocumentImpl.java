/*
 * An XML document type.
 * Localname: AddressDeliveryPoint
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.AddressDeliveryPointDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one AddressDeliveryPoint(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AddressDeliveryPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.AddressDeliveryPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressDeliveryPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSDELIVERYPOINT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressDeliveryPoint");
    private static final org.apache.xmlbeans.QNameSet ADDRESSDELIVERYPOINT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressDeliveryPoint"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationStreet"),
    });
    
    
    /**
     * Gets the "AddressDeliveryPoint" element
     */
    public org.apache.xmlbeans.XmlObject getAddressDeliveryPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADDRESSDELIVERYPOINT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddressDeliveryPoint" element
     */
    public void setAddressDeliveryPoint(org.apache.xmlbeans.XmlObject addressDeliveryPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADDRESSDELIVERYPOINT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ADDRESSDELIVERYPOINT$0);
            }
            target.set(addressDeliveryPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "AddressDeliveryPoint" element
     */
    public org.apache.xmlbeans.XmlObject addNewAddressDeliveryPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ADDRESSDELIVERYPOINT$0);
            return target;
        }
    }
}
