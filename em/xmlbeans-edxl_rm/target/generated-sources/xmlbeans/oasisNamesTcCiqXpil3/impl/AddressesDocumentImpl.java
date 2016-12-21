/*
 * An XML document type.
 * Localname: Addresses
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.AddressesDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Addresses(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class AddressesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.AddressesDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSES$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Addresses");
    
    
    /**
     * Gets the "Addresses" element
     */
    public oasisNamesTcCiqXpil3.AddressesDocument.Addresses getAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AddressesDocument.Addresses target = null;
            target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().find_element_user(ADDRESSES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Addresses" element
     */
    public void setAddresses(oasisNamesTcCiqXpil3.AddressesDocument.Addresses addresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AddressesDocument.Addresses target = null;
            target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().find_element_user(ADDRESSES$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().add_element_user(ADDRESSES$0);
            }
            target.set(addresses);
        }
    }
    
    /**
     * Appends and returns a new empty "Addresses" element
     */
    public oasisNamesTcCiqXpil3.AddressesDocument.Addresses addNewAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.AddressesDocument.Addresses target = null;
            target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses)get_store().add_element_user(ADDRESSES$0);
            return target;
        }
    }
    /**
     * An XML Addresses(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class AddressesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.AddressesDocument.Addresses
    {
        private static final long serialVersionUID = 1L;
        
        public AddressesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESS$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Address");
        
        
        /**
         * Gets array of all "Address" elements
         */
        public oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address[] getAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADDRESS$0, targetList);
                oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address[] result = new oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Address" element
         */
        public oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address getAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address target = null;
                target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address)get_store().find_element_user(ADDRESS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Address" element
         */
        public int sizeOfAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$0);
            }
        }
        
        /**
         * Sets array of all "Address" element
         */
        public void setAddressArray(oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address[] addressArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(addressArray, ADDRESS$0);
            }
        }
        
        /**
         * Sets ith "Address" element
         */
        public void setAddressArray(int i, oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address target = null;
                target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address)get_store().find_element_user(ADDRESS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(address);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Address" element
         */
        public oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address insertNewAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address target = null;
                target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address)get_store().insert_element_user(ADDRESS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Address" element
         */
        public oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address target = null;
                target = (oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address)get_store().add_element_user(ADDRESS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Address" element
         */
        public void removeAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$0, i);
            }
        }
        /**
         * An XML Address(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class AddressImpl extends oasisNamesTcCiqXal3.impl.AddressTypeImpl implements oasisNamesTcCiqXpil3.AddressesDocument.Addresses.Address
        {
            private static final long serialVersionUID = 1L;
            
            public AddressImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
