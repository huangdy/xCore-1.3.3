/*
 * An XML document type.
 * Localname: AddressRepresentation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.AddressRepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one AddressRepresentation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AddressRepresentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.AddressRepresentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressRepresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets the "AddressRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject getAddressRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADDRESSREPRESENTATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddressRepresentation" element
     */
    public void setAddressRepresentation(org.apache.xmlbeans.XmlObject addressRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADDRESSREPRESENTATION$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ADDRESSREPRESENTATION$0);
            }
            target.set(addressRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "AddressRepresentation" element
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
}
