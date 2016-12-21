/*
 * An XML document type.
 * Localname: MessageClassification
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.MessageClassificationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one MessageClassification(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class MessageClassificationDocumentImpl extends x0.messageStructure1.impl.DataSensitivityAbstractDocumentImpl implements gov.ucore.ucore.x20.MessageClassificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageClassificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGECLASSIFICATION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MessageClassification");
    
    
    /**
     * Gets the "MessageClassification" element
     */
    public gov.ucore.ucore.x20.MessageClassificationType getMessageClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.MessageClassificationType target = null;
            target = (gov.ucore.ucore.x20.MessageClassificationType)get_store().find_element_user(MESSAGECLASSIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MessageClassification" element
     */
    public void setMessageClassification(gov.ucore.ucore.x20.MessageClassificationType messageClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.MessageClassificationType target = null;
            target = (gov.ucore.ucore.x20.MessageClassificationType)get_store().find_element_user(MESSAGECLASSIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.MessageClassificationType)get_store().add_element_user(MESSAGECLASSIFICATION$0);
            }
            target.set(messageClassification);
        }
    }
    
    /**
     * Appends and returns a new empty "MessageClassification" element
     */
    public gov.ucore.ucore.x20.MessageClassificationType addNewMessageClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.MessageClassificationType target = null;
            target = (gov.ucore.ucore.x20.MessageClassificationType)get_store().add_element_user(MESSAGECLASSIFICATION$0);
            return target;
        }
    }
}
