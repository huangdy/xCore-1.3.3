/*
 * An XML document type.
 * Localname: RenderingDescription
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.RenderingDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one RenderingDescription(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class RenderingDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.RenderingDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGDESCRIPTION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingDescription");
    
    
    /**
     * Gets the "RenderingDescription" element
     */
    public java.lang.String getRenderingDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGDESCRIPTION$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGDESCRIPTION$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGDESCRIPTION$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RENDERINGDESCRIPTION$0);
            }
            target.set(renderingDescription);
        }
    }
}
