/*
 * An XML document type.
 * Localname: PersonDetails
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.PersonDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one PersonDetails(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class PersonDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.PersonDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONDETAILS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "PersonDetails");
    
    
    /**
     * Gets the "PersonDetails" element
     */
    public oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails getPersonDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails target = null;
            target = (oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails)get_store().find_element_user(PERSONDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonDetails" element
     */
    public void setPersonDetails(oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails personDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails target = null;
            target = (oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails)get_store().find_element_user(PERSONDETAILS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails)get_store().add_element_user(PERSONDETAILS$0);
            }
            target.set(personDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonDetails" element
     */
    public oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails addNewPersonDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails target = null;
            target = (oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails)get_store().add_element_user(PERSONDETAILS$0);
            return target;
        }
    }
    /**
     * An XML PersonDetails(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class PersonDetailsImpl extends oasisNamesTcCiqXpil3.impl.PersonDetailsTypeImpl implements oasisNamesTcCiqXpil3.PersonDetailsDocument.PersonDetails
    {
        private static final long serialVersionUID = 1L;
        
        public PersonDetailsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
