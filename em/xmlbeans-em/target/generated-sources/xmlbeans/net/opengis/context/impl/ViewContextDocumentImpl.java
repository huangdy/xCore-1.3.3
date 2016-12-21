/*
 * An XML document type.
 * Localname: ViewContext
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.ViewContextDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * A document containing one ViewContext(@http://www.opengis.net/context) element.
 *
 * This is a complex type.
 */
public class ViewContextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.ViewContextDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewContextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWCONTEXT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ViewContext");
    
    
    /**
     * Gets the "ViewContext" element
     */
    public net.opengis.context.ViewContextType getViewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ViewContextType target = null;
            target = (net.opengis.context.ViewContextType)get_store().find_element_user(VIEWCONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ViewContext" element
     */
    public void setViewContext(net.opengis.context.ViewContextType viewContext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ViewContextType target = null;
            target = (net.opengis.context.ViewContextType)get_store().find_element_user(VIEWCONTEXT$0, 0);
            if (target == null)
            {
                target = (net.opengis.context.ViewContextType)get_store().add_element_user(VIEWCONTEXT$0);
            }
            target.set(viewContext);
        }
    }
    
    /**
     * Appends and returns a new empty "ViewContext" element
     */
    public net.opengis.context.ViewContextType addNewViewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ViewContextType target = null;
            target = (net.opengis.context.ViewContextType)get_store().add_element_user(VIEWCONTEXT$0);
            return target;
        }
    }
}
