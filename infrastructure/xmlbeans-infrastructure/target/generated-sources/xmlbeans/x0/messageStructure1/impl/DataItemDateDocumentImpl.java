/*
 * An XML document type.
 * Localname: DataItemDate
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemDateDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemDate(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMDATE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemDate");
    
    
    /**
     * Gets the "DataItemDate" element
     */
    public java.util.Calendar getDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAITEMDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DataItemDate" element
     */
    public boolean isNilDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAITEMDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DataItemDate" element
     */
    public void setDataItemDate(java.util.Calendar dataItemDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMDATE$0);
            }
            target.setCalendarValue(dataItemDate);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemDate" element
     */
    public void xsetDataItemDate(org.apache.xmlbeans.XmlDate dataItemDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAITEMDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAITEMDATE$0);
            }
            target.set(dataItemDate);
        }
    }
    
    /**
     * Nils the "DataItemDate" element
     */
    public void setNilDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAITEMDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAITEMDATE$0);
            }
            target.setNil();
        }
    }
}
