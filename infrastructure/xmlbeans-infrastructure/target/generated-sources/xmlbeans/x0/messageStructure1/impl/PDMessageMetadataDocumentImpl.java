/*
 * An XML document type.
 * Localname: PDMessageMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PDMessageMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PDMessageMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PDMessageMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PDMessageMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public PDMessageMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDMESSAGEMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadata");
    
    
    /**
     * Gets the "PDMessageMetadata" element
     */
    public x0.messageStructure1.PDMessageMetadataType getPDMessageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PDMessageMetadataType target = null;
            target = (x0.messageStructure1.PDMessageMetadataType)get_store().find_element_user(PDMESSAGEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PDMessageMetadata" element
     */
    public void setPDMessageMetadata(x0.messageStructure1.PDMessageMetadataType pdMessageMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PDMessageMetadataType target = null;
            target = (x0.messageStructure1.PDMessageMetadataType)get_store().find_element_user(PDMESSAGEMETADATA$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.PDMessageMetadataType)get_store().add_element_user(PDMESSAGEMETADATA$0);
            }
            target.set(pdMessageMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "PDMessageMetadata" element
     */
    public x0.messageStructure1.PDMessageMetadataType addNewPDMessageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PDMessageMetadataType target = null;
            target = (x0.messageStructure1.PDMessageMetadataType)get_store().add_element_user(PDMESSAGEMETADATA$0);
            return target;
        }
    }
}
