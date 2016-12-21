/*
 * An XML document type.
 * Localname: CommunityURI
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.CommunityURIDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one CommunityURI(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class CommunityURIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.CommunityURIDocument
{
    private static final long serialVersionUID = 1L;
    
    public CommunityURIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNITYURI$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityURI");
    
    
    /**
     * Gets the "CommunityURI" element
     */
    public java.lang.String getCommunityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommunityURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCommunityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMMUNITYURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CommunityURI" element
     */
    public void setCommunityURI(java.lang.String communityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNITYURI$0);
            }
            target.setStringValue(communityURI);
        }
    }
    
    /**
     * Sets (as xml) the "CommunityURI" element
     */
    public void xsetCommunityURI(org.apache.xmlbeans.XmlAnyURI communityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMMUNITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(COMMUNITYURI$0);
            }
            target.set(communityURI);
        }
    }
}
