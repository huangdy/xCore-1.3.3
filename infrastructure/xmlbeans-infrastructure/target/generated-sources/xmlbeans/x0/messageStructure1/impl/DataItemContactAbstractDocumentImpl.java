/*
 * An XML document type.
 * Localname: DataItemContactAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemContactAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemContactAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemContactAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemContactAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemContactAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMCONTACTABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemContactAbstract");
    
    
    /**
     * Gets the "DataItemContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataItemContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAITEMCONTACTABSTRACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataItemContactAbstract" element
     */
    public void setDataItemContactAbstract(org.apache.xmlbeans.XmlObject dataItemContactAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAITEMCONTACTABSTRACT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAITEMCONTACTABSTRACT$0);
            }
            target.set(dataItemContactAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataItemContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataItemContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAITEMCONTACTABSTRACT$0);
            return target;
        }
    }
}
