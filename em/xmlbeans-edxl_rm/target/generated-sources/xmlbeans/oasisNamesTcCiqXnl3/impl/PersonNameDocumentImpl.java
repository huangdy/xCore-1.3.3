/*
 * An XML document type.
 * Localname: PersonName
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.PersonNameDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3.impl;
/**
 * A document containing one PersonName(@urn:oasis:names:tc:ciq:xnl:3) element.
 *
 * This is a complex type.
 */
public class PersonNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnl3.PersonNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONNAME$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PersonName");
    
    
    /**
     * Gets the "PersonName" element
     */
    public oasisNamesTcCiqXnl3.PersonNameType getPersonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameType target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameType)get_store().find_element_user(PERSONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonName" element
     */
    public void setPersonName(oasisNamesTcCiqXnl3.PersonNameType personName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameType target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameType)get_store().find_element_user(PERSONNAME$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.PersonNameType)get_store().add_element_user(PERSONNAME$0);
            }
            target.set(personName);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonName" element
     */
    public oasisNamesTcCiqXnl3.PersonNameType addNewPersonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PersonNameType target = null;
            target = (oasisNamesTcCiqXnl3.PersonNameType)get_store().add_element_user(PERSONNAME$0);
            return target;
        }
    }
}
