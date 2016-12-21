/*
 * XML Type:  DataItemCategoryType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemCategoryType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML DataItemCategoryType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class DataItemCategoryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemCategoryType
{
    private static final long serialVersionUID = 1L;
    
    public DataItemCategoryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMCATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategoryText");
    private static final javax.xml.namespace.QName DATAITEMCATEGORYDESCRIPTION$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategoryDescription");
    
    
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
    
    /**
     * Gets the "DataItemCategoryDescription" element
     */
    public java.lang.String getDataItemCategoryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCATEGORYDESCRIPTION$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMCATEGORYDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataItemCategoryDescription" element
     */
    public boolean isSetDataItemCategoryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAITEMCATEGORYDESCRIPTION$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCATEGORYDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMCATEGORYDESCRIPTION$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMCATEGORYDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMCATEGORYDESCRIPTION$2);
            }
            target.set(dataItemCategoryDescription);
        }
    }
    
    /**
     * Unsets the "DataItemCategoryDescription" element
     */
    public void unsetDataItemCategoryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAITEMCATEGORYDESCRIPTION$2, 0);
        }
    }
}
