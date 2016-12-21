/*
 * XML Type:  PackageAbstractType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PackageAbstractType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML PackageAbstractType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class PackageAbstractTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PackageAbstractType
{
    private static final long serialVersionUID = 1L;
    
    public PackageAbstractTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadata");
    private static final javax.xml.namespace.QName DIGESTABSTRACT$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DigestAbstract");
    private static final org.apache.xmlbeans.QNameSet DIGESTABSTRACT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Digest"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DigestAbstract"),
    });
    private static final javax.xml.namespace.QName STRUCTUREDPAYLOAD$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayload");
    private static final javax.xml.namespace.QName ATTACHMENTLINK$6 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentLink");
    
    
    /**
     * Gets the "PackageMetadata" element
     */
    public x0.messageStructure1.PackageMetadataType getPackageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PackageMetadataType target = null;
            target = (x0.messageStructure1.PackageMetadataType)get_store().find_element_user(PACKAGEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageMetadata" element
     */
    public void setPackageMetadata(x0.messageStructure1.PackageMetadataType packageMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PackageMetadataType target = null;
            target = (x0.messageStructure1.PackageMetadataType)get_store().find_element_user(PACKAGEMETADATA$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.PackageMetadataType)get_store().add_element_user(PACKAGEMETADATA$0);
            }
            target.set(packageMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageMetadata" element
     */
    public x0.messageStructure1.PackageMetadataType addNewPackageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PackageMetadataType target = null;
            target = (x0.messageStructure1.PackageMetadataType)get_store().add_element_user(PACKAGEMETADATA$0);
            return target;
        }
    }
    
    /**
     * Gets the "DigestAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDigestAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DIGESTABSTRACT$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DigestAbstract" element
     */
    public boolean isSetDigestAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIGESTABSTRACT$3) != 0;
        }
    }
    
    /**
     * Sets the "DigestAbstract" element
     */
    public void setDigestAbstract(org.apache.xmlbeans.XmlObject digestAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DIGESTABSTRACT$3, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DIGESTABSTRACT$2);
            }
            target.set(digestAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DigestAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDigestAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DIGESTABSTRACT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DigestAbstract" element
     */
    public void unsetDigestAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIGESTABSTRACT$3, 0);
        }
    }
    
    /**
     * Gets array of all "StructuredPayload" elements
     */
    public x0.messageStructure1.StructuredPayloadType[] getStructuredPayloadArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTUREDPAYLOAD$4, targetList);
            x0.messageStructure1.StructuredPayloadType[] result = new x0.messageStructure1.StructuredPayloadType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructuredPayload" element
     */
    public x0.messageStructure1.StructuredPayloadType getStructuredPayloadArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadType target = null;
            target = (x0.messageStructure1.StructuredPayloadType)get_store().find_element_user(STRUCTUREDPAYLOAD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructuredPayload" element
     */
    public int sizeOfStructuredPayloadArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTUREDPAYLOAD$4);
        }
    }
    
    /**
     * Sets array of all "StructuredPayload" element
     */
    public void setStructuredPayloadArray(x0.messageStructure1.StructuredPayloadType[] structuredPayloadArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structuredPayloadArray, STRUCTUREDPAYLOAD$4);
        }
    }
    
    /**
     * Sets ith "StructuredPayload" element
     */
    public void setStructuredPayloadArray(int i, x0.messageStructure1.StructuredPayloadType structuredPayload)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadType target = null;
            target = (x0.messageStructure1.StructuredPayloadType)get_store().find_element_user(STRUCTUREDPAYLOAD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structuredPayload);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredPayload" element
     */
    public x0.messageStructure1.StructuredPayloadType insertNewStructuredPayload(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadType target = null;
            target = (x0.messageStructure1.StructuredPayloadType)get_store().insert_element_user(STRUCTUREDPAYLOAD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuredPayload" element
     */
    public x0.messageStructure1.StructuredPayloadType addNewStructuredPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadType target = null;
            target = (x0.messageStructure1.StructuredPayloadType)get_store().add_element_user(STRUCTUREDPAYLOAD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructuredPayload" element
     */
    public void removeStructuredPayload(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTUREDPAYLOAD$4, i);
        }
    }
    
    /**
     * Gets array of all "AttachmentLink" elements
     */
    public x0.messageStructure1.AttachmentLinkType[] getAttachmentLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTLINK$6, targetList);
            x0.messageStructure1.AttachmentLinkType[] result = new x0.messageStructure1.AttachmentLinkType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentLink" element
     */
    public x0.messageStructure1.AttachmentLinkType getAttachmentLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentLinkType target = null;
            target = (x0.messageStructure1.AttachmentLinkType)get_store().find_element_user(ATTACHMENTLINK$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachmentLink" element
     */
    public int sizeOfAttachmentLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTLINK$6);
        }
    }
    
    /**
     * Sets array of all "AttachmentLink" element
     */
    public void setAttachmentLinkArray(x0.messageStructure1.AttachmentLinkType[] attachmentLinkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentLinkArray, ATTACHMENTLINK$6);
        }
    }
    
    /**
     * Sets ith "AttachmentLink" element
     */
    public void setAttachmentLinkArray(int i, x0.messageStructure1.AttachmentLinkType attachmentLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentLinkType target = null;
            target = (x0.messageStructure1.AttachmentLinkType)get_store().find_element_user(ATTACHMENTLINK$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentLink);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentLink" element
     */
    public x0.messageStructure1.AttachmentLinkType insertNewAttachmentLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentLinkType target = null;
            target = (x0.messageStructure1.AttachmentLinkType)get_store().insert_element_user(ATTACHMENTLINK$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentLink" element
     */
    public x0.messageStructure1.AttachmentLinkType addNewAttachmentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentLinkType target = null;
            target = (x0.messageStructure1.AttachmentLinkType)get_store().add_element_user(ATTACHMENTLINK$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachmentLink" element
     */
    public void removeAttachmentLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTLINK$6, i);
        }
    }
}
