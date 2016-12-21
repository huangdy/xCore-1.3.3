/*
 * An XML document type.
 * Localname: CommunityPedigreeURI
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.CommunityPedigreeURIDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one CommunityPedigreeURI(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class CommunityPedigreeURIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.CommunityPedigreeURIDocument
{
    private static final long serialVersionUID = 1L;
    
    public CommunityPedigreeURIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNITYPEDIGREEURI$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityPedigreeURI");
    
    
    /**
     * Gets the "CommunityPedigreeURI" element
     */
    public x0.messageStructure1.CommunityPedigreeURIType getCommunityPedigreeURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.CommunityPedigreeURIType target = null;
            target = (x0.messageStructure1.CommunityPedigreeURIType)get_store().find_element_user(COMMUNITYPEDIGREEURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CommunityPedigreeURI" element
     */
    public void setCommunityPedigreeURI(x0.messageStructure1.CommunityPedigreeURIType communityPedigreeURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.CommunityPedigreeURIType target = null;
            target = (x0.messageStructure1.CommunityPedigreeURIType)get_store().find_element_user(COMMUNITYPEDIGREEURI$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.CommunityPedigreeURIType)get_store().add_element_user(COMMUNITYPEDIGREEURI$0);
            }
            target.set(communityPedigreeURI);
        }
    }
    
    /**
     * Appends and returns a new empty "CommunityPedigreeURI" element
     */
    public x0.messageStructure1.CommunityPedigreeURIType addNewCommunityPedigreeURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.CommunityPedigreeURIType target = null;
            target = (x0.messageStructure1.CommunityPedigreeURIType)get_store().add_element_user(COMMUNITYPEDIGREEURI$0);
            return target;
        }
    }
}
