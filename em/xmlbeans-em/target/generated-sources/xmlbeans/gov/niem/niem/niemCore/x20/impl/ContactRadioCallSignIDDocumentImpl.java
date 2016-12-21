/*
 * An XML document type.
 * Localname: ContactRadioCallSignID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactRadioCallSignIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ContactRadioCallSignID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ContactRadioCallSignIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ContactRadioCallSignIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContactRadioCallSignIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTRADIOCALLSIGNID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactRadioCallSignID");
    
    
    /**
     * Gets the "ContactRadioCallSignID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getContactRadioCallSignID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(CONTACTRADIOCALLSIGNID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ContactRadioCallSignID" element
     */
    public boolean isNilContactRadioCallSignID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(CONTACTRADIOCALLSIGNID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ContactRadioCallSignID" element
     */
    public void setContactRadioCallSignID(gov.niem.niem.proxy.xsd.x20.String contactRadioCallSignID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(CONTACTRADIOCALLSIGNID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(CONTACTRADIOCALLSIGNID$0);
            }
            target.set(contactRadioCallSignID);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactRadioCallSignID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewContactRadioCallSignID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(CONTACTRADIOCALLSIGNID$0);
            return target;
        }
    }
    
    /**
     * Nils the "ContactRadioCallSignID" element
     */
    public void setNilContactRadioCallSignID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(CONTACTRADIOCALLSIGNID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(CONTACTRADIOCALLSIGNID$0);
            }
            target.setNil();
        }
    }
}
