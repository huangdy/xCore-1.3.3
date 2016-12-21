/*
 * An XML document type.
 * Localname: CauseOf
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.CauseOfDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one CauseOf(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class CauseOfDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.CauseOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public CauseOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAUSEOF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CauseOf");
    
    
    /**
     * Gets the "CauseOf" element
     */
    public gov.ucore.ucore.x20.CauseOfRelationshipType getCauseOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CauseOfRelationshipType target = null;
            target = (gov.ucore.ucore.x20.CauseOfRelationshipType)get_store().find_element_user(CAUSEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CauseOf" element
     */
    public void setCauseOf(gov.ucore.ucore.x20.CauseOfRelationshipType causeOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CauseOfRelationshipType target = null;
            target = (gov.ucore.ucore.x20.CauseOfRelationshipType)get_store().find_element_user(CAUSEOF$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.CauseOfRelationshipType)get_store().add_element_user(CAUSEOF$0);
            }
            target.set(causeOf);
        }
    }
    
    /**
     * Appends and returns a new empty "CauseOf" element
     */
    public gov.ucore.ucore.x20.CauseOfRelationshipType addNewCauseOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CauseOfRelationshipType target = null;
            target = (gov.ucore.ucore.x20.CauseOfRelationshipType)get_store().add_element_user(CAUSEOF$0);
            return target;
        }
    }
}
