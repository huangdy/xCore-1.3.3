/*
 * An XML document type.
 * Localname: SubordinateTo
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.SubordinateToDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one SubordinateTo(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class SubordinateToDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.SubordinateToDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubordinateToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBORDINATETO$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SubordinateTo");
    
    
    /**
     * Gets the "SubordinateTo" element
     */
    public gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType getSubordinateTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType target = null;
            target = (gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType)get_store().find_element_user(SUBORDINATETO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubordinateTo" element
     */
    public void setSubordinateTo(gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType subordinateTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType target = null;
            target = (gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType)get_store().find_element_user(SUBORDINATETO$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType)get_store().add_element_user(SUBORDINATETO$0);
            }
            target.set(subordinateTo);
        }
    }
    
    /**
     * Appends and returns a new empty "SubordinateTo" element
     */
    public gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType addNewSubordinateTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType target = null;
            target = (gov.ucore.ucore.x20.SubordinateSuperiorRelationshipType)get_store().add_element_user(SUBORDINATETO$0);
            return target;
        }
    }
}
