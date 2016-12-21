/*
 * An XML document type.
 * Localname: OccursAt
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.OccursAtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one OccursAt(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class OccursAtDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.OccursAtDocument
{
    private static final long serialVersionUID = 1L;
    
    public OccursAtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OCCURSAT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "OccursAt");
    
    
    /**
     * Gets the "OccursAt" element
     */
    public gov.ucore.ucore.x20.EventLocationRelationshipType getOccursAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EventLocationRelationshipType)get_store().find_element_user(OCCURSAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OccursAt" element
     */
    public void setOccursAt(gov.ucore.ucore.x20.EventLocationRelationshipType occursAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EventLocationRelationshipType)get_store().find_element_user(OCCURSAT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EventLocationRelationshipType)get_store().add_element_user(OCCURSAT$0);
            }
            target.set(occursAt);
        }
    }
    
    /**
     * Appends and returns a new empty "OccursAt" element
     */
    public gov.ucore.ucore.x20.EventLocationRelationshipType addNewOccursAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EventLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.EventLocationRelationshipType)get_store().add_element_user(OCCURSAT$0);
            return target;
        }
    }
}
