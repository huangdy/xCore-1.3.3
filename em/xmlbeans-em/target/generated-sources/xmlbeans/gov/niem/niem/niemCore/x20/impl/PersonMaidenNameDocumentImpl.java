/*
 * An XML document type.
 * Localname: PersonMaidenName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonMaidenNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonMaidenName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonMaidenNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonMaidenNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonMaidenNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONMAIDENNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonMaidenName");
    
    
    /**
     * Gets the "PersonMaidenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMAIDENNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonMaidenName" element
     */
    public boolean isNilPersonMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMAIDENNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonMaidenName" element
     */
    public void setPersonMaidenName(gov.niem.niem.niemCore.x20.PersonNameTextType personMaidenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMAIDENNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONMAIDENNAME$0);
            }
            target.set(personMaidenName);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonMaidenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONMAIDENNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonMaidenName" element
     */
    public void setNilPersonMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMAIDENNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONMAIDENNAME$0);
            }
            target.setNil();
        }
    }
}
