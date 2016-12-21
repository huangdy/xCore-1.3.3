/*
 * An XML document type.
 * Localname: DataItemID
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemID(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMID$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemID");
    
    
    /**
     * Gets the "DataItemID" element
     */
    public java.lang.String getDataItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemID" element
     */
    public org.apache.xmlbeans.XmlString xgetDataItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataItemID" element
     */
    public void setDataItemID(java.lang.String dataItemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMID$0);
            }
            target.setStringValue(dataItemID);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemID" element
     */
    public void xsetDataItemID(org.apache.xmlbeans.XmlString dataItemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMID$0);
            }
            target.set(dataItemID);
        }
    }
}
