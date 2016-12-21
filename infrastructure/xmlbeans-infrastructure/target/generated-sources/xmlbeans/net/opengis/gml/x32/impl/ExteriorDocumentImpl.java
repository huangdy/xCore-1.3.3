/*
 * An XML document type.
 * Localname: exterior
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ExteriorDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one exterior(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ExteriorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ExteriorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExteriorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "exterior");
    
    
    /**
     * Gets the "exterior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType getExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exterior" element
     */
    public void setExterior(net.opengis.gml.x32.AbstractRingPropertyType exterior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            }
            target.set(exterior);
        }
    }
    
    /**
     * Appends and returns a new empty "exterior" element
     */
    public net.opengis.gml.x32.AbstractRingPropertyType addNewExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            return target;
        }
    }
}
