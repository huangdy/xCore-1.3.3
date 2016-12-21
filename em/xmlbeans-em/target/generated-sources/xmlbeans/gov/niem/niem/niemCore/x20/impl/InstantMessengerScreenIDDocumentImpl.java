/*
 * An XML document type.
 * Localname: InstantMessengerScreenID
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.InstantMessengerScreenIDDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one InstantMessengerScreenID(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class InstantMessengerScreenIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.InstantMessengerScreenIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstantMessengerScreenIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTANTMESSENGERSCREENID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "InstantMessengerScreenID");
    
    
    /**
     * Gets the "InstantMessengerScreenID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getInstantMessengerScreenID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(INSTANTMESSENGERSCREENID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "InstantMessengerScreenID" element
     */
    public boolean isNilInstantMessengerScreenID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(INSTANTMESSENGERSCREENID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "InstantMessengerScreenID" element
     */
    public void setInstantMessengerScreenID(gov.niem.niem.proxy.xsd.x20.String instantMessengerScreenID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(INSTANTMESSENGERSCREENID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(INSTANTMESSENGERSCREENID$0);
            }
            target.set(instantMessengerScreenID);
        }
    }
    
    /**
     * Appends and returns a new empty "InstantMessengerScreenID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewInstantMessengerScreenID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(INSTANTMESSENGERSCREENID$0);
            return target;
        }
    }
    
    /**
     * Nils the "InstantMessengerScreenID" element
     */
    public void setNilInstantMessengerScreenID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(INSTANTMESSENGERSCREENID$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(INSTANTMESSENGERSCREENID$0);
            }
            target.setNil();
        }
    }
}
