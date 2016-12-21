/*
 * An XML document type.
 * Localname: TelephoneAreaCodeID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TelephoneAreaCodeIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one TelephoneAreaCodeID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class TelephoneAreaCodeIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.TelephoneAreaCodeIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public TelephoneAreaCodeIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONEAREACODEID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneAreaCodeID");
    
    
    /**
     * Gets the "TelephoneAreaCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneAreaCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEAREACODEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "TelephoneAreaCodeID" element
     */
    public boolean isNilTelephoneAreaCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEAREACODEID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TelephoneAreaCodeID" element
     */
    public void setTelephoneAreaCodeID(gov.niem.niem.proxy.xsd.x20.String telephoneAreaCodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEAREACODEID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONEAREACODEID$0);
            }
            target.set(telephoneAreaCodeID);
        }
    }
    
    /**
     * Appends and returns a new empty "TelephoneAreaCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneAreaCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONEAREACODEID$0);
            return target;
        }
    }
    
    /**
     * Nils the "TelephoneAreaCodeID" element
     */
    public void setNilTelephoneAreaCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEAREACODEID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONEAREACODEID$0);
            }
            target.setNil();
        }
    }
}
