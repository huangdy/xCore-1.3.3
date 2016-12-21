/*
 * An XML document type.
 * Localname: Resource
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.ResourceDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one Resource(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class ResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.ResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Resource");
    
    
    /**
     * Gets the "Resource" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.ResourceType getResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ResourceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ResourceType)get_store().find_element_user(RESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Resource" element
     */
    public void setResource(mil.dod.metadata.mdr.ns.ddms.x20.ResourceType resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ResourceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ResourceType)get_store().find_element_user(RESOURCE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.ResourceType)get_store().add_element_user(RESOURCE$0);
            }
            target.set(resource);
        }
    }
    
    /**
     * Appends and returns a new empty "Resource" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.ResourceType addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ResourceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ResourceType)get_store().add_element_user(RESOURCE$0);
            return target;
        }
    }
}
