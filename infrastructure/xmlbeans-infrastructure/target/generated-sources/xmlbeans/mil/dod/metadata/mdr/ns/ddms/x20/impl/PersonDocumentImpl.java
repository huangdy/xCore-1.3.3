/*
 * An XML document type.
 * Localname: Person
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.PersonDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one Person(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class PersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.PersonDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Person");
    
    
    /**
     * Gets the "Person" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PersonType getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PersonType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PersonType)get_store().find_element_user(PERSON$0, 0);
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
    public void setPerson(mil.dod.metadata.mdr.ns.ddms.x20.PersonType person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PersonType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PersonType)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PersonType)get_store().add_element_user(PERSON$0);
            }
            target.set(person);
        }
    }
    
    /**
     * Appends and returns a new empty "Person" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PersonType addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PersonType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PersonType)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
}
