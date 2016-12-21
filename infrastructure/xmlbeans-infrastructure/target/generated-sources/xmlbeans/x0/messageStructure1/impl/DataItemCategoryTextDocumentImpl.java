/*
 * An XML document type.
 * Localname: DataItemCategoryText
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemCategoryTextDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemCategoryText(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemCategoryTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemCategoryTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemCategoryTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMCATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategoryText");
    
    
    /**
     * Gets the "DataItemCategoryText" element
     */
    public java.lang.String getDataItemCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCATEGORYTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemCategoryText" element
     */
    public org.apache.xmlbeans.XmlString xgetDataItemCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMCATEGORYTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataItemCategoryText" element
     */
    public void setDataItemCategoryText(java.lang.String dataItemCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMCATEGORYTEXT$0);
            }
            target.setStringValue(dataItemCategoryText);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemCategoryText" element
     */
    public void xsetDataItemCategoryText(org.apache.xmlbeans.XmlString dataItemCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMCATEGORYTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMCATEGORYTEXT$0);
            }
            target.set(dataItemCategoryText);
        }
    }
}
