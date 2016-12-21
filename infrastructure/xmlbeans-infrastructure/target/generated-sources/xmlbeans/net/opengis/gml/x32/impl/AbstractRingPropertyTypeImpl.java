/*
 * XML Type:  AbstractRingPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractRingPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractRingPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractRingPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractRingPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractRingPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRing");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTRING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRing"),
    });
    
    
    /**
     * Gets the "AbstractRing" element
     */
    public net.opengis.gml.x32.AbstractRingType getAbstractRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingType target = null;
            target = (net.opengis.gml.x32.AbstractRingType)get_store().find_element_user(ABSTRACTRING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractRing" element
     */
    public void setAbstractRing(net.opengis.gml.x32.AbstractRingType abstractRing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingType target = null;
            target = (net.opengis.gml.x32.AbstractRingType)get_store().find_element_user(ABSTRACTRING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractRingType)get_store().add_element_user(ABSTRACTRING$0);
            }
            target.set(abstractRing);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractRing" element
     */
    public net.opengis.gml.x32.AbstractRingType addNewAbstractRing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractRingType target = null;
            target = (net.opengis.gml.x32.AbstractRingType)get_store().add_element_user(ABSTRACTRING$0);
            return target;
        }
    }
}
