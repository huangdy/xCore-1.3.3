/*
 * An XML document type.
 * Localname: DataItemCategory
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemCategory(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemCategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMCATEGORY$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategory");
    
    
    /**
     * Gets the "DataItemCategory" element
     */
    public x0.messageStructure1.DataItemCategoryType getDataItemCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemCategoryType target = null;
            target = (x0.messageStructure1.DataItemCategoryType)get_store().find_element_user(DATAITEMCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataItemCategory" element
     */
    public void setDataItemCategory(x0.messageStructure1.DataItemCategoryType dataItemCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemCategoryType target = null;
            target = (x0.messageStructure1.DataItemCategoryType)get_store().find_element_user(DATAITEMCATEGORY$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DataItemCategoryType)get_store().add_element_user(DATAITEMCATEGORY$0);
            }
            target.set(dataItemCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "DataItemCategory" element
     */
    public x0.messageStructure1.DataItemCategoryType addNewDataItemCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemCategoryType target = null;
            target = (x0.messageStructure1.DataItemCategoryType)get_store().add_element_user(DATAITEMCATEGORY$0);
            return target;
        }
    }
}
