/*
 * XML Type:  RenderingParameterType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.RenderingParameterType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML RenderingParameterType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class RenderingParameterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.RenderingParameterType
{
    private static final long serialVersionUID = 1L;
    
    public RenderingParameterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGPARAMETERNAME$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameterName");
    private static final javax.xml.namespace.QName RENDERINGPARAMETERVALUE$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingParameterValue");
    
    
    /**
     * Gets the "RenderingParameterName" element
     */
    public java.lang.String getRenderingParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGPARAMETERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RenderingParameterName" element
     */
    public org.apache.xmlbeans.XmlString xgetRenderingParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGPARAMETERNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RenderingParameterName" element
     */
    public void setRenderingParameterName(java.lang.String renderingParameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGPARAMETERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGPARAMETERNAME$0);
            }
            target.setStringValue(renderingParameterName);
        }
    }
    
    /**
     * Sets (as xml) the "RenderingParameterName" element
     */
    public void xsetRenderingParameterName(org.apache.xmlbeans.XmlString renderingParameterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGPARAMETERNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RENDERINGPARAMETERNAME$0);
            }
            target.set(renderingParameterName);
        }
    }
    
    /**
     * Gets the "RenderingParameterValue" element
     */
    public java.lang.String getRenderingParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGPARAMETERVALUE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGPARAMETERVALUE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RENDERINGPARAMETERVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RENDERINGPARAMETERVALUE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RENDERINGPARAMETERVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RENDERINGPARAMETERVALUE$2);
            }
            target.set(renderingParameterValue);
        }
    }
}
