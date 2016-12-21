/*
 * An XML document type.
 * Localname: OrganizationParent
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationParentDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one OrganizationParent(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationParentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.OrganizationParentDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationParentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONPARENT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationParent");
    
    
    /**
     * Gets the "OrganizationParent" element
     */
    public org.apache.xmlbeans.XmlObject getOrganizationParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ORGANIZATIONPARENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganizationParent" element
     */
    public void setOrganizationParent(org.apache.xmlbeans.XmlObject organizationParent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ORGANIZATIONPARENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ORGANIZATIONPARENT$0);
            }
            target.set(organizationParent);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationParent" element
     */
    public org.apache.xmlbeans.XmlObject addNewOrganizationParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ORGANIZATIONPARENT$0);
            return target;
        }
    }
}
