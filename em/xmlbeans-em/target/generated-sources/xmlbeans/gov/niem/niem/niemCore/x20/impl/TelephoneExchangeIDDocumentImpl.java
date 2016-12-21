/*
 * An XML document type.
 * Localname: TelephoneExchangeID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TelephoneExchangeIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one TelephoneExchangeID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class TelephoneExchangeIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.TelephoneExchangeIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneExchangeIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONEEXCHANGEID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneExchangeID");
    
    
    /**
     * Gets the "TelephoneExchangeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneExchangeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEEXCHANGEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TelephoneExchangeID" element
     */
    public boolean isNilTelephoneExchangeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEEXCHANGEID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TelephoneExchangeID" element
     */
    public void setTelephoneExchangeID(gov.niem.niem.proxy.xsd.x20.String telephoneExchangeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEEXCHANGEID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONEEXCHANGEID$0);
            }
            target.set(telephoneExchangeID);
        }
    }
    
    /**
     * Appends and returns a new empty "TelephoneExchangeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneExchangeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONEEXCHANGEID$0);
            return target;
        }
    }
    
    /**
     * Nils the "TelephoneExchangeID" element
     */
    public void setNilTelephoneExchangeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEEXCHANGEID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONEEXCHANGEID$0);
            }
            target.setNil();
        }
    }
}
