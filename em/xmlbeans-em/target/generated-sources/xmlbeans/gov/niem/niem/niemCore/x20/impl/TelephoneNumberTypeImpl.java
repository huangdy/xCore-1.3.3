/*
 * XML Type:  TelephoneNumberType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TelephoneNumberType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML TelephoneNumberType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class TelephoneNumberTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.TelephoneNumberType
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneNumberTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONENUMBERREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneNumberRepresentation");
    private static final org.apache.xmlbeans.QNameSet TELEPHONENUMBERREPRESENTATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneNumberRepresentation"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "FullTelephoneNumber"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "InternationalTelephoneNumber"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "NANPTelephoneNumber"),
    });
    
    
    /**
     * Gets array of all "TelephoneNumberRepresentation" elements
     */
    public org.apache.xmlbeans.XmlObject[] getTelephoneNumberRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONENUMBERREPRESENTATION$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TelephoneNumberRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject getTelephoneNumberRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TELEPHONENUMBERREPRESENTATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TelephoneNumberRepresentation" element
     */
    public int sizeOfTelephoneNumberRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONENUMBERREPRESENTATION$1);
        }
    }
    
    /**
     * Sets array of all "TelephoneNumberRepresentation" element
     */
    public void setTelephoneNumberRepresentationArray(org.apache.xmlbeans.XmlObject[] telephoneNumberRepresentationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneNumberRepresentationArray, TELEPHONENUMBERREPRESENTATION$0, TELEPHONENUMBERREPRESENTATION$1);
        }
    }
    
    /**
     * Sets ith "TelephoneNumberRepresentation" element
     */
    public void setTelephoneNumberRepresentationArray(int i, org.apache.xmlbeans.XmlObject telephoneNumberRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TELEPHONENUMBERREPRESENTATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephoneNumberRepresentation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneNumberRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject insertNewTelephoneNumberRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(TELEPHONENUMBERREPRESENTATION$1, TELEPHONENUMBERREPRESENTATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneNumberRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject addNewTelephoneNumberRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(TELEPHONENUMBERREPRESENTATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TelephoneNumberRepresentation" element
     */
    public void removeTelephoneNumberRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONENUMBERREPRESENTATION$1, i);
        }
    }
}
