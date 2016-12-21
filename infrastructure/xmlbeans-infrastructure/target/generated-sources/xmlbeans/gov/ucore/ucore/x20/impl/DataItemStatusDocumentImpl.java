/*
 * An XML document type.
 * Localname: DataItemStatus
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.DataItemStatusDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one DataItemStatus(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class DataItemStatusDocumentImpl extends x0.messageStructure1.impl.DataItemStatusAbstractDocumentImpl implements gov.ucore.ucore.x20.DataItemStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMSTATUS$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataItemStatus");
    
    
    /**
     * Gets the "DataItemStatus" element
     */
    public gov.ucore.ucore.x20.DataItemStatusType getDataItemStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DataItemStatusType target = null;
            target = (gov.ucore.ucore.x20.DataItemStatusType)get_store().find_element_user(DATAITEMSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataItemStatus" element
     */
    public void setDataItemStatus(gov.ucore.ucore.x20.DataItemStatusType dataItemStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DataItemStatusType target = null;
            target = (gov.ucore.ucore.x20.DataItemStatusType)get_store().find_element_user(DATAITEMSTATUS$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.DataItemStatusType)get_store().add_element_user(DATAITEMSTATUS$0);
            }
            target.set(dataItemStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "DataItemStatus" element
     */
    public gov.ucore.ucore.x20.DataItemStatusType addNewDataItemStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DataItemStatusType target = null;
            target = (gov.ucore.ucore.x20.DataItemStatusType)get_store().add_element_user(DATAITEMSTATUS$0);
            return target;
        }
    }
}
