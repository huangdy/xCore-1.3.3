/*
 * An XML document type.
 * Localname: DataItemPublishInstruction
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemPublishInstructionDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataItemPublishInstruction(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataItemPublishInstructionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataItemPublishInstructionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataItemPublishInstructionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMPUBLISHINSTRUCTION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPublishInstruction");
    
    
    /**
     * Gets the "DataItemPublishInstruction" element
     */
    public x0.messageCodes1.DataItemPublishInstructionCodeSimpleType.Enum getDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemPublishInstruction" element
     */
    public x0.messageCodes1.DataItemPublishInstructionCodeSimpleType xgetDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.DataItemPublishInstructionCodeSimpleType target = null;
            target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DataItemPublishInstruction" element
     */
    public boolean isNilDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.DataItemPublishInstructionCodeSimpleType target = null;
            target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DataItemPublishInstruction" element
     */
    public void setDataItemPublishInstruction(x0.messageCodes1.DataItemPublishInstructionCodeSimpleType.Enum dataItemPublishInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$0);
            }
            target.setEnumValue(dataItemPublishInstruction);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemPublishInstruction" element
     */
    public void xsetDataItemPublishInstruction(x0.messageCodes1.DataItemPublishInstructionCodeSimpleType dataItemPublishInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.DataItemPublishInstructionCodeSimpleType target = null;
            target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null)
            {
                target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$0);
            }
            target.set(dataItemPublishInstruction);
        }
    }
    
    /**
     * Nils the "DataItemPublishInstruction" element
     */
    public void setNilDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.DataItemPublishInstructionCodeSimpleType target = null;
            target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$0, 0);
            if (target == null)
            {
                target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$0);
            }
            target.setNil();
        }
    }
}
