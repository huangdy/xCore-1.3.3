/*
 * An XML document type.
 * Localname: DataItemCompleteIndicator
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemCompleteIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemCompleteIndicator(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemCompleteIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemCompleteIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemCompleteIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMCOMPLETEINDICATOR$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCompleteIndicator");
    
    
    /**
     * Gets the "DataItemCompleteIndicator" element
     */
    public boolean getDataItemCompleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCOMPLETEINDICATOR$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemCompleteIndicator" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDataItemCompleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DATAITEMCOMPLETEINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataItemCompleteIndicator" element
     */
    public void setDataItemCompleteIndicator(boolean dataItemCompleteIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCOMPLETEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMCOMPLETEINDICATOR$0);
            }
            target.setBooleanValue(dataItemCompleteIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemCompleteIndicator" element
     */
    public void xsetDataItemCompleteIndicator(org.apache.xmlbeans.XmlBoolean dataItemCompleteIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DATAITEMCOMPLETEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DATAITEMCOMPLETEINDICATOR$0);
            }
            target.set(dataItemCompleteIndicator);
        }
    }
}
