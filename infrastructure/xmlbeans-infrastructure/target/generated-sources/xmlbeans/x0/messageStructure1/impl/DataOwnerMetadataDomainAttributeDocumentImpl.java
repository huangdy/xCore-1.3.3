/*
 * An XML document type.
 * Localname: DataOwnerMetadataDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataOwnerMetadataDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataOwnerMetadataDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerMetadataDomainAttributeDocumentImpl extends x0.messageStructure1.impl.DataOwnerMetadataExtensionAbstractDocumentImpl implements x0.messageStructure1.DataOwnerMetadataDomainAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerMetadataDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERMETADATADOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataDomainAttribute");
    
    
    /**
     * Gets the "DataOwnerMetadataDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType getDataOwnerMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(DATAOWNERMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerMetadataDomainAttribute" element
     */
    public void setDataOwnerMetadataDomainAttribute(x0.messageStructure1.DomainAttributeType dataOwnerMetadataDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(DATAOWNERMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(DATAOWNERMETADATADOMAINATTRIBUTE$0);
            }
            target.set(dataOwnerMetadataDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerMetadataDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType addNewDataOwnerMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(DATAOWNERMETADATADOMAINATTRIBUTE$0);
            return target;
        }
    }
}
