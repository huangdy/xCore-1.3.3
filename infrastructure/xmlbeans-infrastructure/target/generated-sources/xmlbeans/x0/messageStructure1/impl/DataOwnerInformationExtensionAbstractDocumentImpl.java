/*
 * An XML document type.
 * Localname: DataOwnerInformationExtensionAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataOwnerInformationExtensionAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataOwnerInformationExtensionAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerInformationExtensionAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataOwnerInformationExtensionAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerInformationExtensionAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERINFORMATIONEXTENSIONABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerInformationExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAOWNERINFORMATIONEXTENSIONABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerInformationExtensionAbstract"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerInformationDomainAttribute"),
    });
    
    
    /**
     * Gets the "DataOwnerInformationExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataOwnerInformationExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERINFORMATIONEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerInformationExtensionAbstract" element
     */
    public void setDataOwnerInformationExtensionAbstract(org.apache.xmlbeans.XmlObject dataOwnerInformationExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERINFORMATIONEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERINFORMATIONEXTENSIONABSTRACT$0);
            }
            target.set(dataOwnerInformationExtensionAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerInformationExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataOwnerInformationExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERINFORMATIONEXTENSIONABSTRACT$0);
            return target;
        }
    }
}
