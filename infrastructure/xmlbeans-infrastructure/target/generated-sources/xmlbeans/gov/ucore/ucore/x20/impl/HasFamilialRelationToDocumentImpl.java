/*
 * An XML document type.
 * Localname: HasFamilialRelationTo
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.HasFamilialRelationToDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one HasFamilialRelationTo(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class HasFamilialRelationToDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.HasFamilialRelationToDocument
{
    private static final long serialVersionUID = 1L;
    
    public HasFamilialRelationToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASFAMILIALRELATIONTO$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasFamilialRelationTo");
    
    
    /**
     * Gets the "HasFamilialRelationTo" element
     */
    public gov.ucore.ucore.x20.PersonPersonRelationshipType getHasFamilialRelationTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonPersonRelationshipType target = null;
            target = (gov.ucore.ucore.x20.PersonPersonRelationshipType)get_store().find_element_user(HASFAMILIALRELATIONTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HasFamilialRelationTo" element
     */
    public void setHasFamilialRelationTo(gov.ucore.ucore.x20.PersonPersonRelationshipType hasFamilialRelationTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonPersonRelationshipType target = null;
            target = (gov.ucore.ucore.x20.PersonPersonRelationshipType)get_store().find_element_user(HASFAMILIALRELATIONTO$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PersonPersonRelationshipType)get_store().add_element_user(HASFAMILIALRELATIONTO$0);
            }
            target.set(hasFamilialRelationTo);
        }
    }
    
    /**
     * Appends and returns a new empty "HasFamilialRelationTo" element
     */
    public gov.ucore.ucore.x20.PersonPersonRelationshipType addNewHasFamilialRelationTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonPersonRelationshipType target = null;
            target = (gov.ucore.ucore.x20.PersonPersonRelationshipType)get_store().add_element_user(HASFAMILIALRELATIONTO$0);
            return target;
        }
    }
}
