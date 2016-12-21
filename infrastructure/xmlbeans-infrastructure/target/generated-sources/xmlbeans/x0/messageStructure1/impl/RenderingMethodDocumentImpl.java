/*
 * An XML document type.
 * Localname: RenderingMethod
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.RenderingMethodDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one RenderingMethod(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.RenderingMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGMETHOD$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingMethod");
    
    
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
}
