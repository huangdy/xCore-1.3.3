/*
 * An XML document type.
 * Localname: PartyName
 * Namespace: urn:oasis:names:tc:ciq:xnl:3
 * Java type: oasisNamesTcCiqXnl3.PartyNameDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXnl3.impl;
/**
 * A document containing one PartyName(@urn:oasis:names:tc:ciq:xnl:3) element.
 *
 * This is a complex type.
 */
public class PartyNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXnl3.PartyNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public PartyNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTYNAME$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xnl:3", "PartyName");
    
    
    /**
     * Gets the "PartyName" element
     */
    public oasisNamesTcCiqXnl3.PartyNameType getPartyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().find_element_user(PARTYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PartyName" element
     */
    public void setPartyName(oasisNamesTcCiqXnl3.PartyNameType partyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().find_element_user(PARTYNAME$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().add_element_user(PARTYNAME$0);
            }
            target.set(partyName);
        }
    }
    
    /**
     * Appends and returns a new empty "PartyName" element
     */
    public oasisNamesTcCiqXnl3.PartyNameType addNewPartyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXnl3.PartyNameType target = null;
            target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().add_element_user(PARTYNAME$0);
            return target;
        }
    }
}
