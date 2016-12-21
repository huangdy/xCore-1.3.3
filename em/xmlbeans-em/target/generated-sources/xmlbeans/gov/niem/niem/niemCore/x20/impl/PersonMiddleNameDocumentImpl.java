/*
 * An XML document type.
 * Localname: PersonMiddleName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonMiddleNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonMiddleName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonMiddleNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonMiddleNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonMiddleNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONMIDDLENAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonMiddleName");
    
    
    /**
     * Gets the "PersonMiddleName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMIDDLENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonMiddleName" element
     */
    public boolean isNilPersonMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMIDDLENAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonMiddleName" element
     */
    public void setPersonMiddleName(gov.niem.niem.niemCore.x20.PersonNameTextType personMiddleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMIDDLENAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONMIDDLENAME$0);
            }
            target.set(personMiddleName);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonMiddleName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONMIDDLENAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonMiddleName" element
     */
    public void setNilPersonMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMIDDLENAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONMIDDLENAME$0);
            }
            target.setNil();
        }
    }
}
