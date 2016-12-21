/*
 * An XML document type.
 * Localname: TelephoneNumberRepresentation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TelephoneNumberRepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one TelephoneNumberRepresentation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class TelephoneNumberRepresentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.TelephoneNumberRepresentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneNumberRepresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets the "TelephoneNumberRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject getTelephoneNumberRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TELEPHONENUMBERREPRESENTATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TelephoneNumberRepresentation" element
     */
    public void setTelephoneNumberRepresentation(org.apache.xmlbeans.XmlObject telephoneNumberRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TELEPHONENUMBERREPRESENTATION$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(TELEPHONENUMBERREPRESENTATION$0);
            }
            target.set(telephoneNumberRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "TelephoneNumberRepresentation" element
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
}
