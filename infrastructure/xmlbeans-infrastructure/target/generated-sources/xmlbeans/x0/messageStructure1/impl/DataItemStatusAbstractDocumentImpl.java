/*
 * An XML document type.
 * Localname: DataItemStatusAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemStatusAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemStatusAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemStatusAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemStatusAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemStatusAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMSTATUSABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemStatusAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAITEMSTATUSABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataItemStatus"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemStatusAbstract"),
    });
    
    
    /**
     * Gets the "DataItemStatusAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataItemStatusAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAITEMSTATUSABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataItemStatusAbstract" element
     */
    public void setDataItemStatusAbstract(org.apache.xmlbeans.XmlObject dataItemStatusAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAITEMSTATUSABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAITEMSTATUSABSTRACT$0);
            }
            target.set(dataItemStatusAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataItemStatusAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataItemStatusAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAITEMSTATUSABSTRACT$0);
            return target;
        }
    }
}
