/*
 * An XML document type.
 * Localname: WorksAt
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.WorksAtDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one WorksAt(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class WorksAtDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.WorksAtDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorksAtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKSAT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "WorksAt");
    
    
    /**
     * Gets the "WorksAt" element
     */
    public gov.ucore.ucore.x20.PersonLocationRelationshipType getWorksAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.PersonLocationRelationshipType)get_store().find_element_user(WORKSAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorksAt" element
     */
    public void setWorksAt(gov.ucore.ucore.x20.PersonLocationRelationshipType worksAt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.PersonLocationRelationshipType)get_store().find_element_user(WORKSAT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PersonLocationRelationshipType)get_store().add_element_user(WORKSAT$0);
            }
            target.set(worksAt);
        }
    }
    
    /**
     * Appends and returns a new empty "WorksAt" element
     */
    public gov.ucore.ucore.x20.PersonLocationRelationshipType addNewWorksAt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonLocationRelationshipType target = null;
            target = (gov.ucore.ucore.x20.PersonLocationRelationshipType)get_store().add_element_user(WORKSAT$0);
            return target;
        }
    }
}
