/*
 * An XML document type.
 * Localname: CommunityVersion
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.CommunityVersionDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one CommunityVersion(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class CommunityVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.CommunityVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CommunityVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNITYVERSION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityVersion");
    
    
    /**
     * Gets the "CommunityVersion" element
     */
    public java.lang.String getCommunityVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommunityVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetCommunityVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CommunityVersion" element
     */
    public void setCommunityVersion(java.lang.String communityVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNITYVERSION$0);
            }
            target.setStringValue(communityVersion);
        }
    }
    
    /**
     * Sets (as xml) the "CommunityVersion" element
     */
    public void xsetCommunityVersion(org.apache.xmlbeans.XmlString communityVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMUNITYVERSION$0);
            }
            target.set(communityVersion);
        }
    }
}
