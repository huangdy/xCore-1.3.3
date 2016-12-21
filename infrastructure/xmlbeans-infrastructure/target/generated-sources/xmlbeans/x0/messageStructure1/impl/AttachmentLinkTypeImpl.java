/*
 * XML Type:  AttachmentLinkType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentLinkType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML AttachmentLinkType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class AttachmentLinkTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttachmentLinkType
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentLinkTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTURI$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentURI");
    private static final javax.xml.namespace.QName ATTACHMENTVIEWABLEINDICATOR$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentViewableIndicator");
    private static final javax.xml.namespace.QName ATTACHMENTDESCRIPTIONTEXT$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentDescriptionText");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "id");
    
    
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
     * Gets the "AttachmentViewableIndicator" element
     */
    public boolean getAttachmentViewableIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTVIEWABLEINDICATOR$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttachmentViewableIndicator" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAttachmentViewableIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ATTACHMENTVIEWABLEINDICATOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentViewableIndicator" element
     */
    public void setAttachmentViewableIndicator(boolean attachmentViewableIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTVIEWABLEINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTVIEWABLEINDICATOR$2);
            }
            target.setBooleanValue(attachmentViewableIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "AttachmentViewableIndicator" element
     */
    public void xsetAttachmentViewableIndicator(org.apache.xmlbeans.XmlBoolean attachmentViewableIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ATTACHMENTVIEWABLEINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ATTACHMENTVIEWABLEINDICATOR$2);
            }
            target.set(attachmentViewableIndicator);
        }
    }
    
    /**
     * Gets the "AttachmentDescriptionText" element
     */
    public java.lang.String getAttachmentDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTDESCRIPTIONTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttachmentDescriptionText" element
     */
    public org.apache.xmlbeans.XmlString xgetAttachmentDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTACHMENTDESCRIPTIONTEXT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentDescriptionText" element
     */
    public void setAttachmentDescriptionText(java.lang.String attachmentDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTDESCRIPTIONTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTDESCRIPTIONTEXT$4);
            }
            target.setStringValue(attachmentDescriptionText);
        }
    }
    
    /**
     * Sets (as xml) the "AttachmentDescriptionText" element
     */
    public void xsetAttachmentDescriptionText(org.apache.xmlbeans.XmlString attachmentDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTACHMENTDESCRIPTIONTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTACHMENTDESCRIPTIONTEXT$4);
            }
            target.set(attachmentDescriptionText);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$6) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$6);
        }
    }
}
