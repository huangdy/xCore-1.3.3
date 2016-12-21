/*
 * An XML document type.
 * Localname: InstantMessengerClientName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.InstantMessengerClientNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one InstantMessengerClientName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class InstantMessengerClientNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.InstantMessengerClientNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstantMessengerClientNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANTMESSENGERCLIENTNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "InstantMessengerClientName");
    
    
    /**
     * Gets the "InstantMessengerClientName" element
     */
    public gov.niem.niem.niemCore.x20.TextType getInstantMessengerClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INSTANTMESSENGERCLIENTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "InstantMessengerClientName" element
     */
    public boolean isNilInstantMessengerClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INSTANTMESSENGERCLIENTNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "InstantMessengerClientName" element
     */
    public void setInstantMessengerClientName(gov.niem.niem.niemCore.x20.TextType instantMessengerClientName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INSTANTMESSENGERCLIENTNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(INSTANTMESSENGERCLIENTNAME$0);
            }
            target.set(instantMessengerClientName);
        }
    }
    
    /**
     * Appends and returns a new empty "InstantMessengerClientName" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewInstantMessengerClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(INSTANTMESSENGERCLIENTNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "InstantMessengerClientName" element
     */
    public void setNilInstantMessengerClientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INSTANTMESSENGERCLIENTNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(INSTANTMESSENGERCLIENTNAME$0);
            }
            target.setNil();
        }
    }
}
