/*
 * An XML document type.
 * Localname: RenderingInstructions
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.RenderingInstructionsDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one RenderingInstructions(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingInstructionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.RenderingInstructionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingInstructionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGINSTRUCTIONS$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingInstructions");
    
    
    /**
     * Gets the "RenderingInstructions" element
     */
    public x0.messageStructure1.RenderingInstructionsType getRenderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingInstructionsType target = null;
            target = (x0.messageStructure1.RenderingInstructionsType)get_store().find_element_user(RENDERINGINSTRUCTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RenderingInstructions" element
     */
    public void setRenderingInstructions(x0.messageStructure1.RenderingInstructionsType renderingInstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingInstructionsType target = null;
            target = (x0.messageStructure1.RenderingInstructionsType)get_store().find_element_user(RENDERINGINSTRUCTIONS$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.RenderingInstructionsType)get_store().add_element_user(RENDERINGINSTRUCTIONS$0);
            }
            target.set(renderingInstructions);
        }
    }
    
    /**
     * Appends and returns a new empty "RenderingInstructions" element
     */
    public x0.messageStructure1.RenderingInstructionsType addNewRenderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingInstructionsType target = null;
            target = (x0.messageStructure1.RenderingInstructionsType)get_store().add_element_user(RENDERINGINSTRUCTIONS$0);
            return target;
        }
    }
}
