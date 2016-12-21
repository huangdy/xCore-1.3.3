/*
 * An XML document type.
 * Localname: DataOwnerInformationDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataOwnerInformationDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataOwnerInformationDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerInformationDomainAttributeDocumentImpl extends x0.messageStructure1.impl.DataOwnerInformationExtensionAbstractDocumentImpl implements x0.messageStructure1.DataOwnerInformationDomainAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerInformationDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERINFORMATIONDOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerInformationDomainAttribute");
    
    
    /**
     * Gets the "DataOwnerInformationDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType getDataOwnerInformationDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(DATAOWNERINFORMATIONDOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerInformationDomainAttribute" element
     */
    public void setDataOwnerInformationDomainAttribute(x0.messageStructure1.DomainAttributeType dataOwnerInformationDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(DATAOWNERINFORMATIONDOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(DATAOWNERINFORMATIONDOMAINATTRIBUTE$0);
            }
            target.set(dataOwnerInformationDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerInformationDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType addNewDataOwnerInformationDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(DATAOWNERINFORMATIONDOMAINATTRIBUTE$0);
            return target;
        }
    }
}
