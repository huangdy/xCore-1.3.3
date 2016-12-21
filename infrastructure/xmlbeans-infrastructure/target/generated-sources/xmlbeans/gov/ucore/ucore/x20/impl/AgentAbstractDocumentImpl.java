/*
 * An XML document type.
 * Localname: AgentAbstract
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.AgentAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one AgentAbstract(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class AgentAbstractDocumentImpl extends gov.ucore.ucore.x20.impl.EntityDocumentImpl implements gov.ucore.ucore.x20.AgentAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public AgentAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENTABSTRACT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentAbstract");
    private static final org.apache.xmlbeans.QNameSet AGENTABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Person"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Organization"),
    });
    
    
    /**
     * Gets the "AgentAbstract" element
     */
    public gov.ucore.ucore.x20.AgentType getAgentAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentType target = null;
            target = (gov.ucore.ucore.x20.AgentType)get_store().find_element_user(AGENTABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AgentAbstract" element
     */
    public void setAgentAbstract(gov.ucore.ucore.x20.AgentType agentAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentType target = null;
            target = (gov.ucore.ucore.x20.AgentType)get_store().find_element_user(AGENTABSTRACT$1, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.AgentType)get_store().add_element_user(AGENTABSTRACT$0);
            }
            target.set(agentAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "AgentAbstract" element
     */
    public gov.ucore.ucore.x20.AgentType addNewAgentAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AgentType target = null;
            target = (gov.ucore.ucore.x20.AgentType)get_store().add_element_user(AGENTABSTRACT$0);
            return target;
        }
    }
}
