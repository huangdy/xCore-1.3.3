/*
 * An XML document type.
 * Localname: Person
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PersonDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Person(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PersonDocumentImpl extends gov.ucore.ucore.x20.impl.AgentAbstractDocumentImpl implements gov.ucore.ucore.x20.PersonDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Person");
    
    
    /**
     * Gets the "Person" element
     */
    public gov.ucore.ucore.x20.PersonType getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonType target = null;
            target = (gov.ucore.ucore.x20.PersonType)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Person" element
     */
    public void setPerson(gov.ucore.ucore.x20.PersonType person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonType target = null;
            target = (gov.ucore.ucore.x20.PersonType)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PersonType)get_store().add_element_user(PERSON$0);
            }
            target.set(person);
        }
    }
    
    /**
     * Appends and returns a new empty "Person" element
     */
    public gov.ucore.ucore.x20.PersonType addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonType target = null;
            target = (gov.ucore.ucore.x20.PersonType)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
}
