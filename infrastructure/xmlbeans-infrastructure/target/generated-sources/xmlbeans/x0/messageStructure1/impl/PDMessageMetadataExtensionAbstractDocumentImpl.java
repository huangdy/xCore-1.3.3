/*
 * An XML document type.
 * Localname: PDMessageMetadataExtensionAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PDMessageMetadataExtensionAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PDMessageMetadataExtensionAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PDMessageMetadataExtensionAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PDMessageMetadataExtensionAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public PDMessageMetadataExtensionAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDMESSAGEMETADATAEXTENSIONABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet PDMESSAGEMETADATAEXTENSIONABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataDomainAttribute"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataExtensionAbstract"),
    });
    
    
    /**
     * Gets the "PDMessageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getPDMessageMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PDMESSAGEMETADATAEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PDMessageMetadataExtensionAbstract" element
     */
    public void setPDMessageMetadataExtensionAbstract(org.apache.xmlbeans.XmlObject pdMessageMetadataExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PDMESSAGEMETADATAEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PDMESSAGEMETADATAEXTENSIONABSTRACT$0);
            }
            target.set(pdMessageMetadataExtensionAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "PDMessageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewPDMessageMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PDMESSAGEMETADATAEXTENSIONABSTRACT$0);
            return target;
        }
    }
}
