/*
 * An XML document type.
 * Localname: DataItemPackage
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemPackageDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemPackage(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemPackageDocumentImpl extends x0.messageStructure1.impl.PublishMessageItemAbstractDocumentImpl implements x0.messageStructure1.DataItemPackageDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemPackageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMPACKAGE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPackage");
    
    
    /**
     * Gets the "DataItemPackage" element
     */
    public x0.messageStructure1.DataItemPackageType getDataItemPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemPackageType target = null;
            target = (x0.messageStructure1.DataItemPackageType)get_store().find_element_user(DATAITEMPACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataItemPackage" element
     */
    public void setDataItemPackage(x0.messageStructure1.DataItemPackageType dataItemPackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemPackageType target = null;
            target = (x0.messageStructure1.DataItemPackageType)get_store().find_element_user(DATAITEMPACKAGE$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DataItemPackageType)get_store().add_element_user(DATAITEMPACKAGE$0);
            }
            target.set(dataItemPackage);
        }
    }
    
    /**
     * Appends and returns a new empty "DataItemPackage" element
     */
    public x0.messageStructure1.DataItemPackageType addNewDataItemPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemPackageType target = null;
            target = (x0.messageStructure1.DataItemPackageType)get_store().add_element_user(DATAITEMPACKAGE$0);
            return target;
        }
    }
}
