/*
 * An XML document type.
 * Localname: AttributeValue
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttributeValueDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one AttributeValue(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttributeValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttributeValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEVALUE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttributeValue");
    
    
    /**
     * Gets the "AttributeValue" element
     */
    public java.lang.String getAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeValue" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AttributeValue" element
     */
    public void setAttributeValue(java.lang.String attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEVALUE$0);
            }
            target.setStringValue(attributeValue);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeValue" element
     */
    public void xsetAttributeValue(org.apache.xmlbeans.XmlString attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEVALUE$0);
            }
            target.set(attributeValue);
        }
    }
}
