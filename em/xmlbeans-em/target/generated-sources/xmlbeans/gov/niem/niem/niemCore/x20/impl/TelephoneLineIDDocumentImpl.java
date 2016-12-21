/*
 * An XML document type.
 * Localname: TelephoneLineID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TelephoneLineIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one TelephoneLineID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class TelephoneLineIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.TelephoneLineIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneLineIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONELINEID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneLineID");
    
    
    /**
     * Gets the "TelephoneLineID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneLineID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONELINEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TelephoneLineID" element
     */
    public boolean isNilTelephoneLineID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONELINEID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TelephoneLineID" element
     */
    public void setTelephoneLineID(gov.niem.niem.proxy.xsd.x20.String telephoneLineID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONELINEID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONELINEID$0);
            }
            target.set(telephoneLineID);
        }
    }
    
    /**
     * Appends and returns a new empty "TelephoneLineID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneLineID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONELINEID$0);
            return target;
        }
    }
    
    /**
     * Nils the "TelephoneLineID" element
     */
    public void setNilTelephoneLineID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONELINEID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONELINEID$0);
            }
            target.setNil();
        }
    }
}
