/*
 * An XML document type.
 * Localname: SystemIdentifier
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.SystemIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one SystemIdentifier(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class SystemIdentifierDocumentImpl extends x0.messageStructure1.impl.SystemIdentifierAbstractDocumentImpl implements gov.ucore.ucore.x20.SystemIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public SystemIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SystemIdentifier");
    
    
    /**
     * Gets the "SystemIdentifier" element
     */
    public gov.ucore.ucore.x20.StringType getSystemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().find_element_user(SYSTEMIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemIdentifier" element
     */
    public void setSystemIdentifier(gov.ucore.ucore.x20.StringType systemIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().find_element_user(SYSTEMIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.StringType)get_store().add_element_user(SYSTEMIDENTIFIER$0);
            }
            target.set(systemIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemIdentifier" element
     */
    public gov.ucore.ucore.x20.StringType addNewSystemIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().add_element_user(SYSTEMIDENTIFIER$0);
            return target;
        }
    }
}
