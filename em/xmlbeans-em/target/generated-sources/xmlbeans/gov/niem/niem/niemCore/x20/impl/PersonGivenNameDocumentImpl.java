/*
 * An XML document type.
 * Localname: PersonGivenName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonGivenNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonGivenName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonGivenNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonGivenNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonGivenNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONGIVENNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonGivenName");
    
    
    /**
     * Gets the "PersonGivenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONGIVENNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonGivenName" element
     */
    public boolean isNilPersonGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONGIVENNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonGivenName" element
     */
    public void setPersonGivenName(gov.niem.niem.niemCore.x20.PersonNameTextType personGivenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONGIVENNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONGIVENNAME$0);
            }
            target.set(personGivenName);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonGivenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONGIVENNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonGivenName" element
     */
    public void setNilPersonGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONGIVENNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONGIVENNAME$0);
            }
            target.setNil();
        }
    }
}
