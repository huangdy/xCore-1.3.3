/*
 * An XML document type.
 * Localname: Entity
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.EntityDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Entity(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class EntityDocumentImpl extends gov.ucore.ucore.x20.impl.ThingAbstractDocumentImpl implements gov.ucore.ucore.x20.EntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Entity");
    private static final org.apache.xmlbeans.QNameSet ENTITY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Entity"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Person"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Organization"),
    });
    
    
    /**
     * Gets the "Entity" element
     */
    public gov.ucore.ucore.x20.EntityType getEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityType target = null;
            target = (gov.ucore.ucore.x20.EntityType)get_store().find_element_user(ENTITY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Entity" element
     */
    public void setEntity(gov.ucore.ucore.x20.EntityType entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityType target = null;
            target = (gov.ucore.ucore.x20.EntityType)get_store().find_element_user(ENTITY$1, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EntityType)get_store().add_element_user(ENTITY$0);
            }
            target.set(entity);
        }
    }
    
    /**
     * Appends and returns a new empty "Entity" element
     */
    public gov.ucore.ucore.x20.EntityType addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityType target = null;
            target = (gov.ucore.ucore.x20.EntityType)get_store().add_element_user(ENTITY$0);
            return target;
        }
    }
}
