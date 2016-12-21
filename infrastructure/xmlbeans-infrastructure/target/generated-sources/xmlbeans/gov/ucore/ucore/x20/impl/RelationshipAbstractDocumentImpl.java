/*
 * An XML document type.
 * Localname: RelationshipAbstract
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.RelationshipAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one RelationshipAbstract(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class RelationshipAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.RelationshipAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPABSTRACT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "RelationshipAbstract");
    private static final org.apache.xmlbeans.QNameSet RELATIONSHIPABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Controls"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SubordinateTo"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "WorksAt"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EmployedBy"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DistinctFrom"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasFamilialRelationTo"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasOriginOf"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AffiliatedWith"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "OccursAt"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CauseOf"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SameAs"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "InvolvedIn"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocatedAt"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "RelationshipAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasDestinationOf"),
    });
    
    
    /**
     * Gets the "RelationshipAbstract" element
     */
    public gov.ucore.ucore.x20.RelationshipType getRelationshipAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.RelationshipType target = null;
            target = (gov.ucore.ucore.x20.RelationshipType)get_store().find_element_user(RELATIONSHIPABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RelationshipAbstract" element
     */
    public void setRelationshipAbstract(gov.ucore.ucore.x20.RelationshipType relationshipAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.RelationshipType target = null;
            target = (gov.ucore.ucore.x20.RelationshipType)get_store().find_element_user(RELATIONSHIPABSTRACT$1, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.RelationshipType)get_store().add_element_user(RELATIONSHIPABSTRACT$0);
            }
            target.set(relationshipAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "RelationshipAbstract" element
     */
    public gov.ucore.ucore.x20.RelationshipType addNewRelationshipAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.RelationshipType target = null;
            target = (gov.ucore.ucore.x20.RelationshipType)get_store().add_element_user(RELATIONSHIPABSTRACT$0);
            return target;
        }
    }
}
