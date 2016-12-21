/*
 * An XML document type.
 * Localname: PublishMessageItemAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PublishMessageItemAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PublishMessageItemAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PublishMessageItemAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PublishMessageItemAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublishMessageItemAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHMESSAGEITEMABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageItemAbstract");
    private static final org.apache.xmlbeans.QNameSet PUBLISHMESSAGEITEMABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageItemAbstract"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPackage"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "Attachment"),
    });
    
    
    /**
     * Gets the "PublishMessageItemAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getPublishMessageItemAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PUBLISHMESSAGEITEMABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PublishMessageItemAbstract" element
     */
    public void setPublishMessageItemAbstract(org.apache.xmlbeans.XmlObject publishMessageItemAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PUBLISHMESSAGEITEMABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PUBLISHMESSAGEITEMABSTRACT$0);
            }
            target.set(publishMessageItemAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "PublishMessageItemAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewPublishMessageItemAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PUBLISHMESSAGEITEMABSTRACT$0);
            return target;
        }
    }
}
