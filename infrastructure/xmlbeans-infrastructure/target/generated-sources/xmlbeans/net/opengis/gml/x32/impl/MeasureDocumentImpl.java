/*
 * An XML document type.
 * Localname: measure
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MeasureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one measure(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "measure");
    
    
    /**
     * Gets the "measure" element
     */
    public net.opengis.gml.x32.MeasureType getMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(MEASURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "measure" element
     */
    public void setMeasure(net.opengis.gml.x32.MeasureType measure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(MEASURE$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(MEASURE$0);
            }
            target.set(measure);
        }
    }
    
    /**
     * Appends and returns a new empty "measure" element
     */
    public net.opengis.gml.x32.MeasureType addNewMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(MEASURE$0);
            return target;
        }
    }
}
