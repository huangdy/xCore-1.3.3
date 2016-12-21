/*
 * An XML document type.
 * Localname: RenderingParameter
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.RenderingParameterDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one RenderingParameter(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.RenderingParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGPARAMETER$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameter");
    
    
    /**
     * Gets the "RenderingParameter" element
     */
    public x0.messageStructure1.RenderingParameterType getRenderingParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingParameterType target = null;
            target = (x0.messageStructure1.RenderingParameterType)get_store().find_element_user(RENDERINGPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RenderingParameter" element
     */
    public void setRenderingParameter(x0.messageStructure1.RenderingParameterType renderingParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingParameterType target = null;
            target = (x0.messageStructure1.RenderingParameterType)get_store().find_element_user(RENDERINGPARAMETER$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.RenderingParameterType)get_store().add_element_user(RENDERINGPARAMETER$0);
            }
            target.set(renderingParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "RenderingParameter" element
     */
    public x0.messageStructure1.RenderingParameterType addNewRenderingParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingParameterType target = null;
            target = (x0.messageStructure1.RenderingParameterType)get_store().add_element_user(RENDERINGPARAMETER$0);
            return target;
        }
    }
}
