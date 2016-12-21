/*
 * An XML document type.
 * Localname: TelephoneSuffixID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TelephoneSuffixIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one TelephoneSuffixID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class TelephoneSuffixIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.TelephoneSuffixIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneSuffixIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONESUFFIXID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneSuffixID");
    
    
    /**
     * Gets the "TelephoneSuffixID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneSuffixID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TelephoneSuffixID" element
     */
    public boolean isNilTelephoneSuffixID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TelephoneSuffixID" element
     */
    public void setTelephoneSuffixID(gov.niem.niem.proxy.xsd.x20.String telephoneSuffixID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONESUFFIXID$0);
            }
            target.set(telephoneSuffixID);
        }
    }
    
    /**
     * Appends and returns a new empty "TelephoneSuffixID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneSuffixID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONESUFFIXID$0);
            return target;
        }
    }
    
    /**
     * Nils the "TelephoneSuffixID" element
     */
    public void setNilTelephoneSuffixID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONESUFFIXID$0);
            }
            target.setNil();
        }
    }
}
