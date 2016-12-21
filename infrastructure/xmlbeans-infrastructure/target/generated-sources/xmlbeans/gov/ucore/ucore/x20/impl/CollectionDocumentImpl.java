/*
 * An XML document type.
 * Localname: Collection
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.CollectionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Collection(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class CollectionDocumentImpl extends gov.ucore.ucore.x20.impl.ThingAbstractDocumentImpl implements gov.ucore.ucore.x20.CollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Collection");
    
    
    /**
     * Gets the "Collection" element
     */
    public gov.ucore.ucore.x20.CollectionType getCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CollectionType target = null;
            target = (gov.ucore.ucore.x20.CollectionType)get_store().find_element_user(COLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Collection" element
     */
    public void setCollection(gov.ucore.ucore.x20.CollectionType collection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CollectionType target = null;
            target = (gov.ucore.ucore.x20.CollectionType)get_store().find_element_user(COLLECTION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.CollectionType)get_store().add_element_user(COLLECTION$0);
            }
            target.set(collection);
        }
    }
    
    /**
     * Appends and returns a new empty "Collection" element
     */
    public gov.ucore.ucore.x20.CollectionType addNewCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CollectionType target = null;
            target = (gov.ucore.ucore.x20.CollectionType)get_store().add_element_user(COLLECTION$0);
            return target;
        }
    }
}
