/*
 * An XML document type.
 * Localname: Service
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.ServiceDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one Service(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class ServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.ServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Service");
    
    
    /**
     * Gets the "Service" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.ServiceType getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ServiceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ServiceType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Service" element
     */
    public void setService(mil.dod.metadata.mdr.ns.ddms.x20.ServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ServiceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ServiceType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.ServiceType)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "Service" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.ServiceType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ServiceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ServiceType)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
}
