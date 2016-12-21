/*
 * An XML document type.
 * Localname: LocatedAt
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.LocatedAtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one LocatedAt(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class LocatedAtDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.LocatedAtDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocatedAtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATEDAT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocatedAt");
    
    
    /**
     * Gets the "LocatedAt" element
     */
    public gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType getLocatedAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType)get_store().find_element_user(LOCATEDAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocatedAt" element
     */
    public void setLocatedAt(gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType locatedAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType)get_store().find_element_user(LOCATEDAT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType)get_store().add_element_user(LOCATEDAT$0);
            }
            target.set(locatedAt);
        }
    }
    
    /**
     * Appends and returns a new empty "LocatedAt" element
     */
    public gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType addNewLocatedAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType)get_store().add_element_user(LOCATEDAT$0);
            return target;
        }
    }
}
