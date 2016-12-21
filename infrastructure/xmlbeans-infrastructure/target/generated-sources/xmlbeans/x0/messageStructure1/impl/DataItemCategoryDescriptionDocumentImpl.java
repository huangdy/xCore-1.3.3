/*
 * An XML document type.
 * Localname: DataItemCategoryDescription
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemCategoryDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemCategoryDescription(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemCategoryDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemCategoryDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemCategoryDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMCATEGORYDESCRIPTION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategoryDescription");
    
    
    /**
     * Gets the "DataItemCategoryDescription" element
     */
    public java.lang.String getDataItemCategoryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCATEGORYDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemCategoryDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetDataItemCategoryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMCATEGORYDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataItemCategoryDescription" element
     */
    public void setDataItemCategoryDescription(java.lang.String dataItemCategoryDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCATEGORYDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMCATEGORYDESCRIPTION$0);
            }
            target.setStringValue(dataItemCategoryDescription);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemCategoryDescription" element
     */
    public void xsetDataItemCategoryDescription(org.apache.xmlbeans.XmlString dataItemCategoryDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMCATEGORYDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMCATEGORYDESCRIPTION$0);
            }
            target.set(dataItemCategoryDescription);
        }
    }
}
