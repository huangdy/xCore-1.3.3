/*
 * An XML document type.
 * Localname: OrganisationName
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.OrganisationNameDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3.impl;
/**
 * A document containing one OrganisationName(@urn:oasis:names:tc:ciq:xnl:3) element.
 *
 * This is a complex type.
 */
public class OrganisationNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnl3.OrganisationNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONNAME$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "OrganisationName");
    
    
    /**
     * Gets the "OrganisationName" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType getOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().find_element_user(ORGANISATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationName" element
     */
    public void setOrganisationName(oasisNamesTcCiqXnl3.OrganisationNameType organisationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().find_element_user(ORGANISATIONNAME$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().add_element_user(ORGANISATIONNAME$0);
            }
            target.set(organisationName);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationName" element
     */
    public oasisNamesTcCiqXnl3.OrganisationNameType addNewOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.OrganisationNameType target = null;
            target = (oasisNamesTcCiqXnl3.OrganisationNameType)get_store().add_element_user(ORGANISATIONNAME$0);
            return target;
        }
    }
}
