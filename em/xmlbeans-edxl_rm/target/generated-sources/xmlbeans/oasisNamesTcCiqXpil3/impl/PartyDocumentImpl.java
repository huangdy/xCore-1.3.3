/*
 * An XML document type.
 * Localname: Party
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.PartyDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Party(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class PartyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.PartyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PartyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTY$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Party");
    
    
    /**
     * Gets the "Party" element
     */
    public oasisNamesTcCiqXpil3.PartyType getParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PartyType target = null;
            target = (oasisNamesTcCiqXpil3.PartyType)get_store().find_element_user(PARTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Party" element
     */
    public void setParty(oasisNamesTcCiqXpil3.PartyType party)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PartyType target = null;
            target = (oasisNamesTcCiqXpil3.PartyType)get_store().find_element_user(PARTY$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.PartyType)get_store().add_element_user(PARTY$0);
            }
            target.set(party);
        }
    }
    
    /**
     * Appends and returns a new empty "Party" element
     */
    public oasisNamesTcCiqXpil3.PartyType addNewParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PartyType target = null;
            target = (oasisNamesTcCiqXpil3.PartyType)get_store().add_element_user(PARTY$0);
            return target;
        }
    }
}
