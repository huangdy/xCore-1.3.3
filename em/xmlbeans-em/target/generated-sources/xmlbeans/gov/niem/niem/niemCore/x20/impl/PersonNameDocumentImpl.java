/*
 * An XML document type.
 * Localname: PersonName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonName");
    
    
    /**
     * Gets the "PersonName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameType getPersonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().find_element_user(PERSONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonName" element
     */
    public boolean isNilPersonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().find_element_user(PERSONNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonName" element
     */
    public void setPersonName(gov.niem.niem.niemCore.x20.PersonNameType personName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().find_element_user(PERSONNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().add_element_user(PERSONNAME$0);
            }
            target.set(personName);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameType addNewPersonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().add_element_user(PERSONNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonName" element
     */
    public void setNilPersonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().find_element_user(PERSONNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().add_element_user(PERSONNAME$0);
            }
            target.setNil();
        }
    }
}
