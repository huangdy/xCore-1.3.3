/*
 * An XML document type.
 * Localname: Address
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3.impl;
/**
 * A document containing one Address(@urn:oasis:names:tc:ciq:xal:3) element.
 *
 * This is a complex type.
 */
public class AddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXal3.AddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Address");
    
    
    /**
     * Gets the "Address" element
     */
    public oasisNamesTcCiqXal3.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType target = null;
            target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(oasisNamesTcCiqXal3.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType target = null;
            target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public oasisNamesTcCiqXal3.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType target = null;
            target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
}
