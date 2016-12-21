/*
 * XML Type:  ContactInformationType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactInformationType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML ContactInformationType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class ContactInformationTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.ContactInformationType
{
    private static final long serialVersionUID = 1L;
    
    public ContactInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTMEANS$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactMeans");
    private static final org.apache.xmlbeans.QNameSet CONTACTMEANS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactEmailID"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactTelephoneNumber"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactWebsiteURI"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactMeans"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactInstantMessenger"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactMailingAddress"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactRadio"),
    });
    
    
    /**
     * Gets array of all "ContactMeans" elements
     */
    public org.apache.xmlbeans.XmlObject[] getContactMeansArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACTMEANS$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ContactMeans" element
     */
    public org.apache.xmlbeans.XmlObject getContactMeansArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONTACTMEANS$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ContactMeans" element
     */
    public int sizeOfContactMeansArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTMEANS$1);
        }
    }
    
    /**
     * Sets array of all "ContactMeans" element
     */
    public void setContactMeansArray(org.apache.xmlbeans.XmlObject[] contactMeansArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactMeansArray, CONTACTMEANS$0, CONTACTMEANS$1);
        }
    }
    
    /**
     * Sets ith "ContactMeans" element
     */
    public void setContactMeansArray(int i, org.apache.xmlbeans.XmlObject contactMeans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONTACTMEANS$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contactMeans);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContactMeans" element
     */
    public org.apache.xmlbeans.XmlObject insertNewContactMeans(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(CONTACTMEANS$1, CONTACTMEANS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContactMeans" element
     */
    public org.apache.xmlbeans.XmlObject addNewContactMeans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONTACTMEANS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ContactMeans" element
     */
    public void removeContactMeans(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTMEANS$1, i);
        }
    }
}
