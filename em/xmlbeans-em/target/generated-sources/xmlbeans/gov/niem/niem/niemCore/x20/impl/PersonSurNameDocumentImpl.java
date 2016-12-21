/*
 * An XML document type.
 * Localname: PersonSurName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonSurNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonSurName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonSurNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonSurNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonSurNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONSURNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonSurName");
    
    
    /**
     * Gets the "PersonSurName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonSurName" element
     */
    public boolean isNilPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonSurName" element
     */
    public void setPersonSurName(gov.niem.niem.niemCore.x20.PersonNameTextType personSurName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONSURNAME$0);
            }
            target.set(personSurName);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonSurName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONSURNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonSurName" element
     */
    public void setNilPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONSURNAME$0);
            }
            target.setNil();
        }
    }
}
