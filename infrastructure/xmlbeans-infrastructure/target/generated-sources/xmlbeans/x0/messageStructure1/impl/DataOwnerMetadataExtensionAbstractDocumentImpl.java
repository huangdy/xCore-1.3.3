/*
 * An XML document type.
 * Localname: DataOwnerMetadataExtensionAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataOwnerMetadataExtensionAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataOwnerMetadataExtensionAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerMetadataExtensionAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataOwnerMetadataExtensionAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerMetadataExtensionAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERMETADATAEXTENSIONABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAOWNERMETADATAEXTENSIONABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataDomainAttribute"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataExtensionAbstract"),
    });
    
    
    /**
     * Gets the "DataOwnerMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataOwnerMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERMETADATAEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerMetadataExtensionAbstract" element
     */
    public void setDataOwnerMetadataExtensionAbstract(org.apache.xmlbeans.XmlObject dataOwnerMetadataExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERMETADATAEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERMETADATAEXTENSIONABSTRACT$0);
            }
            target.set(dataOwnerMetadataExtensionAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataOwnerMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERMETADATAEXTENSIONABSTRACT$0);
            return target;
        }
    }
}
