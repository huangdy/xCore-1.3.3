/*
 * An XML document type.
 * Localname: ContactMeans
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactMeansDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ContactMeans(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactMeansDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ContactMeansDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactMeansDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets the "ContactMeans" element
     */
    public org.apache.xmlbeans.XmlObject getContactMeans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONTACTMEANS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContactMeans" element
     */
    public void setContactMeans(org.apache.xmlbeans.XmlObject contactMeans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONTACTMEANS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONTACTMEANS$0);
            }
            target.set(contactMeans);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactMeans" element
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
}
