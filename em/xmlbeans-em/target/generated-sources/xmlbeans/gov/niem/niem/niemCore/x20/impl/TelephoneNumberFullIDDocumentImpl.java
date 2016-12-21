/*
 * An XML document type.
 * Localname: TelephoneNumberFullID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TelephoneNumberFullIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one TelephoneNumberFullID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class TelephoneNumberFullIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.TelephoneNumberFullIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneNumberFullIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONENUMBERFULLID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneNumberFullID");
    
    
    /**
     * Gets the "TelephoneNumberFullID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneNumberFullID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERFULLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TelephoneNumberFullID" element
     */
    public boolean isNilTelephoneNumberFullID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERFULLID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TelephoneNumberFullID" element
     */
    public void setTelephoneNumberFullID(gov.niem.niem.proxy.xsd.x20.String telephoneNumberFullID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERFULLID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONENUMBERFULLID$0);
            }
            target.set(telephoneNumberFullID);
        }
    }
    
    /**
     * Appends and returns a new empty "TelephoneNumberFullID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneNumberFullID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONENUMBERFULLID$0);
            return target;
        }
    }
    
    /**
     * Nils the "TelephoneNumberFullID" element
     */
    public void setNilTelephoneNumberFullID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERFULLID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONENUMBERFULLID$0);
            }
            target.setNil();
        }
    }
}
