/*
 * An XML document type.
 * Localname: SameAsPayloadAssociation
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.SameAsPayloadAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one SameAsPayloadAssociation(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class SameAsPayloadAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.SameAsPayloadAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SameAsPayloadAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAMEASPAYLOADASSOCIATION$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsPayloadAssociation");
    
    
    /**
     * Gets the "SameAsPayloadAssociation" element
     */
    public x0.messageLibrary1.SameAsPayloadAssociationType getSameAsPayloadAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.SameAsPayloadAssociationType target = null;
            target = (x0.messageLibrary1.SameAsPayloadAssociationType)get_store().find_element_user(SAMEASPAYLOADASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SameAsPayloadAssociation" element
     */
    public void setSameAsPayloadAssociation(x0.messageLibrary1.SameAsPayloadAssociationType sameAsPayloadAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.SameAsPayloadAssociationType target = null;
            target = (x0.messageLibrary1.SameAsPayloadAssociationType)get_store().find_element_user(SAMEASPAYLOADASSOCIATION$0, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.SameAsPayloadAssociationType)get_store().add_element_user(SAMEASPAYLOADASSOCIATION$0);
            }
            target.set(sameAsPayloadAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "SameAsPayloadAssociation" element
     */
    public x0.messageLibrary1.SameAsPayloadAssociationType addNewSameAsPayloadAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.SameAsPayloadAssociationType target = null;
            target = (x0.messageLibrary1.SameAsPayloadAssociationType)get_store().add_element_user(SAMEASPAYLOADASSOCIATION$0);
            return target;
        }
    }
}
