/*
 * An XML document type.
 * Localname: InvolvedIn
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.InvolvedInDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one InvolvedIn(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class InvolvedInDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.InvolvedInDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvolvedInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOLVEDIN$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "InvolvedIn");
    
    
    /**
     * Gets the "InvolvedIn" element
     */
    public gov.ucore.ucore.x20.AgentEventRelationshipType getInvolvedIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentEventRelationshipType target = null;
            target = (gov.ucore.ucore.x20.AgentEventRelationshipType)get_store().find_element_user(INVOLVEDIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InvolvedIn" element
     */
    public void setInvolvedIn(gov.ucore.ucore.x20.AgentEventRelationshipType involvedIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentEventRelationshipType target = null;
            target = (gov.ucore.ucore.x20.AgentEventRelationshipType)get_store().find_element_user(INVOLVEDIN$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.AgentEventRelationshipType)get_store().add_element_user(INVOLVEDIN$0);
            }
            target.set(involvedIn);
        }
    }
    
    /**
     * Appends and returns a new empty "InvolvedIn" element
     */
    public gov.ucore.ucore.x20.AgentEventRelationshipType addNewInvolvedIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentEventRelationshipType target = null;
            target = (gov.ucore.ucore.x20.AgentEventRelationshipType)get_store().add_element_user(INVOLVEDIN$0);
            return target;
        }
    }
}
