/*
 * XML Type:  BinaryAttachmentType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.BinaryAttachmentType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML BinaryAttachmentType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class BinaryAttachmentTypeImpl extends gov.ucore.ucore.x20.impl.AttachmentContentTypeImpl implements gov.ucore.ucore.x20.BinaryAttachmentType
{
    private static final long serialVersionUID = 1L;
    
    public BinaryAttachmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINARYCONTENT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinaryContent");
    private static final javax.xml.namespace.QName BINARYDESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinaryDescription");
    private static final javax.xml.namespace.QName BINARYSIZE$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinarySize");
    private static final javax.xml.namespace.QName CATEGORY$6 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Category");
    
    
    /**
     * Gets the "BinaryContent" element
     */
    public byte[] getBinaryContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "BinaryContent" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetBinaryContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BINARYCONTENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BinaryContent" element
     */
    public void setBinaryContent(byte[] binaryContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYCONTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BINARYCONTENT$0);
            }
            target.setByteArrayValue(binaryContent);
        }
    }
    
    /**
     * Sets (as xml) the "BinaryContent" element
     */
    public void xsetBinaryContent(org.apache.xmlbeans.XmlBase64Binary binaryContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(BINARYCONTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(BINARYCONTENT$0);
            }
            target.set(binaryContent);
        }
    }
    
    /**
     * Gets the "BinaryDescription" element
     */
    public java.lang.String getBinaryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BinaryDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetBinaryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BINARYDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "BinaryDescription" element
     */
    public boolean isSetBinaryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINARYDESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "BinaryDescription" element
     */
    public void setBinaryDescription(java.lang.String binaryDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BINARYDESCRIPTION$2);
            }
            target.setStringValue(binaryDescription);
        }
    }
    
    /**
     * Sets (as xml) the "BinaryDescription" element
     */
    public void xsetBinaryDescription(org.apache.xmlbeans.XmlString binaryDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BINARYDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BINARYDESCRIPTION$2);
            }
            target.set(binaryDescription);
        }
    }
    
    /**
     * Unsets the "BinaryDescription" element
     */
    public void unsetBinaryDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINARYDESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "BinarySize" element
     */
    public int getBinarySize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYSIZE$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BinarySize" element
     */
    public org.apache.xmlbeans.XmlInt xgetBinarySize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BINARYSIZE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "BinarySize" element
     */
    public boolean isSetBinarySize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINARYSIZE$4) != 0;
        }
    }
    
    /**
     * Sets the "BinarySize" element
     */
    public void setBinarySize(int binarySize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BINARYSIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BINARYSIZE$4);
            }
            target.setIntValue(binarySize);
        }
    }
    
    /**
     * Sets (as xml) the "BinarySize" element
     */
    public void xsetBinarySize(org.apache.xmlbeans.XmlInt binarySize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BINARYSIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BINARYSIZE$4);
            }
            target.set(binarySize);
        }
    }
    
    /**
     * Unsets the "BinarySize" element
     */
    public void unsetBinarySize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINARYSIZE$4, 0);
        }
    }
    
    /**
     * Gets the "Category" element
     */
    public java.lang.String getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Category" element
     */
    public org.apache.xmlbeans.XmlString xgetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$6) != 0;
        }
    }
    
    /**
     * Sets the "Category" element
     */
    public void setCategory(java.lang.String category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$6);
            }
            target.setStringValue(category);
        }
    }
    
    /**
     * Sets (as xml) the "Category" element
     */
    public void xsetCategory(org.apache.xmlbeans.XmlString category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CATEGORY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CATEGORY$6);
            }
            target.set(category);
        }
    }
    
    /**
     * Unsets the "Category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$6, 0);
        }
    }
}
