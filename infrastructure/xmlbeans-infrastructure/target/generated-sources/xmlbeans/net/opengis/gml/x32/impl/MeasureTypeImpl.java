/*
 * XML Type:  MeasureType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MeasureType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML MeasureType(@http://www.opengis.net/gml/3.2).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.x32.MeasureType.
 */
public class MeasureTypeImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements net.opengis.gml.x32.MeasureType
{
    private static final long serialVersionUID = 1L;
    
    public MeasureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected MeasureTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName UOM$0 = 
        new javax.xml.namespace.QName("", "uom");
    
    
    /**
     * Gets the "uom" attribute
     */
    public java.lang.String getUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    public net.opengis.gml.x32.UomIdentifier xgetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UomIdentifier target = null;
            target = (net.opengis.gml.x32.UomIdentifier)get_store().find_attribute_user(UOM$0);
            return target;
        }
    }
    
    /**
     * Sets the "uom" attribute
     */
    public void setUom(java.lang.String uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$0);
            }
            target.setStringValue(uom);
        }
    }
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    public void xsetUom(net.opengis.gml.x32.UomIdentifier uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UomIdentifier target = null;
            target = (net.opengis.gml.x32.UomIdentifier)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.UomIdentifier)get_store().add_attribute_user(UOM$0);
            }
            target.set(uom);
        }
    }
}
