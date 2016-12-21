/*
 * An XML document type.
 * Localname: PersonFullName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonFullNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonFullName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonFullNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonFullNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonFullNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONFULLNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonFullName");
    
    
    /**
     * Gets the "PersonFullName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONFULLNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonFullName" element
     */
    public boolean isNilPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONFULLNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonFullName" element
     */
    public void setPersonFullName(gov.niem.niem.niemCore.x20.PersonNameTextType personFullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONFULLNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONFULLNAME$0);
            }
            target.set(personFullName);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonFullName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONFULLNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonFullName" element
     */
    public void setNilPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONFULLNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONFULLNAME$0);
            }
            target.setNil();
        }
    }
}
