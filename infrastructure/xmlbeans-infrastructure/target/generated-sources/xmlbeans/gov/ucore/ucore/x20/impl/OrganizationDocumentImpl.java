/*
 * An XML document type.
 * Localname: Organization
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.OrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Organization(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class OrganizationDocumentImpl extends gov.ucore.ucore.x20.impl.AgentAbstractDocumentImpl implements gov.ucore.ucore.x20.OrganizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Organization");
    
    
    /**
     * Gets the "Organization" element
     */
    public gov.ucore.ucore.x20.OrganizationType getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.OrganizationType target = null;
            target = (gov.ucore.ucore.x20.OrganizationType)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Organization" element
     */
    public void setOrganization(gov.ucore.ucore.x20.OrganizationType organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.OrganizationType target = null;
            target = (gov.ucore.ucore.x20.OrganizationType)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.OrganizationType)get_store().add_element_user(ORGANIZATION$0);
            }
            target.set(organization);
        }
    }
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    public gov.ucore.ucore.x20.OrganizationType addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.OrganizationType target = null;
            target = (gov.ucore.ucore.x20.OrganizationType)get_store().add_element_user(ORGANIZATION$0);
            return target;
        }
    }
}
