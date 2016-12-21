/*
 * An XML document type.
 * Localname: TelephoneCountryCodeID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TelephoneCountryCodeIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one TelephoneCountryCodeID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class TelephoneCountryCodeIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.TelephoneCountryCodeIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneCountryCodeIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONECOUNTRYCODEID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneCountryCodeID");
    
    
    /**
     * Gets the "TelephoneCountryCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneCountryCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONECOUNTRYCODEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TelephoneCountryCodeID" element
     */
    public boolean isNilTelephoneCountryCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONECOUNTRYCODEID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TelephoneCountryCodeID" element
     */
    public void setTelephoneCountryCodeID(gov.niem.niem.proxy.xsd.x20.String telephoneCountryCodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONECOUNTRYCODEID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONECOUNTRYCODEID$0);
            }
            target.set(telephoneCountryCodeID);
        }
    }
    
    /**
     * Appends and returns a new empty "TelephoneCountryCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneCountryCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONECOUNTRYCODEID$0);
            return target;
        }
    }
    
    /**
     * Nils the "TelephoneCountryCodeID" element
     */
    public void setNilTelephoneCountryCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONECOUNTRYCODEID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONECOUNTRYCODEID$0);
            }
            target.setNil();
        }
    }
}
