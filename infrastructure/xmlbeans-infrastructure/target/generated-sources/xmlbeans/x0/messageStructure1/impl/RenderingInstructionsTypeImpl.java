/*
 * XML Type:  RenderingInstructionsType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.RenderingInstructionsType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML RenderingInstructionsType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class RenderingInstructionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.RenderingInstructionsType
{
    private static final long serialVersionUID = 1L;
    
    public RenderingInstructionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGMETHOD$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingMethod");
    private static final javax.xml.namespace.QName ATTACHMENTURI$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentURI");
    private static final javax.xml.namespace.QName RENDERINGPARAMETER$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameter");
    private static final javax.xml.namespace.QName RENDERINGDESCRIPTION$6 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingDescription");
    
    
    /**
     * Gets the "RenderingMethod" element
     */
    public x0.messageCodes1.RenderingMethodCodeSimpleType.Enum getRenderingMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.messageCodes1.RenderingMethodCodeSimpleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RenderingMethod" element
     */
    public x0.messageCodes1.RenderingMethodCodeSimpleType xgetRenderingMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.RenderingMethodCodeSimpleType target = null;
            target = (x0.messageCodes1.RenderingMethodCodeSimpleType)get_store().find_element_user(RENDERINGMETHOD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RenderingMethod" element
     */
    public void setRenderingMethod(x0.messageCodes1.RenderingMethodCodeSimpleType.Enum renderingMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGMETHOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGMETHOD$0);
            }
            target.setEnumValue(renderingMethod);
        }
    }
    
    /**
     * Sets (as xml) the "RenderingMethod" element
     */
    public void xsetRenderingMethod(x0.messageCodes1.RenderingMethodCodeSimpleType renderingMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.RenderingMethodCodeSimpleType target = null;
            target = (x0.messageCodes1.RenderingMethodCodeSimpleType)get_store().find_element_user(RENDERINGMETHOD$0, 0);
            if (target == null)
            {
                target = (x0.messageCodes1.RenderingMethodCodeSimpleType)get_store().add_element_user(RENDERINGMETHOD$0);
            }
            target.set(renderingMethod);
        }
    }
    
    /**
     * Gets the "AttachmentURI" element
     */
    public java.lang.String getAttachmentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTURI$2, 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ATTACHMENTURI$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AttachmentURI" element
     */
    public boolean isSetAttachmentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTURI$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTURI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTURI$2);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ATTACHMENTURI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ATTACHMENTURI$2);
            }
            target.set(attachmentURI);
        }
    }
    
    /**
     * Unsets the "AttachmentURI" element
     */
    public void unsetAttachmentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTURI$2, 0);
        }
    }
    
    /**
     * Gets array of all "RenderingParameter" elements
     */
    public x0.messageStructure1.RenderingParameterType[] getRenderingParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERINGPARAMETER$4, targetList);
            x0.messageStructure1.RenderingParameterType[] result = new x0.messageStructure1.RenderingParameterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RenderingParameter" element
     */
    public x0.messageStructure1.RenderingParameterType getRenderingParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingParameterType target = null;
            target = (x0.messageStructure1.RenderingParameterType)get_store().find_element_user(RENDERINGPARAMETER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RenderingParameter" element
     */
    public int sizeOfRenderingParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERINGPARAMETER$4);
        }
    }
    
    /**
     * Sets array of all "RenderingParameter" element
     */
    public void setRenderingParameterArray(x0.messageStructure1.RenderingParameterType[] renderingParameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(renderingParameterArray, RENDERINGPARAMETER$4);
        }
    }
    
    /**
     * Sets ith "RenderingParameter" element
     */
    public void setRenderingParameterArray(int i, x0.messageStructure1.RenderingParameterType renderingParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingParameterType target = null;
            target = (x0.messageStructure1.RenderingParameterType)get_store().find_element_user(RENDERINGPARAMETER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(renderingParameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RenderingParameter" element
     */
    public x0.messageStructure1.RenderingParameterType insertNewRenderingParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingParameterType target = null;
            target = (x0.messageStructure1.RenderingParameterType)get_store().insert_element_user(RENDERINGPARAMETER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RenderingParameter" element
     */
    public x0.messageStructure1.RenderingParameterType addNewRenderingParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingParameterType target = null;
            target = (x0.messageStructure1.RenderingParameterType)get_store().add_element_user(RENDERINGPARAMETER$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "RenderingParameter" element
     */
    public void removeRenderingParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERINGPARAMETER$4, i);
        }
    }
    
    /**
     * Gets the "RenderingDescription" element
     */
    public java.lang.String getRenderingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGDESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RenderingDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetRenderingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGDESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "RenderingDescription" element
     */
    public boolean isSetRenderingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERINGDESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "RenderingDescription" element
     */
    public void setRenderingDescription(java.lang.String renderingDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGDESCRIPTION$6);
            }
            target.setStringValue(renderingDescription);
        }
    }
    
    /**
     * Sets (as xml) the "RenderingDescription" element
     */
    public void xsetRenderingDescription(org.apache.xmlbeans.XmlString renderingDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RENDERINGDESCRIPTION$6);
            }
            target.set(renderingDescription);
        }
    }
    
    /**
     * Unsets the "RenderingDescription" element
     */
    public void unsetRenderingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERINGDESCRIPTION$6, 0);
        }
    }
}
