/*
 * An XML document type.
 * Localname: Controls
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.ControlsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Controls(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class ControlsDocumentImpl extends gov.ucore.ucore.x20.impl.RelationshipAbstractDocumentImpl implements gov.ucore.ucore.x20.ControlsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ControlsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTROLS$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Controls");
    
    
    /**
     * Gets the "Controls" element
     */
    public gov.ucore.ucore.x20.AgentEntityRelationshipType getControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentEntityRelationshipType target = null;
            target = (gov.ucore.ucore.x20.AgentEntityRelationshipType)get_store().find_element_user(CONTROLS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Controls" element
     */
    public void setControls(gov.ucore.ucore.x20.AgentEntityRelationshipType controls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentEntityRelationshipType target = null;
            target = (gov.ucore.ucore.x20.AgentEntityRelationshipType)get_store().find_element_user(CONTROLS$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.AgentEntityRelationshipType)get_store().add_element_user(CONTROLS$0);
            }
            target.set(controls);
        }
    }
    
    /**
     * Appends and returns a new empty "Controls" element
     */
    public gov.ucore.ucore.x20.AgentEntityRelationshipType addNewControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentEntityRelationshipType target = null;
            target = (gov.ucore.ucore.x20.AgentEntityRelationshipType)get_store().add_element_user(CONTROLS$0);
            return target;
        }
    }
}
