/*
 * XML Type:  PersonAgentRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PersonAgentRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML PersonAgentRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class PersonAgentRelationshipTypeImpl extends gov.ucore.ucore.x20.impl.RelationshipTypeImpl implements gov.ucore.ucore.x20.PersonAgentRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public PersonAgentRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONREF$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PersonRef");
    private static final javax.xml.namespace.QName AGENTREF$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentRef");
    
    
    /**
     * Gets the "PersonRef" element
     */
    public gov.ucore.ucore.x20.PersonRefType getPersonRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().find_element_user(PERSONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonRef" element
     */
    public void setPersonRef(gov.ucore.ucore.x20.PersonRefType personRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().find_element_user(PERSONREF$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PersonRefType)get_store().add_element_user(PERSONREF$0);
            }
            target.set(personRef);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonRef" element
     */
    public gov.ucore.ucore.x20.PersonRefType addNewPersonRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PersonRefType target = null;
            target = (gov.ucore.ucore.x20.PersonRefType)get_store().add_element_user(PERSONREF$0);
            return target;
        }
    }
    
    /**
     * Gets the "AgentRef" element
     */
    public gov.ucore.ucore.x20.AgentRefType getAgentRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentRefType target = null;
            target = (gov.ucore.ucore.x20.AgentRefType)get_store().find_element_user(AGENTREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AgentRef" element
     */
    public void setAgentRef(gov.ucore.ucore.x20.AgentRefType agentRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentRefType target = null;
            target = (gov.ucore.ucore.x20.AgentRefType)get_store().find_element_user(AGENTREF$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.AgentRefType)get_store().add_element_user(AGENTREF$2);
            }
            target.set(agentRef);
        }
    }
    
    /**
     * Appends and returns a new empty "AgentRef" element
     */
    public gov.ucore.ucore.x20.AgentRefType addNewAgentRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentRefType target = null;
            target = (gov.ucore.ucore.x20.AgentRefType)get_store().add_element_user(AGENTREF$2);
            return target;
        }
    }
}
