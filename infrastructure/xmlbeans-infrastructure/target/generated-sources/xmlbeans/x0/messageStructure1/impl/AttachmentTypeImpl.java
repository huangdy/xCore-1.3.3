/*
 * XML Type:  AttachmentType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML AttachmentType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class AttachmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttachmentType
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTURI$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentURI");
    private static final javax.xml.namespace.QName ATTACHMENTCONTENTABSTRACT$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentContentAbstract");
    private static final org.apache.xmlbeans.QNameSet ATTACHMENTCONTENTABSTRACT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentContentAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinaryAttachment"),
    });
    private static final javax.xml.namespace.QName DATAOWNERMETADATA$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadata");
    private static final javax.xml.namespace.QName ATTACHMENTEXTENSIONABSTRACT$6 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet ATTACHMENTEXTENSIONABSTRACT$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentResourceMetadataExtension"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentDomainAttribute"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentSecurityMetadata"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentExtensionAbstract"),
    });
    
    
    /**
     * Gets the "AttachmentURI" element
     */
    public java.lang.String getAttachmentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttachmentURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAttachmentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ATTACHMENTURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentURI" element
     */
    public void setAttachmentURI(java.lang.String attachmentURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTURI$0);
            }
            target.setStringValue(attachmentURI);
        }
    }
    
    /**
     * Sets (as xml) the "AttachmentURI" element
     */
    public void xsetAttachmentURI(org.apache.xmlbeans.XmlAnyURI attachmentURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ATTACHMENTURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ATTACHMENTURI$0);
            }
            target.set(attachmentURI);
        }
    }
    
    /**
     * Gets the "AttachmentContentAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getAttachmentContentAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENTCONTENTABSTRACT$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentContentAbstract" element
     */
    public void setAttachmentContentAbstract(org.apache.xmlbeans.XmlObject attachmentContentAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENTCONTENTABSTRACT$3, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ATTACHMENTCONTENTABSTRACT$2);
            }
            target.set(attachmentContentAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentContentAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewAttachmentContentAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ATTACHMENTCONTENTABSTRACT$2);
            return target;
        }
    }
    
    /**
     * Gets the "DataOwnerMetadata" element
     */
    public x0.messageStructure1.DataOwnerMetadataType getDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().find_element_user(DATAOWNERMETADATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataOwnerMetadata" element
     */
    public boolean isSetDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOWNERMETADATA$4) != 0;
        }
    }
    
    /**
     * Sets the "DataOwnerMetadata" element
     */
    public void setDataOwnerMetadata(x0.messageStructure1.DataOwnerMetadataType dataOwnerMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().find_element_user(DATAOWNERMETADATA$4, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DataOwnerMetadataType)get_store().add_element_user(DATAOWNERMETADATA$4);
            }
            target.set(dataOwnerMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerMetadata" element
     */
    public x0.messageStructure1.DataOwnerMetadataType addNewDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().add_element_user(DATAOWNERMETADATA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DataOwnerMetadata" element
     */
    public void unsetDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOWNERMETADATA$4, 0);
        }
    }
    
    /**
     * Gets array of all "AttachmentExtensionAbstract" elements
     */
    public org.apache.xmlbeans.XmlObject[] getAttachmentExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTEXTENSIONABSTRACT$7, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getAttachmentExtensionAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENTEXTENSIONABSTRACT$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachmentExtensionAbstract" element
     */
    public int sizeOfAttachmentExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTEXTENSIONABSTRACT$7);
        }
    }
    
    /**
     * Sets array of all "AttachmentExtensionAbstract" element
     */
    public void setAttachmentExtensionAbstractArray(org.apache.xmlbeans.XmlObject[] attachmentExtensionAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentExtensionAbstractArray, ATTACHMENTEXTENSIONABSTRACT$6, ATTACHMENTEXTENSIONABSTRACT$7);
        }
    }
    
    /**
     * Sets ith "AttachmentExtensionAbstract" element
     */
    public void setAttachmentExtensionAbstractArray(int i, org.apache.xmlbeans.XmlObject attachmentExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENTEXTENSIONABSTRACT$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentExtensionAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject insertNewAttachmentExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ATTACHMENTEXTENSIONABSTRACT$7, ATTACHMENTEXTENSIONABSTRACT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewAttachmentExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ATTACHMENTEXTENSIONABSTRACT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachmentExtensionAbstract" element
     */
    public void removeAttachmentExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTEXTENSIONABSTRACT$7, i);
        }
    }
}
