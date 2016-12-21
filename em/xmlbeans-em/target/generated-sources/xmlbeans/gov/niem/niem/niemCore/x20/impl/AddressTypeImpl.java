/*
 * XML Type:  AddressType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.AddressType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML AddressType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class AddressTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.AddressType
{
    private static final long serialVersionUID = 1L;
    
    public AddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressRepresentation");
    private static final org.apache.xmlbeans.QNameSet ADDRESSREPRESENTATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StructuredAddress"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressFullText"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressRepresentation"),
    });
    
    
    /**
     * Gets array of all "AddressRepresentation" elements
     */
    public org.apache.xmlbeans.XmlObject[] getAddressRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSREPRESENTATION$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AddressRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject getAddressRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADDRESSREPRESENTATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AddressRepresentation" element
     */
    public int sizeOfAddressRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSREPRESENTATION$1);
        }
    }
    
    /**
     * Sets array of all "AddressRepresentation" element
     */
    public void setAddressRepresentationArray(org.apache.xmlbeans.XmlObject[] addressRepresentationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressRepresentationArray, ADDRESSREPRESENTATION$0, ADDRESSREPRESENTATION$1);
        }
    }
    
    /**
     * Sets ith "AddressRepresentation" element
     */
    public void setAddressRepresentationArray(int i, org.apache.xmlbeans.XmlObject addressRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADDRESSREPRESENTATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addressRepresentation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject insertNewAddressRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ADDRESSREPRESENTATION$1, ADDRESSREPRESENTATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject addNewAddressRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ADDRESSREPRESENTATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AddressRepresentation" element
     */
    public void removeAddressRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSREPRESENTATION$1, i);
        }
    }
}
