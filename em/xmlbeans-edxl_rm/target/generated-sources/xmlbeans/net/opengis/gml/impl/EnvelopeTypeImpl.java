/*
 * XML Type:  EnvelopeType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EnvelopeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML EnvelopeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class EnvelopeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EnvelopeType
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOWERCORNER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "lowerCorner");
    private static final javax.xml.namespace.QName UPPERCORNER$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "upperCorner");
    
    
    /**
     * Gets the "lowerCorner" element
     */
    public net.opengis.gml.DirectPositionType getLowerCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(LOWERCORNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lowerCorner" element
     */
    public void setLowerCorner(net.opengis.gml.DirectPositionType lowerCorner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(LOWERCORNER$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(LOWERCORNER$0);
            }
            target.set(lowerCorner);
        }
    }
    
    /**
     * Appends and returns a new empty "lowerCorner" element
     */
    public net.opengis.gml.DirectPositionType addNewLowerCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(LOWERCORNER$0);
            return target;
        }
    }
    
    /**
     * Gets the "upperCorner" element
     */
    public net.opengis.gml.DirectPositionType getUpperCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(UPPERCORNER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "upperCorner" element
     */
    public void setUpperCorner(net.opengis.gml.DirectPositionType upperCorner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(UPPERCORNER$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(UPPERCORNER$2);
            }
            target.set(upperCorner);
        }
    }
    
    /**
     * Appends and returns a new empty "upperCorner" element
     */
    public net.opengis.gml.DirectPositionType addNewUpperCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(UPPERCORNER$2);
            return target;
        }
    }
}
