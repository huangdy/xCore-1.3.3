/*
 * An XML document type.
 * Localname: DataItemReferenceID
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemReferenceIDDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemReferenceID(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemReferenceIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemReferenceIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemReferenceIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMREFERENCEID$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemReferenceID");
    
    
    /**
     * Gets the "DataItemReferenceID" element
     */
    public java.lang.String getDataItemReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMREFERENCEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemReferenceID" element
     */
    public org.apache.xmlbeans.XmlString xgetDataItemReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMREFERENCEID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DataItemReferenceID" element
     */
    public boolean isNilDataItemReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMREFERENCEID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DataItemReferenceID" element
     */
    public void setDataItemReferenceID(java.lang.String dataItemReferenceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMREFERENCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMREFERENCEID$0);
            }
            target.setStringValue(dataItemReferenceID);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemReferenceID" element
     */
    public void xsetDataItemReferenceID(org.apache.xmlbeans.XmlString dataItemReferenceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMREFERENCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMREFERENCEID$0);
            }
            target.set(dataItemReferenceID);
        }
    }
    
    /**
     * Nils the "DataItemReferenceID" element
     */
    public void setNilDataItemReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMREFERENCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMREFERENCEID$0);
            }
            target.setNil();
        }
    }
}
