/*
 * An XML document type.
 * Localname: OrganisationDetails
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.OrganisationDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one OrganisationDetails(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class OrganisationDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.OrganisationDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONDETAILS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OrganisationDetails");
    
    
    /**
     * Gets the "OrganisationDetails" element
     */
    public oasisNamesTcCiqXpil3.OrganisationDetailsType getOrganisationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationDetailsType target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationDetailsType)get_store().find_element_user(ORGANISATIONDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationDetails" element
     */
    public void setOrganisationDetails(oasisNamesTcCiqXpil3.OrganisationDetailsType organisationDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationDetailsType target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationDetailsType)get_store().find_element_user(ORGANISATIONDETAILS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.OrganisationDetailsType)get_store().add_element_user(ORGANISATIONDETAILS$0);
            }
            target.set(organisationDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationDetails" element
     */
    public oasisNamesTcCiqXpil3.OrganisationDetailsType addNewOrganisationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OrganisationDetailsType target = null;
            target = (oasisNamesTcCiqXpil3.OrganisationDetailsType)get_store().add_element_user(ORGANISATIONDETAILS$0);
            return target;
        }
    }
}
