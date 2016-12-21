/*
 * An XML document type.
 * Localname: HasOriginOf
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.HasOriginOfDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one HasOriginOf(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class HasOriginOfDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.HasOriginOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public HasOriginOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASORIGINOF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasOriginOf");
    
    
    /**
     * Gets the "HasOriginOf" element
     */
    public gov.ucore.ucore.x20.EntityLocationRelationshipType getHasOriginOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EntityLocationRelationshipType)get_store().find_element_user(HASORIGINOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HasOriginOf" element
     */
    public void setHasOriginOf(gov.ucore.ucore.x20.EntityLocationRelationshipType hasOriginOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EntityLocationRelationshipType)get_store().find_element_user(HASORIGINOF$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EntityLocationRelationshipType)get_store().add_element_user(HASORIGINOF$0);
            }
            target.set(hasOriginOf);
        }
    }
    
    /**
     * Appends and returns a new empty "HasOriginOf" element
     */
    public gov.ucore.ucore.x20.EntityLocationRelationshipType addNewHasOriginOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EntityLocationRelationshipType)get_store().add_element_user(HASORIGINOF$0);
            return target;
        }
    }
}
