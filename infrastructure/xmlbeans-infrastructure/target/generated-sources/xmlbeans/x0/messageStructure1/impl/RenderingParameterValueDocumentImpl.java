/*
 * An XML document type.
 * Localname: RenderingParameterValue
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.RenderingParameterValueDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one RenderingParameterValue(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingParameterValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.RenderingParameterValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingParameterValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGPARAMETERVALUE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameterValue");
    
    
    /**
     * Gets the "RenderingParameterValue" element
     */
    public java.lang.String getRenderingParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGPARAMETERVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RenderingParameterValue" element
     */
    public org.apache.xmlbeans.XmlString xgetRenderingParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGPARAMETERVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RenderingParameterValue" element
     */
    public void setRenderingParameterValue(java.lang.String renderingParameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGPARAMETERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGPARAMETERVALUE$0);
            }
            target.setStringValue(renderingParameterValue);
        }
    }
    
    /**
     * Sets (as xml) the "RenderingParameterValue" element
     */
    public void xsetRenderingParameterValue(org.apache.xmlbeans.XmlString renderingParameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGPARAMETERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RENDERINGPARAMETERVALUE$0);
            }
            target.set(renderingParameterValue);
        }
    }
}
