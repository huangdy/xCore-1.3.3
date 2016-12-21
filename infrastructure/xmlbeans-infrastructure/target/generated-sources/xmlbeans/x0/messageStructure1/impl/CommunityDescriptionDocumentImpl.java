/*
 * An XML document type.
 * Localname: CommunityDescription
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.CommunityDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one CommunityDescription(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class CommunityDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.CommunityDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CommunityDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNITYDESCRIPTION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityDescription");
    
    
    /**
     * Gets the "CommunityDescription" element
     */
    public java.lang.String getCommunityDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommunityDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetCommunityDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CommunityDescription" element
     */
    public void setCommunityDescription(java.lang.String communityDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNITYDESCRIPTION$0);
            }
            target.setStringValue(communityDescription);
        }
    }
    
    /**
     * Sets (as xml) the "CommunityDescription" element
     */
    public void xsetCommunityDescription(org.apache.xmlbeans.XmlString communityDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMUNITYDESCRIPTION$0);
            }
            target.set(communityDescription);
        }
    }
}
